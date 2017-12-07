package cooperation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/spring-context.xml"})
public class CooperationServiceTest {


    /*@Autowired
    private IContactService contactService;
    @Autowired
    private IResourcesLabelService iResourcesLabelService;
    @Autowired
    private ICooperationService iCooperationService;
    @Autowired
    private IModulePublicSevice iModulePublicSevice;
    @Autowired
    private IBannerService iBannerService;
    @Autowired
    private IBrandAreaRelService iBrandAreaRelService;
    @Autowired
    private IBrandUserlabelRelService iBrandUserlabelRelService;
    @Autowired
    private ICooperationResourceService iCooperationResourceService;
    @Autowired
    private ICooperationRelationService iCooperationRelationService;

    /**
     * @Author:zhe.yang
     * @Description:测试
     * @Date:20:16 2017/11/7 0007
     */
    @Test
    public void countUserByBuyTimesTest() throws Exception {
       /* List<IperFenInfo> list = this.perFen.find(1, 500);

        for (IperFenInfo item:list){
            //插入品牌相关的地区.
          *//*  BrandInfo brandInfo = new BrandInfo();
            brandInfo.setBrandName();
            brandInfo.setIsExamine();
            brandInfo.setIsDelete();
            brandInfo.setAreas();
            brandInfo.setCreateTime();
            brandInfo.setEnterTime();
            brandInfo.setIsBrands();
            brandInfo.setUserId();*//*



            //插入异业合作信息
            //插入品牌

            //插入品牌相关的行业
            //么有人群
            //插入异业合作寻找的行业
            //插入提供的内容
            //插入需求的内容
            //插入contactInfo
            //插入推荐查看数表



        }*/





    }
    
   /* @Test
    public void testFindForCms(){
    	CooperationInfoVo cooperationInfoVo = new CooperationInfoVo();
    	RequestModel<CooperationInfoVo> civReq = new RequestModel<>();
    	civReq.setParam(cooperationInfoVo);
    	civReq.setPage(1);
    	civReq.setPageSize(Integer.MAX_VALUE);
    	civReq.setReqStr(RequestUtil.getReqSerNum());
    	ResponseModel<List<CooperationInfoVo>> civRes = iCooperationService.findForCms(civReq);
    	System.out.println(civRes.getData().get(0).getBrandName());
    }*/

}
