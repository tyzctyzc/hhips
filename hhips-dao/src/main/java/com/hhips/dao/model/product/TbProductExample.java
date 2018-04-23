package com.hhips.dao.model.product;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbProductExample implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TB_PRODUCT
     *
     * @mbg.generated Wed Feb 07 16:06:43 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TB_PRODUCT
     *
     * @mbg.generated Wed Feb 07 16:06:43 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TB_PRODUCT
     *
     * @mbg.generated Wed Feb 07 16:06:43 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TB_PRODUCT
     *
     * @mbg.generated Wed Feb 07 16:06:43 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_PRODUCT
     *
     * @mbg.generated Wed Feb 07 16:06:43 CST 2018
     */
    public TbProductExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_PRODUCT
     *
     * @mbg.generated Wed Feb 07 16:06:43 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_PRODUCT
     *
     * @mbg.generated Wed Feb 07 16:06:43 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_PRODUCT
     *
     * @mbg.generated Wed Feb 07 16:06:43 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_PRODUCT
     *
     * @mbg.generated Wed Feb 07 16:06:43 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_PRODUCT
     *
     * @mbg.generated Wed Feb 07 16:06:43 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_PRODUCT
     *
     * @mbg.generated Wed Feb 07 16:06:43 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_PRODUCT
     *
     * @mbg.generated Wed Feb 07 16:06:43 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_PRODUCT
     *
     * @mbg.generated Wed Feb 07 16:06:43 CST 2018
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
     * This method corresponds to the database table TB_PRODUCT
     *
     * @mbg.generated Wed Feb 07 16:06:43 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_PRODUCT
     *
     * @mbg.generated Wed Feb 07 16:06:43 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TB_PRODUCT
     *
     * @mbg.generated Wed Feb 07 16:06:43 CST 2018
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

        public Criteria andProductCodeIsNull() {
            addCriterion("PRODUCT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNotNull() {
            addCriterion("PRODUCT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andProductCodeEqualTo(String value) {
            addCriterion("PRODUCT_CODE =", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotEqualTo(String value) {
            addCriterion("PRODUCT_CODE <>", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThan(String value) {
            addCriterion("PRODUCT_CODE >", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_CODE >=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThan(String value) {
            addCriterion("PRODUCT_CODE <", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_CODE <=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLike(String value) {
            addCriterion("PRODUCT_CODE like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotLike(String value) {
            addCriterion("PRODUCT_CODE not like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeIn(List<String> values) {
            addCriterion("PRODUCT_CODE in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotIn(List<String> values) {
            addCriterion("PRODUCT_CODE not in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeBetween(String value1, String value2) {
            addCriterion("PRODUCT_CODE between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_CODE not between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("PRODUCT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("PRODUCT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("PRODUCT_NAME =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("PRODUCT_NAME <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("PRODUCT_NAME >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NAME >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("PRODUCT_NAME <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NAME <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("PRODUCT_NAME like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("PRODUCT_NAME not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("PRODUCT_NAME in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("PRODUCT_NAME not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("PRODUCT_NAME between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_NAME not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductPriceIsNull() {
            addCriterion("PRODUCT_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andProductPriceIsNotNull() {
            addCriterion("PRODUCT_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andProductPriceEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_PRICE =", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_PRICE <>", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceGreaterThan(BigDecimal value) {
            addCriterion("PRODUCT_PRICE >", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_PRICE >=", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceLessThan(BigDecimal value) {
            addCriterion("PRODUCT_PRICE <", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_PRICE <=", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceIn(List<BigDecimal> values) {
            addCriterion("PRODUCT_PRICE in", values, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotIn(List<BigDecimal> values) {
            addCriterion("PRODUCT_PRICE not in", values, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_PRICE between", value1, value2, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_PRICE not between", value1, value2, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductNumIsNull() {
            addCriterion("PRODUCT_NUM is null");
            return (Criteria) this;
        }

        public Criteria andProductNumIsNotNull() {
            addCriterion("PRODUCT_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andProductNumEqualTo(Integer value) {
            addCriterion("PRODUCT_NUM =", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotEqualTo(Integer value) {
            addCriterion("PRODUCT_NUM <>", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumGreaterThan(Integer value) {
            addCriterion("PRODUCT_NUM >", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_NUM >=", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumLessThan(Integer value) {
            addCriterion("PRODUCT_NUM <", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumLessThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_NUM <=", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumIn(List<Integer> values) {
            addCriterion("PRODUCT_NUM in", values, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotIn(List<Integer> values) {
            addCriterion("PRODUCT_NUM not in", values, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_NUM between", value1, value2, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_NUM not between", value1, value2, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductUserIsNull() {
            addCriterion("PRODUCT_USER is null");
            return (Criteria) this;
        }

        public Criteria andProductUserIsNotNull() {
            addCriterion("PRODUCT_USER is not null");
            return (Criteria) this;
        }

        public Criteria andProductUserEqualTo(String value) {
            addCriterion("PRODUCT_USER =", value, "productUser");
            return (Criteria) this;
        }

        public Criteria andProductUserNotEqualTo(String value) {
            addCriterion("PRODUCT_USER <>", value, "productUser");
            return (Criteria) this;
        }

        public Criteria andProductUserGreaterThan(String value) {
            addCriterion("PRODUCT_USER >", value, "productUser");
            return (Criteria) this;
        }

        public Criteria andProductUserGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_USER >=", value, "productUser");
            return (Criteria) this;
        }

        public Criteria andProductUserLessThan(String value) {
            addCriterion("PRODUCT_USER <", value, "productUser");
            return (Criteria) this;
        }

        public Criteria andProductUserLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_USER <=", value, "productUser");
            return (Criteria) this;
        }

        public Criteria andProductUserLike(String value) {
            addCriterion("PRODUCT_USER like", value, "productUser");
            return (Criteria) this;
        }

        public Criteria andProductUserNotLike(String value) {
            addCriterion("PRODUCT_USER not like", value, "productUser");
            return (Criteria) this;
        }

        public Criteria andProductUserIn(List<String> values) {
            addCriterion("PRODUCT_USER in", values, "productUser");
            return (Criteria) this;
        }

        public Criteria andProductUserNotIn(List<String> values) {
            addCriterion("PRODUCT_USER not in", values, "productUser");
            return (Criteria) this;
        }

        public Criteria andProductUserBetween(String value1, String value2) {
            addCriterion("PRODUCT_USER between", value1, value2, "productUser");
            return (Criteria) this;
        }

        public Criteria andProductUserNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_USER not between", value1, value2, "productUser");
            return (Criteria) this;
        }

        public Criteria andProductDateIsNull() {
            addCriterion("PRODUCT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andProductDateIsNotNull() {
            addCriterion("PRODUCT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andProductDateEqualTo(Date value) {
            addCriterion("PRODUCT_DATE =", value, "productDate");
            return (Criteria) this;
        }

        public Criteria andProductDateNotEqualTo(Date value) {
            addCriterion("PRODUCT_DATE <>", value, "productDate");
            return (Criteria) this;
        }

        public Criteria andProductDateGreaterThan(Date value) {
            addCriterion("PRODUCT_DATE >", value, "productDate");
            return (Criteria) this;
        }

        public Criteria andProductDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PRODUCT_DATE >=", value, "productDate");
            return (Criteria) this;
        }

        public Criteria andProductDateLessThan(Date value) {
            addCriterion("PRODUCT_DATE <", value, "productDate");
            return (Criteria) this;
        }

        public Criteria andProductDateLessThanOrEqualTo(Date value) {
            addCriterion("PRODUCT_DATE <=", value, "productDate");
            return (Criteria) this;
        }

        public Criteria andProductDateIn(List<Date> values) {
            addCriterion("PRODUCT_DATE in", values, "productDate");
            return (Criteria) this;
        }

        public Criteria andProductDateNotIn(List<Date> values) {
            addCriterion("PRODUCT_DATE not in", values, "productDate");
            return (Criteria) this;
        }

        public Criteria andProductDateBetween(Date value1, Date value2) {
            addCriterion("PRODUCT_DATE between", value1, value2, "productDate");
            return (Criteria) this;
        }

        public Criteria andProductDateNotBetween(Date value1, Date value2) {
            addCriterion("PRODUCT_DATE not between", value1, value2, "productDate");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNull() {
            addCriterion("PRODUCT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNotNull() {
            addCriterion("PRODUCT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeEqualTo(String value) {
            addCriterion("PRODUCT_TYPE =", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotEqualTo(String value) {
            addCriterion("PRODUCT_TYPE <>", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThan(String value) {
            addCriterion("PRODUCT_TYPE >", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_TYPE >=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThan(String value) {
            addCriterion("PRODUCT_TYPE <", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_TYPE <=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLike(String value) {
            addCriterion("PRODUCT_TYPE like", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotLike(String value) {
            addCriterion("PRODUCT_TYPE not like", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeIn(List<String> values) {
            addCriterion("PRODUCT_TYPE in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotIn(List<String> values) {
            addCriterion("PRODUCT_TYPE not in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeBetween(String value1, String value2) {
            addCriterion("PRODUCT_TYPE between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_TYPE not between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andProductStatusIsNull() {
            addCriterion("PRODUCT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andProductStatusIsNotNull() {
            addCriterion("PRODUCT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andProductStatusEqualTo(Boolean value) {
            addCriterion("PRODUCT_STATUS =", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusNotEqualTo(Boolean value) {
            addCriterion("PRODUCT_STATUS <>", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusGreaterThan(Boolean value) {
            addCriterion("PRODUCT_STATUS >", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("PRODUCT_STATUS >=", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusLessThan(Boolean value) {
            addCriterion("PRODUCT_STATUS <", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("PRODUCT_STATUS <=", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusIn(List<Boolean> values) {
            addCriterion("PRODUCT_STATUS in", values, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusNotIn(List<Boolean> values) {
            addCriterion("PRODUCT_STATUS not in", values, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("PRODUCT_STATUS between", value1, value2, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("PRODUCT_STATUS not between", value1, value2, "productStatus");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TB_PRODUCT
     *
     * @mbg.generated do_not_delete_during_merge Wed Feb 07 16:06:43 CST 2018
     */
    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TB_PRODUCT
     *
     * @mbg.generated Wed Feb 07 16:06:43 CST 2018
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