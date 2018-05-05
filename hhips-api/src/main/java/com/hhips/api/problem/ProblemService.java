package com.hhips.api.problem;

import com.hhips.common.model.PageModel;
import com.hhips.common.service.BaseService;
import com.hhips.dao.model.problem.Problem;
import com.hhips.dao.model.problem.ProblemExample;

import java.util.List;

/**
 * 描述：TODO<br>
 *
 */
public interface ProblemService extends BaseService<Problem, ProblemExample> {
    List<Problem> selectByExampleWithChapterID(/*ProblemExample example, */Integer chapterid);

    PageModel<Problem> selectByExampleWithChapterIDForOffsetPage(/*ProblemExample example,*/Integer chapterid, Integer offset, Integer limit);
}
