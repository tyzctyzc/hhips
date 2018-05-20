package com.hhips.service.problem;

import com.hhips.api.problem.ModuleService;
import com.hhips.common.service.impl.BaseServiceImpl;
import com.hhips.dao.mapper.problem.ModuleMapper;
import com.hhips.dao.model.problem.Module;
import com.hhips.dao.model.problem.ModuleExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述：TODO<br>
 *
 */
@Service("moduleService")
public class ModuleServiceImpl extends BaseServiceImpl<ModuleMapper, Module, ModuleExample> implements ModuleService {

    @Autowired
    ModuleMapper moduleMapper;
}
