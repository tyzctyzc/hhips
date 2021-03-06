package com.hhips.dao.model.chapter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SysChapterExample implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_chapter
     *
     * @mbg.generated Mon Apr 30 14:05:33 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_chapter
     *
     * @mbg.generated Mon Apr 30 14:05:33 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_chapter
     *
     * @mbg.generated Mon Apr 30 14:05:33 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_chapter
     *
     * @mbg.generated Mon Apr 30 14:05:33 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_chapter
     *
     * @mbg.generated Mon Apr 30 14:05:33 CST 2018
     */
    public SysChapterExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_chapter
     *
     * @mbg.generated Mon Apr 30 14:05:33 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_chapter
     *
     * @mbg.generated Mon Apr 30 14:05:33 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_chapter
     *
     * @mbg.generated Mon Apr 30 14:05:33 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_chapter
     *
     * @mbg.generated Mon Apr 30 14:05:33 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_chapter
     *
     * @mbg.generated Mon Apr 30 14:05:33 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_chapter
     *
     * @mbg.generated Mon Apr 30 14:05:33 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_chapter
     *
     * @mbg.generated Mon Apr 30 14:05:33 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_chapter
     *
     * @mbg.generated Mon Apr 30 14:05:33 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_chapter
     *
     * @mbg.generated Mon Apr 30 14:05:33 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_chapter
     *
     * @mbg.generated Mon Apr 30 14:05:33 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sys_chapter
     *
     * @mbg.generated Mon Apr 30 14:05:33 CST 2018
     */
    protected abstract static class GeneratedCriteria implements Serializable {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andChapterIdIsNull() {
            addCriterion("CHAPTER_ID is null");
            return (Criteria) this;
        }

        public Criteria andChapterIdIsNotNull() {
            addCriterion("CHAPTER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andChapterIdEqualTo(String value) {
            addCriterion("CHAPTER_ID =", value, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdNotEqualTo(String value) {
            addCriterion("CHAPTER_ID <>", value, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdGreaterThan(String value) {
            addCriterion("CHAPTER_ID >", value, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdGreaterThanOrEqualTo(String value) {
            addCriterion("CHAPTER_ID >=", value, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdLessThan(String value) {
            addCriterion("CHAPTER_ID <", value, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdLessThanOrEqualTo(String value) {
            addCriterion("CHAPTER_ID <=", value, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdLike(String value) {
            addCriterion("CHAPTER_ID like", value, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdNotLike(String value) {
            addCriterion("CHAPTER_ID not like", value, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdIn(List<String> values) {
            addCriterion("CHAPTER_ID in", values, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdNotIn(List<String> values) {
            addCriterion("CHAPTER_ID not in", values, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdBetween(String value1, String value2) {
            addCriterion("CHAPTER_ID between", value1, value2, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdNotBetween(String value1, String value2) {
            addCriterion("CHAPTER_ID not between", value1, value2, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterPidIsNull() {
            addCriterion("CHAPTER_PID is null");
            return (Criteria) this;
        }

        public Criteria andChapterPidIsNotNull() {
            addCriterion("CHAPTER_PID is not null");
            return (Criteria) this;
        }

        public Criteria andChapterPidEqualTo(String value) {
            addCriterion("CHAPTER_PID =", value, "chapterPid");
            return (Criteria) this;
        }

        public Criteria andChapterPidNotEqualTo(String value) {
            addCriterion("CHAPTER_PID <>", value, "chapterPid");
            return (Criteria) this;
        }

        public Criteria andChapterPidGreaterThan(String value) {
            addCriterion("CHAPTER_PID >", value, "chapterPid");
            return (Criteria) this;
        }

        public Criteria andChapterPidGreaterThanOrEqualTo(String value) {
            addCriterion("CHAPTER_PID >=", value, "chapterPid");
            return (Criteria) this;
        }

        public Criteria andChapterPidLessThan(String value) {
            addCriterion("CHAPTER_PID <", value, "chapterPid");
            return (Criteria) this;
        }

        public Criteria andChapterPidLessThanOrEqualTo(String value) {
            addCriterion("CHAPTER_PID <=", value, "chapterPid");
            return (Criteria) this;
        }

        public Criteria andChapterPidLike(String value) {
            addCriterion("CHAPTER_PID like", value, "chapterPid");
            return (Criteria) this;
        }

        public Criteria andChapterPidNotLike(String value) {
            addCriterion("CHAPTER_PID not like", value, "chapterPid");
            return (Criteria) this;
        }

        public Criteria andChapterPidIn(List<String> values) {
            addCriterion("CHAPTER_PID in", values, "chapterPid");
            return (Criteria) this;
        }

        public Criteria andChapterPidNotIn(List<String> values) {
            addCriterion("CHAPTER_PID not in", values, "chapterPid");
            return (Criteria) this;
        }

        public Criteria andChapterPidBetween(String value1, String value2) {
            addCriterion("CHAPTER_PID between", value1, value2, "chapterPid");
            return (Criteria) this;
        }

        public Criteria andChapterPidNotBetween(String value1, String value2) {
            addCriterion("CHAPTER_PID not between", value1, value2, "chapterPid");
            return (Criteria) this;
        }

        public Criteria andChapterNameIsNull() {
            addCriterion("CHAPTER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andChapterNameIsNotNull() {
            addCriterion("CHAPTER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andChapterNameEqualTo(String value) {
            addCriterion("CHAPTER_NAME =", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameNotEqualTo(String value) {
            addCriterion("CHAPTER_NAME <>", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameGreaterThan(String value) {
            addCriterion("CHAPTER_NAME >", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameGreaterThanOrEqualTo(String value) {
            addCriterion("CHAPTER_NAME >=", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameLessThan(String value) {
            addCriterion("CHAPTER_NAME <", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameLessThanOrEqualTo(String value) {
            addCriterion("CHAPTER_NAME <=", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameLike(String value) {
            addCriterion("CHAPTER_NAME like", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameNotLike(String value) {
            addCriterion("CHAPTER_NAME not like", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameIn(List<String> values) {
            addCriterion("CHAPTER_NAME in", values, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameNotIn(List<String> values) {
            addCriterion("CHAPTER_NAME not in", values, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameBetween(String value1, String value2) {
            addCriterion("CHAPTER_NAME between", value1, value2, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameNotBetween(String value1, String value2) {
            addCriterion("CHAPTER_NAME not between", value1, value2, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterDescribeIsNull() {
            addCriterion("CHAPTER_DESCRIBE is null");
            return (Criteria) this;
        }

        public Criteria andChapterDescribeIsNotNull() {
            addCriterion("CHAPTER_DESCRIBE is not null");
            return (Criteria) this;
        }

        public Criteria andChapterDescribeEqualTo(String value) {
            addCriterion("CHAPTER_DESCRIBE =", value, "chapterDescribe");
            return (Criteria) this;
        }

        public Criteria andChapterDescribeNotEqualTo(String value) {
            addCriterion("CHAPTER_DESCRIBE <>", value, "chapterDescribe");
            return (Criteria) this;
        }

        public Criteria andChapterDescribeGreaterThan(String value) {
            addCriterion("CHAPTER_DESCRIBE >", value, "chapterDescribe");
            return (Criteria) this;
        }

        public Criteria andChapterDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("CHAPTER_DESCRIBE >=", value, "chapterDescribe");
            return (Criteria) this;
        }

        public Criteria andChapterDescribeLessThan(String value) {
            addCriterion("CHAPTER_DESCRIBE <", value, "chapterDescribe");
            return (Criteria) this;
        }

        public Criteria andChapterDescribeLessThanOrEqualTo(String value) {
            addCriterion("CHAPTER_DESCRIBE <=", value, "chapterDescribe");
            return (Criteria) this;
        }

        public Criteria andChapterDescribeLike(String value) {
            addCriterion("CHAPTER_DESCRIBE like", value, "chapterDescribe");
            return (Criteria) this;
        }

        public Criteria andChapterDescribeNotLike(String value) {
            addCriterion("CHAPTER_DESCRIBE not like", value, "chapterDescribe");
            return (Criteria) this;
        }

        public Criteria andChapterDescribeIn(List<String> values) {
            addCriterion("CHAPTER_DESCRIBE in", values, "chapterDescribe");
            return (Criteria) this;
        }

        public Criteria andChapterDescribeNotIn(List<String> values) {
            addCriterion("CHAPTER_DESCRIBE not in", values, "chapterDescribe");
            return (Criteria) this;
        }

        public Criteria andChapterDescribeBetween(String value1, String value2) {
            addCriterion("CHAPTER_DESCRIBE between", value1, value2, "chapterDescribe");
            return (Criteria) this;
        }

        public Criteria andChapterDescribeNotBetween(String value1, String value2) {
            addCriterion("CHAPTER_DESCRIBE not between", value1, value2, "chapterDescribe");
            return (Criteria) this;
        }

        public Criteria andChapterUrlIsNull() {
            addCriterion("CHAPTER_URL is null");
            return (Criteria) this;
        }

        public Criteria andChapterUrlIsNotNull() {
            addCriterion("CHAPTER_URL is not null");
            return (Criteria) this;
        }

        public Criteria andChapterUrlEqualTo(String value) {
            addCriterion("CHAPTER_URL =", value, "chapterUrl");
            return (Criteria) this;
        }

        public Criteria andChapterUrlNotEqualTo(String value) {
            addCriterion("CHAPTER_URL <>", value, "chapterUrl");
            return (Criteria) this;
        }

        public Criteria andChapterUrlGreaterThan(String value) {
            addCriterion("CHAPTER_URL >", value, "chapterUrl");
            return (Criteria) this;
        }

        public Criteria andChapterUrlGreaterThanOrEqualTo(String value) {
            addCriterion("CHAPTER_URL >=", value, "chapterUrl");
            return (Criteria) this;
        }

        public Criteria andChapterUrlLessThan(String value) {
            addCriterion("CHAPTER_URL <", value, "chapterUrl");
            return (Criteria) this;
        }

        public Criteria andChapterUrlLessThanOrEqualTo(String value) {
            addCriterion("CHAPTER_URL <=", value, "chapterUrl");
            return (Criteria) this;
        }

        public Criteria andChapterUrlLike(String value) {
            addCriterion("CHAPTER_URL like", value, "chapterUrl");
            return (Criteria) this;
        }

        public Criteria andChapterUrlNotLike(String value) {
            addCriterion("CHAPTER_URL not like", value, "chapterUrl");
            return (Criteria) this;
        }

        public Criteria andChapterUrlIn(List<String> values) {
            addCriterion("CHAPTER_URL in", values, "chapterUrl");
            return (Criteria) this;
        }

        public Criteria andChapterUrlNotIn(List<String> values) {
            addCriterion("CHAPTER_URL not in", values, "chapterUrl");
            return (Criteria) this;
        }

        public Criteria andChapterUrlBetween(String value1, String value2) {
            addCriterion("CHAPTER_URL between", value1, value2, "chapterUrl");
            return (Criteria) this;
        }

        public Criteria andChapterUrlNotBetween(String value1, String value2) {
            addCriterion("CHAPTER_URL not between", value1, value2, "chapterUrl");
            return (Criteria) this;
        }

        public Criteria andChapterIconIsNull() {
            addCriterion("CHAPTER_ICON is null");
            return (Criteria) this;
        }

        public Criteria andChapterIconIsNotNull() {
            addCriterion("CHAPTER_ICON is not null");
            return (Criteria) this;
        }

        public Criteria andChapterIconEqualTo(String value) {
            addCriterion("CHAPTER_ICON =", value, "chapterIcon");
            return (Criteria) this;
        }

        public Criteria andChapterIconNotEqualTo(String value) {
            addCriterion("CHAPTER_ICON <>", value, "chapterIcon");
            return (Criteria) this;
        }

        public Criteria andChapterIconGreaterThan(String value) {
            addCriterion("CHAPTER_ICON >", value, "chapterIcon");
            return (Criteria) this;
        }

        public Criteria andChapterIconGreaterThanOrEqualTo(String value) {
            addCriterion("CHAPTER_ICON >=", value, "chapterIcon");
            return (Criteria) this;
        }

        public Criteria andChapterIconLessThan(String value) {
            addCriterion("CHAPTER_ICON <", value, "chapterIcon");
            return (Criteria) this;
        }

        public Criteria andChapterIconLessThanOrEqualTo(String value) {
            addCriterion("CHAPTER_ICON <=", value, "chapterIcon");
            return (Criteria) this;
        }

        public Criteria andChapterIconLike(String value) {
            addCriterion("CHAPTER_ICON like", value, "chapterIcon");
            return (Criteria) this;
        }

        public Criteria andChapterIconNotLike(String value) {
            addCriterion("CHAPTER_ICON not like", value, "chapterIcon");
            return (Criteria) this;
        }

        public Criteria andChapterIconIn(List<String> values) {
            addCriterion("CHAPTER_ICON in", values, "chapterIcon");
            return (Criteria) this;
        }

        public Criteria andChapterIconNotIn(List<String> values) {
            addCriterion("CHAPTER_ICON not in", values, "chapterIcon");
            return (Criteria) this;
        }

        public Criteria andChapterIconBetween(String value1, String value2) {
            addCriterion("CHAPTER_ICON between", value1, value2, "chapterIcon");
            return (Criteria) this;
        }

        public Criteria andChapterIconNotBetween(String value1, String value2) {
            addCriterion("CHAPTER_ICON not between", value1, value2, "chapterIcon");
            return (Criteria) this;
        }

        public Criteria andChapterIndexIsNull() {
            addCriterion("CHAPTER_INDEX is null");
            return (Criteria) this;
        }

        public Criteria andChapterIndexIsNotNull() {
            addCriterion("CHAPTER_INDEX is not null");
            return (Criteria) this;
        }

        public Criteria andChapterIndexEqualTo(Integer value) {
            addCriterion("CHAPTER_INDEX =", value, "chapterIndex");
            return (Criteria) this;
        }

        public Criteria andChapterIndexNotEqualTo(Integer value) {
            addCriterion("CHAPTER_INDEX <>", value, "chapterIndex");
            return (Criteria) this;
        }

        public Criteria andChapterIndexGreaterThan(Integer value) {
            addCriterion("CHAPTER_INDEX >", value, "chapterIndex");
            return (Criteria) this;
        }

        public Criteria andChapterIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHAPTER_INDEX >=", value, "chapterIndex");
            return (Criteria) this;
        }

        public Criteria andChapterIndexLessThan(Integer value) {
            addCriterion("CHAPTER_INDEX <", value, "chapterIndex");
            return (Criteria) this;
        }

        public Criteria andChapterIndexLessThanOrEqualTo(Integer value) {
            addCriterion("CHAPTER_INDEX <=", value, "chapterIndex");
            return (Criteria) this;
        }

        public Criteria andChapterIndexIn(List<Integer> values) {
            addCriterion("CHAPTER_INDEX in", values, "chapterIndex");
            return (Criteria) this;
        }

        public Criteria andChapterIndexNotIn(List<Integer> values) {
            addCriterion("CHAPTER_INDEX not in", values, "chapterIndex");
            return (Criteria) this;
        }

        public Criteria andChapterIndexBetween(Integer value1, Integer value2) {
            addCriterion("CHAPTER_INDEX between", value1, value2, "chapterIndex");
            return (Criteria) this;
        }

        public Criteria andChapterIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("CHAPTER_INDEX not between", value1, value2, "chapterIndex");
            return (Criteria) this;
        }

        public Criteria andChapterTypeIsNull() {
            addCriterion("CHAPTER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andChapterTypeIsNotNull() {
            addCriterion("CHAPTER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andChapterTypeEqualTo(String value) {
            addCriterion("CHAPTER_TYPE =", value, "chapterType");
            return (Criteria) this;
        }

        public Criteria andChapterTypeNotEqualTo(String value) {
            addCriterion("CHAPTER_TYPE <>", value, "chapterType");
            return (Criteria) this;
        }

        public Criteria andChapterTypeGreaterThan(String value) {
            addCriterion("CHAPTER_TYPE >", value, "chapterType");
            return (Criteria) this;
        }

        public Criteria andChapterTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CHAPTER_TYPE >=", value, "chapterType");
            return (Criteria) this;
        }

        public Criteria andChapterTypeLessThan(String value) {
            addCriterion("CHAPTER_TYPE <", value, "chapterType");
            return (Criteria) this;
        }

        public Criteria andChapterTypeLessThanOrEqualTo(String value) {
            addCriterion("CHAPTER_TYPE <=", value, "chapterType");
            return (Criteria) this;
        }

        public Criteria andChapterTypeLike(String value) {
            addCriterion("CHAPTER_TYPE like", value, "chapterType");
            return (Criteria) this;
        }

        public Criteria andChapterTypeNotLike(String value) {
            addCriterion("CHAPTER_TYPE not like", value, "chapterType");
            return (Criteria) this;
        }

        public Criteria andChapterTypeIn(List<String> values) {
            addCriterion("CHAPTER_TYPE in", values, "chapterType");
            return (Criteria) this;
        }

        public Criteria andChapterTypeNotIn(List<String> values) {
            addCriterion("CHAPTER_TYPE not in", values, "chapterType");
            return (Criteria) this;
        }

        public Criteria andChapterTypeBetween(String value1, String value2) {
            addCriterion("CHAPTER_TYPE between", value1, value2, "chapterType");
            return (Criteria) this;
        }

        public Criteria andChapterTypeNotBetween(String value1, String value2) {
            addCriterion("CHAPTER_TYPE not between", value1, value2, "chapterType");
            return (Criteria) this;
        }

        public Criteria andChapterLevelIsNull() {
            addCriterion("CHAPTER_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andChapterLevelIsNotNull() {
            addCriterion("CHAPTER_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andChapterLevelEqualTo(Integer value) {
            addCriterion("CHAPTER_LEVEL =", value, "chapterLevel");
            return (Criteria) this;
        }

        public Criteria andChapterLevelNotEqualTo(Integer value) {
            addCriterion("CHAPTER_LEVEL <>", value, "chapterLevel");
            return (Criteria) this;
        }

        public Criteria andChapterLevelGreaterThan(Integer value) {
            addCriterion("CHAPTER_LEVEL >", value, "chapterLevel");
            return (Criteria) this;
        }

        public Criteria andChapterLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHAPTER_LEVEL >=", value, "chapterLevel");
            return (Criteria) this;
        }

        public Criteria andChapterLevelLessThan(Integer value) {
            addCriterion("CHAPTER_LEVEL <", value, "chapterLevel");
            return (Criteria) this;
        }

        public Criteria andChapterLevelLessThanOrEqualTo(Integer value) {
            addCriterion("CHAPTER_LEVEL <=", value, "chapterLevel");
            return (Criteria) this;
        }

        public Criteria andChapterLevelIn(List<Integer> values) {
            addCriterion("CHAPTER_LEVEL in", values, "chapterLevel");
            return (Criteria) this;
        }

        public Criteria andChapterLevelNotIn(List<Integer> values) {
            addCriterion("CHAPTER_LEVEL not in", values, "chapterLevel");
            return (Criteria) this;
        }

        public Criteria andChapterLevelBetween(Integer value1, Integer value2) {
            addCriterion("CHAPTER_LEVEL between", value1, value2, "chapterLevel");
            return (Criteria) this;
        }

        public Criteria andChapterLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("CHAPTER_LEVEL not between", value1, value2, "chapterLevel");
            return (Criteria) this;
        }

        public Criteria andChapterValidIsNull() {
            addCriterion("CHAPTER_VALID is null");
            return (Criteria) this;
        }

        public Criteria andChapterValidIsNotNull() {
            addCriterion("CHAPTER_VALID is not null");
            return (Criteria) this;
        }

        public Criteria andChapterValidEqualTo(Boolean value) {
            addCriterion("CHAPTER_VALID =", value, "chapterValid");
            return (Criteria) this;
        }

        public Criteria andChapterValidNotEqualTo(Boolean value) {
            addCriterion("CHAPTER_VALID <>", value, "chapterValid");
            return (Criteria) this;
        }

        public Criteria andChapterValidGreaterThan(Boolean value) {
            addCriterion("CHAPTER_VALID >", value, "chapterValid");
            return (Criteria) this;
        }

        public Criteria andChapterValidGreaterThanOrEqualTo(Boolean value) {
            addCriterion("CHAPTER_VALID >=", value, "chapterValid");
            return (Criteria) this;
        }

        public Criteria andChapterValidLessThan(Boolean value) {
            addCriterion("CHAPTER_VALID <", value, "chapterValid");
            return (Criteria) this;
        }

        public Criteria andChapterValidLessThanOrEqualTo(Boolean value) {
            addCriterion("CHAPTER_VALID <=", value, "chapterValid");
            return (Criteria) this;
        }

        public Criteria andChapterValidIn(List<Boolean> values) {
            addCriterion("CHAPTER_VALID in", values, "chapterValid");
            return (Criteria) this;
        }

        public Criteria andChapterValidNotIn(List<Boolean> values) {
            addCriterion("CHAPTER_VALID not in", values, "chapterValid");
            return (Criteria) this;
        }

        public Criteria andChapterValidBetween(Boolean value1, Boolean value2) {
            addCriterion("CHAPTER_VALID between", value1, value2, "chapterValid");
            return (Criteria) this;
        }

        public Criteria andChapterValidNotBetween(Boolean value1, Boolean value2) {
            addCriterion("CHAPTER_VALID not between", value1, value2, "chapterValid");
            return (Criteria) this;
        }

        public Criteria andChapterSourceidIsNull() {
            addCriterion("CHAPTER_SOURCEID is null");
            return (Criteria) this;
        }

        public Criteria andChapterSourceidIsNotNull() {
            addCriterion("CHAPTER_SOURCEID is not null");
            return (Criteria) this;
        }

        public Criteria andChapterSourceidEqualTo(Integer value) {
            addCriterion("CHAPTER_SOURCEID =", value, "chapterSourceid");
            return (Criteria) this;
        }

        public Criteria andChapterSourceidNotEqualTo(Integer value) {
            addCriterion("CHAPTER_SOURCEID <>", value, "chapterSourceid");
            return (Criteria) this;
        }

        public Criteria andChapterSourceidGreaterThan(Integer value) {
            addCriterion("CHAPTER_SOURCEID >", value, "chapterSourceid");
            return (Criteria) this;
        }

        public Criteria andChapterSourceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHAPTER_SOURCEID >=", value, "chapterSourceid");
            return (Criteria) this;
        }

        public Criteria andChapterSourceidLessThan(Integer value) {
            addCriterion("CHAPTER_SOURCEID <", value, "chapterSourceid");
            return (Criteria) this;
        }

        public Criteria andChapterSourceidLessThanOrEqualTo(Integer value) {
            addCriterion("CHAPTER_SOURCEID <=", value, "chapterSourceid");
            return (Criteria) this;
        }

        public Criteria andChapterSourceidIn(List<Integer> values) {
            addCriterion("CHAPTER_SOURCEID in", values, "chapterSourceid");
            return (Criteria) this;
        }

        public Criteria andChapterSourceidNotIn(List<Integer> values) {
            addCriterion("CHAPTER_SOURCEID not in", values, "chapterSourceid");
            return (Criteria) this;
        }

        public Criteria andChapterSourceidBetween(Integer value1, Integer value2) {
            addCriterion("CHAPTER_SOURCEID between", value1, value2, "chapterSourceid");
            return (Criteria) this;
        }

        public Criteria andChapterSourceidNotBetween(Integer value1, Integer value2) {
            addCriterion("CHAPTER_SOURCEID not between", value1, value2, "chapterSourceid");
            return (Criteria) this;
        }

        public Criteria andChapterChapteridIsNull() {
            addCriterion("CHAPTER_CHAPTERID is null");
            return (Criteria) this;
        }

        public Criteria andChapterChapteridIsNotNull() {
            addCriterion("CHAPTER_CHAPTERID is not null");
            return (Criteria) this;
        }

        public Criteria andChapterChapteridEqualTo(Integer value) {
            addCriterion("CHAPTER_CHAPTERID =", value, "chapterChapterid");
            return (Criteria) this;
        }

        public Criteria andChapterChapteridNotEqualTo(Integer value) {
            addCriterion("CHAPTER_CHAPTERID <>", value, "chapterChapterid");
            return (Criteria) this;
        }

        public Criteria andChapterChapteridGreaterThan(Integer value) {
            addCriterion("CHAPTER_CHAPTERID >", value, "chapterChapterid");
            return (Criteria) this;
        }

        public Criteria andChapterChapteridGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHAPTER_CHAPTERID >=", value, "chapterChapterid");
            return (Criteria) this;
        }

        public Criteria andChapterChapteridLessThan(Integer value) {
            addCriterion("CHAPTER_CHAPTERID <", value, "chapterChapterid");
            return (Criteria) this;
        }

        public Criteria andChapterChapteridLessThanOrEqualTo(Integer value) {
            addCriterion("CHAPTER_CHAPTERID <=", value, "chapterChapterid");
            return (Criteria) this;
        }

        public Criteria andChapterChapteridIn(List<Integer> values) {
            addCriterion("CHAPTER_CHAPTERID in", values, "chapterChapterid");
            return (Criteria) this;
        }

        public Criteria andChapterChapteridNotIn(List<Integer> values) {
            addCriterion("CHAPTER_CHAPTERID not in", values, "chapterChapterid");
            return (Criteria) this;
        }

        public Criteria andChapterChapteridBetween(Integer value1, Integer value2) {
            addCriterion("CHAPTER_CHAPTERID between", value1, value2, "chapterChapterid");
            return (Criteria) this;
        }

        public Criteria andChapterChapteridNotBetween(Integer value1, Integer value2) {
            addCriterion("CHAPTER_CHAPTERID not between", value1, value2, "chapterChapterid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sys_chapter
     *
     * @mbg.generated do_not_delete_during_merge Mon Apr 30 14:05:33 CST 2018
     */
    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sys_chapter
     *
     * @mbg.generated Mon Apr 30 14:05:33 CST 2018
     */
    public static class Criterion implements Serializable {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}