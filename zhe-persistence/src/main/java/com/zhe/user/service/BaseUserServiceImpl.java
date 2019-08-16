package com.zhe.user.service;

import com.zhe.model.ReqModel;
import com.zhe.model.ResModel;
import com.zhe.model.UserConstant;
import com.zhe.user.Tool.ResponseModelCommon;
import com.zhe.user.persistence.BaseUserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author:zhe.yang
 * @Description:基础实现类的Base类
 * @DATE:Created in 13:25 2017/11/7 0007
 */

public class BaseUserServiceImpl<T1 extends Serializable, T2 extends Serializable> {
    protected Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
    protected BaseUserMapper<T2> baseCooperationMapper;
    private Class<T1> entityClass1 = (Class<T1>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    private Class<T2> entityClass2 = (Class<T2>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[1];
    private String models = entityClass1.getName().substring(entityClass1.getName().lastIndexOf(".") + 1);

    /**
     * @Author:zhe.yang
     * @Description:查询带分页
     * @Date:13:36 2017/11/7 0007
     */
    public synchronized ResModel<List<T1>> find(ReqModel<T1> ReqModel) {
        ResModel<List<T1>> res = new ResModel<>();
        try {
            T2 bean = entityClass2.newInstance();
            BeanUtils.copyProperties(ReqModel.getParam(), bean);
            List<T2> select = this.baseCooperationMapper.select(bean, (ReqModel.getPage() - 1) * ReqModel.getPageSize(), ReqModel.getPageSize());
            List<T1> acInfoList = new ArrayList<T1>();
            for (T2 ac : select) {
                T1 acInfo = entityClass1.newInstance();
                BeanUtils.copyProperties(ac, acInfo);
                acInfoList.add(acInfo);
            }
            ResponseModelCommon.succeed(res, acInfoList);
            int total = this.baseCooperationMapper.findTotal(bean);
            ResponseModelCommon.getPage(res, ReqModel.getPage(), ReqModel.getPageSize(), total);
        } catch (Exception e) {
            res.setErrData(e.getMessage());
            ResponseModelCommon.failure(res, UserConstant.Status.ERROR);
            log.error("查询" + models + "失败:" + e.getMessage(), e);
        }
        return res;
    }


    /**
     * @Author:zhe.yang
     * @Description:根据条件查询个数
     * @Date:18:37 2017/11/7 0007
     * @param: * @param null
     */
    public synchronized ResModel findByTotal(ReqModel<T1> ReqModel){
        ResModel res = new ResModel();
        try {
            T2 bean = entityClass2.newInstance();
            BeanUtils.copyProperties(ReqModel.getParam(), bean);
            int total = this.baseCooperationMapper.findTotal(bean);
            ResponseModelCommon.succeed(res, total);
        }catch (Exception e){
            res.setErrData(e.getMessage());
            ResponseModelCommon.failure(res, UserConstant.Status.ERROR);

            log.error(models + "条件查询个数异常:" + e.getMessage(), e);
        }
        return res;

    }


    /**
     * @Author:zhe.yang
     * @Description:插入
     * @Date:15:00 2017/11/5 0005
     */

    public synchronized ResModel insert(ReqModel<T1> ReqModel) {
        ResModel res = new ResModel();
        try {
            T2 bean = entityClass2.newInstance();
            BeanUtils.copyProperties(ReqModel.getParam(), bean);
            int insert = this.baseCooperationMapper.insert(bean);
            ResponseModelCommon.succeed(res, bean);
        } catch (Exception e) {
            res.setErrData(e.getMessage());
            ResponseModelCommon.failure(res, UserConstant.Status.ERROR);
            log.error(models + "插入异常:" + e.getMessage(), e);
        }
        return res;
    }

    /**
     * @Author:zhe.yang
     * @Description:删除
     * @Date:9:27 2017/11/6 0006
     */

    public synchronized ResModel del(ReqModel<T1> ReqModel) {
        ResModel res = new ResModel();
        try {
            T2 bean = entityClass2.newInstance();
            BeanUtils.copyProperties(ReqModel.getParam(), bean);
            int delete = this.baseCooperationMapper.delete(bean);
            ResponseModelCommon.succeed(res, delete);

        } catch (Exception e) {
            res.setErrData(e.getMessage());
            ResponseModelCommon.failure(res, UserConstant.Status.ERROR);
            log.error(models + "删除异常:" + e.getMessage(), e);
        }
        return res;
    }

    /**
     * @Author:zhe.yang
     * @Description:更新
     * @Date:9:27 2017/11/6 0006
     */
    public synchronized ResModel update(ReqModel<T1> ReqModel) {
        ResModel res = new ResModel();
        try {
            T2 bean = entityClass2.newInstance();
            BeanUtils.copyProperties(ReqModel.getParam(), bean);
            int update = this.baseCooperationMapper.update(bean);
            ResponseModelCommon.succeed(res, update);
        } catch (Exception e) {
            res.setErrData(e.getMessage());
            ResponseModelCommon.failure(res, UserConstant.Status.ERROR);
            log.error(models + "更新异常:" + e.getMessage(), e);
        }
        return res;
    }




}
