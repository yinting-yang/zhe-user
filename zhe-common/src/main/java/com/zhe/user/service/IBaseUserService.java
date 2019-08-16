package com.zhe.user.service;

import com.zhe.model.ReqModel;
import com.zhe.model.ResModel;

import java.io.Serializable;
import java.util.List;

/**
 * @Author:zhe.yang
 * @Description:
 * @DATE:Created in 16:00 2017/12/8 0008
 */

public interface IBaseUserService<T1 extends Serializable> {
    /**
     * @Author:zhe.yang
     * @Description:分页查询
     * @Date:19:33 2017/11/7 0007
     */

    ResModel<List<T1>> find(ReqModel<T1> requestModel);

    /**
     * @Author:zhe.yang
     * @Description:插入
     * @Date:19:34 2017/11/7 0007
     */
    ResModel insert(ReqModel<T1> requestModel);

    /**
     * @Author:zhe.yang
     * @Description:删除
     * @Date:19:34 2017/11/7 0007
     */
    ResModel del(ReqModel<T1> requestModel);

    /**
     * @Author:zhe.yang
     * @Description:更新
     * @Date:19:35 2017/11/7 0007
     */
    ResModel update(ReqModel<T1> requestModel);

    /**
     * @Author:zhe.yang
     * @Description:查询个数
     * @Date:19:35 2017/11/7 0007
     */
    ResModel findByTotal(ReqModel<T1> requestModel);

}
