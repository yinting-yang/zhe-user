package cooperation;

import com.zhe.model.ReqModel;
import com.zhe.model.ResModel;
import com.zhe.user.model.TAuthCodeLogYzInfo;
import com.zhe.user.service.IAuthCodeLogYzService;
import com.zhe.user.service.IBaseUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.Serializable;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/spring-context.xml"})
public class CooperationServiceTest {


    @Qualifier("iAuthCodeLogYzService")
    @Autowired
    private IBaseUserService iBaseUserService ;


    /**
     * @Author:zhe.yang
     * @Description:测试
     * @Date:20:16 2017/11/7 0007
     */
    @Test
    public void countUserByBuyTimesTest() throws Exception {
        TAuthCodeLogYzInfo tAuthCodeLogYzInfo = new TAuthCodeLogYzInfo();
        ReqModel<TAuthCodeLogYzInfo> re = new ReqModel<>();
        re.setParam(tAuthCodeLogYzInfo);
        re.setPage(1);
        re.setPageSize(Integer.MAX_VALUE);
        ResModel<List<TAuthCodeLogYzInfo>> resModel = this.iBaseUserService.find(re);
        List<TAuthCodeLogYzInfo> data = resModel.getData();
    }
    


}
