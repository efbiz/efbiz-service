package org.efbiz.product.price.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuantityBreakExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public QuantityBreakExample() {
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

    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    public int getLimitStart() {
        return limitStart;
    }

    public void setPageSize(int pageSize) {
        this.pageSize=pageSize;
    }

    public int getPageSize() {
        return pageSize;
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

        public Criteria andQuantityBreakIdIsNull() {
            addCriterion("QUANTITY_BREAK_ID is null");
            return (Criteria) this;
        }

        public Criteria andQuantityBreakIdIsNotNull() {
            addCriterion("QUANTITY_BREAK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityBreakIdEqualTo(String value) {
            addCriterion("QUANTITY_BREAK_ID =", value, "quantityBreakId");
            return (Criteria) this;
        }

        public Criteria andQuantityBreakIdNotEqualTo(String value) {
            addCriterion("QUANTITY_BREAK_ID <>", value, "quantityBreakId");
            return (Criteria) this;
        }

        public Criteria andQuantityBreakIdGreaterThan(String value) {
            addCriterion("QUANTITY_BREAK_ID >", value, "quantityBreakId");
            return (Criteria) this;
        }

        public Criteria andQuantityBreakIdGreaterThanOrEqualTo(String value) {
            addCriterion("QUANTITY_BREAK_ID >=", value, "quantityBreakId");
            return (Criteria) this;
        }

        public Criteria andQuantityBreakIdLessThan(String value) {
            addCriterion("QUANTITY_BREAK_ID <", value, "quantityBreakId");
            return (Criteria) this;
        }

        public Criteria andQuantityBreakIdLessThanOrEqualTo(String value) {
            addCriterion("QUANTITY_BREAK_ID <=", value, "quantityBreakId");
            return (Criteria) this;
        }

        public Criteria andQuantityBreakIdLike(String value) {
            addCriterion("QUANTITY_BREAK_ID like", value, "quantityBreakId");
            return (Criteria) this;
        }

        public Criteria andQuantityBreakIdNotLike(String value) {
            addCriterion("QUANTITY_BREAK_ID not like", value, "quantityBreakId");
            return (Criteria) this;
        }

        public Criteria andQuantityBreakIdIn(List<String> values) {
            addCriterion("QUANTITY_BREAK_ID in", values, "quantityBreakId");
            return (Criteria) this;
        }

        public Criteria andQuantityBreakIdNotIn(List<String> values) {
            addCriterion("QUANTITY_BREAK_ID not in", values, "quantityBreakId");
            return (Criteria) this;
        }

        public Criteria andQuantityBreakIdBetween(String value1, String value2) {
            addCriterion("QUANTITY_BREAK_ID between", value1, value2, "quantityBreakId");
            return (Criteria) this;
        }

        public Criteria andQuantityBreakIdNotBetween(String value1, String value2) {
            addCriterion("QUANTITY_BREAK_ID not between", value1, value2, "quantityBreakId");
            return (Criteria) this;
        }

        public Criteria andQuantityBreakTypeIdIsNull() {
            addCriterion("QUANTITY_BREAK_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andQuantityBreakTypeIdIsNotNull() {
            addCriterion("QUANTITY_BREAK_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityBreakTypeIdEqualTo(String value) {
            addCriterion("QUANTITY_BREAK_TYPE_ID =", value, "quantityBreakTypeId");
            return (Criteria) this;
        }

        public Criteria andQuantityBreakTypeIdNotEqualTo(String value) {
            addCriterion("QUANTITY_BREAK_TYPE_ID <>", value, "quantityBreakTypeId");
            return (Criteria) this;
        }

        public Criteria andQuantityBreakTypeIdGreaterThan(String value) {
            addCriterion("QUANTITY_BREAK_TYPE_ID >", value, "quantityBreakTypeId");
            return (Criteria) this;
        }

        public Criteria andQuantityBreakTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("QUANTITY_BREAK_TYPE_ID >=", value, "quantityBreakTypeId");
            return (Criteria) this;
        }

        public Criteria andQuantityBreakTypeIdLessThan(String value) {
            addCriterion("QUANTITY_BREAK_TYPE_ID <", value, "quantityBreakTypeId");
            return (Criteria) this;
        }

        public Criteria andQuantityBreakTypeIdLessThanOrEqualTo(String value) {
            addCriterion("QUANTITY_BREAK_TYPE_ID <=", value, "quantityBreakTypeId");
            return (Criteria) this;
        }

        public Criteria andQuantityBreakTypeIdLike(String value) {
            addCriterion("QUANTITY_BREAK_TYPE_ID like", value, "quantityBreakTypeId");
            return (Criteria) this;
        }

        public Criteria andQuantityBreakTypeIdNotLike(String value) {
            addCriterion("QUANTITY_BREAK_TYPE_ID not like", value, "quantityBreakTypeId");
            return (Criteria) this;
        }

        public Criteria andQuantityBreakTypeIdIn(List<String> values) {
            addCriterion("QUANTITY_BREAK_TYPE_ID in", values, "quantityBreakTypeId");
            return (Criteria) this;
        }

        public Criteria andQuantityBreakTypeIdNotIn(List<String> values) {
            addCriterion("QUANTITY_BREAK_TYPE_ID not in", values, "quantityBreakTypeId");
            return (Criteria) this;
        }

        public Criteria andQuantityBreakTypeIdBetween(String value1, String value2) {
            addCriterion("QUANTITY_BREAK_TYPE_ID between", value1, value2, "quantityBreakTypeId");
            return (Criteria) this;
        }

        public Criteria andQuantityBreakTypeIdNotBetween(String value1, String value2) {
            addCriterion("QUANTITY_BREAK_TYPE_ID not between", value1, value2, "quantityBreakTypeId");
            return (Criteria) this;
        }

        public Criteria andFromQuantityIsNull() {
            addCriterion("FROM_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andFromQuantityIsNotNull() {
            addCriterion("FROM_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andFromQuantityEqualTo(BigDecimal value) {
            addCriterion("FROM_QUANTITY =", value, "fromQuantity");
            return (Criteria) this;
        }

        public Criteria andFromQuantityNotEqualTo(BigDecimal value) {
            addCriterion("FROM_QUANTITY <>", value, "fromQuantity");
            return (Criteria) this;
        }

        public Criteria andFromQuantityGreaterThan(BigDecimal value) {
            addCriterion("FROM_QUANTITY >", value, "fromQuantity");
            return (Criteria) this;
        }

        public Criteria andFromQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FROM_QUANTITY >=", value, "fromQuantity");
            return (Criteria) this;
        }

        public Criteria andFromQuantityLessThan(BigDecimal value) {
            addCriterion("FROM_QUANTITY <", value, "fromQuantity");
            return (Criteria) this;
        }

        public Criteria andFromQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FROM_QUANTITY <=", value, "fromQuantity");
            return (Criteria) this;
        }

        public Criteria andFromQuantityIn(List<BigDecimal> values) {
            addCriterion("FROM_QUANTITY in", values, "fromQuantity");
            return (Criteria) this;
        }

        public Criteria andFromQuantityNotIn(List<BigDecimal> values) {
            addCriterion("FROM_QUANTITY not in", values, "fromQuantity");
            return (Criteria) this;
        }

        public Criteria andFromQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FROM_QUANTITY between", value1, value2, "fromQuantity");
            return (Criteria) this;
        }

        public Criteria andFromQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FROM_QUANTITY not between", value1, value2, "fromQuantity");
            return (Criteria) this;
        }

        public Criteria andThruQuantityIsNull() {
            addCriterion("THRU_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andThruQuantityIsNotNull() {
            addCriterion("THRU_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andThruQuantityEqualTo(BigDecimal value) {
            addCriterion("THRU_QUANTITY =", value, "thruQuantity");
            return (Criteria) this;
        }

        public Criteria andThruQuantityNotEqualTo(BigDecimal value) {
            addCriterion("THRU_QUANTITY <>", value, "thruQuantity");
            return (Criteria) this;
        }

        public Criteria andThruQuantityGreaterThan(BigDecimal value) {
            addCriterion("THRU_QUANTITY >", value, "thruQuantity");
            return (Criteria) this;
        }

        public Criteria andThruQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("THRU_QUANTITY >=", value, "thruQuantity");
            return (Criteria) this;
        }

        public Criteria andThruQuantityLessThan(BigDecimal value) {
            addCriterion("THRU_QUANTITY <", value, "thruQuantity");
            return (Criteria) this;
        }

        public Criteria andThruQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("THRU_QUANTITY <=", value, "thruQuantity");
            return (Criteria) this;
        }

        public Criteria andThruQuantityIn(List<BigDecimal> values) {
            addCriterion("THRU_QUANTITY in", values, "thruQuantity");
            return (Criteria) this;
        }

        public Criteria andThruQuantityNotIn(List<BigDecimal> values) {
            addCriterion("THRU_QUANTITY not in", values, "thruQuantity");
            return (Criteria) this;
        }

        public Criteria andThruQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("THRU_QUANTITY between", value1, value2, "thruQuantity");
            return (Criteria) this;
        }

        public Criteria andThruQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("THRU_QUANTITY not between", value1, value2, "thruQuantity");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampIsNull() {
            addCriterion("LAST_UPDATED_STAMP is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampIsNotNull() {
            addCriterion("LAST_UPDATED_STAMP is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampEqualTo(Date value) {
            addCriterion("LAST_UPDATED_STAMP =", value, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampNotEqualTo(Date value) {
            addCriterion("LAST_UPDATED_STAMP <>", value, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampGreaterThan(Date value) {
            addCriterion("LAST_UPDATED_STAMP >", value, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATED_STAMP >=", value, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampLessThan(Date value) {
            addCriterion("LAST_UPDATED_STAMP <", value, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampLessThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATED_STAMP <=", value, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampIn(List<Date> values) {
            addCriterion("LAST_UPDATED_STAMP in", values, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampNotIn(List<Date> values) {
            addCriterion("LAST_UPDATED_STAMP not in", values, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATED_STAMP between", value1, value2, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampNotBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATED_STAMP not between", value1, value2, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampIsNull() {
            addCriterion("LAST_UPDATED_TX_STAMP is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampIsNotNull() {
            addCriterion("LAST_UPDATED_TX_STAMP is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampEqualTo(Date value) {
            addCriterion("LAST_UPDATED_TX_STAMP =", value, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampNotEqualTo(Date value) {
            addCriterion("LAST_UPDATED_TX_STAMP <>", value, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampGreaterThan(Date value) {
            addCriterion("LAST_UPDATED_TX_STAMP >", value, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATED_TX_STAMP >=", value, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampLessThan(Date value) {
            addCriterion("LAST_UPDATED_TX_STAMP <", value, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampLessThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATED_TX_STAMP <=", value, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampIn(List<Date> values) {
            addCriterion("LAST_UPDATED_TX_STAMP in", values, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampNotIn(List<Date> values) {
            addCriterion("LAST_UPDATED_TX_STAMP not in", values, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATED_TX_STAMP between", value1, value2, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampNotBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATED_TX_STAMP not between", value1, value2, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampIsNull() {
            addCriterion("CREATED_STAMP is null");
            return (Criteria) this;
        }

        public Criteria andCreatedStampIsNotNull() {
            addCriterion("CREATED_STAMP is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedStampEqualTo(Date value) {
            addCriterion("CREATED_STAMP =", value, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampNotEqualTo(Date value) {
            addCriterion("CREATED_STAMP <>", value, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampGreaterThan(Date value) {
            addCriterion("CREATED_STAMP >", value, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED_STAMP >=", value, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampLessThan(Date value) {
            addCriterion("CREATED_STAMP <", value, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampLessThanOrEqualTo(Date value) {
            addCriterion("CREATED_STAMP <=", value, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampIn(List<Date> values) {
            addCriterion("CREATED_STAMP in", values, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampNotIn(List<Date> values) {
            addCriterion("CREATED_STAMP not in", values, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampBetween(Date value1, Date value2) {
            addCriterion("CREATED_STAMP between", value1, value2, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampNotBetween(Date value1, Date value2) {
            addCriterion("CREATED_STAMP not between", value1, value2, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampIsNull() {
            addCriterion("CREATED_TX_STAMP is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampIsNotNull() {
            addCriterion("CREATED_TX_STAMP is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampEqualTo(Date value) {
            addCriterion("CREATED_TX_STAMP =", value, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampNotEqualTo(Date value) {
            addCriterion("CREATED_TX_STAMP <>", value, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampGreaterThan(Date value) {
            addCriterion("CREATED_TX_STAMP >", value, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED_TX_STAMP >=", value, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampLessThan(Date value) {
            addCriterion("CREATED_TX_STAMP <", value, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampLessThanOrEqualTo(Date value) {
            addCriterion("CREATED_TX_STAMP <=", value, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampIn(List<Date> values) {
            addCriterion("CREATED_TX_STAMP in", values, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampNotIn(List<Date> values) {
            addCriterion("CREATED_TX_STAMP not in", values, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampBetween(Date value1, Date value2) {
            addCriterion("CREATED_TX_STAMP between", value1, value2, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampNotBetween(Date value1, Date value2) {
            addCriterion("CREATED_TX_STAMP not between", value1, value2, "createdTxStamp");
            return (Criteria) this;
        }
    }

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