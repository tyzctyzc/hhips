package com.hhips.service.menu;

import com.hhips.api.menu.SysMenuService;
import com.hhips.common.service.impl.BaseServiceImpl;
import com.hhips.dao.mapper.menu.SysMenuMapper;
import com.hhips.dao.model.menu.SysMenu;
import com.hhips.dao.model.menu.SysMenuExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述：TODO<br>
 *
 */
@Service("sysMenuService")
public class SysMenuServiceImpl extends BaseServiceImpl<SysMenuMapper, SysMenu, SysMenuExample> implements SysMenuService {

    @Autowired
    SysMenuMapper sysMenuMapper;
}
