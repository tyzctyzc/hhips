package com.hhips.service.role;

import com.hhips.api.role.RoleMenuRelService;
import com.hhips.common.service.impl.BaseServiceImpl;
import com.hhips.dao.mapper.role.RoleMenuRelMapper;
import com.hhips.dao.model.role.RoleMenuRel;
import com.hhips.dao.model.role.RoleMenuRelExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述：TODO<br>
 *
 */
@Service("roleMenuRelService")
public class RoleMenuRelServiceImpl extends BaseServiceImpl<RoleMenuRelMapper, RoleMenuRel, RoleMenuRelExample> implements RoleMenuRelService {

    @Autowired
    RoleMenuRelMapper roleMenuRelMapper;

}
