package com.hhips.api.problem;

import com.hhips.common.model.PageModel;
import com.hhips.common.service.BaseService;
import com.hhips.dao.model.problem.Paperproblem;
import com.hhips.dao.model.problem.PaperproblemExample;
import com.hhips.dao.model.problem.Problem;

/**
 * 描述：TODO<br>
 *
 */
public interface PaperProblemService extends BaseService<Paperproblem, PaperproblemExample> {
    PageModel<Paperproblem> selectByPaperID(Integer paperid, Integer offset, Integer limit);
}
