package com.hhips.service.user;

import com.hhips.api.user.UserRoleRelService;
import com.hhips.common.service.impl.BaseServiceImpl;
import com.hhips.dao.mapper.user.UserRoleRelMapper;
import com.hhips.dao.model.user.UserRoleRel;
import com.hhips.dao.model.user.UserRoleRelExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述：TODO<br>
 *
 */
@Service("userRoleRelService")
public class UserRoleRelServiceImpl extends BaseServiceImpl<UserRoleRelMapper, UserRoleRel, UserRoleRelExample> implements UserRoleRelService {

    @Autowired
    UserRoleRelMapper userRoleRelMapper;

}
