package cooperation;/*
package com.lincomb.lbg.cooperation;
import com.lincomb.base.model.RequestModel;
import com.lincomb.base.model.ResponseModel;
import com.lincomb.lbg.cooperation.model.IndustryLabelInfo;
import com.lincomb.lbg.cooperation.service.IIndustryLabelService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

*/
/**
	* ClassName: BootstrapTest
	* Function: TODO ADD FUNCTION.
	* Reason: TODO ADD REASON(可选).
	* date: 2017年3月10日 下午3:41:29
	* @author yuping.zhang
	* @version
	* @since JDK 1.7
 *//*

public class BootstrapTest {

	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Test
	public void testAdd() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "spring-context-consumer.xml" });
		context.start();

		IIndustryLabelService industryLabelService = (IIndustryLabelService)context.getBean("industryLabelService");

		//添加
		RequestModel<IndustryLabelInfo> req = new RequestModel<IndustryLabelInfo>();
		IndustryLabelInfo industryLabelInfo = new IndustryLabelInfo();
		industryLabelInfo.setIndustryId("000001");

		industryLabelInfo.setIndustryName("互联网");
		industryLabelInfo.setExistStatus("01");
//		industryLabelInfo.setCreateTime();
		req.setParam(industryLabelInfo);
//		ResponseModel<IndustryLabelInfo> res = industryLabelService.insert(req);
//		log.info("添加结果:{}",res.toString());

		//查询
//		req.setPage(0);
//		req.setPageSize(2);
//		ResponseModel<List<IndustryLabelInfo>> resList = industryLabelService.find(req);
//		log.info("查询结果:{}",resList.toString());

		//修改
		IndustryLabelInfo industryLabelInfo1 = new IndustryLabelInfo();
		industryLabelInfo1.setIndustryId("000001");
		industryLabelInfo.setIndustryName("互联网-科技创新企业");
		industryLabelInfo1.setExistStatus("02");



		context.close();
	}
}*/
