package org.efbiz.product.inventory.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InventoryTransferExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public InventoryTransferExample() {
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

        public Criteria andInventoryTransferIdIsNull() {
            addCriterion("INVENTORY_TRANSFER_ID is null");
            return (Criteria) this;
        }

        public Criteria andInventoryTransferIdIsNotNull() {
            addCriterion("INVENTORY_TRANSFER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryTransferIdEqualTo(String value) {
            addCriterion("INVENTORY_TRANSFER_ID =", value, "inventoryTransferId");
            return (Criteria) this;
        }

        public Criteria andInventoryTransferIdNotEqualTo(String value) {
            addCriterion("INVENTORY_TRANSFER_ID <>", value, "inventoryTransferId");
            return (Criteria) this;
        }

        public Criteria andInventoryTransferIdGreaterThan(String value) {
            addCriterion("INVENTORY_TRANSFER_ID >", value, "inventoryTransferId");
            return (Criteria) this;
        }

        public Criteria andInventoryTransferIdGreaterThanOrEqualTo(String value) {
            addCriterion("INVENTORY_TRANSFER_ID >=", value, "inventoryTransferId");
            return (Criteria) this;
        }

        public Criteria andInventoryTransferIdLessThan(String value) {
            addCriterion("INVENTORY_TRANSFER_ID <", value, "inventoryTransferId");
            return (Criteria) this;
        }

        public Criteria andInventoryTransferIdLessThanOrEqualTo(String value) {
            addCriterion("INVENTORY_TRANSFER_ID <=", value, "inventoryTransferId");
            return (Criteria) this;
        }

        public Criteria andInventoryTransferIdLike(String value) {
            addCriterion("INVENTORY_TRANSFER_ID like", value, "inventoryTransferId");
            return (Criteria) this;
        }

        public Criteria andInventoryTransferIdNotLike(String value) {
            addCriterion("INVENTORY_TRANSFER_ID not like", value, "inventoryTransferId");
            return (Criteria) this;
        }

        public Criteria andInventoryTransferIdIn(List<String> values) {
            addCriterion("INVENTORY_TRANSFER_ID in", values, "inventoryTransferId");
            return (Criteria) this;
        }

        public Criteria andInventoryTransferIdNotIn(List<String> values) {
            addCriterion("INVENTORY_TRANSFER_ID not in", values, "inventoryTransferId");
            return (Criteria) this;
        }

        public Criteria andInventoryTransferIdBetween(String value1, String value2) {
            addCriterion("INVENTORY_TRANSFER_ID between", value1, value2, "inventoryTransferId");
            return (Criteria) this;
        }

        public Criteria andInventoryTransferIdNotBetween(String value1, String value2) {
            addCriterion("INVENTORY_TRANSFER_ID not between", value1, value2, "inventoryTransferId");
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

        public Criteria andFacilityIdToIsNull() {
            addCriterion("FACILITY_ID_TO is null");
            return (Criteria) this;
        }

        public Criteria andFacilityIdToIsNotNull() {
            addCriterion("FACILITY_ID_TO is not null");
            return (Criteria) this;
        }

        public Criteria andFacilityIdToEqualTo(String value) {
            addCriterion("FACILITY_ID_TO =", value, "facilityIdTo");
            return (Criteria) this;
        }

        public Criteria andFacilityIdToNotEqualTo(String value) {
            addCriterion("FACILITY_ID_TO <>", value, "facilityIdTo");
            return (Criteria) this;
        }

        public Criteria andFacilityIdToGreaterThan(String value) {
            addCriterion("FACILITY_ID_TO >", value, "facilityIdTo");
            return (Criteria) this;
        }

        public Criteria andFacilityIdToGreaterThanOrEqualTo(String value) {
            addCriterion("FACILITY_ID_TO >=", value, "facilityIdTo");
            return (Criteria) this;
        }

        public Criteria andFacilityIdToLessThan(String value) {
            addCriterion("FACILITY_ID_TO <", value, "facilityIdTo");
            return (Criteria) this;
        }

        public Criteria andFacilityIdToLessThanOrEqualTo(String value) {
            addCriterion("FACILITY_ID_TO <=", value, "facilityIdTo");
            return (Criteria) this;
        }

        public Criteria andFacilityIdToLike(String value) {
            addCriterion("FACILITY_ID_TO like", value, "facilityIdTo");
            return (Criteria) this;
        }

        public Criteria andFacilityIdToNotLike(String value) {
            addCriterion("FACILITY_ID_TO not like", value, "facilityIdTo");
            return (Criteria) this;
        }

        public Criteria andFacilityIdToIn(List<String> values) {
            addCriterion("FACILITY_ID_TO in", values, "facilityIdTo");
            return (Criteria) this;
        }

        public Criteria andFacilityIdToNotIn(List<String> values) {
            addCriterion("FACILITY_ID_TO not in", values, "facilityIdTo");
            return (Criteria) this;
        }

        public Criteria andFacilityIdToBetween(String value1, String value2) {
            addCriterion("FACILITY_ID_TO between", value1, value2, "facilityIdTo");
            return (Criteria) this;
        }

        public Criteria andFacilityIdToNotBetween(String value1, String value2) {
            addCriterion("FACILITY_ID_TO not between", value1, value2, "facilityIdTo");
            return (Criteria) this;
        }

        public Criteria andLocationSeqIdToIsNull() {
            addCriterion("LOCATION_SEQ_ID_TO is null");
            return (Criteria) this;
        }

        public Criteria andLocationSeqIdToIsNotNull() {
            addCriterion("LOCATION_SEQ_ID_TO is not null");
            return (Criteria) this;
        }

        public Criteria andLocationSeqIdToEqualTo(String value) {
            addCriterion("LOCATION_SEQ_ID_TO =", value, "locationSeqIdTo");
            return (Criteria) this;
        }

        public Criteria andLocationSeqIdToNotEqualTo(String value) {
            addCriterion("LOCATION_SEQ_ID_TO <>", value, "locationSeqIdTo");
            return (Criteria) this;
        }

        public Criteria andLocationSeqIdToGreaterThan(String value) {
            addCriterion("LOCATION_SEQ_ID_TO >", value, "locationSeqIdTo");
            return (Criteria) this;
        }

        public Criteria andLocationSeqIdToGreaterThanOrEqualTo(String value) {
            addCriterion("LOCATION_SEQ_ID_TO >=", value, "locationSeqIdTo");
            return (Criteria) this;
        }

        public Criteria andLocationSeqIdToLessThan(String value) {
            addCriterion("LOCATION_SEQ_ID_TO <", value, "locationSeqIdTo");
            return (Criteria) this;
        }

        public Criteria andLocationSeqIdToLessThanOrEqualTo(String value) {
            addCriterion("LOCATION_SEQ_ID_TO <=", value, "locationSeqIdTo");
            return (Criteria) this;
        }

        public Criteria andLocationSeqIdToLike(String value) {
            addCriterion("LOCATION_SEQ_ID_TO like", value, "locationSeqIdTo");
            return (Criteria) this;
        }

        public Criteria andLocationSeqIdToNotLike(String value) {
            addCriterion("LOCATION_SEQ_ID_TO not like", value, "locationSeqIdTo");
            return (Criteria) this;
        }

        public Criteria andLocationSeqIdToIn(List<String> values) {
            addCriterion("LOCATION_SEQ_ID_TO in", values, "locationSeqIdTo");
            return (Criteria) this;
        }

        public Criteria andLocationSeqIdToNotIn(List<String> values) {
            addCriterion("LOCATION_SEQ_ID_TO not in", values, "locationSeqIdTo");
            return (Criteria) this;
        }

        public Criteria andLocationSeqIdToBetween(String value1, String value2) {
            addCriterion("LOCATION_SEQ_ID_TO between", value1, value2, "locationSeqIdTo");
            return (Criteria) this;
        }

        public Criteria andLocationSeqIdToNotBetween(String value1, String value2) {
            addCriterion("LOCATION_SEQ_ID_TO not between", value1, value2, "locationSeqIdTo");
            return (Criteria) this;
        }

        public Criteria andContainerIdToIsNull() {
            addCriterion("CONTAINER_ID_TO is null");
            return (Criteria) this;
        }

        public Criteria andContainerIdToIsNotNull() {
            addCriterion("CONTAINER_ID_TO is not null");
            return (Criteria) this;
        }

        public Criteria andContainerIdToEqualTo(String value) {
            addCriterion("CONTAINER_ID_TO =", value, "containerIdTo");
            return (Criteria) this;
        }

        public Criteria andContainerIdToNotEqualTo(String value) {
            addCriterion("CONTAINER_ID_TO <>", value, "containerIdTo");
            return (Criteria) this;
        }

        public Criteria andContainerIdToGreaterThan(String value) {
            addCriterion("CONTAINER_ID_TO >", value, "containerIdTo");
            return (Criteria) this;
        }

        public Criteria andContainerIdToGreaterThanOrEqualTo(String value) {
            addCriterion("CONTAINER_ID_TO >=", value, "containerIdTo");
            return (Criteria) this;
        }

        public Criteria andContainerIdToLessThan(String value) {
            addCriterion("CONTAINER_ID_TO <", value, "containerIdTo");
            return (Criteria) this;
        }

        public Criteria andContainerIdToLessThanOrEqualTo(String value) {
            addCriterion("CONTAINER_ID_TO <=", value, "containerIdTo");
            return (Criteria) this;
        }

        public Criteria andContainerIdToLike(String value) {
            addCriterion("CONTAINER_ID_TO like", value, "containerIdTo");
            return (Criteria) this;
        }

        public Criteria andContainerIdToNotLike(String value) {
            addCriterion("CONTAINER_ID_TO not like", value, "containerIdTo");
            return (Criteria) this;
        }

        public Criteria andContainerIdToIn(List<String> values) {
            addCriterion("CONTAINER_ID_TO in", values, "containerIdTo");
            return (Criteria) this;
        }

        public Criteria andContainerIdToNotIn(List<String> values) {
            addCriterion("CONTAINER_ID_TO not in", values, "containerIdTo");
            return (Criteria) this;
        }

        public Criteria andContainerIdToBetween(String value1, String value2) {
            addCriterion("CONTAINER_ID_TO between", value1, value2, "containerIdTo");
            return (Criteria) this;
        }

        public Criteria andContainerIdToNotBetween(String value1, String value2) {
            addCriterion("CONTAINER_ID_TO not between", value1, value2, "containerIdTo");
            return (Criteria) this;
        }

        public Criteria andItemIssuanceIdIsNull() {
            addCriterion("ITEM_ISSUANCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andItemIssuanceIdIsNotNull() {
            addCriterion("ITEM_ISSUANCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andItemIssuanceIdEqualTo(String value) {
            addCriterion("ITEM_ISSUANCE_ID =", value, "itemIssuanceId");
            return (Criteria) this;
        }

        public Criteria andItemIssuanceIdNotEqualTo(String value) {
            addCriterion("ITEM_ISSUANCE_ID <>", value, "itemIssuanceId");
            return (Criteria) this;
        }

        public Criteria andItemIssuanceIdGreaterThan(String value) {
            addCriterion("ITEM_ISSUANCE_ID >", value, "itemIssuanceId");
            return (Criteria) this;
        }

        public Criteria andItemIssuanceIdGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_ISSUANCE_ID >=", value, "itemIssuanceId");
            return (Criteria) this;
        }

        public Criteria andItemIssuanceIdLessThan(String value) {
            addCriterion("ITEM_ISSUANCE_ID <", value, "itemIssuanceId");
            return (Criteria) this;
        }

        public Criteria andItemIssuanceIdLessThanOrEqualTo(String value) {
            addCriterion("ITEM_ISSUANCE_ID <=", value, "itemIssuanceId");
            return (Criteria) this;
        }

        public Criteria andItemIssuanceIdLike(String value) {
            addCriterion("ITEM_ISSUANCE_ID like", value, "itemIssuanceId");
            return (Criteria) this;
        }

        public Criteria andItemIssuanceIdNotLike(String value) {
            addCriterion("ITEM_ISSUANCE_ID not like", value, "itemIssuanceId");
            return (Criteria) this;
        }

        public Criteria andItemIssuanceIdIn(List<String> values) {
            addCriterion("ITEM_ISSUANCE_ID in", values, "itemIssuanceId");
            return (Criteria) this;
        }

        public Criteria andItemIssuanceIdNotIn(List<String> values) {
            addCriterion("ITEM_ISSUANCE_ID not in", values, "itemIssuanceId");
            return (Criteria) this;
        }

        public Criteria andItemIssuanceIdBetween(String value1, String value2) {
            addCriterion("ITEM_ISSUANCE_ID between", value1, value2, "itemIssuanceId");
            return (Criteria) this;
        }

        public Criteria andItemIssuanceIdNotBetween(String value1, String value2) {
            addCriterion("ITEM_ISSUANCE_ID not between", value1, value2, "itemIssuanceId");
            return (Criteria) this;
        }

        public Criteria andSendDateIsNull() {
            addCriterion("SEND_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSendDateIsNotNull() {
            addCriterion("SEND_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSendDateEqualTo(Date value) {
            addCriterion("SEND_DATE =", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateNotEqualTo(Date value) {
            addCriterion("SEND_DATE <>", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateGreaterThan(Date value) {
            addCriterion("SEND_DATE >", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateGreaterThanOrEqualTo(Date value) {
            addCriterion("SEND_DATE >=", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateLessThan(Date value) {
            addCriterion("SEND_DATE <", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateLessThanOrEqualTo(Date value) {
            addCriterion("SEND_DATE <=", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateIn(List<Date> values) {
            addCriterion("SEND_DATE in", values, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateNotIn(List<Date> values) {
            addCriterion("SEND_DATE not in", values, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateBetween(Date value1, Date value2) {
            addCriterion("SEND_DATE between", value1, value2, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateNotBetween(Date value1, Date value2) {
            addCriterion("SEND_DATE not between", value1, value2, "sendDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateIsNull() {
            addCriterion("RECEIVE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andReceiveDateIsNotNull() {
            addCriterion("RECEIVE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveDateEqualTo(Date value) {
            addCriterion("RECEIVE_DATE =", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateNotEqualTo(Date value) {
            addCriterion("RECEIVE_DATE <>", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateGreaterThan(Date value) {
            addCriterion("RECEIVE_DATE >", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateGreaterThanOrEqualTo(Date value) {
            addCriterion("RECEIVE_DATE >=", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateLessThan(Date value) {
            addCriterion("RECEIVE_DATE <", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateLessThanOrEqualTo(Date value) {
            addCriterion("RECEIVE_DATE <=", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateIn(List<Date> values) {
            addCriterion("RECEIVE_DATE in", values, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateNotIn(List<Date> values) {
            addCriterion("RECEIVE_DATE not in", values, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateBetween(Date value1, Date value2) {
            addCriterion("RECEIVE_DATE between", value1, value2, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateNotBetween(Date value1, Date value2) {
            addCriterion("RECEIVE_DATE not between", value1, value2, "receiveDate");
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