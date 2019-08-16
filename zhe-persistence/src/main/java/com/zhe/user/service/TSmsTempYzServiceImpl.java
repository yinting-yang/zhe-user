package com.zhe.user.service;

import com.zhe.user.model.TSmsTempYzInfo;
import com.zhe.user.persistence.models.TSmsTempYz;
import org.springframework.stereotype.Service;

/**
 * @Author:zhe.yang
 * @Description:
 * @DATE:Created in 17:38 2017/12/8 0008
 */
@Service("iSmsTempYzService")
public class TSmsTempYzServiceImpl extends BaseUserServiceImpl<TSmsTempYzInfo, TSmsTempYz> implements ISmsTempYzService{
}
