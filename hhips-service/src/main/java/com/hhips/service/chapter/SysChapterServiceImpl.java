package com.hhips.service.chapter;

import com.hhips.api.chapter.SysChapterService;
import com.hhips.common.service.impl.BaseServiceImpl;
import com.hhips.dao.mapper.chapter.SysChapterMapper;
import com.hhips.dao.model.chapter.SysChapter;
import com.hhips.dao.model.chapter.SysChapterExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述：TODO<br>
 *
 */
@Service("sysChapterService")
public class SysChapterServiceImpl extends BaseServiceImpl<SysChapterMapper, SysChapter, SysChapterExample> implements SysChapterService {

    @Autowired
    SysChapterMapper sysChapterMapper;
}
