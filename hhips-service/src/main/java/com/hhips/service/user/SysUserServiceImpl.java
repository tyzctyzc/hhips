package com.hhips.service.user;

import com.hhips.api.user.SysUserService;
import com.hhips.common.service.impl.BaseServiceImpl;
import com.hhips.dao.mapper.user.SysUserMapper;
import com.hhips.dao.model.user.SysUser;
import com.hhips.dao.model.user.SysUserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述：TODO<br>
 *
 */
@Service("sysUserService")
public class SysUserServiceImpl extends BaseServiceImpl<SysUserMapper, SysUser, SysUserExample> implements SysUserService {

    @Autowired
    SysUserMapper sysUserMapper;

}
