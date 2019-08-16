package com.zhe.user.Tool;

import com.zhe.model.Page;
import com.zhe.model.ResModel;
import com.zhe.model.UserConstant;

import java.util.List;


/**
 * @Author:zhe.yang
 * @Description:
 * @DATE:Created in 11:33 2017/11/5 0005
 */

public class ResponseModelCommon {
    public static  void failure(ResModel res, UserConstant.Status constant){
        res.setCode(constant.getCode());
        res.setMsg(constant.getMsg());
    }
    public static  void succeed(ResModel res, List models) {
        res.setData( models);
        res.setCode("000000");
        res.setMsg("成功");
    }

    public static void succeed(ResModel res) {
        res.setCode("000000");
        res.setMsg("成功");
    }

    public static<T> void succeed(ResModel res,T num) {
        res.setData(num);
        res.setCode("000000");
        res.setMsg("成功");
    }

    public static void getPage(ResModel res,int start,int end ,int total){
        Page page = new Page();
        page.setTotal(total);
        page.setPage(start);
        page.setPageSize(end);
        res.setPage(page);
    }




}
