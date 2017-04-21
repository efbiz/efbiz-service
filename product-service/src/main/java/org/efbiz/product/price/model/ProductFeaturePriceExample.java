package org.efbiz.product.price.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductFeaturePriceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public ProductFeaturePriceExample() {
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

        public Criteria andProductFeatureIdIsNull() {
            addCriterion("PRODUCT_FEATURE_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductFeatureIdIsNotNull() {
            addCriterion("PRODUCT_FEATURE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductFeatureIdEqualTo(String value) {
            addCriterion("PRODUCT_FEATURE_ID =", value, "productFeatureId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureIdNotEqualTo(String value) {
            addCriterion("PRODUCT_FEATURE_ID <>", value, "productFeatureId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureIdGreaterThan(String value) {
            addCriterion("PRODUCT_FEATURE_ID >", value, "productFeatureId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_FEATURE_ID >=", value, "productFeatureId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureIdLessThan(String value) {
            addCriterion("PRODUCT_FEATURE_ID <", value, "productFeatureId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_FEATURE_ID <=", value, "productFeatureId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureIdLike(String value) {
            addCriterion("PRODUCT_FEATURE_ID like", value, "productFeatureId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureIdNotLike(String value) {
            addCriterion("PRODUCT_FEATURE_ID not like", value, "productFeatureId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureIdIn(List<String> values) {
            addCriterion("PRODUCT_FEATURE_ID in", values, "productFeatureId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureIdNotIn(List<String> values) {
            addCriterion("PRODUCT_FEATURE_ID not in", values, "productFeatureId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_FEATURE_ID between", value1, value2, "productFeatureId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_FEATURE_ID not between", value1, value2, "productFeatureId");
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

        public Criteria andCreatedDateIsNull() {
            addCriterion("CREATED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNotNull() {
            addCriterion("CREATED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateEqualTo(Date value) {
            addCriterion("CREATED_DATE =", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotEqualTo(Date value) {
            addCriterion("CREATED_DATE <>", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThan(Date value) {
            addCriterion("CREATED_DATE >", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED_DATE >=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThan(Date value) {
            addCriterion("CREATED_DATE <", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATED_DATE <=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIn(List<Date> values) {
            addCriterion("CREATED_DATE in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotIn(List<Date> values) {
            addCriterion("CREATED_DATE not in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateBetween(Date value1, Date value2) {
            addCriterion("CREATED_DATE between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATED_DATE not between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedByUserLoginIsNull() {
            addCriterion("CREATED_BY_USER_LOGIN is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByUserLoginIsNotNull() {
            addCriterion("CREATED_BY_USER_LOGIN is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByUserLoginEqualTo(String value) {
            addCriterion("CREATED_BY_USER_LOGIN =", value, "createdByUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedByUserLoginNotEqualTo(String value) {
            addCriterion("CREATED_BY_USER_LOGIN <>", value, "createdByUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedByUserLoginGreaterThan(String value) {
            addCriterion("CREATED_BY_USER_LOGIN >", value, "createdByUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedByUserLoginGreaterThanOrEqualTo(String value) {
            addCriterion("CREATED_BY_USER_LOGIN >=", value, "createdByUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedByUserLoginLessThan(String value) {
            addCriterion("CREATED_BY_USER_LOGIN <", value, "createdByUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedByUserLoginLessThanOrEqualTo(String value) {
            addCriterion("CREATED_BY_USER_LOGIN <=", value, "createdByUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedByUserLoginLike(String value) {
            addCriterion("CREATED_BY_USER_LOGIN like", value, "createdByUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedByUserLoginNotLike(String value) {
            addCriterion("CREATED_BY_USER_LOGIN not like", value, "createdByUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedByUserLoginIn(List<String> values) {
            addCriterion("CREATED_BY_USER_LOGIN in", values, "createdByUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedByUserLoginNotIn(List<String> values) {
            addCriterion("CREATED_BY_USER_LOGIN not in", values, "createdByUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedByUserLoginBetween(String value1, String value2) {
            addCriterion("CREATED_BY_USER_LOGIN between", value1, value2, "createdByUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedByUserLoginNotBetween(String value1, String value2) {
            addCriterion("CREATED_BY_USER_LOGIN not between", value1, value2, "createdByUserLogin");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateIsNull() {
            addCriterion("LAST_MODIFIED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateIsNotNull() {
            addCriterion("LAST_MODIFIED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateEqualTo(Date value) {
            addCriterion("LAST_MODIFIED_DATE =", value, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateNotEqualTo(Date value) {
            addCriterion("LAST_MODIFIED_DATE <>", value, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateGreaterThan(Date value) {
            addCriterion("LAST_MODIFIED_DATE >", value, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_MODIFIED_DATE >=", value, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateLessThan(Date value) {
            addCriterion("LAST_MODIFIED_DATE <", value, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateLessThanOrEqualTo(Date value) {
            addCriterion("LAST_MODIFIED_DATE <=", value, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateIn(List<Date> values) {
            addCriterion("LAST_MODIFIED_DATE in", values, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateNotIn(List<Date> values) {
            addCriterion("LAST_MODIFIED_DATE not in", values, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateBetween(Date value1, Date value2) {
            addCriterion("LAST_MODIFIED_DATE between", value1, value2, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateNotBetween(Date value1, Date value2) {
            addCriterion("LAST_MODIFIED_DATE not between", value1, value2, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByUserLoginIsNull() {
            addCriterion("LAST_MODIFIED_BY_USER_LOGIN is null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByUserLoginIsNotNull() {
            addCriterion("LAST_MODIFIED_BY_USER_LOGIN is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByUserLoginEqualTo(String value) {
            addCriterion("LAST_MODIFIED_BY_USER_LOGIN =", value, "lastModifiedByUserLogin");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByUserLoginNotEqualTo(String value) {
            addCriterion("LAST_MODIFIED_BY_USER_LOGIN <>", value, "lastModifiedByUserLogin");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByUserLoginGreaterThan(String value) {
            addCriterion("LAST_MODIFIED_BY_USER_LOGIN >", value, "lastModifiedByUserLogin");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByUserLoginGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_MODIFIED_BY_USER_LOGIN >=", value, "lastModifiedByUserLogin");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByUserLoginLessThan(String value) {
            addCriterion("LAST_MODIFIED_BY_USER_LOGIN <", value, "lastModifiedByUserLogin");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByUserLoginLessThanOrEqualTo(String value) {
            addCriterion("LAST_MODIFIED_BY_USER_LOGIN <=", value, "lastModifiedByUserLogin");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByUserLoginLike(String value) {
            addCriterion("LAST_MODIFIED_BY_USER_LOGIN like", value, "lastModifiedByUserLogin");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByUserLoginNotLike(String value) {
            addCriterion("LAST_MODIFIED_BY_USER_LOGIN not like", value, "lastModifiedByUserLogin");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByUserLoginIn(List<String> values) {
            addCriterion("LAST_MODIFIED_BY_USER_LOGIN in", values, "lastModifiedByUserLogin");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByUserLoginNotIn(List<String> values) {
            addCriterion("LAST_MODIFIED_BY_USER_LOGIN not in", values, "lastModifiedByUserLogin");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByUserLoginBetween(String value1, String value2) {
            addCriterion("LAST_MODIFIED_BY_USER_LOGIN between", value1, value2, "lastModifiedByUserLogin");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByUserLoginNotBetween(String value1, String value2) {
            addCriterion("LAST_MODIFIED_BY_USER_LOGIN not between", value1, value2, "lastModifiedByUserLogin");
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