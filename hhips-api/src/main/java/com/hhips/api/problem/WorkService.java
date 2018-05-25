package com.hhips.api.problem;

import com.hhips.common.model.PageModel;
import com.hhips.common.service.BaseService;
import com.hhips.dao.model.problem.Work;
import com.hhips.dao.model.problem.WorkExample;

/**
 * 描述：TODO<br>
 *
 */
public interface WorkService extends BaseService<Work, WorkExample> {
    PageModel<Work> selectByExampleWithProblemIDForOffsetPage(Integer problemid, Integer offset, Integer limit);
}
