package org.efbiz.product.promo.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductPromoActionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public ProductPromoActionExample() {
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

        public Criteria andProductPromoIdIsNull() {
            addCriterion("PRODUCT_PROMO_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductPromoIdIsNotNull() {
            addCriterion("PRODUCT_PROMO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductPromoIdEqualTo(String value) {
            addCriterion("PRODUCT_PROMO_ID =", value, "productPromoId");
            return (Criteria) this;
        }

        public Criteria andProductPromoIdNotEqualTo(String value) {
            addCriterion("PRODUCT_PROMO_ID <>", value, "productPromoId");
            return (Criteria) this;
        }

        public Criteria andProductPromoIdGreaterThan(String value) {
            addCriterion("PRODUCT_PROMO_ID >", value, "productPromoId");
            return (Criteria) this;
        }

        public Criteria andProductPromoIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_PROMO_ID >=", value, "productPromoId");
            return (Criteria) this;
        }

        public Criteria andProductPromoIdLessThan(String value) {
            addCriterion("PRODUCT_PROMO_ID <", value, "productPromoId");
            return (Criteria) this;
        }

        public Criteria andProductPromoIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_PROMO_ID <=", value, "productPromoId");
            return (Criteria) this;
        }

        public Criteria andProductPromoIdLike(String value) {
            addCriterion("PRODUCT_PROMO_ID like", value, "productPromoId");
            return (Criteria) this;
        }

        public Criteria andProductPromoIdNotLike(String value) {
            addCriterion("PRODUCT_PROMO_ID not like", value, "productPromoId");
            return (Criteria) this;
        }

        public Criteria andProductPromoIdIn(List<String> values) {
            addCriterion("PRODUCT_PROMO_ID in", values, "productPromoId");
            return (Criteria) this;
        }

        public Criteria andProductPromoIdNotIn(List<String> values) {
            addCriterion("PRODUCT_PROMO_ID not in", values, "productPromoId");
            return (Criteria) this;
        }

        public Criteria andProductPromoIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_PROMO_ID between", value1, value2, "productPromoId");
            return (Criteria) this;
        }

        public Criteria andProductPromoIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_PROMO_ID not between", value1, value2, "productPromoId");
            return (Criteria) this;
        }

        public Criteria andProductPromoRuleIdIsNull() {
            addCriterion("PRODUCT_PROMO_RULE_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductPromoRuleIdIsNotNull() {
            addCriterion("PRODUCT_PROMO_RULE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductPromoRuleIdEqualTo(String value) {
            addCriterion("PRODUCT_PROMO_RULE_ID =", value, "productPromoRuleId");
            return (Criteria) this;
        }

        public Criteria andProductPromoRuleIdNotEqualTo(String value) {
            addCriterion("PRODUCT_PROMO_RULE_ID <>", value, "productPromoRuleId");
            return (Criteria) this;
        }

        public Criteria andProductPromoRuleIdGreaterThan(String value) {
            addCriterion("PRODUCT_PROMO_RULE_ID >", value, "productPromoRuleId");
            return (Criteria) this;
        }

        public Criteria andProductPromoRuleIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_PROMO_RULE_ID >=", value, "productPromoRuleId");
            return (Criteria) this;
        }

        public Criteria andProductPromoRuleIdLessThan(String value) {
            addCriterion("PRODUCT_PROMO_RULE_ID <", value, "productPromoRuleId");
            return (Criteria) this;
        }

        public Criteria andProductPromoRuleIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_PROMO_RULE_ID <=", value, "productPromoRuleId");
            return (Criteria) this;
        }

        public Criteria andProductPromoRuleIdLike(String value) {
            addCriterion("PRODUCT_PROMO_RULE_ID like", value, "productPromoRuleId");
            return (Criteria) this;
        }

        public Criteria andProductPromoRuleIdNotLike(String value) {
            addCriterion("PRODUCT_PROMO_RULE_ID not like", value, "productPromoRuleId");
            return (Criteria) this;
        }

        public Criteria andProductPromoRuleIdIn(List<String> values) {
            addCriterion("PRODUCT_PROMO_RULE_ID in", values, "productPromoRuleId");
            return (Criteria) this;
        }

        public Criteria andProductPromoRuleIdNotIn(List<String> values) {
            addCriterion("PRODUCT_PROMO_RULE_ID not in", values, "productPromoRuleId");
            return (Criteria) this;
        }

        public Criteria andProductPromoRuleIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_PROMO_RULE_ID between", value1, value2, "productPromoRuleId");
            return (Criteria) this;
        }

        public Criteria andProductPromoRuleIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_PROMO_RULE_ID not between", value1, value2, "productPromoRuleId");
            return (Criteria) this;
        }

        public Criteria andProductPromoActionSeqIdIsNull() {
            addCriterion("PRODUCT_PROMO_ACTION_SEQ_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductPromoActionSeqIdIsNotNull() {
            addCriterion("PRODUCT_PROMO_ACTION_SEQ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductPromoActionSeqIdEqualTo(String value) {
            addCriterion("PRODUCT_PROMO_ACTION_SEQ_ID =", value, "productPromoActionSeqId");
            return (Criteria) this;
        }

        public Criteria andProductPromoActionSeqIdNotEqualTo(String value) {
            addCriterion("PRODUCT_PROMO_ACTION_SEQ_ID <>", value, "productPromoActionSeqId");
            return (Criteria) this;
        }

        public Criteria andProductPromoActionSeqIdGreaterThan(String value) {
            addCriterion("PRODUCT_PROMO_ACTION_SEQ_ID >", value, "productPromoActionSeqId");
            return (Criteria) this;
        }

        public Criteria andProductPromoActionSeqIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_PROMO_ACTION_SEQ_ID >=", value, "productPromoActionSeqId");
            return (Criteria) this;
        }

        public Criteria andProductPromoActionSeqIdLessThan(String value) {
            addCriterion("PRODUCT_PROMO_ACTION_SEQ_ID <", value, "productPromoActionSeqId");
            return (Criteria) this;
        }

        public Criteria andProductPromoActionSeqIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_PROMO_ACTION_SEQ_ID <=", value, "productPromoActionSeqId");
            return (Criteria) this;
        }

        public Criteria andProductPromoActionSeqIdLike(String value) {
            addCriterion("PRODUCT_PROMO_ACTION_SEQ_ID like", value, "productPromoActionSeqId");
            return (Criteria) this;
        }

        public Criteria andProductPromoActionSeqIdNotLike(String value) {
            addCriterion("PRODUCT_PROMO_ACTION_SEQ_ID not like", value, "productPromoActionSeqId");
            return (Criteria) this;
        }

        public Criteria andProductPromoActionSeqIdIn(List<String> values) {
            addCriterion("PRODUCT_PROMO_ACTION_SEQ_ID in", values, "productPromoActionSeqId");
            return (Criteria) this;
        }

        public Criteria andProductPromoActionSeqIdNotIn(List<String> values) {
            addCriterion("PRODUCT_PROMO_ACTION_SEQ_ID not in", values, "productPromoActionSeqId");
            return (Criteria) this;
        }

        public Criteria andProductPromoActionSeqIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_PROMO_ACTION_SEQ_ID between", value1, value2, "productPromoActionSeqId");
            return (Criteria) this;
        }

        public Criteria andProductPromoActionSeqIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_PROMO_ACTION_SEQ_ID not between", value1, value2, "productPromoActionSeqId");
            return (Criteria) this;
        }

        public Criteria andProductPromoActionEnumIdIsNull() {
            addCriterion("PRODUCT_PROMO_ACTION_ENUM_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductPromoActionEnumIdIsNotNull() {
            addCriterion("PRODUCT_PROMO_ACTION_ENUM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductPromoActionEnumIdEqualTo(String value) {
            addCriterion("PRODUCT_PROMO_ACTION_ENUM_ID =", value, "productPromoActionEnumId");
            return (Criteria) this;
        }

        public Criteria andProductPromoActionEnumIdNotEqualTo(String value) {
            addCriterion("PRODUCT_PROMO_ACTION_ENUM_ID <>", value, "productPromoActionEnumId");
            return (Criteria) this;
        }

        public Criteria andProductPromoActionEnumIdGreaterThan(String value) {
            addCriterion("PRODUCT_PROMO_ACTION_ENUM_ID >", value, "productPromoActionEnumId");
            return (Criteria) this;
        }

        public Criteria andProductPromoActionEnumIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_PROMO_ACTION_ENUM_ID >=", value, "productPromoActionEnumId");
            return (Criteria) this;
        }

        public Criteria andProductPromoActionEnumIdLessThan(String value) {
            addCriterion("PRODUCT_PROMO_ACTION_ENUM_ID <", value, "productPromoActionEnumId");
            return (Criteria) this;
        }

        public Criteria andProductPromoActionEnumIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_PROMO_ACTION_ENUM_ID <=", value, "productPromoActionEnumId");
            return (Criteria) this;
        }

        public Criteria andProductPromoActionEnumIdLike(String value) {
            addCriterion("PRODUCT_PROMO_ACTION_ENUM_ID like", value, "productPromoActionEnumId");
            return (Criteria) this;
        }

        public Criteria andProductPromoActionEnumIdNotLike(String value) {
            addCriterion("PRODUCT_PROMO_ACTION_ENUM_ID not like", value, "productPromoActionEnumId");
            return (Criteria) this;
        }

        public Criteria andProductPromoActionEnumIdIn(List<String> values) {
            addCriterion("PRODUCT_PROMO_ACTION_ENUM_ID in", values, "productPromoActionEnumId");
            return (Criteria) this;
        }

        public Criteria andProductPromoActionEnumIdNotIn(List<String> values) {
            addCriterion("PRODUCT_PROMO_ACTION_ENUM_ID not in", values, "productPromoActionEnumId");
            return (Criteria) this;
        }

        public Criteria andProductPromoActionEnumIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_PROMO_ACTION_ENUM_ID between", value1, value2, "productPromoActionEnumId");
            return (Criteria) this;
        }

        public Criteria andProductPromoActionEnumIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_PROMO_ACTION_ENUM_ID not between", value1, value2, "productPromoActionEnumId");
            return (Criteria) this;
        }

        public Criteria andOrderAdjustmentTypeIdIsNull() {
            addCriterion("ORDER_ADJUSTMENT_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderAdjustmentTypeIdIsNotNull() {
            addCriterion("ORDER_ADJUSTMENT_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAdjustmentTypeIdEqualTo(String value) {
            addCriterion("ORDER_ADJUSTMENT_TYPE_ID =", value, "orderAdjustmentTypeId");
            return (Criteria) this;
        }

        public Criteria andOrderAdjustmentTypeIdNotEqualTo(String value) {
            addCriterion("ORDER_ADJUSTMENT_TYPE_ID <>", value, "orderAdjustmentTypeId");
            return (Criteria) this;
        }

        public Criteria andOrderAdjustmentTypeIdGreaterThan(String value) {
            addCriterion("ORDER_ADJUSTMENT_TYPE_ID >", value, "orderAdjustmentTypeId");
            return (Criteria) this;
        }

        public Criteria andOrderAdjustmentTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_ADJUSTMENT_TYPE_ID >=", value, "orderAdjustmentTypeId");
            return (Criteria) this;
        }

        public Criteria andOrderAdjustmentTypeIdLessThan(String value) {
            addCriterion("ORDER_ADJUSTMENT_TYPE_ID <", value, "orderAdjustmentTypeId");
            return (Criteria) this;
        }

        public Criteria andOrderAdjustmentTypeIdLessThanOrEqualTo(String value) {
            addCriterion("ORDER_ADJUSTMENT_TYPE_ID <=", value, "orderAdjustmentTypeId");
            return (Criteria) this;
        }

        public Criteria andOrderAdjustmentTypeIdLike(String value) {
            addCriterion("ORDER_ADJUSTMENT_TYPE_ID like", value, "orderAdjustmentTypeId");
            return (Criteria) this;
        }

        public Criteria andOrderAdjustmentTypeIdNotLike(String value) {
            addCriterion("ORDER_ADJUSTMENT_TYPE_ID not like", value, "orderAdjustmentTypeId");
            return (Criteria) this;
        }

        public Criteria andOrderAdjustmentTypeIdIn(List<String> values) {
            addCriterion("ORDER_ADJUSTMENT_TYPE_ID in", values, "orderAdjustmentTypeId");
            return (Criteria) this;
        }

        public Criteria andOrderAdjustmentTypeIdNotIn(List<String> values) {
            addCriterion("ORDER_ADJUSTMENT_TYPE_ID not in", values, "orderAdjustmentTypeId");
            return (Criteria) this;
        }

        public Criteria andOrderAdjustmentTypeIdBetween(String value1, String value2) {
            addCriterion("ORDER_ADJUSTMENT_TYPE_ID between", value1, value2, "orderAdjustmentTypeId");
            return (Criteria) this;
        }

        public Criteria andOrderAdjustmentTypeIdNotBetween(String value1, String value2) {
            addCriterion("ORDER_ADJUSTMENT_TYPE_ID not between", value1, value2, "orderAdjustmentTypeId");
            return (Criteria) this;
        }

        public Criteria andServiceNameIsNull() {
            addCriterion("SERVICE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andServiceNameIsNotNull() {
            addCriterion("SERVICE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andServiceNameEqualTo(String value) {
            addCriterion("SERVICE_NAME =", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotEqualTo(String value) {
            addCriterion("SERVICE_NAME <>", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameGreaterThan(String value) {
            addCriterion("SERVICE_NAME >", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_NAME >=", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLessThan(String value) {
            addCriterion("SERVICE_NAME <", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_NAME <=", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLike(String value) {
            addCriterion("SERVICE_NAME like", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotLike(String value) {
            addCriterion("SERVICE_NAME not like", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameIn(List<String> values) {
            addCriterion("SERVICE_NAME in", values, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotIn(List<String> values) {
            addCriterion("SERVICE_NAME not in", values, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameBetween(String value1, String value2) {
            addCriterion("SERVICE_NAME between", value1, value2, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotBetween(String value1, String value2) {
            addCriterion("SERVICE_NAME not between", value1, value2, "serviceName");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(BigDecimal value) {
            addCriterion("QUANTITY =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(BigDecimal value) {
            addCriterion("QUANTITY <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(BigDecimal value) {
            addCriterion("QUANTITY >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QUANTITY >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(BigDecimal value) {
            addCriterion("QUANTITY <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QUANTITY <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<BigDecimal> values) {
            addCriterion("QUANTITY in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<BigDecimal> values) {
            addCriterion("QUANTITY not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QUANTITY between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QUANTITY not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("AMOUNT =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("AMOUNT <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("AMOUNT >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("AMOUNT <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("AMOUNT in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("AMOUNT not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT not between", value1, value2, "amount");
            return (Criteria) this;
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

        public Criteria andPartyIdIsNull() {
            addCriterion("PARTY_ID is null");
            return (Criteria) this;
        }

        public Criteria andPartyIdIsNotNull() {
            addCriterion("PARTY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPartyIdEqualTo(String value) {
            addCriterion("PARTY_ID =", value, "partyId");
            return (Criteria) this;
        }

        public Criteria andPartyIdNotEqualTo(String value) {
            addCriterion("PARTY_ID <>", value, "partyId");
            return (Criteria) this;
        }

        public Criteria andPartyIdGreaterThan(String value) {
            addCriterion("PARTY_ID >", value, "partyId");
            return (Criteria) this;
        }

        public Criteria andPartyIdGreaterThanOrEqualTo(String value) {
            addCriterion("PARTY_ID >=", value, "partyId");
            return (Criteria) this;
        }

        public Criteria andPartyIdLessThan(String value) {
            addCriterion("PARTY_ID <", value, "partyId");
            return (Criteria) this;
        }

        public Criteria andPartyIdLessThanOrEqualTo(String value) {
            addCriterion("PARTY_ID <=", value, "partyId");
            return (Criteria) this;
        }

        public Criteria andPartyIdLike(String value) {
            addCriterion("PARTY_ID like", value, "partyId");
            return (Criteria) this;
        }

        public Criteria andPartyIdNotLike(String value) {
            addCriterion("PARTY_ID not like", value, "partyId");
            return (Criteria) this;
        }

        public Criteria andPartyIdIn(List<String> values) {
            addCriterion("PARTY_ID in", values, "partyId");
            return (Criteria) this;
        }

        public Criteria andPartyIdNotIn(List<String> values) {
            addCriterion("PARTY_ID not in", values, "partyId");
            return (Criteria) this;
        }

        public Criteria andPartyIdBetween(String value1, String value2) {
            addCriterion("PARTY_ID between", value1, value2, "partyId");
            return (Criteria) this;
        }

        public Criteria andPartyIdNotBetween(String value1, String value2) {
            addCriterion("PARTY_ID not between", value1, value2, "partyId");
            return (Criteria) this;
        }

        public Criteria andUseCartQuantityIsNull() {
            addCriterion("USE_CART_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andUseCartQuantityIsNotNull() {
            addCriterion("USE_CART_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andUseCartQuantityEqualTo(String value) {
            addCriterion("USE_CART_QUANTITY =", value, "useCartQuantity");
            return (Criteria) this;
        }

        public Criteria andUseCartQuantityNotEqualTo(String value) {
            addCriterion("USE_CART_QUANTITY <>", value, "useCartQuantity");
            return (Criteria) this;
        }

        public Criteria andUseCartQuantityGreaterThan(String value) {
            addCriterion("USE_CART_QUANTITY >", value, "useCartQuantity");
            return (Criteria) this;
        }

        public Criteria andUseCartQuantityGreaterThanOrEqualTo(String value) {
            addCriterion("USE_CART_QUANTITY >=", value, "useCartQuantity");
            return (Criteria) this;
        }

        public Criteria andUseCartQuantityLessThan(String value) {
            addCriterion("USE_CART_QUANTITY <", value, "useCartQuantity");
            return (Criteria) this;
        }

        public Criteria andUseCartQuantityLessThanOrEqualTo(String value) {
            addCriterion("USE_CART_QUANTITY <=", value, "useCartQuantity");
            return (Criteria) this;
        }

        public Criteria andUseCartQuantityLike(String value) {
            addCriterion("USE_CART_QUANTITY like", value, "useCartQuantity");
            return (Criteria) this;
        }

        public Criteria andUseCartQuantityNotLike(String value) {
            addCriterion("USE_CART_QUANTITY not like", value, "useCartQuantity");
            return (Criteria) this;
        }

        public Criteria andUseCartQuantityIn(List<String> values) {
            addCriterion("USE_CART_QUANTITY in", values, "useCartQuantity");
            return (Criteria) this;
        }

        public Criteria andUseCartQuantityNotIn(List<String> values) {
            addCriterion("USE_CART_QUANTITY not in", values, "useCartQuantity");
            return (Criteria) this;
        }

        public Criteria andUseCartQuantityBetween(String value1, String value2) {
            addCriterion("USE_CART_QUANTITY between", value1, value2, "useCartQuantity");
            return (Criteria) this;
        }

        public Criteria andUseCartQuantityNotBetween(String value1, String value2) {
            addCriterion("USE_CART_QUANTITY not between", value1, value2, "useCartQuantity");
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