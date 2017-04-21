package org.efbiz.product.supplier.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SupplierProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public SupplierProductExample() {
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

        public Criteria andCurrencyUomIdIsNull() {
            addCriterion("CURRENCY_UOM_ID is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyUomIdIsNotNull() {
            addCriterion("CURRENCY_UOM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyUomIdEqualTo(String value) {
            addCriterion("CURRENCY_UOM_ID =", value, "currencyUomId");
            return (Criteria) this;
        }

        public Criteria andCurrencyUomIdNotEqualTo(String value) {
            addCriterion("CURRENCY_UOM_ID <>", value, "currencyUomId");
            return (Criteria) this;
        }

        public Criteria andCurrencyUomIdGreaterThan(String value) {
            addCriterion("CURRENCY_UOM_ID >", value, "currencyUomId");
            return (Criteria) this;
        }

        public Criteria andCurrencyUomIdGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENCY_UOM_ID >=", value, "currencyUomId");
            return (Criteria) this;
        }

        public Criteria andCurrencyUomIdLessThan(String value) {
            addCriterion("CURRENCY_UOM_ID <", value, "currencyUomId");
            return (Criteria) this;
        }

        public Criteria andCurrencyUomIdLessThanOrEqualTo(String value) {
            addCriterion("CURRENCY_UOM_ID <=", value, "currencyUomId");
            return (Criteria) this;
        }

        public Criteria andCurrencyUomIdLike(String value) {
            addCriterion("CURRENCY_UOM_ID like", value, "currencyUomId");
            return (Criteria) this;
        }

        public Criteria andCurrencyUomIdNotLike(String value) {
            addCriterion("CURRENCY_UOM_ID not like", value, "currencyUomId");
            return (Criteria) this;
        }

        public Criteria andCurrencyUomIdIn(List<String> values) {
            addCriterion("CURRENCY_UOM_ID in", values, "currencyUomId");
            return (Criteria) this;
        }

        public Criteria andCurrencyUomIdNotIn(List<String> values) {
            addCriterion("CURRENCY_UOM_ID not in", values, "currencyUomId");
            return (Criteria) this;
        }

        public Criteria andCurrencyUomIdBetween(String value1, String value2) {
            addCriterion("CURRENCY_UOM_ID between", value1, value2, "currencyUomId");
            return (Criteria) this;
        }

        public Criteria andCurrencyUomIdNotBetween(String value1, String value2) {
            addCriterion("CURRENCY_UOM_ID not between", value1, value2, "currencyUomId");
            return (Criteria) this;
        }

        public Criteria andMinimumOrderQuantityIsNull() {
            addCriterion("MINIMUM_ORDER_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andMinimumOrderQuantityIsNotNull() {
            addCriterion("MINIMUM_ORDER_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andMinimumOrderQuantityEqualTo(BigDecimal value) {
            addCriterion("MINIMUM_ORDER_QUANTITY =", value, "minimumOrderQuantity");
            return (Criteria) this;
        }

        public Criteria andMinimumOrderQuantityNotEqualTo(BigDecimal value) {
            addCriterion("MINIMUM_ORDER_QUANTITY <>", value, "minimumOrderQuantity");
            return (Criteria) this;
        }

        public Criteria andMinimumOrderQuantityGreaterThan(BigDecimal value) {
            addCriterion("MINIMUM_ORDER_QUANTITY >", value, "minimumOrderQuantity");
            return (Criteria) this;
        }

        public Criteria andMinimumOrderQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MINIMUM_ORDER_QUANTITY >=", value, "minimumOrderQuantity");
            return (Criteria) this;
        }

        public Criteria andMinimumOrderQuantityLessThan(BigDecimal value) {
            addCriterion("MINIMUM_ORDER_QUANTITY <", value, "minimumOrderQuantity");
            return (Criteria) this;
        }

        public Criteria andMinimumOrderQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MINIMUM_ORDER_QUANTITY <=", value, "minimumOrderQuantity");
            return (Criteria) this;
        }

        public Criteria andMinimumOrderQuantityIn(List<BigDecimal> values) {
            addCriterion("MINIMUM_ORDER_QUANTITY in", values, "minimumOrderQuantity");
            return (Criteria) this;
        }

        public Criteria andMinimumOrderQuantityNotIn(List<BigDecimal> values) {
            addCriterion("MINIMUM_ORDER_QUANTITY not in", values, "minimumOrderQuantity");
            return (Criteria) this;
        }

        public Criteria andMinimumOrderQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MINIMUM_ORDER_QUANTITY between", value1, value2, "minimumOrderQuantity");
            return (Criteria) this;
        }

        public Criteria andMinimumOrderQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MINIMUM_ORDER_QUANTITY not between", value1, value2, "minimumOrderQuantity");
            return (Criteria) this;
        }

        public Criteria andAvailableFromDateIsNull() {
            addCriterion("AVAILABLE_FROM_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAvailableFromDateIsNotNull() {
            addCriterion("AVAILABLE_FROM_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableFromDateEqualTo(Date value) {
            addCriterion("AVAILABLE_FROM_DATE =", value, "availableFromDate");
            return (Criteria) this;
        }

        public Criteria andAvailableFromDateNotEqualTo(Date value) {
            addCriterion("AVAILABLE_FROM_DATE <>", value, "availableFromDate");
            return (Criteria) this;
        }

        public Criteria andAvailableFromDateGreaterThan(Date value) {
            addCriterion("AVAILABLE_FROM_DATE >", value, "availableFromDate");
            return (Criteria) this;
        }

        public Criteria andAvailableFromDateGreaterThanOrEqualTo(Date value) {
            addCriterion("AVAILABLE_FROM_DATE >=", value, "availableFromDate");
            return (Criteria) this;
        }

        public Criteria andAvailableFromDateLessThan(Date value) {
            addCriterion("AVAILABLE_FROM_DATE <", value, "availableFromDate");
            return (Criteria) this;
        }

        public Criteria andAvailableFromDateLessThanOrEqualTo(Date value) {
            addCriterion("AVAILABLE_FROM_DATE <=", value, "availableFromDate");
            return (Criteria) this;
        }

        public Criteria andAvailableFromDateIn(List<Date> values) {
            addCriterion("AVAILABLE_FROM_DATE in", values, "availableFromDate");
            return (Criteria) this;
        }

        public Criteria andAvailableFromDateNotIn(List<Date> values) {
            addCriterion("AVAILABLE_FROM_DATE not in", values, "availableFromDate");
            return (Criteria) this;
        }

        public Criteria andAvailableFromDateBetween(Date value1, Date value2) {
            addCriterion("AVAILABLE_FROM_DATE between", value1, value2, "availableFromDate");
            return (Criteria) this;
        }

        public Criteria andAvailableFromDateNotBetween(Date value1, Date value2) {
            addCriterion("AVAILABLE_FROM_DATE not between", value1, value2, "availableFromDate");
            return (Criteria) this;
        }

        public Criteria andAvailableThruDateIsNull() {
            addCriterion("AVAILABLE_THRU_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAvailableThruDateIsNotNull() {
            addCriterion("AVAILABLE_THRU_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableThruDateEqualTo(Date value) {
            addCriterion("AVAILABLE_THRU_DATE =", value, "availableThruDate");
            return (Criteria) this;
        }

        public Criteria andAvailableThruDateNotEqualTo(Date value) {
            addCriterion("AVAILABLE_THRU_DATE <>", value, "availableThruDate");
            return (Criteria) this;
        }

        public Criteria andAvailableThruDateGreaterThan(Date value) {
            addCriterion("AVAILABLE_THRU_DATE >", value, "availableThruDate");
            return (Criteria) this;
        }

        public Criteria andAvailableThruDateGreaterThanOrEqualTo(Date value) {
            addCriterion("AVAILABLE_THRU_DATE >=", value, "availableThruDate");
            return (Criteria) this;
        }

        public Criteria andAvailableThruDateLessThan(Date value) {
            addCriterion("AVAILABLE_THRU_DATE <", value, "availableThruDate");
            return (Criteria) this;
        }

        public Criteria andAvailableThruDateLessThanOrEqualTo(Date value) {
            addCriterion("AVAILABLE_THRU_DATE <=", value, "availableThruDate");
            return (Criteria) this;
        }

        public Criteria andAvailableThruDateIn(List<Date> values) {
            addCriterion("AVAILABLE_THRU_DATE in", values, "availableThruDate");
            return (Criteria) this;
        }

        public Criteria andAvailableThruDateNotIn(List<Date> values) {
            addCriterion("AVAILABLE_THRU_DATE not in", values, "availableThruDate");
            return (Criteria) this;
        }

        public Criteria andAvailableThruDateBetween(Date value1, Date value2) {
            addCriterion("AVAILABLE_THRU_DATE between", value1, value2, "availableThruDate");
            return (Criteria) this;
        }

        public Criteria andAvailableThruDateNotBetween(Date value1, Date value2) {
            addCriterion("AVAILABLE_THRU_DATE not between", value1, value2, "availableThruDate");
            return (Criteria) this;
        }

        public Criteria andSupplierPrefOrderIdIsNull() {
            addCriterion("SUPPLIER_PREF_ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andSupplierPrefOrderIdIsNotNull() {
            addCriterion("SUPPLIER_PREF_ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierPrefOrderIdEqualTo(String value) {
            addCriterion("SUPPLIER_PREF_ORDER_ID =", value, "supplierPrefOrderId");
            return (Criteria) this;
        }

        public Criteria andSupplierPrefOrderIdNotEqualTo(String value) {
            addCriterion("SUPPLIER_PREF_ORDER_ID <>", value, "supplierPrefOrderId");
            return (Criteria) this;
        }

        public Criteria andSupplierPrefOrderIdGreaterThan(String value) {
            addCriterion("SUPPLIER_PREF_ORDER_ID >", value, "supplierPrefOrderId");
            return (Criteria) this;
        }

        public Criteria andSupplierPrefOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_PREF_ORDER_ID >=", value, "supplierPrefOrderId");
            return (Criteria) this;
        }

        public Criteria andSupplierPrefOrderIdLessThan(String value) {
            addCriterion("SUPPLIER_PREF_ORDER_ID <", value, "supplierPrefOrderId");
            return (Criteria) this;
        }

        public Criteria andSupplierPrefOrderIdLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_PREF_ORDER_ID <=", value, "supplierPrefOrderId");
            return (Criteria) this;
        }

        public Criteria andSupplierPrefOrderIdLike(String value) {
            addCriterion("SUPPLIER_PREF_ORDER_ID like", value, "supplierPrefOrderId");
            return (Criteria) this;
        }

        public Criteria andSupplierPrefOrderIdNotLike(String value) {
            addCriterion("SUPPLIER_PREF_ORDER_ID not like", value, "supplierPrefOrderId");
            return (Criteria) this;
        }

        public Criteria andSupplierPrefOrderIdIn(List<String> values) {
            addCriterion("SUPPLIER_PREF_ORDER_ID in", values, "supplierPrefOrderId");
            return (Criteria) this;
        }

        public Criteria andSupplierPrefOrderIdNotIn(List<String> values) {
            addCriterion("SUPPLIER_PREF_ORDER_ID not in", values, "supplierPrefOrderId");
            return (Criteria) this;
        }

        public Criteria andSupplierPrefOrderIdBetween(String value1, String value2) {
            addCriterion("SUPPLIER_PREF_ORDER_ID between", value1, value2, "supplierPrefOrderId");
            return (Criteria) this;
        }

        public Criteria andSupplierPrefOrderIdNotBetween(String value1, String value2) {
            addCriterion("SUPPLIER_PREF_ORDER_ID not between", value1, value2, "supplierPrefOrderId");
            return (Criteria) this;
        }

        public Criteria andSupplierRatingTypeIdIsNull() {
            addCriterion("SUPPLIER_RATING_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andSupplierRatingTypeIdIsNotNull() {
            addCriterion("SUPPLIER_RATING_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierRatingTypeIdEqualTo(String value) {
            addCriterion("SUPPLIER_RATING_TYPE_ID =", value, "supplierRatingTypeId");
            return (Criteria) this;
        }

        public Criteria andSupplierRatingTypeIdNotEqualTo(String value) {
            addCriterion("SUPPLIER_RATING_TYPE_ID <>", value, "supplierRatingTypeId");
            return (Criteria) this;
        }

        public Criteria andSupplierRatingTypeIdGreaterThan(String value) {
            addCriterion("SUPPLIER_RATING_TYPE_ID >", value, "supplierRatingTypeId");
            return (Criteria) this;
        }

        public Criteria andSupplierRatingTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_RATING_TYPE_ID >=", value, "supplierRatingTypeId");
            return (Criteria) this;
        }

        public Criteria andSupplierRatingTypeIdLessThan(String value) {
            addCriterion("SUPPLIER_RATING_TYPE_ID <", value, "supplierRatingTypeId");
            return (Criteria) this;
        }

        public Criteria andSupplierRatingTypeIdLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_RATING_TYPE_ID <=", value, "supplierRatingTypeId");
            return (Criteria) this;
        }

        public Criteria andSupplierRatingTypeIdLike(String value) {
            addCriterion("SUPPLIER_RATING_TYPE_ID like", value, "supplierRatingTypeId");
            return (Criteria) this;
        }

        public Criteria andSupplierRatingTypeIdNotLike(String value) {
            addCriterion("SUPPLIER_RATING_TYPE_ID not like", value, "supplierRatingTypeId");
            return (Criteria) this;
        }

        public Criteria andSupplierRatingTypeIdIn(List<String> values) {
            addCriterion("SUPPLIER_RATING_TYPE_ID in", values, "supplierRatingTypeId");
            return (Criteria) this;
        }

        public Criteria andSupplierRatingTypeIdNotIn(List<String> values) {
            addCriterion("SUPPLIER_RATING_TYPE_ID not in", values, "supplierRatingTypeId");
            return (Criteria) this;
        }

        public Criteria andSupplierRatingTypeIdBetween(String value1, String value2) {
            addCriterion("SUPPLIER_RATING_TYPE_ID between", value1, value2, "supplierRatingTypeId");
            return (Criteria) this;
        }

        public Criteria andSupplierRatingTypeIdNotBetween(String value1, String value2) {
            addCriterion("SUPPLIER_RATING_TYPE_ID not between", value1, value2, "supplierRatingTypeId");
            return (Criteria) this;
        }

        public Criteria andStandardLeadTimeDaysIsNull() {
            addCriterion("STANDARD_LEAD_TIME_DAYS is null");
            return (Criteria) this;
        }

        public Criteria andStandardLeadTimeDaysIsNotNull() {
            addCriterion("STANDARD_LEAD_TIME_DAYS is not null");
            return (Criteria) this;
        }

        public Criteria andStandardLeadTimeDaysEqualTo(BigDecimal value) {
            addCriterion("STANDARD_LEAD_TIME_DAYS =", value, "standardLeadTimeDays");
            return (Criteria) this;
        }

        public Criteria andStandardLeadTimeDaysNotEqualTo(BigDecimal value) {
            addCriterion("STANDARD_LEAD_TIME_DAYS <>", value, "standardLeadTimeDays");
            return (Criteria) this;
        }

        public Criteria andStandardLeadTimeDaysGreaterThan(BigDecimal value) {
            addCriterion("STANDARD_LEAD_TIME_DAYS >", value, "standardLeadTimeDays");
            return (Criteria) this;
        }

        public Criteria andStandardLeadTimeDaysGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STANDARD_LEAD_TIME_DAYS >=", value, "standardLeadTimeDays");
            return (Criteria) this;
        }

        public Criteria andStandardLeadTimeDaysLessThan(BigDecimal value) {
            addCriterion("STANDARD_LEAD_TIME_DAYS <", value, "standardLeadTimeDays");
            return (Criteria) this;
        }

        public Criteria andStandardLeadTimeDaysLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STANDARD_LEAD_TIME_DAYS <=", value, "standardLeadTimeDays");
            return (Criteria) this;
        }

        public Criteria andStandardLeadTimeDaysIn(List<BigDecimal> values) {
            addCriterion("STANDARD_LEAD_TIME_DAYS in", values, "standardLeadTimeDays");
            return (Criteria) this;
        }

        public Criteria andStandardLeadTimeDaysNotIn(List<BigDecimal> values) {
            addCriterion("STANDARD_LEAD_TIME_DAYS not in", values, "standardLeadTimeDays");
            return (Criteria) this;
        }

        public Criteria andStandardLeadTimeDaysBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STANDARD_LEAD_TIME_DAYS between", value1, value2, "standardLeadTimeDays");
            return (Criteria) this;
        }

        public Criteria andStandardLeadTimeDaysNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STANDARD_LEAD_TIME_DAYS not between", value1, value2, "standardLeadTimeDays");
            return (Criteria) this;
        }

        public Criteria andOrderQtyIncrementsIsNull() {
            addCriterion("ORDER_QTY_INCREMENTS is null");
            return (Criteria) this;
        }

        public Criteria andOrderQtyIncrementsIsNotNull() {
            addCriterion("ORDER_QTY_INCREMENTS is not null");
            return (Criteria) this;
        }

        public Criteria andOrderQtyIncrementsEqualTo(BigDecimal value) {
            addCriterion("ORDER_QTY_INCREMENTS =", value, "orderQtyIncrements");
            return (Criteria) this;
        }

        public Criteria andOrderQtyIncrementsNotEqualTo(BigDecimal value) {
            addCriterion("ORDER_QTY_INCREMENTS <>", value, "orderQtyIncrements");
            return (Criteria) this;
        }

        public Criteria andOrderQtyIncrementsGreaterThan(BigDecimal value) {
            addCriterion("ORDER_QTY_INCREMENTS >", value, "orderQtyIncrements");
            return (Criteria) this;
        }

        public Criteria andOrderQtyIncrementsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDER_QTY_INCREMENTS >=", value, "orderQtyIncrements");
            return (Criteria) this;
        }

        public Criteria andOrderQtyIncrementsLessThan(BigDecimal value) {
            addCriterion("ORDER_QTY_INCREMENTS <", value, "orderQtyIncrements");
            return (Criteria) this;
        }

        public Criteria andOrderQtyIncrementsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDER_QTY_INCREMENTS <=", value, "orderQtyIncrements");
            return (Criteria) this;
        }

        public Criteria andOrderQtyIncrementsIn(List<BigDecimal> values) {
            addCriterion("ORDER_QTY_INCREMENTS in", values, "orderQtyIncrements");
            return (Criteria) this;
        }

        public Criteria andOrderQtyIncrementsNotIn(List<BigDecimal> values) {
            addCriterion("ORDER_QTY_INCREMENTS not in", values, "orderQtyIncrements");
            return (Criteria) this;
        }

        public Criteria andOrderQtyIncrementsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDER_QTY_INCREMENTS between", value1, value2, "orderQtyIncrements");
            return (Criteria) this;
        }

        public Criteria andOrderQtyIncrementsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDER_QTY_INCREMENTS not between", value1, value2, "orderQtyIncrements");
            return (Criteria) this;
        }

        public Criteria andUnitsIncludedIsNull() {
            addCriterion("UNITS_INCLUDED is null");
            return (Criteria) this;
        }

        public Criteria andUnitsIncludedIsNotNull() {
            addCriterion("UNITS_INCLUDED is not null");
            return (Criteria) this;
        }

        public Criteria andUnitsIncludedEqualTo(BigDecimal value) {
            addCriterion("UNITS_INCLUDED =", value, "unitsIncluded");
            return (Criteria) this;
        }

        public Criteria andUnitsIncludedNotEqualTo(BigDecimal value) {
            addCriterion("UNITS_INCLUDED <>", value, "unitsIncluded");
            return (Criteria) this;
        }

        public Criteria andUnitsIncludedGreaterThan(BigDecimal value) {
            addCriterion("UNITS_INCLUDED >", value, "unitsIncluded");
            return (Criteria) this;
        }

        public Criteria andUnitsIncludedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UNITS_INCLUDED >=", value, "unitsIncluded");
            return (Criteria) this;
        }

        public Criteria andUnitsIncludedLessThan(BigDecimal value) {
            addCriterion("UNITS_INCLUDED <", value, "unitsIncluded");
            return (Criteria) this;
        }

        public Criteria andUnitsIncludedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UNITS_INCLUDED <=", value, "unitsIncluded");
            return (Criteria) this;
        }

        public Criteria andUnitsIncludedIn(List<BigDecimal> values) {
            addCriterion("UNITS_INCLUDED in", values, "unitsIncluded");
            return (Criteria) this;
        }

        public Criteria andUnitsIncludedNotIn(List<BigDecimal> values) {
            addCriterion("UNITS_INCLUDED not in", values, "unitsIncluded");
            return (Criteria) this;
        }

        public Criteria andUnitsIncludedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNITS_INCLUDED between", value1, value2, "unitsIncluded");
            return (Criteria) this;
        }

        public Criteria andUnitsIncludedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNITS_INCLUDED not between", value1, value2, "unitsIncluded");
            return (Criteria) this;
        }

        public Criteria andQuantityUomIdIsNull() {
            addCriterion("QUANTITY_UOM_ID is null");
            return (Criteria) this;
        }

        public Criteria andQuantityUomIdIsNotNull() {
            addCriterion("QUANTITY_UOM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityUomIdEqualTo(String value) {
            addCriterion("QUANTITY_UOM_ID =", value, "quantityUomId");
            return (Criteria) this;
        }

        public Criteria andQuantityUomIdNotEqualTo(String value) {
            addCriterion("QUANTITY_UOM_ID <>", value, "quantityUomId");
            return (Criteria) this;
        }

        public Criteria andQuantityUomIdGreaterThan(String value) {
            addCriterion("QUANTITY_UOM_ID >", value, "quantityUomId");
            return (Criteria) this;
        }

        public Criteria andQuantityUomIdGreaterThanOrEqualTo(String value) {
            addCriterion("QUANTITY_UOM_ID >=", value, "quantityUomId");
            return (Criteria) this;
        }

        public Criteria andQuantityUomIdLessThan(String value) {
            addCriterion("QUANTITY_UOM_ID <", value, "quantityUomId");
            return (Criteria) this;
        }

        public Criteria andQuantityUomIdLessThanOrEqualTo(String value) {
            addCriterion("QUANTITY_UOM_ID <=", value, "quantityUomId");
            return (Criteria) this;
        }

        public Criteria andQuantityUomIdLike(String value) {
            addCriterion("QUANTITY_UOM_ID like", value, "quantityUomId");
            return (Criteria) this;
        }

        public Criteria andQuantityUomIdNotLike(String value) {
            addCriterion("QUANTITY_UOM_ID not like", value, "quantityUomId");
            return (Criteria) this;
        }

        public Criteria andQuantityUomIdIn(List<String> values) {
            addCriterion("QUANTITY_UOM_ID in", values, "quantityUomId");
            return (Criteria) this;
        }

        public Criteria andQuantityUomIdNotIn(List<String> values) {
            addCriterion("QUANTITY_UOM_ID not in", values, "quantityUomId");
            return (Criteria) this;
        }

        public Criteria andQuantityUomIdBetween(String value1, String value2) {
            addCriterion("QUANTITY_UOM_ID between", value1, value2, "quantityUomId");
            return (Criteria) this;
        }

        public Criteria andQuantityUomIdNotBetween(String value1, String value2) {
            addCriterion("QUANTITY_UOM_ID not between", value1, value2, "quantityUomId");
            return (Criteria) this;
        }

        public Criteria andAgreementIdIsNull() {
            addCriterion("AGREEMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andAgreementIdIsNotNull() {
            addCriterion("AGREEMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAgreementIdEqualTo(String value) {
            addCriterion("AGREEMENT_ID =", value, "agreementId");
            return (Criteria) this;
        }

        public Criteria andAgreementIdNotEqualTo(String value) {
            addCriterion("AGREEMENT_ID <>", value, "agreementId");
            return (Criteria) this;
        }

        public Criteria andAgreementIdGreaterThan(String value) {
            addCriterion("AGREEMENT_ID >", value, "agreementId");
            return (Criteria) this;
        }

        public Criteria andAgreementIdGreaterThanOrEqualTo(String value) {
            addCriterion("AGREEMENT_ID >=", value, "agreementId");
            return (Criteria) this;
        }

        public Criteria andAgreementIdLessThan(String value) {
            addCriterion("AGREEMENT_ID <", value, "agreementId");
            return (Criteria) this;
        }

        public Criteria andAgreementIdLessThanOrEqualTo(String value) {
            addCriterion("AGREEMENT_ID <=", value, "agreementId");
            return (Criteria) this;
        }

        public Criteria andAgreementIdLike(String value) {
            addCriterion("AGREEMENT_ID like", value, "agreementId");
            return (Criteria) this;
        }

        public Criteria andAgreementIdNotLike(String value) {
            addCriterion("AGREEMENT_ID not like", value, "agreementId");
            return (Criteria) this;
        }

        public Criteria andAgreementIdIn(List<String> values) {
            addCriterion("AGREEMENT_ID in", values, "agreementId");
            return (Criteria) this;
        }

        public Criteria andAgreementIdNotIn(List<String> values) {
            addCriterion("AGREEMENT_ID not in", values, "agreementId");
            return (Criteria) this;
        }

        public Criteria andAgreementIdBetween(String value1, String value2) {
            addCriterion("AGREEMENT_ID between", value1, value2, "agreementId");
            return (Criteria) this;
        }

        public Criteria andAgreementIdNotBetween(String value1, String value2) {
            addCriterion("AGREEMENT_ID not between", value1, value2, "agreementId");
            return (Criteria) this;
        }

        public Criteria andAgreementItemSeqIdIsNull() {
            addCriterion("AGREEMENT_ITEM_SEQ_ID is null");
            return (Criteria) this;
        }

        public Criteria andAgreementItemSeqIdIsNotNull() {
            addCriterion("AGREEMENT_ITEM_SEQ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAgreementItemSeqIdEqualTo(String value) {
            addCriterion("AGREEMENT_ITEM_SEQ_ID =", value, "agreementItemSeqId");
            return (Criteria) this;
        }

        public Criteria andAgreementItemSeqIdNotEqualTo(String value) {
            addCriterion("AGREEMENT_ITEM_SEQ_ID <>", value, "agreementItemSeqId");
            return (Criteria) this;
        }

        public Criteria andAgreementItemSeqIdGreaterThan(String value) {
            addCriterion("AGREEMENT_ITEM_SEQ_ID >", value, "agreementItemSeqId");
            return (Criteria) this;
        }

        public Criteria andAgreementItemSeqIdGreaterThanOrEqualTo(String value) {
            addCriterion("AGREEMENT_ITEM_SEQ_ID >=", value, "agreementItemSeqId");
            return (Criteria) this;
        }

        public Criteria andAgreementItemSeqIdLessThan(String value) {
            addCriterion("AGREEMENT_ITEM_SEQ_ID <", value, "agreementItemSeqId");
            return (Criteria) this;
        }

        public Criteria andAgreementItemSeqIdLessThanOrEqualTo(String value) {
            addCriterion("AGREEMENT_ITEM_SEQ_ID <=", value, "agreementItemSeqId");
            return (Criteria) this;
        }

        public Criteria andAgreementItemSeqIdLike(String value) {
            addCriterion("AGREEMENT_ITEM_SEQ_ID like", value, "agreementItemSeqId");
            return (Criteria) this;
        }

        public Criteria andAgreementItemSeqIdNotLike(String value) {
            addCriterion("AGREEMENT_ITEM_SEQ_ID not like", value, "agreementItemSeqId");
            return (Criteria) this;
        }

        public Criteria andAgreementItemSeqIdIn(List<String> values) {
            addCriterion("AGREEMENT_ITEM_SEQ_ID in", values, "agreementItemSeqId");
            return (Criteria) this;
        }

        public Criteria andAgreementItemSeqIdNotIn(List<String> values) {
            addCriterion("AGREEMENT_ITEM_SEQ_ID not in", values, "agreementItemSeqId");
            return (Criteria) this;
        }

        public Criteria andAgreementItemSeqIdBetween(String value1, String value2) {
            addCriterion("AGREEMENT_ITEM_SEQ_ID between", value1, value2, "agreementItemSeqId");
            return (Criteria) this;
        }

        public Criteria andAgreementItemSeqIdNotBetween(String value1, String value2) {
            addCriterion("AGREEMENT_ITEM_SEQ_ID not between", value1, value2, "agreementItemSeqId");
            return (Criteria) this;
        }

        public Criteria andLastPriceIsNull() {
            addCriterion("LAST_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andLastPriceIsNotNull() {
            addCriterion("LAST_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andLastPriceEqualTo(BigDecimal value) {
            addCriterion("LAST_PRICE =", value, "lastPrice");
            return (Criteria) this;
        }

        public Criteria andLastPriceNotEqualTo(BigDecimal value) {
            addCriterion("LAST_PRICE <>", value, "lastPrice");
            return (Criteria) this;
        }

        public Criteria andLastPriceGreaterThan(BigDecimal value) {
            addCriterion("LAST_PRICE >", value, "lastPrice");
            return (Criteria) this;
        }

        public Criteria andLastPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LAST_PRICE >=", value, "lastPrice");
            return (Criteria) this;
        }

        public Criteria andLastPriceLessThan(BigDecimal value) {
            addCriterion("LAST_PRICE <", value, "lastPrice");
            return (Criteria) this;
        }

        public Criteria andLastPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LAST_PRICE <=", value, "lastPrice");
            return (Criteria) this;
        }

        public Criteria andLastPriceIn(List<BigDecimal> values) {
            addCriterion("LAST_PRICE in", values, "lastPrice");
            return (Criteria) this;
        }

        public Criteria andLastPriceNotIn(List<BigDecimal> values) {
            addCriterion("LAST_PRICE not in", values, "lastPrice");
            return (Criteria) this;
        }

        public Criteria andLastPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LAST_PRICE between", value1, value2, "lastPrice");
            return (Criteria) this;
        }

        public Criteria andLastPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LAST_PRICE not between", value1, value2, "lastPrice");
            return (Criteria) this;
        }

        public Criteria andShippingPriceIsNull() {
            addCriterion("SHIPPING_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andShippingPriceIsNotNull() {
            addCriterion("SHIPPING_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andShippingPriceEqualTo(BigDecimal value) {
            addCriterion("SHIPPING_PRICE =", value, "shippingPrice");
            return (Criteria) this;
        }

        public Criteria andShippingPriceNotEqualTo(BigDecimal value) {
            addCriterion("SHIPPING_PRICE <>", value, "shippingPrice");
            return (Criteria) this;
        }

        public Criteria andShippingPriceGreaterThan(BigDecimal value) {
            addCriterion("SHIPPING_PRICE >", value, "shippingPrice");
            return (Criteria) this;
        }

        public Criteria andShippingPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SHIPPING_PRICE >=", value, "shippingPrice");
            return (Criteria) this;
        }

        public Criteria andShippingPriceLessThan(BigDecimal value) {
            addCriterion("SHIPPING_PRICE <", value, "shippingPrice");
            return (Criteria) this;
        }

        public Criteria andShippingPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SHIPPING_PRICE <=", value, "shippingPrice");
            return (Criteria) this;
        }

        public Criteria andShippingPriceIn(List<BigDecimal> values) {
            addCriterion("SHIPPING_PRICE in", values, "shippingPrice");
            return (Criteria) this;
        }

        public Criteria andShippingPriceNotIn(List<BigDecimal> values) {
            addCriterion("SHIPPING_PRICE not in", values, "shippingPrice");
            return (Criteria) this;
        }

        public Criteria andShippingPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHIPPING_PRICE between", value1, value2, "shippingPrice");
            return (Criteria) this;
        }

        public Criteria andShippingPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHIPPING_PRICE not between", value1, value2, "shippingPrice");
            return (Criteria) this;
        }

        public Criteria andSupplierProductNameIsNull() {
            addCriterion("SUPPLIER_PRODUCT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSupplierProductNameIsNotNull() {
            addCriterion("SUPPLIER_PRODUCT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierProductNameEqualTo(String value) {
            addCriterion("SUPPLIER_PRODUCT_NAME =", value, "supplierProductName");
            return (Criteria) this;
        }

        public Criteria andSupplierProductNameNotEqualTo(String value) {
            addCriterion("SUPPLIER_PRODUCT_NAME <>", value, "supplierProductName");
            return (Criteria) this;
        }

        public Criteria andSupplierProductNameGreaterThan(String value) {
            addCriterion("SUPPLIER_PRODUCT_NAME >", value, "supplierProductName");
            return (Criteria) this;
        }

        public Criteria andSupplierProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_PRODUCT_NAME >=", value, "supplierProductName");
            return (Criteria) this;
        }

        public Criteria andSupplierProductNameLessThan(String value) {
            addCriterion("SUPPLIER_PRODUCT_NAME <", value, "supplierProductName");
            return (Criteria) this;
        }

        public Criteria andSupplierProductNameLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_PRODUCT_NAME <=", value, "supplierProductName");
            return (Criteria) this;
        }

        public Criteria andSupplierProductNameLike(String value) {
            addCriterion("SUPPLIER_PRODUCT_NAME like", value, "supplierProductName");
            return (Criteria) this;
        }

        public Criteria andSupplierProductNameNotLike(String value) {
            addCriterion("SUPPLIER_PRODUCT_NAME not like", value, "supplierProductName");
            return (Criteria) this;
        }

        public Criteria andSupplierProductNameIn(List<String> values) {
            addCriterion("SUPPLIER_PRODUCT_NAME in", values, "supplierProductName");
            return (Criteria) this;
        }

        public Criteria andSupplierProductNameNotIn(List<String> values) {
            addCriterion("SUPPLIER_PRODUCT_NAME not in", values, "supplierProductName");
            return (Criteria) this;
        }

        public Criteria andSupplierProductNameBetween(String value1, String value2) {
            addCriterion("SUPPLIER_PRODUCT_NAME between", value1, value2, "supplierProductName");
            return (Criteria) this;
        }

        public Criteria andSupplierProductNameNotBetween(String value1, String value2) {
            addCriterion("SUPPLIER_PRODUCT_NAME not between", value1, value2, "supplierProductName");
            return (Criteria) this;
        }

        public Criteria andSupplierProductIdIsNull() {
            addCriterion("SUPPLIER_PRODUCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andSupplierProductIdIsNotNull() {
            addCriterion("SUPPLIER_PRODUCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierProductIdEqualTo(String value) {
            addCriterion("SUPPLIER_PRODUCT_ID =", value, "supplierProductId");
            return (Criteria) this;
        }

        public Criteria andSupplierProductIdNotEqualTo(String value) {
            addCriterion("SUPPLIER_PRODUCT_ID <>", value, "supplierProductId");
            return (Criteria) this;
        }

        public Criteria andSupplierProductIdGreaterThan(String value) {
            addCriterion("SUPPLIER_PRODUCT_ID >", value, "supplierProductId");
            return (Criteria) this;
        }

        public Criteria andSupplierProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_PRODUCT_ID >=", value, "supplierProductId");
            return (Criteria) this;
        }

        public Criteria andSupplierProductIdLessThan(String value) {
            addCriterion("SUPPLIER_PRODUCT_ID <", value, "supplierProductId");
            return (Criteria) this;
        }

        public Criteria andSupplierProductIdLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_PRODUCT_ID <=", value, "supplierProductId");
            return (Criteria) this;
        }

        public Criteria andSupplierProductIdLike(String value) {
            addCriterion("SUPPLIER_PRODUCT_ID like", value, "supplierProductId");
            return (Criteria) this;
        }

        public Criteria andSupplierProductIdNotLike(String value) {
            addCriterion("SUPPLIER_PRODUCT_ID not like", value, "supplierProductId");
            return (Criteria) this;
        }

        public Criteria andSupplierProductIdIn(List<String> values) {
            addCriterion("SUPPLIER_PRODUCT_ID in", values, "supplierProductId");
            return (Criteria) this;
        }

        public Criteria andSupplierProductIdNotIn(List<String> values) {
            addCriterion("SUPPLIER_PRODUCT_ID not in", values, "supplierProductId");
            return (Criteria) this;
        }

        public Criteria andSupplierProductIdBetween(String value1, String value2) {
            addCriterion("SUPPLIER_PRODUCT_ID between", value1, value2, "supplierProductId");
            return (Criteria) this;
        }

        public Criteria andSupplierProductIdNotBetween(String value1, String value2) {
            addCriterion("SUPPLIER_PRODUCT_ID not between", value1, value2, "supplierProductId");
            return (Criteria) this;
        }

        public Criteria andCanDropShipIsNull() {
            addCriterion("CAN_DROP_SHIP is null");
            return (Criteria) this;
        }

        public Criteria andCanDropShipIsNotNull() {
            addCriterion("CAN_DROP_SHIP is not null");
            return (Criteria) this;
        }

        public Criteria andCanDropShipEqualTo(String value) {
            addCriterion("CAN_DROP_SHIP =", value, "canDropShip");
            return (Criteria) this;
        }

        public Criteria andCanDropShipNotEqualTo(String value) {
            addCriterion("CAN_DROP_SHIP <>", value, "canDropShip");
            return (Criteria) this;
        }

        public Criteria andCanDropShipGreaterThan(String value) {
            addCriterion("CAN_DROP_SHIP >", value, "canDropShip");
            return (Criteria) this;
        }

        public Criteria andCanDropShipGreaterThanOrEqualTo(String value) {
            addCriterion("CAN_DROP_SHIP >=", value, "canDropShip");
            return (Criteria) this;
        }

        public Criteria andCanDropShipLessThan(String value) {
            addCriterion("CAN_DROP_SHIP <", value, "canDropShip");
            return (Criteria) this;
        }

        public Criteria andCanDropShipLessThanOrEqualTo(String value) {
            addCriterion("CAN_DROP_SHIP <=", value, "canDropShip");
            return (Criteria) this;
        }

        public Criteria andCanDropShipLike(String value) {
            addCriterion("CAN_DROP_SHIP like", value, "canDropShip");
            return (Criteria) this;
        }

        public Criteria andCanDropShipNotLike(String value) {
            addCriterion("CAN_DROP_SHIP not like", value, "canDropShip");
            return (Criteria) this;
        }

        public Criteria andCanDropShipIn(List<String> values) {
            addCriterion("CAN_DROP_SHIP in", values, "canDropShip");
            return (Criteria) this;
        }

        public Criteria andCanDropShipNotIn(List<String> values) {
            addCriterion("CAN_DROP_SHIP not in", values, "canDropShip");
            return (Criteria) this;
        }

        public Criteria andCanDropShipBetween(String value1, String value2) {
            addCriterion("CAN_DROP_SHIP between", value1, value2, "canDropShip");
            return (Criteria) this;
        }

        public Criteria andCanDropShipNotBetween(String value1, String value2) {
            addCriterion("CAN_DROP_SHIP not between", value1, value2, "canDropShip");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNull() {
            addCriterion("COMMENTS is null");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNotNull() {
            addCriterion("COMMENTS is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsEqualTo(String value) {
            addCriterion("COMMENTS =", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotEqualTo(String value) {
            addCriterion("COMMENTS <>", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThan(String value) {
            addCriterion("COMMENTS >", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThanOrEqualTo(String value) {
            addCriterion("COMMENTS >=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThan(String value) {
            addCriterion("COMMENTS <", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThanOrEqualTo(String value) {
            addCriterion("COMMENTS <=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLike(String value) {
            addCriterion("COMMENTS like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotLike(String value) {
            addCriterion("COMMENTS not like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsIn(List<String> values) {
            addCriterion("COMMENTS in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotIn(List<String> values) {
            addCriterion("COMMENTS not in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsBetween(String value1, String value2) {
            addCriterion("COMMENTS between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotBetween(String value1, String value2) {
            addCriterion("COMMENTS not between", value1, value2, "comments");
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