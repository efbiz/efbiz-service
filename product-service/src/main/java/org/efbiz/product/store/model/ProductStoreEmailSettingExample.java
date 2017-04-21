package org.efbiz.product.store.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductStoreEmailSettingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public ProductStoreEmailSettingExample() {
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

        public Criteria andEmailTypeIsNull() {
            addCriterion("EMAIL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andEmailTypeIsNotNull() {
            addCriterion("EMAIL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andEmailTypeEqualTo(String value) {
            addCriterion("EMAIL_TYPE =", value, "emailType");
            return (Criteria) this;
        }

        public Criteria andEmailTypeNotEqualTo(String value) {
            addCriterion("EMAIL_TYPE <>", value, "emailType");
            return (Criteria) this;
        }

        public Criteria andEmailTypeGreaterThan(String value) {
            addCriterion("EMAIL_TYPE >", value, "emailType");
            return (Criteria) this;
        }

        public Criteria andEmailTypeGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL_TYPE >=", value, "emailType");
            return (Criteria) this;
        }

        public Criteria andEmailTypeLessThan(String value) {
            addCriterion("EMAIL_TYPE <", value, "emailType");
            return (Criteria) this;
        }

        public Criteria andEmailTypeLessThanOrEqualTo(String value) {
            addCriterion("EMAIL_TYPE <=", value, "emailType");
            return (Criteria) this;
        }

        public Criteria andEmailTypeLike(String value) {
            addCriterion("EMAIL_TYPE like", value, "emailType");
            return (Criteria) this;
        }

        public Criteria andEmailTypeNotLike(String value) {
            addCriterion("EMAIL_TYPE not like", value, "emailType");
            return (Criteria) this;
        }

        public Criteria andEmailTypeIn(List<String> values) {
            addCriterion("EMAIL_TYPE in", values, "emailType");
            return (Criteria) this;
        }

        public Criteria andEmailTypeNotIn(List<String> values) {
            addCriterion("EMAIL_TYPE not in", values, "emailType");
            return (Criteria) this;
        }

        public Criteria andEmailTypeBetween(String value1, String value2) {
            addCriterion("EMAIL_TYPE between", value1, value2, "emailType");
            return (Criteria) this;
        }

        public Criteria andEmailTypeNotBetween(String value1, String value2) {
            addCriterion("EMAIL_TYPE not between", value1, value2, "emailType");
            return (Criteria) this;
        }

        public Criteria andBodyScreenLocationIsNull() {
            addCriterion("BODY_SCREEN_LOCATION is null");
            return (Criteria) this;
        }

        public Criteria andBodyScreenLocationIsNotNull() {
            addCriterion("BODY_SCREEN_LOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andBodyScreenLocationEqualTo(String value) {
            addCriterion("BODY_SCREEN_LOCATION =", value, "bodyScreenLocation");
            return (Criteria) this;
        }

        public Criteria andBodyScreenLocationNotEqualTo(String value) {
            addCriterion("BODY_SCREEN_LOCATION <>", value, "bodyScreenLocation");
            return (Criteria) this;
        }

        public Criteria andBodyScreenLocationGreaterThan(String value) {
            addCriterion("BODY_SCREEN_LOCATION >", value, "bodyScreenLocation");
            return (Criteria) this;
        }

        public Criteria andBodyScreenLocationGreaterThanOrEqualTo(String value) {
            addCriterion("BODY_SCREEN_LOCATION >=", value, "bodyScreenLocation");
            return (Criteria) this;
        }

        public Criteria andBodyScreenLocationLessThan(String value) {
            addCriterion("BODY_SCREEN_LOCATION <", value, "bodyScreenLocation");
            return (Criteria) this;
        }

        public Criteria andBodyScreenLocationLessThanOrEqualTo(String value) {
            addCriterion("BODY_SCREEN_LOCATION <=", value, "bodyScreenLocation");
            return (Criteria) this;
        }

        public Criteria andBodyScreenLocationLike(String value) {
            addCriterion("BODY_SCREEN_LOCATION like", value, "bodyScreenLocation");
            return (Criteria) this;
        }

        public Criteria andBodyScreenLocationNotLike(String value) {
            addCriterion("BODY_SCREEN_LOCATION not like", value, "bodyScreenLocation");
            return (Criteria) this;
        }

        public Criteria andBodyScreenLocationIn(List<String> values) {
            addCriterion("BODY_SCREEN_LOCATION in", values, "bodyScreenLocation");
            return (Criteria) this;
        }

        public Criteria andBodyScreenLocationNotIn(List<String> values) {
            addCriterion("BODY_SCREEN_LOCATION not in", values, "bodyScreenLocation");
            return (Criteria) this;
        }

        public Criteria andBodyScreenLocationBetween(String value1, String value2) {
            addCriterion("BODY_SCREEN_LOCATION between", value1, value2, "bodyScreenLocation");
            return (Criteria) this;
        }

        public Criteria andBodyScreenLocationNotBetween(String value1, String value2) {
            addCriterion("BODY_SCREEN_LOCATION not between", value1, value2, "bodyScreenLocation");
            return (Criteria) this;
        }

        public Criteria andXslfoAttachScreenLocationIsNull() {
            addCriterion("XSLFO_ATTACH_SCREEN_LOCATION is null");
            return (Criteria) this;
        }

        public Criteria andXslfoAttachScreenLocationIsNotNull() {
            addCriterion("XSLFO_ATTACH_SCREEN_LOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andXslfoAttachScreenLocationEqualTo(String value) {
            addCriterion("XSLFO_ATTACH_SCREEN_LOCATION =", value, "xslfoAttachScreenLocation");
            return (Criteria) this;
        }

        public Criteria andXslfoAttachScreenLocationNotEqualTo(String value) {
            addCriterion("XSLFO_ATTACH_SCREEN_LOCATION <>", value, "xslfoAttachScreenLocation");
            return (Criteria) this;
        }

        public Criteria andXslfoAttachScreenLocationGreaterThan(String value) {
            addCriterion("XSLFO_ATTACH_SCREEN_LOCATION >", value, "xslfoAttachScreenLocation");
            return (Criteria) this;
        }

        public Criteria andXslfoAttachScreenLocationGreaterThanOrEqualTo(String value) {
            addCriterion("XSLFO_ATTACH_SCREEN_LOCATION >=", value, "xslfoAttachScreenLocation");
            return (Criteria) this;
        }

        public Criteria andXslfoAttachScreenLocationLessThan(String value) {
            addCriterion("XSLFO_ATTACH_SCREEN_LOCATION <", value, "xslfoAttachScreenLocation");
            return (Criteria) this;
        }

        public Criteria andXslfoAttachScreenLocationLessThanOrEqualTo(String value) {
            addCriterion("XSLFO_ATTACH_SCREEN_LOCATION <=", value, "xslfoAttachScreenLocation");
            return (Criteria) this;
        }

        public Criteria andXslfoAttachScreenLocationLike(String value) {
            addCriterion("XSLFO_ATTACH_SCREEN_LOCATION like", value, "xslfoAttachScreenLocation");
            return (Criteria) this;
        }

        public Criteria andXslfoAttachScreenLocationNotLike(String value) {
            addCriterion("XSLFO_ATTACH_SCREEN_LOCATION not like", value, "xslfoAttachScreenLocation");
            return (Criteria) this;
        }

        public Criteria andXslfoAttachScreenLocationIn(List<String> values) {
            addCriterion("XSLFO_ATTACH_SCREEN_LOCATION in", values, "xslfoAttachScreenLocation");
            return (Criteria) this;
        }

        public Criteria andXslfoAttachScreenLocationNotIn(List<String> values) {
            addCriterion("XSLFO_ATTACH_SCREEN_LOCATION not in", values, "xslfoAttachScreenLocation");
            return (Criteria) this;
        }

        public Criteria andXslfoAttachScreenLocationBetween(String value1, String value2) {
            addCriterion("XSLFO_ATTACH_SCREEN_LOCATION between", value1, value2, "xslfoAttachScreenLocation");
            return (Criteria) this;
        }

        public Criteria andXslfoAttachScreenLocationNotBetween(String value1, String value2) {
            addCriterion("XSLFO_ATTACH_SCREEN_LOCATION not between", value1, value2, "xslfoAttachScreenLocation");
            return (Criteria) this;
        }

        public Criteria andFromAddressIsNull() {
            addCriterion("FROM_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andFromAddressIsNotNull() {
            addCriterion("FROM_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andFromAddressEqualTo(String value) {
            addCriterion("FROM_ADDRESS =", value, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressNotEqualTo(String value) {
            addCriterion("FROM_ADDRESS <>", value, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressGreaterThan(String value) {
            addCriterion("FROM_ADDRESS >", value, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressGreaterThanOrEqualTo(String value) {
            addCriterion("FROM_ADDRESS >=", value, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressLessThan(String value) {
            addCriterion("FROM_ADDRESS <", value, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressLessThanOrEqualTo(String value) {
            addCriterion("FROM_ADDRESS <=", value, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressLike(String value) {
            addCriterion("FROM_ADDRESS like", value, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressNotLike(String value) {
            addCriterion("FROM_ADDRESS not like", value, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressIn(List<String> values) {
            addCriterion("FROM_ADDRESS in", values, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressNotIn(List<String> values) {
            addCriterion("FROM_ADDRESS not in", values, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressBetween(String value1, String value2) {
            addCriterion("FROM_ADDRESS between", value1, value2, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressNotBetween(String value1, String value2) {
            addCriterion("FROM_ADDRESS not between", value1, value2, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andCcAddressIsNull() {
            addCriterion("CC_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andCcAddressIsNotNull() {
            addCriterion("CC_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andCcAddressEqualTo(String value) {
            addCriterion("CC_ADDRESS =", value, "ccAddress");
            return (Criteria) this;
        }

        public Criteria andCcAddressNotEqualTo(String value) {
            addCriterion("CC_ADDRESS <>", value, "ccAddress");
            return (Criteria) this;
        }

        public Criteria andCcAddressGreaterThan(String value) {
            addCriterion("CC_ADDRESS >", value, "ccAddress");
            return (Criteria) this;
        }

        public Criteria andCcAddressGreaterThanOrEqualTo(String value) {
            addCriterion("CC_ADDRESS >=", value, "ccAddress");
            return (Criteria) this;
        }

        public Criteria andCcAddressLessThan(String value) {
            addCriterion("CC_ADDRESS <", value, "ccAddress");
            return (Criteria) this;
        }

        public Criteria andCcAddressLessThanOrEqualTo(String value) {
            addCriterion("CC_ADDRESS <=", value, "ccAddress");
            return (Criteria) this;
        }

        public Criteria andCcAddressLike(String value) {
            addCriterion("CC_ADDRESS like", value, "ccAddress");
            return (Criteria) this;
        }

        public Criteria andCcAddressNotLike(String value) {
            addCriterion("CC_ADDRESS not like", value, "ccAddress");
            return (Criteria) this;
        }

        public Criteria andCcAddressIn(List<String> values) {
            addCriterion("CC_ADDRESS in", values, "ccAddress");
            return (Criteria) this;
        }

        public Criteria andCcAddressNotIn(List<String> values) {
            addCriterion("CC_ADDRESS not in", values, "ccAddress");
            return (Criteria) this;
        }

        public Criteria andCcAddressBetween(String value1, String value2) {
            addCriterion("CC_ADDRESS between", value1, value2, "ccAddress");
            return (Criteria) this;
        }

        public Criteria andCcAddressNotBetween(String value1, String value2) {
            addCriterion("CC_ADDRESS not between", value1, value2, "ccAddress");
            return (Criteria) this;
        }

        public Criteria andBccAddressIsNull() {
            addCriterion("BCC_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andBccAddressIsNotNull() {
            addCriterion("BCC_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andBccAddressEqualTo(String value) {
            addCriterion("BCC_ADDRESS =", value, "bccAddress");
            return (Criteria) this;
        }

        public Criteria andBccAddressNotEqualTo(String value) {
            addCriterion("BCC_ADDRESS <>", value, "bccAddress");
            return (Criteria) this;
        }

        public Criteria andBccAddressGreaterThan(String value) {
            addCriterion("BCC_ADDRESS >", value, "bccAddress");
            return (Criteria) this;
        }

        public Criteria andBccAddressGreaterThanOrEqualTo(String value) {
            addCriterion("BCC_ADDRESS >=", value, "bccAddress");
            return (Criteria) this;
        }

        public Criteria andBccAddressLessThan(String value) {
            addCriterion("BCC_ADDRESS <", value, "bccAddress");
            return (Criteria) this;
        }

        public Criteria andBccAddressLessThanOrEqualTo(String value) {
            addCriterion("BCC_ADDRESS <=", value, "bccAddress");
            return (Criteria) this;
        }

        public Criteria andBccAddressLike(String value) {
            addCriterion("BCC_ADDRESS like", value, "bccAddress");
            return (Criteria) this;
        }

        public Criteria andBccAddressNotLike(String value) {
            addCriterion("BCC_ADDRESS not like", value, "bccAddress");
            return (Criteria) this;
        }

        public Criteria andBccAddressIn(List<String> values) {
            addCriterion("BCC_ADDRESS in", values, "bccAddress");
            return (Criteria) this;
        }

        public Criteria andBccAddressNotIn(List<String> values) {
            addCriterion("BCC_ADDRESS not in", values, "bccAddress");
            return (Criteria) this;
        }

        public Criteria andBccAddressBetween(String value1, String value2) {
            addCriterion("BCC_ADDRESS between", value1, value2, "bccAddress");
            return (Criteria) this;
        }

        public Criteria andBccAddressNotBetween(String value1, String value2) {
            addCriterion("BCC_ADDRESS not between", value1, value2, "bccAddress");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNull() {
            addCriterion("SUBJECT is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNotNull() {
            addCriterion("SUBJECT is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectEqualTo(String value) {
            addCriterion("SUBJECT =", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotEqualTo(String value) {
            addCriterion("SUBJECT <>", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThan(String value) {
            addCriterion("SUBJECT >", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("SUBJECT >=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThan(String value) {
            addCriterion("SUBJECT <", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThanOrEqualTo(String value) {
            addCriterion("SUBJECT <=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLike(String value) {
            addCriterion("SUBJECT like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotLike(String value) {
            addCriterion("SUBJECT not like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectIn(List<String> values) {
            addCriterion("SUBJECT in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotIn(List<String> values) {
            addCriterion("SUBJECT not in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectBetween(String value1, String value2) {
            addCriterion("SUBJECT between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotBetween(String value1, String value2) {
            addCriterion("SUBJECT not between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andContentTypeIsNull() {
            addCriterion("CONTENT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andContentTypeIsNotNull() {
            addCriterion("CONTENT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andContentTypeEqualTo(String value) {
            addCriterion("CONTENT_TYPE =", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeNotEqualTo(String value) {
            addCriterion("CONTENT_TYPE <>", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeGreaterThan(String value) {
            addCriterion("CONTENT_TYPE >", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENT_TYPE >=", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeLessThan(String value) {
            addCriterion("CONTENT_TYPE <", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeLessThanOrEqualTo(String value) {
            addCriterion("CONTENT_TYPE <=", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeLike(String value) {
            addCriterion("CONTENT_TYPE like", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeNotLike(String value) {
            addCriterion("CONTENT_TYPE not like", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeIn(List<String> values) {
            addCriterion("CONTENT_TYPE in", values, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeNotIn(List<String> values) {
            addCriterion("CONTENT_TYPE not in", values, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeBetween(String value1, String value2) {
            addCriterion("CONTENT_TYPE between", value1, value2, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeNotBetween(String value1, String value2) {
            addCriterion("CONTENT_TYPE not between", value1, value2, "contentType");
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