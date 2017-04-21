package org.efbiz.product.inventory.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InventoryItemStatusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public InventoryItemStatusExample() {
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

        public Criteria andStatusIdIsNull() {
            addCriterion("STATUS_ID is null");
            return (Criteria) this;
        }

        public Criteria andStatusIdIsNotNull() {
            addCriterion("STATUS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStatusIdEqualTo(String value) {
            addCriterion("STATUS_ID =", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotEqualTo(String value) {
            addCriterion("STATUS_ID <>", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdGreaterThan(String value) {
            addCriterion("STATUS_ID >", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS_ID >=", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdLessThan(String value) {
            addCriterion("STATUS_ID <", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdLessThanOrEqualTo(String value) {
            addCriterion("STATUS_ID <=", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdLike(String value) {
            addCriterion("STATUS_ID like", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotLike(String value) {
            addCriterion("STATUS_ID not like", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdIn(List<String> values) {
            addCriterion("STATUS_ID in", values, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotIn(List<String> values) {
            addCriterion("STATUS_ID not in", values, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdBetween(String value1, String value2) {
            addCriterion("STATUS_ID between", value1, value2, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotBetween(String value1, String value2) {
            addCriterion("STATUS_ID not between", value1, value2, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusDatetimeIsNull() {
            addCriterion("STATUS_DATETIME is null");
            return (Criteria) this;
        }

        public Criteria andStatusDatetimeIsNotNull() {
            addCriterion("STATUS_DATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andStatusDatetimeEqualTo(Date value) {
            addCriterion("STATUS_DATETIME =", value, "statusDatetime");
            return (Criteria) this;
        }

        public Criteria andStatusDatetimeNotEqualTo(Date value) {
            addCriterion("STATUS_DATETIME <>", value, "statusDatetime");
            return (Criteria) this;
        }

        public Criteria andStatusDatetimeGreaterThan(Date value) {
            addCriterion("STATUS_DATETIME >", value, "statusDatetime");
            return (Criteria) this;
        }

        public Criteria andStatusDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("STATUS_DATETIME >=", value, "statusDatetime");
            return (Criteria) this;
        }

        public Criteria andStatusDatetimeLessThan(Date value) {
            addCriterion("STATUS_DATETIME <", value, "statusDatetime");
            return (Criteria) this;
        }

        public Criteria andStatusDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("STATUS_DATETIME <=", value, "statusDatetime");
            return (Criteria) this;
        }

        public Criteria andStatusDatetimeIn(List<Date> values) {
            addCriterion("STATUS_DATETIME in", values, "statusDatetime");
            return (Criteria) this;
        }

        public Criteria andStatusDatetimeNotIn(List<Date> values) {
            addCriterion("STATUS_DATETIME not in", values, "statusDatetime");
            return (Criteria) this;
        }

        public Criteria andStatusDatetimeBetween(Date value1, Date value2) {
            addCriterion("STATUS_DATETIME between", value1, value2, "statusDatetime");
            return (Criteria) this;
        }

        public Criteria andStatusDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("STATUS_DATETIME not between", value1, value2, "statusDatetime");
            return (Criteria) this;
        }

        public Criteria andStatusEndDatetimeIsNull() {
            addCriterion("STATUS_END_DATETIME is null");
            return (Criteria) this;
        }

        public Criteria andStatusEndDatetimeIsNotNull() {
            addCriterion("STATUS_END_DATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEndDatetimeEqualTo(Date value) {
            addCriterion("STATUS_END_DATETIME =", value, "statusEndDatetime");
            return (Criteria) this;
        }

        public Criteria andStatusEndDatetimeNotEqualTo(Date value) {
            addCriterion("STATUS_END_DATETIME <>", value, "statusEndDatetime");
            return (Criteria) this;
        }

        public Criteria andStatusEndDatetimeGreaterThan(Date value) {
            addCriterion("STATUS_END_DATETIME >", value, "statusEndDatetime");
            return (Criteria) this;
        }

        public Criteria andStatusEndDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("STATUS_END_DATETIME >=", value, "statusEndDatetime");
            return (Criteria) this;
        }

        public Criteria andStatusEndDatetimeLessThan(Date value) {
            addCriterion("STATUS_END_DATETIME <", value, "statusEndDatetime");
            return (Criteria) this;
        }

        public Criteria andStatusEndDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("STATUS_END_DATETIME <=", value, "statusEndDatetime");
            return (Criteria) this;
        }

        public Criteria andStatusEndDatetimeIn(List<Date> values) {
            addCriterion("STATUS_END_DATETIME in", values, "statusEndDatetime");
            return (Criteria) this;
        }

        public Criteria andStatusEndDatetimeNotIn(List<Date> values) {
            addCriterion("STATUS_END_DATETIME not in", values, "statusEndDatetime");
            return (Criteria) this;
        }

        public Criteria andStatusEndDatetimeBetween(Date value1, Date value2) {
            addCriterion("STATUS_END_DATETIME between", value1, value2, "statusEndDatetime");
            return (Criteria) this;
        }

        public Criteria andStatusEndDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("STATUS_END_DATETIME not between", value1, value2, "statusEndDatetime");
            return (Criteria) this;
        }

        public Criteria andChangeByUserLoginIdIsNull() {
            addCriterion("CHANGE_BY_USER_LOGIN_ID is null");
            return (Criteria) this;
        }

        public Criteria andChangeByUserLoginIdIsNotNull() {
            addCriterion("CHANGE_BY_USER_LOGIN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andChangeByUserLoginIdEqualTo(String value) {
            addCriterion("CHANGE_BY_USER_LOGIN_ID =", value, "changeByUserLoginId");
            return (Criteria) this;
        }

        public Criteria andChangeByUserLoginIdNotEqualTo(String value) {
            addCriterion("CHANGE_BY_USER_LOGIN_ID <>", value, "changeByUserLoginId");
            return (Criteria) this;
        }

        public Criteria andChangeByUserLoginIdGreaterThan(String value) {
            addCriterion("CHANGE_BY_USER_LOGIN_ID >", value, "changeByUserLoginId");
            return (Criteria) this;
        }

        public Criteria andChangeByUserLoginIdGreaterThanOrEqualTo(String value) {
            addCriterion("CHANGE_BY_USER_LOGIN_ID >=", value, "changeByUserLoginId");
            return (Criteria) this;
        }

        public Criteria andChangeByUserLoginIdLessThan(String value) {
            addCriterion("CHANGE_BY_USER_LOGIN_ID <", value, "changeByUserLoginId");
            return (Criteria) this;
        }

        public Criteria andChangeByUserLoginIdLessThanOrEqualTo(String value) {
            addCriterion("CHANGE_BY_USER_LOGIN_ID <=", value, "changeByUserLoginId");
            return (Criteria) this;
        }

        public Criteria andChangeByUserLoginIdLike(String value) {
            addCriterion("CHANGE_BY_USER_LOGIN_ID like", value, "changeByUserLoginId");
            return (Criteria) this;
        }

        public Criteria andChangeByUserLoginIdNotLike(String value) {
            addCriterion("CHANGE_BY_USER_LOGIN_ID not like", value, "changeByUserLoginId");
            return (Criteria) this;
        }

        public Criteria andChangeByUserLoginIdIn(List<String> values) {
            addCriterion("CHANGE_BY_USER_LOGIN_ID in", values, "changeByUserLoginId");
            return (Criteria) this;
        }

        public Criteria andChangeByUserLoginIdNotIn(List<String> values) {
            addCriterion("CHANGE_BY_USER_LOGIN_ID not in", values, "changeByUserLoginId");
            return (Criteria) this;
        }

        public Criteria andChangeByUserLoginIdBetween(String value1, String value2) {
            addCriterion("CHANGE_BY_USER_LOGIN_ID between", value1, value2, "changeByUserLoginId");
            return (Criteria) this;
        }

        public Criteria andChangeByUserLoginIdNotBetween(String value1, String value2) {
            addCriterion("CHANGE_BY_USER_LOGIN_ID not between", value1, value2, "changeByUserLoginId");
            return (Criteria) this;
        }

        public Criteria andOwnerPartyIdIsNull() {
            addCriterion("OWNER_PARTY_ID is null");
            return (Criteria) this;
        }

        public Criteria andOwnerPartyIdIsNotNull() {
            addCriterion("OWNER_PARTY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerPartyIdEqualTo(String value) {
            addCriterion("OWNER_PARTY_ID =", value, "ownerPartyId");
            return (Criteria) this;
        }

        public Criteria andOwnerPartyIdNotEqualTo(String value) {
            addCriterion("OWNER_PARTY_ID <>", value, "ownerPartyId");
            return (Criteria) this;
        }

        public Criteria andOwnerPartyIdGreaterThan(String value) {
            addCriterion("OWNER_PARTY_ID >", value, "ownerPartyId");
            return (Criteria) this;
        }

        public Criteria andOwnerPartyIdGreaterThanOrEqualTo(String value) {
            addCriterion("OWNER_PARTY_ID >=", value, "ownerPartyId");
            return (Criteria) this;
        }

        public Criteria andOwnerPartyIdLessThan(String value) {
            addCriterion("OWNER_PARTY_ID <", value, "ownerPartyId");
            return (Criteria) this;
        }

        public Criteria andOwnerPartyIdLessThanOrEqualTo(String value) {
            addCriterion("OWNER_PARTY_ID <=", value, "ownerPartyId");
            return (Criteria) this;
        }

        public Criteria andOwnerPartyIdLike(String value) {
            addCriterion("OWNER_PARTY_ID like", value, "ownerPartyId");
            return (Criteria) this;
        }

        public Criteria andOwnerPartyIdNotLike(String value) {
            addCriterion("OWNER_PARTY_ID not like", value, "ownerPartyId");
            return (Criteria) this;
        }

        public Criteria andOwnerPartyIdIn(List<String> values) {
            addCriterion("OWNER_PARTY_ID in", values, "ownerPartyId");
            return (Criteria) this;
        }

        public Criteria andOwnerPartyIdNotIn(List<String> values) {
            addCriterion("OWNER_PARTY_ID not in", values, "ownerPartyId");
            return (Criteria) this;
        }

        public Criteria andOwnerPartyIdBetween(String value1, String value2) {
            addCriterion("OWNER_PARTY_ID between", value1, value2, "ownerPartyId");
            return (Criteria) this;
        }

        public Criteria andOwnerPartyIdNotBetween(String value1, String value2) {
            addCriterion("OWNER_PARTY_ID not between", value1, value2, "ownerPartyId");
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