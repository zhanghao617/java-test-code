package com.haoyukeji.entity;

import java.util.ArrayList;
import java.util.List;

public class MoviesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MoviesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andDirectIsNull() {
            addCriterion("direct is null");
            return (Criteria) this;
        }

        public Criteria andDirectIsNotNull() {
            addCriterion("direct is not null");
            return (Criteria) this;
        }

        public Criteria andDirectEqualTo(String value) {
            addCriterion("direct =", value, "direct");
            return (Criteria) this;
        }

        public Criteria andDirectNotEqualTo(String value) {
            addCriterion("direct <>", value, "direct");
            return (Criteria) this;
        }

        public Criteria andDirectGreaterThan(String value) {
            addCriterion("direct >", value, "direct");
            return (Criteria) this;
        }

        public Criteria andDirectGreaterThanOrEqualTo(String value) {
            addCriterion("direct >=", value, "direct");
            return (Criteria) this;
        }

        public Criteria andDirectLessThan(String value) {
            addCriterion("direct <", value, "direct");
            return (Criteria) this;
        }

        public Criteria andDirectLessThanOrEqualTo(String value) {
            addCriterion("direct <=", value, "direct");
            return (Criteria) this;
        }

        public Criteria andDirectLike(String value) {
            addCriterion("direct like", value, "direct");
            return (Criteria) this;
        }

        public Criteria andDirectNotLike(String value) {
            addCriterion("direct not like", value, "direct");
            return (Criteria) this;
        }

        public Criteria andDirectIn(List<String> values) {
            addCriterion("direct in", values, "direct");
            return (Criteria) this;
        }

        public Criteria andDirectNotIn(List<String> values) {
            addCriterion("direct not in", values, "direct");
            return (Criteria) this;
        }

        public Criteria andDirectBetween(String value1, String value2) {
            addCriterion("direct between", value1, value2, "direct");
            return (Criteria) this;
        }

        public Criteria andDirectNotBetween(String value1, String value2) {
            addCriterion("direct not between", value1, value2, "direct");
            return (Criteria) this;
        }

        public Criteria andCreateTimeYearIsNull() {
            addCriterion("create_time_year is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeYearIsNotNull() {
            addCriterion("create_time_year is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeYearEqualTo(String value) {
            addCriterion("create_time_year =", value, "createTimeYear");
            return (Criteria) this;
        }

        public Criteria andCreateTimeYearNotEqualTo(String value) {
            addCriterion("create_time_year <>", value, "createTimeYear");
            return (Criteria) this;
        }

        public Criteria andCreateTimeYearGreaterThan(String value) {
            addCriterion("create_time_year >", value, "createTimeYear");
            return (Criteria) this;
        }

        public Criteria andCreateTimeYearGreaterThanOrEqualTo(String value) {
            addCriterion("create_time_year >=", value, "createTimeYear");
            return (Criteria) this;
        }

        public Criteria andCreateTimeYearLessThan(String value) {
            addCriterion("create_time_year <", value, "createTimeYear");
            return (Criteria) this;
        }

        public Criteria andCreateTimeYearLessThanOrEqualTo(String value) {
            addCriterion("create_time_year <=", value, "createTimeYear");
            return (Criteria) this;
        }

        public Criteria andCreateTimeYearLike(String value) {
            addCriterion("create_time_year like", value, "createTimeYear");
            return (Criteria) this;
        }

        public Criteria andCreateTimeYearNotLike(String value) {
            addCriterion("create_time_year not like", value, "createTimeYear");
            return (Criteria) this;
        }

        public Criteria andCreateTimeYearIn(List<String> values) {
            addCriterion("create_time_year in", values, "createTimeYear");
            return (Criteria) this;
        }

        public Criteria andCreateTimeYearNotIn(List<String> values) {
            addCriterion("create_time_year not in", values, "createTimeYear");
            return (Criteria) this;
        }

        public Criteria andCreateTimeYearBetween(String value1, String value2) {
            addCriterion("create_time_year between", value1, value2, "createTimeYear");
            return (Criteria) this;
        }

        public Criteria andCreateTimeYearNotBetween(String value1, String value2) {
            addCriterion("create_time_year not between", value1, value2, "createTimeYear");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeIsNull() {
            addCriterion("release_time is null");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeIsNotNull() {
            addCriterion("release_time is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeEqualTo(String value) {
            addCriterion("release_time =", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeNotEqualTo(String value) {
            addCriterion("release_time <>", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeGreaterThan(String value) {
            addCriterion("release_time >", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeGreaterThanOrEqualTo(String value) {
            addCriterion("release_time >=", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeLessThan(String value) {
            addCriterion("release_time <", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeLessThanOrEqualTo(String value) {
            addCriterion("release_time <=", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeLike(String value) {
            addCriterion("release_time like", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeNotLike(String value) {
            addCriterion("release_time not like", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeIn(List<String> values) {
            addCriterion("release_time in", values, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeNotIn(List<String> values) {
            addCriterion("release_time not in", values, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeBetween(String value1, String value2) {
            addCriterion("release_time between", value1, value2, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeNotBetween(String value1, String value2) {
            addCriterion("release_time not between", value1, value2, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andDocIsNull() {
            addCriterion("doc is null");
            return (Criteria) this;
        }

        public Criteria andDocIsNotNull() {
            addCriterion("doc is not null");
            return (Criteria) this;
        }

        public Criteria andDocEqualTo(String value) {
            addCriterion("doc =", value, "doc");
            return (Criteria) this;
        }

        public Criteria andDocNotEqualTo(String value) {
            addCriterion("doc <>", value, "doc");
            return (Criteria) this;
        }

        public Criteria andDocGreaterThan(String value) {
            addCriterion("doc >", value, "doc");
            return (Criteria) this;
        }

        public Criteria andDocGreaterThanOrEqualTo(String value) {
            addCriterion("doc >=", value, "doc");
            return (Criteria) this;
        }

        public Criteria andDocLessThan(String value) {
            addCriterion("doc <", value, "doc");
            return (Criteria) this;
        }

        public Criteria andDocLessThanOrEqualTo(String value) {
            addCriterion("doc <=", value, "doc");
            return (Criteria) this;
        }

        public Criteria andDocLike(String value) {
            addCriterion("doc like", value, "doc");
            return (Criteria) this;
        }

        public Criteria andDocNotLike(String value) {
            addCriterion("doc not like", value, "doc");
            return (Criteria) this;
        }

        public Criteria andDocIn(List<String> values) {
            addCriterion("doc in", values, "doc");
            return (Criteria) this;
        }

        public Criteria andDocNotIn(List<String> values) {
            addCriterion("doc not in", values, "doc");
            return (Criteria) this;
        }

        public Criteria andDocBetween(String value1, String value2) {
            addCriterion("doc between", value1, value2, "doc");
            return (Criteria) this;
        }

        public Criteria andDocNotBetween(String value1, String value2) {
            addCriterion("doc not between", value1, value2, "doc");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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