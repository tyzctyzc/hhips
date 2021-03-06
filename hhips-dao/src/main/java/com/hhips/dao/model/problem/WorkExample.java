package com.hhips.dao.model.problem;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WorkExample implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table work
     *
     * @mbg.generated Mon Apr 30 14:26:05 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table work
     *
     * @mbg.generated Mon Apr 30 14:26:05 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table work
     *
     * @mbg.generated Mon Apr 30 14:26:05 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table work
     *
     * @mbg.generated Mon Apr 30 14:26:05 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table work
     *
     * @mbg.generated Mon Apr 30 14:26:05 CST 2018
     */
    public WorkExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table work
     *
     * @mbg.generated Mon Apr 30 14:26:05 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table work
     *
     * @mbg.generated Mon Apr 30 14:26:05 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table work
     *
     * @mbg.generated Mon Apr 30 14:26:05 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table work
     *
     * @mbg.generated Mon Apr 30 14:26:05 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table work
     *
     * @mbg.generated Mon Apr 30 14:26:05 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table work
     *
     * @mbg.generated Mon Apr 30 14:26:05 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table work
     *
     * @mbg.generated Mon Apr 30 14:26:05 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table work
     *
     * @mbg.generated Mon Apr 30 14:26:05 CST 2018
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
     * This method corresponds to the database table work
     *
     * @mbg.generated Mon Apr 30 14:26:05 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table work
     *
     * @mbg.generated Mon Apr 30 14:26:05 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table work
     *
     * @mbg.generated Mon Apr 30 14:26:05 CST 2018
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

        public Criteria andIdworkIsNull() {
            addCriterion("idwork is null");
            return (Criteria) this;
        }

        public Criteria andIdworkIsNotNull() {
            addCriterion("idwork is not null");
            return (Criteria) this;
        }

        public Criteria andIdworkEqualTo(Integer value) {
            addCriterion("idwork =", value, "idwork");
            return (Criteria) this;
        }

        public Criteria andIdworkNotEqualTo(Integer value) {
            addCriterion("idwork <>", value, "idwork");
            return (Criteria) this;
        }

        public Criteria andIdworkGreaterThan(Integer value) {
            addCriterion("idwork >", value, "idwork");
            return (Criteria) this;
        }

        public Criteria andIdworkGreaterThanOrEqualTo(Integer value) {
            addCriterion("idwork >=", value, "idwork");
            return (Criteria) this;
        }

        public Criteria andIdworkLessThan(Integer value) {
            addCriterion("idwork <", value, "idwork");
            return (Criteria) this;
        }

        public Criteria andIdworkLessThanOrEqualTo(Integer value) {
            addCriterion("idwork <=", value, "idwork");
            return (Criteria) this;
        }

        public Criteria andIdworkIn(List<Integer> values) {
            addCriterion("idwork in", values, "idwork");
            return (Criteria) this;
        }

        public Criteria andIdworkNotIn(List<Integer> values) {
            addCriterion("idwork not in", values, "idwork");
            return (Criteria) this;
        }

        public Criteria andIdworkBetween(Integer value1, Integer value2) {
            addCriterion("idwork between", value1, value2, "idwork");
            return (Criteria) this;
        }

        public Criteria andIdworkNotBetween(Integer value1, Integer value2) {
            addCriterion("idwork not between", value1, value2, "idwork");
            return (Criteria) this;
        }

        public Criteria andWorkdateIsNull() {
            addCriterion("workdate is null");
            return (Criteria) this;
        }

        public Criteria andWorkdateIsNotNull() {
            addCriterion("workdate is not null");
            return (Criteria) this;
        }

        public Criteria andWorkdateEqualTo(Date value) {
            addCriterion("workdate =", value, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateNotEqualTo(Date value) {
            addCriterion("workdate <>", value, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateGreaterThan(Date value) {
            addCriterion("workdate >", value, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateGreaterThanOrEqualTo(Date value) {
            addCriterion("workdate >=", value, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateLessThan(Date value) {
            addCriterion("workdate <", value, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateLessThanOrEqualTo(Date value) {
            addCriterion("workdate <=", value, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateIn(List<Date> values) {
            addCriterion("workdate in", values, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateNotIn(List<Date> values) {
            addCriterion("workdate not in", values, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateBetween(Date value1, Date value2) {
            addCriterion("workdate between", value1, value2, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateNotBetween(Date value1, Date value2) {
            addCriterion("workdate not between", value1, value2, "workdate");
            return (Criteria) this;
        }

        public Criteria andIdproblemIsNull() {
            addCriterion("idproblem is null");
            return (Criteria) this;
        }

        public Criteria andIdproblemIsNotNull() {
            addCriterion("idproblem is not null");
            return (Criteria) this;
        }

        public Criteria andIdproblemEqualTo(Integer value) {
            addCriterion("idproblem =", value, "idproblem");
            return (Criteria) this;
        }

        public Criteria andIdproblemNotEqualTo(Integer value) {
            addCriterion("idproblem <>", value, "idproblem");
            return (Criteria) this;
        }

        public Criteria andIdproblemGreaterThan(Integer value) {
            addCriterion("idproblem >", value, "idproblem");
            return (Criteria) this;
        }

        public Criteria andIdproblemGreaterThanOrEqualTo(Integer value) {
            addCriterion("idproblem >=", value, "idproblem");
            return (Criteria) this;
        }

        public Criteria andIdproblemLessThan(Integer value) {
            addCriterion("idproblem <", value, "idproblem");
            return (Criteria) this;
        }

        public Criteria andIdproblemLessThanOrEqualTo(Integer value) {
            addCriterion("idproblem <=", value, "idproblem");
            return (Criteria) this;
        }

        public Criteria andIdproblemIn(List<Integer> values) {
            addCriterion("idproblem in", values, "idproblem");
            return (Criteria) this;
        }

        public Criteria andIdproblemNotIn(List<Integer> values) {
            addCriterion("idproblem not in", values, "idproblem");
            return (Criteria) this;
        }

        public Criteria andIdproblemBetween(Integer value1, Integer value2) {
            addCriterion("idproblem between", value1, value2, "idproblem");
            return (Criteria) this;
        }

        public Criteria andIdproblemNotBetween(Integer value1, Integer value2) {
            addCriterion("idproblem not between", value1, value2, "idproblem");
            return (Criteria) this;
        }

        public Criteria andUsedtimeIsNull() {
            addCriterion("usedtime is null");
            return (Criteria) this;
        }

        public Criteria andUsedtimeIsNotNull() {
            addCriterion("usedtime is not null");
            return (Criteria) this;
        }

        public Criteria andUsedtimeEqualTo(Integer value) {
            addCriterion("usedtime =", value, "usedtime");
            return (Criteria) this;
        }

        public Criteria andUsedtimeNotEqualTo(Integer value) {
            addCriterion("usedtime <>", value, "usedtime");
            return (Criteria) this;
        }

        public Criteria andUsedtimeGreaterThan(Integer value) {
            addCriterion("usedtime >", value, "usedtime");
            return (Criteria) this;
        }

        public Criteria andUsedtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("usedtime >=", value, "usedtime");
            return (Criteria) this;
        }

        public Criteria andUsedtimeLessThan(Integer value) {
            addCriterion("usedtime <", value, "usedtime");
            return (Criteria) this;
        }

        public Criteria andUsedtimeLessThanOrEqualTo(Integer value) {
            addCriterion("usedtime <=", value, "usedtime");
            return (Criteria) this;
        }

        public Criteria andUsedtimeIn(List<Integer> values) {
            addCriterion("usedtime in", values, "usedtime");
            return (Criteria) this;
        }

        public Criteria andUsedtimeNotIn(List<Integer> values) {
            addCriterion("usedtime not in", values, "usedtime");
            return (Criteria) this;
        }

        public Criteria andUsedtimeBetween(Integer value1, Integer value2) {
            addCriterion("usedtime between", value1, value2, "usedtime");
            return (Criteria) this;
        }

        public Criteria andUsedtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("usedtime not between", value1, value2, "usedtime");
            return (Criteria) this;
        }

        public Criteria andWorkdetailIsNull() {
            addCriterion("workdetail is null");
            return (Criteria) this;
        }

        public Criteria andWorkdetailIsNotNull() {
            addCriterion("workdetail is not null");
            return (Criteria) this;
        }

        public Criteria andWorkdetailEqualTo(String value) {
            addCriterion("workdetail =", value, "workdetail");
            return (Criteria) this;
        }

        public Criteria andWorkdetailNotEqualTo(String value) {
            addCriterion("workdetail <>", value, "workdetail");
            return (Criteria) this;
        }

        public Criteria andWorkdetailGreaterThan(String value) {
            addCriterion("workdetail >", value, "workdetail");
            return (Criteria) this;
        }

        public Criteria andWorkdetailGreaterThanOrEqualTo(String value) {
            addCriterion("workdetail >=", value, "workdetail");
            return (Criteria) this;
        }

        public Criteria andWorkdetailLessThan(String value) {
            addCriterion("workdetail <", value, "workdetail");
            return (Criteria) this;
        }

        public Criteria andWorkdetailLessThanOrEqualTo(String value) {
            addCriterion("workdetail <=", value, "workdetail");
            return (Criteria) this;
        }

        public Criteria andWorkdetailLike(String value) {
            addCriterion("workdetail like", value, "workdetail");
            return (Criteria) this;
        }

        public Criteria andWorkdetailNotLike(String value) {
            addCriterion("workdetail not like", value, "workdetail");
            return (Criteria) this;
        }

        public Criteria andWorkdetailIn(List<String> values) {
            addCriterion("workdetail in", values, "workdetail");
            return (Criteria) this;
        }

        public Criteria andWorkdetailNotIn(List<String> values) {
            addCriterion("workdetail not in", values, "workdetail");
            return (Criteria) this;
        }

        public Criteria andWorkdetailBetween(String value1, String value2) {
            addCriterion("workdetail between", value1, value2, "workdetail");
            return (Criteria) this;
        }

        public Criteria andWorkdetailNotBetween(String value1, String value2) {
            addCriterion("workdetail not between", value1, value2, "workdetail");
            return (Criteria) this;
        }

        public Criteria andWorkmarkIsNull() {
            addCriterion("workmark is null");
            return (Criteria) this;
        }

        public Criteria andWorkmarkIsNotNull() {
            addCriterion("workmark is not null");
            return (Criteria) this;
        }

        public Criteria andWorkmarkEqualTo(Integer value) {
            addCriterion("workmark =", value, "workmark");
            return (Criteria) this;
        }

        public Criteria andWorkmarkNotEqualTo(Integer value) {
            addCriterion("workmark <>", value, "workmark");
            return (Criteria) this;
        }

        public Criteria andWorkmarkGreaterThan(Integer value) {
            addCriterion("workmark >", value, "workmark");
            return (Criteria) this;
        }

        public Criteria andWorkmarkGreaterThanOrEqualTo(Integer value) {
            addCriterion("workmark >=", value, "workmark");
            return (Criteria) this;
        }

        public Criteria andWorkmarkLessThan(Integer value) {
            addCriterion("workmark <", value, "workmark");
            return (Criteria) this;
        }

        public Criteria andWorkmarkLessThanOrEqualTo(Integer value) {
            addCriterion("workmark <=", value, "workmark");
            return (Criteria) this;
        }

        public Criteria andWorkmarkIn(List<Integer> values) {
            addCriterion("workmark in", values, "workmark");
            return (Criteria) this;
        }

        public Criteria andWorkmarkNotIn(List<Integer> values) {
            addCriterion("workmark not in", values, "workmark");
            return (Criteria) this;
        }

        public Criteria andWorkmarkBetween(Integer value1, Integer value2) {
            addCriterion("workmark between", value1, value2, "workmark");
            return (Criteria) this;
        }

        public Criteria andWorkmarkNotBetween(Integer value1, Integer value2) {
            addCriterion("workmark not between", value1, value2, "workmark");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(Integer value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(Integer value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(Integer value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(Integer value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(Integer value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(Integer value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<Integer> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<Integer> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(Integer value1, Integer value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(Integer value1, Integer value2) {
            addCriterion("reason not between", value1, value2, "reason");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table work
     *
     * @mbg.generated do_not_delete_during_merge Mon Apr 30 14:26:05 CST 2018
     */
    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table work
     *
     * @mbg.generated Mon Apr 30 14:26:05 CST 2018
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