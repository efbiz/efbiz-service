package org.efbiz.product.promo.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductPromoUseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public ProductPromoUseExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("ORDER_ID =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("ORDER_ID <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("ORDER_ID >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_ID >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("ORDER_ID <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("ORDER_ID <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("ORDER_ID like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("ORDER_ID not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("ORDER_ID in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("ORDER_ID not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("ORDER_ID between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("ORDER_ID not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andPromoSequenceIdIsNull() {
            addCriterion("PROMO_SEQUENCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andPromoSequenceIdIsNotNull() {
            addCriterion("PROMO_SEQUENCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPromoSequenceIdEqualTo(String value) {
            addCriterion("PROMO_SEQUENCE_ID =", value, "promoSequenceId");
            return (Criteria) this;
        }

        public Criteria andPromoSequenceIdNotEqualTo(String value) {
            addCriterion("PROMO_SEQUENCE_ID <>", value, "promoSequenceId");
            return (Criteria) this;
        }

        public Criteria andPromoSequenceIdGreaterThan(String value) {
            addCriterion("PROMO_SEQUENCE_ID >", value, "promoSequenceId");
            return (Criteria) this;
        }

        public Criteria andPromoSequenceIdGreaterThanOrEqualTo(String value) {
            addCriterion("PROMO_SEQUENCE_ID >=", value, "promoSequenceId");
            return (Criteria) this;
        }

        public Criteria andPromoSequenceIdLessThan(String value) {
            addCriterion("PROMO_SEQUENCE_ID <", value, "promoSequenceId");
            return (Criteria) this;
        }

        public Criteria andPromoSequenceIdLessThanOrEqualTo(String value) {
            addCriterion("PROMO_SEQUENCE_ID <=", value, "promoSequenceId");
            return (Criteria) this;
        }

        public Criteria andPromoSequenceIdLike(String value) {
            addCriterion("PROMO_SEQUENCE_ID like", value, "promoSequenceId");
            return (Criteria) this;
        }

        public Criteria andPromoSequenceIdNotLike(String value) {
            addCriterion("PROMO_SEQUENCE_ID not like", value, "promoSequenceId");
            return (Criteria) this;
        }

        public Criteria andPromoSequenceIdIn(List<String> values) {
            addCriterion("PROMO_SEQUENCE_ID in", values, "promoSequenceId");
            return (Criteria) this;
        }

        public Criteria andPromoSequenceIdNotIn(List<String> values) {
            addCriterion("PROMO_SEQUENCE_ID not in", values, "promoSequenceId");
            return (Criteria) this;
        }

        public Criteria andPromoSequenceIdBetween(String value1, String value2) {
            addCriterion("PROMO_SEQUENCE_ID between", value1, value2, "promoSequenceId");
            return (Criteria) this;
        }

        public Criteria andPromoSequenceIdNotBetween(String value1, String value2) {
            addCriterion("PROMO_SEQUENCE_ID not between", value1, value2, "promoSequenceId");
            return (Criteria) this;
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

        public Criteria andProductPromoCodeIdIsNull() {
            addCriterion("PRODUCT_PROMO_CODE_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductPromoCodeIdIsNotNull() {
            addCriterion("PRODUCT_PROMO_CODE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductPromoCodeIdEqualTo(String value) {
            addCriterion("PRODUCT_PROMO_CODE_ID =", value, "productPromoCodeId");
            return (Criteria) this;
        }

        public Criteria andProductPromoCodeIdNotEqualTo(String value) {
            addCriterion("PRODUCT_PROMO_CODE_ID <>", value, "productPromoCodeId");
            return (Criteria) this;
        }

        public Criteria andProductPromoCodeIdGreaterThan(String value) {
            addCriterion("PRODUCT_PROMO_CODE_ID >", value, "productPromoCodeId");
            return (Criteria) this;
        }

        public Criteria andProductPromoCodeIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_PROMO_CODE_ID >=", value, "productPromoCodeId");
            return (Criteria) this;
        }

        public Criteria andProductPromoCodeIdLessThan(String value) {
            addCriterion("PRODUCT_PROMO_CODE_ID <", value, "productPromoCodeId");
            return (Criteria) this;
        }

        public Criteria andProductPromoCodeIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_PROMO_CODE_ID <=", value, "productPromoCodeId");
            return (Criteria) this;
        }

        public Criteria andProductPromoCodeIdLike(String value) {
            addCriterion("PRODUCT_PROMO_CODE_ID like", value, "productPromoCodeId");
            return (Criteria) this;
        }

        public Criteria andProductPromoCodeIdNotLike(String value) {
            addCriterion("PRODUCT_PROMO_CODE_ID not like", value, "productPromoCodeId");
            return (Criteria) this;
        }

        public Criteria andProductPromoCodeIdIn(List<String> values) {
            addCriterion("PRODUCT_PROMO_CODE_ID in", values, "productPromoCodeId");
            return (Criteria) this;
        }

        public Criteria andProductPromoCodeIdNotIn(List<String> values) {
            addCriterion("PRODUCT_PROMO_CODE_ID not in", values, "productPromoCodeId");
            return (Criteria) this;
        }

        public Criteria andProductPromoCodeIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_PROMO_CODE_ID between", value1, value2, "productPromoCodeId");
            return (Criteria) this;
        }

        public Criteria andProductPromoCodeIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_PROMO_CODE_ID not between", value1, value2, "productPromoCodeId");
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

        public Criteria andTotalDiscountAmountIsNull() {
            addCriterion("TOTAL_DISCOUNT_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountAmountIsNotNull() {
            addCriterion("TOTAL_DISCOUNT_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountAmountEqualTo(BigDecimal value) {
            addCriterion("TOTAL_DISCOUNT_AMOUNT =", value, "totalDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountAmountNotEqualTo(BigDecimal value) {
            addCriterion("TOTAL_DISCOUNT_AMOUNT <>", value, "totalDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountAmountGreaterThan(BigDecimal value) {
            addCriterion("TOTAL_DISCOUNT_AMOUNT >", value, "totalDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_DISCOUNT_AMOUNT >=", value, "totalDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountAmountLessThan(BigDecimal value) {
            addCriterion("TOTAL_DISCOUNT_AMOUNT <", value, "totalDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_DISCOUNT_AMOUNT <=", value, "totalDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountAmountIn(List<BigDecimal> values) {
            addCriterion("TOTAL_DISCOUNT_AMOUNT in", values, "totalDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountAmountNotIn(List<BigDecimal> values) {
            addCriterion("TOTAL_DISCOUNT_AMOUNT not in", values, "totalDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_DISCOUNT_AMOUNT between", value1, value2, "totalDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_DISCOUNT_AMOUNT not between", value1, value2, "totalDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andQuantityLeftInActionsIsNull() {
            addCriterion("QUANTITY_LEFT_IN_ACTIONS is null");
            return (Criteria) this;
        }

        public Criteria andQuantityLeftInActionsIsNotNull() {
            addCriterion("QUANTITY_LEFT_IN_ACTIONS is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityLeftInActionsEqualTo(BigDecimal value) {
            addCriterion("QUANTITY_LEFT_IN_ACTIONS =", value, "quantityLeftInActions");
            return (Criteria) this;
        }

        public Criteria andQuantityLeftInActionsNotEqualTo(BigDecimal value) {
            addCriterion("QUANTITY_LEFT_IN_ACTIONS <>", value, "quantityLeftInActions");
            return (Criteria) this;
        }

        public Criteria andQuantityLeftInActionsGreaterThan(BigDecimal value) {
            addCriterion("QUANTITY_LEFT_IN_ACTIONS >", value, "quantityLeftInActions");
            return (Criteria) this;
        }

        public Criteria andQuantityLeftInActionsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QUANTITY_LEFT_IN_ACTIONS >=", value, "quantityLeftInActions");
            return (Criteria) this;
        }

        public Criteria andQuantityLeftInActionsLessThan(BigDecimal value) {
            addCriterion("QUANTITY_LEFT_IN_ACTIONS <", value, "quantityLeftInActions");
            return (Criteria) this;
        }

        public Criteria andQuantityLeftInActionsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QUANTITY_LEFT_IN_ACTIONS <=", value, "quantityLeftInActions");
            return (Criteria) this;
        }

        public Criteria andQuantityLeftInActionsIn(List<BigDecimal> values) {
            addCriterion("QUANTITY_LEFT_IN_ACTIONS in", values, "quantityLeftInActions");
            return (Criteria) this;
        }

        public Criteria andQuantityLeftInActionsNotIn(List<BigDecimal> values) {
            addCriterion("QUANTITY_LEFT_IN_ACTIONS not in", values, "quantityLeftInActions");
            return (Criteria) this;
        }

        public Criteria andQuantityLeftInActionsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QUANTITY_LEFT_IN_ACTIONS between", value1, value2, "quantityLeftInActions");
            return (Criteria) this;
        }

        public Criteria andQuantityLeftInActionsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QUANTITY_LEFT_IN_ACTIONS not between", value1, value2, "quantityLeftInActions");
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