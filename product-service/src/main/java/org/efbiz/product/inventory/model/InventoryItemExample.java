package org.efbiz.product.inventory.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InventoryItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public InventoryItemExample() {
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

        public Criteria andInventoryItemTypeIdIsNull() {
            addCriterion("INVENTORY_ITEM_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andInventoryItemTypeIdIsNotNull() {
            addCriterion("INVENTORY_ITEM_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryItemTypeIdEqualTo(String value) {
            addCriterion("INVENTORY_ITEM_TYPE_ID =", value, "inventoryItemTypeId");
            return (Criteria) this;
        }

        public Criteria andInventoryItemTypeIdNotEqualTo(String value) {
            addCriterion("INVENTORY_ITEM_TYPE_ID <>", value, "inventoryItemTypeId");
            return (Criteria) this;
        }

        public Criteria andInventoryItemTypeIdGreaterThan(String value) {
            addCriterion("INVENTORY_ITEM_TYPE_ID >", value, "inventoryItemTypeId");
            return (Criteria) this;
        }

        public Criteria andInventoryItemTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("INVENTORY_ITEM_TYPE_ID >=", value, "inventoryItemTypeId");
            return (Criteria) this;
        }

        public Criteria andInventoryItemTypeIdLessThan(String value) {
            addCriterion("INVENTORY_ITEM_TYPE_ID <", value, "inventoryItemTypeId");
            return (Criteria) this;
        }

        public Criteria andInventoryItemTypeIdLessThanOrEqualTo(String value) {
            addCriterion("INVENTORY_ITEM_TYPE_ID <=", value, "inventoryItemTypeId");
            return (Criteria) this;
        }

        public Criteria andInventoryItemTypeIdLike(String value) {
            addCriterion("INVENTORY_ITEM_TYPE_ID like", value, "inventoryItemTypeId");
            return (Criteria) this;
        }

        public Criteria andInventoryItemTypeIdNotLike(String value) {
            addCriterion("INVENTORY_ITEM_TYPE_ID not like", value, "inventoryItemTypeId");
            return (Criteria) this;
        }

        public Criteria andInventoryItemTypeIdIn(List<String> values) {
            addCriterion("INVENTORY_ITEM_TYPE_ID in", values, "inventoryItemTypeId");
            return (Criteria) this;
        }

        public Criteria andInventoryItemTypeIdNotIn(List<String> values) {
            addCriterion("INVENTORY_ITEM_TYPE_ID not in", values, "inventoryItemTypeId");
            return (Criteria) this;
        }

        public Criteria andInventoryItemTypeIdBetween(String value1, String value2) {
            addCriterion("INVENTORY_ITEM_TYPE_ID between", value1, value2, "inventoryItemTypeId");
            return (Criteria) this;
        }

        public Criteria andInventoryItemTypeIdNotBetween(String value1, String value2) {
            addCriterion("INVENTORY_ITEM_TYPE_ID not between", value1, value2, "inventoryItemTypeId");
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

        public Criteria andDatetimeReceivedIsNull() {
            addCriterion("DATETIME_RECEIVED is null");
            return (Criteria) this;
        }

        public Criteria andDatetimeReceivedIsNotNull() {
            addCriterion("DATETIME_RECEIVED is not null");
            return (Criteria) this;
        }

        public Criteria andDatetimeReceivedEqualTo(Date value) {
            addCriterion("DATETIME_RECEIVED =", value, "datetimeReceived");
            return (Criteria) this;
        }

        public Criteria andDatetimeReceivedNotEqualTo(Date value) {
            addCriterion("DATETIME_RECEIVED <>", value, "datetimeReceived");
            return (Criteria) this;
        }

        public Criteria andDatetimeReceivedGreaterThan(Date value) {
            addCriterion("DATETIME_RECEIVED >", value, "datetimeReceived");
            return (Criteria) this;
        }

        public Criteria andDatetimeReceivedGreaterThanOrEqualTo(Date value) {
            addCriterion("DATETIME_RECEIVED >=", value, "datetimeReceived");
            return (Criteria) this;
        }

        public Criteria andDatetimeReceivedLessThan(Date value) {
            addCriterion("DATETIME_RECEIVED <", value, "datetimeReceived");
            return (Criteria) this;
        }

        public Criteria andDatetimeReceivedLessThanOrEqualTo(Date value) {
            addCriterion("DATETIME_RECEIVED <=", value, "datetimeReceived");
            return (Criteria) this;
        }

        public Criteria andDatetimeReceivedIn(List<Date> values) {
            addCriterion("DATETIME_RECEIVED in", values, "datetimeReceived");
            return (Criteria) this;
        }

        public Criteria andDatetimeReceivedNotIn(List<Date> values) {
            addCriterion("DATETIME_RECEIVED not in", values, "datetimeReceived");
            return (Criteria) this;
        }

        public Criteria andDatetimeReceivedBetween(Date value1, Date value2) {
            addCriterion("DATETIME_RECEIVED between", value1, value2, "datetimeReceived");
            return (Criteria) this;
        }

        public Criteria andDatetimeReceivedNotBetween(Date value1, Date value2) {
            addCriterion("DATETIME_RECEIVED not between", value1, value2, "datetimeReceived");
            return (Criteria) this;
        }

        public Criteria andDatetimeManufacturedIsNull() {
            addCriterion("DATETIME_MANUFACTURED is null");
            return (Criteria) this;
        }

        public Criteria andDatetimeManufacturedIsNotNull() {
            addCriterion("DATETIME_MANUFACTURED is not null");
            return (Criteria) this;
        }

        public Criteria andDatetimeManufacturedEqualTo(Date value) {
            addCriterion("DATETIME_MANUFACTURED =", value, "datetimeManufactured");
            return (Criteria) this;
        }

        public Criteria andDatetimeManufacturedNotEqualTo(Date value) {
            addCriterion("DATETIME_MANUFACTURED <>", value, "datetimeManufactured");
            return (Criteria) this;
        }

        public Criteria andDatetimeManufacturedGreaterThan(Date value) {
            addCriterion("DATETIME_MANUFACTURED >", value, "datetimeManufactured");
            return (Criteria) this;
        }

        public Criteria andDatetimeManufacturedGreaterThanOrEqualTo(Date value) {
            addCriterion("DATETIME_MANUFACTURED >=", value, "datetimeManufactured");
            return (Criteria) this;
        }

        public Criteria andDatetimeManufacturedLessThan(Date value) {
            addCriterion("DATETIME_MANUFACTURED <", value, "datetimeManufactured");
            return (Criteria) this;
        }

        public Criteria andDatetimeManufacturedLessThanOrEqualTo(Date value) {
            addCriterion("DATETIME_MANUFACTURED <=", value, "datetimeManufactured");
            return (Criteria) this;
        }

        public Criteria andDatetimeManufacturedIn(List<Date> values) {
            addCriterion("DATETIME_MANUFACTURED in", values, "datetimeManufactured");
            return (Criteria) this;
        }

        public Criteria andDatetimeManufacturedNotIn(List<Date> values) {
            addCriterion("DATETIME_MANUFACTURED not in", values, "datetimeManufactured");
            return (Criteria) this;
        }

        public Criteria andDatetimeManufacturedBetween(Date value1, Date value2) {
            addCriterion("DATETIME_MANUFACTURED between", value1, value2, "datetimeManufactured");
            return (Criteria) this;
        }

        public Criteria andDatetimeManufacturedNotBetween(Date value1, Date value2) {
            addCriterion("DATETIME_MANUFACTURED not between", value1, value2, "datetimeManufactured");
            return (Criteria) this;
        }

        public Criteria andExpireDateIsNull() {
            addCriterion("EXPIRE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andExpireDateIsNotNull() {
            addCriterion("EXPIRE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andExpireDateEqualTo(Date value) {
            addCriterion("EXPIRE_DATE =", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateNotEqualTo(Date value) {
            addCriterion("EXPIRE_DATE <>", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateGreaterThan(Date value) {
            addCriterion("EXPIRE_DATE >", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateGreaterThanOrEqualTo(Date value) {
            addCriterion("EXPIRE_DATE >=", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateLessThan(Date value) {
            addCriterion("EXPIRE_DATE <", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateLessThanOrEqualTo(Date value) {
            addCriterion("EXPIRE_DATE <=", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateIn(List<Date> values) {
            addCriterion("EXPIRE_DATE in", values, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateNotIn(List<Date> values) {
            addCriterion("EXPIRE_DATE not in", values, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateBetween(Date value1, Date value2) {
            addCriterion("EXPIRE_DATE between", value1, value2, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateNotBetween(Date value1, Date value2) {
            addCriterion("EXPIRE_DATE not between", value1, value2, "expireDate");
            return (Criteria) this;
        }

        public Criteria andFacilityIdIsNull() {
            addCriterion("FACILITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andFacilityIdIsNotNull() {
            addCriterion("FACILITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFacilityIdEqualTo(String value) {
            addCriterion("FACILITY_ID =", value, "facilityId");
            return (Criteria) this;
        }

        public Criteria andFacilityIdNotEqualTo(String value) {
            addCriterion("FACILITY_ID <>", value, "facilityId");
            return (Criteria) this;
        }

        public Criteria andFacilityIdGreaterThan(String value) {
            addCriterion("FACILITY_ID >", value, "facilityId");
            return (Criteria) this;
        }

        public Criteria andFacilityIdGreaterThanOrEqualTo(String value) {
            addCriterion("FACILITY_ID >=", value, "facilityId");
            return (Criteria) this;
        }

        public Criteria andFacilityIdLessThan(String value) {
            addCriterion("FACILITY_ID <", value, "facilityId");
            return (Criteria) this;
        }

        public Criteria andFacilityIdLessThanOrEqualTo(String value) {
            addCriterion("FACILITY_ID <=", value, "facilityId");
            return (Criteria) this;
        }

        public Criteria andFacilityIdLike(String value) {
            addCriterion("FACILITY_ID like", value, "facilityId");
            return (Criteria) this;
        }

        public Criteria andFacilityIdNotLike(String value) {
            addCriterion("FACILITY_ID not like", value, "facilityId");
            return (Criteria) this;
        }

        public Criteria andFacilityIdIn(List<String> values) {
            addCriterion("FACILITY_ID in", values, "facilityId");
            return (Criteria) this;
        }

        public Criteria andFacilityIdNotIn(List<String> values) {
            addCriterion("FACILITY_ID not in", values, "facilityId");
            return (Criteria) this;
        }

        public Criteria andFacilityIdBetween(String value1, String value2) {
            addCriterion("FACILITY_ID between", value1, value2, "facilityId");
            return (Criteria) this;
        }

        public Criteria andFacilityIdNotBetween(String value1, String value2) {
            addCriterion("FACILITY_ID not between", value1, value2, "facilityId");
            return (Criteria) this;
        }

        public Criteria andContainerIdIsNull() {
            addCriterion("CONTAINER_ID is null");
            return (Criteria) this;
        }

        public Criteria andContainerIdIsNotNull() {
            addCriterion("CONTAINER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andContainerIdEqualTo(String value) {
            addCriterion("CONTAINER_ID =", value, "containerId");
            return (Criteria) this;
        }

        public Criteria andContainerIdNotEqualTo(String value) {
            addCriterion("CONTAINER_ID <>", value, "containerId");
            return (Criteria) this;
        }

        public Criteria andContainerIdGreaterThan(String value) {
            addCriterion("CONTAINER_ID >", value, "containerId");
            return (Criteria) this;
        }

        public Criteria andContainerIdGreaterThanOrEqualTo(String value) {
            addCriterion("CONTAINER_ID >=", value, "containerId");
            return (Criteria) this;
        }

        public Criteria andContainerIdLessThan(String value) {
            addCriterion("CONTAINER_ID <", value, "containerId");
            return (Criteria) this;
        }

        public Criteria andContainerIdLessThanOrEqualTo(String value) {
            addCriterion("CONTAINER_ID <=", value, "containerId");
            return (Criteria) this;
        }

        public Criteria andContainerIdLike(String value) {
            addCriterion("CONTAINER_ID like", value, "containerId");
            return (Criteria) this;
        }

        public Criteria andContainerIdNotLike(String value) {
            addCriterion("CONTAINER_ID not like", value, "containerId");
            return (Criteria) this;
        }

        public Criteria andContainerIdIn(List<String> values) {
            addCriterion("CONTAINER_ID in", values, "containerId");
            return (Criteria) this;
        }

        public Criteria andContainerIdNotIn(List<String> values) {
            addCriterion("CONTAINER_ID not in", values, "containerId");
            return (Criteria) this;
        }

        public Criteria andContainerIdBetween(String value1, String value2) {
            addCriterion("CONTAINER_ID between", value1, value2, "containerId");
            return (Criteria) this;
        }

        public Criteria andContainerIdNotBetween(String value1, String value2) {
            addCriterion("CONTAINER_ID not between", value1, value2, "containerId");
            return (Criteria) this;
        }

        public Criteria andLotIdIsNull() {
            addCriterion("LOT_ID is null");
            return (Criteria) this;
        }

        public Criteria andLotIdIsNotNull() {
            addCriterion("LOT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLotIdEqualTo(String value) {
            addCriterion("LOT_ID =", value, "lotId");
            return (Criteria) this;
        }

        public Criteria andLotIdNotEqualTo(String value) {
            addCriterion("LOT_ID <>", value, "lotId");
            return (Criteria) this;
        }

        public Criteria andLotIdGreaterThan(String value) {
            addCriterion("LOT_ID >", value, "lotId");
            return (Criteria) this;
        }

        public Criteria andLotIdGreaterThanOrEqualTo(String value) {
            addCriterion("LOT_ID >=", value, "lotId");
            return (Criteria) this;
        }

        public Criteria andLotIdLessThan(String value) {
            addCriterion("LOT_ID <", value, "lotId");
            return (Criteria) this;
        }

        public Criteria andLotIdLessThanOrEqualTo(String value) {
            addCriterion("LOT_ID <=", value, "lotId");
            return (Criteria) this;
        }

        public Criteria andLotIdLike(String value) {
            addCriterion("LOT_ID like", value, "lotId");
            return (Criteria) this;
        }

        public Criteria andLotIdNotLike(String value) {
            addCriterion("LOT_ID not like", value, "lotId");
            return (Criteria) this;
        }

        public Criteria andLotIdIn(List<String> values) {
            addCriterion("LOT_ID in", values, "lotId");
            return (Criteria) this;
        }

        public Criteria andLotIdNotIn(List<String> values) {
            addCriterion("LOT_ID not in", values, "lotId");
            return (Criteria) this;
        }

        public Criteria andLotIdBetween(String value1, String value2) {
            addCriterion("LOT_ID between", value1, value2, "lotId");
            return (Criteria) this;
        }

        public Criteria andLotIdNotBetween(String value1, String value2) {
            addCriterion("LOT_ID not between", value1, value2, "lotId");
            return (Criteria) this;
        }

        public Criteria andUomIdIsNull() {
            addCriterion("UOM_ID is null");
            return (Criteria) this;
        }

        public Criteria andUomIdIsNotNull() {
            addCriterion("UOM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUomIdEqualTo(String value) {
            addCriterion("UOM_ID =", value, "uomId");
            return (Criteria) this;
        }

        public Criteria andUomIdNotEqualTo(String value) {
            addCriterion("UOM_ID <>", value, "uomId");
            return (Criteria) this;
        }

        public Criteria andUomIdGreaterThan(String value) {
            addCriterion("UOM_ID >", value, "uomId");
            return (Criteria) this;
        }

        public Criteria andUomIdGreaterThanOrEqualTo(String value) {
            addCriterion("UOM_ID >=", value, "uomId");
            return (Criteria) this;
        }

        public Criteria andUomIdLessThan(String value) {
            addCriterion("UOM_ID <", value, "uomId");
            return (Criteria) this;
        }

        public Criteria andUomIdLessThanOrEqualTo(String value) {
            addCriterion("UOM_ID <=", value, "uomId");
            return (Criteria) this;
        }

        public Criteria andUomIdLike(String value) {
            addCriterion("UOM_ID like", value, "uomId");
            return (Criteria) this;
        }

        public Criteria andUomIdNotLike(String value) {
            addCriterion("UOM_ID not like", value, "uomId");
            return (Criteria) this;
        }

        public Criteria andUomIdIn(List<String> values) {
            addCriterion("UOM_ID in", values, "uomId");
            return (Criteria) this;
        }

        public Criteria andUomIdNotIn(List<String> values) {
            addCriterion("UOM_ID not in", values, "uomId");
            return (Criteria) this;
        }

        public Criteria andUomIdBetween(String value1, String value2) {
            addCriterion("UOM_ID between", value1, value2, "uomId");
            return (Criteria) this;
        }

        public Criteria andUomIdNotBetween(String value1, String value2) {
            addCriterion("UOM_ID not between", value1, value2, "uomId");
            return (Criteria) this;
        }

        public Criteria andBinNumberIsNull() {
            addCriterion("BIN_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andBinNumberIsNotNull() {
            addCriterion("BIN_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andBinNumberEqualTo(String value) {
            addCriterion("BIN_NUMBER =", value, "binNumber");
            return (Criteria) this;
        }

        public Criteria andBinNumberNotEqualTo(String value) {
            addCriterion("BIN_NUMBER <>", value, "binNumber");
            return (Criteria) this;
        }

        public Criteria andBinNumberGreaterThan(String value) {
            addCriterion("BIN_NUMBER >", value, "binNumber");
            return (Criteria) this;
        }

        public Criteria andBinNumberGreaterThanOrEqualTo(String value) {
            addCriterion("BIN_NUMBER >=", value, "binNumber");
            return (Criteria) this;
        }

        public Criteria andBinNumberLessThan(String value) {
            addCriterion("BIN_NUMBER <", value, "binNumber");
            return (Criteria) this;
        }

        public Criteria andBinNumberLessThanOrEqualTo(String value) {
            addCriterion("BIN_NUMBER <=", value, "binNumber");
            return (Criteria) this;
        }

        public Criteria andBinNumberLike(String value) {
            addCriterion("BIN_NUMBER like", value, "binNumber");
            return (Criteria) this;
        }

        public Criteria andBinNumberNotLike(String value) {
            addCriterion("BIN_NUMBER not like", value, "binNumber");
            return (Criteria) this;
        }

        public Criteria andBinNumberIn(List<String> values) {
            addCriterion("BIN_NUMBER in", values, "binNumber");
            return (Criteria) this;
        }

        public Criteria andBinNumberNotIn(List<String> values) {
            addCriterion("BIN_NUMBER not in", values, "binNumber");
            return (Criteria) this;
        }

        public Criteria andBinNumberBetween(String value1, String value2) {
            addCriterion("BIN_NUMBER between", value1, value2, "binNumber");
            return (Criteria) this;
        }

        public Criteria andBinNumberNotBetween(String value1, String value2) {
            addCriterion("BIN_NUMBER not between", value1, value2, "binNumber");
            return (Criteria) this;
        }

        public Criteria andLocationSeqIdIsNull() {
            addCriterion("LOCATION_SEQ_ID is null");
            return (Criteria) this;
        }

        public Criteria andLocationSeqIdIsNotNull() {
            addCriterion("LOCATION_SEQ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLocationSeqIdEqualTo(String value) {
            addCriterion("LOCATION_SEQ_ID =", value, "locationSeqId");
            return (Criteria) this;
        }

        public Criteria andLocationSeqIdNotEqualTo(String value) {
            addCriterion("LOCATION_SEQ_ID <>", value, "locationSeqId");
            return (Criteria) this;
        }

        public Criteria andLocationSeqIdGreaterThan(String value) {
            addCriterion("LOCATION_SEQ_ID >", value, "locationSeqId");
            return (Criteria) this;
        }

        public Criteria andLocationSeqIdGreaterThanOrEqualTo(String value) {
            addCriterion("LOCATION_SEQ_ID >=", value, "locationSeqId");
            return (Criteria) this;
        }

        public Criteria andLocationSeqIdLessThan(String value) {
            addCriterion("LOCATION_SEQ_ID <", value, "locationSeqId");
            return (Criteria) this;
        }

        public Criteria andLocationSeqIdLessThanOrEqualTo(String value) {
            addCriterion("LOCATION_SEQ_ID <=", value, "locationSeqId");
            return (Criteria) this;
        }

        public Criteria andLocationSeqIdLike(String value) {
            addCriterion("LOCATION_SEQ_ID like", value, "locationSeqId");
            return (Criteria) this;
        }

        public Criteria andLocationSeqIdNotLike(String value) {
            addCriterion("LOCATION_SEQ_ID not like", value, "locationSeqId");
            return (Criteria) this;
        }

        public Criteria andLocationSeqIdIn(List<String> values) {
            addCriterion("LOCATION_SEQ_ID in", values, "locationSeqId");
            return (Criteria) this;
        }

        public Criteria andLocationSeqIdNotIn(List<String> values) {
            addCriterion("LOCATION_SEQ_ID not in", values, "locationSeqId");
            return (Criteria) this;
        }

        public Criteria andLocationSeqIdBetween(String value1, String value2) {
            addCriterion("LOCATION_SEQ_ID between", value1, value2, "locationSeqId");
            return (Criteria) this;
        }

        public Criteria andLocationSeqIdNotBetween(String value1, String value2) {
            addCriterion("LOCATION_SEQ_ID not between", value1, value2, "locationSeqId");
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

        public Criteria andQuantityOnHandTotalIsNull() {
            addCriterion("QUANTITY_ON_HAND_TOTAL is null");
            return (Criteria) this;
        }

        public Criteria andQuantityOnHandTotalIsNotNull() {
            addCriterion("QUANTITY_ON_HAND_TOTAL is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityOnHandTotalEqualTo(BigDecimal value) {
            addCriterion("QUANTITY_ON_HAND_TOTAL =", value, "quantityOnHandTotal");
            return (Criteria) this;
        }

        public Criteria andQuantityOnHandTotalNotEqualTo(BigDecimal value) {
            addCriterion("QUANTITY_ON_HAND_TOTAL <>", value, "quantityOnHandTotal");
            return (Criteria) this;
        }

        public Criteria andQuantityOnHandTotalGreaterThan(BigDecimal value) {
            addCriterion("QUANTITY_ON_HAND_TOTAL >", value, "quantityOnHandTotal");
            return (Criteria) this;
        }

        public Criteria andQuantityOnHandTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QUANTITY_ON_HAND_TOTAL >=", value, "quantityOnHandTotal");
            return (Criteria) this;
        }

        public Criteria andQuantityOnHandTotalLessThan(BigDecimal value) {
            addCriterion("QUANTITY_ON_HAND_TOTAL <", value, "quantityOnHandTotal");
            return (Criteria) this;
        }

        public Criteria andQuantityOnHandTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QUANTITY_ON_HAND_TOTAL <=", value, "quantityOnHandTotal");
            return (Criteria) this;
        }

        public Criteria andQuantityOnHandTotalIn(List<BigDecimal> values) {
            addCriterion("QUANTITY_ON_HAND_TOTAL in", values, "quantityOnHandTotal");
            return (Criteria) this;
        }

        public Criteria andQuantityOnHandTotalNotIn(List<BigDecimal> values) {
            addCriterion("QUANTITY_ON_HAND_TOTAL not in", values, "quantityOnHandTotal");
            return (Criteria) this;
        }

        public Criteria andQuantityOnHandTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QUANTITY_ON_HAND_TOTAL between", value1, value2, "quantityOnHandTotal");
            return (Criteria) this;
        }

        public Criteria andQuantityOnHandTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QUANTITY_ON_HAND_TOTAL not between", value1, value2, "quantityOnHandTotal");
            return (Criteria) this;
        }

        public Criteria andAvailableToPromiseTotalIsNull() {
            addCriterion("AVAILABLE_TO_PROMISE_TOTAL is null");
            return (Criteria) this;
        }

        public Criteria andAvailableToPromiseTotalIsNotNull() {
            addCriterion("AVAILABLE_TO_PROMISE_TOTAL is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableToPromiseTotalEqualTo(BigDecimal value) {
            addCriterion("AVAILABLE_TO_PROMISE_TOTAL =", value, "availableToPromiseTotal");
            return (Criteria) this;
        }

        public Criteria andAvailableToPromiseTotalNotEqualTo(BigDecimal value) {
            addCriterion("AVAILABLE_TO_PROMISE_TOTAL <>", value, "availableToPromiseTotal");
            return (Criteria) this;
        }

        public Criteria andAvailableToPromiseTotalGreaterThan(BigDecimal value) {
            addCriterion("AVAILABLE_TO_PROMISE_TOTAL >", value, "availableToPromiseTotal");
            return (Criteria) this;
        }

        public Criteria andAvailableToPromiseTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AVAILABLE_TO_PROMISE_TOTAL >=", value, "availableToPromiseTotal");
            return (Criteria) this;
        }

        public Criteria andAvailableToPromiseTotalLessThan(BigDecimal value) {
            addCriterion("AVAILABLE_TO_PROMISE_TOTAL <", value, "availableToPromiseTotal");
            return (Criteria) this;
        }

        public Criteria andAvailableToPromiseTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AVAILABLE_TO_PROMISE_TOTAL <=", value, "availableToPromiseTotal");
            return (Criteria) this;
        }

        public Criteria andAvailableToPromiseTotalIn(List<BigDecimal> values) {
            addCriterion("AVAILABLE_TO_PROMISE_TOTAL in", values, "availableToPromiseTotal");
            return (Criteria) this;
        }

        public Criteria andAvailableToPromiseTotalNotIn(List<BigDecimal> values) {
            addCriterion("AVAILABLE_TO_PROMISE_TOTAL not in", values, "availableToPromiseTotal");
            return (Criteria) this;
        }

        public Criteria andAvailableToPromiseTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AVAILABLE_TO_PROMISE_TOTAL between", value1, value2, "availableToPromiseTotal");
            return (Criteria) this;
        }

        public Criteria andAvailableToPromiseTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AVAILABLE_TO_PROMISE_TOTAL not between", value1, value2, "availableToPromiseTotal");
            return (Criteria) this;
        }

        public Criteria andAccountingQuantityTotalIsNull() {
            addCriterion("ACCOUNTING_QUANTITY_TOTAL is null");
            return (Criteria) this;
        }

        public Criteria andAccountingQuantityTotalIsNotNull() {
            addCriterion("ACCOUNTING_QUANTITY_TOTAL is not null");
            return (Criteria) this;
        }

        public Criteria andAccountingQuantityTotalEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTING_QUANTITY_TOTAL =", value, "accountingQuantityTotal");
            return (Criteria) this;
        }

        public Criteria andAccountingQuantityTotalNotEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTING_QUANTITY_TOTAL <>", value, "accountingQuantityTotal");
            return (Criteria) this;
        }

        public Criteria andAccountingQuantityTotalGreaterThan(BigDecimal value) {
            addCriterion("ACCOUNTING_QUANTITY_TOTAL >", value, "accountingQuantityTotal");
            return (Criteria) this;
        }

        public Criteria andAccountingQuantityTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTING_QUANTITY_TOTAL >=", value, "accountingQuantityTotal");
            return (Criteria) this;
        }

        public Criteria andAccountingQuantityTotalLessThan(BigDecimal value) {
            addCriterion("ACCOUNTING_QUANTITY_TOTAL <", value, "accountingQuantityTotal");
            return (Criteria) this;
        }

        public Criteria andAccountingQuantityTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTING_QUANTITY_TOTAL <=", value, "accountingQuantityTotal");
            return (Criteria) this;
        }

        public Criteria andAccountingQuantityTotalIn(List<BigDecimal> values) {
            addCriterion("ACCOUNTING_QUANTITY_TOTAL in", values, "accountingQuantityTotal");
            return (Criteria) this;
        }

        public Criteria andAccountingQuantityTotalNotIn(List<BigDecimal> values) {
            addCriterion("ACCOUNTING_QUANTITY_TOTAL not in", values, "accountingQuantityTotal");
            return (Criteria) this;
        }

        public Criteria andAccountingQuantityTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCOUNTING_QUANTITY_TOTAL between", value1, value2, "accountingQuantityTotal");
            return (Criteria) this;
        }

        public Criteria andAccountingQuantityTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCOUNTING_QUANTITY_TOTAL not between", value1, value2, "accountingQuantityTotal");
            return (Criteria) this;
        }

        public Criteria andQuantityOnHandIsNull() {
            addCriterion("QUANTITY_ON_HAND is null");
            return (Criteria) this;
        }

        public Criteria andQuantityOnHandIsNotNull() {
            addCriterion("QUANTITY_ON_HAND is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityOnHandEqualTo(BigDecimal value) {
            addCriterion("QUANTITY_ON_HAND =", value, "quantityOnHand");
            return (Criteria) this;
        }

        public Criteria andQuantityOnHandNotEqualTo(BigDecimal value) {
            addCriterion("QUANTITY_ON_HAND <>", value, "quantityOnHand");
            return (Criteria) this;
        }

        public Criteria andQuantityOnHandGreaterThan(BigDecimal value) {
            addCriterion("QUANTITY_ON_HAND >", value, "quantityOnHand");
            return (Criteria) this;
        }

        public Criteria andQuantityOnHandGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QUANTITY_ON_HAND >=", value, "quantityOnHand");
            return (Criteria) this;
        }

        public Criteria andQuantityOnHandLessThan(BigDecimal value) {
            addCriterion("QUANTITY_ON_HAND <", value, "quantityOnHand");
            return (Criteria) this;
        }

        public Criteria andQuantityOnHandLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QUANTITY_ON_HAND <=", value, "quantityOnHand");
            return (Criteria) this;
        }

        public Criteria andQuantityOnHandIn(List<BigDecimal> values) {
            addCriterion("QUANTITY_ON_HAND in", values, "quantityOnHand");
            return (Criteria) this;
        }

        public Criteria andQuantityOnHandNotIn(List<BigDecimal> values) {
            addCriterion("QUANTITY_ON_HAND not in", values, "quantityOnHand");
            return (Criteria) this;
        }

        public Criteria andQuantityOnHandBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QUANTITY_ON_HAND between", value1, value2, "quantityOnHand");
            return (Criteria) this;
        }

        public Criteria andQuantityOnHandNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QUANTITY_ON_HAND not between", value1, value2, "quantityOnHand");
            return (Criteria) this;
        }

        public Criteria andAvailableToPromiseIsNull() {
            addCriterion("AVAILABLE_TO_PROMISE is null");
            return (Criteria) this;
        }

        public Criteria andAvailableToPromiseIsNotNull() {
            addCriterion("AVAILABLE_TO_PROMISE is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableToPromiseEqualTo(BigDecimal value) {
            addCriterion("AVAILABLE_TO_PROMISE =", value, "availableToPromise");
            return (Criteria) this;
        }

        public Criteria andAvailableToPromiseNotEqualTo(BigDecimal value) {
            addCriterion("AVAILABLE_TO_PROMISE <>", value, "availableToPromise");
            return (Criteria) this;
        }

        public Criteria andAvailableToPromiseGreaterThan(BigDecimal value) {
            addCriterion("AVAILABLE_TO_PROMISE >", value, "availableToPromise");
            return (Criteria) this;
        }

        public Criteria andAvailableToPromiseGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AVAILABLE_TO_PROMISE >=", value, "availableToPromise");
            return (Criteria) this;
        }

        public Criteria andAvailableToPromiseLessThan(BigDecimal value) {
            addCriterion("AVAILABLE_TO_PROMISE <", value, "availableToPromise");
            return (Criteria) this;
        }

        public Criteria andAvailableToPromiseLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AVAILABLE_TO_PROMISE <=", value, "availableToPromise");
            return (Criteria) this;
        }

        public Criteria andAvailableToPromiseIn(List<BigDecimal> values) {
            addCriterion("AVAILABLE_TO_PROMISE in", values, "availableToPromise");
            return (Criteria) this;
        }

        public Criteria andAvailableToPromiseNotIn(List<BigDecimal> values) {
            addCriterion("AVAILABLE_TO_PROMISE not in", values, "availableToPromise");
            return (Criteria) this;
        }

        public Criteria andAvailableToPromiseBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AVAILABLE_TO_PROMISE between", value1, value2, "availableToPromise");
            return (Criteria) this;
        }

        public Criteria andAvailableToPromiseNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AVAILABLE_TO_PROMISE not between", value1, value2, "availableToPromise");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIsNull() {
            addCriterion("SERIAL_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIsNotNull() {
            addCriterion("SERIAL_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberEqualTo(String value) {
            addCriterion("SERIAL_NUMBER =", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotEqualTo(String value) {
            addCriterion("SERIAL_NUMBER <>", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThan(String value) {
            addCriterion("SERIAL_NUMBER >", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThanOrEqualTo(String value) {
            addCriterion("SERIAL_NUMBER >=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThan(String value) {
            addCriterion("SERIAL_NUMBER <", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThanOrEqualTo(String value) {
            addCriterion("SERIAL_NUMBER <=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLike(String value) {
            addCriterion("SERIAL_NUMBER like", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotLike(String value) {
            addCriterion("SERIAL_NUMBER not like", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIn(List<String> values) {
            addCriterion("SERIAL_NUMBER in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotIn(List<String> values) {
            addCriterion("SERIAL_NUMBER not in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberBetween(String value1, String value2) {
            addCriterion("SERIAL_NUMBER between", value1, value2, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotBetween(String value1, String value2) {
            addCriterion("SERIAL_NUMBER not between", value1, value2, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSoftIdentifierIsNull() {
            addCriterion("SOFT_IDENTIFIER is null");
            return (Criteria) this;
        }

        public Criteria andSoftIdentifierIsNotNull() {
            addCriterion("SOFT_IDENTIFIER is not null");
            return (Criteria) this;
        }

        public Criteria andSoftIdentifierEqualTo(String value) {
            addCriterion("SOFT_IDENTIFIER =", value, "softIdentifier");
            return (Criteria) this;
        }

        public Criteria andSoftIdentifierNotEqualTo(String value) {
            addCriterion("SOFT_IDENTIFIER <>", value, "softIdentifier");
            return (Criteria) this;
        }

        public Criteria andSoftIdentifierGreaterThan(String value) {
            addCriterion("SOFT_IDENTIFIER >", value, "softIdentifier");
            return (Criteria) this;
        }

        public Criteria andSoftIdentifierGreaterThanOrEqualTo(String value) {
            addCriterion("SOFT_IDENTIFIER >=", value, "softIdentifier");
            return (Criteria) this;
        }

        public Criteria andSoftIdentifierLessThan(String value) {
            addCriterion("SOFT_IDENTIFIER <", value, "softIdentifier");
            return (Criteria) this;
        }

        public Criteria andSoftIdentifierLessThanOrEqualTo(String value) {
            addCriterion("SOFT_IDENTIFIER <=", value, "softIdentifier");
            return (Criteria) this;
        }

        public Criteria andSoftIdentifierLike(String value) {
            addCriterion("SOFT_IDENTIFIER like", value, "softIdentifier");
            return (Criteria) this;
        }

        public Criteria andSoftIdentifierNotLike(String value) {
            addCriterion("SOFT_IDENTIFIER not like", value, "softIdentifier");
            return (Criteria) this;
        }

        public Criteria andSoftIdentifierIn(List<String> values) {
            addCriterion("SOFT_IDENTIFIER in", values, "softIdentifier");
            return (Criteria) this;
        }

        public Criteria andSoftIdentifierNotIn(List<String> values) {
            addCriterion("SOFT_IDENTIFIER not in", values, "softIdentifier");
            return (Criteria) this;
        }

        public Criteria andSoftIdentifierBetween(String value1, String value2) {
            addCriterion("SOFT_IDENTIFIER between", value1, value2, "softIdentifier");
            return (Criteria) this;
        }

        public Criteria andSoftIdentifierNotBetween(String value1, String value2) {
            addCriterion("SOFT_IDENTIFIER not between", value1, value2, "softIdentifier");
            return (Criteria) this;
        }

        public Criteria andActivationNumberIsNull() {
            addCriterion("ACTIVATION_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andActivationNumberIsNotNull() {
            addCriterion("ACTIVATION_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andActivationNumberEqualTo(String value) {
            addCriterion("ACTIVATION_NUMBER =", value, "activationNumber");
            return (Criteria) this;
        }

        public Criteria andActivationNumberNotEqualTo(String value) {
            addCriterion("ACTIVATION_NUMBER <>", value, "activationNumber");
            return (Criteria) this;
        }

        public Criteria andActivationNumberGreaterThan(String value) {
            addCriterion("ACTIVATION_NUMBER >", value, "activationNumber");
            return (Criteria) this;
        }

        public Criteria andActivationNumberGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIVATION_NUMBER >=", value, "activationNumber");
            return (Criteria) this;
        }

        public Criteria andActivationNumberLessThan(String value) {
            addCriterion("ACTIVATION_NUMBER <", value, "activationNumber");
            return (Criteria) this;
        }

        public Criteria andActivationNumberLessThanOrEqualTo(String value) {
            addCriterion("ACTIVATION_NUMBER <=", value, "activationNumber");
            return (Criteria) this;
        }

        public Criteria andActivationNumberLike(String value) {
            addCriterion("ACTIVATION_NUMBER like", value, "activationNumber");
            return (Criteria) this;
        }

        public Criteria andActivationNumberNotLike(String value) {
            addCriterion("ACTIVATION_NUMBER not like", value, "activationNumber");
            return (Criteria) this;
        }

        public Criteria andActivationNumberIn(List<String> values) {
            addCriterion("ACTIVATION_NUMBER in", values, "activationNumber");
            return (Criteria) this;
        }

        public Criteria andActivationNumberNotIn(List<String> values) {
            addCriterion("ACTIVATION_NUMBER not in", values, "activationNumber");
            return (Criteria) this;
        }

        public Criteria andActivationNumberBetween(String value1, String value2) {
            addCriterion("ACTIVATION_NUMBER between", value1, value2, "activationNumber");
            return (Criteria) this;
        }

        public Criteria andActivationNumberNotBetween(String value1, String value2) {
            addCriterion("ACTIVATION_NUMBER not between", value1, value2, "activationNumber");
            return (Criteria) this;
        }

        public Criteria andActivationValidThruIsNull() {
            addCriterion("ACTIVATION_VALID_THRU is null");
            return (Criteria) this;
        }

        public Criteria andActivationValidThruIsNotNull() {
            addCriterion("ACTIVATION_VALID_THRU is not null");
            return (Criteria) this;
        }

        public Criteria andActivationValidThruEqualTo(Date value) {
            addCriterion("ACTIVATION_VALID_THRU =", value, "activationValidThru");
            return (Criteria) this;
        }

        public Criteria andActivationValidThruNotEqualTo(Date value) {
            addCriterion("ACTIVATION_VALID_THRU <>", value, "activationValidThru");
            return (Criteria) this;
        }

        public Criteria andActivationValidThruGreaterThan(Date value) {
            addCriterion("ACTIVATION_VALID_THRU >", value, "activationValidThru");
            return (Criteria) this;
        }

        public Criteria andActivationValidThruGreaterThanOrEqualTo(Date value) {
            addCriterion("ACTIVATION_VALID_THRU >=", value, "activationValidThru");
            return (Criteria) this;
        }

        public Criteria andActivationValidThruLessThan(Date value) {
            addCriterion("ACTIVATION_VALID_THRU <", value, "activationValidThru");
            return (Criteria) this;
        }

        public Criteria andActivationValidThruLessThanOrEqualTo(Date value) {
            addCriterion("ACTIVATION_VALID_THRU <=", value, "activationValidThru");
            return (Criteria) this;
        }

        public Criteria andActivationValidThruIn(List<Date> values) {
            addCriterion("ACTIVATION_VALID_THRU in", values, "activationValidThru");
            return (Criteria) this;
        }

        public Criteria andActivationValidThruNotIn(List<Date> values) {
            addCriterion("ACTIVATION_VALID_THRU not in", values, "activationValidThru");
            return (Criteria) this;
        }

        public Criteria andActivationValidThruBetween(Date value1, Date value2) {
            addCriterion("ACTIVATION_VALID_THRU between", value1, value2, "activationValidThru");
            return (Criteria) this;
        }

        public Criteria andActivationValidThruNotBetween(Date value1, Date value2) {
            addCriterion("ACTIVATION_VALID_THRU not between", value1, value2, "activationValidThru");
            return (Criteria) this;
        }

        public Criteria andUnitCostIsNull() {
            addCriterion("UNIT_COST is null");
            return (Criteria) this;
        }

        public Criteria andUnitCostIsNotNull() {
            addCriterion("UNIT_COST is not null");
            return (Criteria) this;
        }

        public Criteria andUnitCostEqualTo(BigDecimal value) {
            addCriterion("UNIT_COST =", value, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostNotEqualTo(BigDecimal value) {
            addCriterion("UNIT_COST <>", value, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostGreaterThan(BigDecimal value) {
            addCriterion("UNIT_COST >", value, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UNIT_COST >=", value, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostLessThan(BigDecimal value) {
            addCriterion("UNIT_COST <", value, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UNIT_COST <=", value, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostIn(List<BigDecimal> values) {
            addCriterion("UNIT_COST in", values, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostNotIn(List<BigDecimal> values) {
            addCriterion("UNIT_COST not in", values, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNIT_COST between", value1, value2, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNIT_COST not between", value1, value2, "unitCost");
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

        public Criteria andFixedAssetIdIsNull() {
            addCriterion("FIXED_ASSET_ID is null");
            return (Criteria) this;
        }

        public Criteria andFixedAssetIdIsNotNull() {
            addCriterion("FIXED_ASSET_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFixedAssetIdEqualTo(String value) {
            addCriterion("FIXED_ASSET_ID =", value, "fixedAssetId");
            return (Criteria) this;
        }

        public Criteria andFixedAssetIdNotEqualTo(String value) {
            addCriterion("FIXED_ASSET_ID <>", value, "fixedAssetId");
            return (Criteria) this;
        }

        public Criteria andFixedAssetIdGreaterThan(String value) {
            addCriterion("FIXED_ASSET_ID >", value, "fixedAssetId");
            return (Criteria) this;
        }

        public Criteria andFixedAssetIdGreaterThanOrEqualTo(String value) {
            addCriterion("FIXED_ASSET_ID >=", value, "fixedAssetId");
            return (Criteria) this;
        }

        public Criteria andFixedAssetIdLessThan(String value) {
            addCriterion("FIXED_ASSET_ID <", value, "fixedAssetId");
            return (Criteria) this;
        }

        public Criteria andFixedAssetIdLessThanOrEqualTo(String value) {
            addCriterion("FIXED_ASSET_ID <=", value, "fixedAssetId");
            return (Criteria) this;
        }

        public Criteria andFixedAssetIdLike(String value) {
            addCriterion("FIXED_ASSET_ID like", value, "fixedAssetId");
            return (Criteria) this;
        }

        public Criteria andFixedAssetIdNotLike(String value) {
            addCriterion("FIXED_ASSET_ID not like", value, "fixedAssetId");
            return (Criteria) this;
        }

        public Criteria andFixedAssetIdIn(List<String> values) {
            addCriterion("FIXED_ASSET_ID in", values, "fixedAssetId");
            return (Criteria) this;
        }

        public Criteria andFixedAssetIdNotIn(List<String> values) {
            addCriterion("FIXED_ASSET_ID not in", values, "fixedAssetId");
            return (Criteria) this;
        }

        public Criteria andFixedAssetIdBetween(String value1, String value2) {
            addCriterion("FIXED_ASSET_ID between", value1, value2, "fixedAssetId");
            return (Criteria) this;
        }

        public Criteria andFixedAssetIdNotBetween(String value1, String value2) {
            addCriterion("FIXED_ASSET_ID not between", value1, value2, "fixedAssetId");
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