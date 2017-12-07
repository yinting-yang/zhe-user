package cooperation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/spring-context.xml"})
public class CooperationIndsutryServiceTest {

	 /*@Autowired
	    private ICooperationIndustryService iCooperationIndustryService;*/
	 
	 @Test
	 public void testFind(){
		/* CooperationIndustryVo cooperationIndustryVo = new CooperationIndustryVo();
		 List<Integer> iList = new ArrayList<>();
		 iList.add(260);
		 iList.add(261);
		 cooperationIndustryVo.setIds(iList);
		 RequestModel<CooperationIndustryVo> civReq = new RequestModel<>();
		 civReq.setParam(cooperationIndustryVo);
		 ResponseModel<List<CooperationIndustryVo>> civRes = iCooperationIndustryService.findIndstryNameByIds(civReq);
		 System.out.println(civRes.getData().get(0).getIndsutryName());*/
	 }
}
