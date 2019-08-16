package com.zhe.user.service;

import com.zhe.user.model.TUserPasswordYzInfo;
import com.zhe.user.persistence.models.TUserPasswordYz;
import org.springframework.stereotype.Service;

/**
 * @Author:zhe.yang
 * @Description:
 * @DATE:Created in 17:41 2017/12/8 0008
 */
@Service("iUserPasswordYzService")
public class TUserPasswordYzServiceImpl extends BaseUserServiceImpl<TUserPasswordYzInfo, TUserPasswordYz> implements IUserPasswordYzService  {
}
