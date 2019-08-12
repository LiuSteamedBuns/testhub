package com.huawei.cloud.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RepetitionExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tab_repetition
     *
     * @mbg.generated Fri Jul 05 17:12:11 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tab_repetition
     *
     * @mbg.generated Fri Jul 05 17:12:11 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tab_repetition
     *
     * @mbg.generated Fri Jul 05 17:12:11 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_repetition
     *
     * @mbg.generated Fri Jul 05 17:12:11 CST 2019
     */
    public RepetitionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_repetition
     *
     * @mbg.generated Fri Jul 05 17:12:11 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_repetition
     *
     * @mbg.generated Fri Jul 05 17:12:11 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_repetition
     *
     * @mbg.generated Fri Jul 05 17:12:11 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_repetition
     *
     * @mbg.generated Fri Jul 05 17:12:11 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_repetition
     *
     * @mbg.generated Fri Jul 05 17:12:11 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_repetition
     *
     * @mbg.generated Fri Jul 05 17:12:11 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_repetition
     *
     * @mbg.generated Fri Jul 05 17:12:11 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_repetition
     *
     * @mbg.generated Fri Jul 05 17:12:11 CST 2019
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
     * This method corresponds to the database table tab_repetition
     *
     * @mbg.generated Fri Jul 05 17:12:11 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_repetition
     *
     * @mbg.generated Fri Jul 05 17:12:11 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tab_repetition
     *
     * @mbg.generated Fri Jul 05 17:12:11 CST 2019
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andRidIsNull() {
            addCriterion("rid is null");
            return (Criteria) this;
        }

        public Criteria andRidIsNotNull() {
            addCriterion("rid is not null");
            return (Criteria) this;
        }

        public Criteria andRidEqualTo(Integer value) {
            addCriterion("rid =", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotEqualTo(Integer value) {
            addCriterion("rid <>", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThan(Integer value) {
            addCriterion("rid >", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rid >=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThan(Integer value) {
            addCriterion("rid <", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThanOrEqualTo(Integer value) {
            addCriterion("rid <=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidIn(List<Integer> values) {
            addCriterion("rid in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotIn(List<Integer> values) {
            addCriterion("rid not in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidBetween(Integer value1, Integer value2) {
            addCriterion("rid between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotBetween(Integer value1, Integer value2) {
            addCriterion("rid not between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRepetitionIsNull() {
            addCriterion("repetition is null");
            return (Criteria) this;
        }

        public Criteria andRepetitionIsNotNull() {
            addCriterion("repetition is not null");
            return (Criteria) this;
        }

        public Criteria andRepetitionEqualTo(String value) {
            addCriterion("repetition =", value, "repetition");
            return (Criteria) this;
        }

        public Criteria andRepetitionNotEqualTo(String value) {
            addCriterion("repetition <>", value, "repetition");
            return (Criteria) this;
        }

        public Criteria andRepetitionGreaterThan(String value) {
            addCriterion("repetition >", value, "repetition");
            return (Criteria) this;
        }

        public Criteria andRepetitionGreaterThanOrEqualTo(String value) {
            addCriterion("repetition >=", value, "repetition");
            return (Criteria) this;
        }

        public Criteria andRepetitionLessThan(String value) {
            addCriterion("repetition <", value, "repetition");
            return (Criteria) this;
        }

        public Criteria andRepetitionLessThanOrEqualTo(String value) {
            addCriterion("repetition <=", value, "repetition");
            return (Criteria) this;
        }

        public Criteria andRepetitionLike(String value) {
            addCriterion("repetition like", value, "repetition");
            return (Criteria) this;
        }

        public Criteria andRepetitionNotLike(String value) {
            addCriterion("repetition not like", value, "repetition");
            return (Criteria) this;
        }

        public Criteria andRepetitionIn(List<String> values) {
            addCriterion("repetition in", values, "repetition");
            return (Criteria) this;
        }

        public Criteria andRepetitionNotIn(List<String> values) {
            addCriterion("repetition not in", values, "repetition");
            return (Criteria) this;
        }

        public Criteria andRepetitionBetween(String value1, String value2) {
            addCriterion("repetition between", value1, value2, "repetition");
            return (Criteria) this;
        }

        public Criteria andRepetitionNotBetween(String value1, String value2) {
            addCriterion("repetition not between", value1, value2, "repetition");
            return (Criteria) this;
        }

        public Criteria andAdddateIsNull() {
            addCriterion("adddate is null");
            return (Criteria) this;
        }

        public Criteria andAdddateIsNotNull() {
            addCriterion("adddate is not null");
            return (Criteria) this;
        }

        public Criteria andAdddateEqualTo(Date value) {
            addCriterion("adddate =", value, "adddate");
            return (Criteria) this;
        }

        public Criteria andAdddateNotEqualTo(Date value) {
            addCriterion("adddate <>", value, "adddate");
            return (Criteria) this;
        }

        public Criteria andAdddateGreaterThan(Date value) {
            addCriterion("adddate >", value, "adddate");
            return (Criteria) this;
        }

        public Criteria andAdddateGreaterThanOrEqualTo(Date value) {
            addCriterion("adddate >=", value, "adddate");
            return (Criteria) this;
        }

        public Criteria andAdddateLessThan(Date value) {
            addCriterion("adddate <", value, "adddate");
            return (Criteria) this;
        }

        public Criteria andAdddateLessThanOrEqualTo(Date value) {
            addCriterion("adddate <=", value, "adddate");
            return (Criteria) this;
        }

        public Criteria andAdddateIn(List<Date> values) {
            addCriterion("adddate in", values, "adddate");
            return (Criteria) this;
        }

        public Criteria andAdddateNotIn(List<Date> values) {
            addCriterion("adddate not in", values, "adddate");
            return (Criteria) this;
        }

        public Criteria andAdddateBetween(Date value1, Date value2) {
            addCriterion("adddate between", value1, value2, "adddate");
            return (Criteria) this;
        }

        public Criteria andAdddateNotBetween(Date value1, Date value2) {
            addCriterion("adddate not between", value1, value2, "adddate");
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

        public Criteria andOlddateIsNull() {
            addCriterion("olddate is null");
            return (Criteria) this;
        }

        public Criteria andOlddateIsNotNull() {
            addCriterion("olddate is not null");
            return (Criteria) this;
        }

        public Criteria andOlddateEqualTo(Date value) {
            addCriterionForJDBCDate("olddate =", value, "olddate");
            return (Criteria) this;
        }

        public Criteria andOlddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("olddate <>", value, "olddate");
            return (Criteria) this;
        }

        public Criteria andOlddateGreaterThan(Date value) {
            addCriterionForJDBCDate("olddate >", value, "olddate");
            return (Criteria) this;
        }

        public Criteria andOlddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("olddate >=", value, "olddate");
            return (Criteria) this;
        }

        public Criteria andOlddateLessThan(Date value) {
            addCriterionForJDBCDate("olddate <", value, "olddate");
            return (Criteria) this;
        }

        public Criteria andOlddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("olddate <=", value, "olddate");
            return (Criteria) this;
        }

        public Criteria andOlddateIn(List<Date> values) {
            addCriterionForJDBCDate("olddate in", values, "olddate");
            return (Criteria) this;
        }

        public Criteria andOlddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("olddate not in", values, "olddate");
            return (Criteria) this;
        }

        public Criteria andOlddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("olddate between", value1, value2, "olddate");
            return (Criteria) this;
        }

        public Criteria andOlddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("olddate not between", value1, value2, "olddate");
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
     * This class corresponds to the database table tab_repetition
     *
     * @mbg.generated do_not_delete_during_merge Fri Jul 05 17:12:11 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tab_repetition
     *
     * @mbg.generated Fri Jul 05 17:12:11 CST 2019
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