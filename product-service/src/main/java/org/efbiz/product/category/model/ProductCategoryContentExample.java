package org.efbiz.product.category.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductCategoryContentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public ProductCategoryContentExample() {
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

        public Criteria andProductCategoryIdIsNull() {
            addCriterion("PRODUCT_CATEGORY_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdIsNotNull() {
            addCriterion("PRODUCT_CATEGORY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdEqualTo(String value) {
            addCriterion("PRODUCT_CATEGORY_ID =", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdNotEqualTo(String value) {
            addCriterion("PRODUCT_CATEGORY_ID <>", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdGreaterThan(String value) {
            addCriterion("PRODUCT_CATEGORY_ID >", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_CATEGORY_ID >=", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdLessThan(String value) {
            addCriterion("PRODUCT_CATEGORY_ID <", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_CATEGORY_ID <=", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdLike(String value) {
            addCriterion("PRODUCT_CATEGORY_ID like", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdNotLike(String value) {
            addCriterion("PRODUCT_CATEGORY_ID not like", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdIn(List<String> values) {
            addCriterion("PRODUCT_CATEGORY_ID in", values, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdNotIn(List<String> values) {
            addCriterion("PRODUCT_CATEGORY_ID not in", values, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_CATEGORY_ID between", value1, value2, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_CATEGORY_ID not between", value1, value2, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andContentIdIsNull() {
            addCriterion("CONTENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andContentIdIsNotNull() {
            addCriterion("CONTENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andContentIdEqualTo(String value) {
            addCriterion("CONTENT_ID =", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdNotEqualTo(String value) {
            addCriterion("CONTENT_ID <>", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdGreaterThan(String value) {
            addCriterion("CONTENT_ID >", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENT_ID >=", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdLessThan(String value) {
            addCriterion("CONTENT_ID <", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdLessThanOrEqualTo(String value) {
            addCriterion("CONTENT_ID <=", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdLike(String value) {
            addCriterion("CONTENT_ID like", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdNotLike(String value) {
            addCriterion("CONTENT_ID not like", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdIn(List<String> values) {
            addCriterion("CONTENT_ID in", values, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdNotIn(List<String> values) {
            addCriterion("CONTENT_ID not in", values, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdBetween(String value1, String value2) {
            addCriterion("CONTENT_ID between", value1, value2, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdNotBetween(String value1, String value2) {
            addCriterion("CONTENT_ID not between", value1, value2, "contentId");
            return (Criteria) this;
        }

        public Criteria andProdCatContentTypeIdIsNull() {
            addCriterion("PROD_CAT_CONTENT_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andProdCatContentTypeIdIsNotNull() {
            addCriterion("PROD_CAT_CONTENT_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProdCatContentTypeIdEqualTo(String value) {
            addCriterion("PROD_CAT_CONTENT_TYPE_ID =", value, "prodCatContentTypeId");
            return (Criteria) this;
        }

        public Criteria andProdCatContentTypeIdNotEqualTo(String value) {
            addCriterion("PROD_CAT_CONTENT_TYPE_ID <>", value, "prodCatContentTypeId");
            return (Criteria) this;
        }

        public Criteria andProdCatContentTypeIdGreaterThan(String value) {
            addCriterion("PROD_CAT_CONTENT_TYPE_ID >", value, "prodCatContentTypeId");
            return (Criteria) this;
        }

        public Criteria andProdCatContentTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("PROD_CAT_CONTENT_TYPE_ID >=", value, "prodCatContentTypeId");
            return (Criteria) this;
        }

        public Criteria andProdCatContentTypeIdLessThan(String value) {
            addCriterion("PROD_CAT_CONTENT_TYPE_ID <", value, "prodCatContentTypeId");
            return (Criteria) this;
        }

        public Criteria andProdCatContentTypeIdLessThanOrEqualTo(String value) {
            addCriterion("PROD_CAT_CONTENT_TYPE_ID <=", value, "prodCatContentTypeId");
            return (Criteria) this;
        }

        public Criteria andProdCatContentTypeIdLike(String value) {
            addCriterion("PROD_CAT_CONTENT_TYPE_ID like", value, "prodCatContentTypeId");
            return (Criteria) this;
        }

        public Criteria andProdCatContentTypeIdNotLike(String value) {
            addCriterion("PROD_CAT_CONTENT_TYPE_ID not like", value, "prodCatContentTypeId");
            return (Criteria) this;
        }

        public Criteria andProdCatContentTypeIdIn(List<String> values) {
            addCriterion("PROD_CAT_CONTENT_TYPE_ID in", values, "prodCatContentTypeId");
            return (Criteria) this;
        }

        public Criteria andProdCatContentTypeIdNotIn(List<String> values) {
            addCriterion("PROD_CAT_CONTENT_TYPE_ID not in", values, "prodCatContentTypeId");
            return (Criteria) this;
        }

        public Criteria andProdCatContentTypeIdBetween(String value1, String value2) {
            addCriterion("PROD_CAT_CONTENT_TYPE_ID between", value1, value2, "prodCatContentTypeId");
            return (Criteria) this;
        }

        public Criteria andProdCatContentTypeIdNotBetween(String value1, String value2) {
            addCriterion("PROD_CAT_CONTENT_TYPE_ID not between", value1, value2, "prodCatContentTypeId");
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

        public Criteria andUseDaysLimitIsNull() {
            addCriterion("USE_DAYS_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andUseDaysLimitIsNotNull() {
            addCriterion("USE_DAYS_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andUseDaysLimitEqualTo(BigDecimal value) {
            addCriterion("USE_DAYS_LIMIT =", value, "useDaysLimit");
            return (Criteria) this;
        }

        public Criteria andUseDaysLimitNotEqualTo(BigDecimal value) {
            addCriterion("USE_DAYS_LIMIT <>", value, "useDaysLimit");
            return (Criteria) this;
        }

        public Criteria andUseDaysLimitGreaterThan(BigDecimal value) {
            addCriterion("USE_DAYS_LIMIT >", value, "useDaysLimit");
            return (Criteria) this;
        }

        public Criteria andUseDaysLimitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("USE_DAYS_LIMIT >=", value, "useDaysLimit");
            return (Criteria) this;
        }

        public Criteria andUseDaysLimitLessThan(BigDecimal value) {
            addCriterion("USE_DAYS_LIMIT <", value, "useDaysLimit");
            return (Criteria) this;
        }

        public Criteria andUseDaysLimitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("USE_DAYS_LIMIT <=", value, "useDaysLimit");
            return (Criteria) this;
        }

        public Criteria andUseDaysLimitIn(List<BigDecimal> values) {
            addCriterion("USE_DAYS_LIMIT in", values, "useDaysLimit");
            return (Criteria) this;
        }

        public Criteria andUseDaysLimitNotIn(List<BigDecimal> values) {
            addCriterion("USE_DAYS_LIMIT not in", values, "useDaysLimit");
            return (Criteria) this;
        }

        public Criteria andUseDaysLimitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USE_DAYS_LIMIT between", value1, value2, "useDaysLimit");
            return (Criteria) this;
        }

        public Criteria andUseDaysLimitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USE_DAYS_LIMIT not between", value1, value2, "useDaysLimit");
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