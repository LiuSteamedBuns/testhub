package com.huawei.cloud.bean;

import java.util.ArrayList;
import java.util.List;

public class Pending_1Example {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tab_pending_1
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tab_pending_1
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tab_pending_1
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_pending_1
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    public Pending_1Example() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_pending_1
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_pending_1
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_pending_1
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_pending_1
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_pending_1
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_pending_1
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_pending_1
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
     * This method corresponds to the database table tab_pending_1
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
     * This method corresponds to the database table tab_pending_1
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_pending_1
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
     * This class corresponds to the database table tab_pending_1
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

        public Criteria andPpidIsNull() {
            addCriterion("ppid is null");
            return (Criteria) this;
        }

        public Criteria andPpidIsNotNull() {
            addCriterion("ppid is not null");
            return (Criteria) this;
        }

        public Criteria andPpidEqualTo(Integer value) {
            addCriterion("ppid =", value, "ppid");
            return (Criteria) this;
        }

        public Criteria andPpidNotEqualTo(Integer value) {
            addCriterion("ppid <>", value, "ppid");
            return (Criteria) this;
        }

        public Criteria andPpidGreaterThan(Integer value) {
            addCriterion("ppid >", value, "ppid");
            return (Criteria) this;
        }

        public Criteria andPpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ppid >=", value, "ppid");
            return (Criteria) this;
        }

        public Criteria andPpidLessThan(Integer value) {
            addCriterion("ppid <", value, "ppid");
            return (Criteria) this;
        }

        public Criteria andPpidLessThanOrEqualTo(Integer value) {
            addCriterion("ppid <=", value, "ppid");
            return (Criteria) this;
        }

        public Criteria andPpidIn(List<Integer> values) {
            addCriterion("ppid in", values, "ppid");
            return (Criteria) this;
        }

        public Criteria andPpidNotIn(List<Integer> values) {
            addCriterion("ppid not in", values, "ppid");
            return (Criteria) this;
        }

        public Criteria andPpidBetween(Integer value1, Integer value2) {
            addCriterion("ppid between", value1, value2, "ppid");
            return (Criteria) this;
        }

        public Criteria andPpidNotBetween(Integer value1, Integer value2) {
            addCriterion("ppid not between", value1, value2, "ppid");
            return (Criteria) this;
        }

        public Criteria andPpendingIsNull() {
            addCriterion("ppending is null");
            return (Criteria) this;
        }

        public Criteria andPpendingIsNotNull() {
            addCriterion("ppending is not null");
            return (Criteria) this;
        }

        public Criteria andPpendingEqualTo(String value) {
            addCriterion("ppending =", value, "ppending");
            return (Criteria) this;
        }

        public Criteria andPpendingNotEqualTo(String value) {
            addCriterion("ppending <>", value, "ppending");
            return (Criteria) this;
        }

        public Criteria andPpendingGreaterThan(String value) {
            addCriterion("ppending >", value, "ppending");
            return (Criteria) this;
        }

        public Criteria andPpendingGreaterThanOrEqualTo(String value) {
            addCriterion("ppending >=", value, "ppending");
            return (Criteria) this;
        }

        public Criteria andPpendingLessThan(String value) {
            addCriterion("ppending <", value, "ppending");
            return (Criteria) this;
        }

        public Criteria andPpendingLessThanOrEqualTo(String value) {
            addCriterion("ppending <=", value, "ppending");
            return (Criteria) this;
        }

        public Criteria andPpendingLike(String value) {
            addCriterion("ppending like", value, "ppending");
            return (Criteria) this;
        }

        public Criteria andPpendingNotLike(String value) {
            addCriterion("ppending not like", value, "ppending");
            return (Criteria) this;
        }

        public Criteria andPpendingIn(List<String> values) {
            addCriterion("ppending in", values, "ppending");
            return (Criteria) this;
        }

        public Criteria andPpendingNotIn(List<String> values) {
            addCriterion("ppending not in", values, "ppending");
            return (Criteria) this;
        }

        public Criteria andPpendingBetween(String value1, String value2) {
            addCriterion("ppending between", value1, value2, "ppending");
            return (Criteria) this;
        }

        public Criteria andPpendingNotBetween(String value1, String value2) {
            addCriterion("ppending not between", value1, value2, "ppending");
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
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tab_pending_1
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
     * This class corresponds to the database table tab_pending_1
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