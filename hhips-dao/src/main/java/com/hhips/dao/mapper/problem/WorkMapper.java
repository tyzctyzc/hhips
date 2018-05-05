package com.hhips.dao.mapper.problem;

import com.hhips.dao.model.problem.Work;
import com.hhips.dao.model.problem.WorkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table work
     *
     * @mbg.generated Mon Apr 30 14:26:05 CST 2018
     */
    long countByExample(WorkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table work
     *
     * @mbg.generated Mon Apr 30 14:26:05 CST 2018
     */
    int deleteByExample(WorkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table work
     *
     * @mbg.generated Mon Apr 30 14:26:05 CST 2018
     */
    int deleteByPrimaryKey(Integer idwork);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table work
     *
     * @mbg.generated Mon Apr 30 14:26:05 CST 2018
     */
    int insert(Work record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table work
     *
     * @mbg.generated Mon Apr 30 14:26:05 CST 2018
     */
    int insertSelective(Work record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table work
     *
     * @mbg.generated Mon Apr 30 14:26:05 CST 2018
     */
    List<Work> selectByExample(WorkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table work
     *
     * @mbg.generated Mon Apr 30 14:26:05 CST 2018
     */
    Work selectByPrimaryKey(Integer idwork);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table work
     *
     * @mbg.generated Mon Apr 30 14:26:05 CST 2018
     */
    int updateByExampleSelective(@Param("record") Work record, @Param("example") WorkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table work
     *
     * @mbg.generated Mon Apr 30 14:26:05 CST 2018
     */
    int updateByExample(@Param("record") Work record, @Param("example") WorkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table work
     *
     * @mbg.generated Mon Apr 30 14:26:05 CST 2018
     */
    int updateByPrimaryKeySelective(Work record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table work
     *
     * @mbg.generated Mon Apr 30 14:26:05 CST 2018
     */
    int updateByPrimaryKey(Work record);
}