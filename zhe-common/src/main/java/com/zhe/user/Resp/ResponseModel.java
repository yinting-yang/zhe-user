package com.zhe.user.Resp;

import java.io.Serializable;

/**
 * @Author:zhe.yang
 * @Description:
 * @DATE:Created in 16:15 2017/10/26 0026
 */

public class ResponseModel<T> implements Serializable {
    private static final long serialVersionUID = -8216120115091027857L;
    private String code;
    private String msg;
    private T data;
    private Page page;

    public ResponseModel() {
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Page getPage() {
        return this.page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public String toString() {
        return "ResponseModel{code=\'" + this.code + '\'' + ", msg=\'" + this.msg + '\'' + ", data=" + this.data + ", page=" + this.page + '}';
    }
}
