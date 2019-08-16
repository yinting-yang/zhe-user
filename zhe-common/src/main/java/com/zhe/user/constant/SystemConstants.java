package com.zhe.user.constant;

import com.zhe.exception.ErrorInterface;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class SystemConstants {

	/**
	 * 系统配置
	 * @author changkui.liu
	 * @date 2017年11月6日 下午4:08:30
	 */
	public static class Config{
		
		/* redis key前缀 */
		public static final String REDIS_PREFIX;
		
		/* 用户中心地址 */
		public static final String USER_CENTER_URL;
		
		/* 在用户中心注册的code */
		public static final String LBG_CODE;
		
		/* 在用户中心注册的skey */
		public static final String LBG_SKEY;
		
		/* 登录过期时间(五小时) */
		public static final Integer LOGIN_INVALID_TIME;
		
		/*资源的key值*/
		public static final String RESOURCE_KEY;
		
		/*行业的key值*/
		public static final String INDUSTRY_KEY;
		
		/*用户群体key值*/
		public static final String USER_LABEL_KEY;
		
		/*合作地区key*/
		public static final String AREA_KEY;
		
		/*redis存储时间*/
		public static final Integer REDIS_TIME;
		
		/* cookie domain */
		public static final String COOKIE_DOMAIN;
		
		/* cookie token name */
		public static final String COOKIE_TOKEN_NAME;
		
		/* cookie userName*/
		public static final String COOKIE_USER_NAME;
		
		/* lbp系统登录cookie token名称 */
		public static final String COOKIE_LBP_TOKEN_NAME;
		/* 文件上传配置路径开始 */
		public static final String UPLOAD_FILE_ABSOLUTE_PATH;

		
		static{
			String configPath = System.getProperty("global.config.path") + "/system-config.properties";
			try {
				Properties prop = new Properties();
				prop.load(new FileInputStream(new File(System.getProperty("global.config.path")) + "/system-config.properties"));
				REDIS_PREFIX = prop.getProperty("redis.prefix");
				USER_CENTER_URL = prop.getProperty("lbp.user.center");
				LBG_CODE = prop.getProperty("lbp.code");
				LBG_SKEY = prop.getProperty("lbp.skey");
				LOGIN_INVALID_TIME = Integer.valueOf(prop.getProperty("login.invalid.time"));
				COOKIE_DOMAIN=prop.getProperty("cookie.domain");
				COOKIE_TOKEN_NAME=prop.getProperty("cookie.token.name");
				COOKIE_USER_NAME=prop.getProperty("cookie.username");
				COOKIE_LBP_TOKEN_NAME = prop.getProperty("lbp.cookie.token.name");
				UPLOAD_FILE_ABSOLUTE_PATH = prop.getProperty("upload.file.absolute.path");
				REDIS_TIME= Integer.valueOf(prop.getProperty("lbg.cooperation.redis"));
				AREA_KEY=prop.getProperty("lbg.cooperation.provincess");
				USER_LABEL_KEY=prop.getProperty("lbg.cooperation.userLabels");
				INDUSTRY_KEY=prop.getProperty("lbg.cooperation.industryLabel");
				RESOURCE_KEY=prop.getProperty("lbg.cooperation.resourcesLabel");
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				throw new RuntimeException("找不到" + configPath);
			} catch (Exception e){
				e.printStackTrace();
				throw new RuntimeException("初始化系统配置失败");
			}
		}
		
	}
	
	/**
	 * 通用的接口状态
	 * @Author: caijun.wei
	 * @CreateDate:2017-11-02 09:49
	 * Version: V0.1
	 */
	public enum Status implements ErrorInterface {

	    SUCCESS("000000", "成功"),
	    ERROR("999999", "失败"),
	    REQUEST_PARAMETER_MISSING("000020", "缺失请求参数"),
	    REQUEST_PARAMETER_FORMAT_WRONG("000021", "请求参数格式不正确"),
	    REQUEST_PARAMETER_OVERLENGTH("000022", "请求参数长度超限"),
	    USER_EXISTS("000023", "请求参数长度超限"),
	    SESSION_INVALID("000024", "登录信息已过期，请重新登录"),
	    
	    //用户相关异常信息  10开头
	    
	    //异业合作相关异常信息  //12开头
		
	    
	    
	    //咨询相关错误信息    //14开头
	    
	    
	    //活动相关错误信息 16开头
	    
	    ;
	    
	    private String code;
	    private String msg;
	    
	    private Status(String code, String msg) {
	        this.code = code;
	        this.msg = msg;
	    }
	    
	    public String getCode() {
	        return code;
	    }
	    
	    public void setCode(String code) {
	        this.code = code;
	    }
	    
	    public String getMsg() {
	        return msg;
	    }
	    
	    public void setMsg(String msg) {
	        this.msg = msg;
	    }
	}
	
}
