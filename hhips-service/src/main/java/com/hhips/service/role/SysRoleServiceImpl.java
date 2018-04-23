package com.hhips.service.role;

import com.hhips.api.role.SysRoleService;
import com.hhips.common.service.impl.BaseServiceImpl;
import com.hhips.dao.mapper.role.SysRoleMapper;
import com.hhips.dao.model.role.SysRole;
import com.hhips.dao.model.role.SysRoleExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述：TODO<br>
 *
 */
@Service("sysRoleService")
public class SysRoleServiceImpl extends BaseServiceImpl<SysRoleMapper, SysRole, SysRoleExample> implements SysRoleService {

    @Autowired
    SysRoleMapper sysRoleMapper;

}
