package com.zhe.user.Exception;

import com.zhe.user.State.SysState;

/**
 * @Author:zhe.yang
 * @Description:
 * @DATE:Created in 16:18 2017/10/26 0026
 */

public class ZheException extends RuntimeException{


    private static final long serialVersionUID = 1L;

    /**
     * 异常状态
     */
    private SysState sysState;

    public ZheException(SysState sysState) {
        super(sysState.getMsg());
        this.sysState = sysState;
    }

    public ZheException(SysState sysState, Throwable throwable) {
        super(sysState.getMsg(), throwable);
        this.sysState = sysState;
    }

    public SysState getSysState() {
        return sysState;
    }

    public void setSysState(SysState SysState) {
        this.sysState = SysState;
    }
}
