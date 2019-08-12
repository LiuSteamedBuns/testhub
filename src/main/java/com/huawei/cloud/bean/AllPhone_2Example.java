package com.huawei.cloud.bean;

import java.util.ArrayList;
import java.util.List;

public class AllPhone_2Example {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tab_allphone_2
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tab_allphone_2
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tab_allphone_2
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_allphone_2
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    public AllPhone_2Example() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_allphone_2
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_allphone_2
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_allphone_2
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_allphone_2
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_allphone_2
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_allphone_2
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_allphone_2
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_allphone_2
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
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
     * This method corresponds to the database table tab_allphone_2
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_allphone_2
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tab_allphone_2
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    protected abstract static class GeneratedCriteria {
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

        public Criteria andTtidIsNull() {
            addCriterion("ttid is null");
            return (Criteria) this;
        }

        public Criteria andTtidIsNotNull() {
            addCriterion("ttid is not null");
            return (Criteria) this;
        }

        public Criteria andTtidEqualTo(Integer value) {
            addCriterion("ttid =", value, "ttid");
            return (Criteria) this;
        }

        public Criteria andTtidNotEqualTo(Integer value) {
            addCriterion("ttid <>", value, "ttid");
            return (Criteria) this;
        }

        public Criteria andTtidGreaterThan(Integer value) {
            addCriterion("ttid >", value, "ttid");
            return (Criteria) this;
        }

        public Criteria andTtidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ttid >=", value, "ttid");
            return (Criteria) this;
        }

        public Criteria andTtidLessThan(Integer value) {
            addCriterion("ttid <", value, "ttid");
            return (Criteria) this;
        }

        public Criteria andTtidLessThanOrEqualTo(Integer value) {
            addCriterion("ttid <=", value, "ttid");
            return (Criteria) this;
        }

        public Criteria andTtidIn(List<Integer> values) {
            addCriterion("ttid in", values, "ttid");
            return (Criteria) this;
        }

        public Criteria andTtidNotIn(List<Integer> values) {
            addCriterion("ttid not in", values, "ttid");
            return (Criteria) this;
        }

        public Criteria andTtidBetween(Integer value1, Integer value2) {
            addCriterion("ttid between", value1, value2, "ttid");
            return (Criteria) this;
        }

        public Criteria andTtidNotBetween(Integer value1, Integer value2) {
            addCriterion("ttid not between", value1, value2, "ttid");
            return (Criteria) this;
        }

        public Criteria andAlltelephoneIsNull() {
            addCriterion("alltelephone is null");
            return (Criteria) this;
        }

        public Criteria andAlltelephoneIsNotNull() {
            addCriterion("alltelephone is not null");
            return (Criteria) this;
        }

        public Criteria andAlltelephoneEqualTo(String value) {
            addCriterion("alltelephone =", value, "alltelephone");
            return (Criteria) this;
        }

        public Criteria andAlltelephoneNotEqualTo(String value) {
            addCriterion("alltelephone <>", value, "alltelephone");
            return (Criteria) this;
        }

        public Criteria andAlltelephoneGreaterThan(String value) {
            addCriterion("alltelephone >", value, "alltelephone");
            return (Criteria) this;
        }

        public Criteria andAlltelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("alltelephone >=", value, "alltelephone");
            return (Criteria) this;
        }

        public Criteria andAlltelephoneLessThan(String value) {
            addCriterion("alltelephone <", value, "alltelephone");
            return (Criteria) this;
        }

        public Criteria andAlltelephoneLessThanOrEqualTo(String value) {
            addCriterion("alltelephone <=", value, "alltelephone");
            return (Criteria) this;
        }

        public Criteria andAlltelephoneLike(String value) {
            addCriterion("alltelephone like", value, "alltelephone");
            return (Criteria) this;
        }

        public Criteria andAlltelephoneNotLike(String value) {
            addCriterion("alltelephone not like", value, "alltelephone");
            return (Criteria) this;
        }

        public Criteria andAlltelephoneIn(List<String> values) {
            addCriterion("alltelephone in", values, "alltelephone");
            return (Criteria) this;
        }

        public Criteria andAlltelephoneNotIn(List<String> values) {
            addCriterion("alltelephone not in", values, "alltelephone");
            return (Criteria) this;
        }

        public Criteria andAlltelephoneBetween(String value1, String value2) {
            addCriterion("alltelephone between", value1, value2, "alltelephone");
            return (Criteria) this;
        }

        public Criteria andAlltelephoneNotBetween(String value1, String value2) {
            addCriterion("alltelephone not between", value1, value2, "alltelephone");
            return (Criteria) this;
        }

        public Criteria andEmpnoIsNull() {
            addCriterion("empno is null");
            return (Criteria) this;
        }

        public Criteria andEmpnoIsNotNull() {
            addCriterion("empno is not null");
            return (Criteria) this;
        }

        public Criteria andEmpnoEqualTo(Integer value) {
            addCriterion("empno =", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoNotEqualTo(Integer value) {
            addCriterion("empno <>", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoGreaterThan(Integer value) {
            addCriterion("empno >", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("empno >=", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoLessThan(Integer value) {
            addCriterion("empno <", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoLessThanOrEqualTo(Integer value) {
            addCriterion("empno <=", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoIn(List<Integer> values) {
            addCriterion("empno in", values, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoNotIn(List<Integer> values) {
            addCriterion("empno not in", values, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoBetween(Integer value1, Integer value2) {
            addCriterion("empno between", value1, value2, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoNotBetween(Integer value1, Integer value2) {
            addCriterion("empno not between", value1, value2, "empno");
            return (Criteria) this;
        }

        public Criteria andMiddletagIsNull() {
            addCriterion("middletag is null");
            return (Criteria) this;
        }

        public Criteria andMiddletagIsNotNull() {
            addCriterion("middletag is not null");
            return (Criteria) this;
        }

        public Criteria andMiddletagEqualTo(Integer value) {
            addCriterion("middletag =", value, "middletag");
            return (Criteria) this;
        }

        public Criteria andMiddletagNotEqualTo(Integer value) {
            addCriterion("middletag <>", value, "middletag");
            return (Criteria) this;
        }

        public Criteria andMiddletagGreaterThan(Integer value) {
            addCriterion("middletag >", value, "middletag");
            return (Criteria) this;
        }

        public Criteria andMiddletagGreaterThanOrEqualTo(Integer value) {
            addCriterion("middletag >=", value, "middletag");
            return (Criteria) this;
        }

        public Criteria andMiddletagLessThan(Integer value) {
            addCriterion("middletag <", value, "middletag");
            return (Criteria) this;
        }

        public Criteria andMiddletagLessThanOrEqualTo(Integer value) {
            addCriterion("middletag <=", value, "middletag");
            return (Criteria) this;
        }

        public Criteria andMiddletagIn(List<Integer> values) {
            addCriterion("middletag in", values, "middletag");
            return (Criteria) this;
        }

        public Criteria andMiddletagNotIn(List<Integer> values) {
            addCriterion("middletag not in", values, "middletag");
            return (Criteria) this;
        }

        public Criteria andMiddletagBetween(Integer value1, Integer value2) {
            addCriterion("middletag between", value1, value2, "middletag");
            return (Criteria) this;
        }

        public Criteria andMiddletagNotBetween(Integer value1, Integer value2) {
            addCriterion("middletag not between", value1, value2, "middletag");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tab_allphone_2
     *
     * @mbg.generated do_not_delete_during_merge Sun Jun 16 10:11:06 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tab_allphone_2
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    public static class Criterion {
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