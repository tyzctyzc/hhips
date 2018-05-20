package com.hhips.service.problem;

import com.hhips.api.problem.SourceChapterService;
import com.hhips.common.service.impl.BaseServiceImpl;
import com.hhips.dao.mapper.problem.SourceChapterMapper;
import com.hhips.dao.model.problem.SourceChapter;
import com.hhips.dao.model.problem.SourceChapterExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述：TODO<br>
 *
 */
@Service("sourceChapterService")
public class SourceChapterServiceImpl extends BaseServiceImpl<SourceChapterMapper, SourceChapter, SourceChapterExample> implements SourceChapterService {

    @Autowired
    SourceChapterMapper sourceChapterMapper;
}
