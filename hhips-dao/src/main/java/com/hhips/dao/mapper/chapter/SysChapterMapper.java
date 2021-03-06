package com.hhips.dao.mapper.chapter;

import com.hhips.dao.model.chapter.SysChapter;
import com.hhips.dao.model.chapter.SysChapterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysChapterMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_chapter
     *
     * @mbg.generated Mon Apr 30 14:05:33 CST 2018
     */
    long countByExample(SysChapterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_chapter
     *
     * @mbg.generated Mon Apr 30 14:05:33 CST 2018
     */
    int deleteByExample(SysChapterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_chapter
     *
     * @mbg.generated Mon Apr 30 14:05:33 CST 2018
     */
    int deleteByPrimaryKey(String chapterId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_chapter
     *
     * @mbg.generated Mon Apr 30 14:05:33 CST 2018
     */
    int insert(SysChapter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_chapter
     *
     * @mbg.generated Mon Apr 30 14:05:33 CST 2018
     */
    int insertSelective(SysChapter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_chapter
     *
     * @mbg.generated Mon Apr 30 14:05:33 CST 2018
     */
    List<SysChapter> selectByExample(SysChapterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_chapter
     *
     * @mbg.generated Mon Apr 30 14:05:33 CST 2018
     */
    SysChapter selectByPrimaryKey(String chapterId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_chapter
     *
     * @mbg.generated Mon Apr 30 14:05:33 CST 2018
     */
    int updateByExampleSelective(@Param("record") SysChapter record, @Param("example") SysChapterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_chapter
     *
     * @mbg.generated Mon Apr 30 14:05:33 CST 2018
     */
    int updateByExample(@Param("record") SysChapter record, @Param("example") SysChapterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_chapter
     *
     * @mbg.generated Mon Apr 30 14:05:33 CST 2018
     */
    int updateByPrimaryKeySelective(SysChapter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_chapter
     *
     * @mbg.generated Mon Apr 30 14:05:33 CST 2018
     */
    int updateByPrimaryKey(SysChapter record);
}