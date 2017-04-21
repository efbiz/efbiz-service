package org.efbiz.product.price.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductPriceChangeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public ProductPriceChangeExample() {
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

        public Criteria andProductPriceChangeIdIsNull() {
            addCriterion("PRODUCT_PRICE_CHANGE_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductPriceChangeIdIsNotNull() {
            addCriterion("PRODUCT_PRICE_CHANGE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductPriceChangeIdEqualTo(String value) {
            addCriterion("PRODUCT_PRICE_CHANGE_ID =", value, "productPriceChangeId");
            return (Criteria) this;
        }

        public Criteria andProductPriceChangeIdNotEqualTo(String value) {
            addCriterion("PRODUCT_PRICE_CHANGE_ID <>", value, "productPriceChangeId");
            return (Criteria) this;
        }

        public Criteria andProductPriceChangeIdGreaterThan(String value) {
            addCriterion("PRODUCT_PRICE_CHANGE_ID >", value, "productPriceChangeId");
            return (Criteria) this;
        }

        public Criteria andProductPriceChangeIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_PRICE_CHANGE_ID >=", value, "productPriceChangeId");
            return (Criteria) this;
        }

        public Criteria andProductPriceChangeIdLessThan(String value) {
            addCriterion("PRODUCT_PRICE_CHANGE_ID <", value, "productPriceChangeId");
            return (Criteria) this;
        }

        public Criteria andProductPriceChangeIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_PRICE_CHANGE_ID <=", value, "productPriceChangeId");
            return (Criteria) this;
        }

        public Criteria andProductPriceChangeIdLike(String value) {
            addCriterion("PRODUCT_PRICE_CHANGE_ID like", value, "productPriceChangeId");
            return (Criteria) this;
        }

        public Criteria andProductPriceChangeIdNotLike(String value) {
            addCriterion("PRODUCT_PRICE_CHANGE_ID not like", value, "productPriceChangeId");
            return (Criteria) this;
        }

        public Criteria andProductPriceChangeIdIn(List<String> values) {
            addCriterion("PRODUCT_PRICE_CHANGE_ID in", values, "productPriceChangeId");
            return (Criteria) this;
        }

        public Criteria andProductPriceChangeIdNotIn(List<String> values) {
            addCriterion("PRODUCT_PRICE_CHANGE_ID not in", values, "productPriceChangeId");
            return (Criteria) this;
        }

        public Criteria andProductPriceChangeIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_PRICE_CHANGE_ID between", value1, value2, "productPriceChangeId");
            return (Criteria) this;
        }

        public Criteria andProductPriceChangeIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_PRICE_CHANGE_ID not between", value1, value2, "productPriceChangeId");
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

        public Criteria andProductPriceTypeIdIsNull() {
            addCriterion("PRODUCT_PRICE_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductPriceTypeIdIsNotNull() {
            addCriterion("PRODUCT_PRICE_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductPriceTypeIdEqualTo(String value) {
            addCriterion("PRODUCT_PRICE_TYPE_ID =", value, "productPriceTypeId");
            return (Criteria) this;
        }

        public Criteria andProductPriceTypeIdNotEqualTo(String value) {
            addCriterion("PRODUCT_PRICE_TYPE_ID <>", value, "productPriceTypeId");
            return (Criteria) this;
        }

        public Criteria andProductPriceTypeIdGreaterThan(String value) {
            addCriterion("PRODUCT_PRICE_TYPE_ID >", value, "productPriceTypeId");
            return (Criteria) this;
        }

        public Criteria andProductPriceTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_PRICE_TYPE_ID >=", value, "productPriceTypeId");
            return (Criteria) this;
        }

        public Criteria andProductPriceTypeIdLessThan(String value) {
            addCriterion("PRODUCT_PRICE_TYPE_ID <", value, "productPriceTypeId");
            return (Criteria) this;
        }

        public Criteria andProductPriceTypeIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_PRICE_TYPE_ID <=", value, "productPriceTypeId");
            return (Criteria) this;
        }

        public Criteria andProductPriceTypeIdLike(String value) {
            addCriterion("PRODUCT_PRICE_TYPE_ID like", value, "productPriceTypeId");
            return (Criteria) this;
        }

        public Criteria andProductPriceTypeIdNotLike(String value) {
            addCriterion("PRODUCT_PRICE_TYPE_ID not like", value, "productPriceTypeId");
            return (Criteria) this;
        }

        public Criteria andProductPriceTypeIdIn(List<String> values) {
            addCriterion("PRODUCT_PRICE_TYPE_ID in", values, "productPriceTypeId");
            return (Criteria) this;
        }

        public Criteria andProductPriceTypeIdNotIn(List<String> values) {
            addCriterion("PRODUCT_PRICE_TYPE_ID not in", values, "productPriceTypeId");
            return (Criteria) this;
        }

        public Criteria andProductPriceTypeIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_PRICE_TYPE_ID between", value1, value2, "productPriceTypeId");
            return (Criteria) this;
        }

        public Criteria andProductPriceTypeIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_PRICE_TYPE_ID not between", value1, value2, "productPriceTypeId");
            return (Criteria) this;
        }

        public Criteria andProductPricePurposeIdIsNull() {
            addCriterion("PRODUCT_PRICE_PURPOSE_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductPricePurposeIdIsNotNull() {
            addCriterion("PRODUCT_PRICE_PURPOSE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductPricePurposeIdEqualTo(String value) {
            addCriterion("PRODUCT_PRICE_PURPOSE_ID =", value, "productPricePurposeId");
            return (Criteria) this;
        }

        public Criteria andProductPricePurposeIdNotEqualTo(String value) {
            addCriterion("PRODUCT_PRICE_PURPOSE_ID <>", value, "productPricePurposeId");
            return (Criteria) this;
        }

        public Criteria andProductPricePurposeIdGreaterThan(String value) {
            addCriterion("PRODUCT_PRICE_PURPOSE_ID >", value, "productPricePurposeId");
            return (Criteria) this;
        }

        public Criteria andProductPricePurposeIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_PRICE_PURPOSE_ID >=", value, "productPricePurposeId");
            return (Criteria) this;
        }

        public Criteria andProductPricePurposeIdLessThan(String value) {
            addCriterion("PRODUCT_PRICE_PURPOSE_ID <", value, "productPricePurposeId");
            return (Criteria) this;
        }

        public Criteria andProductPricePurposeIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_PRICE_PURPOSE_ID <=", value, "productPricePurposeId");
            return (Criteria) this;
        }

        public Criteria andProductPricePurposeIdLike(String value) {
            addCriterion("PRODUCT_PRICE_PURPOSE_ID like", value, "productPricePurposeId");
            return (Criteria) this;
        }

        public Criteria andProductPricePurposeIdNotLike(String value) {
            addCriterion("PRODUCT_PRICE_PURPOSE_ID not like", value, "productPricePurposeId");
            return (Criteria) this;
        }

        public Criteria andProductPricePurposeIdIn(List<String> values) {
            addCriterion("PRODUCT_PRICE_PURPOSE_ID in", values, "productPricePurposeId");
            return (Criteria) this;
        }

        public Criteria andProductPricePurposeIdNotIn(List<String> values) {
            addCriterion("PRODUCT_PRICE_PURPOSE_ID not in", values, "productPricePurposeId");
            return (Criteria) this;
        }

        public Criteria andProductPricePurposeIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_PRICE_PURPOSE_ID between", value1, value2, "productPricePurposeId");
            return (Criteria) this;
        }

        public Criteria andProductPricePurposeIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_PRICE_PURPOSE_ID not between", value1, value2, "productPricePurposeId");
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

        public Criteria andProductStoreGroupIdIsNull() {
            addCriterion("PRODUCT_STORE_GROUP_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductStoreGroupIdIsNotNull() {
            addCriterion("PRODUCT_STORE_GROUP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductStoreGroupIdEqualTo(String value) {
            addCriterion("PRODUCT_STORE_GROUP_ID =", value, "productStoreGroupId");
            return (Criteria) this;
        }

        public Criteria andProductStoreGroupIdNotEqualTo(String value) {
            addCriterion("PRODUCT_STORE_GROUP_ID <>", value, "productStoreGroupId");
            return (Criteria) this;
        }

        public Criteria andProductStoreGroupIdGreaterThan(String value) {
            addCriterion("PRODUCT_STORE_GROUP_ID >", value, "productStoreGroupId");
            return (Criteria) this;
        }

        public Criteria andProductStoreGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_STORE_GROUP_ID >=", value, "productStoreGroupId");
            return (Criteria) this;
        }

        public Criteria andProductStoreGroupIdLessThan(String value) {
            addCriterion("PRODUCT_STORE_GROUP_ID <", value, "productStoreGroupId");
            return (Criteria) this;
        }

        public Criteria andProductStoreGroupIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_STORE_GROUP_ID <=", value, "productStoreGroupId");
            return (Criteria) this;
        }

        public Criteria andProductStoreGroupIdLike(String value) {
            addCriterion("PRODUCT_STORE_GROUP_ID like", value, "productStoreGroupId");
            return (Criteria) this;
        }

        public Criteria andProductStoreGroupIdNotLike(String value) {
            addCriterion("PRODUCT_STORE_GROUP_ID not like", value, "productStoreGroupId");
            return (Criteria) this;
        }

        public Criteria andProductStoreGroupIdIn(List<String> values) {
            addCriterion("PRODUCT_STORE_GROUP_ID in", values, "productStoreGroupId");
            return (Criteria) this;
        }

        public Criteria andProductStoreGroupIdNotIn(List<String> values) {
            addCriterion("PRODUCT_STORE_GROUP_ID not in", values, "productStoreGroupId");
            return (Criteria) this;
        }

        public Criteria andProductStoreGroupIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_STORE_GROUP_ID between", value1, value2, "productStoreGroupId");
            return (Criteria) this;
        }

        public Criteria andProductStoreGroupIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_STORE_GROUP_ID not between", value1, value2, "productStoreGroupId");
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

        public Criteria andPriceIsNull() {
            addCriterion("PRICE is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("PRICE =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("PRICE <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("PRICE >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICE >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("PRICE <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICE <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("PRICE in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("PRICE not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICE between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICE not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andOldPriceIsNull() {
            addCriterion("OLD_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andOldPriceIsNotNull() {
            addCriterion("OLD_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andOldPriceEqualTo(BigDecimal value) {
            addCriterion("OLD_PRICE =", value, "oldPrice");
            return (Criteria) this;
        }

        public Criteria andOldPriceNotEqualTo(BigDecimal value) {
            addCriterion("OLD_PRICE <>", value, "oldPrice");
            return (Criteria) this;
        }

        public Criteria andOldPriceGreaterThan(BigDecimal value) {
            addCriterion("OLD_PRICE >", value, "oldPrice");
            return (Criteria) this;
        }

        public Criteria andOldPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OLD_PRICE >=", value, "oldPrice");
            return (Criteria) this;
        }

        public Criteria andOldPriceLessThan(BigDecimal value) {
            addCriterion("OLD_PRICE <", value, "oldPrice");
            return (Criteria) this;
        }

        public Criteria andOldPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OLD_PRICE <=", value, "oldPrice");
            return (Criteria) this;
        }

        public Criteria andOldPriceIn(List<BigDecimal> values) {
            addCriterion("OLD_PRICE in", values, "oldPrice");
            return (Criteria) this;
        }

        public Criteria andOldPriceNotIn(List<BigDecimal> values) {
            addCriterion("OLD_PRICE not in", values, "oldPrice");
            return (Criteria) this;
        }

        public Criteria andOldPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OLD_PRICE between", value1, value2, "oldPrice");
            return (Criteria) this;
        }

        public Criteria andOldPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OLD_PRICE not between", value1, value2, "oldPrice");
            return (Criteria) this;
        }

        public Criteria andChangedDateIsNull() {
            addCriterion("CHANGED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andChangedDateIsNotNull() {
            addCriterion("CHANGED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andChangedDateEqualTo(Date value) {
            addCriterion("CHANGED_DATE =", value, "changedDate");
            return (Criteria) this;
        }

        public Criteria andChangedDateNotEqualTo(Date value) {
            addCriterion("CHANGED_DATE <>", value, "changedDate");
            return (Criteria) this;
        }

        public Criteria andChangedDateGreaterThan(Date value) {
            addCriterion("CHANGED_DATE >", value, "changedDate");
            return (Criteria) this;
        }

        public Criteria andChangedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CHANGED_DATE >=", value, "changedDate");
            return (Criteria) this;
        }

        public Criteria andChangedDateLessThan(Date value) {
            addCriterion("CHANGED_DATE <", value, "changedDate");
            return (Criteria) this;
        }

        public Criteria andChangedDateLessThanOrEqualTo(Date value) {
            addCriterion("CHANGED_DATE <=", value, "changedDate");
            return (Criteria) this;
        }

        public Criteria andChangedDateIn(List<Date> values) {
            addCriterion("CHANGED_DATE in", values, "changedDate");
            return (Criteria) this;
        }

        public Criteria andChangedDateNotIn(List<Date> values) {
            addCriterion("CHANGED_DATE not in", values, "changedDate");
            return (Criteria) this;
        }

        public Criteria andChangedDateBetween(Date value1, Date value2) {
            addCriterion("CHANGED_DATE between", value1, value2, "changedDate");
            return (Criteria) this;
        }

        public Criteria andChangedDateNotBetween(Date value1, Date value2) {
            addCriterion("CHANGED_DATE not between", value1, value2, "changedDate");
            return (Criteria) this;
        }

        public Criteria andChangedByUserLoginIsNull() {
            addCriterion("CHANGED_BY_USER_LOGIN is null");
            return (Criteria) this;
        }

        public Criteria andChangedByUserLoginIsNotNull() {
            addCriterion("CHANGED_BY_USER_LOGIN is not null");
            return (Criteria) this;
        }

        public Criteria andChangedByUserLoginEqualTo(String value) {
            addCriterion("CHANGED_BY_USER_LOGIN =", value, "changedByUserLogin");
            return (Criteria) this;
        }

        public Criteria andChangedByUserLoginNotEqualTo(String value) {
            addCriterion("CHANGED_BY_USER_LOGIN <>", value, "changedByUserLogin");
            return (Criteria) this;
        }

        public Criteria andChangedByUserLoginGreaterThan(String value) {
            addCriterion("CHANGED_BY_USER_LOGIN >", value, "changedByUserLogin");
            return (Criteria) this;
        }

        public Criteria andChangedByUserLoginGreaterThanOrEqualTo(String value) {
            addCriterion("CHANGED_BY_USER_LOGIN >=", value, "changedByUserLogin");
            return (Criteria) this;
        }

        public Criteria andChangedByUserLoginLessThan(String value) {
            addCriterion("CHANGED_BY_USER_LOGIN <", value, "changedByUserLogin");
            return (Criteria) this;
        }

        public Criteria andChangedByUserLoginLessThanOrEqualTo(String value) {
            addCriterion("CHANGED_BY_USER_LOGIN <=", value, "changedByUserLogin");
            return (Criteria) this;
        }

        public Criteria andChangedByUserLoginLike(String value) {
            addCriterion("CHANGED_BY_USER_LOGIN like", value, "changedByUserLogin");
            return (Criteria) this;
        }

        public Criteria andChangedByUserLoginNotLike(String value) {
            addCriterion("CHANGED_BY_USER_LOGIN not like", value, "changedByUserLogin");
            return (Criteria) this;
        }

        public Criteria andChangedByUserLoginIn(List<String> values) {
            addCriterion("CHANGED_BY_USER_LOGIN in", values, "changedByUserLogin");
            return (Criteria) this;
        }

        public Criteria andChangedByUserLoginNotIn(List<String> values) {
            addCriterion("CHANGED_BY_USER_LOGIN not in", values, "changedByUserLogin");
            return (Criteria) this;
        }

        public Criteria andChangedByUserLoginBetween(String value1, String value2) {
            addCriterion("CHANGED_BY_USER_LOGIN between", value1, value2, "changedByUserLogin");
            return (Criteria) this;
        }

        public Criteria andChangedByUserLoginNotBetween(String value1, String value2) {
            addCriterion("CHANGED_BY_USER_LOGIN not between", value1, value2, "changedByUserLogin");
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