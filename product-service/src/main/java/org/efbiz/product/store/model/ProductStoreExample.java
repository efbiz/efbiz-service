package org.efbiz.product.store.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductStoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public ProductStoreExample() {
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

        public Criteria andProductStoreIdIsNull() {
            addCriterion("PRODUCT_STORE_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductStoreIdIsNotNull() {
            addCriterion("PRODUCT_STORE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductStoreIdEqualTo(String value) {
            addCriterion("PRODUCT_STORE_ID =", value, "productStoreId");
            return (Criteria) this;
        }

        public Criteria andProductStoreIdNotEqualTo(String value) {
            addCriterion("PRODUCT_STORE_ID <>", value, "productStoreId");
            return (Criteria) this;
        }

        public Criteria andProductStoreIdGreaterThan(String value) {
            addCriterion("PRODUCT_STORE_ID >", value, "productStoreId");
            return (Criteria) this;
        }

        public Criteria andProductStoreIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_STORE_ID >=", value, "productStoreId");
            return (Criteria) this;
        }

        public Criteria andProductStoreIdLessThan(String value) {
            addCriterion("PRODUCT_STORE_ID <", value, "productStoreId");
            return (Criteria) this;
        }

        public Criteria andProductStoreIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_STORE_ID <=", value, "productStoreId");
            return (Criteria) this;
        }

        public Criteria andProductStoreIdLike(String value) {
            addCriterion("PRODUCT_STORE_ID like", value, "productStoreId");
            return (Criteria) this;
        }

        public Criteria andProductStoreIdNotLike(String value) {
            addCriterion("PRODUCT_STORE_ID not like", value, "productStoreId");
            return (Criteria) this;
        }

        public Criteria andProductStoreIdIn(List<String> values) {
            addCriterion("PRODUCT_STORE_ID in", values, "productStoreId");
            return (Criteria) this;
        }

        public Criteria andProductStoreIdNotIn(List<String> values) {
            addCriterion("PRODUCT_STORE_ID not in", values, "productStoreId");
            return (Criteria) this;
        }

        public Criteria andProductStoreIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_STORE_ID between", value1, value2, "productStoreId");
            return (Criteria) this;
        }

        public Criteria andProductStoreIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_STORE_ID not between", value1, value2, "productStoreId");
            return (Criteria) this;
        }

        public Criteria andPrimaryStoreGroupIdIsNull() {
            addCriterion("PRIMARY_STORE_GROUP_ID is null");
            return (Criteria) this;
        }

        public Criteria andPrimaryStoreGroupIdIsNotNull() {
            addCriterion("PRIMARY_STORE_GROUP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPrimaryStoreGroupIdEqualTo(String value) {
            addCriterion("PRIMARY_STORE_GROUP_ID =", value, "primaryStoreGroupId");
            return (Criteria) this;
        }

        public Criteria andPrimaryStoreGroupIdNotEqualTo(String value) {
            addCriterion("PRIMARY_STORE_GROUP_ID <>", value, "primaryStoreGroupId");
            return (Criteria) this;
        }

        public Criteria andPrimaryStoreGroupIdGreaterThan(String value) {
            addCriterion("PRIMARY_STORE_GROUP_ID >", value, "primaryStoreGroupId");
            return (Criteria) this;
        }

        public Criteria andPrimaryStoreGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRIMARY_STORE_GROUP_ID >=", value, "primaryStoreGroupId");
            return (Criteria) this;
        }

        public Criteria andPrimaryStoreGroupIdLessThan(String value) {
            addCriterion("PRIMARY_STORE_GROUP_ID <", value, "primaryStoreGroupId");
            return (Criteria) this;
        }

        public Criteria andPrimaryStoreGroupIdLessThanOrEqualTo(String value) {
            addCriterion("PRIMARY_STORE_GROUP_ID <=", value, "primaryStoreGroupId");
            return (Criteria) this;
        }

        public Criteria andPrimaryStoreGroupIdLike(String value) {
            addCriterion("PRIMARY_STORE_GROUP_ID like", value, "primaryStoreGroupId");
            return (Criteria) this;
        }

        public Criteria andPrimaryStoreGroupIdNotLike(String value) {
            addCriterion("PRIMARY_STORE_GROUP_ID not like", value, "primaryStoreGroupId");
            return (Criteria) this;
        }

        public Criteria andPrimaryStoreGroupIdIn(List<String> values) {
            addCriterion("PRIMARY_STORE_GROUP_ID in", values, "primaryStoreGroupId");
            return (Criteria) this;
        }

        public Criteria andPrimaryStoreGroupIdNotIn(List<String> values) {
            addCriterion("PRIMARY_STORE_GROUP_ID not in", values, "primaryStoreGroupId");
            return (Criteria) this;
        }

        public Criteria andPrimaryStoreGroupIdBetween(String value1, String value2) {
            addCriterion("PRIMARY_STORE_GROUP_ID between", value1, value2, "primaryStoreGroupId");
            return (Criteria) this;
        }

        public Criteria andPrimaryStoreGroupIdNotBetween(String value1, String value2) {
            addCriterion("PRIMARY_STORE_GROUP_ID not between", value1, value2, "primaryStoreGroupId");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNull() {
            addCriterion("STORE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNotNull() {
            addCriterion("STORE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andStoreNameEqualTo(String value) {
            addCriterion("STORE_NAME =", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotEqualTo(String value) {
            addCriterion("STORE_NAME <>", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThan(String value) {
            addCriterion("STORE_NAME >", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("STORE_NAME >=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThan(String value) {
            addCriterion("STORE_NAME <", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThanOrEqualTo(String value) {
            addCriterion("STORE_NAME <=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLike(String value) {
            addCriterion("STORE_NAME like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotLike(String value) {
            addCriterion("STORE_NAME not like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameIn(List<String> values) {
            addCriterion("STORE_NAME in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotIn(List<String> values) {
            addCriterion("STORE_NAME not in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameBetween(String value1, String value2) {
            addCriterion("STORE_NAME between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotBetween(String value1, String value2) {
            addCriterion("STORE_NAME not between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("COMPANY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("COMPANY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("COMPANY_NAME =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("COMPANY_NAME <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("COMPANY_NAME >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_NAME >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("COMPANY_NAME <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_NAME <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("COMPANY_NAME like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("COMPANY_NAME not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("COMPANY_NAME in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("COMPANY_NAME not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("COMPANY_NAME between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("COMPANY_NAME not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("TITLE =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("TITLE <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("TITLE >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("TITLE <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("TITLE <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("TITLE like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("TITLE not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("TITLE in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("TITLE not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("TITLE between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("TITLE not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andSubtitleIsNull() {
            addCriterion("SUBTITLE is null");
            return (Criteria) this;
        }

        public Criteria andSubtitleIsNotNull() {
            addCriterion("SUBTITLE is not null");
            return (Criteria) this;
        }

        public Criteria andSubtitleEqualTo(String value) {
            addCriterion("SUBTITLE =", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotEqualTo(String value) {
            addCriterion("SUBTITLE <>", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleGreaterThan(String value) {
            addCriterion("SUBTITLE >", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleGreaterThanOrEqualTo(String value) {
            addCriterion("SUBTITLE >=", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleLessThan(String value) {
            addCriterion("SUBTITLE <", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleLessThanOrEqualTo(String value) {
            addCriterion("SUBTITLE <=", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleLike(String value) {
            addCriterion("SUBTITLE like", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotLike(String value) {
            addCriterion("SUBTITLE not like", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleIn(List<String> values) {
            addCriterion("SUBTITLE in", values, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotIn(List<String> values) {
            addCriterion("SUBTITLE not in", values, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleBetween(String value1, String value2) {
            addCriterion("SUBTITLE between", value1, value2, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotBetween(String value1, String value2) {
            addCriterion("SUBTITLE not between", value1, value2, "subtitle");
            return (Criteria) this;
        }

        public Criteria andPayToPartyIdIsNull() {
            addCriterion("PAY_TO_PARTY_ID is null");
            return (Criteria) this;
        }

        public Criteria andPayToPartyIdIsNotNull() {
            addCriterion("PAY_TO_PARTY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPayToPartyIdEqualTo(String value) {
            addCriterion("PAY_TO_PARTY_ID =", value, "payToPartyId");
            return (Criteria) this;
        }

        public Criteria andPayToPartyIdNotEqualTo(String value) {
            addCriterion("PAY_TO_PARTY_ID <>", value, "payToPartyId");
            return (Criteria) this;
        }

        public Criteria andPayToPartyIdGreaterThan(String value) {
            addCriterion("PAY_TO_PARTY_ID >", value, "payToPartyId");
            return (Criteria) this;
        }

        public Criteria andPayToPartyIdGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_TO_PARTY_ID >=", value, "payToPartyId");
            return (Criteria) this;
        }

        public Criteria andPayToPartyIdLessThan(String value) {
            addCriterion("PAY_TO_PARTY_ID <", value, "payToPartyId");
            return (Criteria) this;
        }

        public Criteria andPayToPartyIdLessThanOrEqualTo(String value) {
            addCriterion("PAY_TO_PARTY_ID <=", value, "payToPartyId");
            return (Criteria) this;
        }

        public Criteria andPayToPartyIdLike(String value) {
            addCriterion("PAY_TO_PARTY_ID like", value, "payToPartyId");
            return (Criteria) this;
        }

        public Criteria andPayToPartyIdNotLike(String value) {
            addCriterion("PAY_TO_PARTY_ID not like", value, "payToPartyId");
            return (Criteria) this;
        }

        public Criteria andPayToPartyIdIn(List<String> values) {
            addCriterion("PAY_TO_PARTY_ID in", values, "payToPartyId");
            return (Criteria) this;
        }

        public Criteria andPayToPartyIdNotIn(List<String> values) {
            addCriterion("PAY_TO_PARTY_ID not in", values, "payToPartyId");
            return (Criteria) this;
        }

        public Criteria andPayToPartyIdBetween(String value1, String value2) {
            addCriterion("PAY_TO_PARTY_ID between", value1, value2, "payToPartyId");
            return (Criteria) this;
        }

        public Criteria andPayToPartyIdNotBetween(String value1, String value2) {
            addCriterion("PAY_TO_PARTY_ID not between", value1, value2, "payToPartyId");
            return (Criteria) this;
        }

        public Criteria andDaysToCancelNonPayIsNull() {
            addCriterion("DAYS_TO_CANCEL_NON_PAY is null");
            return (Criteria) this;
        }

        public Criteria andDaysToCancelNonPayIsNotNull() {
            addCriterion("DAYS_TO_CANCEL_NON_PAY is not null");
            return (Criteria) this;
        }

        public Criteria andDaysToCancelNonPayEqualTo(BigDecimal value) {
            addCriterion("DAYS_TO_CANCEL_NON_PAY =", value, "daysToCancelNonPay");
            return (Criteria) this;
        }

        public Criteria andDaysToCancelNonPayNotEqualTo(BigDecimal value) {
            addCriterion("DAYS_TO_CANCEL_NON_PAY <>", value, "daysToCancelNonPay");
            return (Criteria) this;
        }

        public Criteria andDaysToCancelNonPayGreaterThan(BigDecimal value) {
            addCriterion("DAYS_TO_CANCEL_NON_PAY >", value, "daysToCancelNonPay");
            return (Criteria) this;
        }

        public Criteria andDaysToCancelNonPayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DAYS_TO_CANCEL_NON_PAY >=", value, "daysToCancelNonPay");
            return (Criteria) this;
        }

        public Criteria andDaysToCancelNonPayLessThan(BigDecimal value) {
            addCriterion("DAYS_TO_CANCEL_NON_PAY <", value, "daysToCancelNonPay");
            return (Criteria) this;
        }

        public Criteria andDaysToCancelNonPayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DAYS_TO_CANCEL_NON_PAY <=", value, "daysToCancelNonPay");
            return (Criteria) this;
        }

        public Criteria andDaysToCancelNonPayIn(List<BigDecimal> values) {
            addCriterion("DAYS_TO_CANCEL_NON_PAY in", values, "daysToCancelNonPay");
            return (Criteria) this;
        }

        public Criteria andDaysToCancelNonPayNotIn(List<BigDecimal> values) {
            addCriterion("DAYS_TO_CANCEL_NON_PAY not in", values, "daysToCancelNonPay");
            return (Criteria) this;
        }

        public Criteria andDaysToCancelNonPayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DAYS_TO_CANCEL_NON_PAY between", value1, value2, "daysToCancelNonPay");
            return (Criteria) this;
        }

        public Criteria andDaysToCancelNonPayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DAYS_TO_CANCEL_NON_PAY not between", value1, value2, "daysToCancelNonPay");
            return (Criteria) this;
        }

        public Criteria andManualAuthIsCaptureIsNull() {
            addCriterion("MANUAL_AUTH_IS_CAPTURE is null");
            return (Criteria) this;
        }

        public Criteria andManualAuthIsCaptureIsNotNull() {
            addCriterion("MANUAL_AUTH_IS_CAPTURE is not null");
            return (Criteria) this;
        }

        public Criteria andManualAuthIsCaptureEqualTo(String value) {
            addCriterion("MANUAL_AUTH_IS_CAPTURE =", value, "manualAuthIsCapture");
            return (Criteria) this;
        }

        public Criteria andManualAuthIsCaptureNotEqualTo(String value) {
            addCriterion("MANUAL_AUTH_IS_CAPTURE <>", value, "manualAuthIsCapture");
            return (Criteria) this;
        }

        public Criteria andManualAuthIsCaptureGreaterThan(String value) {
            addCriterion("MANUAL_AUTH_IS_CAPTURE >", value, "manualAuthIsCapture");
            return (Criteria) this;
        }

        public Criteria andManualAuthIsCaptureGreaterThanOrEqualTo(String value) {
            addCriterion("MANUAL_AUTH_IS_CAPTURE >=", value, "manualAuthIsCapture");
            return (Criteria) this;
        }

        public Criteria andManualAuthIsCaptureLessThan(String value) {
            addCriterion("MANUAL_AUTH_IS_CAPTURE <", value, "manualAuthIsCapture");
            return (Criteria) this;
        }

        public Criteria andManualAuthIsCaptureLessThanOrEqualTo(String value) {
            addCriterion("MANUAL_AUTH_IS_CAPTURE <=", value, "manualAuthIsCapture");
            return (Criteria) this;
        }

        public Criteria andManualAuthIsCaptureLike(String value) {
            addCriterion("MANUAL_AUTH_IS_CAPTURE like", value, "manualAuthIsCapture");
            return (Criteria) this;
        }

        public Criteria andManualAuthIsCaptureNotLike(String value) {
            addCriterion("MANUAL_AUTH_IS_CAPTURE not like", value, "manualAuthIsCapture");
            return (Criteria) this;
        }

        public Criteria andManualAuthIsCaptureIn(List<String> values) {
            addCriterion("MANUAL_AUTH_IS_CAPTURE in", values, "manualAuthIsCapture");
            return (Criteria) this;
        }

        public Criteria andManualAuthIsCaptureNotIn(List<String> values) {
            addCriterion("MANUAL_AUTH_IS_CAPTURE not in", values, "manualAuthIsCapture");
            return (Criteria) this;
        }

        public Criteria andManualAuthIsCaptureBetween(String value1, String value2) {
            addCriterion("MANUAL_AUTH_IS_CAPTURE between", value1, value2, "manualAuthIsCapture");
            return (Criteria) this;
        }

        public Criteria andManualAuthIsCaptureNotBetween(String value1, String value2) {
            addCriterion("MANUAL_AUTH_IS_CAPTURE not between", value1, value2, "manualAuthIsCapture");
            return (Criteria) this;
        }

        public Criteria andProrateShippingIsNull() {
            addCriterion("PRORATE_SHIPPING is null");
            return (Criteria) this;
        }

        public Criteria andProrateShippingIsNotNull() {
            addCriterion("PRORATE_SHIPPING is not null");
            return (Criteria) this;
        }

        public Criteria andProrateShippingEqualTo(String value) {
            addCriterion("PRORATE_SHIPPING =", value, "prorateShipping");
            return (Criteria) this;
        }

        public Criteria andProrateShippingNotEqualTo(String value) {
            addCriterion("PRORATE_SHIPPING <>", value, "prorateShipping");
            return (Criteria) this;
        }

        public Criteria andProrateShippingGreaterThan(String value) {
            addCriterion("PRORATE_SHIPPING >", value, "prorateShipping");
            return (Criteria) this;
        }

        public Criteria andProrateShippingGreaterThanOrEqualTo(String value) {
            addCriterion("PRORATE_SHIPPING >=", value, "prorateShipping");
            return (Criteria) this;
        }

        public Criteria andProrateShippingLessThan(String value) {
            addCriterion("PRORATE_SHIPPING <", value, "prorateShipping");
            return (Criteria) this;
        }

        public Criteria andProrateShippingLessThanOrEqualTo(String value) {
            addCriterion("PRORATE_SHIPPING <=", value, "prorateShipping");
            return (Criteria) this;
        }

        public Criteria andProrateShippingLike(String value) {
            addCriterion("PRORATE_SHIPPING like", value, "prorateShipping");
            return (Criteria) this;
        }

        public Criteria andProrateShippingNotLike(String value) {
            addCriterion("PRORATE_SHIPPING not like", value, "prorateShipping");
            return (Criteria) this;
        }

        public Criteria andProrateShippingIn(List<String> values) {
            addCriterion("PRORATE_SHIPPING in", values, "prorateShipping");
            return (Criteria) this;
        }

        public Criteria andProrateShippingNotIn(List<String> values) {
            addCriterion("PRORATE_SHIPPING not in", values, "prorateShipping");
            return (Criteria) this;
        }

        public Criteria andProrateShippingBetween(String value1, String value2) {
            addCriterion("PRORATE_SHIPPING between", value1, value2, "prorateShipping");
            return (Criteria) this;
        }

        public Criteria andProrateShippingNotBetween(String value1, String value2) {
            addCriterion("PRORATE_SHIPPING not between", value1, value2, "prorateShipping");
            return (Criteria) this;
        }

        public Criteria andProrateTaxesIsNull() {
            addCriterion("PRORATE_TAXES is null");
            return (Criteria) this;
        }

        public Criteria andProrateTaxesIsNotNull() {
            addCriterion("PRORATE_TAXES is not null");
            return (Criteria) this;
        }

        public Criteria andProrateTaxesEqualTo(String value) {
            addCriterion("PRORATE_TAXES =", value, "prorateTaxes");
            return (Criteria) this;
        }

        public Criteria andProrateTaxesNotEqualTo(String value) {
            addCriterion("PRORATE_TAXES <>", value, "prorateTaxes");
            return (Criteria) this;
        }

        public Criteria andProrateTaxesGreaterThan(String value) {
            addCriterion("PRORATE_TAXES >", value, "prorateTaxes");
            return (Criteria) this;
        }

        public Criteria andProrateTaxesGreaterThanOrEqualTo(String value) {
            addCriterion("PRORATE_TAXES >=", value, "prorateTaxes");
            return (Criteria) this;
        }

        public Criteria andProrateTaxesLessThan(String value) {
            addCriterion("PRORATE_TAXES <", value, "prorateTaxes");
            return (Criteria) this;
        }

        public Criteria andProrateTaxesLessThanOrEqualTo(String value) {
            addCriterion("PRORATE_TAXES <=", value, "prorateTaxes");
            return (Criteria) this;
        }

        public Criteria andProrateTaxesLike(String value) {
            addCriterion("PRORATE_TAXES like", value, "prorateTaxes");
            return (Criteria) this;
        }

        public Criteria andProrateTaxesNotLike(String value) {
            addCriterion("PRORATE_TAXES not like", value, "prorateTaxes");
            return (Criteria) this;
        }

        public Criteria andProrateTaxesIn(List<String> values) {
            addCriterion("PRORATE_TAXES in", values, "prorateTaxes");
            return (Criteria) this;
        }

        public Criteria andProrateTaxesNotIn(List<String> values) {
            addCriterion("PRORATE_TAXES not in", values, "prorateTaxes");
            return (Criteria) this;
        }

        public Criteria andProrateTaxesBetween(String value1, String value2) {
            addCriterion("PRORATE_TAXES between", value1, value2, "prorateTaxes");
            return (Criteria) this;
        }

        public Criteria andProrateTaxesNotBetween(String value1, String value2) {
            addCriterion("PRORATE_TAXES not between", value1, value2, "prorateTaxes");
            return (Criteria) this;
        }

        public Criteria andViewCartOnAddIsNull() {
            addCriterion("VIEW_CART_ON_ADD is null");
            return (Criteria) this;
        }

        public Criteria andViewCartOnAddIsNotNull() {
            addCriterion("VIEW_CART_ON_ADD is not null");
            return (Criteria) this;
        }

        public Criteria andViewCartOnAddEqualTo(String value) {
            addCriterion("VIEW_CART_ON_ADD =", value, "viewCartOnAdd");
            return (Criteria) this;
        }

        public Criteria andViewCartOnAddNotEqualTo(String value) {
            addCriterion("VIEW_CART_ON_ADD <>", value, "viewCartOnAdd");
            return (Criteria) this;
        }

        public Criteria andViewCartOnAddGreaterThan(String value) {
            addCriterion("VIEW_CART_ON_ADD >", value, "viewCartOnAdd");
            return (Criteria) this;
        }

        public Criteria andViewCartOnAddGreaterThanOrEqualTo(String value) {
            addCriterion("VIEW_CART_ON_ADD >=", value, "viewCartOnAdd");
            return (Criteria) this;
        }

        public Criteria andViewCartOnAddLessThan(String value) {
            addCriterion("VIEW_CART_ON_ADD <", value, "viewCartOnAdd");
            return (Criteria) this;
        }

        public Criteria andViewCartOnAddLessThanOrEqualTo(String value) {
            addCriterion("VIEW_CART_ON_ADD <=", value, "viewCartOnAdd");
            return (Criteria) this;
        }

        public Criteria andViewCartOnAddLike(String value) {
            addCriterion("VIEW_CART_ON_ADD like", value, "viewCartOnAdd");
            return (Criteria) this;
        }

        public Criteria andViewCartOnAddNotLike(String value) {
            addCriterion("VIEW_CART_ON_ADD not like", value, "viewCartOnAdd");
            return (Criteria) this;
        }

        public Criteria andViewCartOnAddIn(List<String> values) {
            addCriterion("VIEW_CART_ON_ADD in", values, "viewCartOnAdd");
            return (Criteria) this;
        }

        public Criteria andViewCartOnAddNotIn(List<String> values) {
            addCriterion("VIEW_CART_ON_ADD not in", values, "viewCartOnAdd");
            return (Criteria) this;
        }

        public Criteria andViewCartOnAddBetween(String value1, String value2) {
            addCriterion("VIEW_CART_ON_ADD between", value1, value2, "viewCartOnAdd");
            return (Criteria) this;
        }

        public Criteria andViewCartOnAddNotBetween(String value1, String value2) {
            addCriterion("VIEW_CART_ON_ADD not between", value1, value2, "viewCartOnAdd");
            return (Criteria) this;
        }

        public Criteria andAutoSaveCartIsNull() {
            addCriterion("AUTO_SAVE_CART is null");
            return (Criteria) this;
        }

        public Criteria andAutoSaveCartIsNotNull() {
            addCriterion("AUTO_SAVE_CART is not null");
            return (Criteria) this;
        }

        public Criteria andAutoSaveCartEqualTo(String value) {
            addCriterion("AUTO_SAVE_CART =", value, "autoSaveCart");
            return (Criteria) this;
        }

        public Criteria andAutoSaveCartNotEqualTo(String value) {
            addCriterion("AUTO_SAVE_CART <>", value, "autoSaveCart");
            return (Criteria) this;
        }

        public Criteria andAutoSaveCartGreaterThan(String value) {
            addCriterion("AUTO_SAVE_CART >", value, "autoSaveCart");
            return (Criteria) this;
        }

        public Criteria andAutoSaveCartGreaterThanOrEqualTo(String value) {
            addCriterion("AUTO_SAVE_CART >=", value, "autoSaveCart");
            return (Criteria) this;
        }

        public Criteria andAutoSaveCartLessThan(String value) {
            addCriterion("AUTO_SAVE_CART <", value, "autoSaveCart");
            return (Criteria) this;
        }

        public Criteria andAutoSaveCartLessThanOrEqualTo(String value) {
            addCriterion("AUTO_SAVE_CART <=", value, "autoSaveCart");
            return (Criteria) this;
        }

        public Criteria andAutoSaveCartLike(String value) {
            addCriterion("AUTO_SAVE_CART like", value, "autoSaveCart");
            return (Criteria) this;
        }

        public Criteria andAutoSaveCartNotLike(String value) {
            addCriterion("AUTO_SAVE_CART not like", value, "autoSaveCart");
            return (Criteria) this;
        }

        public Criteria andAutoSaveCartIn(List<String> values) {
            addCriterion("AUTO_SAVE_CART in", values, "autoSaveCart");
            return (Criteria) this;
        }

        public Criteria andAutoSaveCartNotIn(List<String> values) {
            addCriterion("AUTO_SAVE_CART not in", values, "autoSaveCart");
            return (Criteria) this;
        }

        public Criteria andAutoSaveCartBetween(String value1, String value2) {
            addCriterion("AUTO_SAVE_CART between", value1, value2, "autoSaveCart");
            return (Criteria) this;
        }

        public Criteria andAutoSaveCartNotBetween(String value1, String value2) {
            addCriterion("AUTO_SAVE_CART not between", value1, value2, "autoSaveCart");
            return (Criteria) this;
        }

        public Criteria andAutoApproveReviewsIsNull() {
            addCriterion("AUTO_APPROVE_REVIEWS is null");
            return (Criteria) this;
        }

        public Criteria andAutoApproveReviewsIsNotNull() {
            addCriterion("AUTO_APPROVE_REVIEWS is not null");
            return (Criteria) this;
        }

        public Criteria andAutoApproveReviewsEqualTo(String value) {
            addCriterion("AUTO_APPROVE_REVIEWS =", value, "autoApproveReviews");
            return (Criteria) this;
        }

        public Criteria andAutoApproveReviewsNotEqualTo(String value) {
            addCriterion("AUTO_APPROVE_REVIEWS <>", value, "autoApproveReviews");
            return (Criteria) this;
        }

        public Criteria andAutoApproveReviewsGreaterThan(String value) {
            addCriterion("AUTO_APPROVE_REVIEWS >", value, "autoApproveReviews");
            return (Criteria) this;
        }

        public Criteria andAutoApproveReviewsGreaterThanOrEqualTo(String value) {
            addCriterion("AUTO_APPROVE_REVIEWS >=", value, "autoApproveReviews");
            return (Criteria) this;
        }

        public Criteria andAutoApproveReviewsLessThan(String value) {
            addCriterion("AUTO_APPROVE_REVIEWS <", value, "autoApproveReviews");
            return (Criteria) this;
        }

        public Criteria andAutoApproveReviewsLessThanOrEqualTo(String value) {
            addCriterion("AUTO_APPROVE_REVIEWS <=", value, "autoApproveReviews");
            return (Criteria) this;
        }

        public Criteria andAutoApproveReviewsLike(String value) {
            addCriterion("AUTO_APPROVE_REVIEWS like", value, "autoApproveReviews");
            return (Criteria) this;
        }

        public Criteria andAutoApproveReviewsNotLike(String value) {
            addCriterion("AUTO_APPROVE_REVIEWS not like", value, "autoApproveReviews");
            return (Criteria) this;
        }

        public Criteria andAutoApproveReviewsIn(List<String> values) {
            addCriterion("AUTO_APPROVE_REVIEWS in", values, "autoApproveReviews");
            return (Criteria) this;
        }

        public Criteria andAutoApproveReviewsNotIn(List<String> values) {
            addCriterion("AUTO_APPROVE_REVIEWS not in", values, "autoApproveReviews");
            return (Criteria) this;
        }

        public Criteria andAutoApproveReviewsBetween(String value1, String value2) {
            addCriterion("AUTO_APPROVE_REVIEWS between", value1, value2, "autoApproveReviews");
            return (Criteria) this;
        }

        public Criteria andAutoApproveReviewsNotBetween(String value1, String value2) {
            addCriterion("AUTO_APPROVE_REVIEWS not between", value1, value2, "autoApproveReviews");
            return (Criteria) this;
        }

        public Criteria andIsDemoStoreIsNull() {
            addCriterion("IS_DEMO_STORE is null");
            return (Criteria) this;
        }

        public Criteria andIsDemoStoreIsNotNull() {
            addCriterion("IS_DEMO_STORE is not null");
            return (Criteria) this;
        }

        public Criteria andIsDemoStoreEqualTo(String value) {
            addCriterion("IS_DEMO_STORE =", value, "isDemoStore");
            return (Criteria) this;
        }

        public Criteria andIsDemoStoreNotEqualTo(String value) {
            addCriterion("IS_DEMO_STORE <>", value, "isDemoStore");
            return (Criteria) this;
        }

        public Criteria andIsDemoStoreGreaterThan(String value) {
            addCriterion("IS_DEMO_STORE >", value, "isDemoStore");
            return (Criteria) this;
        }

        public Criteria andIsDemoStoreGreaterThanOrEqualTo(String value) {
            addCriterion("IS_DEMO_STORE >=", value, "isDemoStore");
            return (Criteria) this;
        }

        public Criteria andIsDemoStoreLessThan(String value) {
            addCriterion("IS_DEMO_STORE <", value, "isDemoStore");
            return (Criteria) this;
        }

        public Criteria andIsDemoStoreLessThanOrEqualTo(String value) {
            addCriterion("IS_DEMO_STORE <=", value, "isDemoStore");
            return (Criteria) this;
        }

        public Criteria andIsDemoStoreLike(String value) {
            addCriterion("IS_DEMO_STORE like", value, "isDemoStore");
            return (Criteria) this;
        }

        public Criteria andIsDemoStoreNotLike(String value) {
            addCriterion("IS_DEMO_STORE not like", value, "isDemoStore");
            return (Criteria) this;
        }

        public Criteria andIsDemoStoreIn(List<String> values) {
            addCriterion("IS_DEMO_STORE in", values, "isDemoStore");
            return (Criteria) this;
        }

        public Criteria andIsDemoStoreNotIn(List<String> values) {
            addCriterion("IS_DEMO_STORE not in", values, "isDemoStore");
            return (Criteria) this;
        }

        public Criteria andIsDemoStoreBetween(String value1, String value2) {
            addCriterion("IS_DEMO_STORE between", value1, value2, "isDemoStore");
            return (Criteria) this;
        }

        public Criteria andIsDemoStoreNotBetween(String value1, String value2) {
            addCriterion("IS_DEMO_STORE not between", value1, value2, "isDemoStore");
            return (Criteria) this;
        }

        public Criteria andIsImmediatelyFulfilledIsNull() {
            addCriterion("IS_IMMEDIATELY_FULFILLED is null");
            return (Criteria) this;
        }

        public Criteria andIsImmediatelyFulfilledIsNotNull() {
            addCriterion("IS_IMMEDIATELY_FULFILLED is not null");
            return (Criteria) this;
        }

        public Criteria andIsImmediatelyFulfilledEqualTo(String value) {
            addCriterion("IS_IMMEDIATELY_FULFILLED =", value, "isImmediatelyFulfilled");
            return (Criteria) this;
        }

        public Criteria andIsImmediatelyFulfilledNotEqualTo(String value) {
            addCriterion("IS_IMMEDIATELY_FULFILLED <>", value, "isImmediatelyFulfilled");
            return (Criteria) this;
        }

        public Criteria andIsImmediatelyFulfilledGreaterThan(String value) {
            addCriterion("IS_IMMEDIATELY_FULFILLED >", value, "isImmediatelyFulfilled");
            return (Criteria) this;
        }

        public Criteria andIsImmediatelyFulfilledGreaterThanOrEqualTo(String value) {
            addCriterion("IS_IMMEDIATELY_FULFILLED >=", value, "isImmediatelyFulfilled");
            return (Criteria) this;
        }

        public Criteria andIsImmediatelyFulfilledLessThan(String value) {
            addCriterion("IS_IMMEDIATELY_FULFILLED <", value, "isImmediatelyFulfilled");
            return (Criteria) this;
        }

        public Criteria andIsImmediatelyFulfilledLessThanOrEqualTo(String value) {
            addCriterion("IS_IMMEDIATELY_FULFILLED <=", value, "isImmediatelyFulfilled");
            return (Criteria) this;
        }

        public Criteria andIsImmediatelyFulfilledLike(String value) {
            addCriterion("IS_IMMEDIATELY_FULFILLED like", value, "isImmediatelyFulfilled");
            return (Criteria) this;
        }

        public Criteria andIsImmediatelyFulfilledNotLike(String value) {
            addCriterion("IS_IMMEDIATELY_FULFILLED not like", value, "isImmediatelyFulfilled");
            return (Criteria) this;
        }

        public Criteria andIsImmediatelyFulfilledIn(List<String> values) {
            addCriterion("IS_IMMEDIATELY_FULFILLED in", values, "isImmediatelyFulfilled");
            return (Criteria) this;
        }

        public Criteria andIsImmediatelyFulfilledNotIn(List<String> values) {
            addCriterion("IS_IMMEDIATELY_FULFILLED not in", values, "isImmediatelyFulfilled");
            return (Criteria) this;
        }

        public Criteria andIsImmediatelyFulfilledBetween(String value1, String value2) {
            addCriterion("IS_IMMEDIATELY_FULFILLED between", value1, value2, "isImmediatelyFulfilled");
            return (Criteria) this;
        }

        public Criteria andIsImmediatelyFulfilledNotBetween(String value1, String value2) {
            addCriterion("IS_IMMEDIATELY_FULFILLED not between", value1, value2, "isImmediatelyFulfilled");
            return (Criteria) this;
        }

        public Criteria andInventoryFacilityIdIsNull() {
            addCriterion("INVENTORY_FACILITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andInventoryFacilityIdIsNotNull() {
            addCriterion("INVENTORY_FACILITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryFacilityIdEqualTo(String value) {
            addCriterion("INVENTORY_FACILITY_ID =", value, "inventoryFacilityId");
            return (Criteria) this;
        }

        public Criteria andInventoryFacilityIdNotEqualTo(String value) {
            addCriterion("INVENTORY_FACILITY_ID <>", value, "inventoryFacilityId");
            return (Criteria) this;
        }

        public Criteria andInventoryFacilityIdGreaterThan(String value) {
            addCriterion("INVENTORY_FACILITY_ID >", value, "inventoryFacilityId");
            return (Criteria) this;
        }

        public Criteria andInventoryFacilityIdGreaterThanOrEqualTo(String value) {
            addCriterion("INVENTORY_FACILITY_ID >=", value, "inventoryFacilityId");
            return (Criteria) this;
        }

        public Criteria andInventoryFacilityIdLessThan(String value) {
            addCriterion("INVENTORY_FACILITY_ID <", value, "inventoryFacilityId");
            return (Criteria) this;
        }

        public Criteria andInventoryFacilityIdLessThanOrEqualTo(String value) {
            addCriterion("INVENTORY_FACILITY_ID <=", value, "inventoryFacilityId");
            return (Criteria) this;
        }

        public Criteria andInventoryFacilityIdLike(String value) {
            addCriterion("INVENTORY_FACILITY_ID like", value, "inventoryFacilityId");
            return (Criteria) this;
        }

        public Criteria andInventoryFacilityIdNotLike(String value) {
            addCriterion("INVENTORY_FACILITY_ID not like", value, "inventoryFacilityId");
            return (Criteria) this;
        }

        public Criteria andInventoryFacilityIdIn(List<String> values) {
            addCriterion("INVENTORY_FACILITY_ID in", values, "inventoryFacilityId");
            return (Criteria) this;
        }

        public Criteria andInventoryFacilityIdNotIn(List<String> values) {
            addCriterion("INVENTORY_FACILITY_ID not in", values, "inventoryFacilityId");
            return (Criteria) this;
        }

        public Criteria andInventoryFacilityIdBetween(String value1, String value2) {
            addCriterion("INVENTORY_FACILITY_ID between", value1, value2, "inventoryFacilityId");
            return (Criteria) this;
        }

        public Criteria andInventoryFacilityIdNotBetween(String value1, String value2) {
            addCriterion("INVENTORY_FACILITY_ID not between", value1, value2, "inventoryFacilityId");
            return (Criteria) this;
        }

        public Criteria andOneInventoryFacilityIsNull() {
            addCriterion("ONE_INVENTORY_FACILITY is null");
            return (Criteria) this;
        }

        public Criteria andOneInventoryFacilityIsNotNull() {
            addCriterion("ONE_INVENTORY_FACILITY is not null");
            return (Criteria) this;
        }

        public Criteria andOneInventoryFacilityEqualTo(String value) {
            addCriterion("ONE_INVENTORY_FACILITY =", value, "oneInventoryFacility");
            return (Criteria) this;
        }

        public Criteria andOneInventoryFacilityNotEqualTo(String value) {
            addCriterion("ONE_INVENTORY_FACILITY <>", value, "oneInventoryFacility");
            return (Criteria) this;
        }

        public Criteria andOneInventoryFacilityGreaterThan(String value) {
            addCriterion("ONE_INVENTORY_FACILITY >", value, "oneInventoryFacility");
            return (Criteria) this;
        }

        public Criteria andOneInventoryFacilityGreaterThanOrEqualTo(String value) {
            addCriterion("ONE_INVENTORY_FACILITY >=", value, "oneInventoryFacility");
            return (Criteria) this;
        }

        public Criteria andOneInventoryFacilityLessThan(String value) {
            addCriterion("ONE_INVENTORY_FACILITY <", value, "oneInventoryFacility");
            return (Criteria) this;
        }

        public Criteria andOneInventoryFacilityLessThanOrEqualTo(String value) {
            addCriterion("ONE_INVENTORY_FACILITY <=", value, "oneInventoryFacility");
            return (Criteria) this;
        }

        public Criteria andOneInventoryFacilityLike(String value) {
            addCriterion("ONE_INVENTORY_FACILITY like", value, "oneInventoryFacility");
            return (Criteria) this;
        }

        public Criteria andOneInventoryFacilityNotLike(String value) {
            addCriterion("ONE_INVENTORY_FACILITY not like", value, "oneInventoryFacility");
            return (Criteria) this;
        }

        public Criteria andOneInventoryFacilityIn(List<String> values) {
            addCriterion("ONE_INVENTORY_FACILITY in", values, "oneInventoryFacility");
            return (Criteria) this;
        }

        public Criteria andOneInventoryFacilityNotIn(List<String> values) {
            addCriterion("ONE_INVENTORY_FACILITY not in", values, "oneInventoryFacility");
            return (Criteria) this;
        }

        public Criteria andOneInventoryFacilityBetween(String value1, String value2) {
            addCriterion("ONE_INVENTORY_FACILITY between", value1, value2, "oneInventoryFacility");
            return (Criteria) this;
        }

        public Criteria andOneInventoryFacilityNotBetween(String value1, String value2) {
            addCriterion("ONE_INVENTORY_FACILITY not between", value1, value2, "oneInventoryFacility");
            return (Criteria) this;
        }

        public Criteria andCheckInventoryIsNull() {
            addCriterion("CHECK_INVENTORY is null");
            return (Criteria) this;
        }

        public Criteria andCheckInventoryIsNotNull() {
            addCriterion("CHECK_INVENTORY is not null");
            return (Criteria) this;
        }

        public Criteria andCheckInventoryEqualTo(String value) {
            addCriterion("CHECK_INVENTORY =", value, "checkInventory");
            return (Criteria) this;
        }

        public Criteria andCheckInventoryNotEqualTo(String value) {
            addCriterion("CHECK_INVENTORY <>", value, "checkInventory");
            return (Criteria) this;
        }

        public Criteria andCheckInventoryGreaterThan(String value) {
            addCriterion("CHECK_INVENTORY >", value, "checkInventory");
            return (Criteria) this;
        }

        public Criteria andCheckInventoryGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_INVENTORY >=", value, "checkInventory");
            return (Criteria) this;
        }

        public Criteria andCheckInventoryLessThan(String value) {
            addCriterion("CHECK_INVENTORY <", value, "checkInventory");
            return (Criteria) this;
        }

        public Criteria andCheckInventoryLessThanOrEqualTo(String value) {
            addCriterion("CHECK_INVENTORY <=", value, "checkInventory");
            return (Criteria) this;
        }

        public Criteria andCheckInventoryLike(String value) {
            addCriterion("CHECK_INVENTORY like", value, "checkInventory");
            return (Criteria) this;
        }

        public Criteria andCheckInventoryNotLike(String value) {
            addCriterion("CHECK_INVENTORY not like", value, "checkInventory");
            return (Criteria) this;
        }

        public Criteria andCheckInventoryIn(List<String> values) {
            addCriterion("CHECK_INVENTORY in", values, "checkInventory");
            return (Criteria) this;
        }

        public Criteria andCheckInventoryNotIn(List<String> values) {
            addCriterion("CHECK_INVENTORY not in", values, "checkInventory");
            return (Criteria) this;
        }

        public Criteria andCheckInventoryBetween(String value1, String value2) {
            addCriterion("CHECK_INVENTORY between", value1, value2, "checkInventory");
            return (Criteria) this;
        }

        public Criteria andCheckInventoryNotBetween(String value1, String value2) {
            addCriterion("CHECK_INVENTORY not between", value1, value2, "checkInventory");
            return (Criteria) this;
        }

        public Criteria andReserveInventoryIsNull() {
            addCriterion("RESERVE_INVENTORY is null");
            return (Criteria) this;
        }

        public Criteria andReserveInventoryIsNotNull() {
            addCriterion("RESERVE_INVENTORY is not null");
            return (Criteria) this;
        }

        public Criteria andReserveInventoryEqualTo(String value) {
            addCriterion("RESERVE_INVENTORY =", value, "reserveInventory");
            return (Criteria) this;
        }

        public Criteria andReserveInventoryNotEqualTo(String value) {
            addCriterion("RESERVE_INVENTORY <>", value, "reserveInventory");
            return (Criteria) this;
        }

        public Criteria andReserveInventoryGreaterThan(String value) {
            addCriterion("RESERVE_INVENTORY >", value, "reserveInventory");
            return (Criteria) this;
        }

        public Criteria andReserveInventoryGreaterThanOrEqualTo(String value) {
            addCriterion("RESERVE_INVENTORY >=", value, "reserveInventory");
            return (Criteria) this;
        }

        public Criteria andReserveInventoryLessThan(String value) {
            addCriterion("RESERVE_INVENTORY <", value, "reserveInventory");
            return (Criteria) this;
        }

        public Criteria andReserveInventoryLessThanOrEqualTo(String value) {
            addCriterion("RESERVE_INVENTORY <=", value, "reserveInventory");
            return (Criteria) this;
        }

        public Criteria andReserveInventoryLike(String value) {
            addCriterion("RESERVE_INVENTORY like", value, "reserveInventory");
            return (Criteria) this;
        }

        public Criteria andReserveInventoryNotLike(String value) {
            addCriterion("RESERVE_INVENTORY not like", value, "reserveInventory");
            return (Criteria) this;
        }

        public Criteria andReserveInventoryIn(List<String> values) {
            addCriterion("RESERVE_INVENTORY in", values, "reserveInventory");
            return (Criteria) this;
        }

        public Criteria andReserveInventoryNotIn(List<String> values) {
            addCriterion("RESERVE_INVENTORY not in", values, "reserveInventory");
            return (Criteria) this;
        }

        public Criteria andReserveInventoryBetween(String value1, String value2) {
            addCriterion("RESERVE_INVENTORY between", value1, value2, "reserveInventory");
            return (Criteria) this;
        }

        public Criteria andReserveInventoryNotBetween(String value1, String value2) {
            addCriterion("RESERVE_INVENTORY not between", value1, value2, "reserveInventory");
            return (Criteria) this;
        }

        public Criteria andReserveOrderEnumIdIsNull() {
            addCriterion("RESERVE_ORDER_ENUM_ID is null");
            return (Criteria) this;
        }

        public Criteria andReserveOrderEnumIdIsNotNull() {
            addCriterion("RESERVE_ORDER_ENUM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andReserveOrderEnumIdEqualTo(String value) {
            addCriterion("RESERVE_ORDER_ENUM_ID =", value, "reserveOrderEnumId");
            return (Criteria) this;
        }

        public Criteria andReserveOrderEnumIdNotEqualTo(String value) {
            addCriterion("RESERVE_ORDER_ENUM_ID <>", value, "reserveOrderEnumId");
            return (Criteria) this;
        }

        public Criteria andReserveOrderEnumIdGreaterThan(String value) {
            addCriterion("RESERVE_ORDER_ENUM_ID >", value, "reserveOrderEnumId");
            return (Criteria) this;
        }

        public Criteria andReserveOrderEnumIdGreaterThanOrEqualTo(String value) {
            addCriterion("RESERVE_ORDER_ENUM_ID >=", value, "reserveOrderEnumId");
            return (Criteria) this;
        }

        public Criteria andReserveOrderEnumIdLessThan(String value) {
            addCriterion("RESERVE_ORDER_ENUM_ID <", value, "reserveOrderEnumId");
            return (Criteria) this;
        }

        public Criteria andReserveOrderEnumIdLessThanOrEqualTo(String value) {
            addCriterion("RESERVE_ORDER_ENUM_ID <=", value, "reserveOrderEnumId");
            return (Criteria) this;
        }

        public Criteria andReserveOrderEnumIdLike(String value) {
            addCriterion("RESERVE_ORDER_ENUM_ID like", value, "reserveOrderEnumId");
            return (Criteria) this;
        }

        public Criteria andReserveOrderEnumIdNotLike(String value) {
            addCriterion("RESERVE_ORDER_ENUM_ID not like", value, "reserveOrderEnumId");
            return (Criteria) this;
        }

        public Criteria andReserveOrderEnumIdIn(List<String> values) {
            addCriterion("RESERVE_ORDER_ENUM_ID in", values, "reserveOrderEnumId");
            return (Criteria) this;
        }

        public Criteria andReserveOrderEnumIdNotIn(List<String> values) {
            addCriterion("RESERVE_ORDER_ENUM_ID not in", values, "reserveOrderEnumId");
            return (Criteria) this;
        }

        public Criteria andReserveOrderEnumIdBetween(String value1, String value2) {
            addCriterion("RESERVE_ORDER_ENUM_ID between", value1, value2, "reserveOrderEnumId");
            return (Criteria) this;
        }

        public Criteria andReserveOrderEnumIdNotBetween(String value1, String value2) {
            addCriterion("RESERVE_ORDER_ENUM_ID not between", value1, value2, "reserveOrderEnumId");
            return (Criteria) this;
        }

        public Criteria andRequireInventoryIsNull() {
            addCriterion("REQUIRE_INVENTORY is null");
            return (Criteria) this;
        }

        public Criteria andRequireInventoryIsNotNull() {
            addCriterion("REQUIRE_INVENTORY is not null");
            return (Criteria) this;
        }

        public Criteria andRequireInventoryEqualTo(String value) {
            addCriterion("REQUIRE_INVENTORY =", value, "requireInventory");
            return (Criteria) this;
        }

        public Criteria andRequireInventoryNotEqualTo(String value) {
            addCriterion("REQUIRE_INVENTORY <>", value, "requireInventory");
            return (Criteria) this;
        }

        public Criteria andRequireInventoryGreaterThan(String value) {
            addCriterion("REQUIRE_INVENTORY >", value, "requireInventory");
            return (Criteria) this;
        }

        public Criteria andRequireInventoryGreaterThanOrEqualTo(String value) {
            addCriterion("REQUIRE_INVENTORY >=", value, "requireInventory");
            return (Criteria) this;
        }

        public Criteria andRequireInventoryLessThan(String value) {
            addCriterion("REQUIRE_INVENTORY <", value, "requireInventory");
            return (Criteria) this;
        }

        public Criteria andRequireInventoryLessThanOrEqualTo(String value) {
            addCriterion("REQUIRE_INVENTORY <=", value, "requireInventory");
            return (Criteria) this;
        }

        public Criteria andRequireInventoryLike(String value) {
            addCriterion("REQUIRE_INVENTORY like", value, "requireInventory");
            return (Criteria) this;
        }

        public Criteria andRequireInventoryNotLike(String value) {
            addCriterion("REQUIRE_INVENTORY not like", value, "requireInventory");
            return (Criteria) this;
        }

        public Criteria andRequireInventoryIn(List<String> values) {
            addCriterion("REQUIRE_INVENTORY in", values, "requireInventory");
            return (Criteria) this;
        }

        public Criteria andRequireInventoryNotIn(List<String> values) {
            addCriterion("REQUIRE_INVENTORY not in", values, "requireInventory");
            return (Criteria) this;
        }

        public Criteria andRequireInventoryBetween(String value1, String value2) {
            addCriterion("REQUIRE_INVENTORY between", value1, value2, "requireInventory");
            return (Criteria) this;
        }

        public Criteria andRequireInventoryNotBetween(String value1, String value2) {
            addCriterion("REQUIRE_INVENTORY not between", value1, value2, "requireInventory");
            return (Criteria) this;
        }

        public Criteria andBalanceResOnOrderCreationIsNull() {
            addCriterion("BALANCE_RES_ON_ORDER_CREATION is null");
            return (Criteria) this;
        }

        public Criteria andBalanceResOnOrderCreationIsNotNull() {
            addCriterion("BALANCE_RES_ON_ORDER_CREATION is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceResOnOrderCreationEqualTo(String value) {
            addCriterion("BALANCE_RES_ON_ORDER_CREATION =", value, "balanceResOnOrderCreation");
            return (Criteria) this;
        }

        public Criteria andBalanceResOnOrderCreationNotEqualTo(String value) {
            addCriterion("BALANCE_RES_ON_ORDER_CREATION <>", value, "balanceResOnOrderCreation");
            return (Criteria) this;
        }

        public Criteria andBalanceResOnOrderCreationGreaterThan(String value) {
            addCriterion("BALANCE_RES_ON_ORDER_CREATION >", value, "balanceResOnOrderCreation");
            return (Criteria) this;
        }

        public Criteria andBalanceResOnOrderCreationGreaterThanOrEqualTo(String value) {
            addCriterion("BALANCE_RES_ON_ORDER_CREATION >=", value, "balanceResOnOrderCreation");
            return (Criteria) this;
        }

        public Criteria andBalanceResOnOrderCreationLessThan(String value) {
            addCriterion("BALANCE_RES_ON_ORDER_CREATION <", value, "balanceResOnOrderCreation");
            return (Criteria) this;
        }

        public Criteria andBalanceResOnOrderCreationLessThanOrEqualTo(String value) {
            addCriterion("BALANCE_RES_ON_ORDER_CREATION <=", value, "balanceResOnOrderCreation");
            return (Criteria) this;
        }

        public Criteria andBalanceResOnOrderCreationLike(String value) {
            addCriterion("BALANCE_RES_ON_ORDER_CREATION like", value, "balanceResOnOrderCreation");
            return (Criteria) this;
        }

        public Criteria andBalanceResOnOrderCreationNotLike(String value) {
            addCriterion("BALANCE_RES_ON_ORDER_CREATION not like", value, "balanceResOnOrderCreation");
            return (Criteria) this;
        }

        public Criteria andBalanceResOnOrderCreationIn(List<String> values) {
            addCriterion("BALANCE_RES_ON_ORDER_CREATION in", values, "balanceResOnOrderCreation");
            return (Criteria) this;
        }

        public Criteria andBalanceResOnOrderCreationNotIn(List<String> values) {
            addCriterion("BALANCE_RES_ON_ORDER_CREATION not in", values, "balanceResOnOrderCreation");
            return (Criteria) this;
        }

        public Criteria andBalanceResOnOrderCreationBetween(String value1, String value2) {
            addCriterion("BALANCE_RES_ON_ORDER_CREATION between", value1, value2, "balanceResOnOrderCreation");
            return (Criteria) this;
        }

        public Criteria andBalanceResOnOrderCreationNotBetween(String value1, String value2) {
            addCriterion("BALANCE_RES_ON_ORDER_CREATION not between", value1, value2, "balanceResOnOrderCreation");
            return (Criteria) this;
        }

        public Criteria andRequirementMethodEnumIdIsNull() {
            addCriterion("REQUIREMENT_METHOD_ENUM_ID is null");
            return (Criteria) this;
        }

        public Criteria andRequirementMethodEnumIdIsNotNull() {
            addCriterion("REQUIREMENT_METHOD_ENUM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRequirementMethodEnumIdEqualTo(String value) {
            addCriterion("REQUIREMENT_METHOD_ENUM_ID =", value, "requirementMethodEnumId");
            return (Criteria) this;
        }

        public Criteria andRequirementMethodEnumIdNotEqualTo(String value) {
            addCriterion("REQUIREMENT_METHOD_ENUM_ID <>", value, "requirementMethodEnumId");
            return (Criteria) this;
        }

        public Criteria andRequirementMethodEnumIdGreaterThan(String value) {
            addCriterion("REQUIREMENT_METHOD_ENUM_ID >", value, "requirementMethodEnumId");
            return (Criteria) this;
        }

        public Criteria andRequirementMethodEnumIdGreaterThanOrEqualTo(String value) {
            addCriterion("REQUIREMENT_METHOD_ENUM_ID >=", value, "requirementMethodEnumId");
            return (Criteria) this;
        }

        public Criteria andRequirementMethodEnumIdLessThan(String value) {
            addCriterion("REQUIREMENT_METHOD_ENUM_ID <", value, "requirementMethodEnumId");
            return (Criteria) this;
        }

        public Criteria andRequirementMethodEnumIdLessThanOrEqualTo(String value) {
            addCriterion("REQUIREMENT_METHOD_ENUM_ID <=", value, "requirementMethodEnumId");
            return (Criteria) this;
        }

        public Criteria andRequirementMethodEnumIdLike(String value) {
            addCriterion("REQUIREMENT_METHOD_ENUM_ID like", value, "requirementMethodEnumId");
            return (Criteria) this;
        }

        public Criteria andRequirementMethodEnumIdNotLike(String value) {
            addCriterion("REQUIREMENT_METHOD_ENUM_ID not like", value, "requirementMethodEnumId");
            return (Criteria) this;
        }

        public Criteria andRequirementMethodEnumIdIn(List<String> values) {
            addCriterion("REQUIREMENT_METHOD_ENUM_ID in", values, "requirementMethodEnumId");
            return (Criteria) this;
        }

        public Criteria andRequirementMethodEnumIdNotIn(List<String> values) {
            addCriterion("REQUIREMENT_METHOD_ENUM_ID not in", values, "requirementMethodEnumId");
            return (Criteria) this;
        }

        public Criteria andRequirementMethodEnumIdBetween(String value1, String value2) {
            addCriterion("REQUIREMENT_METHOD_ENUM_ID between", value1, value2, "requirementMethodEnumId");
            return (Criteria) this;
        }

        public Criteria andRequirementMethodEnumIdNotBetween(String value1, String value2) {
            addCriterion("REQUIREMENT_METHOD_ENUM_ID not between", value1, value2, "requirementMethodEnumId");
            return (Criteria) this;
        }

        public Criteria andOrderNumberPrefixIsNull() {
            addCriterion("ORDER_NUMBER_PREFIX is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberPrefixIsNotNull() {
            addCriterion("ORDER_NUMBER_PREFIX is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberPrefixEqualTo(String value) {
            addCriterion("ORDER_NUMBER_PREFIX =", value, "orderNumberPrefix");
            return (Criteria) this;
        }

        public Criteria andOrderNumberPrefixNotEqualTo(String value) {
            addCriterion("ORDER_NUMBER_PREFIX <>", value, "orderNumberPrefix");
            return (Criteria) this;
        }

        public Criteria andOrderNumberPrefixGreaterThan(String value) {
            addCriterion("ORDER_NUMBER_PREFIX >", value, "orderNumberPrefix");
            return (Criteria) this;
        }

        public Criteria andOrderNumberPrefixGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_NUMBER_PREFIX >=", value, "orderNumberPrefix");
            return (Criteria) this;
        }

        public Criteria andOrderNumberPrefixLessThan(String value) {
            addCriterion("ORDER_NUMBER_PREFIX <", value, "orderNumberPrefix");
            return (Criteria) this;
        }

        public Criteria andOrderNumberPrefixLessThanOrEqualTo(String value) {
            addCriterion("ORDER_NUMBER_PREFIX <=", value, "orderNumberPrefix");
            return (Criteria) this;
        }

        public Criteria andOrderNumberPrefixLike(String value) {
            addCriterion("ORDER_NUMBER_PREFIX like", value, "orderNumberPrefix");
            return (Criteria) this;
        }

        public Criteria andOrderNumberPrefixNotLike(String value) {
            addCriterion("ORDER_NUMBER_PREFIX not like", value, "orderNumberPrefix");
            return (Criteria) this;
        }

        public Criteria andOrderNumberPrefixIn(List<String> values) {
            addCriterion("ORDER_NUMBER_PREFIX in", values, "orderNumberPrefix");
            return (Criteria) this;
        }

        public Criteria andOrderNumberPrefixNotIn(List<String> values) {
            addCriterion("ORDER_NUMBER_PREFIX not in", values, "orderNumberPrefix");
            return (Criteria) this;
        }

        public Criteria andOrderNumberPrefixBetween(String value1, String value2) {
            addCriterion("ORDER_NUMBER_PREFIX between", value1, value2, "orderNumberPrefix");
            return (Criteria) this;
        }

        public Criteria andOrderNumberPrefixNotBetween(String value1, String value2) {
            addCriterion("ORDER_NUMBER_PREFIX not between", value1, value2, "orderNumberPrefix");
            return (Criteria) this;
        }

        public Criteria andDefaultLocaleStringIsNull() {
            addCriterion("DEFAULT_LOCALE_STRING is null");
            return (Criteria) this;
        }

        public Criteria andDefaultLocaleStringIsNotNull() {
            addCriterion("DEFAULT_LOCALE_STRING is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultLocaleStringEqualTo(String value) {
            addCriterion("DEFAULT_LOCALE_STRING =", value, "defaultLocaleString");
            return (Criteria) this;
        }

        public Criteria andDefaultLocaleStringNotEqualTo(String value) {
            addCriterion("DEFAULT_LOCALE_STRING <>", value, "defaultLocaleString");
            return (Criteria) this;
        }

        public Criteria andDefaultLocaleStringGreaterThan(String value) {
            addCriterion("DEFAULT_LOCALE_STRING >", value, "defaultLocaleString");
            return (Criteria) this;
        }

        public Criteria andDefaultLocaleStringGreaterThanOrEqualTo(String value) {
            addCriterion("DEFAULT_LOCALE_STRING >=", value, "defaultLocaleString");
            return (Criteria) this;
        }

        public Criteria andDefaultLocaleStringLessThan(String value) {
            addCriterion("DEFAULT_LOCALE_STRING <", value, "defaultLocaleString");
            return (Criteria) this;
        }

        public Criteria andDefaultLocaleStringLessThanOrEqualTo(String value) {
            addCriterion("DEFAULT_LOCALE_STRING <=", value, "defaultLocaleString");
            return (Criteria) this;
        }

        public Criteria andDefaultLocaleStringLike(String value) {
            addCriterion("DEFAULT_LOCALE_STRING like", value, "defaultLocaleString");
            return (Criteria) this;
        }

        public Criteria andDefaultLocaleStringNotLike(String value) {
            addCriterion("DEFAULT_LOCALE_STRING not like", value, "defaultLocaleString");
            return (Criteria) this;
        }

        public Criteria andDefaultLocaleStringIn(List<String> values) {
            addCriterion("DEFAULT_LOCALE_STRING in", values, "defaultLocaleString");
            return (Criteria) this;
        }

        public Criteria andDefaultLocaleStringNotIn(List<String> values) {
            addCriterion("DEFAULT_LOCALE_STRING not in", values, "defaultLocaleString");
            return (Criteria) this;
        }

        public Criteria andDefaultLocaleStringBetween(String value1, String value2) {
            addCriterion("DEFAULT_LOCALE_STRING between", value1, value2, "defaultLocaleString");
            return (Criteria) this;
        }

        public Criteria andDefaultLocaleStringNotBetween(String value1, String value2) {
            addCriterion("DEFAULT_LOCALE_STRING not between", value1, value2, "defaultLocaleString");
            return (Criteria) this;
        }

        public Criteria andDefaultCurrencyUomIdIsNull() {
            addCriterion("DEFAULT_CURRENCY_UOM_ID is null");
            return (Criteria) this;
        }

        public Criteria andDefaultCurrencyUomIdIsNotNull() {
            addCriterion("DEFAULT_CURRENCY_UOM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultCurrencyUomIdEqualTo(String value) {
            addCriterion("DEFAULT_CURRENCY_UOM_ID =", value, "defaultCurrencyUomId");
            return (Criteria) this;
        }

        public Criteria andDefaultCurrencyUomIdNotEqualTo(String value) {
            addCriterion("DEFAULT_CURRENCY_UOM_ID <>", value, "defaultCurrencyUomId");
            return (Criteria) this;
        }

        public Criteria andDefaultCurrencyUomIdGreaterThan(String value) {
            addCriterion("DEFAULT_CURRENCY_UOM_ID >", value, "defaultCurrencyUomId");
            return (Criteria) this;
        }

        public Criteria andDefaultCurrencyUomIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEFAULT_CURRENCY_UOM_ID >=", value, "defaultCurrencyUomId");
            return (Criteria) this;
        }

        public Criteria andDefaultCurrencyUomIdLessThan(String value) {
            addCriterion("DEFAULT_CURRENCY_UOM_ID <", value, "defaultCurrencyUomId");
            return (Criteria) this;
        }

        public Criteria andDefaultCurrencyUomIdLessThanOrEqualTo(String value) {
            addCriterion("DEFAULT_CURRENCY_UOM_ID <=", value, "defaultCurrencyUomId");
            return (Criteria) this;
        }

        public Criteria andDefaultCurrencyUomIdLike(String value) {
            addCriterion("DEFAULT_CURRENCY_UOM_ID like", value, "defaultCurrencyUomId");
            return (Criteria) this;
        }

        public Criteria andDefaultCurrencyUomIdNotLike(String value) {
            addCriterion("DEFAULT_CURRENCY_UOM_ID not like", value, "defaultCurrencyUomId");
            return (Criteria) this;
        }

        public Criteria andDefaultCurrencyUomIdIn(List<String> values) {
            addCriterion("DEFAULT_CURRENCY_UOM_ID in", values, "defaultCurrencyUomId");
            return (Criteria) this;
        }

        public Criteria andDefaultCurrencyUomIdNotIn(List<String> values) {
            addCriterion("DEFAULT_CURRENCY_UOM_ID not in", values, "defaultCurrencyUomId");
            return (Criteria) this;
        }

        public Criteria andDefaultCurrencyUomIdBetween(String value1, String value2) {
            addCriterion("DEFAULT_CURRENCY_UOM_ID between", value1, value2, "defaultCurrencyUomId");
            return (Criteria) this;
        }

        public Criteria andDefaultCurrencyUomIdNotBetween(String value1, String value2) {
            addCriterion("DEFAULT_CURRENCY_UOM_ID not between", value1, value2, "defaultCurrencyUomId");
            return (Criteria) this;
        }

        public Criteria andDefaultTimeZoneStringIsNull() {
            addCriterion("DEFAULT_TIME_ZONE_STRING is null");
            return (Criteria) this;
        }

        public Criteria andDefaultTimeZoneStringIsNotNull() {
            addCriterion("DEFAULT_TIME_ZONE_STRING is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultTimeZoneStringEqualTo(String value) {
            addCriterion("DEFAULT_TIME_ZONE_STRING =", value, "defaultTimeZoneString");
            return (Criteria) this;
        }

        public Criteria andDefaultTimeZoneStringNotEqualTo(String value) {
            addCriterion("DEFAULT_TIME_ZONE_STRING <>", value, "defaultTimeZoneString");
            return (Criteria) this;
        }

        public Criteria andDefaultTimeZoneStringGreaterThan(String value) {
            addCriterion("DEFAULT_TIME_ZONE_STRING >", value, "defaultTimeZoneString");
            return (Criteria) this;
        }

        public Criteria andDefaultTimeZoneStringGreaterThanOrEqualTo(String value) {
            addCriterion("DEFAULT_TIME_ZONE_STRING >=", value, "defaultTimeZoneString");
            return (Criteria) this;
        }

        public Criteria andDefaultTimeZoneStringLessThan(String value) {
            addCriterion("DEFAULT_TIME_ZONE_STRING <", value, "defaultTimeZoneString");
            return (Criteria) this;
        }

        public Criteria andDefaultTimeZoneStringLessThanOrEqualTo(String value) {
            addCriterion("DEFAULT_TIME_ZONE_STRING <=", value, "defaultTimeZoneString");
            return (Criteria) this;
        }

        public Criteria andDefaultTimeZoneStringLike(String value) {
            addCriterion("DEFAULT_TIME_ZONE_STRING like", value, "defaultTimeZoneString");
            return (Criteria) this;
        }

        public Criteria andDefaultTimeZoneStringNotLike(String value) {
            addCriterion("DEFAULT_TIME_ZONE_STRING not like", value, "defaultTimeZoneString");
            return (Criteria) this;
        }

        public Criteria andDefaultTimeZoneStringIn(List<String> values) {
            addCriterion("DEFAULT_TIME_ZONE_STRING in", values, "defaultTimeZoneString");
            return (Criteria) this;
        }

        public Criteria andDefaultTimeZoneStringNotIn(List<String> values) {
            addCriterion("DEFAULT_TIME_ZONE_STRING not in", values, "defaultTimeZoneString");
            return (Criteria) this;
        }

        public Criteria andDefaultTimeZoneStringBetween(String value1, String value2) {
            addCriterion("DEFAULT_TIME_ZONE_STRING between", value1, value2, "defaultTimeZoneString");
            return (Criteria) this;
        }

        public Criteria andDefaultTimeZoneStringNotBetween(String value1, String value2) {
            addCriterion("DEFAULT_TIME_ZONE_STRING not between", value1, value2, "defaultTimeZoneString");
            return (Criteria) this;
        }

        public Criteria andDefaultSalesChannelEnumIdIsNull() {
            addCriterion("DEFAULT_SALES_CHANNEL_ENUM_ID is null");
            return (Criteria) this;
        }

        public Criteria andDefaultSalesChannelEnumIdIsNotNull() {
            addCriterion("DEFAULT_SALES_CHANNEL_ENUM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultSalesChannelEnumIdEqualTo(String value) {
            addCriterion("DEFAULT_SALES_CHANNEL_ENUM_ID =", value, "defaultSalesChannelEnumId");
            return (Criteria) this;
        }

        public Criteria andDefaultSalesChannelEnumIdNotEqualTo(String value) {
            addCriterion("DEFAULT_SALES_CHANNEL_ENUM_ID <>", value, "defaultSalesChannelEnumId");
            return (Criteria) this;
        }

        public Criteria andDefaultSalesChannelEnumIdGreaterThan(String value) {
            addCriterion("DEFAULT_SALES_CHANNEL_ENUM_ID >", value, "defaultSalesChannelEnumId");
            return (Criteria) this;
        }

        public Criteria andDefaultSalesChannelEnumIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEFAULT_SALES_CHANNEL_ENUM_ID >=", value, "defaultSalesChannelEnumId");
            return (Criteria) this;
        }

        public Criteria andDefaultSalesChannelEnumIdLessThan(String value) {
            addCriterion("DEFAULT_SALES_CHANNEL_ENUM_ID <", value, "defaultSalesChannelEnumId");
            return (Criteria) this;
        }

        public Criteria andDefaultSalesChannelEnumIdLessThanOrEqualTo(String value) {
            addCriterion("DEFAULT_SALES_CHANNEL_ENUM_ID <=", value, "defaultSalesChannelEnumId");
            return (Criteria) this;
        }

        public Criteria andDefaultSalesChannelEnumIdLike(String value) {
            addCriterion("DEFAULT_SALES_CHANNEL_ENUM_ID like", value, "defaultSalesChannelEnumId");
            return (Criteria) this;
        }

        public Criteria andDefaultSalesChannelEnumIdNotLike(String value) {
            addCriterion("DEFAULT_SALES_CHANNEL_ENUM_ID not like", value, "defaultSalesChannelEnumId");
            return (Criteria) this;
        }

        public Criteria andDefaultSalesChannelEnumIdIn(List<String> values) {
            addCriterion("DEFAULT_SALES_CHANNEL_ENUM_ID in", values, "defaultSalesChannelEnumId");
            return (Criteria) this;
        }

        public Criteria andDefaultSalesChannelEnumIdNotIn(List<String> values) {
            addCriterion("DEFAULT_SALES_CHANNEL_ENUM_ID not in", values, "defaultSalesChannelEnumId");
            return (Criteria) this;
        }

        public Criteria andDefaultSalesChannelEnumIdBetween(String value1, String value2) {
            addCriterion("DEFAULT_SALES_CHANNEL_ENUM_ID between", value1, value2, "defaultSalesChannelEnumId");
            return (Criteria) this;
        }

        public Criteria andDefaultSalesChannelEnumIdNotBetween(String value1, String value2) {
            addCriterion("DEFAULT_SALES_CHANNEL_ENUM_ID not between", value1, value2, "defaultSalesChannelEnumId");
            return (Criteria) this;
        }

        public Criteria andAllowPasswordIsNull() {
            addCriterion("ALLOW_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andAllowPasswordIsNotNull() {
            addCriterion("ALLOW_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andAllowPasswordEqualTo(String value) {
            addCriterion("ALLOW_PASSWORD =", value, "allowPassword");
            return (Criteria) this;
        }

        public Criteria andAllowPasswordNotEqualTo(String value) {
            addCriterion("ALLOW_PASSWORD <>", value, "allowPassword");
            return (Criteria) this;
        }

        public Criteria andAllowPasswordGreaterThan(String value) {
            addCriterion("ALLOW_PASSWORD >", value, "allowPassword");
            return (Criteria) this;
        }

        public Criteria andAllowPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("ALLOW_PASSWORD >=", value, "allowPassword");
            return (Criteria) this;
        }

        public Criteria andAllowPasswordLessThan(String value) {
            addCriterion("ALLOW_PASSWORD <", value, "allowPassword");
            return (Criteria) this;
        }

        public Criteria andAllowPasswordLessThanOrEqualTo(String value) {
            addCriterion("ALLOW_PASSWORD <=", value, "allowPassword");
            return (Criteria) this;
        }

        public Criteria andAllowPasswordLike(String value) {
            addCriterion("ALLOW_PASSWORD like", value, "allowPassword");
            return (Criteria) this;
        }

        public Criteria andAllowPasswordNotLike(String value) {
            addCriterion("ALLOW_PASSWORD not like", value, "allowPassword");
            return (Criteria) this;
        }

        public Criteria andAllowPasswordIn(List<String> values) {
            addCriterion("ALLOW_PASSWORD in", values, "allowPassword");
            return (Criteria) this;
        }

        public Criteria andAllowPasswordNotIn(List<String> values) {
            addCriterion("ALLOW_PASSWORD not in", values, "allowPassword");
            return (Criteria) this;
        }

        public Criteria andAllowPasswordBetween(String value1, String value2) {
            addCriterion("ALLOW_PASSWORD between", value1, value2, "allowPassword");
            return (Criteria) this;
        }

        public Criteria andAllowPasswordNotBetween(String value1, String value2) {
            addCriterion("ALLOW_PASSWORD not between", value1, value2, "allowPassword");
            return (Criteria) this;
        }

        public Criteria andDefaultPasswordIsNull() {
            addCriterion("DEFAULT_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andDefaultPasswordIsNotNull() {
            addCriterion("DEFAULT_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultPasswordEqualTo(String value) {
            addCriterion("DEFAULT_PASSWORD =", value, "defaultPassword");
            return (Criteria) this;
        }

        public Criteria andDefaultPasswordNotEqualTo(String value) {
            addCriterion("DEFAULT_PASSWORD <>", value, "defaultPassword");
            return (Criteria) this;
        }

        public Criteria andDefaultPasswordGreaterThan(String value) {
            addCriterion("DEFAULT_PASSWORD >", value, "defaultPassword");
            return (Criteria) this;
        }

        public Criteria andDefaultPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("DEFAULT_PASSWORD >=", value, "defaultPassword");
            return (Criteria) this;
        }

        public Criteria andDefaultPasswordLessThan(String value) {
            addCriterion("DEFAULT_PASSWORD <", value, "defaultPassword");
            return (Criteria) this;
        }

        public Criteria andDefaultPasswordLessThanOrEqualTo(String value) {
            addCriterion("DEFAULT_PASSWORD <=", value, "defaultPassword");
            return (Criteria) this;
        }

        public Criteria andDefaultPasswordLike(String value) {
            addCriterion("DEFAULT_PASSWORD like", value, "defaultPassword");
            return (Criteria) this;
        }

        public Criteria andDefaultPasswordNotLike(String value) {
            addCriterion("DEFAULT_PASSWORD not like", value, "defaultPassword");
            return (Criteria) this;
        }

        public Criteria andDefaultPasswordIn(List<String> values) {
            addCriterion("DEFAULT_PASSWORD in", values, "defaultPassword");
            return (Criteria) this;
        }

        public Criteria andDefaultPasswordNotIn(List<String> values) {
            addCriterion("DEFAULT_PASSWORD not in", values, "defaultPassword");
            return (Criteria) this;
        }

        public Criteria andDefaultPasswordBetween(String value1, String value2) {
            addCriterion("DEFAULT_PASSWORD between", value1, value2, "defaultPassword");
            return (Criteria) this;
        }

        public Criteria andDefaultPasswordNotBetween(String value1, String value2) {
            addCriterion("DEFAULT_PASSWORD not between", value1, value2, "defaultPassword");
            return (Criteria) this;
        }

        public Criteria andExplodeOrderItemsIsNull() {
            addCriterion("EXPLODE_ORDER_ITEMS is null");
            return (Criteria) this;
        }

        public Criteria andExplodeOrderItemsIsNotNull() {
            addCriterion("EXPLODE_ORDER_ITEMS is not null");
            return (Criteria) this;
        }

        public Criteria andExplodeOrderItemsEqualTo(String value) {
            addCriterion("EXPLODE_ORDER_ITEMS =", value, "explodeOrderItems");
            return (Criteria) this;
        }

        public Criteria andExplodeOrderItemsNotEqualTo(String value) {
            addCriterion("EXPLODE_ORDER_ITEMS <>", value, "explodeOrderItems");
            return (Criteria) this;
        }

        public Criteria andExplodeOrderItemsGreaterThan(String value) {
            addCriterion("EXPLODE_ORDER_ITEMS >", value, "explodeOrderItems");
            return (Criteria) this;
        }

        public Criteria andExplodeOrderItemsGreaterThanOrEqualTo(String value) {
            addCriterion("EXPLODE_ORDER_ITEMS >=", value, "explodeOrderItems");
            return (Criteria) this;
        }

        public Criteria andExplodeOrderItemsLessThan(String value) {
            addCriterion("EXPLODE_ORDER_ITEMS <", value, "explodeOrderItems");
            return (Criteria) this;
        }

        public Criteria andExplodeOrderItemsLessThanOrEqualTo(String value) {
            addCriterion("EXPLODE_ORDER_ITEMS <=", value, "explodeOrderItems");
            return (Criteria) this;
        }

        public Criteria andExplodeOrderItemsLike(String value) {
            addCriterion("EXPLODE_ORDER_ITEMS like", value, "explodeOrderItems");
            return (Criteria) this;
        }

        public Criteria andExplodeOrderItemsNotLike(String value) {
            addCriterion("EXPLODE_ORDER_ITEMS not like", value, "explodeOrderItems");
            return (Criteria) this;
        }

        public Criteria andExplodeOrderItemsIn(List<String> values) {
            addCriterion("EXPLODE_ORDER_ITEMS in", values, "explodeOrderItems");
            return (Criteria) this;
        }

        public Criteria andExplodeOrderItemsNotIn(List<String> values) {
            addCriterion("EXPLODE_ORDER_ITEMS not in", values, "explodeOrderItems");
            return (Criteria) this;
        }

        public Criteria andExplodeOrderItemsBetween(String value1, String value2) {
            addCriterion("EXPLODE_ORDER_ITEMS between", value1, value2, "explodeOrderItems");
            return (Criteria) this;
        }

        public Criteria andExplodeOrderItemsNotBetween(String value1, String value2) {
            addCriterion("EXPLODE_ORDER_ITEMS not between", value1, value2, "explodeOrderItems");
            return (Criteria) this;
        }

        public Criteria andCheckGcBalanceIsNull() {
            addCriterion("CHECK_GC_BALANCE is null");
            return (Criteria) this;
        }

        public Criteria andCheckGcBalanceIsNotNull() {
            addCriterion("CHECK_GC_BALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andCheckGcBalanceEqualTo(String value) {
            addCriterion("CHECK_GC_BALANCE =", value, "checkGcBalance");
            return (Criteria) this;
        }

        public Criteria andCheckGcBalanceNotEqualTo(String value) {
            addCriterion("CHECK_GC_BALANCE <>", value, "checkGcBalance");
            return (Criteria) this;
        }

        public Criteria andCheckGcBalanceGreaterThan(String value) {
            addCriterion("CHECK_GC_BALANCE >", value, "checkGcBalance");
            return (Criteria) this;
        }

        public Criteria andCheckGcBalanceGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_GC_BALANCE >=", value, "checkGcBalance");
            return (Criteria) this;
        }

        public Criteria andCheckGcBalanceLessThan(String value) {
            addCriterion("CHECK_GC_BALANCE <", value, "checkGcBalance");
            return (Criteria) this;
        }

        public Criteria andCheckGcBalanceLessThanOrEqualTo(String value) {
            addCriterion("CHECK_GC_BALANCE <=", value, "checkGcBalance");
            return (Criteria) this;
        }

        public Criteria andCheckGcBalanceLike(String value) {
            addCriterion("CHECK_GC_BALANCE like", value, "checkGcBalance");
            return (Criteria) this;
        }

        public Criteria andCheckGcBalanceNotLike(String value) {
            addCriterion("CHECK_GC_BALANCE not like", value, "checkGcBalance");
            return (Criteria) this;
        }

        public Criteria andCheckGcBalanceIn(List<String> values) {
            addCriterion("CHECK_GC_BALANCE in", values, "checkGcBalance");
            return (Criteria) this;
        }

        public Criteria andCheckGcBalanceNotIn(List<String> values) {
            addCriterion("CHECK_GC_BALANCE not in", values, "checkGcBalance");
            return (Criteria) this;
        }

        public Criteria andCheckGcBalanceBetween(String value1, String value2) {
            addCriterion("CHECK_GC_BALANCE between", value1, value2, "checkGcBalance");
            return (Criteria) this;
        }

        public Criteria andCheckGcBalanceNotBetween(String value1, String value2) {
            addCriterion("CHECK_GC_BALANCE not between", value1, value2, "checkGcBalance");
            return (Criteria) this;
        }

        public Criteria andRetryFailedAuthsIsNull() {
            addCriterion("RETRY_FAILED_AUTHS is null");
            return (Criteria) this;
        }

        public Criteria andRetryFailedAuthsIsNotNull() {
            addCriterion("RETRY_FAILED_AUTHS is not null");
            return (Criteria) this;
        }

        public Criteria andRetryFailedAuthsEqualTo(String value) {
            addCriterion("RETRY_FAILED_AUTHS =", value, "retryFailedAuths");
            return (Criteria) this;
        }

        public Criteria andRetryFailedAuthsNotEqualTo(String value) {
            addCriterion("RETRY_FAILED_AUTHS <>", value, "retryFailedAuths");
            return (Criteria) this;
        }

        public Criteria andRetryFailedAuthsGreaterThan(String value) {
            addCriterion("RETRY_FAILED_AUTHS >", value, "retryFailedAuths");
            return (Criteria) this;
        }

        public Criteria andRetryFailedAuthsGreaterThanOrEqualTo(String value) {
            addCriterion("RETRY_FAILED_AUTHS >=", value, "retryFailedAuths");
            return (Criteria) this;
        }

        public Criteria andRetryFailedAuthsLessThan(String value) {
            addCriterion("RETRY_FAILED_AUTHS <", value, "retryFailedAuths");
            return (Criteria) this;
        }

        public Criteria andRetryFailedAuthsLessThanOrEqualTo(String value) {
            addCriterion("RETRY_FAILED_AUTHS <=", value, "retryFailedAuths");
            return (Criteria) this;
        }

        public Criteria andRetryFailedAuthsLike(String value) {
            addCriterion("RETRY_FAILED_AUTHS like", value, "retryFailedAuths");
            return (Criteria) this;
        }

        public Criteria andRetryFailedAuthsNotLike(String value) {
            addCriterion("RETRY_FAILED_AUTHS not like", value, "retryFailedAuths");
            return (Criteria) this;
        }

        public Criteria andRetryFailedAuthsIn(List<String> values) {
            addCriterion("RETRY_FAILED_AUTHS in", values, "retryFailedAuths");
            return (Criteria) this;
        }

        public Criteria andRetryFailedAuthsNotIn(List<String> values) {
            addCriterion("RETRY_FAILED_AUTHS not in", values, "retryFailedAuths");
            return (Criteria) this;
        }

        public Criteria andRetryFailedAuthsBetween(String value1, String value2) {
            addCriterion("RETRY_FAILED_AUTHS between", value1, value2, "retryFailedAuths");
            return (Criteria) this;
        }

        public Criteria andRetryFailedAuthsNotBetween(String value1, String value2) {
            addCriterion("RETRY_FAILED_AUTHS not between", value1, value2, "retryFailedAuths");
            return (Criteria) this;
        }

        public Criteria andHeaderApprovedStatusIsNull() {
            addCriterion("HEADER_APPROVED_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andHeaderApprovedStatusIsNotNull() {
            addCriterion("HEADER_APPROVED_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andHeaderApprovedStatusEqualTo(String value) {
            addCriterion("HEADER_APPROVED_STATUS =", value, "headerApprovedStatus");
            return (Criteria) this;
        }

        public Criteria andHeaderApprovedStatusNotEqualTo(String value) {
            addCriterion("HEADER_APPROVED_STATUS <>", value, "headerApprovedStatus");
            return (Criteria) this;
        }

        public Criteria andHeaderApprovedStatusGreaterThan(String value) {
            addCriterion("HEADER_APPROVED_STATUS >", value, "headerApprovedStatus");
            return (Criteria) this;
        }

        public Criteria andHeaderApprovedStatusGreaterThanOrEqualTo(String value) {
            addCriterion("HEADER_APPROVED_STATUS >=", value, "headerApprovedStatus");
            return (Criteria) this;
        }

        public Criteria andHeaderApprovedStatusLessThan(String value) {
            addCriterion("HEADER_APPROVED_STATUS <", value, "headerApprovedStatus");
            return (Criteria) this;
        }

        public Criteria andHeaderApprovedStatusLessThanOrEqualTo(String value) {
            addCriterion("HEADER_APPROVED_STATUS <=", value, "headerApprovedStatus");
            return (Criteria) this;
        }

        public Criteria andHeaderApprovedStatusLike(String value) {
            addCriterion("HEADER_APPROVED_STATUS like", value, "headerApprovedStatus");
            return (Criteria) this;
        }

        public Criteria andHeaderApprovedStatusNotLike(String value) {
            addCriterion("HEADER_APPROVED_STATUS not like", value, "headerApprovedStatus");
            return (Criteria) this;
        }

        public Criteria andHeaderApprovedStatusIn(List<String> values) {
            addCriterion("HEADER_APPROVED_STATUS in", values, "headerApprovedStatus");
            return (Criteria) this;
        }

        public Criteria andHeaderApprovedStatusNotIn(List<String> values) {
            addCriterion("HEADER_APPROVED_STATUS not in", values, "headerApprovedStatus");
            return (Criteria) this;
        }

        public Criteria andHeaderApprovedStatusBetween(String value1, String value2) {
            addCriterion("HEADER_APPROVED_STATUS between", value1, value2, "headerApprovedStatus");
            return (Criteria) this;
        }

        public Criteria andHeaderApprovedStatusNotBetween(String value1, String value2) {
            addCriterion("HEADER_APPROVED_STATUS not between", value1, value2, "headerApprovedStatus");
            return (Criteria) this;
        }

        public Criteria andItemApprovedStatusIsNull() {
            addCriterion("ITEM_APPROVED_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andItemApprovedStatusIsNotNull() {
            addCriterion("ITEM_APPROVED_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andItemApprovedStatusEqualTo(String value) {
            addCriterion("ITEM_APPROVED_STATUS =", value, "itemApprovedStatus");
            return (Criteria) this;
        }

        public Criteria andItemApprovedStatusNotEqualTo(String value) {
            addCriterion("ITEM_APPROVED_STATUS <>", value, "itemApprovedStatus");
            return (Criteria) this;
        }

        public Criteria andItemApprovedStatusGreaterThan(String value) {
            addCriterion("ITEM_APPROVED_STATUS >", value, "itemApprovedStatus");
            return (Criteria) this;
        }

        public Criteria andItemApprovedStatusGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_APPROVED_STATUS >=", value, "itemApprovedStatus");
            return (Criteria) this;
        }

        public Criteria andItemApprovedStatusLessThan(String value) {
            addCriterion("ITEM_APPROVED_STATUS <", value, "itemApprovedStatus");
            return (Criteria) this;
        }

        public Criteria andItemApprovedStatusLessThanOrEqualTo(String value) {
            addCriterion("ITEM_APPROVED_STATUS <=", value, "itemApprovedStatus");
            return (Criteria) this;
        }

        public Criteria andItemApprovedStatusLike(String value) {
            addCriterion("ITEM_APPROVED_STATUS like", value, "itemApprovedStatus");
            return (Criteria) this;
        }

        public Criteria andItemApprovedStatusNotLike(String value) {
            addCriterion("ITEM_APPROVED_STATUS not like", value, "itemApprovedStatus");
            return (Criteria) this;
        }

        public Criteria andItemApprovedStatusIn(List<String> values) {
            addCriterion("ITEM_APPROVED_STATUS in", values, "itemApprovedStatus");
            return (Criteria) this;
        }

        public Criteria andItemApprovedStatusNotIn(List<String> values) {
            addCriterion("ITEM_APPROVED_STATUS not in", values, "itemApprovedStatus");
            return (Criteria) this;
        }

        public Criteria andItemApprovedStatusBetween(String value1, String value2) {
            addCriterion("ITEM_APPROVED_STATUS between", value1, value2, "itemApprovedStatus");
            return (Criteria) this;
        }

        public Criteria andItemApprovedStatusNotBetween(String value1, String value2) {
            addCriterion("ITEM_APPROVED_STATUS not between", value1, value2, "itemApprovedStatus");
            return (Criteria) this;
        }

        public Criteria andDigitalItemApprovedStatusIsNull() {
            addCriterion("DIGITAL_ITEM_APPROVED_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andDigitalItemApprovedStatusIsNotNull() {
            addCriterion("DIGITAL_ITEM_APPROVED_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andDigitalItemApprovedStatusEqualTo(String value) {
            addCriterion("DIGITAL_ITEM_APPROVED_STATUS =", value, "digitalItemApprovedStatus");
            return (Criteria) this;
        }

        public Criteria andDigitalItemApprovedStatusNotEqualTo(String value) {
            addCriterion("DIGITAL_ITEM_APPROVED_STATUS <>", value, "digitalItemApprovedStatus");
            return (Criteria) this;
        }

        public Criteria andDigitalItemApprovedStatusGreaterThan(String value) {
            addCriterion("DIGITAL_ITEM_APPROVED_STATUS >", value, "digitalItemApprovedStatus");
            return (Criteria) this;
        }

        public Criteria andDigitalItemApprovedStatusGreaterThanOrEqualTo(String value) {
            addCriterion("DIGITAL_ITEM_APPROVED_STATUS >=", value, "digitalItemApprovedStatus");
            return (Criteria) this;
        }

        public Criteria andDigitalItemApprovedStatusLessThan(String value) {
            addCriterion("DIGITAL_ITEM_APPROVED_STATUS <", value, "digitalItemApprovedStatus");
            return (Criteria) this;
        }

        public Criteria andDigitalItemApprovedStatusLessThanOrEqualTo(String value) {
            addCriterion("DIGITAL_ITEM_APPROVED_STATUS <=", value, "digitalItemApprovedStatus");
            return (Criteria) this;
        }

        public Criteria andDigitalItemApprovedStatusLike(String value) {
            addCriterion("DIGITAL_ITEM_APPROVED_STATUS like", value, "digitalItemApprovedStatus");
            return (Criteria) this;
        }

        public Criteria andDigitalItemApprovedStatusNotLike(String value) {
            addCriterion("DIGITAL_ITEM_APPROVED_STATUS not like", value, "digitalItemApprovedStatus");
            return (Criteria) this;
        }

        public Criteria andDigitalItemApprovedStatusIn(List<String> values) {
            addCriterion("DIGITAL_ITEM_APPROVED_STATUS in", values, "digitalItemApprovedStatus");
            return (Criteria) this;
        }

        public Criteria andDigitalItemApprovedStatusNotIn(List<String> values) {
            addCriterion("DIGITAL_ITEM_APPROVED_STATUS not in", values, "digitalItemApprovedStatus");
            return (Criteria) this;
        }

        public Criteria andDigitalItemApprovedStatusBetween(String value1, String value2) {
            addCriterion("DIGITAL_ITEM_APPROVED_STATUS between", value1, value2, "digitalItemApprovedStatus");
            return (Criteria) this;
        }

        public Criteria andDigitalItemApprovedStatusNotBetween(String value1, String value2) {
            addCriterion("DIGITAL_ITEM_APPROVED_STATUS not between", value1, value2, "digitalItemApprovedStatus");
            return (Criteria) this;
        }

        public Criteria andHeaderDeclinedStatusIsNull() {
            addCriterion("HEADER_DECLINED_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andHeaderDeclinedStatusIsNotNull() {
            addCriterion("HEADER_DECLINED_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andHeaderDeclinedStatusEqualTo(String value) {
            addCriterion("HEADER_DECLINED_STATUS =", value, "headerDeclinedStatus");
            return (Criteria) this;
        }

        public Criteria andHeaderDeclinedStatusNotEqualTo(String value) {
            addCriterion("HEADER_DECLINED_STATUS <>", value, "headerDeclinedStatus");
            return (Criteria) this;
        }

        public Criteria andHeaderDeclinedStatusGreaterThan(String value) {
            addCriterion("HEADER_DECLINED_STATUS >", value, "headerDeclinedStatus");
            return (Criteria) this;
        }

        public Criteria andHeaderDeclinedStatusGreaterThanOrEqualTo(String value) {
            addCriterion("HEADER_DECLINED_STATUS >=", value, "headerDeclinedStatus");
            return (Criteria) this;
        }

        public Criteria andHeaderDeclinedStatusLessThan(String value) {
            addCriterion("HEADER_DECLINED_STATUS <", value, "headerDeclinedStatus");
            return (Criteria) this;
        }

        public Criteria andHeaderDeclinedStatusLessThanOrEqualTo(String value) {
            addCriterion("HEADER_DECLINED_STATUS <=", value, "headerDeclinedStatus");
            return (Criteria) this;
        }

        public Criteria andHeaderDeclinedStatusLike(String value) {
            addCriterion("HEADER_DECLINED_STATUS like", value, "headerDeclinedStatus");
            return (Criteria) this;
        }

        public Criteria andHeaderDeclinedStatusNotLike(String value) {
            addCriterion("HEADER_DECLINED_STATUS not like", value, "headerDeclinedStatus");
            return (Criteria) this;
        }

        public Criteria andHeaderDeclinedStatusIn(List<String> values) {
            addCriterion("HEADER_DECLINED_STATUS in", values, "headerDeclinedStatus");
            return (Criteria) this;
        }

        public Criteria andHeaderDeclinedStatusNotIn(List<String> values) {
            addCriterion("HEADER_DECLINED_STATUS not in", values, "headerDeclinedStatus");
            return (Criteria) this;
        }

        public Criteria andHeaderDeclinedStatusBetween(String value1, String value2) {
            addCriterion("HEADER_DECLINED_STATUS between", value1, value2, "headerDeclinedStatus");
            return (Criteria) this;
        }

        public Criteria andHeaderDeclinedStatusNotBetween(String value1, String value2) {
            addCriterion("HEADER_DECLINED_STATUS not between", value1, value2, "headerDeclinedStatus");
            return (Criteria) this;
        }

        public Criteria andItemDeclinedStatusIsNull() {
            addCriterion("ITEM_DECLINED_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andItemDeclinedStatusIsNotNull() {
            addCriterion("ITEM_DECLINED_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andItemDeclinedStatusEqualTo(String value) {
            addCriterion("ITEM_DECLINED_STATUS =", value, "itemDeclinedStatus");
            return (Criteria) this;
        }

        public Criteria andItemDeclinedStatusNotEqualTo(String value) {
            addCriterion("ITEM_DECLINED_STATUS <>", value, "itemDeclinedStatus");
            return (Criteria) this;
        }

        public Criteria andItemDeclinedStatusGreaterThan(String value) {
            addCriterion("ITEM_DECLINED_STATUS >", value, "itemDeclinedStatus");
            return (Criteria) this;
        }

        public Criteria andItemDeclinedStatusGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_DECLINED_STATUS >=", value, "itemDeclinedStatus");
            return (Criteria) this;
        }

        public Criteria andItemDeclinedStatusLessThan(String value) {
            addCriterion("ITEM_DECLINED_STATUS <", value, "itemDeclinedStatus");
            return (Criteria) this;
        }

        public Criteria andItemDeclinedStatusLessThanOrEqualTo(String value) {
            addCriterion("ITEM_DECLINED_STATUS <=", value, "itemDeclinedStatus");
            return (Criteria) this;
        }

        public Criteria andItemDeclinedStatusLike(String value) {
            addCriterion("ITEM_DECLINED_STATUS like", value, "itemDeclinedStatus");
            return (Criteria) this;
        }

        public Criteria andItemDeclinedStatusNotLike(String value) {
            addCriterion("ITEM_DECLINED_STATUS not like", value, "itemDeclinedStatus");
            return (Criteria) this;
        }

        public Criteria andItemDeclinedStatusIn(List<String> values) {
            addCriterion("ITEM_DECLINED_STATUS in", values, "itemDeclinedStatus");
            return (Criteria) this;
        }

        public Criteria andItemDeclinedStatusNotIn(List<String> values) {
            addCriterion("ITEM_DECLINED_STATUS not in", values, "itemDeclinedStatus");
            return (Criteria) this;
        }

        public Criteria andItemDeclinedStatusBetween(String value1, String value2) {
            addCriterion("ITEM_DECLINED_STATUS between", value1, value2, "itemDeclinedStatus");
            return (Criteria) this;
        }

        public Criteria andItemDeclinedStatusNotBetween(String value1, String value2) {
            addCriterion("ITEM_DECLINED_STATUS not between", value1, value2, "itemDeclinedStatus");
            return (Criteria) this;
        }

        public Criteria andHeaderCancelStatusIsNull() {
            addCriterion("HEADER_CANCEL_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andHeaderCancelStatusIsNotNull() {
            addCriterion("HEADER_CANCEL_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andHeaderCancelStatusEqualTo(String value) {
            addCriterion("HEADER_CANCEL_STATUS =", value, "headerCancelStatus");
            return (Criteria) this;
        }

        public Criteria andHeaderCancelStatusNotEqualTo(String value) {
            addCriterion("HEADER_CANCEL_STATUS <>", value, "headerCancelStatus");
            return (Criteria) this;
        }

        public Criteria andHeaderCancelStatusGreaterThan(String value) {
            addCriterion("HEADER_CANCEL_STATUS >", value, "headerCancelStatus");
            return (Criteria) this;
        }

        public Criteria andHeaderCancelStatusGreaterThanOrEqualTo(String value) {
            addCriterion("HEADER_CANCEL_STATUS >=", value, "headerCancelStatus");
            return (Criteria) this;
        }

        public Criteria andHeaderCancelStatusLessThan(String value) {
            addCriterion("HEADER_CANCEL_STATUS <", value, "headerCancelStatus");
            return (Criteria) this;
        }

        public Criteria andHeaderCancelStatusLessThanOrEqualTo(String value) {
            addCriterion("HEADER_CANCEL_STATUS <=", value, "headerCancelStatus");
            return (Criteria) this;
        }

        public Criteria andHeaderCancelStatusLike(String value) {
            addCriterion("HEADER_CANCEL_STATUS like", value, "headerCancelStatus");
            return (Criteria) this;
        }

        public Criteria andHeaderCancelStatusNotLike(String value) {
            addCriterion("HEADER_CANCEL_STATUS not like", value, "headerCancelStatus");
            return (Criteria) this;
        }

        public Criteria andHeaderCancelStatusIn(List<String> values) {
            addCriterion("HEADER_CANCEL_STATUS in", values, "headerCancelStatus");
            return (Criteria) this;
        }

        public Criteria andHeaderCancelStatusNotIn(List<String> values) {
            addCriterion("HEADER_CANCEL_STATUS not in", values, "headerCancelStatus");
            return (Criteria) this;
        }

        public Criteria andHeaderCancelStatusBetween(String value1, String value2) {
            addCriterion("HEADER_CANCEL_STATUS between", value1, value2, "headerCancelStatus");
            return (Criteria) this;
        }

        public Criteria andHeaderCancelStatusNotBetween(String value1, String value2) {
            addCriterion("HEADER_CANCEL_STATUS not between", value1, value2, "headerCancelStatus");
            return (Criteria) this;
        }

        public Criteria andItemCancelStatusIsNull() {
            addCriterion("ITEM_CANCEL_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andItemCancelStatusIsNotNull() {
            addCriterion("ITEM_CANCEL_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andItemCancelStatusEqualTo(String value) {
            addCriterion("ITEM_CANCEL_STATUS =", value, "itemCancelStatus");
            return (Criteria) this;
        }

        public Criteria andItemCancelStatusNotEqualTo(String value) {
            addCriterion("ITEM_CANCEL_STATUS <>", value, "itemCancelStatus");
            return (Criteria) this;
        }

        public Criteria andItemCancelStatusGreaterThan(String value) {
            addCriterion("ITEM_CANCEL_STATUS >", value, "itemCancelStatus");
            return (Criteria) this;
        }

        public Criteria andItemCancelStatusGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_CANCEL_STATUS >=", value, "itemCancelStatus");
            return (Criteria) this;
        }

        public Criteria andItemCancelStatusLessThan(String value) {
            addCriterion("ITEM_CANCEL_STATUS <", value, "itemCancelStatus");
            return (Criteria) this;
        }

        public Criteria andItemCancelStatusLessThanOrEqualTo(String value) {
            addCriterion("ITEM_CANCEL_STATUS <=", value, "itemCancelStatus");
            return (Criteria) this;
        }

        public Criteria andItemCancelStatusLike(String value) {
            addCriterion("ITEM_CANCEL_STATUS like", value, "itemCancelStatus");
            return (Criteria) this;
        }

        public Criteria andItemCancelStatusNotLike(String value) {
            addCriterion("ITEM_CANCEL_STATUS not like", value, "itemCancelStatus");
            return (Criteria) this;
        }

        public Criteria andItemCancelStatusIn(List<String> values) {
            addCriterion("ITEM_CANCEL_STATUS in", values, "itemCancelStatus");
            return (Criteria) this;
        }

        public Criteria andItemCancelStatusNotIn(List<String> values) {
            addCriterion("ITEM_CANCEL_STATUS not in", values, "itemCancelStatus");
            return (Criteria) this;
        }

        public Criteria andItemCancelStatusBetween(String value1, String value2) {
            addCriterion("ITEM_CANCEL_STATUS between", value1, value2, "itemCancelStatus");
            return (Criteria) this;
        }

        public Criteria andItemCancelStatusNotBetween(String value1, String value2) {
            addCriterion("ITEM_CANCEL_STATUS not between", value1, value2, "itemCancelStatus");
            return (Criteria) this;
        }

        public Criteria andAuthDeclinedMessageIsNull() {
            addCriterion("AUTH_DECLINED_MESSAGE is null");
            return (Criteria) this;
        }

        public Criteria andAuthDeclinedMessageIsNotNull() {
            addCriterion("AUTH_DECLINED_MESSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andAuthDeclinedMessageEqualTo(String value) {
            addCriterion("AUTH_DECLINED_MESSAGE =", value, "authDeclinedMessage");
            return (Criteria) this;
        }

        public Criteria andAuthDeclinedMessageNotEqualTo(String value) {
            addCriterion("AUTH_DECLINED_MESSAGE <>", value, "authDeclinedMessage");
            return (Criteria) this;
        }

        public Criteria andAuthDeclinedMessageGreaterThan(String value) {
            addCriterion("AUTH_DECLINED_MESSAGE >", value, "authDeclinedMessage");
            return (Criteria) this;
        }

        public Criteria andAuthDeclinedMessageGreaterThanOrEqualTo(String value) {
            addCriterion("AUTH_DECLINED_MESSAGE >=", value, "authDeclinedMessage");
            return (Criteria) this;
        }

        public Criteria andAuthDeclinedMessageLessThan(String value) {
            addCriterion("AUTH_DECLINED_MESSAGE <", value, "authDeclinedMessage");
            return (Criteria) this;
        }

        public Criteria andAuthDeclinedMessageLessThanOrEqualTo(String value) {
            addCriterion("AUTH_DECLINED_MESSAGE <=", value, "authDeclinedMessage");
            return (Criteria) this;
        }

        public Criteria andAuthDeclinedMessageLike(String value) {
            addCriterion("AUTH_DECLINED_MESSAGE like", value, "authDeclinedMessage");
            return (Criteria) this;
        }

        public Criteria andAuthDeclinedMessageNotLike(String value) {
            addCriterion("AUTH_DECLINED_MESSAGE not like", value, "authDeclinedMessage");
            return (Criteria) this;
        }

        public Criteria andAuthDeclinedMessageIn(List<String> values) {
            addCriterion("AUTH_DECLINED_MESSAGE in", values, "authDeclinedMessage");
            return (Criteria) this;
        }

        public Criteria andAuthDeclinedMessageNotIn(List<String> values) {
            addCriterion("AUTH_DECLINED_MESSAGE not in", values, "authDeclinedMessage");
            return (Criteria) this;
        }

        public Criteria andAuthDeclinedMessageBetween(String value1, String value2) {
            addCriterion("AUTH_DECLINED_MESSAGE between", value1, value2, "authDeclinedMessage");
            return (Criteria) this;
        }

        public Criteria andAuthDeclinedMessageNotBetween(String value1, String value2) {
            addCriterion("AUTH_DECLINED_MESSAGE not between", value1, value2, "authDeclinedMessage");
            return (Criteria) this;
        }

        public Criteria andAuthFraudMessageIsNull() {
            addCriterion("AUTH_FRAUD_MESSAGE is null");
            return (Criteria) this;
        }

        public Criteria andAuthFraudMessageIsNotNull() {
            addCriterion("AUTH_FRAUD_MESSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andAuthFraudMessageEqualTo(String value) {
            addCriterion("AUTH_FRAUD_MESSAGE =", value, "authFraudMessage");
            return (Criteria) this;
        }

        public Criteria andAuthFraudMessageNotEqualTo(String value) {
            addCriterion("AUTH_FRAUD_MESSAGE <>", value, "authFraudMessage");
            return (Criteria) this;
        }

        public Criteria andAuthFraudMessageGreaterThan(String value) {
            addCriterion("AUTH_FRAUD_MESSAGE >", value, "authFraudMessage");
            return (Criteria) this;
        }

        public Criteria andAuthFraudMessageGreaterThanOrEqualTo(String value) {
            addCriterion("AUTH_FRAUD_MESSAGE >=", value, "authFraudMessage");
            return (Criteria) this;
        }

        public Criteria andAuthFraudMessageLessThan(String value) {
            addCriterion("AUTH_FRAUD_MESSAGE <", value, "authFraudMessage");
            return (Criteria) this;
        }

        public Criteria andAuthFraudMessageLessThanOrEqualTo(String value) {
            addCriterion("AUTH_FRAUD_MESSAGE <=", value, "authFraudMessage");
            return (Criteria) this;
        }

        public Criteria andAuthFraudMessageLike(String value) {
            addCriterion("AUTH_FRAUD_MESSAGE like", value, "authFraudMessage");
            return (Criteria) this;
        }

        public Criteria andAuthFraudMessageNotLike(String value) {
            addCriterion("AUTH_FRAUD_MESSAGE not like", value, "authFraudMessage");
            return (Criteria) this;
        }

        public Criteria andAuthFraudMessageIn(List<String> values) {
            addCriterion("AUTH_FRAUD_MESSAGE in", values, "authFraudMessage");
            return (Criteria) this;
        }

        public Criteria andAuthFraudMessageNotIn(List<String> values) {
            addCriterion("AUTH_FRAUD_MESSAGE not in", values, "authFraudMessage");
            return (Criteria) this;
        }

        public Criteria andAuthFraudMessageBetween(String value1, String value2) {
            addCriterion("AUTH_FRAUD_MESSAGE between", value1, value2, "authFraudMessage");
            return (Criteria) this;
        }

        public Criteria andAuthFraudMessageNotBetween(String value1, String value2) {
            addCriterion("AUTH_FRAUD_MESSAGE not between", value1, value2, "authFraudMessage");
            return (Criteria) this;
        }

        public Criteria andAuthErrorMessageIsNull() {
            addCriterion("AUTH_ERROR_MESSAGE is null");
            return (Criteria) this;
        }

        public Criteria andAuthErrorMessageIsNotNull() {
            addCriterion("AUTH_ERROR_MESSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andAuthErrorMessageEqualTo(String value) {
            addCriterion("AUTH_ERROR_MESSAGE =", value, "authErrorMessage");
            return (Criteria) this;
        }

        public Criteria andAuthErrorMessageNotEqualTo(String value) {
            addCriterion("AUTH_ERROR_MESSAGE <>", value, "authErrorMessage");
            return (Criteria) this;
        }

        public Criteria andAuthErrorMessageGreaterThan(String value) {
            addCriterion("AUTH_ERROR_MESSAGE >", value, "authErrorMessage");
            return (Criteria) this;
        }

        public Criteria andAuthErrorMessageGreaterThanOrEqualTo(String value) {
            addCriterion("AUTH_ERROR_MESSAGE >=", value, "authErrorMessage");
            return (Criteria) this;
        }

        public Criteria andAuthErrorMessageLessThan(String value) {
            addCriterion("AUTH_ERROR_MESSAGE <", value, "authErrorMessage");
            return (Criteria) this;
        }

        public Criteria andAuthErrorMessageLessThanOrEqualTo(String value) {
            addCriterion("AUTH_ERROR_MESSAGE <=", value, "authErrorMessage");
            return (Criteria) this;
        }

        public Criteria andAuthErrorMessageLike(String value) {
            addCriterion("AUTH_ERROR_MESSAGE like", value, "authErrorMessage");
            return (Criteria) this;
        }

        public Criteria andAuthErrorMessageNotLike(String value) {
            addCriterion("AUTH_ERROR_MESSAGE not like", value, "authErrorMessage");
            return (Criteria) this;
        }

        public Criteria andAuthErrorMessageIn(List<String> values) {
            addCriterion("AUTH_ERROR_MESSAGE in", values, "authErrorMessage");
            return (Criteria) this;
        }

        public Criteria andAuthErrorMessageNotIn(List<String> values) {
            addCriterion("AUTH_ERROR_MESSAGE not in", values, "authErrorMessage");
            return (Criteria) this;
        }

        public Criteria andAuthErrorMessageBetween(String value1, String value2) {
            addCriterion("AUTH_ERROR_MESSAGE between", value1, value2, "authErrorMessage");
            return (Criteria) this;
        }

        public Criteria andAuthErrorMessageNotBetween(String value1, String value2) {
            addCriterion("AUTH_ERROR_MESSAGE not between", value1, value2, "authErrorMessage");
            return (Criteria) this;
        }

        public Criteria andVisualThemeIdIsNull() {
            addCriterion("VISUAL_THEME_ID is null");
            return (Criteria) this;
        }

        public Criteria andVisualThemeIdIsNotNull() {
            addCriterion("VISUAL_THEME_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVisualThemeIdEqualTo(String value) {
            addCriterion("VISUAL_THEME_ID =", value, "visualThemeId");
            return (Criteria) this;
        }

        public Criteria andVisualThemeIdNotEqualTo(String value) {
            addCriterion("VISUAL_THEME_ID <>", value, "visualThemeId");
            return (Criteria) this;
        }

        public Criteria andVisualThemeIdGreaterThan(String value) {
            addCriterion("VISUAL_THEME_ID >", value, "visualThemeId");
            return (Criteria) this;
        }

        public Criteria andVisualThemeIdGreaterThanOrEqualTo(String value) {
            addCriterion("VISUAL_THEME_ID >=", value, "visualThemeId");
            return (Criteria) this;
        }

        public Criteria andVisualThemeIdLessThan(String value) {
            addCriterion("VISUAL_THEME_ID <", value, "visualThemeId");
            return (Criteria) this;
        }

        public Criteria andVisualThemeIdLessThanOrEqualTo(String value) {
            addCriterion("VISUAL_THEME_ID <=", value, "visualThemeId");
            return (Criteria) this;
        }

        public Criteria andVisualThemeIdLike(String value) {
            addCriterion("VISUAL_THEME_ID like", value, "visualThemeId");
            return (Criteria) this;
        }

        public Criteria andVisualThemeIdNotLike(String value) {
            addCriterion("VISUAL_THEME_ID not like", value, "visualThemeId");
            return (Criteria) this;
        }

        public Criteria andVisualThemeIdIn(List<String> values) {
            addCriterion("VISUAL_THEME_ID in", values, "visualThemeId");
            return (Criteria) this;
        }

        public Criteria andVisualThemeIdNotIn(List<String> values) {
            addCriterion("VISUAL_THEME_ID not in", values, "visualThemeId");
            return (Criteria) this;
        }

        public Criteria andVisualThemeIdBetween(String value1, String value2) {
            addCriterion("VISUAL_THEME_ID between", value1, value2, "visualThemeId");
            return (Criteria) this;
        }

        public Criteria andVisualThemeIdNotBetween(String value1, String value2) {
            addCriterion("VISUAL_THEME_ID not between", value1, value2, "visualThemeId");
            return (Criteria) this;
        }

        public Criteria andStoreCreditAccountEnumIdIsNull() {
            addCriterion("STORE_CREDIT_ACCOUNT_ENUM_ID is null");
            return (Criteria) this;
        }

        public Criteria andStoreCreditAccountEnumIdIsNotNull() {
            addCriterion("STORE_CREDIT_ACCOUNT_ENUM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStoreCreditAccountEnumIdEqualTo(String value) {
            addCriterion("STORE_CREDIT_ACCOUNT_ENUM_ID =", value, "storeCreditAccountEnumId");
            return (Criteria) this;
        }

        public Criteria andStoreCreditAccountEnumIdNotEqualTo(String value) {
            addCriterion("STORE_CREDIT_ACCOUNT_ENUM_ID <>", value, "storeCreditAccountEnumId");
            return (Criteria) this;
        }

        public Criteria andStoreCreditAccountEnumIdGreaterThan(String value) {
            addCriterion("STORE_CREDIT_ACCOUNT_ENUM_ID >", value, "storeCreditAccountEnumId");
            return (Criteria) this;
        }

        public Criteria andStoreCreditAccountEnumIdGreaterThanOrEqualTo(String value) {
            addCriterion("STORE_CREDIT_ACCOUNT_ENUM_ID >=", value, "storeCreditAccountEnumId");
            return (Criteria) this;
        }

        public Criteria andStoreCreditAccountEnumIdLessThan(String value) {
            addCriterion("STORE_CREDIT_ACCOUNT_ENUM_ID <", value, "storeCreditAccountEnumId");
            return (Criteria) this;
        }

        public Criteria andStoreCreditAccountEnumIdLessThanOrEqualTo(String value) {
            addCriterion("STORE_CREDIT_ACCOUNT_ENUM_ID <=", value, "storeCreditAccountEnumId");
            return (Criteria) this;
        }

        public Criteria andStoreCreditAccountEnumIdLike(String value) {
            addCriterion("STORE_CREDIT_ACCOUNT_ENUM_ID like", value, "storeCreditAccountEnumId");
            return (Criteria) this;
        }

        public Criteria andStoreCreditAccountEnumIdNotLike(String value) {
            addCriterion("STORE_CREDIT_ACCOUNT_ENUM_ID not like", value, "storeCreditAccountEnumId");
            return (Criteria) this;
        }

        public Criteria andStoreCreditAccountEnumIdIn(List<String> values) {
            addCriterion("STORE_CREDIT_ACCOUNT_ENUM_ID in", values, "storeCreditAccountEnumId");
            return (Criteria) this;
        }

        public Criteria andStoreCreditAccountEnumIdNotIn(List<String> values) {
            addCriterion("STORE_CREDIT_ACCOUNT_ENUM_ID not in", values, "storeCreditAccountEnumId");
            return (Criteria) this;
        }

        public Criteria andStoreCreditAccountEnumIdBetween(String value1, String value2) {
            addCriterion("STORE_CREDIT_ACCOUNT_ENUM_ID between", value1, value2, "storeCreditAccountEnumId");
            return (Criteria) this;
        }

        public Criteria andStoreCreditAccountEnumIdNotBetween(String value1, String value2) {
            addCriterion("STORE_CREDIT_ACCOUNT_ENUM_ID not between", value1, value2, "storeCreditAccountEnumId");
            return (Criteria) this;
        }

        public Criteria andUsePrimaryEmailUsernameIsNull() {
            addCriterion("USE_PRIMARY_EMAIL_USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsePrimaryEmailUsernameIsNotNull() {
            addCriterion("USE_PRIMARY_EMAIL_USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsePrimaryEmailUsernameEqualTo(String value) {
            addCriterion("USE_PRIMARY_EMAIL_USERNAME =", value, "usePrimaryEmailUsername");
            return (Criteria) this;
        }

        public Criteria andUsePrimaryEmailUsernameNotEqualTo(String value) {
            addCriterion("USE_PRIMARY_EMAIL_USERNAME <>", value, "usePrimaryEmailUsername");
            return (Criteria) this;
        }

        public Criteria andUsePrimaryEmailUsernameGreaterThan(String value) {
            addCriterion("USE_PRIMARY_EMAIL_USERNAME >", value, "usePrimaryEmailUsername");
            return (Criteria) this;
        }

        public Criteria andUsePrimaryEmailUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("USE_PRIMARY_EMAIL_USERNAME >=", value, "usePrimaryEmailUsername");
            return (Criteria) this;
        }

        public Criteria andUsePrimaryEmailUsernameLessThan(String value) {
            addCriterion("USE_PRIMARY_EMAIL_USERNAME <", value, "usePrimaryEmailUsername");
            return (Criteria) this;
        }

        public Criteria andUsePrimaryEmailUsernameLessThanOrEqualTo(String value) {
            addCriterion("USE_PRIMARY_EMAIL_USERNAME <=", value, "usePrimaryEmailUsername");
            return (Criteria) this;
        }

        public Criteria andUsePrimaryEmailUsernameLike(String value) {
            addCriterion("USE_PRIMARY_EMAIL_USERNAME like", value, "usePrimaryEmailUsername");
            return (Criteria) this;
        }

        public Criteria andUsePrimaryEmailUsernameNotLike(String value) {
            addCriterion("USE_PRIMARY_EMAIL_USERNAME not like", value, "usePrimaryEmailUsername");
            return (Criteria) this;
        }

        public Criteria andUsePrimaryEmailUsernameIn(List<String> values) {
            addCriterion("USE_PRIMARY_EMAIL_USERNAME in", values, "usePrimaryEmailUsername");
            return (Criteria) this;
        }

        public Criteria andUsePrimaryEmailUsernameNotIn(List<String> values) {
            addCriterion("USE_PRIMARY_EMAIL_USERNAME not in", values, "usePrimaryEmailUsername");
            return (Criteria) this;
        }

        public Criteria andUsePrimaryEmailUsernameBetween(String value1, String value2) {
            addCriterion("USE_PRIMARY_EMAIL_USERNAME between", value1, value2, "usePrimaryEmailUsername");
            return (Criteria) this;
        }

        public Criteria andUsePrimaryEmailUsernameNotBetween(String value1, String value2) {
            addCriterion("USE_PRIMARY_EMAIL_USERNAME not between", value1, value2, "usePrimaryEmailUsername");
            return (Criteria) this;
        }

        public Criteria andRequireCustomerRoleIsNull() {
            addCriterion("REQUIRE_CUSTOMER_ROLE is null");
            return (Criteria) this;
        }

        public Criteria andRequireCustomerRoleIsNotNull() {
            addCriterion("REQUIRE_CUSTOMER_ROLE is not null");
            return (Criteria) this;
        }

        public Criteria andRequireCustomerRoleEqualTo(String value) {
            addCriterion("REQUIRE_CUSTOMER_ROLE =", value, "requireCustomerRole");
            return (Criteria) this;
        }

        public Criteria andRequireCustomerRoleNotEqualTo(String value) {
            addCriterion("REQUIRE_CUSTOMER_ROLE <>", value, "requireCustomerRole");
            return (Criteria) this;
        }

        public Criteria andRequireCustomerRoleGreaterThan(String value) {
            addCriterion("REQUIRE_CUSTOMER_ROLE >", value, "requireCustomerRole");
            return (Criteria) this;
        }

        public Criteria andRequireCustomerRoleGreaterThanOrEqualTo(String value) {
            addCriterion("REQUIRE_CUSTOMER_ROLE >=", value, "requireCustomerRole");
            return (Criteria) this;
        }

        public Criteria andRequireCustomerRoleLessThan(String value) {
            addCriterion("REQUIRE_CUSTOMER_ROLE <", value, "requireCustomerRole");
            return (Criteria) this;
        }

        public Criteria andRequireCustomerRoleLessThanOrEqualTo(String value) {
            addCriterion("REQUIRE_CUSTOMER_ROLE <=", value, "requireCustomerRole");
            return (Criteria) this;
        }

        public Criteria andRequireCustomerRoleLike(String value) {
            addCriterion("REQUIRE_CUSTOMER_ROLE like", value, "requireCustomerRole");
            return (Criteria) this;
        }

        public Criteria andRequireCustomerRoleNotLike(String value) {
            addCriterion("REQUIRE_CUSTOMER_ROLE not like", value, "requireCustomerRole");
            return (Criteria) this;
        }

        public Criteria andRequireCustomerRoleIn(List<String> values) {
            addCriterion("REQUIRE_CUSTOMER_ROLE in", values, "requireCustomerRole");
            return (Criteria) this;
        }

        public Criteria andRequireCustomerRoleNotIn(List<String> values) {
            addCriterion("REQUIRE_CUSTOMER_ROLE not in", values, "requireCustomerRole");
            return (Criteria) this;
        }

        public Criteria andRequireCustomerRoleBetween(String value1, String value2) {
            addCriterion("REQUIRE_CUSTOMER_ROLE between", value1, value2, "requireCustomerRole");
            return (Criteria) this;
        }

        public Criteria andRequireCustomerRoleNotBetween(String value1, String value2) {
            addCriterion("REQUIRE_CUSTOMER_ROLE not between", value1, value2, "requireCustomerRole");
            return (Criteria) this;
        }

        public Criteria andAutoInvoiceDigitalItemsIsNull() {
            addCriterion("AUTO_INVOICE_DIGITAL_ITEMS is null");
            return (Criteria) this;
        }

        public Criteria andAutoInvoiceDigitalItemsIsNotNull() {
            addCriterion("AUTO_INVOICE_DIGITAL_ITEMS is not null");
            return (Criteria) this;
        }

        public Criteria andAutoInvoiceDigitalItemsEqualTo(String value) {
            addCriterion("AUTO_INVOICE_DIGITAL_ITEMS =", value, "autoInvoiceDigitalItems");
            return (Criteria) this;
        }

        public Criteria andAutoInvoiceDigitalItemsNotEqualTo(String value) {
            addCriterion("AUTO_INVOICE_DIGITAL_ITEMS <>", value, "autoInvoiceDigitalItems");
            return (Criteria) this;
        }

        public Criteria andAutoInvoiceDigitalItemsGreaterThan(String value) {
            addCriterion("AUTO_INVOICE_DIGITAL_ITEMS >", value, "autoInvoiceDigitalItems");
            return (Criteria) this;
        }

        public Criteria andAutoInvoiceDigitalItemsGreaterThanOrEqualTo(String value) {
            addCriterion("AUTO_INVOICE_DIGITAL_ITEMS >=", value, "autoInvoiceDigitalItems");
            return (Criteria) this;
        }

        public Criteria andAutoInvoiceDigitalItemsLessThan(String value) {
            addCriterion("AUTO_INVOICE_DIGITAL_ITEMS <", value, "autoInvoiceDigitalItems");
            return (Criteria) this;
        }

        public Criteria andAutoInvoiceDigitalItemsLessThanOrEqualTo(String value) {
            addCriterion("AUTO_INVOICE_DIGITAL_ITEMS <=", value, "autoInvoiceDigitalItems");
            return (Criteria) this;
        }

        public Criteria andAutoInvoiceDigitalItemsLike(String value) {
            addCriterion("AUTO_INVOICE_DIGITAL_ITEMS like", value, "autoInvoiceDigitalItems");
            return (Criteria) this;
        }

        public Criteria andAutoInvoiceDigitalItemsNotLike(String value) {
            addCriterion("AUTO_INVOICE_DIGITAL_ITEMS not like", value, "autoInvoiceDigitalItems");
            return (Criteria) this;
        }

        public Criteria andAutoInvoiceDigitalItemsIn(List<String> values) {
            addCriterion("AUTO_INVOICE_DIGITAL_ITEMS in", values, "autoInvoiceDigitalItems");
            return (Criteria) this;
        }

        public Criteria andAutoInvoiceDigitalItemsNotIn(List<String> values) {
            addCriterion("AUTO_INVOICE_DIGITAL_ITEMS not in", values, "autoInvoiceDigitalItems");
            return (Criteria) this;
        }

        public Criteria andAutoInvoiceDigitalItemsBetween(String value1, String value2) {
            addCriterion("AUTO_INVOICE_DIGITAL_ITEMS between", value1, value2, "autoInvoiceDigitalItems");
            return (Criteria) this;
        }

        public Criteria andAutoInvoiceDigitalItemsNotBetween(String value1, String value2) {
            addCriterion("AUTO_INVOICE_DIGITAL_ITEMS not between", value1, value2, "autoInvoiceDigitalItems");
            return (Criteria) this;
        }

        public Criteria andReqShipAddrForDigItemsIsNull() {
            addCriterion("REQ_SHIP_ADDR_FOR_DIG_ITEMS is null");
            return (Criteria) this;
        }

        public Criteria andReqShipAddrForDigItemsIsNotNull() {
            addCriterion("REQ_SHIP_ADDR_FOR_DIG_ITEMS is not null");
            return (Criteria) this;
        }

        public Criteria andReqShipAddrForDigItemsEqualTo(String value) {
            addCriterion("REQ_SHIP_ADDR_FOR_DIG_ITEMS =", value, "reqShipAddrForDigItems");
            return (Criteria) this;
        }

        public Criteria andReqShipAddrForDigItemsNotEqualTo(String value) {
            addCriterion("REQ_SHIP_ADDR_FOR_DIG_ITEMS <>", value, "reqShipAddrForDigItems");
            return (Criteria) this;
        }

        public Criteria andReqShipAddrForDigItemsGreaterThan(String value) {
            addCriterion("REQ_SHIP_ADDR_FOR_DIG_ITEMS >", value, "reqShipAddrForDigItems");
            return (Criteria) this;
        }

        public Criteria andReqShipAddrForDigItemsGreaterThanOrEqualTo(String value) {
            addCriterion("REQ_SHIP_ADDR_FOR_DIG_ITEMS >=", value, "reqShipAddrForDigItems");
            return (Criteria) this;
        }

        public Criteria andReqShipAddrForDigItemsLessThan(String value) {
            addCriterion("REQ_SHIP_ADDR_FOR_DIG_ITEMS <", value, "reqShipAddrForDigItems");
            return (Criteria) this;
        }

        public Criteria andReqShipAddrForDigItemsLessThanOrEqualTo(String value) {
            addCriterion("REQ_SHIP_ADDR_FOR_DIG_ITEMS <=", value, "reqShipAddrForDigItems");
            return (Criteria) this;
        }

        public Criteria andReqShipAddrForDigItemsLike(String value) {
            addCriterion("REQ_SHIP_ADDR_FOR_DIG_ITEMS like", value, "reqShipAddrForDigItems");
            return (Criteria) this;
        }

        public Criteria andReqShipAddrForDigItemsNotLike(String value) {
            addCriterion("REQ_SHIP_ADDR_FOR_DIG_ITEMS not like", value, "reqShipAddrForDigItems");
            return (Criteria) this;
        }

        public Criteria andReqShipAddrForDigItemsIn(List<String> values) {
            addCriterion("REQ_SHIP_ADDR_FOR_DIG_ITEMS in", values, "reqShipAddrForDigItems");
            return (Criteria) this;
        }

        public Criteria andReqShipAddrForDigItemsNotIn(List<String> values) {
            addCriterion("REQ_SHIP_ADDR_FOR_DIG_ITEMS not in", values, "reqShipAddrForDigItems");
            return (Criteria) this;
        }

        public Criteria andReqShipAddrForDigItemsBetween(String value1, String value2) {
            addCriterion("REQ_SHIP_ADDR_FOR_DIG_ITEMS between", value1, value2, "reqShipAddrForDigItems");
            return (Criteria) this;
        }

        public Criteria andReqShipAddrForDigItemsNotBetween(String value1, String value2) {
            addCriterion("REQ_SHIP_ADDR_FOR_DIG_ITEMS not between", value1, value2, "reqShipAddrForDigItems");
            return (Criteria) this;
        }

        public Criteria andShowCheckoutGiftOptionsIsNull() {
            addCriterion("SHOW_CHECKOUT_GIFT_OPTIONS is null");
            return (Criteria) this;
        }

        public Criteria andShowCheckoutGiftOptionsIsNotNull() {
            addCriterion("SHOW_CHECKOUT_GIFT_OPTIONS is not null");
            return (Criteria) this;
        }

        public Criteria andShowCheckoutGiftOptionsEqualTo(String value) {
            addCriterion("SHOW_CHECKOUT_GIFT_OPTIONS =", value, "showCheckoutGiftOptions");
            return (Criteria) this;
        }

        public Criteria andShowCheckoutGiftOptionsNotEqualTo(String value) {
            addCriterion("SHOW_CHECKOUT_GIFT_OPTIONS <>", value, "showCheckoutGiftOptions");
            return (Criteria) this;
        }

        public Criteria andShowCheckoutGiftOptionsGreaterThan(String value) {
            addCriterion("SHOW_CHECKOUT_GIFT_OPTIONS >", value, "showCheckoutGiftOptions");
            return (Criteria) this;
        }

        public Criteria andShowCheckoutGiftOptionsGreaterThanOrEqualTo(String value) {
            addCriterion("SHOW_CHECKOUT_GIFT_OPTIONS >=", value, "showCheckoutGiftOptions");
            return (Criteria) this;
        }

        public Criteria andShowCheckoutGiftOptionsLessThan(String value) {
            addCriterion("SHOW_CHECKOUT_GIFT_OPTIONS <", value, "showCheckoutGiftOptions");
            return (Criteria) this;
        }

        public Criteria andShowCheckoutGiftOptionsLessThanOrEqualTo(String value) {
            addCriterion("SHOW_CHECKOUT_GIFT_OPTIONS <=", value, "showCheckoutGiftOptions");
            return (Criteria) this;
        }

        public Criteria andShowCheckoutGiftOptionsLike(String value) {
            addCriterion("SHOW_CHECKOUT_GIFT_OPTIONS like", value, "showCheckoutGiftOptions");
            return (Criteria) this;
        }

        public Criteria andShowCheckoutGiftOptionsNotLike(String value) {
            addCriterion("SHOW_CHECKOUT_GIFT_OPTIONS not like", value, "showCheckoutGiftOptions");
            return (Criteria) this;
        }

        public Criteria andShowCheckoutGiftOptionsIn(List<String> values) {
            addCriterion("SHOW_CHECKOUT_GIFT_OPTIONS in", values, "showCheckoutGiftOptions");
            return (Criteria) this;
        }

        public Criteria andShowCheckoutGiftOptionsNotIn(List<String> values) {
            addCriterion("SHOW_CHECKOUT_GIFT_OPTIONS not in", values, "showCheckoutGiftOptions");
            return (Criteria) this;
        }

        public Criteria andShowCheckoutGiftOptionsBetween(String value1, String value2) {
            addCriterion("SHOW_CHECKOUT_GIFT_OPTIONS between", value1, value2, "showCheckoutGiftOptions");
            return (Criteria) this;
        }

        public Criteria andShowCheckoutGiftOptionsNotBetween(String value1, String value2) {
            addCriterion("SHOW_CHECKOUT_GIFT_OPTIONS not between", value1, value2, "showCheckoutGiftOptions");
            return (Criteria) this;
        }

        public Criteria andSelectPaymentTypePerItemIsNull() {
            addCriterion("SELECT_PAYMENT_TYPE_PER_ITEM is null");
            return (Criteria) this;
        }

        public Criteria andSelectPaymentTypePerItemIsNotNull() {
            addCriterion("SELECT_PAYMENT_TYPE_PER_ITEM is not null");
            return (Criteria) this;
        }

        public Criteria andSelectPaymentTypePerItemEqualTo(String value) {
            addCriterion("SELECT_PAYMENT_TYPE_PER_ITEM =", value, "selectPaymentTypePerItem");
            return (Criteria) this;
        }

        public Criteria andSelectPaymentTypePerItemNotEqualTo(String value) {
            addCriterion("SELECT_PAYMENT_TYPE_PER_ITEM <>", value, "selectPaymentTypePerItem");
            return (Criteria) this;
        }

        public Criteria andSelectPaymentTypePerItemGreaterThan(String value) {
            addCriterion("SELECT_PAYMENT_TYPE_PER_ITEM >", value, "selectPaymentTypePerItem");
            return (Criteria) this;
        }

        public Criteria andSelectPaymentTypePerItemGreaterThanOrEqualTo(String value) {
            addCriterion("SELECT_PAYMENT_TYPE_PER_ITEM >=", value, "selectPaymentTypePerItem");
            return (Criteria) this;
        }

        public Criteria andSelectPaymentTypePerItemLessThan(String value) {
            addCriterion("SELECT_PAYMENT_TYPE_PER_ITEM <", value, "selectPaymentTypePerItem");
            return (Criteria) this;
        }

        public Criteria andSelectPaymentTypePerItemLessThanOrEqualTo(String value) {
            addCriterion("SELECT_PAYMENT_TYPE_PER_ITEM <=", value, "selectPaymentTypePerItem");
            return (Criteria) this;
        }

        public Criteria andSelectPaymentTypePerItemLike(String value) {
            addCriterion("SELECT_PAYMENT_TYPE_PER_ITEM like", value, "selectPaymentTypePerItem");
            return (Criteria) this;
        }

        public Criteria andSelectPaymentTypePerItemNotLike(String value) {
            addCriterion("SELECT_PAYMENT_TYPE_PER_ITEM not like", value, "selectPaymentTypePerItem");
            return (Criteria) this;
        }

        public Criteria andSelectPaymentTypePerItemIn(List<String> values) {
            addCriterion("SELECT_PAYMENT_TYPE_PER_ITEM in", values, "selectPaymentTypePerItem");
            return (Criteria) this;
        }

        public Criteria andSelectPaymentTypePerItemNotIn(List<String> values) {
            addCriterion("SELECT_PAYMENT_TYPE_PER_ITEM not in", values, "selectPaymentTypePerItem");
            return (Criteria) this;
        }

        public Criteria andSelectPaymentTypePerItemBetween(String value1, String value2) {
            addCriterion("SELECT_PAYMENT_TYPE_PER_ITEM between", value1, value2, "selectPaymentTypePerItem");
            return (Criteria) this;
        }

        public Criteria andSelectPaymentTypePerItemNotBetween(String value1, String value2) {
            addCriterion("SELECT_PAYMENT_TYPE_PER_ITEM not between", value1, value2, "selectPaymentTypePerItem");
            return (Criteria) this;
        }

        public Criteria andShowPricesWithVatTaxIsNull() {
            addCriterion("SHOW_PRICES_WITH_VAT_TAX is null");
            return (Criteria) this;
        }

        public Criteria andShowPricesWithVatTaxIsNotNull() {
            addCriterion("SHOW_PRICES_WITH_VAT_TAX is not null");
            return (Criteria) this;
        }

        public Criteria andShowPricesWithVatTaxEqualTo(String value) {
            addCriterion("SHOW_PRICES_WITH_VAT_TAX =", value, "showPricesWithVatTax");
            return (Criteria) this;
        }

        public Criteria andShowPricesWithVatTaxNotEqualTo(String value) {
            addCriterion("SHOW_PRICES_WITH_VAT_TAX <>", value, "showPricesWithVatTax");
            return (Criteria) this;
        }

        public Criteria andShowPricesWithVatTaxGreaterThan(String value) {
            addCriterion("SHOW_PRICES_WITH_VAT_TAX >", value, "showPricesWithVatTax");
            return (Criteria) this;
        }

        public Criteria andShowPricesWithVatTaxGreaterThanOrEqualTo(String value) {
            addCriterion("SHOW_PRICES_WITH_VAT_TAX >=", value, "showPricesWithVatTax");
            return (Criteria) this;
        }

        public Criteria andShowPricesWithVatTaxLessThan(String value) {
            addCriterion("SHOW_PRICES_WITH_VAT_TAX <", value, "showPricesWithVatTax");
            return (Criteria) this;
        }

        public Criteria andShowPricesWithVatTaxLessThanOrEqualTo(String value) {
            addCriterion("SHOW_PRICES_WITH_VAT_TAX <=", value, "showPricesWithVatTax");
            return (Criteria) this;
        }

        public Criteria andShowPricesWithVatTaxLike(String value) {
            addCriterion("SHOW_PRICES_WITH_VAT_TAX like", value, "showPricesWithVatTax");
            return (Criteria) this;
        }

        public Criteria andShowPricesWithVatTaxNotLike(String value) {
            addCriterion("SHOW_PRICES_WITH_VAT_TAX not like", value, "showPricesWithVatTax");
            return (Criteria) this;
        }

        public Criteria andShowPricesWithVatTaxIn(List<String> values) {
            addCriterion("SHOW_PRICES_WITH_VAT_TAX in", values, "showPricesWithVatTax");
            return (Criteria) this;
        }

        public Criteria andShowPricesWithVatTaxNotIn(List<String> values) {
            addCriterion("SHOW_PRICES_WITH_VAT_TAX not in", values, "showPricesWithVatTax");
            return (Criteria) this;
        }

        public Criteria andShowPricesWithVatTaxBetween(String value1, String value2) {
            addCriterion("SHOW_PRICES_WITH_VAT_TAX between", value1, value2, "showPricesWithVatTax");
            return (Criteria) this;
        }

        public Criteria andShowPricesWithVatTaxNotBetween(String value1, String value2) {
            addCriterion("SHOW_PRICES_WITH_VAT_TAX not between", value1, value2, "showPricesWithVatTax");
            return (Criteria) this;
        }

        public Criteria andShowTaxIsExemptIsNull() {
            addCriterion("SHOW_TAX_IS_EXEMPT is null");
            return (Criteria) this;
        }

        public Criteria andShowTaxIsExemptIsNotNull() {
            addCriterion("SHOW_TAX_IS_EXEMPT is not null");
            return (Criteria) this;
        }

        public Criteria andShowTaxIsExemptEqualTo(String value) {
            addCriterion("SHOW_TAX_IS_EXEMPT =", value, "showTaxIsExempt");
            return (Criteria) this;
        }

        public Criteria andShowTaxIsExemptNotEqualTo(String value) {
            addCriterion("SHOW_TAX_IS_EXEMPT <>", value, "showTaxIsExempt");
            return (Criteria) this;
        }

        public Criteria andShowTaxIsExemptGreaterThan(String value) {
            addCriterion("SHOW_TAX_IS_EXEMPT >", value, "showTaxIsExempt");
            return (Criteria) this;
        }

        public Criteria andShowTaxIsExemptGreaterThanOrEqualTo(String value) {
            addCriterion("SHOW_TAX_IS_EXEMPT >=", value, "showTaxIsExempt");
            return (Criteria) this;
        }

        public Criteria andShowTaxIsExemptLessThan(String value) {
            addCriterion("SHOW_TAX_IS_EXEMPT <", value, "showTaxIsExempt");
            return (Criteria) this;
        }

        public Criteria andShowTaxIsExemptLessThanOrEqualTo(String value) {
            addCriterion("SHOW_TAX_IS_EXEMPT <=", value, "showTaxIsExempt");
            return (Criteria) this;
        }

        public Criteria andShowTaxIsExemptLike(String value) {
            addCriterion("SHOW_TAX_IS_EXEMPT like", value, "showTaxIsExempt");
            return (Criteria) this;
        }

        public Criteria andShowTaxIsExemptNotLike(String value) {
            addCriterion("SHOW_TAX_IS_EXEMPT not like", value, "showTaxIsExempt");
            return (Criteria) this;
        }

        public Criteria andShowTaxIsExemptIn(List<String> values) {
            addCriterion("SHOW_TAX_IS_EXEMPT in", values, "showTaxIsExempt");
            return (Criteria) this;
        }

        public Criteria andShowTaxIsExemptNotIn(List<String> values) {
            addCriterion("SHOW_TAX_IS_EXEMPT not in", values, "showTaxIsExempt");
            return (Criteria) this;
        }

        public Criteria andShowTaxIsExemptBetween(String value1, String value2) {
            addCriterion("SHOW_TAX_IS_EXEMPT between", value1, value2, "showTaxIsExempt");
            return (Criteria) this;
        }

        public Criteria andShowTaxIsExemptNotBetween(String value1, String value2) {
            addCriterion("SHOW_TAX_IS_EXEMPT not between", value1, value2, "showTaxIsExempt");
            return (Criteria) this;
        }

        public Criteria andVatTaxAuthGeoIdIsNull() {
            addCriterion("VAT_TAX_AUTH_GEO_ID is null");
            return (Criteria) this;
        }

        public Criteria andVatTaxAuthGeoIdIsNotNull() {
            addCriterion("VAT_TAX_AUTH_GEO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVatTaxAuthGeoIdEqualTo(String value) {
            addCriterion("VAT_TAX_AUTH_GEO_ID =", value, "vatTaxAuthGeoId");
            return (Criteria) this;
        }

        public Criteria andVatTaxAuthGeoIdNotEqualTo(String value) {
            addCriterion("VAT_TAX_AUTH_GEO_ID <>", value, "vatTaxAuthGeoId");
            return (Criteria) this;
        }

        public Criteria andVatTaxAuthGeoIdGreaterThan(String value) {
            addCriterion("VAT_TAX_AUTH_GEO_ID >", value, "vatTaxAuthGeoId");
            return (Criteria) this;
        }

        public Criteria andVatTaxAuthGeoIdGreaterThanOrEqualTo(String value) {
            addCriterion("VAT_TAX_AUTH_GEO_ID >=", value, "vatTaxAuthGeoId");
            return (Criteria) this;
        }

        public Criteria andVatTaxAuthGeoIdLessThan(String value) {
            addCriterion("VAT_TAX_AUTH_GEO_ID <", value, "vatTaxAuthGeoId");
            return (Criteria) this;
        }

        public Criteria andVatTaxAuthGeoIdLessThanOrEqualTo(String value) {
            addCriterion("VAT_TAX_AUTH_GEO_ID <=", value, "vatTaxAuthGeoId");
            return (Criteria) this;
        }

        public Criteria andVatTaxAuthGeoIdLike(String value) {
            addCriterion("VAT_TAX_AUTH_GEO_ID like", value, "vatTaxAuthGeoId");
            return (Criteria) this;
        }

        public Criteria andVatTaxAuthGeoIdNotLike(String value) {
            addCriterion("VAT_TAX_AUTH_GEO_ID not like", value, "vatTaxAuthGeoId");
            return (Criteria) this;
        }

        public Criteria andVatTaxAuthGeoIdIn(List<String> values) {
            addCriterion("VAT_TAX_AUTH_GEO_ID in", values, "vatTaxAuthGeoId");
            return (Criteria) this;
        }

        public Criteria andVatTaxAuthGeoIdNotIn(List<String> values) {
            addCriterion("VAT_TAX_AUTH_GEO_ID not in", values, "vatTaxAuthGeoId");
            return (Criteria) this;
        }

        public Criteria andVatTaxAuthGeoIdBetween(String value1, String value2) {
            addCriterion("VAT_TAX_AUTH_GEO_ID between", value1, value2, "vatTaxAuthGeoId");
            return (Criteria) this;
        }

        public Criteria andVatTaxAuthGeoIdNotBetween(String value1, String value2) {
            addCriterion("VAT_TAX_AUTH_GEO_ID not between", value1, value2, "vatTaxAuthGeoId");
            return (Criteria) this;
        }

        public Criteria andVatTaxAuthPartyIdIsNull() {
            addCriterion("VAT_TAX_AUTH_PARTY_ID is null");
            return (Criteria) this;
        }

        public Criteria andVatTaxAuthPartyIdIsNotNull() {
            addCriterion("VAT_TAX_AUTH_PARTY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVatTaxAuthPartyIdEqualTo(String value) {
            addCriterion("VAT_TAX_AUTH_PARTY_ID =", value, "vatTaxAuthPartyId");
            return (Criteria) this;
        }

        public Criteria andVatTaxAuthPartyIdNotEqualTo(String value) {
            addCriterion("VAT_TAX_AUTH_PARTY_ID <>", value, "vatTaxAuthPartyId");
            return (Criteria) this;
        }

        public Criteria andVatTaxAuthPartyIdGreaterThan(String value) {
            addCriterion("VAT_TAX_AUTH_PARTY_ID >", value, "vatTaxAuthPartyId");
            return (Criteria) this;
        }

        public Criteria andVatTaxAuthPartyIdGreaterThanOrEqualTo(String value) {
            addCriterion("VAT_TAX_AUTH_PARTY_ID >=", value, "vatTaxAuthPartyId");
            return (Criteria) this;
        }

        public Criteria andVatTaxAuthPartyIdLessThan(String value) {
            addCriterion("VAT_TAX_AUTH_PARTY_ID <", value, "vatTaxAuthPartyId");
            return (Criteria) this;
        }

        public Criteria andVatTaxAuthPartyIdLessThanOrEqualTo(String value) {
            addCriterion("VAT_TAX_AUTH_PARTY_ID <=", value, "vatTaxAuthPartyId");
            return (Criteria) this;
        }

        public Criteria andVatTaxAuthPartyIdLike(String value) {
            addCriterion("VAT_TAX_AUTH_PARTY_ID like", value, "vatTaxAuthPartyId");
            return (Criteria) this;
        }

        public Criteria andVatTaxAuthPartyIdNotLike(String value) {
            addCriterion("VAT_TAX_AUTH_PARTY_ID not like", value, "vatTaxAuthPartyId");
            return (Criteria) this;
        }

        public Criteria andVatTaxAuthPartyIdIn(List<String> values) {
            addCriterion("VAT_TAX_AUTH_PARTY_ID in", values, "vatTaxAuthPartyId");
            return (Criteria) this;
        }

        public Criteria andVatTaxAuthPartyIdNotIn(List<String> values) {
            addCriterion("VAT_TAX_AUTH_PARTY_ID not in", values, "vatTaxAuthPartyId");
            return (Criteria) this;
        }

        public Criteria andVatTaxAuthPartyIdBetween(String value1, String value2) {
            addCriterion("VAT_TAX_AUTH_PARTY_ID between", value1, value2, "vatTaxAuthPartyId");
            return (Criteria) this;
        }

        public Criteria andVatTaxAuthPartyIdNotBetween(String value1, String value2) {
            addCriterion("VAT_TAX_AUTH_PARTY_ID not between", value1, value2, "vatTaxAuthPartyId");
            return (Criteria) this;
        }

        public Criteria andEnableAutoSuggestionListIsNull() {
            addCriterion("ENABLE_AUTO_SUGGESTION_LIST is null");
            return (Criteria) this;
        }

        public Criteria andEnableAutoSuggestionListIsNotNull() {
            addCriterion("ENABLE_AUTO_SUGGESTION_LIST is not null");
            return (Criteria) this;
        }

        public Criteria andEnableAutoSuggestionListEqualTo(String value) {
            addCriterion("ENABLE_AUTO_SUGGESTION_LIST =", value, "enableAutoSuggestionList");
            return (Criteria) this;
        }

        public Criteria andEnableAutoSuggestionListNotEqualTo(String value) {
            addCriterion("ENABLE_AUTO_SUGGESTION_LIST <>", value, "enableAutoSuggestionList");
            return (Criteria) this;
        }

        public Criteria andEnableAutoSuggestionListGreaterThan(String value) {
            addCriterion("ENABLE_AUTO_SUGGESTION_LIST >", value, "enableAutoSuggestionList");
            return (Criteria) this;
        }

        public Criteria andEnableAutoSuggestionListGreaterThanOrEqualTo(String value) {
            addCriterion("ENABLE_AUTO_SUGGESTION_LIST >=", value, "enableAutoSuggestionList");
            return (Criteria) this;
        }

        public Criteria andEnableAutoSuggestionListLessThan(String value) {
            addCriterion("ENABLE_AUTO_SUGGESTION_LIST <", value, "enableAutoSuggestionList");
            return (Criteria) this;
        }

        public Criteria andEnableAutoSuggestionListLessThanOrEqualTo(String value) {
            addCriterion("ENABLE_AUTO_SUGGESTION_LIST <=", value, "enableAutoSuggestionList");
            return (Criteria) this;
        }

        public Criteria andEnableAutoSuggestionListLike(String value) {
            addCriterion("ENABLE_AUTO_SUGGESTION_LIST like", value, "enableAutoSuggestionList");
            return (Criteria) this;
        }

        public Criteria andEnableAutoSuggestionListNotLike(String value) {
            addCriterion("ENABLE_AUTO_SUGGESTION_LIST not like", value, "enableAutoSuggestionList");
            return (Criteria) this;
        }

        public Criteria andEnableAutoSuggestionListIn(List<String> values) {
            addCriterion("ENABLE_AUTO_SUGGESTION_LIST in", values, "enableAutoSuggestionList");
            return (Criteria) this;
        }

        public Criteria andEnableAutoSuggestionListNotIn(List<String> values) {
            addCriterion("ENABLE_AUTO_SUGGESTION_LIST not in", values, "enableAutoSuggestionList");
            return (Criteria) this;
        }

        public Criteria andEnableAutoSuggestionListBetween(String value1, String value2) {
            addCriterion("ENABLE_AUTO_SUGGESTION_LIST between", value1, value2, "enableAutoSuggestionList");
            return (Criteria) this;
        }

        public Criteria andEnableAutoSuggestionListNotBetween(String value1, String value2) {
            addCriterion("ENABLE_AUTO_SUGGESTION_LIST not between", value1, value2, "enableAutoSuggestionList");
            return (Criteria) this;
        }

        public Criteria andEnableDigProdUploadIsNull() {
            addCriterion("ENABLE_DIG_PROD_UPLOAD is null");
            return (Criteria) this;
        }

        public Criteria andEnableDigProdUploadIsNotNull() {
            addCriterion("ENABLE_DIG_PROD_UPLOAD is not null");
            return (Criteria) this;
        }

        public Criteria andEnableDigProdUploadEqualTo(String value) {
            addCriterion("ENABLE_DIG_PROD_UPLOAD =", value, "enableDigProdUpload");
            return (Criteria) this;
        }

        public Criteria andEnableDigProdUploadNotEqualTo(String value) {
            addCriterion("ENABLE_DIG_PROD_UPLOAD <>", value, "enableDigProdUpload");
            return (Criteria) this;
        }

        public Criteria andEnableDigProdUploadGreaterThan(String value) {
            addCriterion("ENABLE_DIG_PROD_UPLOAD >", value, "enableDigProdUpload");
            return (Criteria) this;
        }

        public Criteria andEnableDigProdUploadGreaterThanOrEqualTo(String value) {
            addCriterion("ENABLE_DIG_PROD_UPLOAD >=", value, "enableDigProdUpload");
            return (Criteria) this;
        }

        public Criteria andEnableDigProdUploadLessThan(String value) {
            addCriterion("ENABLE_DIG_PROD_UPLOAD <", value, "enableDigProdUpload");
            return (Criteria) this;
        }

        public Criteria andEnableDigProdUploadLessThanOrEqualTo(String value) {
            addCriterion("ENABLE_DIG_PROD_UPLOAD <=", value, "enableDigProdUpload");
            return (Criteria) this;
        }

        public Criteria andEnableDigProdUploadLike(String value) {
            addCriterion("ENABLE_DIG_PROD_UPLOAD like", value, "enableDigProdUpload");
            return (Criteria) this;
        }

        public Criteria andEnableDigProdUploadNotLike(String value) {
            addCriterion("ENABLE_DIG_PROD_UPLOAD not like", value, "enableDigProdUpload");
            return (Criteria) this;
        }

        public Criteria andEnableDigProdUploadIn(List<String> values) {
            addCriterion("ENABLE_DIG_PROD_UPLOAD in", values, "enableDigProdUpload");
            return (Criteria) this;
        }

        public Criteria andEnableDigProdUploadNotIn(List<String> values) {
            addCriterion("ENABLE_DIG_PROD_UPLOAD not in", values, "enableDigProdUpload");
            return (Criteria) this;
        }

        public Criteria andEnableDigProdUploadBetween(String value1, String value2) {
            addCriterion("ENABLE_DIG_PROD_UPLOAD between", value1, value2, "enableDigProdUpload");
            return (Criteria) this;
        }

        public Criteria andEnableDigProdUploadNotBetween(String value1, String value2) {
            addCriterion("ENABLE_DIG_PROD_UPLOAD not between", value1, value2, "enableDigProdUpload");
            return (Criteria) this;
        }

        public Criteria andProdSearchExcludeVariantsIsNull() {
            addCriterion("PROD_SEARCH_EXCLUDE_VARIANTS is null");
            return (Criteria) this;
        }

        public Criteria andProdSearchExcludeVariantsIsNotNull() {
            addCriterion("PROD_SEARCH_EXCLUDE_VARIANTS is not null");
            return (Criteria) this;
        }

        public Criteria andProdSearchExcludeVariantsEqualTo(String value) {
            addCriterion("PROD_SEARCH_EXCLUDE_VARIANTS =", value, "prodSearchExcludeVariants");
            return (Criteria) this;
        }

        public Criteria andProdSearchExcludeVariantsNotEqualTo(String value) {
            addCriterion("PROD_SEARCH_EXCLUDE_VARIANTS <>", value, "prodSearchExcludeVariants");
            return (Criteria) this;
        }

        public Criteria andProdSearchExcludeVariantsGreaterThan(String value) {
            addCriterion("PROD_SEARCH_EXCLUDE_VARIANTS >", value, "prodSearchExcludeVariants");
            return (Criteria) this;
        }

        public Criteria andProdSearchExcludeVariantsGreaterThanOrEqualTo(String value) {
            addCriterion("PROD_SEARCH_EXCLUDE_VARIANTS >=", value, "prodSearchExcludeVariants");
            return (Criteria) this;
        }

        public Criteria andProdSearchExcludeVariantsLessThan(String value) {
            addCriterion("PROD_SEARCH_EXCLUDE_VARIANTS <", value, "prodSearchExcludeVariants");
            return (Criteria) this;
        }

        public Criteria andProdSearchExcludeVariantsLessThanOrEqualTo(String value) {
            addCriterion("PROD_SEARCH_EXCLUDE_VARIANTS <=", value, "prodSearchExcludeVariants");
            return (Criteria) this;
        }

        public Criteria andProdSearchExcludeVariantsLike(String value) {
            addCriterion("PROD_SEARCH_EXCLUDE_VARIANTS like", value, "prodSearchExcludeVariants");
            return (Criteria) this;
        }

        public Criteria andProdSearchExcludeVariantsNotLike(String value) {
            addCriterion("PROD_SEARCH_EXCLUDE_VARIANTS not like", value, "prodSearchExcludeVariants");
            return (Criteria) this;
        }

        public Criteria andProdSearchExcludeVariantsIn(List<String> values) {
            addCriterion("PROD_SEARCH_EXCLUDE_VARIANTS in", values, "prodSearchExcludeVariants");
            return (Criteria) this;
        }

        public Criteria andProdSearchExcludeVariantsNotIn(List<String> values) {
            addCriterion("PROD_SEARCH_EXCLUDE_VARIANTS not in", values, "prodSearchExcludeVariants");
            return (Criteria) this;
        }

        public Criteria andProdSearchExcludeVariantsBetween(String value1, String value2) {
            addCriterion("PROD_SEARCH_EXCLUDE_VARIANTS between", value1, value2, "prodSearchExcludeVariants");
            return (Criteria) this;
        }

        public Criteria andProdSearchExcludeVariantsNotBetween(String value1, String value2) {
            addCriterion("PROD_SEARCH_EXCLUDE_VARIANTS not between", value1, value2, "prodSearchExcludeVariants");
            return (Criteria) this;
        }

        public Criteria andDigProdUploadCategoryIdIsNull() {
            addCriterion("DIG_PROD_UPLOAD_CATEGORY_ID is null");
            return (Criteria) this;
        }

        public Criteria andDigProdUploadCategoryIdIsNotNull() {
            addCriterion("DIG_PROD_UPLOAD_CATEGORY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDigProdUploadCategoryIdEqualTo(String value) {
            addCriterion("DIG_PROD_UPLOAD_CATEGORY_ID =", value, "digProdUploadCategoryId");
            return (Criteria) this;
        }

        public Criteria andDigProdUploadCategoryIdNotEqualTo(String value) {
            addCriterion("DIG_PROD_UPLOAD_CATEGORY_ID <>", value, "digProdUploadCategoryId");
            return (Criteria) this;
        }

        public Criteria andDigProdUploadCategoryIdGreaterThan(String value) {
            addCriterion("DIG_PROD_UPLOAD_CATEGORY_ID >", value, "digProdUploadCategoryId");
            return (Criteria) this;
        }

        public Criteria andDigProdUploadCategoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("DIG_PROD_UPLOAD_CATEGORY_ID >=", value, "digProdUploadCategoryId");
            return (Criteria) this;
        }

        public Criteria andDigProdUploadCategoryIdLessThan(String value) {
            addCriterion("DIG_PROD_UPLOAD_CATEGORY_ID <", value, "digProdUploadCategoryId");
            return (Criteria) this;
        }

        public Criteria andDigProdUploadCategoryIdLessThanOrEqualTo(String value) {
            addCriterion("DIG_PROD_UPLOAD_CATEGORY_ID <=", value, "digProdUploadCategoryId");
            return (Criteria) this;
        }

        public Criteria andDigProdUploadCategoryIdLike(String value) {
            addCriterion("DIG_PROD_UPLOAD_CATEGORY_ID like", value, "digProdUploadCategoryId");
            return (Criteria) this;
        }

        public Criteria andDigProdUploadCategoryIdNotLike(String value) {
            addCriterion("DIG_PROD_UPLOAD_CATEGORY_ID not like", value, "digProdUploadCategoryId");
            return (Criteria) this;
        }

        public Criteria andDigProdUploadCategoryIdIn(List<String> values) {
            addCriterion("DIG_PROD_UPLOAD_CATEGORY_ID in", values, "digProdUploadCategoryId");
            return (Criteria) this;
        }

        public Criteria andDigProdUploadCategoryIdNotIn(List<String> values) {
            addCriterion("DIG_PROD_UPLOAD_CATEGORY_ID not in", values, "digProdUploadCategoryId");
            return (Criteria) this;
        }

        public Criteria andDigProdUploadCategoryIdBetween(String value1, String value2) {
            addCriterion("DIG_PROD_UPLOAD_CATEGORY_ID between", value1, value2, "digProdUploadCategoryId");
            return (Criteria) this;
        }

        public Criteria andDigProdUploadCategoryIdNotBetween(String value1, String value2) {
            addCriterion("DIG_PROD_UPLOAD_CATEGORY_ID not between", value1, value2, "digProdUploadCategoryId");
            return (Criteria) this;
        }

        public Criteria andAutoOrderCcTryExpIsNull() {
            addCriterion("AUTO_ORDER_CC_TRY_EXP is null");
            return (Criteria) this;
        }

        public Criteria andAutoOrderCcTryExpIsNotNull() {
            addCriterion("AUTO_ORDER_CC_TRY_EXP is not null");
            return (Criteria) this;
        }

        public Criteria andAutoOrderCcTryExpEqualTo(String value) {
            addCriterion("AUTO_ORDER_CC_TRY_EXP =", value, "autoOrderCcTryExp");
            return (Criteria) this;
        }

        public Criteria andAutoOrderCcTryExpNotEqualTo(String value) {
            addCriterion("AUTO_ORDER_CC_TRY_EXP <>", value, "autoOrderCcTryExp");
            return (Criteria) this;
        }

        public Criteria andAutoOrderCcTryExpGreaterThan(String value) {
            addCriterion("AUTO_ORDER_CC_TRY_EXP >", value, "autoOrderCcTryExp");
            return (Criteria) this;
        }

        public Criteria andAutoOrderCcTryExpGreaterThanOrEqualTo(String value) {
            addCriterion("AUTO_ORDER_CC_TRY_EXP >=", value, "autoOrderCcTryExp");
            return (Criteria) this;
        }

        public Criteria andAutoOrderCcTryExpLessThan(String value) {
            addCriterion("AUTO_ORDER_CC_TRY_EXP <", value, "autoOrderCcTryExp");
            return (Criteria) this;
        }

        public Criteria andAutoOrderCcTryExpLessThanOrEqualTo(String value) {
            addCriterion("AUTO_ORDER_CC_TRY_EXP <=", value, "autoOrderCcTryExp");
            return (Criteria) this;
        }

        public Criteria andAutoOrderCcTryExpLike(String value) {
            addCriterion("AUTO_ORDER_CC_TRY_EXP like", value, "autoOrderCcTryExp");
            return (Criteria) this;
        }

        public Criteria andAutoOrderCcTryExpNotLike(String value) {
            addCriterion("AUTO_ORDER_CC_TRY_EXP not like", value, "autoOrderCcTryExp");
            return (Criteria) this;
        }

        public Criteria andAutoOrderCcTryExpIn(List<String> values) {
            addCriterion("AUTO_ORDER_CC_TRY_EXP in", values, "autoOrderCcTryExp");
            return (Criteria) this;
        }

        public Criteria andAutoOrderCcTryExpNotIn(List<String> values) {
            addCriterion("AUTO_ORDER_CC_TRY_EXP not in", values, "autoOrderCcTryExp");
            return (Criteria) this;
        }

        public Criteria andAutoOrderCcTryExpBetween(String value1, String value2) {
            addCriterion("AUTO_ORDER_CC_TRY_EXP between", value1, value2, "autoOrderCcTryExp");
            return (Criteria) this;
        }

        public Criteria andAutoOrderCcTryExpNotBetween(String value1, String value2) {
            addCriterion("AUTO_ORDER_CC_TRY_EXP not between", value1, value2, "autoOrderCcTryExp");
            return (Criteria) this;
        }

        public Criteria andAutoOrderCcTryOtherCardsIsNull() {
            addCriterion("AUTO_ORDER_CC_TRY_OTHER_CARDS is null");
            return (Criteria) this;
        }

        public Criteria andAutoOrderCcTryOtherCardsIsNotNull() {
            addCriterion("AUTO_ORDER_CC_TRY_OTHER_CARDS is not null");
            return (Criteria) this;
        }

        public Criteria andAutoOrderCcTryOtherCardsEqualTo(String value) {
            addCriterion("AUTO_ORDER_CC_TRY_OTHER_CARDS =", value, "autoOrderCcTryOtherCards");
            return (Criteria) this;
        }

        public Criteria andAutoOrderCcTryOtherCardsNotEqualTo(String value) {
            addCriterion("AUTO_ORDER_CC_TRY_OTHER_CARDS <>", value, "autoOrderCcTryOtherCards");
            return (Criteria) this;
        }

        public Criteria andAutoOrderCcTryOtherCardsGreaterThan(String value) {
            addCriterion("AUTO_ORDER_CC_TRY_OTHER_CARDS >", value, "autoOrderCcTryOtherCards");
            return (Criteria) this;
        }

        public Criteria andAutoOrderCcTryOtherCardsGreaterThanOrEqualTo(String value) {
            addCriterion("AUTO_ORDER_CC_TRY_OTHER_CARDS >=", value, "autoOrderCcTryOtherCards");
            return (Criteria) this;
        }

        public Criteria andAutoOrderCcTryOtherCardsLessThan(String value) {
            addCriterion("AUTO_ORDER_CC_TRY_OTHER_CARDS <", value, "autoOrderCcTryOtherCards");
            return (Criteria) this;
        }

        public Criteria andAutoOrderCcTryOtherCardsLessThanOrEqualTo(String value) {
            addCriterion("AUTO_ORDER_CC_TRY_OTHER_CARDS <=", value, "autoOrderCcTryOtherCards");
            return (Criteria) this;
        }

        public Criteria andAutoOrderCcTryOtherCardsLike(String value) {
            addCriterion("AUTO_ORDER_CC_TRY_OTHER_CARDS like", value, "autoOrderCcTryOtherCards");
            return (Criteria) this;
        }

        public Criteria andAutoOrderCcTryOtherCardsNotLike(String value) {
            addCriterion("AUTO_ORDER_CC_TRY_OTHER_CARDS not like", value, "autoOrderCcTryOtherCards");
            return (Criteria) this;
        }

        public Criteria andAutoOrderCcTryOtherCardsIn(List<String> values) {
            addCriterion("AUTO_ORDER_CC_TRY_OTHER_CARDS in", values, "autoOrderCcTryOtherCards");
            return (Criteria) this;
        }

        public Criteria andAutoOrderCcTryOtherCardsNotIn(List<String> values) {
            addCriterion("AUTO_ORDER_CC_TRY_OTHER_CARDS not in", values, "autoOrderCcTryOtherCards");
            return (Criteria) this;
        }

        public Criteria andAutoOrderCcTryOtherCardsBetween(String value1, String value2) {
            addCriterion("AUTO_ORDER_CC_TRY_OTHER_CARDS between", value1, value2, "autoOrderCcTryOtherCards");
            return (Criteria) this;
        }

        public Criteria andAutoOrderCcTryOtherCardsNotBetween(String value1, String value2) {
            addCriterion("AUTO_ORDER_CC_TRY_OTHER_CARDS not between", value1, value2, "autoOrderCcTryOtherCards");
            return (Criteria) this;
        }

        public Criteria andAutoOrderCcTryLaterNsfIsNull() {
            addCriterion("AUTO_ORDER_CC_TRY_LATER_NSF is null");
            return (Criteria) this;
        }

        public Criteria andAutoOrderCcTryLaterNsfIsNotNull() {
            addCriterion("AUTO_ORDER_CC_TRY_LATER_NSF is not null");
            return (Criteria) this;
        }

        public Criteria andAutoOrderCcTryLaterNsfEqualTo(String value) {
            addCriterion("AUTO_ORDER_CC_TRY_LATER_NSF =", value, "autoOrderCcTryLaterNsf");
            return (Criteria) this;
        }

        public Criteria andAutoOrderCcTryLaterNsfNotEqualTo(String value) {
            addCriterion("AUTO_ORDER_CC_TRY_LATER_NSF <>", value, "autoOrderCcTryLaterNsf");
            return (Criteria) this;
        }

        public Criteria andAutoOrderCcTryLaterNsfGreaterThan(String value) {
            addCriterion("AUTO_ORDER_CC_TRY_LATER_NSF >", value, "autoOrderCcTryLaterNsf");
            return (Criteria) this;
        }

        public Criteria andAutoOrderCcTryLaterNsfGreaterThanOrEqualTo(String value) {
            addCriterion("AUTO_ORDER_CC_TRY_LATER_NSF >=", value, "autoOrderCcTryLaterNsf");
            return (Criteria) this;
        }

        public Criteria andAutoOrderCcTryLaterNsfLessThan(String value) {
            addCriterion("AUTO_ORDER_CC_TRY_LATER_NSF <", value, "autoOrderCcTryLaterNsf");
            return (Criteria) this;
        }

        public Criteria andAutoOrderCcTryLaterNsfLessThanOrEqualTo(String value) {
            addCriterion("AUTO_ORDER_CC_TRY_LATER_NSF <=", value, "autoOrderCcTryLaterNsf");
            return (Criteria) this;
        }

        public Criteria andAutoOrderCcTryLaterNsfLike(String value) {
            addCriterion("AUTO_ORDER_CC_TRY_LATER_NSF like", value, "autoOrderCcTryLaterNsf");
            return (Criteria) this;
        }

        public Criteria andAutoOrderCcTryLaterNsfNotLike(String value) {
            addCriterion("AUTO_ORDER_CC_TRY_LATER_NSF not like", value, "autoOrderCcTryLaterNsf");
            return (Criteria) this;
        }

        public Criteria andAutoOrderCcTryLaterNsfIn(List<String> values) {
            addCriterion("AUTO_ORDER_CC_TRY_LATER_NSF in", values, "autoOrderCcTryLaterNsf");
            return (Criteria) this;
        }

        public Criteria andAutoOrderCcTryLaterNsfNotIn(List<String> values) {
            addCriterion("AUTO_ORDER_CC_TRY_LATER_NSF not in", values, "autoOrderCcTryLaterNsf");
            return (Criteria) this;
        }

        public Criteria andAutoOrderCcTryLaterNsfBetween(String value1, String value2) {
            addCriterion("AUTO_ORDER_CC_TRY_LATER_NSF between", value1, value2, "autoOrderCcTryLaterNsf");
            return (Criteria) this;
        }

        public Criteria andAutoOrderCcTryLaterNsfNotBetween(String value1, String value2) {
            addCriterion("AUTO_ORDER_CC_TRY_LATER_NSF not between", value1, value2, "autoOrderCcTryLaterNsf");
            return (Criteria) this;
        }

        public Criteria andAutoOrderCcTryLaterMaxIsNull() {
            addCriterion("AUTO_ORDER_CC_TRY_LATER_MAX is null");
            return (Criteria) this;
        }

        public Criteria andAutoOrderCcTryLaterMaxIsNotNull() {
            addCriterion("AUTO_ORDER_CC_TRY_LATER_MAX is not null");
            return (Criteria) this;
        }

        public Criteria andAutoOrderCcTryLaterMaxEqualTo(BigDecimal value) {
            addCriterion("AUTO_ORDER_CC_TRY_LATER_MAX =", value, "autoOrderCcTryLaterMax");
            return (Criteria) this;
        }

        public Criteria andAutoOrderCcTryLaterMaxNotEqualTo(BigDecimal value) {
            addCriterion("AUTO_ORDER_CC_TRY_LATER_MAX <>", value, "autoOrderCcTryLaterMax");
            return (Criteria) this;
        }

        public Criteria andAutoOrderCcTryLaterMaxGreaterThan(BigDecimal value) {
            addCriterion("AUTO_ORDER_CC_TRY_LATER_MAX >", value, "autoOrderCcTryLaterMax");
            return (Criteria) this;
        }

        public Criteria andAutoOrderCcTryLaterMaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AUTO_ORDER_CC_TRY_LATER_MAX >=", value, "autoOrderCcTryLaterMax");
            return (Criteria) this;
        }

        public Criteria andAutoOrderCcTryLaterMaxLessThan(BigDecimal value) {
            addCriterion("AUTO_ORDER_CC_TRY_LATER_MAX <", value, "autoOrderCcTryLaterMax");
            return (Criteria) this;
        }

        public Criteria andAutoOrderCcTryLaterMaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AUTO_ORDER_CC_TRY_LATER_MAX <=", value, "autoOrderCcTryLaterMax");
            return (Criteria) this;
        }

        public Criteria andAutoOrderCcTryLaterMaxIn(List<BigDecimal> values) {
            addCriterion("AUTO_ORDER_CC_TRY_LATER_MAX in", values, "autoOrderCcTryLaterMax");
            return (Criteria) this;
        }

        public Criteria andAutoOrderCcTryLaterMaxNotIn(List<BigDecimal> values) {
            addCriterion("AUTO_ORDER_CC_TRY_LATER_MAX not in", values, "autoOrderCcTryLaterMax");
            return (Criteria) this;
        }

        public Criteria andAutoOrderCcTryLaterMaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AUTO_ORDER_CC_TRY_LATER_MAX between", value1, value2, "autoOrderCcTryLaterMax");
            return (Criteria) this;
        }

        public Criteria andAutoOrderCcTryLaterMaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AUTO_ORDER_CC_TRY_LATER_MAX not between", value1, value2, "autoOrderCcTryLaterMax");
            return (Criteria) this;
        }

        public Criteria andStoreCreditValidDaysIsNull() {
            addCriterion("STORE_CREDIT_VALID_DAYS is null");
            return (Criteria) this;
        }

        public Criteria andStoreCreditValidDaysIsNotNull() {
            addCriterion("STORE_CREDIT_VALID_DAYS is not null");
            return (Criteria) this;
        }

        public Criteria andStoreCreditValidDaysEqualTo(BigDecimal value) {
            addCriterion("STORE_CREDIT_VALID_DAYS =", value, "storeCreditValidDays");
            return (Criteria) this;
        }

        public Criteria andStoreCreditValidDaysNotEqualTo(BigDecimal value) {
            addCriterion("STORE_CREDIT_VALID_DAYS <>", value, "storeCreditValidDays");
            return (Criteria) this;
        }

        public Criteria andStoreCreditValidDaysGreaterThan(BigDecimal value) {
            addCriterion("STORE_CREDIT_VALID_DAYS >", value, "storeCreditValidDays");
            return (Criteria) this;
        }

        public Criteria andStoreCreditValidDaysGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STORE_CREDIT_VALID_DAYS >=", value, "storeCreditValidDays");
            return (Criteria) this;
        }

        public Criteria andStoreCreditValidDaysLessThan(BigDecimal value) {
            addCriterion("STORE_CREDIT_VALID_DAYS <", value, "storeCreditValidDays");
            return (Criteria) this;
        }

        public Criteria andStoreCreditValidDaysLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STORE_CREDIT_VALID_DAYS <=", value, "storeCreditValidDays");
            return (Criteria) this;
        }

        public Criteria andStoreCreditValidDaysIn(List<BigDecimal> values) {
            addCriterion("STORE_CREDIT_VALID_DAYS in", values, "storeCreditValidDays");
            return (Criteria) this;
        }

        public Criteria andStoreCreditValidDaysNotIn(List<BigDecimal> values) {
            addCriterion("STORE_CREDIT_VALID_DAYS not in", values, "storeCreditValidDays");
            return (Criteria) this;
        }

        public Criteria andStoreCreditValidDaysBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STORE_CREDIT_VALID_DAYS between", value1, value2, "storeCreditValidDays");
            return (Criteria) this;
        }

        public Criteria andStoreCreditValidDaysNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STORE_CREDIT_VALID_DAYS not between", value1, value2, "storeCreditValidDays");
            return (Criteria) this;
        }

        public Criteria andAutoApproveInvoiceIsNull() {
            addCriterion("AUTO_APPROVE_INVOICE is null");
            return (Criteria) this;
        }

        public Criteria andAutoApproveInvoiceIsNotNull() {
            addCriterion("AUTO_APPROVE_INVOICE is not null");
            return (Criteria) this;
        }

        public Criteria andAutoApproveInvoiceEqualTo(String value) {
            addCriterion("AUTO_APPROVE_INVOICE =", value, "autoApproveInvoice");
            return (Criteria) this;
        }

        public Criteria andAutoApproveInvoiceNotEqualTo(String value) {
            addCriterion("AUTO_APPROVE_INVOICE <>", value, "autoApproveInvoice");
            return (Criteria) this;
        }

        public Criteria andAutoApproveInvoiceGreaterThan(String value) {
            addCriterion("AUTO_APPROVE_INVOICE >", value, "autoApproveInvoice");
            return (Criteria) this;
        }

        public Criteria andAutoApproveInvoiceGreaterThanOrEqualTo(String value) {
            addCriterion("AUTO_APPROVE_INVOICE >=", value, "autoApproveInvoice");
            return (Criteria) this;
        }

        public Criteria andAutoApproveInvoiceLessThan(String value) {
            addCriterion("AUTO_APPROVE_INVOICE <", value, "autoApproveInvoice");
            return (Criteria) this;
        }

        public Criteria andAutoApproveInvoiceLessThanOrEqualTo(String value) {
            addCriterion("AUTO_APPROVE_INVOICE <=", value, "autoApproveInvoice");
            return (Criteria) this;
        }

        public Criteria andAutoApproveInvoiceLike(String value) {
            addCriterion("AUTO_APPROVE_INVOICE like", value, "autoApproveInvoice");
            return (Criteria) this;
        }

        public Criteria andAutoApproveInvoiceNotLike(String value) {
            addCriterion("AUTO_APPROVE_INVOICE not like", value, "autoApproveInvoice");
            return (Criteria) this;
        }

        public Criteria andAutoApproveInvoiceIn(List<String> values) {
            addCriterion("AUTO_APPROVE_INVOICE in", values, "autoApproveInvoice");
            return (Criteria) this;
        }

        public Criteria andAutoApproveInvoiceNotIn(List<String> values) {
            addCriterion("AUTO_APPROVE_INVOICE not in", values, "autoApproveInvoice");
            return (Criteria) this;
        }

        public Criteria andAutoApproveInvoiceBetween(String value1, String value2) {
            addCriterion("AUTO_APPROVE_INVOICE between", value1, value2, "autoApproveInvoice");
            return (Criteria) this;
        }

        public Criteria andAutoApproveInvoiceNotBetween(String value1, String value2) {
            addCriterion("AUTO_APPROVE_INVOICE not between", value1, value2, "autoApproveInvoice");
            return (Criteria) this;
        }

        public Criteria andAutoApproveOrderIsNull() {
            addCriterion("AUTO_APPROVE_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andAutoApproveOrderIsNotNull() {
            addCriterion("AUTO_APPROVE_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andAutoApproveOrderEqualTo(String value) {
            addCriterion("AUTO_APPROVE_ORDER =", value, "autoApproveOrder");
            return (Criteria) this;
        }

        public Criteria andAutoApproveOrderNotEqualTo(String value) {
            addCriterion("AUTO_APPROVE_ORDER <>", value, "autoApproveOrder");
            return (Criteria) this;
        }

        public Criteria andAutoApproveOrderGreaterThan(String value) {
            addCriterion("AUTO_APPROVE_ORDER >", value, "autoApproveOrder");
            return (Criteria) this;
        }

        public Criteria andAutoApproveOrderGreaterThanOrEqualTo(String value) {
            addCriterion("AUTO_APPROVE_ORDER >=", value, "autoApproveOrder");
            return (Criteria) this;
        }

        public Criteria andAutoApproveOrderLessThan(String value) {
            addCriterion("AUTO_APPROVE_ORDER <", value, "autoApproveOrder");
            return (Criteria) this;
        }

        public Criteria andAutoApproveOrderLessThanOrEqualTo(String value) {
            addCriterion("AUTO_APPROVE_ORDER <=", value, "autoApproveOrder");
            return (Criteria) this;
        }

        public Criteria andAutoApproveOrderLike(String value) {
            addCriterion("AUTO_APPROVE_ORDER like", value, "autoApproveOrder");
            return (Criteria) this;
        }

        public Criteria andAutoApproveOrderNotLike(String value) {
            addCriterion("AUTO_APPROVE_ORDER not like", value, "autoApproveOrder");
            return (Criteria) this;
        }

        public Criteria andAutoApproveOrderIn(List<String> values) {
            addCriterion("AUTO_APPROVE_ORDER in", values, "autoApproveOrder");
            return (Criteria) this;
        }

        public Criteria andAutoApproveOrderNotIn(List<String> values) {
            addCriterion("AUTO_APPROVE_ORDER not in", values, "autoApproveOrder");
            return (Criteria) this;
        }

        public Criteria andAutoApproveOrderBetween(String value1, String value2) {
            addCriterion("AUTO_APPROVE_ORDER between", value1, value2, "autoApproveOrder");
            return (Criteria) this;
        }

        public Criteria andAutoApproveOrderNotBetween(String value1, String value2) {
            addCriterion("AUTO_APPROVE_ORDER not between", value1, value2, "autoApproveOrder");
            return (Criteria) this;
        }

        public Criteria andShipIfCaptureFailsIsNull() {
            addCriterion("SHIP_IF_CAPTURE_FAILS is null");
            return (Criteria) this;
        }

        public Criteria andShipIfCaptureFailsIsNotNull() {
            addCriterion("SHIP_IF_CAPTURE_FAILS is not null");
            return (Criteria) this;
        }

        public Criteria andShipIfCaptureFailsEqualTo(String value) {
            addCriterion("SHIP_IF_CAPTURE_FAILS =", value, "shipIfCaptureFails");
            return (Criteria) this;
        }

        public Criteria andShipIfCaptureFailsNotEqualTo(String value) {
            addCriterion("SHIP_IF_CAPTURE_FAILS <>", value, "shipIfCaptureFails");
            return (Criteria) this;
        }

        public Criteria andShipIfCaptureFailsGreaterThan(String value) {
            addCriterion("SHIP_IF_CAPTURE_FAILS >", value, "shipIfCaptureFails");
            return (Criteria) this;
        }

        public Criteria andShipIfCaptureFailsGreaterThanOrEqualTo(String value) {
            addCriterion("SHIP_IF_CAPTURE_FAILS >=", value, "shipIfCaptureFails");
            return (Criteria) this;
        }

        public Criteria andShipIfCaptureFailsLessThan(String value) {
            addCriterion("SHIP_IF_CAPTURE_FAILS <", value, "shipIfCaptureFails");
            return (Criteria) this;
        }

        public Criteria andShipIfCaptureFailsLessThanOrEqualTo(String value) {
            addCriterion("SHIP_IF_CAPTURE_FAILS <=", value, "shipIfCaptureFails");
            return (Criteria) this;
        }

        public Criteria andShipIfCaptureFailsLike(String value) {
            addCriterion("SHIP_IF_CAPTURE_FAILS like", value, "shipIfCaptureFails");
            return (Criteria) this;
        }

        public Criteria andShipIfCaptureFailsNotLike(String value) {
            addCriterion("SHIP_IF_CAPTURE_FAILS not like", value, "shipIfCaptureFails");
            return (Criteria) this;
        }

        public Criteria andShipIfCaptureFailsIn(List<String> values) {
            addCriterion("SHIP_IF_CAPTURE_FAILS in", values, "shipIfCaptureFails");
            return (Criteria) this;
        }

        public Criteria andShipIfCaptureFailsNotIn(List<String> values) {
            addCriterion("SHIP_IF_CAPTURE_FAILS not in", values, "shipIfCaptureFails");
            return (Criteria) this;
        }

        public Criteria andShipIfCaptureFailsBetween(String value1, String value2) {
            addCriterion("SHIP_IF_CAPTURE_FAILS between", value1, value2, "shipIfCaptureFails");
            return (Criteria) this;
        }

        public Criteria andShipIfCaptureFailsNotBetween(String value1, String value2) {
            addCriterion("SHIP_IF_CAPTURE_FAILS not between", value1, value2, "shipIfCaptureFails");
            return (Criteria) this;
        }

        public Criteria andSetOwnerUponIssuanceIsNull() {
            addCriterion("SET_OWNER_UPON_ISSUANCE is null");
            return (Criteria) this;
        }

        public Criteria andSetOwnerUponIssuanceIsNotNull() {
            addCriterion("SET_OWNER_UPON_ISSUANCE is not null");
            return (Criteria) this;
        }

        public Criteria andSetOwnerUponIssuanceEqualTo(String value) {
            addCriterion("SET_OWNER_UPON_ISSUANCE =", value, "setOwnerUponIssuance");
            return (Criteria) this;
        }

        public Criteria andSetOwnerUponIssuanceNotEqualTo(String value) {
            addCriterion("SET_OWNER_UPON_ISSUANCE <>", value, "setOwnerUponIssuance");
            return (Criteria) this;
        }

        public Criteria andSetOwnerUponIssuanceGreaterThan(String value) {
            addCriterion("SET_OWNER_UPON_ISSUANCE >", value, "setOwnerUponIssuance");
            return (Criteria) this;
        }

        public Criteria andSetOwnerUponIssuanceGreaterThanOrEqualTo(String value) {
            addCriterion("SET_OWNER_UPON_ISSUANCE >=", value, "setOwnerUponIssuance");
            return (Criteria) this;
        }

        public Criteria andSetOwnerUponIssuanceLessThan(String value) {
            addCriterion("SET_OWNER_UPON_ISSUANCE <", value, "setOwnerUponIssuance");
            return (Criteria) this;
        }

        public Criteria andSetOwnerUponIssuanceLessThanOrEqualTo(String value) {
            addCriterion("SET_OWNER_UPON_ISSUANCE <=", value, "setOwnerUponIssuance");
            return (Criteria) this;
        }

        public Criteria andSetOwnerUponIssuanceLike(String value) {
            addCriterion("SET_OWNER_UPON_ISSUANCE like", value, "setOwnerUponIssuance");
            return (Criteria) this;
        }

        public Criteria andSetOwnerUponIssuanceNotLike(String value) {
            addCriterion("SET_OWNER_UPON_ISSUANCE not like", value, "setOwnerUponIssuance");
            return (Criteria) this;
        }

        public Criteria andSetOwnerUponIssuanceIn(List<String> values) {
            addCriterion("SET_OWNER_UPON_ISSUANCE in", values, "setOwnerUponIssuance");
            return (Criteria) this;
        }

        public Criteria andSetOwnerUponIssuanceNotIn(List<String> values) {
            addCriterion("SET_OWNER_UPON_ISSUANCE not in", values, "setOwnerUponIssuance");
            return (Criteria) this;
        }

        public Criteria andSetOwnerUponIssuanceBetween(String value1, String value2) {
            addCriterion("SET_OWNER_UPON_ISSUANCE between", value1, value2, "setOwnerUponIssuance");
            return (Criteria) this;
        }

        public Criteria andSetOwnerUponIssuanceNotBetween(String value1, String value2) {
            addCriterion("SET_OWNER_UPON_ISSUANCE not between", value1, value2, "setOwnerUponIssuance");
            return (Criteria) this;
        }

        public Criteria andReqReturnInventoryReceiveIsNull() {
            addCriterion("REQ_RETURN_INVENTORY_RECEIVE is null");
            return (Criteria) this;
        }

        public Criteria andReqReturnInventoryReceiveIsNotNull() {
            addCriterion("REQ_RETURN_INVENTORY_RECEIVE is not null");
            return (Criteria) this;
        }

        public Criteria andReqReturnInventoryReceiveEqualTo(String value) {
            addCriterion("REQ_RETURN_INVENTORY_RECEIVE =", value, "reqReturnInventoryReceive");
            return (Criteria) this;
        }

        public Criteria andReqReturnInventoryReceiveNotEqualTo(String value) {
            addCriterion("REQ_RETURN_INVENTORY_RECEIVE <>", value, "reqReturnInventoryReceive");
            return (Criteria) this;
        }

        public Criteria andReqReturnInventoryReceiveGreaterThan(String value) {
            addCriterion("REQ_RETURN_INVENTORY_RECEIVE >", value, "reqReturnInventoryReceive");
            return (Criteria) this;
        }

        public Criteria andReqReturnInventoryReceiveGreaterThanOrEqualTo(String value) {
            addCriterion("REQ_RETURN_INVENTORY_RECEIVE >=", value, "reqReturnInventoryReceive");
            return (Criteria) this;
        }

        public Criteria andReqReturnInventoryReceiveLessThan(String value) {
            addCriterion("REQ_RETURN_INVENTORY_RECEIVE <", value, "reqReturnInventoryReceive");
            return (Criteria) this;
        }

        public Criteria andReqReturnInventoryReceiveLessThanOrEqualTo(String value) {
            addCriterion("REQ_RETURN_INVENTORY_RECEIVE <=", value, "reqReturnInventoryReceive");
            return (Criteria) this;
        }

        public Criteria andReqReturnInventoryReceiveLike(String value) {
            addCriterion("REQ_RETURN_INVENTORY_RECEIVE like", value, "reqReturnInventoryReceive");
            return (Criteria) this;
        }

        public Criteria andReqReturnInventoryReceiveNotLike(String value) {
            addCriterion("REQ_RETURN_INVENTORY_RECEIVE not like", value, "reqReturnInventoryReceive");
            return (Criteria) this;
        }

        public Criteria andReqReturnInventoryReceiveIn(List<String> values) {
            addCriterion("REQ_RETURN_INVENTORY_RECEIVE in", values, "reqReturnInventoryReceive");
            return (Criteria) this;
        }

        public Criteria andReqReturnInventoryReceiveNotIn(List<String> values) {
            addCriterion("REQ_RETURN_INVENTORY_RECEIVE not in", values, "reqReturnInventoryReceive");
            return (Criteria) this;
        }

        public Criteria andReqReturnInventoryReceiveBetween(String value1, String value2) {
            addCriterion("REQ_RETURN_INVENTORY_RECEIVE between", value1, value2, "reqReturnInventoryReceive");
            return (Criteria) this;
        }

        public Criteria andReqReturnInventoryReceiveNotBetween(String value1, String value2) {
            addCriterion("REQ_RETURN_INVENTORY_RECEIVE not between", value1, value2, "reqReturnInventoryReceive");
            return (Criteria) this;
        }

        public Criteria andAddToCartRemoveIncompatIsNull() {
            addCriterion("ADD_TO_CART_REMOVE_INCOMPAT is null");
            return (Criteria) this;
        }

        public Criteria andAddToCartRemoveIncompatIsNotNull() {
            addCriterion("ADD_TO_CART_REMOVE_INCOMPAT is not null");
            return (Criteria) this;
        }

        public Criteria andAddToCartRemoveIncompatEqualTo(String value) {
            addCriterion("ADD_TO_CART_REMOVE_INCOMPAT =", value, "addToCartRemoveIncompat");
            return (Criteria) this;
        }

        public Criteria andAddToCartRemoveIncompatNotEqualTo(String value) {
            addCriterion("ADD_TO_CART_REMOVE_INCOMPAT <>", value, "addToCartRemoveIncompat");
            return (Criteria) this;
        }

        public Criteria andAddToCartRemoveIncompatGreaterThan(String value) {
            addCriterion("ADD_TO_CART_REMOVE_INCOMPAT >", value, "addToCartRemoveIncompat");
            return (Criteria) this;
        }

        public Criteria andAddToCartRemoveIncompatGreaterThanOrEqualTo(String value) {
            addCriterion("ADD_TO_CART_REMOVE_INCOMPAT >=", value, "addToCartRemoveIncompat");
            return (Criteria) this;
        }

        public Criteria andAddToCartRemoveIncompatLessThan(String value) {
            addCriterion("ADD_TO_CART_REMOVE_INCOMPAT <", value, "addToCartRemoveIncompat");
            return (Criteria) this;
        }

        public Criteria andAddToCartRemoveIncompatLessThanOrEqualTo(String value) {
            addCriterion("ADD_TO_CART_REMOVE_INCOMPAT <=", value, "addToCartRemoveIncompat");
            return (Criteria) this;
        }

        public Criteria andAddToCartRemoveIncompatLike(String value) {
            addCriterion("ADD_TO_CART_REMOVE_INCOMPAT like", value, "addToCartRemoveIncompat");
            return (Criteria) this;
        }

        public Criteria andAddToCartRemoveIncompatNotLike(String value) {
            addCriterion("ADD_TO_CART_REMOVE_INCOMPAT not like", value, "addToCartRemoveIncompat");
            return (Criteria) this;
        }

        public Criteria andAddToCartRemoveIncompatIn(List<String> values) {
            addCriterion("ADD_TO_CART_REMOVE_INCOMPAT in", values, "addToCartRemoveIncompat");
            return (Criteria) this;
        }

        public Criteria andAddToCartRemoveIncompatNotIn(List<String> values) {
            addCriterion("ADD_TO_CART_REMOVE_INCOMPAT not in", values, "addToCartRemoveIncompat");
            return (Criteria) this;
        }

        public Criteria andAddToCartRemoveIncompatBetween(String value1, String value2) {
            addCriterion("ADD_TO_CART_REMOVE_INCOMPAT between", value1, value2, "addToCartRemoveIncompat");
            return (Criteria) this;
        }

        public Criteria andAddToCartRemoveIncompatNotBetween(String value1, String value2) {
            addCriterion("ADD_TO_CART_REMOVE_INCOMPAT not between", value1, value2, "addToCartRemoveIncompat");
            return (Criteria) this;
        }

        public Criteria andAddToCartReplaceUpsellIsNull() {
            addCriterion("ADD_TO_CART_REPLACE_UPSELL is null");
            return (Criteria) this;
        }

        public Criteria andAddToCartReplaceUpsellIsNotNull() {
            addCriterion("ADD_TO_CART_REPLACE_UPSELL is not null");
            return (Criteria) this;
        }

        public Criteria andAddToCartReplaceUpsellEqualTo(String value) {
            addCriterion("ADD_TO_CART_REPLACE_UPSELL =", value, "addToCartReplaceUpsell");
            return (Criteria) this;
        }

        public Criteria andAddToCartReplaceUpsellNotEqualTo(String value) {
            addCriterion("ADD_TO_CART_REPLACE_UPSELL <>", value, "addToCartReplaceUpsell");
            return (Criteria) this;
        }

        public Criteria andAddToCartReplaceUpsellGreaterThan(String value) {
            addCriterion("ADD_TO_CART_REPLACE_UPSELL >", value, "addToCartReplaceUpsell");
            return (Criteria) this;
        }

        public Criteria andAddToCartReplaceUpsellGreaterThanOrEqualTo(String value) {
            addCriterion("ADD_TO_CART_REPLACE_UPSELL >=", value, "addToCartReplaceUpsell");
            return (Criteria) this;
        }

        public Criteria andAddToCartReplaceUpsellLessThan(String value) {
            addCriterion("ADD_TO_CART_REPLACE_UPSELL <", value, "addToCartReplaceUpsell");
            return (Criteria) this;
        }

        public Criteria andAddToCartReplaceUpsellLessThanOrEqualTo(String value) {
            addCriterion("ADD_TO_CART_REPLACE_UPSELL <=", value, "addToCartReplaceUpsell");
            return (Criteria) this;
        }

        public Criteria andAddToCartReplaceUpsellLike(String value) {
            addCriterion("ADD_TO_CART_REPLACE_UPSELL like", value, "addToCartReplaceUpsell");
            return (Criteria) this;
        }

        public Criteria andAddToCartReplaceUpsellNotLike(String value) {
            addCriterion("ADD_TO_CART_REPLACE_UPSELL not like", value, "addToCartReplaceUpsell");
            return (Criteria) this;
        }

        public Criteria andAddToCartReplaceUpsellIn(List<String> values) {
            addCriterion("ADD_TO_CART_REPLACE_UPSELL in", values, "addToCartReplaceUpsell");
            return (Criteria) this;
        }

        public Criteria andAddToCartReplaceUpsellNotIn(List<String> values) {
            addCriterion("ADD_TO_CART_REPLACE_UPSELL not in", values, "addToCartReplaceUpsell");
            return (Criteria) this;
        }

        public Criteria andAddToCartReplaceUpsellBetween(String value1, String value2) {
            addCriterion("ADD_TO_CART_REPLACE_UPSELL between", value1, value2, "addToCartReplaceUpsell");
            return (Criteria) this;
        }

        public Criteria andAddToCartReplaceUpsellNotBetween(String value1, String value2) {
            addCriterion("ADD_TO_CART_REPLACE_UPSELL not between", value1, value2, "addToCartReplaceUpsell");
            return (Criteria) this;
        }

        public Criteria andSplitPayPrefPerShpGrpIsNull() {
            addCriterion("SPLIT_PAY_PREF_PER_SHP_GRP is null");
            return (Criteria) this;
        }

        public Criteria andSplitPayPrefPerShpGrpIsNotNull() {
            addCriterion("SPLIT_PAY_PREF_PER_SHP_GRP is not null");
            return (Criteria) this;
        }

        public Criteria andSplitPayPrefPerShpGrpEqualTo(String value) {
            addCriterion("SPLIT_PAY_PREF_PER_SHP_GRP =", value, "splitPayPrefPerShpGrp");
            return (Criteria) this;
        }

        public Criteria andSplitPayPrefPerShpGrpNotEqualTo(String value) {
            addCriterion("SPLIT_PAY_PREF_PER_SHP_GRP <>", value, "splitPayPrefPerShpGrp");
            return (Criteria) this;
        }

        public Criteria andSplitPayPrefPerShpGrpGreaterThan(String value) {
            addCriterion("SPLIT_PAY_PREF_PER_SHP_GRP >", value, "splitPayPrefPerShpGrp");
            return (Criteria) this;
        }

        public Criteria andSplitPayPrefPerShpGrpGreaterThanOrEqualTo(String value) {
            addCriterion("SPLIT_PAY_PREF_PER_SHP_GRP >=", value, "splitPayPrefPerShpGrp");
            return (Criteria) this;
        }

        public Criteria andSplitPayPrefPerShpGrpLessThan(String value) {
            addCriterion("SPLIT_PAY_PREF_PER_SHP_GRP <", value, "splitPayPrefPerShpGrp");
            return (Criteria) this;
        }

        public Criteria andSplitPayPrefPerShpGrpLessThanOrEqualTo(String value) {
            addCriterion("SPLIT_PAY_PREF_PER_SHP_GRP <=", value, "splitPayPrefPerShpGrp");
            return (Criteria) this;
        }

        public Criteria andSplitPayPrefPerShpGrpLike(String value) {
            addCriterion("SPLIT_PAY_PREF_PER_SHP_GRP like", value, "splitPayPrefPerShpGrp");
            return (Criteria) this;
        }

        public Criteria andSplitPayPrefPerShpGrpNotLike(String value) {
            addCriterion("SPLIT_PAY_PREF_PER_SHP_GRP not like", value, "splitPayPrefPerShpGrp");
            return (Criteria) this;
        }

        public Criteria andSplitPayPrefPerShpGrpIn(List<String> values) {
            addCriterion("SPLIT_PAY_PREF_PER_SHP_GRP in", values, "splitPayPrefPerShpGrp");
            return (Criteria) this;
        }

        public Criteria andSplitPayPrefPerShpGrpNotIn(List<String> values) {
            addCriterion("SPLIT_PAY_PREF_PER_SHP_GRP not in", values, "splitPayPrefPerShpGrp");
            return (Criteria) this;
        }

        public Criteria andSplitPayPrefPerShpGrpBetween(String value1, String value2) {
            addCriterion("SPLIT_PAY_PREF_PER_SHP_GRP between", value1, value2, "splitPayPrefPerShpGrp");
            return (Criteria) this;
        }

        public Criteria andSplitPayPrefPerShpGrpNotBetween(String value1, String value2) {
            addCriterion("SPLIT_PAY_PREF_PER_SHP_GRP not between", value1, value2, "splitPayPrefPerShpGrp");
            return (Criteria) this;
        }

        public Criteria andManagedByLotIsNull() {
            addCriterion("MANAGED_BY_LOT is null");
            return (Criteria) this;
        }

        public Criteria andManagedByLotIsNotNull() {
            addCriterion("MANAGED_BY_LOT is not null");
            return (Criteria) this;
        }

        public Criteria andManagedByLotEqualTo(String value) {
            addCriterion("MANAGED_BY_LOT =", value, "managedByLot");
            return (Criteria) this;
        }

        public Criteria andManagedByLotNotEqualTo(String value) {
            addCriterion("MANAGED_BY_LOT <>", value, "managedByLot");
            return (Criteria) this;
        }

        public Criteria andManagedByLotGreaterThan(String value) {
            addCriterion("MANAGED_BY_LOT >", value, "managedByLot");
            return (Criteria) this;
        }

        public Criteria andManagedByLotGreaterThanOrEqualTo(String value) {
            addCriterion("MANAGED_BY_LOT >=", value, "managedByLot");
            return (Criteria) this;
        }

        public Criteria andManagedByLotLessThan(String value) {
            addCriterion("MANAGED_BY_LOT <", value, "managedByLot");
            return (Criteria) this;
        }

        public Criteria andManagedByLotLessThanOrEqualTo(String value) {
            addCriterion("MANAGED_BY_LOT <=", value, "managedByLot");
            return (Criteria) this;
        }

        public Criteria andManagedByLotLike(String value) {
            addCriterion("MANAGED_BY_LOT like", value, "managedByLot");
            return (Criteria) this;
        }

        public Criteria andManagedByLotNotLike(String value) {
            addCriterion("MANAGED_BY_LOT not like", value, "managedByLot");
            return (Criteria) this;
        }

        public Criteria andManagedByLotIn(List<String> values) {
            addCriterion("MANAGED_BY_LOT in", values, "managedByLot");
            return (Criteria) this;
        }

        public Criteria andManagedByLotNotIn(List<String> values) {
            addCriterion("MANAGED_BY_LOT not in", values, "managedByLot");
            return (Criteria) this;
        }

        public Criteria andManagedByLotBetween(String value1, String value2) {
            addCriterion("MANAGED_BY_LOT between", value1, value2, "managedByLot");
            return (Criteria) this;
        }

        public Criteria andManagedByLotNotBetween(String value1, String value2) {
            addCriterion("MANAGED_BY_LOT not between", value1, value2, "managedByLot");
            return (Criteria) this;
        }

        public Criteria andShowOutOfStockProductsIsNull() {
            addCriterion("SHOW_OUT_OF_STOCK_PRODUCTS is null");
            return (Criteria) this;
        }

        public Criteria andShowOutOfStockProductsIsNotNull() {
            addCriterion("SHOW_OUT_OF_STOCK_PRODUCTS is not null");
            return (Criteria) this;
        }

        public Criteria andShowOutOfStockProductsEqualTo(String value) {
            addCriterion("SHOW_OUT_OF_STOCK_PRODUCTS =", value, "showOutOfStockProducts");
            return (Criteria) this;
        }

        public Criteria andShowOutOfStockProductsNotEqualTo(String value) {
            addCriterion("SHOW_OUT_OF_STOCK_PRODUCTS <>", value, "showOutOfStockProducts");
            return (Criteria) this;
        }

        public Criteria andShowOutOfStockProductsGreaterThan(String value) {
            addCriterion("SHOW_OUT_OF_STOCK_PRODUCTS >", value, "showOutOfStockProducts");
            return (Criteria) this;
        }

        public Criteria andShowOutOfStockProductsGreaterThanOrEqualTo(String value) {
            addCriterion("SHOW_OUT_OF_STOCK_PRODUCTS >=", value, "showOutOfStockProducts");
            return (Criteria) this;
        }

        public Criteria andShowOutOfStockProductsLessThan(String value) {
            addCriterion("SHOW_OUT_OF_STOCK_PRODUCTS <", value, "showOutOfStockProducts");
            return (Criteria) this;
        }

        public Criteria andShowOutOfStockProductsLessThanOrEqualTo(String value) {
            addCriterion("SHOW_OUT_OF_STOCK_PRODUCTS <=", value, "showOutOfStockProducts");
            return (Criteria) this;
        }

        public Criteria andShowOutOfStockProductsLike(String value) {
            addCriterion("SHOW_OUT_OF_STOCK_PRODUCTS like", value, "showOutOfStockProducts");
            return (Criteria) this;
        }

        public Criteria andShowOutOfStockProductsNotLike(String value) {
            addCriterion("SHOW_OUT_OF_STOCK_PRODUCTS not like", value, "showOutOfStockProducts");
            return (Criteria) this;
        }

        public Criteria andShowOutOfStockProductsIn(List<String> values) {
            addCriterion("SHOW_OUT_OF_STOCK_PRODUCTS in", values, "showOutOfStockProducts");
            return (Criteria) this;
        }

        public Criteria andShowOutOfStockProductsNotIn(List<String> values) {
            addCriterion("SHOW_OUT_OF_STOCK_PRODUCTS not in", values, "showOutOfStockProducts");
            return (Criteria) this;
        }

        public Criteria andShowOutOfStockProductsBetween(String value1, String value2) {
            addCriterion("SHOW_OUT_OF_STOCK_PRODUCTS between", value1, value2, "showOutOfStockProducts");
            return (Criteria) this;
        }

        public Criteria andShowOutOfStockProductsNotBetween(String value1, String value2) {
            addCriterion("SHOW_OUT_OF_STOCK_PRODUCTS not between", value1, value2, "showOutOfStockProducts");
            return (Criteria) this;
        }

        public Criteria andOrderDecimalQuantityIsNull() {
            addCriterion("ORDER_DECIMAL_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andOrderDecimalQuantityIsNotNull() {
            addCriterion("ORDER_DECIMAL_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDecimalQuantityEqualTo(String value) {
            addCriterion("ORDER_DECIMAL_QUANTITY =", value, "orderDecimalQuantity");
            return (Criteria) this;
        }

        public Criteria andOrderDecimalQuantityNotEqualTo(String value) {
            addCriterion("ORDER_DECIMAL_QUANTITY <>", value, "orderDecimalQuantity");
            return (Criteria) this;
        }

        public Criteria andOrderDecimalQuantityGreaterThan(String value) {
            addCriterion("ORDER_DECIMAL_QUANTITY >", value, "orderDecimalQuantity");
            return (Criteria) this;
        }

        public Criteria andOrderDecimalQuantityGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_DECIMAL_QUANTITY >=", value, "orderDecimalQuantity");
            return (Criteria) this;
        }

        public Criteria andOrderDecimalQuantityLessThan(String value) {
            addCriterion("ORDER_DECIMAL_QUANTITY <", value, "orderDecimalQuantity");
            return (Criteria) this;
        }

        public Criteria andOrderDecimalQuantityLessThanOrEqualTo(String value) {
            addCriterion("ORDER_DECIMAL_QUANTITY <=", value, "orderDecimalQuantity");
            return (Criteria) this;
        }

        public Criteria andOrderDecimalQuantityLike(String value) {
            addCriterion("ORDER_DECIMAL_QUANTITY like", value, "orderDecimalQuantity");
            return (Criteria) this;
        }

        public Criteria andOrderDecimalQuantityNotLike(String value) {
            addCriterion("ORDER_DECIMAL_QUANTITY not like", value, "orderDecimalQuantity");
            return (Criteria) this;
        }

        public Criteria andOrderDecimalQuantityIn(List<String> values) {
            addCriterion("ORDER_DECIMAL_QUANTITY in", values, "orderDecimalQuantity");
            return (Criteria) this;
        }

        public Criteria andOrderDecimalQuantityNotIn(List<String> values) {
            addCriterion("ORDER_DECIMAL_QUANTITY not in", values, "orderDecimalQuantity");
            return (Criteria) this;
        }

        public Criteria andOrderDecimalQuantityBetween(String value1, String value2) {
            addCriterion("ORDER_DECIMAL_QUANTITY between", value1, value2, "orderDecimalQuantity");
            return (Criteria) this;
        }

        public Criteria andOrderDecimalQuantityNotBetween(String value1, String value2) {
            addCriterion("ORDER_DECIMAL_QUANTITY not between", value1, value2, "orderDecimalQuantity");
            return (Criteria) this;
        }

        public Criteria andAllowCommentIsNull() {
            addCriterion("ALLOW_COMMENT is null");
            return (Criteria) this;
        }

        public Criteria andAllowCommentIsNotNull() {
            addCriterion("ALLOW_COMMENT is not null");
            return (Criteria) this;
        }

        public Criteria andAllowCommentEqualTo(String value) {
            addCriterion("ALLOW_COMMENT =", value, "allowComment");
            return (Criteria) this;
        }

        public Criteria andAllowCommentNotEqualTo(String value) {
            addCriterion("ALLOW_COMMENT <>", value, "allowComment");
            return (Criteria) this;
        }

        public Criteria andAllowCommentGreaterThan(String value) {
            addCriterion("ALLOW_COMMENT >", value, "allowComment");
            return (Criteria) this;
        }

        public Criteria andAllowCommentGreaterThanOrEqualTo(String value) {
            addCriterion("ALLOW_COMMENT >=", value, "allowComment");
            return (Criteria) this;
        }

        public Criteria andAllowCommentLessThan(String value) {
            addCriterion("ALLOW_COMMENT <", value, "allowComment");
            return (Criteria) this;
        }

        public Criteria andAllowCommentLessThanOrEqualTo(String value) {
            addCriterion("ALLOW_COMMENT <=", value, "allowComment");
            return (Criteria) this;
        }

        public Criteria andAllowCommentLike(String value) {
            addCriterion("ALLOW_COMMENT like", value, "allowComment");
            return (Criteria) this;
        }

        public Criteria andAllowCommentNotLike(String value) {
            addCriterion("ALLOW_COMMENT not like", value, "allowComment");
            return (Criteria) this;
        }

        public Criteria andAllowCommentIn(List<String> values) {
            addCriterion("ALLOW_COMMENT in", values, "allowComment");
            return (Criteria) this;
        }

        public Criteria andAllowCommentNotIn(List<String> values) {
            addCriterion("ALLOW_COMMENT not in", values, "allowComment");
            return (Criteria) this;
        }

        public Criteria andAllowCommentBetween(String value1, String value2) {
            addCriterion("ALLOW_COMMENT between", value1, value2, "allowComment");
            return (Criteria) this;
        }

        public Criteria andAllowCommentNotBetween(String value1, String value2) {
            addCriterion("ALLOW_COMMENT not between", value1, value2, "allowComment");
            return (Criteria) this;
        }

        public Criteria andStyleSheetIsNull() {
            addCriterion("STYLE_SHEET is null");
            return (Criteria) this;
        }

        public Criteria andStyleSheetIsNotNull() {
            addCriterion("STYLE_SHEET is not null");
            return (Criteria) this;
        }

        public Criteria andStyleSheetEqualTo(String value) {
            addCriterion("STYLE_SHEET =", value, "styleSheet");
            return (Criteria) this;
        }

        public Criteria andStyleSheetNotEqualTo(String value) {
            addCriterion("STYLE_SHEET <>", value, "styleSheet");
            return (Criteria) this;
        }

        public Criteria andStyleSheetGreaterThan(String value) {
            addCriterion("STYLE_SHEET >", value, "styleSheet");
            return (Criteria) this;
        }

        public Criteria andStyleSheetGreaterThanOrEqualTo(String value) {
            addCriterion("STYLE_SHEET >=", value, "styleSheet");
            return (Criteria) this;
        }

        public Criteria andStyleSheetLessThan(String value) {
            addCriterion("STYLE_SHEET <", value, "styleSheet");
            return (Criteria) this;
        }

        public Criteria andStyleSheetLessThanOrEqualTo(String value) {
            addCriterion("STYLE_SHEET <=", value, "styleSheet");
            return (Criteria) this;
        }

        public Criteria andStyleSheetLike(String value) {
            addCriterion("STYLE_SHEET like", value, "styleSheet");
            return (Criteria) this;
        }

        public Criteria andStyleSheetNotLike(String value) {
            addCriterion("STYLE_SHEET not like", value, "styleSheet");
            return (Criteria) this;
        }

        public Criteria andStyleSheetIn(List<String> values) {
            addCriterion("STYLE_SHEET in", values, "styleSheet");
            return (Criteria) this;
        }

        public Criteria andStyleSheetNotIn(List<String> values) {
            addCriterion("STYLE_SHEET not in", values, "styleSheet");
            return (Criteria) this;
        }

        public Criteria andStyleSheetBetween(String value1, String value2) {
            addCriterion("STYLE_SHEET between", value1, value2, "styleSheet");
            return (Criteria) this;
        }

        public Criteria andStyleSheetNotBetween(String value1, String value2) {
            addCriterion("STYLE_SHEET not between", value1, value2, "styleSheet");
            return (Criteria) this;
        }

        public Criteria andHeaderLogoIsNull() {
            addCriterion("HEADER_LOGO is null");
            return (Criteria) this;
        }

        public Criteria andHeaderLogoIsNotNull() {
            addCriterion("HEADER_LOGO is not null");
            return (Criteria) this;
        }

        public Criteria andHeaderLogoEqualTo(String value) {
            addCriterion("HEADER_LOGO =", value, "headerLogo");
            return (Criteria) this;
        }

        public Criteria andHeaderLogoNotEqualTo(String value) {
            addCriterion("HEADER_LOGO <>", value, "headerLogo");
            return (Criteria) this;
        }

        public Criteria andHeaderLogoGreaterThan(String value) {
            addCriterion("HEADER_LOGO >", value, "headerLogo");
            return (Criteria) this;
        }

        public Criteria andHeaderLogoGreaterThanOrEqualTo(String value) {
            addCriterion("HEADER_LOGO >=", value, "headerLogo");
            return (Criteria) this;
        }

        public Criteria andHeaderLogoLessThan(String value) {
            addCriterion("HEADER_LOGO <", value, "headerLogo");
            return (Criteria) this;
        }

        public Criteria andHeaderLogoLessThanOrEqualTo(String value) {
            addCriterion("HEADER_LOGO <=", value, "headerLogo");
            return (Criteria) this;
        }

        public Criteria andHeaderLogoLike(String value) {
            addCriterion("HEADER_LOGO like", value, "headerLogo");
            return (Criteria) this;
        }

        public Criteria andHeaderLogoNotLike(String value) {
            addCriterion("HEADER_LOGO not like", value, "headerLogo");
            return (Criteria) this;
        }

        public Criteria andHeaderLogoIn(List<String> values) {
            addCriterion("HEADER_LOGO in", values, "headerLogo");
            return (Criteria) this;
        }

        public Criteria andHeaderLogoNotIn(List<String> values) {
            addCriterion("HEADER_LOGO not in", values, "headerLogo");
            return (Criteria) this;
        }

        public Criteria andHeaderLogoBetween(String value1, String value2) {
            addCriterion("HEADER_LOGO between", value1, value2, "headerLogo");
            return (Criteria) this;
        }

        public Criteria andHeaderLogoNotBetween(String value1, String value2) {
            addCriterion("HEADER_LOGO not between", value1, value2, "headerLogo");
            return (Criteria) this;
        }

        public Criteria andHeaderMiddleBackgroundIsNull() {
            addCriterion("HEADER_MIDDLE_BACKGROUND is null");
            return (Criteria) this;
        }

        public Criteria andHeaderMiddleBackgroundIsNotNull() {
            addCriterion("HEADER_MIDDLE_BACKGROUND is not null");
            return (Criteria) this;
        }

        public Criteria andHeaderMiddleBackgroundEqualTo(String value) {
            addCriterion("HEADER_MIDDLE_BACKGROUND =", value, "headerMiddleBackground");
            return (Criteria) this;
        }

        public Criteria andHeaderMiddleBackgroundNotEqualTo(String value) {
            addCriterion("HEADER_MIDDLE_BACKGROUND <>", value, "headerMiddleBackground");
            return (Criteria) this;
        }

        public Criteria andHeaderMiddleBackgroundGreaterThan(String value) {
            addCriterion("HEADER_MIDDLE_BACKGROUND >", value, "headerMiddleBackground");
            return (Criteria) this;
        }

        public Criteria andHeaderMiddleBackgroundGreaterThanOrEqualTo(String value) {
            addCriterion("HEADER_MIDDLE_BACKGROUND >=", value, "headerMiddleBackground");
            return (Criteria) this;
        }

        public Criteria andHeaderMiddleBackgroundLessThan(String value) {
            addCriterion("HEADER_MIDDLE_BACKGROUND <", value, "headerMiddleBackground");
            return (Criteria) this;
        }

        public Criteria andHeaderMiddleBackgroundLessThanOrEqualTo(String value) {
            addCriterion("HEADER_MIDDLE_BACKGROUND <=", value, "headerMiddleBackground");
            return (Criteria) this;
        }

        public Criteria andHeaderMiddleBackgroundLike(String value) {
            addCriterion("HEADER_MIDDLE_BACKGROUND like", value, "headerMiddleBackground");
            return (Criteria) this;
        }

        public Criteria andHeaderMiddleBackgroundNotLike(String value) {
            addCriterion("HEADER_MIDDLE_BACKGROUND not like", value, "headerMiddleBackground");
            return (Criteria) this;
        }

        public Criteria andHeaderMiddleBackgroundIn(List<String> values) {
            addCriterion("HEADER_MIDDLE_BACKGROUND in", values, "headerMiddleBackground");
            return (Criteria) this;
        }

        public Criteria andHeaderMiddleBackgroundNotIn(List<String> values) {
            addCriterion("HEADER_MIDDLE_BACKGROUND not in", values, "headerMiddleBackground");
            return (Criteria) this;
        }

        public Criteria andHeaderMiddleBackgroundBetween(String value1, String value2) {
            addCriterion("HEADER_MIDDLE_BACKGROUND between", value1, value2, "headerMiddleBackground");
            return (Criteria) this;
        }

        public Criteria andHeaderMiddleBackgroundNotBetween(String value1, String value2) {
            addCriterion("HEADER_MIDDLE_BACKGROUND not between", value1, value2, "headerMiddleBackground");
            return (Criteria) this;
        }

        public Criteria andHeaderRightBackgroundIsNull() {
            addCriterion("HEADER_RIGHT_BACKGROUND is null");
            return (Criteria) this;
        }

        public Criteria andHeaderRightBackgroundIsNotNull() {
            addCriterion("HEADER_RIGHT_BACKGROUND is not null");
            return (Criteria) this;
        }

        public Criteria andHeaderRightBackgroundEqualTo(String value) {
            addCriterion("HEADER_RIGHT_BACKGROUND =", value, "headerRightBackground");
            return (Criteria) this;
        }

        public Criteria andHeaderRightBackgroundNotEqualTo(String value) {
            addCriterion("HEADER_RIGHT_BACKGROUND <>", value, "headerRightBackground");
            return (Criteria) this;
        }

        public Criteria andHeaderRightBackgroundGreaterThan(String value) {
            addCriterion("HEADER_RIGHT_BACKGROUND >", value, "headerRightBackground");
            return (Criteria) this;
        }

        public Criteria andHeaderRightBackgroundGreaterThanOrEqualTo(String value) {
            addCriterion("HEADER_RIGHT_BACKGROUND >=", value, "headerRightBackground");
            return (Criteria) this;
        }

        public Criteria andHeaderRightBackgroundLessThan(String value) {
            addCriterion("HEADER_RIGHT_BACKGROUND <", value, "headerRightBackground");
            return (Criteria) this;
        }

        public Criteria andHeaderRightBackgroundLessThanOrEqualTo(String value) {
            addCriterion("HEADER_RIGHT_BACKGROUND <=", value, "headerRightBackground");
            return (Criteria) this;
        }

        public Criteria andHeaderRightBackgroundLike(String value) {
            addCriterion("HEADER_RIGHT_BACKGROUND like", value, "headerRightBackground");
            return (Criteria) this;
        }

        public Criteria andHeaderRightBackgroundNotLike(String value) {
            addCriterion("HEADER_RIGHT_BACKGROUND not like", value, "headerRightBackground");
            return (Criteria) this;
        }

        public Criteria andHeaderRightBackgroundIn(List<String> values) {
            addCriterion("HEADER_RIGHT_BACKGROUND in", values, "headerRightBackground");
            return (Criteria) this;
        }

        public Criteria andHeaderRightBackgroundNotIn(List<String> values) {
            addCriterion("HEADER_RIGHT_BACKGROUND not in", values, "headerRightBackground");
            return (Criteria) this;
        }

        public Criteria andHeaderRightBackgroundBetween(String value1, String value2) {
            addCriterion("HEADER_RIGHT_BACKGROUND between", value1, value2, "headerRightBackground");
            return (Criteria) this;
        }

        public Criteria andHeaderRightBackgroundNotBetween(String value1, String value2) {
            addCriterion("HEADER_RIGHT_BACKGROUND not between", value1, value2, "headerRightBackground");
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