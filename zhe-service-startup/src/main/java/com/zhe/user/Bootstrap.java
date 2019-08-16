package com.zhe.user;


import com.google.common.util.concurrent.AbstractIdleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bootstrap extends AbstractIdleService {
	private static final Logger log=LoggerFactory.getLogger(Bootstrap.class);
    private ClassPathXmlApplicationContext context;
    
    public static void main(String[] args) {
        Bootstrap bootstrap = new Bootstrap();
        bootstrap.startAsync();
        try {
            Object lock = new Object();
            synchronized (lock) {
                while (true) {
                    lock.wait();
                }
            }
        } catch (InterruptedException ex) {
            log.error("ignore interruption", ex);
        }

    }

    /**
     * Start the service.
     */
    @Override
    protected void startUp() throws Exception {
        try {
            log.info("开始加载spring");
            context = new ClassPathXmlApplicationContext(new String[]{"spring-context.xml"});
            log.info("加载spring完成，开始启动服务");
            context.start();
            context.registerShutdownHook();
            Bootstrap.log.info("cooperation service started successfully{}");
        } catch (Exception e) {
            log.error("启动合作DUBBO失败:" + e.getMessage(), e);
        }

    }

    /**
     * Stop the service.
     */
    @Override
    protected void shutDown() throws Exception {
        context.stop();
        Bootstrap.log.info("cooperation service stopped successfully");
    }

}
