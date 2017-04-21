package org.efbiz.product.subscription.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductSubscriptionResourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public ProductSubscriptionResourceExample() {
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

        public Criteria andProductIdIsNull() {
            addCriterion("PRODUCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("PRODUCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(String value) {
            addCriterion("PRODUCT_ID =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(String value) {
            addCriterion("PRODUCT_ID <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(String value) {
            addCriterion("PRODUCT_ID >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_ID >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(String value) {
            addCriterion("PRODUCT_ID <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_ID <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLike(String value) {
            addCriterion("PRODUCT_ID like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotLike(String value) {
            addCriterion("PRODUCT_ID not like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<String> values) {
            addCriterion("PRODUCT_ID in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<String> values) {
            addCriterion("PRODUCT_ID not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_ID between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_ID not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andSubscriptionResourceIdIsNull() {
            addCriterion("SUBSCRIPTION_RESOURCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andSubscriptionResourceIdIsNotNull() {
            addCriterion("SUBSCRIPTION_RESOURCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSubscriptionResourceIdEqualTo(String value) {
            addCriterion("SUBSCRIPTION_RESOURCE_ID =", value, "subscriptionResourceId");
            return (Criteria) this;
        }

        public Criteria andSubscriptionResourceIdNotEqualTo(String value) {
            addCriterion("SUBSCRIPTION_RESOURCE_ID <>", value, "subscriptionResourceId");
            return (Criteria) this;
        }

        public Criteria andSubscriptionResourceIdGreaterThan(String value) {
            addCriterion("SUBSCRIPTION_RESOURCE_ID >", value, "subscriptionResourceId");
            return (Criteria) this;
        }

        public Criteria andSubscriptionResourceIdGreaterThanOrEqualTo(String value) {
            addCriterion("SUBSCRIPTION_RESOURCE_ID >=", value, "subscriptionResourceId");
            return (Criteria) this;
        }

        public Criteria andSubscriptionResourceIdLessThan(String value) {
            addCriterion("SUBSCRIPTION_RESOURCE_ID <", value, "subscriptionResourceId");
            return (Criteria) this;
        }

        public Criteria andSubscriptionResourceIdLessThanOrEqualTo(String value) {
            addCriterion("SUBSCRIPTION_RESOURCE_ID <=", value, "subscriptionResourceId");
            return (Criteria) this;
        }

        public Criteria andSubscriptionResourceIdLike(String value) {
            addCriterion("SUBSCRIPTION_RESOURCE_ID like", value, "subscriptionResourceId");
            return (Criteria) this;
        }

        public Criteria andSubscriptionResourceIdNotLike(String value) {
            addCriterion("SUBSCRIPTION_RESOURCE_ID not like", value, "subscriptionResourceId");
            return (Criteria) this;
        }

        public Criteria andSubscriptionResourceIdIn(List<String> values) {
            addCriterion("SUBSCRIPTION_RESOURCE_ID in", values, "subscriptionResourceId");
            return (Criteria) this;
        }

        public Criteria andSubscriptionResourceIdNotIn(List<String> values) {
            addCriterion("SUBSCRIPTION_RESOURCE_ID not in", values, "subscriptionResourceId");
            return (Criteria) this;
        }

        public Criteria andSubscriptionResourceIdBetween(String value1, String value2) {
            addCriterion("SUBSCRIPTION_RESOURCE_ID between", value1, value2, "subscriptionResourceId");
            return (Criteria) this;
        }

        public Criteria andSubscriptionResourceIdNotBetween(String value1, String value2) {
            addCriterion("SUBSCRIPTION_RESOURCE_ID not between", value1, value2, "subscriptionResourceId");
            return (Criteria) this;
        }

        public Criteria andFromDateIsNull() {
            addCriterion("FROM_DATE is null");
            return (Criteria) this;
        }

        public Criteria andFromDateIsNotNull() {
            addCriterion("FROM_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andFromDateEqualTo(Date value) {
            addCriterion("FROM_DATE =", value, "fromDate");
            return (Criteria) this;
        }

        public Criteria andFromDateNotEqualTo(Date value) {
            addCriterion("FROM_DATE <>", value, "fromDate");
            return (Criteria) this;
        }

        public Criteria andFromDateGreaterThan(Date value) {
            addCriterion("FROM_DATE >", value, "fromDate");
            return (Criteria) this;
        }

        public Criteria andFromDateGreaterThanOrEqualTo(Date value) {
            addCriterion("FROM_DATE >=", value, "fromDate");
            return (Criteria) this;
        }

        public Criteria andFromDateLessThan(Date value) {
            addCriterion("FROM_DATE <", value, "fromDate");
            return (Criteria) this;
        }

        public Criteria andFromDateLessThanOrEqualTo(Date value) {
            addCriterion("FROM_DATE <=", value, "fromDate");
            return (Criteria) this;
        }

        public Criteria andFromDateIn(List<Date> values) {
            addCriterion("FROM_DATE in", values, "fromDate");
            return (Criteria) this;
        }

        public Criteria andFromDateNotIn(List<Date> values) {
            addCriterion("FROM_DATE not in", values, "fromDate");
            return (Criteria) this;
        }

        public Criteria andFromDateBetween(Date value1, Date value2) {
            addCriterion("FROM_DATE between", value1, value2, "fromDate");
            return (Criteria) this;
        }

        public Criteria andFromDateNotBetween(Date value1, Date value2) {
            addCriterion("FROM_DATE not between", value1, value2, "fromDate");
            return (Criteria) this;
        }

        public Criteria andThruDateIsNull() {
            addCriterion("THRU_DATE is null");
            return (Criteria) this;
        }

        public Criteria andThruDateIsNotNull() {
            addCriterion("THRU_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andThruDateEqualTo(Date value) {
            addCriterion("THRU_DATE =", value, "thruDate");
            return (Criteria) this;
        }

        public Criteria andThruDateNotEqualTo(Date value) {
            addCriterion("THRU_DATE <>", value, "thruDate");
            return (Criteria) this;
        }

        public Criteria andThruDateGreaterThan(Date value) {
            addCriterion("THRU_DATE >", value, "thruDate");
            return (Criteria) this;
        }

        public Criteria andThruDateGreaterThanOrEqualTo(Date value) {
            addCriterion("THRU_DATE >=", value, "thruDate");
            return (Criteria) this;
        }

        public Criteria andThruDateLessThan(Date value) {
            addCriterion("THRU_DATE <", value, "thruDate");
            return (Criteria) this;
        }

        public Criteria andThruDateLessThanOrEqualTo(Date value) {
            addCriterion("THRU_DATE <=", value, "thruDate");
            return (Criteria) this;
        }

        public Criteria andThruDateIn(List<Date> values) {
            addCriterion("THRU_DATE in", values, "thruDate");
            return (Criteria) this;
        }

        public Criteria andThruDateNotIn(List<Date> values) {
            addCriterion("THRU_DATE not in", values, "thruDate");
            return (Criteria) this;
        }

        public Criteria andThruDateBetween(Date value1, Date value2) {
            addCriterion("THRU_DATE between", value1, value2, "thruDate");
            return (Criteria) this;
        }

        public Criteria andThruDateNotBetween(Date value1, Date value2) {
            addCriterion("THRU_DATE not between", value1, value2, "thruDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseFromDateIsNull() {
            addCriterion("PURCHASE_FROM_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseFromDateIsNotNull() {
            addCriterion("PURCHASE_FROM_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseFromDateEqualTo(Date value) {
            addCriterion("PURCHASE_FROM_DATE =", value, "purchaseFromDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseFromDateNotEqualTo(Date value) {
            addCriterion("PURCHASE_FROM_DATE <>", value, "purchaseFromDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseFromDateGreaterThan(Date value) {
            addCriterion("PURCHASE_FROM_DATE >", value, "purchaseFromDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseFromDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PURCHASE_FROM_DATE >=", value, "purchaseFromDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseFromDateLessThan(Date value) {
            addCriterion("PURCHASE_FROM_DATE <", value, "purchaseFromDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseFromDateLessThanOrEqualTo(Date value) {
            addCriterion("PURCHASE_FROM_DATE <=", value, "purchaseFromDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseFromDateIn(List<Date> values) {
            addCriterion("PURCHASE_FROM_DATE in", values, "purchaseFromDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseFromDateNotIn(List<Date> values) {
            addCriterion("PURCHASE_FROM_DATE not in", values, "purchaseFromDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseFromDateBetween(Date value1, Date value2) {
            addCriterion("PURCHASE_FROM_DATE between", value1, value2, "purchaseFromDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseFromDateNotBetween(Date value1, Date value2) {
            addCriterion("PURCHASE_FROM_DATE not between", value1, value2, "purchaseFromDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseThruDateIsNull() {
            addCriterion("PURCHASE_THRU_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseThruDateIsNotNull() {
            addCriterion("PURCHASE_THRU_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseThruDateEqualTo(Date value) {
            addCriterion("PURCHASE_THRU_DATE =", value, "purchaseThruDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseThruDateNotEqualTo(Date value) {
            addCriterion("PURCHASE_THRU_DATE <>", value, "purchaseThruDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseThruDateGreaterThan(Date value) {
            addCriterion("PURCHASE_THRU_DATE >", value, "purchaseThruDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseThruDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PURCHASE_THRU_DATE >=", value, "purchaseThruDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseThruDateLessThan(Date value) {
            addCriterion("PURCHASE_THRU_DATE <", value, "purchaseThruDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseThruDateLessThanOrEqualTo(Date value) {
            addCriterion("PURCHASE_THRU_DATE <=", value, "purchaseThruDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseThruDateIn(List<Date> values) {
            addCriterion("PURCHASE_THRU_DATE in", values, "purchaseThruDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseThruDateNotIn(List<Date> values) {
            addCriterion("PURCHASE_THRU_DATE not in", values, "purchaseThruDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseThruDateBetween(Date value1, Date value2) {
            addCriterion("PURCHASE_THRU_DATE between", value1, value2, "purchaseThruDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseThruDateNotBetween(Date value1, Date value2) {
            addCriterion("PURCHASE_THRU_DATE not between", value1, value2, "purchaseThruDate");
            return (Criteria) this;
        }

        public Criteria andMaxLifeTimeIsNull() {
            addCriterion("MAX_LIFE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andMaxLifeTimeIsNotNull() {
            addCriterion("MAX_LIFE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andMaxLifeTimeEqualTo(BigDecimal value) {
            addCriterion("MAX_LIFE_TIME =", value, "maxLifeTime");
            return (Criteria) this;
        }

        public Criteria andMaxLifeTimeNotEqualTo(BigDecimal value) {
            addCriterion("MAX_LIFE_TIME <>", value, "maxLifeTime");
            return (Criteria) this;
        }

        public Criteria andMaxLifeTimeGreaterThan(BigDecimal value) {
            addCriterion("MAX_LIFE_TIME >", value, "maxLifeTime");
            return (Criteria) this;
        }

        public Criteria andMaxLifeTimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MAX_LIFE_TIME >=", value, "maxLifeTime");
            return (Criteria) this;
        }

        public Criteria andMaxLifeTimeLessThan(BigDecimal value) {
            addCriterion("MAX_LIFE_TIME <", value, "maxLifeTime");
            return (Criteria) this;
        }

        public Criteria andMaxLifeTimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MAX_LIFE_TIME <=", value, "maxLifeTime");
            return (Criteria) this;
        }

        public Criteria andMaxLifeTimeIn(List<BigDecimal> values) {
            addCriterion("MAX_LIFE_TIME in", values, "maxLifeTime");
            return (Criteria) this;
        }

        public Criteria andMaxLifeTimeNotIn(List<BigDecimal> values) {
            addCriterion("MAX_LIFE_TIME not in", values, "maxLifeTime");
            return (Criteria) this;
        }

        public Criteria andMaxLifeTimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAX_LIFE_TIME between", value1, value2, "maxLifeTime");
            return (Criteria) this;
        }

        public Criteria andMaxLifeTimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAX_LIFE_TIME not between", value1, value2, "maxLifeTime");
            return (Criteria) this;
        }

        public Criteria andMaxLifeTimeUomIdIsNull() {
            addCriterion("MAX_LIFE_TIME_UOM_ID is null");
            return (Criteria) this;
        }

        public Criteria andMaxLifeTimeUomIdIsNotNull() {
            addCriterion("MAX_LIFE_TIME_UOM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMaxLifeTimeUomIdEqualTo(String value) {
            addCriterion("MAX_LIFE_TIME_UOM_ID =", value, "maxLifeTimeUomId");
            return (Criteria) this;
        }

        public Criteria andMaxLifeTimeUomIdNotEqualTo(String value) {
            addCriterion("MAX_LIFE_TIME_UOM_ID <>", value, "maxLifeTimeUomId");
            return (Criteria) this;
        }

        public Criteria andMaxLifeTimeUomIdGreaterThan(String value) {
            addCriterion("MAX_LIFE_TIME_UOM_ID >", value, "maxLifeTimeUomId");
            return (Criteria) this;
        }

        public Criteria andMaxLifeTimeUomIdGreaterThanOrEqualTo(String value) {
            addCriterion("MAX_LIFE_TIME_UOM_ID >=", value, "maxLifeTimeUomId");
            return (Criteria) this;
        }

        public Criteria andMaxLifeTimeUomIdLessThan(String value) {
            addCriterion("MAX_LIFE_TIME_UOM_ID <", value, "maxLifeTimeUomId");
            return (Criteria) this;
        }

        public Criteria andMaxLifeTimeUomIdLessThanOrEqualTo(String value) {
            addCriterion("MAX_LIFE_TIME_UOM_ID <=", value, "maxLifeTimeUomId");
            return (Criteria) this;
        }

        public Criteria andMaxLifeTimeUomIdLike(String value) {
            addCriterion("MAX_LIFE_TIME_UOM_ID like", value, "maxLifeTimeUomId");
            return (Criteria) this;
        }

        public Criteria andMaxLifeTimeUomIdNotLike(String value) {
            addCriterion("MAX_LIFE_TIME_UOM_ID not like", value, "maxLifeTimeUomId");
            return (Criteria) this;
        }

        public Criteria andMaxLifeTimeUomIdIn(List<String> values) {
            addCriterion("MAX_LIFE_TIME_UOM_ID in", values, "maxLifeTimeUomId");
            return (Criteria) this;
        }

        public Criteria andMaxLifeTimeUomIdNotIn(List<String> values) {
            addCriterion("MAX_LIFE_TIME_UOM_ID not in", values, "maxLifeTimeUomId");
            return (Criteria) this;
        }

        public Criteria andMaxLifeTimeUomIdBetween(String value1, String value2) {
            addCriterion("MAX_LIFE_TIME_UOM_ID between", value1, value2, "maxLifeTimeUomId");
            return (Criteria) this;
        }

        public Criteria andMaxLifeTimeUomIdNotBetween(String value1, String value2) {
            addCriterion("MAX_LIFE_TIME_UOM_ID not between", value1, value2, "maxLifeTimeUomId");
            return (Criteria) this;
        }

        public Criteria andAvailableTimeIsNull() {
            addCriterion("AVAILABLE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAvailableTimeIsNotNull() {
            addCriterion("AVAILABLE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableTimeEqualTo(BigDecimal value) {
            addCriterion("AVAILABLE_TIME =", value, "availableTime");
            return (Criteria) this;
        }

        public Criteria andAvailableTimeNotEqualTo(BigDecimal value) {
            addCriterion("AVAILABLE_TIME <>", value, "availableTime");
            return (Criteria) this;
        }

        public Criteria andAvailableTimeGreaterThan(BigDecimal value) {
            addCriterion("AVAILABLE_TIME >", value, "availableTime");
            return (Criteria) this;
        }

        public Criteria andAvailableTimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AVAILABLE_TIME >=", value, "availableTime");
            return (Criteria) this;
        }

        public Criteria andAvailableTimeLessThan(BigDecimal value) {
            addCriterion("AVAILABLE_TIME <", value, "availableTime");
            return (Criteria) this;
        }

        public Criteria andAvailableTimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AVAILABLE_TIME <=", value, "availableTime");
            return (Criteria) this;
        }

        public Criteria andAvailableTimeIn(List<BigDecimal> values) {
            addCriterion("AVAILABLE_TIME in", values, "availableTime");
            return (Criteria) this;
        }

        public Criteria andAvailableTimeNotIn(List<BigDecimal> values) {
            addCriterion("AVAILABLE_TIME not in", values, "availableTime");
            return (Criteria) this;
        }

        public Criteria andAvailableTimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AVAILABLE_TIME between", value1, value2, "availableTime");
            return (Criteria) this;
        }

        public Criteria andAvailableTimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AVAILABLE_TIME not between", value1, value2, "availableTime");
            return (Criteria) this;
        }

        public Criteria andAvailableTimeUomIdIsNull() {
            addCriterion("AVAILABLE_TIME_UOM_ID is null");
            return (Criteria) this;
        }

        public Criteria andAvailableTimeUomIdIsNotNull() {
            addCriterion("AVAILABLE_TIME_UOM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableTimeUomIdEqualTo(String value) {
            addCriterion("AVAILABLE_TIME_UOM_ID =", value, "availableTimeUomId");
            return (Criteria) this;
        }

        public Criteria andAvailableTimeUomIdNotEqualTo(String value) {
            addCriterion("AVAILABLE_TIME_UOM_ID <>", value, "availableTimeUomId");
            return (Criteria) this;
        }

        public Criteria andAvailableTimeUomIdGreaterThan(String value) {
            addCriterion("AVAILABLE_TIME_UOM_ID >", value, "availableTimeUomId");
            return (Criteria) this;
        }

        public Criteria andAvailableTimeUomIdGreaterThanOrEqualTo(String value) {
            addCriterion("AVAILABLE_TIME_UOM_ID >=", value, "availableTimeUomId");
            return (Criteria) this;
        }

        public Criteria andAvailableTimeUomIdLessThan(String value) {
            addCriterion("AVAILABLE_TIME_UOM_ID <", value, "availableTimeUomId");
            return (Criteria) this;
        }

        public Criteria andAvailableTimeUomIdLessThanOrEqualTo(String value) {
            addCriterion("AVAILABLE_TIME_UOM_ID <=", value, "availableTimeUomId");
            return (Criteria) this;
        }

        public Criteria andAvailableTimeUomIdLike(String value) {
            addCriterion("AVAILABLE_TIME_UOM_ID like", value, "availableTimeUomId");
            return (Criteria) this;
        }

        public Criteria andAvailableTimeUomIdNotLike(String value) {
            addCriterion("AVAILABLE_TIME_UOM_ID not like", value, "availableTimeUomId");
            return (Criteria) this;
        }

        public Criteria andAvailableTimeUomIdIn(List<String> values) {
            addCriterion("AVAILABLE_TIME_UOM_ID in", values, "availableTimeUomId");
            return (Criteria) this;
        }

        public Criteria andAvailableTimeUomIdNotIn(List<String> values) {
            addCriterion("AVAILABLE_TIME_UOM_ID not in", values, "availableTimeUomId");
            return (Criteria) this;
        }

        public Criteria andAvailableTimeUomIdBetween(String value1, String value2) {
            addCriterion("AVAILABLE_TIME_UOM_ID between", value1, value2, "availableTimeUomId");
            return (Criteria) this;
        }

        public Criteria andAvailableTimeUomIdNotBetween(String value1, String value2) {
            addCriterion("AVAILABLE_TIME_UOM_ID not between", value1, value2, "availableTimeUomId");
            return (Criteria) this;
        }

        public Criteria andUseCountLimitIsNull() {
            addCriterion("USE_COUNT_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andUseCountLimitIsNotNull() {
            addCriterion("USE_COUNT_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andUseCountLimitEqualTo(BigDecimal value) {
            addCriterion("USE_COUNT_LIMIT =", value, "useCountLimit");
            return (Criteria) this;
        }

        public Criteria andUseCountLimitNotEqualTo(BigDecimal value) {
            addCriterion("USE_COUNT_LIMIT <>", value, "useCountLimit");
            return (Criteria) this;
        }

        public Criteria andUseCountLimitGreaterThan(BigDecimal value) {
            addCriterion("USE_COUNT_LIMIT >", value, "useCountLimit");
            return (Criteria) this;
        }

        public Criteria andUseCountLimitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("USE_COUNT_LIMIT >=", value, "useCountLimit");
            return (Criteria) this;
        }

        public Criteria andUseCountLimitLessThan(BigDecimal value) {
            addCriterion("USE_COUNT_LIMIT <", value, "useCountLimit");
            return (Criteria) this;
        }

        public Criteria andUseCountLimitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("USE_COUNT_LIMIT <=", value, "useCountLimit");
            return (Criteria) this;
        }

        public Criteria andUseCountLimitIn(List<BigDecimal> values) {
            addCriterion("USE_COUNT_LIMIT in", values, "useCountLimit");
            return (Criteria) this;
        }

        public Criteria andUseCountLimitNotIn(List<BigDecimal> values) {
            addCriterion("USE_COUNT_LIMIT not in", values, "useCountLimit");
            return (Criteria) this;
        }

        public Criteria andUseCountLimitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USE_COUNT_LIMIT between", value1, value2, "useCountLimit");
            return (Criteria) this;
        }

        public Criteria andUseCountLimitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USE_COUNT_LIMIT not between", value1, value2, "useCountLimit");
            return (Criteria) this;
        }

        public Criteria andUseTimeIsNull() {
            addCriterion("USE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUseTimeIsNotNull() {
            addCriterion("USE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUseTimeEqualTo(BigDecimal value) {
            addCriterion("USE_TIME =", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeNotEqualTo(BigDecimal value) {
            addCriterion("USE_TIME <>", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeGreaterThan(BigDecimal value) {
            addCriterion("USE_TIME >", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("USE_TIME >=", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeLessThan(BigDecimal value) {
            addCriterion("USE_TIME <", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("USE_TIME <=", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeIn(List<BigDecimal> values) {
            addCriterion("USE_TIME in", values, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeNotIn(List<BigDecimal> values) {
            addCriterion("USE_TIME not in", values, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USE_TIME between", value1, value2, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USE_TIME not between", value1, value2, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeUomIdIsNull() {
            addCriterion("USE_TIME_UOM_ID is null");
            return (Criteria) this;
        }

        public Criteria andUseTimeUomIdIsNotNull() {
            addCriterion("USE_TIME_UOM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUseTimeUomIdEqualTo(String value) {
            addCriterion("USE_TIME_UOM_ID =", value, "useTimeUomId");
            return (Criteria) this;
        }

        public Criteria andUseTimeUomIdNotEqualTo(String value) {
            addCriterion("USE_TIME_UOM_ID <>", value, "useTimeUomId");
            return (Criteria) this;
        }

        public Criteria andUseTimeUomIdGreaterThan(String value) {
            addCriterion("USE_TIME_UOM_ID >", value, "useTimeUomId");
            return (Criteria) this;
        }

        public Criteria andUseTimeUomIdGreaterThanOrEqualTo(String value) {
            addCriterion("USE_TIME_UOM_ID >=", value, "useTimeUomId");
            return (Criteria) this;
        }

        public Criteria andUseTimeUomIdLessThan(String value) {
            addCriterion("USE_TIME_UOM_ID <", value, "useTimeUomId");
            return (Criteria) this;
        }

        public Criteria andUseTimeUomIdLessThanOrEqualTo(String value) {
            addCriterion("USE_TIME_UOM_ID <=", value, "useTimeUomId");
            return (Criteria) this;
        }

        public Criteria andUseTimeUomIdLike(String value) {
            addCriterion("USE_TIME_UOM_ID like", value, "useTimeUomId");
            return (Criteria) this;
        }

        public Criteria andUseTimeUomIdNotLike(String value) {
            addCriterion("USE_TIME_UOM_ID not like", value, "useTimeUomId");
            return (Criteria) this;
        }

        public Criteria andUseTimeUomIdIn(List<String> values) {
            addCriterion("USE_TIME_UOM_ID in", values, "useTimeUomId");
            return (Criteria) this;
        }

        public Criteria andUseTimeUomIdNotIn(List<String> values) {
            addCriterion("USE_TIME_UOM_ID not in", values, "useTimeUomId");
            return (Criteria) this;
        }

        public Criteria andUseTimeUomIdBetween(String value1, String value2) {
            addCriterion("USE_TIME_UOM_ID between", value1, value2, "useTimeUomId");
            return (Criteria) this;
        }

        public Criteria andUseTimeUomIdNotBetween(String value1, String value2) {
            addCriterion("USE_TIME_UOM_ID not between", value1, value2, "useTimeUomId");
            return (Criteria) this;
        }

        public Criteria andUseRoleTypeIdIsNull() {
            addCriterion("USE_ROLE_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andUseRoleTypeIdIsNotNull() {
            addCriterion("USE_ROLE_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUseRoleTypeIdEqualTo(String value) {
            addCriterion("USE_ROLE_TYPE_ID =", value, "useRoleTypeId");
            return (Criteria) this;
        }

        public Criteria andUseRoleTypeIdNotEqualTo(String value) {
            addCriterion("USE_ROLE_TYPE_ID <>", value, "useRoleTypeId");
            return (Criteria) this;
        }

        public Criteria andUseRoleTypeIdGreaterThan(String value) {
            addCriterion("USE_ROLE_TYPE_ID >", value, "useRoleTypeId");
            return (Criteria) this;
        }

        public Criteria andUseRoleTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("USE_ROLE_TYPE_ID >=", value, "useRoleTypeId");
            return (Criteria) this;
        }

        public Criteria andUseRoleTypeIdLessThan(String value) {
            addCriterion("USE_ROLE_TYPE_ID <", value, "useRoleTypeId");
            return (Criteria) this;
        }

        public Criteria andUseRoleTypeIdLessThanOrEqualTo(String value) {
            addCriterion("USE_ROLE_TYPE_ID <=", value, "useRoleTypeId");
            return (Criteria) this;
        }

        public Criteria andUseRoleTypeIdLike(String value) {
            addCriterion("USE_ROLE_TYPE_ID like", value, "useRoleTypeId");
            return (Criteria) this;
        }

        public Criteria andUseRoleTypeIdNotLike(String value) {
            addCriterion("USE_ROLE_TYPE_ID not like", value, "useRoleTypeId");
            return (Criteria) this;
        }

        public Criteria andUseRoleTypeIdIn(List<String> values) {
            addCriterion("USE_ROLE_TYPE_ID in", values, "useRoleTypeId");
            return (Criteria) this;
        }

        public Criteria andUseRoleTypeIdNotIn(List<String> values) {
            addCriterion("USE_ROLE_TYPE_ID not in", values, "useRoleTypeId");
            return (Criteria) this;
        }

        public Criteria andUseRoleTypeIdBetween(String value1, String value2) {
            addCriterion("USE_ROLE_TYPE_ID between", value1, value2, "useRoleTypeId");
            return (Criteria) this;
        }

        public Criteria andUseRoleTypeIdNotBetween(String value1, String value2) {
            addCriterion("USE_ROLE_TYPE_ID not between", value1, value2, "useRoleTypeId");
            return (Criteria) this;
        }

        public Criteria andAutomaticExtendIsNull() {
            addCriterion("AUTOMATIC_EXTEND is null");
            return (Criteria) this;
        }

        public Criteria andAutomaticExtendIsNotNull() {
            addCriterion("AUTOMATIC_EXTEND is not null");
            return (Criteria) this;
        }

        public Criteria andAutomaticExtendEqualTo(String value) {
            addCriterion("AUTOMATIC_EXTEND =", value, "automaticExtend");
            return (Criteria) this;
        }

        public Criteria andAutomaticExtendNotEqualTo(String value) {
            addCriterion("AUTOMATIC_EXTEND <>", value, "automaticExtend");
            return (Criteria) this;
        }

        public Criteria andAutomaticExtendGreaterThan(String value) {
            addCriterion("AUTOMATIC_EXTEND >", value, "automaticExtend");
            return (Criteria) this;
        }

        public Criteria andAutomaticExtendGreaterThanOrEqualTo(String value) {
            addCriterion("AUTOMATIC_EXTEND >=", value, "automaticExtend");
            return (Criteria) this;
        }

        public Criteria andAutomaticExtendLessThan(String value) {
            addCriterion("AUTOMATIC_EXTEND <", value, "automaticExtend");
            return (Criteria) this;
        }

        public Criteria andAutomaticExtendLessThanOrEqualTo(String value) {
            addCriterion("AUTOMATIC_EXTEND <=", value, "automaticExtend");
            return (Criteria) this;
        }

        public Criteria andAutomaticExtendLike(String value) {
            addCriterion("AUTOMATIC_EXTEND like", value, "automaticExtend");
            return (Criteria) this;
        }

        public Criteria andAutomaticExtendNotLike(String value) {
            addCriterion("AUTOMATIC_EXTEND not like", value, "automaticExtend");
            return (Criteria) this;
        }

        public Criteria andAutomaticExtendIn(List<String> values) {
            addCriterion("AUTOMATIC_EXTEND in", values, "automaticExtend");
            return (Criteria) this;
        }

        public Criteria andAutomaticExtendNotIn(List<String> values) {
            addCriterion("AUTOMATIC_EXTEND not in", values, "automaticExtend");
            return (Criteria) this;
        }

        public Criteria andAutomaticExtendBetween(String value1, String value2) {
            addCriterion("AUTOMATIC_EXTEND between", value1, value2, "automaticExtend");
            return (Criteria) this;
        }

        public Criteria andAutomaticExtendNotBetween(String value1, String value2) {
            addCriterion("AUTOMATIC_EXTEND not between", value1, value2, "automaticExtend");
            return (Criteria) this;
        }

        public Criteria andCanclAutmExtTimeIsNull() {
            addCriterion("CANCL_AUTM_EXT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCanclAutmExtTimeIsNotNull() {
            addCriterion("CANCL_AUTM_EXT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCanclAutmExtTimeEqualTo(BigDecimal value) {
            addCriterion("CANCL_AUTM_EXT_TIME =", value, "canclAutmExtTime");
            return (Criteria) this;
        }

        public Criteria andCanclAutmExtTimeNotEqualTo(BigDecimal value) {
            addCriterion("CANCL_AUTM_EXT_TIME <>", value, "canclAutmExtTime");
            return (Criteria) this;
        }

        public Criteria andCanclAutmExtTimeGreaterThan(BigDecimal value) {
            addCriterion("CANCL_AUTM_EXT_TIME >", value, "canclAutmExtTime");
            return (Criteria) this;
        }

        public Criteria andCanclAutmExtTimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CANCL_AUTM_EXT_TIME >=", value, "canclAutmExtTime");
            return (Criteria) this;
        }

        public Criteria andCanclAutmExtTimeLessThan(BigDecimal value) {
            addCriterion("CANCL_AUTM_EXT_TIME <", value, "canclAutmExtTime");
            return (Criteria) this;
        }

        public Criteria andCanclAutmExtTimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CANCL_AUTM_EXT_TIME <=", value, "canclAutmExtTime");
            return (Criteria) this;
        }

        public Criteria andCanclAutmExtTimeIn(List<BigDecimal> values) {
            addCriterion("CANCL_AUTM_EXT_TIME in", values, "canclAutmExtTime");
            return (Criteria) this;
        }

        public Criteria andCanclAutmExtTimeNotIn(List<BigDecimal> values) {
            addCriterion("CANCL_AUTM_EXT_TIME not in", values, "canclAutmExtTime");
            return (Criteria) this;
        }

        public Criteria andCanclAutmExtTimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CANCL_AUTM_EXT_TIME between", value1, value2, "canclAutmExtTime");
            return (Criteria) this;
        }

        public Criteria andCanclAutmExtTimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CANCL_AUTM_EXT_TIME not between", value1, value2, "canclAutmExtTime");
            return (Criteria) this;
        }

        public Criteria andCanclAutmExtTimeUomIdIsNull() {
            addCriterion("CANCL_AUTM_EXT_TIME_UOM_ID is null");
            return (Criteria) this;
        }

        public Criteria andCanclAutmExtTimeUomIdIsNotNull() {
            addCriterion("CANCL_AUTM_EXT_TIME_UOM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCanclAutmExtTimeUomIdEqualTo(String value) {
            addCriterion("CANCL_AUTM_EXT_TIME_UOM_ID =", value, "canclAutmExtTimeUomId");
            return (Criteria) this;
        }

        public Criteria andCanclAutmExtTimeUomIdNotEqualTo(String value) {
            addCriterion("CANCL_AUTM_EXT_TIME_UOM_ID <>", value, "canclAutmExtTimeUomId");
            return (Criteria) this;
        }

        public Criteria andCanclAutmExtTimeUomIdGreaterThan(String value) {
            addCriterion("CANCL_AUTM_EXT_TIME_UOM_ID >", value, "canclAutmExtTimeUomId");
            return (Criteria) this;
        }

        public Criteria andCanclAutmExtTimeUomIdGreaterThanOrEqualTo(String value) {
            addCriterion("CANCL_AUTM_EXT_TIME_UOM_ID >=", value, "canclAutmExtTimeUomId");
            return (Criteria) this;
        }

        public Criteria andCanclAutmExtTimeUomIdLessThan(String value) {
            addCriterion("CANCL_AUTM_EXT_TIME_UOM_ID <", value, "canclAutmExtTimeUomId");
            return (Criteria) this;
        }

        public Criteria andCanclAutmExtTimeUomIdLessThanOrEqualTo(String value) {
            addCriterion("CANCL_AUTM_EXT_TIME_UOM_ID <=", value, "canclAutmExtTimeUomId");
            return (Criteria) this;
        }

        public Criteria andCanclAutmExtTimeUomIdLike(String value) {
            addCriterion("CANCL_AUTM_EXT_TIME_UOM_ID like", value, "canclAutmExtTimeUomId");
            return (Criteria) this;
        }

        public Criteria andCanclAutmExtTimeUomIdNotLike(String value) {
            addCriterion("CANCL_AUTM_EXT_TIME_UOM_ID not like", value, "canclAutmExtTimeUomId");
            return (Criteria) this;
        }

        public Criteria andCanclAutmExtTimeUomIdIn(List<String> values) {
            addCriterion("CANCL_AUTM_EXT_TIME_UOM_ID in", values, "canclAutmExtTimeUomId");
            return (Criteria) this;
        }

        public Criteria andCanclAutmExtTimeUomIdNotIn(List<String> values) {
            addCriterion("CANCL_AUTM_EXT_TIME_UOM_ID not in", values, "canclAutmExtTimeUomId");
            return (Criteria) this;
        }

        public Criteria andCanclAutmExtTimeUomIdBetween(String value1, String value2) {
            addCriterion("CANCL_AUTM_EXT_TIME_UOM_ID between", value1, value2, "canclAutmExtTimeUomId");
            return (Criteria) this;
        }

        public Criteria andCanclAutmExtTimeUomIdNotBetween(String value1, String value2) {
            addCriterion("CANCL_AUTM_EXT_TIME_UOM_ID not between", value1, value2, "canclAutmExtTimeUomId");
            return (Criteria) this;
        }

        public Criteria andGracePeriodOnExpiryIsNull() {
            addCriterion("GRACE_PERIOD_ON_EXPIRY is null");
            return (Criteria) this;
        }

        public Criteria andGracePeriodOnExpiryIsNotNull() {
            addCriterion("GRACE_PERIOD_ON_EXPIRY is not null");
            return (Criteria) this;
        }

        public Criteria andGracePeriodOnExpiryEqualTo(BigDecimal value) {
            addCriterion("GRACE_PERIOD_ON_EXPIRY =", value, "gracePeriodOnExpiry");
            return (Criteria) this;
        }

        public Criteria andGracePeriodOnExpiryNotEqualTo(BigDecimal value) {
            addCriterion("GRACE_PERIOD_ON_EXPIRY <>", value, "gracePeriodOnExpiry");
            return (Criteria) this;
        }

        public Criteria andGracePeriodOnExpiryGreaterThan(BigDecimal value) {
            addCriterion("GRACE_PERIOD_ON_EXPIRY >", value, "gracePeriodOnExpiry");
            return (Criteria) this;
        }

        public Criteria andGracePeriodOnExpiryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GRACE_PERIOD_ON_EXPIRY >=", value, "gracePeriodOnExpiry");
            return (Criteria) this;
        }

        public Criteria andGracePeriodOnExpiryLessThan(BigDecimal value) {
            addCriterion("GRACE_PERIOD_ON_EXPIRY <", value, "gracePeriodOnExpiry");
            return (Criteria) this;
        }

        public Criteria andGracePeriodOnExpiryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GRACE_PERIOD_ON_EXPIRY <=", value, "gracePeriodOnExpiry");
            return (Criteria) this;
        }

        public Criteria andGracePeriodOnExpiryIn(List<BigDecimal> values) {
            addCriterion("GRACE_PERIOD_ON_EXPIRY in", values, "gracePeriodOnExpiry");
            return (Criteria) this;
        }

        public Criteria andGracePeriodOnExpiryNotIn(List<BigDecimal> values) {
            addCriterion("GRACE_PERIOD_ON_EXPIRY not in", values, "gracePeriodOnExpiry");
            return (Criteria) this;
        }

        public Criteria andGracePeriodOnExpiryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GRACE_PERIOD_ON_EXPIRY between", value1, value2, "gracePeriodOnExpiry");
            return (Criteria) this;
        }

        public Criteria andGracePeriodOnExpiryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GRACE_PERIOD_ON_EXPIRY not between", value1, value2, "gracePeriodOnExpiry");
            return (Criteria) this;
        }

        public Criteria andGracePeriodOnExpiryUomIdIsNull() {
            addCriterion("GRACE_PERIOD_ON_EXPIRY_UOM_ID is null");
            return (Criteria) this;
        }

        public Criteria andGracePeriodOnExpiryUomIdIsNotNull() {
            addCriterion("GRACE_PERIOD_ON_EXPIRY_UOM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGracePeriodOnExpiryUomIdEqualTo(String value) {
            addCriterion("GRACE_PERIOD_ON_EXPIRY_UOM_ID =", value, "gracePeriodOnExpiryUomId");
            return (Criteria) this;
        }

        public Criteria andGracePeriodOnExpiryUomIdNotEqualTo(String value) {
            addCriterion("GRACE_PERIOD_ON_EXPIRY_UOM_ID <>", value, "gracePeriodOnExpiryUomId");
            return (Criteria) this;
        }

        public Criteria andGracePeriodOnExpiryUomIdGreaterThan(String value) {
            addCriterion("GRACE_PERIOD_ON_EXPIRY_UOM_ID >", value, "gracePeriodOnExpiryUomId");
            return (Criteria) this;
        }

        public Criteria andGracePeriodOnExpiryUomIdGreaterThanOrEqualTo(String value) {
            addCriterion("GRACE_PERIOD_ON_EXPIRY_UOM_ID >=", value, "gracePeriodOnExpiryUomId");
            return (Criteria) this;
        }

        public Criteria andGracePeriodOnExpiryUomIdLessThan(String value) {
            addCriterion("GRACE_PERIOD_ON_EXPIRY_UOM_ID <", value, "gracePeriodOnExpiryUomId");
            return (Criteria) this;
        }

        public Criteria andGracePeriodOnExpiryUomIdLessThanOrEqualTo(String value) {
            addCriterion("GRACE_PERIOD_ON_EXPIRY_UOM_ID <=", value, "gracePeriodOnExpiryUomId");
            return (Criteria) this;
        }

        public Criteria andGracePeriodOnExpiryUomIdLike(String value) {
            addCriterion("GRACE_PERIOD_ON_EXPIRY_UOM_ID like", value, "gracePeriodOnExpiryUomId");
            return (Criteria) this;
        }

        public Criteria andGracePeriodOnExpiryUomIdNotLike(String value) {
            addCriterion("GRACE_PERIOD_ON_EXPIRY_UOM_ID not like", value, "gracePeriodOnExpiryUomId");
            return (Criteria) this;
        }

        public Criteria andGracePeriodOnExpiryUomIdIn(List<String> values) {
            addCriterion("GRACE_PERIOD_ON_EXPIRY_UOM_ID in", values, "gracePeriodOnExpiryUomId");
            return (Criteria) this;
        }

        public Criteria andGracePeriodOnExpiryUomIdNotIn(List<String> values) {
            addCriterion("GRACE_PERIOD_ON_EXPIRY_UOM_ID not in", values, "gracePeriodOnExpiryUomId");
            return (Criteria) this;
        }

        public Criteria andGracePeriodOnExpiryUomIdBetween(String value1, String value2) {
            addCriterion("GRACE_PERIOD_ON_EXPIRY_UOM_ID between", value1, value2, "gracePeriodOnExpiryUomId");
            return (Criteria) this;
        }

        public Criteria andGracePeriodOnExpiryUomIdNotBetween(String value1, String value2) {
            addCriterion("GRACE_PERIOD_ON_EXPIRY_UOM_ID not between", value1, value2, "gracePeriodOnExpiryUomId");
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