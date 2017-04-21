package org.efbiz.product.subscription.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SubscriptionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public SubscriptionExample() {
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

        public Criteria andSubscriptionIdIsNull() {
            addCriterion("SUBSCRIPTION_ID is null");
            return (Criteria) this;
        }

        public Criteria andSubscriptionIdIsNotNull() {
            addCriterion("SUBSCRIPTION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSubscriptionIdEqualTo(String value) {
            addCriterion("SUBSCRIPTION_ID =", value, "subscriptionId");
            return (Criteria) this;
        }

        public Criteria andSubscriptionIdNotEqualTo(String value) {
            addCriterion("SUBSCRIPTION_ID <>", value, "subscriptionId");
            return (Criteria) this;
        }

        public Criteria andSubscriptionIdGreaterThan(String value) {
            addCriterion("SUBSCRIPTION_ID >", value, "subscriptionId");
            return (Criteria) this;
        }

        public Criteria andSubscriptionIdGreaterThanOrEqualTo(String value) {
            addCriterion("SUBSCRIPTION_ID >=", value, "subscriptionId");
            return (Criteria) this;
        }

        public Criteria andSubscriptionIdLessThan(String value) {
            addCriterion("SUBSCRIPTION_ID <", value, "subscriptionId");
            return (Criteria) this;
        }

        public Criteria andSubscriptionIdLessThanOrEqualTo(String value) {
            addCriterion("SUBSCRIPTION_ID <=", value, "subscriptionId");
            return (Criteria) this;
        }

        public Criteria andSubscriptionIdLike(String value) {
            addCriterion("SUBSCRIPTION_ID like", value, "subscriptionId");
            return (Criteria) this;
        }

        public Criteria andSubscriptionIdNotLike(String value) {
            addCriterion("SUBSCRIPTION_ID not like", value, "subscriptionId");
            return (Criteria) this;
        }

        public Criteria andSubscriptionIdIn(List<String> values) {
            addCriterion("SUBSCRIPTION_ID in", values, "subscriptionId");
            return (Criteria) this;
        }

        public Criteria andSubscriptionIdNotIn(List<String> values) {
            addCriterion("SUBSCRIPTION_ID not in", values, "subscriptionId");
            return (Criteria) this;
        }

        public Criteria andSubscriptionIdBetween(String value1, String value2) {
            addCriterion("SUBSCRIPTION_ID between", value1, value2, "subscriptionId");
            return (Criteria) this;
        }

        public Criteria andSubscriptionIdNotBetween(String value1, String value2) {
            addCriterion("SUBSCRIPTION_ID not between", value1, value2, "subscriptionId");
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

        public Criteria andCommunicationEventIdIsNull() {
            addCriterion("COMMUNICATION_EVENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andCommunicationEventIdIsNotNull() {
            addCriterion("COMMUNICATION_EVENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCommunicationEventIdEqualTo(String value) {
            addCriterion("COMMUNICATION_EVENT_ID =", value, "communicationEventId");
            return (Criteria) this;
        }

        public Criteria andCommunicationEventIdNotEqualTo(String value) {
            addCriterion("COMMUNICATION_EVENT_ID <>", value, "communicationEventId");
            return (Criteria) this;
        }

        public Criteria andCommunicationEventIdGreaterThan(String value) {
            addCriterion("COMMUNICATION_EVENT_ID >", value, "communicationEventId");
            return (Criteria) this;
        }

        public Criteria andCommunicationEventIdGreaterThanOrEqualTo(String value) {
            addCriterion("COMMUNICATION_EVENT_ID >=", value, "communicationEventId");
            return (Criteria) this;
        }

        public Criteria andCommunicationEventIdLessThan(String value) {
            addCriterion("COMMUNICATION_EVENT_ID <", value, "communicationEventId");
            return (Criteria) this;
        }

        public Criteria andCommunicationEventIdLessThanOrEqualTo(String value) {
            addCriterion("COMMUNICATION_EVENT_ID <=", value, "communicationEventId");
            return (Criteria) this;
        }

        public Criteria andCommunicationEventIdLike(String value) {
            addCriterion("COMMUNICATION_EVENT_ID like", value, "communicationEventId");
            return (Criteria) this;
        }

        public Criteria andCommunicationEventIdNotLike(String value) {
            addCriterion("COMMUNICATION_EVENT_ID not like", value, "communicationEventId");
            return (Criteria) this;
        }

        public Criteria andCommunicationEventIdIn(List<String> values) {
            addCriterion("COMMUNICATION_EVENT_ID in", values, "communicationEventId");
            return (Criteria) this;
        }

        public Criteria andCommunicationEventIdNotIn(List<String> values) {
            addCriterion("COMMUNICATION_EVENT_ID not in", values, "communicationEventId");
            return (Criteria) this;
        }

        public Criteria andCommunicationEventIdBetween(String value1, String value2) {
            addCriterion("COMMUNICATION_EVENT_ID between", value1, value2, "communicationEventId");
            return (Criteria) this;
        }

        public Criteria andCommunicationEventIdNotBetween(String value1, String value2) {
            addCriterion("COMMUNICATION_EVENT_ID not between", value1, value2, "communicationEventId");
            return (Criteria) this;
        }

        public Criteria andContactMechIdIsNull() {
            addCriterion("CONTACT_MECH_ID is null");
            return (Criteria) this;
        }

        public Criteria andContactMechIdIsNotNull() {
            addCriterion("CONTACT_MECH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andContactMechIdEqualTo(String value) {
            addCriterion("CONTACT_MECH_ID =", value, "contactMechId");
            return (Criteria) this;
        }

        public Criteria andContactMechIdNotEqualTo(String value) {
            addCriterion("CONTACT_MECH_ID <>", value, "contactMechId");
            return (Criteria) this;
        }

        public Criteria andContactMechIdGreaterThan(String value) {
            addCriterion("CONTACT_MECH_ID >", value, "contactMechId");
            return (Criteria) this;
        }

        public Criteria andContactMechIdGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_MECH_ID >=", value, "contactMechId");
            return (Criteria) this;
        }

        public Criteria andContactMechIdLessThan(String value) {
            addCriterion("CONTACT_MECH_ID <", value, "contactMechId");
            return (Criteria) this;
        }

        public Criteria andContactMechIdLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_MECH_ID <=", value, "contactMechId");
            return (Criteria) this;
        }

        public Criteria andContactMechIdLike(String value) {
            addCriterion("CONTACT_MECH_ID like", value, "contactMechId");
            return (Criteria) this;
        }

        public Criteria andContactMechIdNotLike(String value) {
            addCriterion("CONTACT_MECH_ID not like", value, "contactMechId");
            return (Criteria) this;
        }

        public Criteria andContactMechIdIn(List<String> values) {
            addCriterion("CONTACT_MECH_ID in", values, "contactMechId");
            return (Criteria) this;
        }

        public Criteria andContactMechIdNotIn(List<String> values) {
            addCriterion("CONTACT_MECH_ID not in", values, "contactMechId");
            return (Criteria) this;
        }

        public Criteria andContactMechIdBetween(String value1, String value2) {
            addCriterion("CONTACT_MECH_ID between", value1, value2, "contactMechId");
            return (Criteria) this;
        }

        public Criteria andContactMechIdNotBetween(String value1, String value2) {
            addCriterion("CONTACT_MECH_ID not between", value1, value2, "contactMechId");
            return (Criteria) this;
        }

        public Criteria andOriginatedFromPartyIdIsNull() {
            addCriterion("ORIGINATED_FROM_PARTY_ID is null");
            return (Criteria) this;
        }

        public Criteria andOriginatedFromPartyIdIsNotNull() {
            addCriterion("ORIGINATED_FROM_PARTY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOriginatedFromPartyIdEqualTo(String value) {
            addCriterion("ORIGINATED_FROM_PARTY_ID =", value, "originatedFromPartyId");
            return (Criteria) this;
        }

        public Criteria andOriginatedFromPartyIdNotEqualTo(String value) {
            addCriterion("ORIGINATED_FROM_PARTY_ID <>", value, "originatedFromPartyId");
            return (Criteria) this;
        }

        public Criteria andOriginatedFromPartyIdGreaterThan(String value) {
            addCriterion("ORIGINATED_FROM_PARTY_ID >", value, "originatedFromPartyId");
            return (Criteria) this;
        }

        public Criteria andOriginatedFromPartyIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORIGINATED_FROM_PARTY_ID >=", value, "originatedFromPartyId");
            return (Criteria) this;
        }

        public Criteria andOriginatedFromPartyIdLessThan(String value) {
            addCriterion("ORIGINATED_FROM_PARTY_ID <", value, "originatedFromPartyId");
            return (Criteria) this;
        }

        public Criteria andOriginatedFromPartyIdLessThanOrEqualTo(String value) {
            addCriterion("ORIGINATED_FROM_PARTY_ID <=", value, "originatedFromPartyId");
            return (Criteria) this;
        }

        public Criteria andOriginatedFromPartyIdLike(String value) {
            addCriterion("ORIGINATED_FROM_PARTY_ID like", value, "originatedFromPartyId");
            return (Criteria) this;
        }

        public Criteria andOriginatedFromPartyIdNotLike(String value) {
            addCriterion("ORIGINATED_FROM_PARTY_ID not like", value, "originatedFromPartyId");
            return (Criteria) this;
        }

        public Criteria andOriginatedFromPartyIdIn(List<String> values) {
            addCriterion("ORIGINATED_FROM_PARTY_ID in", values, "originatedFromPartyId");
            return (Criteria) this;
        }

        public Criteria andOriginatedFromPartyIdNotIn(List<String> values) {
            addCriterion("ORIGINATED_FROM_PARTY_ID not in", values, "originatedFromPartyId");
            return (Criteria) this;
        }

        public Criteria andOriginatedFromPartyIdBetween(String value1, String value2) {
            addCriterion("ORIGINATED_FROM_PARTY_ID between", value1, value2, "originatedFromPartyId");
            return (Criteria) this;
        }

        public Criteria andOriginatedFromPartyIdNotBetween(String value1, String value2) {
            addCriterion("ORIGINATED_FROM_PARTY_ID not between", value1, value2, "originatedFromPartyId");
            return (Criteria) this;
        }

        public Criteria andOriginatedFromRoleTypeIdIsNull() {
            addCriterion("ORIGINATED_FROM_ROLE_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andOriginatedFromRoleTypeIdIsNotNull() {
            addCriterion("ORIGINATED_FROM_ROLE_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOriginatedFromRoleTypeIdEqualTo(String value) {
            addCriterion("ORIGINATED_FROM_ROLE_TYPE_ID =", value, "originatedFromRoleTypeId");
            return (Criteria) this;
        }

        public Criteria andOriginatedFromRoleTypeIdNotEqualTo(String value) {
            addCriterion("ORIGINATED_FROM_ROLE_TYPE_ID <>", value, "originatedFromRoleTypeId");
            return (Criteria) this;
        }

        public Criteria andOriginatedFromRoleTypeIdGreaterThan(String value) {
            addCriterion("ORIGINATED_FROM_ROLE_TYPE_ID >", value, "originatedFromRoleTypeId");
            return (Criteria) this;
        }

        public Criteria andOriginatedFromRoleTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORIGINATED_FROM_ROLE_TYPE_ID >=", value, "originatedFromRoleTypeId");
            return (Criteria) this;
        }

        public Criteria andOriginatedFromRoleTypeIdLessThan(String value) {
            addCriterion("ORIGINATED_FROM_ROLE_TYPE_ID <", value, "originatedFromRoleTypeId");
            return (Criteria) this;
        }

        public Criteria andOriginatedFromRoleTypeIdLessThanOrEqualTo(String value) {
            addCriterion("ORIGINATED_FROM_ROLE_TYPE_ID <=", value, "originatedFromRoleTypeId");
            return (Criteria) this;
        }

        public Criteria andOriginatedFromRoleTypeIdLike(String value) {
            addCriterion("ORIGINATED_FROM_ROLE_TYPE_ID like", value, "originatedFromRoleTypeId");
            return (Criteria) this;
        }

        public Criteria andOriginatedFromRoleTypeIdNotLike(String value) {
            addCriterion("ORIGINATED_FROM_ROLE_TYPE_ID not like", value, "originatedFromRoleTypeId");
            return (Criteria) this;
        }

        public Criteria andOriginatedFromRoleTypeIdIn(List<String> values) {
            addCriterion("ORIGINATED_FROM_ROLE_TYPE_ID in", values, "originatedFromRoleTypeId");
            return (Criteria) this;
        }

        public Criteria andOriginatedFromRoleTypeIdNotIn(List<String> values) {
            addCriterion("ORIGINATED_FROM_ROLE_TYPE_ID not in", values, "originatedFromRoleTypeId");
            return (Criteria) this;
        }

        public Criteria andOriginatedFromRoleTypeIdBetween(String value1, String value2) {
            addCriterion("ORIGINATED_FROM_ROLE_TYPE_ID between", value1, value2, "originatedFromRoleTypeId");
            return (Criteria) this;
        }

        public Criteria andOriginatedFromRoleTypeIdNotBetween(String value1, String value2) {
            addCriterion("ORIGINATED_FROM_ROLE_TYPE_ID not between", value1, value2, "originatedFromRoleTypeId");
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

        public Criteria andRoleTypeIdIsNull() {
            addCriterion("ROLE_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andRoleTypeIdIsNotNull() {
            addCriterion("ROLE_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRoleTypeIdEqualTo(String value) {
            addCriterion("ROLE_TYPE_ID =", value, "roleTypeId");
            return (Criteria) this;
        }

        public Criteria andRoleTypeIdNotEqualTo(String value) {
            addCriterion("ROLE_TYPE_ID <>", value, "roleTypeId");
            return (Criteria) this;
        }

        public Criteria andRoleTypeIdGreaterThan(String value) {
            addCriterion("ROLE_TYPE_ID >", value, "roleTypeId");
            return (Criteria) this;
        }

        public Criteria andRoleTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE_TYPE_ID >=", value, "roleTypeId");
            return (Criteria) this;
        }

        public Criteria andRoleTypeIdLessThan(String value) {
            addCriterion("ROLE_TYPE_ID <", value, "roleTypeId");
            return (Criteria) this;
        }

        public Criteria andRoleTypeIdLessThanOrEqualTo(String value) {
            addCriterion("ROLE_TYPE_ID <=", value, "roleTypeId");
            return (Criteria) this;
        }

        public Criteria andRoleTypeIdLike(String value) {
            addCriterion("ROLE_TYPE_ID like", value, "roleTypeId");
            return (Criteria) this;
        }

        public Criteria andRoleTypeIdNotLike(String value) {
            addCriterion("ROLE_TYPE_ID not like", value, "roleTypeId");
            return (Criteria) this;
        }

        public Criteria andRoleTypeIdIn(List<String> values) {
            addCriterion("ROLE_TYPE_ID in", values, "roleTypeId");
            return (Criteria) this;
        }

        public Criteria andRoleTypeIdNotIn(List<String> values) {
            addCriterion("ROLE_TYPE_ID not in", values, "roleTypeId");
            return (Criteria) this;
        }

        public Criteria andRoleTypeIdBetween(String value1, String value2) {
            addCriterion("ROLE_TYPE_ID between", value1, value2, "roleTypeId");
            return (Criteria) this;
        }

        public Criteria andRoleTypeIdNotBetween(String value1, String value2) {
            addCriterion("ROLE_TYPE_ID not between", value1, value2, "roleTypeId");
            return (Criteria) this;
        }

        public Criteria andPartyNeedIdIsNull() {
            addCriterion("PARTY_NEED_ID is null");
            return (Criteria) this;
        }

        public Criteria andPartyNeedIdIsNotNull() {
            addCriterion("PARTY_NEED_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPartyNeedIdEqualTo(String value) {
            addCriterion("PARTY_NEED_ID =", value, "partyNeedId");
            return (Criteria) this;
        }

        public Criteria andPartyNeedIdNotEqualTo(String value) {
            addCriterion("PARTY_NEED_ID <>", value, "partyNeedId");
            return (Criteria) this;
        }

        public Criteria andPartyNeedIdGreaterThan(String value) {
            addCriterion("PARTY_NEED_ID >", value, "partyNeedId");
            return (Criteria) this;
        }

        public Criteria andPartyNeedIdGreaterThanOrEqualTo(String value) {
            addCriterion("PARTY_NEED_ID >=", value, "partyNeedId");
            return (Criteria) this;
        }

        public Criteria andPartyNeedIdLessThan(String value) {
            addCriterion("PARTY_NEED_ID <", value, "partyNeedId");
            return (Criteria) this;
        }

        public Criteria andPartyNeedIdLessThanOrEqualTo(String value) {
            addCriterion("PARTY_NEED_ID <=", value, "partyNeedId");
            return (Criteria) this;
        }

        public Criteria andPartyNeedIdLike(String value) {
            addCriterion("PARTY_NEED_ID like", value, "partyNeedId");
            return (Criteria) this;
        }

        public Criteria andPartyNeedIdNotLike(String value) {
            addCriterion("PARTY_NEED_ID not like", value, "partyNeedId");
            return (Criteria) this;
        }

        public Criteria andPartyNeedIdIn(List<String> values) {
            addCriterion("PARTY_NEED_ID in", values, "partyNeedId");
            return (Criteria) this;
        }

        public Criteria andPartyNeedIdNotIn(List<String> values) {
            addCriterion("PARTY_NEED_ID not in", values, "partyNeedId");
            return (Criteria) this;
        }

        public Criteria andPartyNeedIdBetween(String value1, String value2) {
            addCriterion("PARTY_NEED_ID between", value1, value2, "partyNeedId");
            return (Criteria) this;
        }

        public Criteria andPartyNeedIdNotBetween(String value1, String value2) {
            addCriterion("PARTY_NEED_ID not between", value1, value2, "partyNeedId");
            return (Criteria) this;
        }

        public Criteria andNeedTypeIdIsNull() {
            addCriterion("NEED_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andNeedTypeIdIsNotNull() {
            addCriterion("NEED_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNeedTypeIdEqualTo(String value) {
            addCriterion("NEED_TYPE_ID =", value, "needTypeId");
            return (Criteria) this;
        }

        public Criteria andNeedTypeIdNotEqualTo(String value) {
            addCriterion("NEED_TYPE_ID <>", value, "needTypeId");
            return (Criteria) this;
        }

        public Criteria andNeedTypeIdGreaterThan(String value) {
            addCriterion("NEED_TYPE_ID >", value, "needTypeId");
            return (Criteria) this;
        }

        public Criteria andNeedTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("NEED_TYPE_ID >=", value, "needTypeId");
            return (Criteria) this;
        }

        public Criteria andNeedTypeIdLessThan(String value) {
            addCriterion("NEED_TYPE_ID <", value, "needTypeId");
            return (Criteria) this;
        }

        public Criteria andNeedTypeIdLessThanOrEqualTo(String value) {
            addCriterion("NEED_TYPE_ID <=", value, "needTypeId");
            return (Criteria) this;
        }

        public Criteria andNeedTypeIdLike(String value) {
            addCriterion("NEED_TYPE_ID like", value, "needTypeId");
            return (Criteria) this;
        }

        public Criteria andNeedTypeIdNotLike(String value) {
            addCriterion("NEED_TYPE_ID not like", value, "needTypeId");
            return (Criteria) this;
        }

        public Criteria andNeedTypeIdIn(List<String> values) {
            addCriterion("NEED_TYPE_ID in", values, "needTypeId");
            return (Criteria) this;
        }

        public Criteria andNeedTypeIdNotIn(List<String> values) {
            addCriterion("NEED_TYPE_ID not in", values, "needTypeId");
            return (Criteria) this;
        }

        public Criteria andNeedTypeIdBetween(String value1, String value2) {
            addCriterion("NEED_TYPE_ID between", value1, value2, "needTypeId");
            return (Criteria) this;
        }

        public Criteria andNeedTypeIdNotBetween(String value1, String value2) {
            addCriterion("NEED_TYPE_ID not between", value1, value2, "needTypeId");
            return (Criteria) this;
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

        public Criteria andOrderItemSeqIdIsNull() {
            addCriterion("ORDER_ITEM_SEQ_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderItemSeqIdIsNotNull() {
            addCriterion("ORDER_ITEM_SEQ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderItemSeqIdEqualTo(String value) {
            addCriterion("ORDER_ITEM_SEQ_ID =", value, "orderItemSeqId");
            return (Criteria) this;
        }

        public Criteria andOrderItemSeqIdNotEqualTo(String value) {
            addCriterion("ORDER_ITEM_SEQ_ID <>", value, "orderItemSeqId");
            return (Criteria) this;
        }

        public Criteria andOrderItemSeqIdGreaterThan(String value) {
            addCriterion("ORDER_ITEM_SEQ_ID >", value, "orderItemSeqId");
            return (Criteria) this;
        }

        public Criteria andOrderItemSeqIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_ITEM_SEQ_ID >=", value, "orderItemSeqId");
            return (Criteria) this;
        }

        public Criteria andOrderItemSeqIdLessThan(String value) {
            addCriterion("ORDER_ITEM_SEQ_ID <", value, "orderItemSeqId");
            return (Criteria) this;
        }

        public Criteria andOrderItemSeqIdLessThanOrEqualTo(String value) {
            addCriterion("ORDER_ITEM_SEQ_ID <=", value, "orderItemSeqId");
            return (Criteria) this;
        }

        public Criteria andOrderItemSeqIdLike(String value) {
            addCriterion("ORDER_ITEM_SEQ_ID like", value, "orderItemSeqId");
            return (Criteria) this;
        }

        public Criteria andOrderItemSeqIdNotLike(String value) {
            addCriterion("ORDER_ITEM_SEQ_ID not like", value, "orderItemSeqId");
            return (Criteria) this;
        }

        public Criteria andOrderItemSeqIdIn(List<String> values) {
            addCriterion("ORDER_ITEM_SEQ_ID in", values, "orderItemSeqId");
            return (Criteria) this;
        }

        public Criteria andOrderItemSeqIdNotIn(List<String> values) {
            addCriterion("ORDER_ITEM_SEQ_ID not in", values, "orderItemSeqId");
            return (Criteria) this;
        }

        public Criteria andOrderItemSeqIdBetween(String value1, String value2) {
            addCriterion("ORDER_ITEM_SEQ_ID between", value1, value2, "orderItemSeqId");
            return (Criteria) this;
        }

        public Criteria andOrderItemSeqIdNotBetween(String value1, String value2) {
            addCriterion("ORDER_ITEM_SEQ_ID not between", value1, value2, "orderItemSeqId");
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

        public Criteria andInventoryItemIdIsNull() {
            addCriterion("INVENTORY_ITEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andInventoryItemIdIsNotNull() {
            addCriterion("INVENTORY_ITEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryItemIdEqualTo(String value) {
            addCriterion("INVENTORY_ITEM_ID =", value, "inventoryItemId");
            return (Criteria) this;
        }

        public Criteria andInventoryItemIdNotEqualTo(String value) {
            addCriterion("INVENTORY_ITEM_ID <>", value, "inventoryItemId");
            return (Criteria) this;
        }

        public Criteria andInventoryItemIdGreaterThan(String value) {
            addCriterion("INVENTORY_ITEM_ID >", value, "inventoryItemId");
            return (Criteria) this;
        }

        public Criteria andInventoryItemIdGreaterThanOrEqualTo(String value) {
            addCriterion("INVENTORY_ITEM_ID >=", value, "inventoryItemId");
            return (Criteria) this;
        }

        public Criteria andInventoryItemIdLessThan(String value) {
            addCriterion("INVENTORY_ITEM_ID <", value, "inventoryItemId");
            return (Criteria) this;
        }

        public Criteria andInventoryItemIdLessThanOrEqualTo(String value) {
            addCriterion("INVENTORY_ITEM_ID <=", value, "inventoryItemId");
            return (Criteria) this;
        }

        public Criteria andInventoryItemIdLike(String value) {
            addCriterion("INVENTORY_ITEM_ID like", value, "inventoryItemId");
            return (Criteria) this;
        }

        public Criteria andInventoryItemIdNotLike(String value) {
            addCriterion("INVENTORY_ITEM_ID not like", value, "inventoryItemId");
            return (Criteria) this;
        }

        public Criteria andInventoryItemIdIn(List<String> values) {
            addCriterion("INVENTORY_ITEM_ID in", values, "inventoryItemId");
            return (Criteria) this;
        }

        public Criteria andInventoryItemIdNotIn(List<String> values) {
            addCriterion("INVENTORY_ITEM_ID not in", values, "inventoryItemId");
            return (Criteria) this;
        }

        public Criteria andInventoryItemIdBetween(String value1, String value2) {
            addCriterion("INVENTORY_ITEM_ID between", value1, value2, "inventoryItemId");
            return (Criteria) this;
        }

        public Criteria andInventoryItemIdNotBetween(String value1, String value2) {
            addCriterion("INVENTORY_ITEM_ID not between", value1, value2, "inventoryItemId");
            return (Criteria) this;
        }

        public Criteria andSubscriptionTypeIdIsNull() {
            addCriterion("SUBSCRIPTION_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andSubscriptionTypeIdIsNotNull() {
            addCriterion("SUBSCRIPTION_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSubscriptionTypeIdEqualTo(String value) {
            addCriterion("SUBSCRIPTION_TYPE_ID =", value, "subscriptionTypeId");
            return (Criteria) this;
        }

        public Criteria andSubscriptionTypeIdNotEqualTo(String value) {
            addCriterion("SUBSCRIPTION_TYPE_ID <>", value, "subscriptionTypeId");
            return (Criteria) this;
        }

        public Criteria andSubscriptionTypeIdGreaterThan(String value) {
            addCriterion("SUBSCRIPTION_TYPE_ID >", value, "subscriptionTypeId");
            return (Criteria) this;
        }

        public Criteria andSubscriptionTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("SUBSCRIPTION_TYPE_ID >=", value, "subscriptionTypeId");
            return (Criteria) this;
        }

        public Criteria andSubscriptionTypeIdLessThan(String value) {
            addCriterion("SUBSCRIPTION_TYPE_ID <", value, "subscriptionTypeId");
            return (Criteria) this;
        }

        public Criteria andSubscriptionTypeIdLessThanOrEqualTo(String value) {
            addCriterion("SUBSCRIPTION_TYPE_ID <=", value, "subscriptionTypeId");
            return (Criteria) this;
        }

        public Criteria andSubscriptionTypeIdLike(String value) {
            addCriterion("SUBSCRIPTION_TYPE_ID like", value, "subscriptionTypeId");
            return (Criteria) this;
        }

        public Criteria andSubscriptionTypeIdNotLike(String value) {
            addCriterion("SUBSCRIPTION_TYPE_ID not like", value, "subscriptionTypeId");
            return (Criteria) this;
        }

        public Criteria andSubscriptionTypeIdIn(List<String> values) {
            addCriterion("SUBSCRIPTION_TYPE_ID in", values, "subscriptionTypeId");
            return (Criteria) this;
        }

        public Criteria andSubscriptionTypeIdNotIn(List<String> values) {
            addCriterion("SUBSCRIPTION_TYPE_ID not in", values, "subscriptionTypeId");
            return (Criteria) this;
        }

        public Criteria andSubscriptionTypeIdBetween(String value1, String value2) {
            addCriterion("SUBSCRIPTION_TYPE_ID between", value1, value2, "subscriptionTypeId");
            return (Criteria) this;
        }

        public Criteria andSubscriptionTypeIdNotBetween(String value1, String value2) {
            addCriterion("SUBSCRIPTION_TYPE_ID not between", value1, value2, "subscriptionTypeId");
            return (Criteria) this;
        }

        public Criteria andExternalSubscriptionIdIsNull() {
            addCriterion("EXTERNAL_SUBSCRIPTION_ID is null");
            return (Criteria) this;
        }

        public Criteria andExternalSubscriptionIdIsNotNull() {
            addCriterion("EXTERNAL_SUBSCRIPTION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExternalSubscriptionIdEqualTo(String value) {
            addCriterion("EXTERNAL_SUBSCRIPTION_ID =", value, "externalSubscriptionId");
            return (Criteria) this;
        }

        public Criteria andExternalSubscriptionIdNotEqualTo(String value) {
            addCriterion("EXTERNAL_SUBSCRIPTION_ID <>", value, "externalSubscriptionId");
            return (Criteria) this;
        }

        public Criteria andExternalSubscriptionIdGreaterThan(String value) {
            addCriterion("EXTERNAL_SUBSCRIPTION_ID >", value, "externalSubscriptionId");
            return (Criteria) this;
        }

        public Criteria andExternalSubscriptionIdGreaterThanOrEqualTo(String value) {
            addCriterion("EXTERNAL_SUBSCRIPTION_ID >=", value, "externalSubscriptionId");
            return (Criteria) this;
        }

        public Criteria andExternalSubscriptionIdLessThan(String value) {
            addCriterion("EXTERNAL_SUBSCRIPTION_ID <", value, "externalSubscriptionId");
            return (Criteria) this;
        }

        public Criteria andExternalSubscriptionIdLessThanOrEqualTo(String value) {
            addCriterion("EXTERNAL_SUBSCRIPTION_ID <=", value, "externalSubscriptionId");
            return (Criteria) this;
        }

        public Criteria andExternalSubscriptionIdLike(String value) {
            addCriterion("EXTERNAL_SUBSCRIPTION_ID like", value, "externalSubscriptionId");
            return (Criteria) this;
        }

        public Criteria andExternalSubscriptionIdNotLike(String value) {
            addCriterion("EXTERNAL_SUBSCRIPTION_ID not like", value, "externalSubscriptionId");
            return (Criteria) this;
        }

        public Criteria andExternalSubscriptionIdIn(List<String> values) {
            addCriterion("EXTERNAL_SUBSCRIPTION_ID in", values, "externalSubscriptionId");
            return (Criteria) this;
        }

        public Criteria andExternalSubscriptionIdNotIn(List<String> values) {
            addCriterion("EXTERNAL_SUBSCRIPTION_ID not in", values, "externalSubscriptionId");
            return (Criteria) this;
        }

        public Criteria andExternalSubscriptionIdBetween(String value1, String value2) {
            addCriterion("EXTERNAL_SUBSCRIPTION_ID between", value1, value2, "externalSubscriptionId");
            return (Criteria) this;
        }

        public Criteria andExternalSubscriptionIdNotBetween(String value1, String value2) {
            addCriterion("EXTERNAL_SUBSCRIPTION_ID not between", value1, value2, "externalSubscriptionId");
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

        public Criteria andExpirationCompletedDateIsNull() {
            addCriterion("EXPIRATION_COMPLETED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andExpirationCompletedDateIsNotNull() {
            addCriterion("EXPIRATION_COMPLETED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andExpirationCompletedDateEqualTo(Date value) {
            addCriterion("EXPIRATION_COMPLETED_DATE =", value, "expirationCompletedDate");
            return (Criteria) this;
        }

        public Criteria andExpirationCompletedDateNotEqualTo(Date value) {
            addCriterion("EXPIRATION_COMPLETED_DATE <>", value, "expirationCompletedDate");
            return (Criteria) this;
        }

        public Criteria andExpirationCompletedDateGreaterThan(Date value) {
            addCriterion("EXPIRATION_COMPLETED_DATE >", value, "expirationCompletedDate");
            return (Criteria) this;
        }

        public Criteria andExpirationCompletedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("EXPIRATION_COMPLETED_DATE >=", value, "expirationCompletedDate");
            return (Criteria) this;
        }

        public Criteria andExpirationCompletedDateLessThan(Date value) {
            addCriterion("EXPIRATION_COMPLETED_DATE <", value, "expirationCompletedDate");
            return (Criteria) this;
        }

        public Criteria andExpirationCompletedDateLessThanOrEqualTo(Date value) {
            addCriterion("EXPIRATION_COMPLETED_DATE <=", value, "expirationCompletedDate");
            return (Criteria) this;
        }

        public Criteria andExpirationCompletedDateIn(List<Date> values) {
            addCriterion("EXPIRATION_COMPLETED_DATE in", values, "expirationCompletedDate");
            return (Criteria) this;
        }

        public Criteria andExpirationCompletedDateNotIn(List<Date> values) {
            addCriterion("EXPIRATION_COMPLETED_DATE not in", values, "expirationCompletedDate");
            return (Criteria) this;
        }

        public Criteria andExpirationCompletedDateBetween(Date value1, Date value2) {
            addCriterion("EXPIRATION_COMPLETED_DATE between", value1, value2, "expirationCompletedDate");
            return (Criteria) this;
        }

        public Criteria andExpirationCompletedDateNotBetween(Date value1, Date value2) {
            addCriterion("EXPIRATION_COMPLETED_DATE not between", value1, value2, "expirationCompletedDate");
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