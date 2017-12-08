package com.zhe.user.service;

import com.zhe.user.model.TAuthCodeLogYzInfo;
import com.zhe.user.persistence.models.TAuthCodeLogYz;
import org.springframework.stereotype.Service;

/**
 * @Author:zhe.yang
 * @Description:
 * @DATE:Created in 17:36 2017/12/8 0008
 */
@Service("iAuthCodeLogYzService")
public class TAuthCodeLogYzServiceImpl extends BaseUserServiceImpl<TAuthCodeLogYzInfo,TAuthCodeLogYz> implements IAuthCodeLogYzService {
}
