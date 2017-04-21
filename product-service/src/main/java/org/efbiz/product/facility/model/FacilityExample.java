package org.efbiz.product.facility.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FacilityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public FacilityExample() {
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

        public Criteria andFacilityTypeIdIsNull() {
            addCriterion("FACILITY_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andFacilityTypeIdIsNotNull() {
            addCriterion("FACILITY_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFacilityTypeIdEqualTo(String value) {
            addCriterion("FACILITY_TYPE_ID =", value, "facilityTypeId");
            return (Criteria) this;
        }

        public Criteria andFacilityTypeIdNotEqualTo(String value) {
            addCriterion("FACILITY_TYPE_ID <>", value, "facilityTypeId");
            return (Criteria) this;
        }

        public Criteria andFacilityTypeIdGreaterThan(String value) {
            addCriterion("FACILITY_TYPE_ID >", value, "facilityTypeId");
            return (Criteria) this;
        }

        public Criteria andFacilityTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("FACILITY_TYPE_ID >=", value, "facilityTypeId");
            return (Criteria) this;
        }

        public Criteria andFacilityTypeIdLessThan(String value) {
            addCriterion("FACILITY_TYPE_ID <", value, "facilityTypeId");
            return (Criteria) this;
        }

        public Criteria andFacilityTypeIdLessThanOrEqualTo(String value) {
            addCriterion("FACILITY_TYPE_ID <=", value, "facilityTypeId");
            return (Criteria) this;
        }

        public Criteria andFacilityTypeIdLike(String value) {
            addCriterion("FACILITY_TYPE_ID like", value, "facilityTypeId");
            return (Criteria) this;
        }

        public Criteria andFacilityTypeIdNotLike(String value) {
            addCriterion("FACILITY_TYPE_ID not like", value, "facilityTypeId");
            return (Criteria) this;
        }

        public Criteria andFacilityTypeIdIn(List<String> values) {
            addCriterion("FACILITY_TYPE_ID in", values, "facilityTypeId");
            return (Criteria) this;
        }

        public Criteria andFacilityTypeIdNotIn(List<String> values) {
            addCriterion("FACILITY_TYPE_ID not in", values, "facilityTypeId");
            return (Criteria) this;
        }

        public Criteria andFacilityTypeIdBetween(String value1, String value2) {
            addCriterion("FACILITY_TYPE_ID between", value1, value2, "facilityTypeId");
            return (Criteria) this;
        }

        public Criteria andFacilityTypeIdNotBetween(String value1, String value2) {
            addCriterion("FACILITY_TYPE_ID not between", value1, value2, "facilityTypeId");
            return (Criteria) this;
        }

        public Criteria andParentFacilityIdIsNull() {
            addCriterion("PARENT_FACILITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentFacilityIdIsNotNull() {
            addCriterion("PARENT_FACILITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentFacilityIdEqualTo(String value) {
            addCriterion("PARENT_FACILITY_ID =", value, "parentFacilityId");
            return (Criteria) this;
        }

        public Criteria andParentFacilityIdNotEqualTo(String value) {
            addCriterion("PARENT_FACILITY_ID <>", value, "parentFacilityId");
            return (Criteria) this;
        }

        public Criteria andParentFacilityIdGreaterThan(String value) {
            addCriterion("PARENT_FACILITY_ID >", value, "parentFacilityId");
            return (Criteria) this;
        }

        public Criteria andParentFacilityIdGreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_FACILITY_ID >=", value, "parentFacilityId");
            return (Criteria) this;
        }

        public Criteria andParentFacilityIdLessThan(String value) {
            addCriterion("PARENT_FACILITY_ID <", value, "parentFacilityId");
            return (Criteria) this;
        }

        public Criteria andParentFacilityIdLessThanOrEqualTo(String value) {
            addCriterion("PARENT_FACILITY_ID <=", value, "parentFacilityId");
            return (Criteria) this;
        }

        public Criteria andParentFacilityIdLike(String value) {
            addCriterion("PARENT_FACILITY_ID like", value, "parentFacilityId");
            return (Criteria) this;
        }

        public Criteria andParentFacilityIdNotLike(String value) {
            addCriterion("PARENT_FACILITY_ID not like", value, "parentFacilityId");
            return (Criteria) this;
        }

        public Criteria andParentFacilityIdIn(List<String> values) {
            addCriterion("PARENT_FACILITY_ID in", values, "parentFacilityId");
            return (Criteria) this;
        }

        public Criteria andParentFacilityIdNotIn(List<String> values) {
            addCriterion("PARENT_FACILITY_ID not in", values, "parentFacilityId");
            return (Criteria) this;
        }

        public Criteria andParentFacilityIdBetween(String value1, String value2) {
            addCriterion("PARENT_FACILITY_ID between", value1, value2, "parentFacilityId");
            return (Criteria) this;
        }

        public Criteria andParentFacilityIdNotBetween(String value1, String value2) {
            addCriterion("PARENT_FACILITY_ID not between", value1, value2, "parentFacilityId");
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

        public Criteria andDefaultInventoryItemTypeIdIsNull() {
            addCriterion("DEFAULT_INVENTORY_ITEM_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andDefaultInventoryItemTypeIdIsNotNull() {
            addCriterion("DEFAULT_INVENTORY_ITEM_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultInventoryItemTypeIdEqualTo(String value) {
            addCriterion("DEFAULT_INVENTORY_ITEM_TYPE_ID =", value, "defaultInventoryItemTypeId");
            return (Criteria) this;
        }

        public Criteria andDefaultInventoryItemTypeIdNotEqualTo(String value) {
            addCriterion("DEFAULT_INVENTORY_ITEM_TYPE_ID <>", value, "defaultInventoryItemTypeId");
            return (Criteria) this;
        }

        public Criteria andDefaultInventoryItemTypeIdGreaterThan(String value) {
            addCriterion("DEFAULT_INVENTORY_ITEM_TYPE_ID >", value, "defaultInventoryItemTypeId");
            return (Criteria) this;
        }

        public Criteria andDefaultInventoryItemTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEFAULT_INVENTORY_ITEM_TYPE_ID >=", value, "defaultInventoryItemTypeId");
            return (Criteria) this;
        }

        public Criteria andDefaultInventoryItemTypeIdLessThan(String value) {
            addCriterion("DEFAULT_INVENTORY_ITEM_TYPE_ID <", value, "defaultInventoryItemTypeId");
            return (Criteria) this;
        }

        public Criteria andDefaultInventoryItemTypeIdLessThanOrEqualTo(String value) {
            addCriterion("DEFAULT_INVENTORY_ITEM_TYPE_ID <=", value, "defaultInventoryItemTypeId");
            return (Criteria) this;
        }

        public Criteria andDefaultInventoryItemTypeIdLike(String value) {
            addCriterion("DEFAULT_INVENTORY_ITEM_TYPE_ID like", value, "defaultInventoryItemTypeId");
            return (Criteria) this;
        }

        public Criteria andDefaultInventoryItemTypeIdNotLike(String value) {
            addCriterion("DEFAULT_INVENTORY_ITEM_TYPE_ID not like", value, "defaultInventoryItemTypeId");
            return (Criteria) this;
        }

        public Criteria andDefaultInventoryItemTypeIdIn(List<String> values) {
            addCriterion("DEFAULT_INVENTORY_ITEM_TYPE_ID in", values, "defaultInventoryItemTypeId");
            return (Criteria) this;
        }

        public Criteria andDefaultInventoryItemTypeIdNotIn(List<String> values) {
            addCriterion("DEFAULT_INVENTORY_ITEM_TYPE_ID not in", values, "defaultInventoryItemTypeId");
            return (Criteria) this;
        }

        public Criteria andDefaultInventoryItemTypeIdBetween(String value1, String value2) {
            addCriterion("DEFAULT_INVENTORY_ITEM_TYPE_ID between", value1, value2, "defaultInventoryItemTypeId");
            return (Criteria) this;
        }

        public Criteria andDefaultInventoryItemTypeIdNotBetween(String value1, String value2) {
            addCriterion("DEFAULT_INVENTORY_ITEM_TYPE_ID not between", value1, value2, "defaultInventoryItemTypeId");
            return (Criteria) this;
        }

        public Criteria andFacilityNameIsNull() {
            addCriterion("FACILITY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFacilityNameIsNotNull() {
            addCriterion("FACILITY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFacilityNameEqualTo(String value) {
            addCriterion("FACILITY_NAME =", value, "facilityName");
            return (Criteria) this;
        }

        public Criteria andFacilityNameNotEqualTo(String value) {
            addCriterion("FACILITY_NAME <>", value, "facilityName");
            return (Criteria) this;
        }

        public Criteria andFacilityNameGreaterThan(String value) {
            addCriterion("FACILITY_NAME >", value, "facilityName");
            return (Criteria) this;
        }

        public Criteria andFacilityNameGreaterThanOrEqualTo(String value) {
            addCriterion("FACILITY_NAME >=", value, "facilityName");
            return (Criteria) this;
        }

        public Criteria andFacilityNameLessThan(String value) {
            addCriterion("FACILITY_NAME <", value, "facilityName");
            return (Criteria) this;
        }

        public Criteria andFacilityNameLessThanOrEqualTo(String value) {
            addCriterion("FACILITY_NAME <=", value, "facilityName");
            return (Criteria) this;
        }

        public Criteria andFacilityNameLike(String value) {
            addCriterion("FACILITY_NAME like", value, "facilityName");
            return (Criteria) this;
        }

        public Criteria andFacilityNameNotLike(String value) {
            addCriterion("FACILITY_NAME not like", value, "facilityName");
            return (Criteria) this;
        }

        public Criteria andFacilityNameIn(List<String> values) {
            addCriterion("FACILITY_NAME in", values, "facilityName");
            return (Criteria) this;
        }

        public Criteria andFacilityNameNotIn(List<String> values) {
            addCriterion("FACILITY_NAME not in", values, "facilityName");
            return (Criteria) this;
        }

        public Criteria andFacilityNameBetween(String value1, String value2) {
            addCriterion("FACILITY_NAME between", value1, value2, "facilityName");
            return (Criteria) this;
        }

        public Criteria andFacilityNameNotBetween(String value1, String value2) {
            addCriterion("FACILITY_NAME not between", value1, value2, "facilityName");
            return (Criteria) this;
        }

        public Criteria andPrimaryFacilityGroupIdIsNull() {
            addCriterion("PRIMARY_FACILITY_GROUP_ID is null");
            return (Criteria) this;
        }

        public Criteria andPrimaryFacilityGroupIdIsNotNull() {
            addCriterion("PRIMARY_FACILITY_GROUP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPrimaryFacilityGroupIdEqualTo(String value) {
            addCriterion("PRIMARY_FACILITY_GROUP_ID =", value, "primaryFacilityGroupId");
            return (Criteria) this;
        }

        public Criteria andPrimaryFacilityGroupIdNotEqualTo(String value) {
            addCriterion("PRIMARY_FACILITY_GROUP_ID <>", value, "primaryFacilityGroupId");
            return (Criteria) this;
        }

        public Criteria andPrimaryFacilityGroupIdGreaterThan(String value) {
            addCriterion("PRIMARY_FACILITY_GROUP_ID >", value, "primaryFacilityGroupId");
            return (Criteria) this;
        }

        public Criteria andPrimaryFacilityGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRIMARY_FACILITY_GROUP_ID >=", value, "primaryFacilityGroupId");
            return (Criteria) this;
        }

        public Criteria andPrimaryFacilityGroupIdLessThan(String value) {
            addCriterion("PRIMARY_FACILITY_GROUP_ID <", value, "primaryFacilityGroupId");
            return (Criteria) this;
        }

        public Criteria andPrimaryFacilityGroupIdLessThanOrEqualTo(String value) {
            addCriterion("PRIMARY_FACILITY_GROUP_ID <=", value, "primaryFacilityGroupId");
            return (Criteria) this;
        }

        public Criteria andPrimaryFacilityGroupIdLike(String value) {
            addCriterion("PRIMARY_FACILITY_GROUP_ID like", value, "primaryFacilityGroupId");
            return (Criteria) this;
        }

        public Criteria andPrimaryFacilityGroupIdNotLike(String value) {
            addCriterion("PRIMARY_FACILITY_GROUP_ID not like", value, "primaryFacilityGroupId");
            return (Criteria) this;
        }

        public Criteria andPrimaryFacilityGroupIdIn(List<String> values) {
            addCriterion("PRIMARY_FACILITY_GROUP_ID in", values, "primaryFacilityGroupId");
            return (Criteria) this;
        }

        public Criteria andPrimaryFacilityGroupIdNotIn(List<String> values) {
            addCriterion("PRIMARY_FACILITY_GROUP_ID not in", values, "primaryFacilityGroupId");
            return (Criteria) this;
        }

        public Criteria andPrimaryFacilityGroupIdBetween(String value1, String value2) {
            addCriterion("PRIMARY_FACILITY_GROUP_ID between", value1, value2, "primaryFacilityGroupId");
            return (Criteria) this;
        }

        public Criteria andPrimaryFacilityGroupIdNotBetween(String value1, String value2) {
            addCriterion("PRIMARY_FACILITY_GROUP_ID not between", value1, value2, "primaryFacilityGroupId");
            return (Criteria) this;
        }

        public Criteria andSquareFootageIsNull() {
            addCriterion("SQUARE_FOOTAGE is null");
            return (Criteria) this;
        }

        public Criteria andSquareFootageIsNotNull() {
            addCriterion("SQUARE_FOOTAGE is not null");
            return (Criteria) this;
        }

        public Criteria andSquareFootageEqualTo(BigDecimal value) {
            addCriterion("SQUARE_FOOTAGE =", value, "squareFootage");
            return (Criteria) this;
        }

        public Criteria andSquareFootageNotEqualTo(BigDecimal value) {
            addCriterion("SQUARE_FOOTAGE <>", value, "squareFootage");
            return (Criteria) this;
        }

        public Criteria andSquareFootageGreaterThan(BigDecimal value) {
            addCriterion("SQUARE_FOOTAGE >", value, "squareFootage");
            return (Criteria) this;
        }

        public Criteria andSquareFootageGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SQUARE_FOOTAGE >=", value, "squareFootage");
            return (Criteria) this;
        }

        public Criteria andSquareFootageLessThan(BigDecimal value) {
            addCriterion("SQUARE_FOOTAGE <", value, "squareFootage");
            return (Criteria) this;
        }

        public Criteria andSquareFootageLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SQUARE_FOOTAGE <=", value, "squareFootage");
            return (Criteria) this;
        }

        public Criteria andSquareFootageIn(List<BigDecimal> values) {
            addCriterion("SQUARE_FOOTAGE in", values, "squareFootage");
            return (Criteria) this;
        }

        public Criteria andSquareFootageNotIn(List<BigDecimal> values) {
            addCriterion("SQUARE_FOOTAGE not in", values, "squareFootage");
            return (Criteria) this;
        }

        public Criteria andSquareFootageBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SQUARE_FOOTAGE between", value1, value2, "squareFootage");
            return (Criteria) this;
        }

        public Criteria andSquareFootageNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SQUARE_FOOTAGE not between", value1, value2, "squareFootage");
            return (Criteria) this;
        }

        public Criteria andFacilitySizeIsNull() {
            addCriterion("FACILITY_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andFacilitySizeIsNotNull() {
            addCriterion("FACILITY_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andFacilitySizeEqualTo(BigDecimal value) {
            addCriterion("FACILITY_SIZE =", value, "facilitySize");
            return (Criteria) this;
        }

        public Criteria andFacilitySizeNotEqualTo(BigDecimal value) {
            addCriterion("FACILITY_SIZE <>", value, "facilitySize");
            return (Criteria) this;
        }

        public Criteria andFacilitySizeGreaterThan(BigDecimal value) {
            addCriterion("FACILITY_SIZE >", value, "facilitySize");
            return (Criteria) this;
        }

        public Criteria andFacilitySizeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FACILITY_SIZE >=", value, "facilitySize");
            return (Criteria) this;
        }

        public Criteria andFacilitySizeLessThan(BigDecimal value) {
            addCriterion("FACILITY_SIZE <", value, "facilitySize");
            return (Criteria) this;
        }

        public Criteria andFacilitySizeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FACILITY_SIZE <=", value, "facilitySize");
            return (Criteria) this;
        }

        public Criteria andFacilitySizeIn(List<BigDecimal> values) {
            addCriterion("FACILITY_SIZE in", values, "facilitySize");
            return (Criteria) this;
        }

        public Criteria andFacilitySizeNotIn(List<BigDecimal> values) {
            addCriterion("FACILITY_SIZE not in", values, "facilitySize");
            return (Criteria) this;
        }

        public Criteria andFacilitySizeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FACILITY_SIZE between", value1, value2, "facilitySize");
            return (Criteria) this;
        }

        public Criteria andFacilitySizeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FACILITY_SIZE not between", value1, value2, "facilitySize");
            return (Criteria) this;
        }

        public Criteria andFacilitySizeUomIdIsNull() {
            addCriterion("FACILITY_SIZE_UOM_ID is null");
            return (Criteria) this;
        }

        public Criteria andFacilitySizeUomIdIsNotNull() {
            addCriterion("FACILITY_SIZE_UOM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFacilitySizeUomIdEqualTo(String value) {
            addCriterion("FACILITY_SIZE_UOM_ID =", value, "facilitySizeUomId");
            return (Criteria) this;
        }

        public Criteria andFacilitySizeUomIdNotEqualTo(String value) {
            addCriterion("FACILITY_SIZE_UOM_ID <>", value, "facilitySizeUomId");
            return (Criteria) this;
        }

        public Criteria andFacilitySizeUomIdGreaterThan(String value) {
            addCriterion("FACILITY_SIZE_UOM_ID >", value, "facilitySizeUomId");
            return (Criteria) this;
        }

        public Criteria andFacilitySizeUomIdGreaterThanOrEqualTo(String value) {
            addCriterion("FACILITY_SIZE_UOM_ID >=", value, "facilitySizeUomId");
            return (Criteria) this;
        }

        public Criteria andFacilitySizeUomIdLessThan(String value) {
            addCriterion("FACILITY_SIZE_UOM_ID <", value, "facilitySizeUomId");
            return (Criteria) this;
        }

        public Criteria andFacilitySizeUomIdLessThanOrEqualTo(String value) {
            addCriterion("FACILITY_SIZE_UOM_ID <=", value, "facilitySizeUomId");
            return (Criteria) this;
        }

        public Criteria andFacilitySizeUomIdLike(String value) {
            addCriterion("FACILITY_SIZE_UOM_ID like", value, "facilitySizeUomId");
            return (Criteria) this;
        }

        public Criteria andFacilitySizeUomIdNotLike(String value) {
            addCriterion("FACILITY_SIZE_UOM_ID not like", value, "facilitySizeUomId");
            return (Criteria) this;
        }

        public Criteria andFacilitySizeUomIdIn(List<String> values) {
            addCriterion("FACILITY_SIZE_UOM_ID in", values, "facilitySizeUomId");
            return (Criteria) this;
        }

        public Criteria andFacilitySizeUomIdNotIn(List<String> values) {
            addCriterion("FACILITY_SIZE_UOM_ID not in", values, "facilitySizeUomId");
            return (Criteria) this;
        }

        public Criteria andFacilitySizeUomIdBetween(String value1, String value2) {
            addCriterion("FACILITY_SIZE_UOM_ID between", value1, value2, "facilitySizeUomId");
            return (Criteria) this;
        }

        public Criteria andFacilitySizeUomIdNotBetween(String value1, String value2) {
            addCriterion("FACILITY_SIZE_UOM_ID not between", value1, value2, "facilitySizeUomId");
            return (Criteria) this;
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

        public Criteria andDefaultDaysToShipIsNull() {
            addCriterion("DEFAULT_DAYS_TO_SHIP is null");
            return (Criteria) this;
        }

        public Criteria andDefaultDaysToShipIsNotNull() {
            addCriterion("DEFAULT_DAYS_TO_SHIP is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultDaysToShipEqualTo(BigDecimal value) {
            addCriterion("DEFAULT_DAYS_TO_SHIP =", value, "defaultDaysToShip");
            return (Criteria) this;
        }

        public Criteria andDefaultDaysToShipNotEqualTo(BigDecimal value) {
            addCriterion("DEFAULT_DAYS_TO_SHIP <>", value, "defaultDaysToShip");
            return (Criteria) this;
        }

        public Criteria andDefaultDaysToShipGreaterThan(BigDecimal value) {
            addCriterion("DEFAULT_DAYS_TO_SHIP >", value, "defaultDaysToShip");
            return (Criteria) this;
        }

        public Criteria andDefaultDaysToShipGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DEFAULT_DAYS_TO_SHIP >=", value, "defaultDaysToShip");
            return (Criteria) this;
        }

        public Criteria andDefaultDaysToShipLessThan(BigDecimal value) {
            addCriterion("DEFAULT_DAYS_TO_SHIP <", value, "defaultDaysToShip");
            return (Criteria) this;
        }

        public Criteria andDefaultDaysToShipLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DEFAULT_DAYS_TO_SHIP <=", value, "defaultDaysToShip");
            return (Criteria) this;
        }

        public Criteria andDefaultDaysToShipIn(List<BigDecimal> values) {
            addCriterion("DEFAULT_DAYS_TO_SHIP in", values, "defaultDaysToShip");
            return (Criteria) this;
        }

        public Criteria andDefaultDaysToShipNotIn(List<BigDecimal> values) {
            addCriterion("DEFAULT_DAYS_TO_SHIP not in", values, "defaultDaysToShip");
            return (Criteria) this;
        }

        public Criteria andDefaultDaysToShipBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEFAULT_DAYS_TO_SHIP between", value1, value2, "defaultDaysToShip");
            return (Criteria) this;
        }

        public Criteria andDefaultDaysToShipNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEFAULT_DAYS_TO_SHIP not between", value1, value2, "defaultDaysToShip");
            return (Criteria) this;
        }

        public Criteria andOpenedDateIsNull() {
            addCriterion("OPENED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andOpenedDateIsNotNull() {
            addCriterion("OPENED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andOpenedDateEqualTo(Date value) {
            addCriterion("OPENED_DATE =", value, "openedDate");
            return (Criteria) this;
        }

        public Criteria andOpenedDateNotEqualTo(Date value) {
            addCriterion("OPENED_DATE <>", value, "openedDate");
            return (Criteria) this;
        }

        public Criteria andOpenedDateGreaterThan(Date value) {
            addCriterion("OPENED_DATE >", value, "openedDate");
            return (Criteria) this;
        }

        public Criteria andOpenedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("OPENED_DATE >=", value, "openedDate");
            return (Criteria) this;
        }

        public Criteria andOpenedDateLessThan(Date value) {
            addCriterion("OPENED_DATE <", value, "openedDate");
            return (Criteria) this;
        }

        public Criteria andOpenedDateLessThanOrEqualTo(Date value) {
            addCriterion("OPENED_DATE <=", value, "openedDate");
            return (Criteria) this;
        }

        public Criteria andOpenedDateIn(List<Date> values) {
            addCriterion("OPENED_DATE in", values, "openedDate");
            return (Criteria) this;
        }

        public Criteria andOpenedDateNotIn(List<Date> values) {
            addCriterion("OPENED_DATE not in", values, "openedDate");
            return (Criteria) this;
        }

        public Criteria andOpenedDateBetween(Date value1, Date value2) {
            addCriterion("OPENED_DATE between", value1, value2, "openedDate");
            return (Criteria) this;
        }

        public Criteria andOpenedDateNotBetween(Date value1, Date value2) {
            addCriterion("OPENED_DATE not between", value1, value2, "openedDate");
            return (Criteria) this;
        }

        public Criteria andClosedDateIsNull() {
            addCriterion("CLOSED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andClosedDateIsNotNull() {
            addCriterion("CLOSED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andClosedDateEqualTo(Date value) {
            addCriterion("CLOSED_DATE =", value, "closedDate");
            return (Criteria) this;
        }

        public Criteria andClosedDateNotEqualTo(Date value) {
            addCriterion("CLOSED_DATE <>", value, "closedDate");
            return (Criteria) this;
        }

        public Criteria andClosedDateGreaterThan(Date value) {
            addCriterion("CLOSED_DATE >", value, "closedDate");
            return (Criteria) this;
        }

        public Criteria andClosedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CLOSED_DATE >=", value, "closedDate");
            return (Criteria) this;
        }

        public Criteria andClosedDateLessThan(Date value) {
            addCriterion("CLOSED_DATE <", value, "closedDate");
            return (Criteria) this;
        }

        public Criteria andClosedDateLessThanOrEqualTo(Date value) {
            addCriterion("CLOSED_DATE <=", value, "closedDate");
            return (Criteria) this;
        }

        public Criteria andClosedDateIn(List<Date> values) {
            addCriterion("CLOSED_DATE in", values, "closedDate");
            return (Criteria) this;
        }

        public Criteria andClosedDateNotIn(List<Date> values) {
            addCriterion("CLOSED_DATE not in", values, "closedDate");
            return (Criteria) this;
        }

        public Criteria andClosedDateBetween(Date value1, Date value2) {
            addCriterion("CLOSED_DATE between", value1, value2, "closedDate");
            return (Criteria) this;
        }

        public Criteria andClosedDateNotBetween(Date value1, Date value2) {
            addCriterion("CLOSED_DATE not between", value1, value2, "closedDate");
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

        public Criteria andDefaultDimensionUomIdIsNull() {
            addCriterion("DEFAULT_DIMENSION_UOM_ID is null");
            return (Criteria) this;
        }

        public Criteria andDefaultDimensionUomIdIsNotNull() {
            addCriterion("DEFAULT_DIMENSION_UOM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultDimensionUomIdEqualTo(String value) {
            addCriterion("DEFAULT_DIMENSION_UOM_ID =", value, "defaultDimensionUomId");
            return (Criteria) this;
        }

        public Criteria andDefaultDimensionUomIdNotEqualTo(String value) {
            addCriterion("DEFAULT_DIMENSION_UOM_ID <>", value, "defaultDimensionUomId");
            return (Criteria) this;
        }

        public Criteria andDefaultDimensionUomIdGreaterThan(String value) {
            addCriterion("DEFAULT_DIMENSION_UOM_ID >", value, "defaultDimensionUomId");
            return (Criteria) this;
        }

        public Criteria andDefaultDimensionUomIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEFAULT_DIMENSION_UOM_ID >=", value, "defaultDimensionUomId");
            return (Criteria) this;
        }

        public Criteria andDefaultDimensionUomIdLessThan(String value) {
            addCriterion("DEFAULT_DIMENSION_UOM_ID <", value, "defaultDimensionUomId");
            return (Criteria) this;
        }

        public Criteria andDefaultDimensionUomIdLessThanOrEqualTo(String value) {
            addCriterion("DEFAULT_DIMENSION_UOM_ID <=", value, "defaultDimensionUomId");
            return (Criteria) this;
        }

        public Criteria andDefaultDimensionUomIdLike(String value) {
            addCriterion("DEFAULT_DIMENSION_UOM_ID like", value, "defaultDimensionUomId");
            return (Criteria) this;
        }

        public Criteria andDefaultDimensionUomIdNotLike(String value) {
            addCriterion("DEFAULT_DIMENSION_UOM_ID not like", value, "defaultDimensionUomId");
            return (Criteria) this;
        }

        public Criteria andDefaultDimensionUomIdIn(List<String> values) {
            addCriterion("DEFAULT_DIMENSION_UOM_ID in", values, "defaultDimensionUomId");
            return (Criteria) this;
        }

        public Criteria andDefaultDimensionUomIdNotIn(List<String> values) {
            addCriterion("DEFAULT_DIMENSION_UOM_ID not in", values, "defaultDimensionUomId");
            return (Criteria) this;
        }

        public Criteria andDefaultDimensionUomIdBetween(String value1, String value2) {
            addCriterion("DEFAULT_DIMENSION_UOM_ID between", value1, value2, "defaultDimensionUomId");
            return (Criteria) this;
        }

        public Criteria andDefaultDimensionUomIdNotBetween(String value1, String value2) {
            addCriterion("DEFAULT_DIMENSION_UOM_ID not between", value1, value2, "defaultDimensionUomId");
            return (Criteria) this;
        }

        public Criteria andDefaultWeightUomIdIsNull() {
            addCriterion("DEFAULT_WEIGHT_UOM_ID is null");
            return (Criteria) this;
        }

        public Criteria andDefaultWeightUomIdIsNotNull() {
            addCriterion("DEFAULT_WEIGHT_UOM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultWeightUomIdEqualTo(String value) {
            addCriterion("DEFAULT_WEIGHT_UOM_ID =", value, "defaultWeightUomId");
            return (Criteria) this;
        }

        public Criteria andDefaultWeightUomIdNotEqualTo(String value) {
            addCriterion("DEFAULT_WEIGHT_UOM_ID <>", value, "defaultWeightUomId");
            return (Criteria) this;
        }

        public Criteria andDefaultWeightUomIdGreaterThan(String value) {
            addCriterion("DEFAULT_WEIGHT_UOM_ID >", value, "defaultWeightUomId");
            return (Criteria) this;
        }

        public Criteria andDefaultWeightUomIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEFAULT_WEIGHT_UOM_ID >=", value, "defaultWeightUomId");
            return (Criteria) this;
        }

        public Criteria andDefaultWeightUomIdLessThan(String value) {
            addCriterion("DEFAULT_WEIGHT_UOM_ID <", value, "defaultWeightUomId");
            return (Criteria) this;
        }

        public Criteria andDefaultWeightUomIdLessThanOrEqualTo(String value) {
            addCriterion("DEFAULT_WEIGHT_UOM_ID <=", value, "defaultWeightUomId");
            return (Criteria) this;
        }

        public Criteria andDefaultWeightUomIdLike(String value) {
            addCriterion("DEFAULT_WEIGHT_UOM_ID like", value, "defaultWeightUomId");
            return (Criteria) this;
        }

        public Criteria andDefaultWeightUomIdNotLike(String value) {
            addCriterion("DEFAULT_WEIGHT_UOM_ID not like", value, "defaultWeightUomId");
            return (Criteria) this;
        }

        public Criteria andDefaultWeightUomIdIn(List<String> values) {
            addCriterion("DEFAULT_WEIGHT_UOM_ID in", values, "defaultWeightUomId");
            return (Criteria) this;
        }

        public Criteria andDefaultWeightUomIdNotIn(List<String> values) {
            addCriterion("DEFAULT_WEIGHT_UOM_ID not in", values, "defaultWeightUomId");
            return (Criteria) this;
        }

        public Criteria andDefaultWeightUomIdBetween(String value1, String value2) {
            addCriterion("DEFAULT_WEIGHT_UOM_ID between", value1, value2, "defaultWeightUomId");
            return (Criteria) this;
        }

        public Criteria andDefaultWeightUomIdNotBetween(String value1, String value2) {
            addCriterion("DEFAULT_WEIGHT_UOM_ID not between", value1, value2, "defaultWeightUomId");
            return (Criteria) this;
        }

        public Criteria andGeoPointIdIsNull() {
            addCriterion("GEO_POINT_ID is null");
            return (Criteria) this;
        }

        public Criteria andGeoPointIdIsNotNull() {
            addCriterion("GEO_POINT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGeoPointIdEqualTo(String value) {
            addCriterion("GEO_POINT_ID =", value, "geoPointId");
            return (Criteria) this;
        }

        public Criteria andGeoPointIdNotEqualTo(String value) {
            addCriterion("GEO_POINT_ID <>", value, "geoPointId");
            return (Criteria) this;
        }

        public Criteria andGeoPointIdGreaterThan(String value) {
            addCriterion("GEO_POINT_ID >", value, "geoPointId");
            return (Criteria) this;
        }

        public Criteria andGeoPointIdGreaterThanOrEqualTo(String value) {
            addCriterion("GEO_POINT_ID >=", value, "geoPointId");
            return (Criteria) this;
        }

        public Criteria andGeoPointIdLessThan(String value) {
            addCriterion("GEO_POINT_ID <", value, "geoPointId");
            return (Criteria) this;
        }

        public Criteria andGeoPointIdLessThanOrEqualTo(String value) {
            addCriterion("GEO_POINT_ID <=", value, "geoPointId");
            return (Criteria) this;
        }

        public Criteria andGeoPointIdLike(String value) {
            addCriterion("GEO_POINT_ID like", value, "geoPointId");
            return (Criteria) this;
        }

        public Criteria andGeoPointIdNotLike(String value) {
            addCriterion("GEO_POINT_ID not like", value, "geoPointId");
            return (Criteria) this;
        }

        public Criteria andGeoPointIdIn(List<String> values) {
            addCriterion("GEO_POINT_ID in", values, "geoPointId");
            return (Criteria) this;
        }

        public Criteria andGeoPointIdNotIn(List<String> values) {
            addCriterion("GEO_POINT_ID not in", values, "geoPointId");
            return (Criteria) this;
        }

        public Criteria andGeoPointIdBetween(String value1, String value2) {
            addCriterion("GEO_POINT_ID between", value1, value2, "geoPointId");
            return (Criteria) this;
        }

        public Criteria andGeoPointIdNotBetween(String value1, String value2) {
            addCriterion("GEO_POINT_ID not between", value1, value2, "geoPointId");
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