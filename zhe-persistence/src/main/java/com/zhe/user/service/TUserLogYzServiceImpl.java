package com.zhe.user.service;

import com.zhe.user.model.TUserLogYzInfo;
import com.zhe.user.persistence.models.TUserLogYz;
import org.springframework.stereotype.Service;

/**
 * @Author:zhe.yang
 * @Description:
 * @DATE:Created in 17:40 2017/12/8 0008
 */
@Service("iUserLogYzService")
public class TUserLogYzServiceImpl extends BaseUserServiceImpl<TUserLogYzInfo, TUserLogYz> implements IUserLogYzService {
}
