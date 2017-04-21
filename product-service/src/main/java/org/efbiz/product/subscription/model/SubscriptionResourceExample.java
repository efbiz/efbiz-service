package org.efbiz.product.subscription.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SubscriptionResourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public SubscriptionResourceExample() {
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

        public Criteria andParentResourceIdIsNull() {
            addCriterion("PARENT_RESOURCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentResourceIdIsNotNull() {
            addCriterion("PARENT_RESOURCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentResourceIdEqualTo(String value) {
            addCriterion("PARENT_RESOURCE_ID =", value, "parentResourceId");
            return (Criteria) this;
        }

        public Criteria andParentResourceIdNotEqualTo(String value) {
            addCriterion("PARENT_RESOURCE_ID <>", value, "parentResourceId");
            return (Criteria) this;
        }

        public Criteria andParentResourceIdGreaterThan(String value) {
            addCriterion("PARENT_RESOURCE_ID >", value, "parentResourceId");
            return (Criteria) this;
        }

        public Criteria andParentResourceIdGreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_RESOURCE_ID >=", value, "parentResourceId");
            return (Criteria) this;
        }

        public Criteria andParentResourceIdLessThan(String value) {
            addCriterion("PARENT_RESOURCE_ID <", value, "parentResourceId");
            return (Criteria) this;
        }

        public Criteria andParentResourceIdLessThanOrEqualTo(String value) {
            addCriterion("PARENT_RESOURCE_ID <=", value, "parentResourceId");
            return (Criteria) this;
        }

        public Criteria andParentResourceIdLike(String value) {
            addCriterion("PARENT_RESOURCE_ID like", value, "parentResourceId");
            return (Criteria) this;
        }

        public Criteria andParentResourceIdNotLike(String value) {
            addCriterion("PARENT_RESOURCE_ID not like", value, "parentResourceId");
            return (Criteria) this;
        }

        public Criteria andParentResourceIdIn(List<String> values) {
            addCriterion("PARENT_RESOURCE_ID in", values, "parentResourceId");
            return (Criteria) this;
        }

        public Criteria andParentResourceIdNotIn(List<String> values) {
            addCriterion("PARENT_RESOURCE_ID not in", values, "parentResourceId");
            return (Criteria) this;
        }

        public Criteria andParentResourceIdBetween(String value1, String value2) {
            addCriterion("PARENT_RESOURCE_ID between", value1, value2, "parentResourceId");
            return (Criteria) this;
        }

        public Criteria andParentResourceIdNotBetween(String value1, String value2) {
            addCriterion("PARENT_RESOURCE_ID not between", value1, value2, "parentResourceId");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("DESCRIPTION like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "description");
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

        public Criteria andWebSiteIdIsNull() {
            addCriterion("WEB_SITE_ID is null");
            return (Criteria) this;
        }

        public Criteria andWebSiteIdIsNotNull() {
            addCriterion("WEB_SITE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWebSiteIdEqualTo(String value) {
            addCriterion("WEB_SITE_ID =", value, "webSiteId");
            return (Criteria) this;
        }

        public Criteria andWebSiteIdNotEqualTo(String value) {
            addCriterion("WEB_SITE_ID <>", value, "webSiteId");
            return (Criteria) this;
        }

        public Criteria andWebSiteIdGreaterThan(String value) {
            addCriterion("WEB_SITE_ID >", value, "webSiteId");
            return (Criteria) this;
        }

        public Criteria andWebSiteIdGreaterThanOrEqualTo(String value) {
            addCriterion("WEB_SITE_ID >=", value, "webSiteId");
            return (Criteria) this;
        }

        public Criteria andWebSiteIdLessThan(String value) {
            addCriterion("WEB_SITE_ID <", value, "webSiteId");
            return (Criteria) this;
        }

        public Criteria andWebSiteIdLessThanOrEqualTo(String value) {
            addCriterion("WEB_SITE_ID <=", value, "webSiteId");
            return (Criteria) this;
        }

        public Criteria andWebSiteIdLike(String value) {
            addCriterion("WEB_SITE_ID like", value, "webSiteId");
            return (Criteria) this;
        }

        public Criteria andWebSiteIdNotLike(String value) {
            addCriterion("WEB_SITE_ID not like", value, "webSiteId");
            return (Criteria) this;
        }

        public Criteria andWebSiteIdIn(List<String> values) {
            addCriterion("WEB_SITE_ID in", values, "webSiteId");
            return (Criteria) this;
        }

        public Criteria andWebSiteIdNotIn(List<String> values) {
            addCriterion("WEB_SITE_ID not in", values, "webSiteId");
            return (Criteria) this;
        }

        public Criteria andWebSiteIdBetween(String value1, String value2) {
            addCriterion("WEB_SITE_ID between", value1, value2, "webSiteId");
            return (Criteria) this;
        }

        public Criteria andWebSiteIdNotBetween(String value1, String value2) {
            addCriterion("WEB_SITE_ID not between", value1, value2, "webSiteId");
            return (Criteria) this;
        }

        public Criteria andServiceNameOnExpiryIsNull() {
            addCriterion("SERVICE_NAME_ON_EXPIRY is null");
            return (Criteria) this;
        }

        public Criteria andServiceNameOnExpiryIsNotNull() {
            addCriterion("SERVICE_NAME_ON_EXPIRY is not null");
            return (Criteria) this;
        }

        public Criteria andServiceNameOnExpiryEqualTo(String value) {
            addCriterion("SERVICE_NAME_ON_EXPIRY =", value, "serviceNameOnExpiry");
            return (Criteria) this;
        }

        public Criteria andServiceNameOnExpiryNotEqualTo(String value) {
            addCriterion("SERVICE_NAME_ON_EXPIRY <>", value, "serviceNameOnExpiry");
            return (Criteria) this;
        }

        public Criteria andServiceNameOnExpiryGreaterThan(String value) {
            addCriterion("SERVICE_NAME_ON_EXPIRY >", value, "serviceNameOnExpiry");
            return (Criteria) this;
        }

        public Criteria andServiceNameOnExpiryGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_NAME_ON_EXPIRY >=", value, "serviceNameOnExpiry");
            return (Criteria) this;
        }

        public Criteria andServiceNameOnExpiryLessThan(String value) {
            addCriterion("SERVICE_NAME_ON_EXPIRY <", value, "serviceNameOnExpiry");
            return (Criteria) this;
        }

        public Criteria andServiceNameOnExpiryLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_NAME_ON_EXPIRY <=", value, "serviceNameOnExpiry");
            return (Criteria) this;
        }

        public Criteria andServiceNameOnExpiryLike(String value) {
            addCriterion("SERVICE_NAME_ON_EXPIRY like", value, "serviceNameOnExpiry");
            return (Criteria) this;
        }

        public Criteria andServiceNameOnExpiryNotLike(String value) {
            addCriterion("SERVICE_NAME_ON_EXPIRY not like", value, "serviceNameOnExpiry");
            return (Criteria) this;
        }

        public Criteria andServiceNameOnExpiryIn(List<String> values) {
            addCriterion("SERVICE_NAME_ON_EXPIRY in", values, "serviceNameOnExpiry");
            return (Criteria) this;
        }

        public Criteria andServiceNameOnExpiryNotIn(List<String> values) {
            addCriterion("SERVICE_NAME_ON_EXPIRY not in", values, "serviceNameOnExpiry");
            return (Criteria) this;
        }

        public Criteria andServiceNameOnExpiryBetween(String value1, String value2) {
            addCriterion("SERVICE_NAME_ON_EXPIRY between", value1, value2, "serviceNameOnExpiry");
            return (Criteria) this;
        }

        public Criteria andServiceNameOnExpiryNotBetween(String value1, String value2) {
            addCriterion("SERVICE_NAME_ON_EXPIRY not between", value1, value2, "serviceNameOnExpiry");
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