package org.efbiz.product.inventory.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InventoryItemVarianceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public InventoryItemVarianceExample() {
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

        public Criteria andPhysicalInventoryIdIsNull() {
            addCriterion("PHYSICAL_INVENTORY_ID is null");
            return (Criteria) this;
        }

        public Criteria andPhysicalInventoryIdIsNotNull() {
            addCriterion("PHYSICAL_INVENTORY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPhysicalInventoryIdEqualTo(String value) {
            addCriterion("PHYSICAL_INVENTORY_ID =", value, "physicalInventoryId");
            return (Criteria) this;
        }

        public Criteria andPhysicalInventoryIdNotEqualTo(String value) {
            addCriterion("PHYSICAL_INVENTORY_ID <>", value, "physicalInventoryId");
            return (Criteria) this;
        }

        public Criteria andPhysicalInventoryIdGreaterThan(String value) {
            addCriterion("PHYSICAL_INVENTORY_ID >", value, "physicalInventoryId");
            return (Criteria) this;
        }

        public Criteria andPhysicalInventoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("PHYSICAL_INVENTORY_ID >=", value, "physicalInventoryId");
            return (Criteria) this;
        }

        public Criteria andPhysicalInventoryIdLessThan(String value) {
            addCriterion("PHYSICAL_INVENTORY_ID <", value, "physicalInventoryId");
            return (Criteria) this;
        }

        public Criteria andPhysicalInventoryIdLessThanOrEqualTo(String value) {
            addCriterion("PHYSICAL_INVENTORY_ID <=", value, "physicalInventoryId");
            return (Criteria) this;
        }

        public Criteria andPhysicalInventoryIdLike(String value) {
            addCriterion("PHYSICAL_INVENTORY_ID like", value, "physicalInventoryId");
            return (Criteria) this;
        }

        public Criteria andPhysicalInventoryIdNotLike(String value) {
            addCriterion("PHYSICAL_INVENTORY_ID not like", value, "physicalInventoryId");
            return (Criteria) this;
        }

        public Criteria andPhysicalInventoryIdIn(List<String> values) {
            addCriterion("PHYSICAL_INVENTORY_ID in", values, "physicalInventoryId");
            return (Criteria) this;
        }

        public Criteria andPhysicalInventoryIdNotIn(List<String> values) {
            addCriterion("PHYSICAL_INVENTORY_ID not in", values, "physicalInventoryId");
            return (Criteria) this;
        }

        public Criteria andPhysicalInventoryIdBetween(String value1, String value2) {
            addCriterion("PHYSICAL_INVENTORY_ID between", value1, value2, "physicalInventoryId");
            return (Criteria) this;
        }

        public Criteria andPhysicalInventoryIdNotBetween(String value1, String value2) {
            addCriterion("PHYSICAL_INVENTORY_ID not between", value1, value2, "physicalInventoryId");
            return (Criteria) this;
        }

        public Criteria andVarianceReasonIdIsNull() {
            addCriterion("VARIANCE_REASON_ID is null");
            return (Criteria) this;
        }

        public Criteria andVarianceReasonIdIsNotNull() {
            addCriterion("VARIANCE_REASON_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVarianceReasonIdEqualTo(String value) {
            addCriterion("VARIANCE_REASON_ID =", value, "varianceReasonId");
            return (Criteria) this;
        }

        public Criteria andVarianceReasonIdNotEqualTo(String value) {
            addCriterion("VARIANCE_REASON_ID <>", value, "varianceReasonId");
            return (Criteria) this;
        }

        public Criteria andVarianceReasonIdGreaterThan(String value) {
            addCriterion("VARIANCE_REASON_ID >", value, "varianceReasonId");
            return (Criteria) this;
        }

        public Criteria andVarianceReasonIdGreaterThanOrEqualTo(String value) {
            addCriterion("VARIANCE_REASON_ID >=", value, "varianceReasonId");
            return (Criteria) this;
        }

        public Criteria andVarianceReasonIdLessThan(String value) {
            addCriterion("VARIANCE_REASON_ID <", value, "varianceReasonId");
            return (Criteria) this;
        }

        public Criteria andVarianceReasonIdLessThanOrEqualTo(String value) {
            addCriterion("VARIANCE_REASON_ID <=", value, "varianceReasonId");
            return (Criteria) this;
        }

        public Criteria andVarianceReasonIdLike(String value) {
            addCriterion("VARIANCE_REASON_ID like", value, "varianceReasonId");
            return (Criteria) this;
        }

        public Criteria andVarianceReasonIdNotLike(String value) {
            addCriterion("VARIANCE_REASON_ID not like", value, "varianceReasonId");
            return (Criteria) this;
        }

        public Criteria andVarianceReasonIdIn(List<String> values) {
            addCriterion("VARIANCE_REASON_ID in", values, "varianceReasonId");
            return (Criteria) this;
        }

        public Criteria andVarianceReasonIdNotIn(List<String> values) {
            addCriterion("VARIANCE_REASON_ID not in", values, "varianceReasonId");
            return (Criteria) this;
        }

        public Criteria andVarianceReasonIdBetween(String value1, String value2) {
            addCriterion("VARIANCE_REASON_ID between", value1, value2, "varianceReasonId");
            return (Criteria) this;
        }

        public Criteria andVarianceReasonIdNotBetween(String value1, String value2) {
            addCriterion("VARIANCE_REASON_ID not between", value1, value2, "varianceReasonId");
            return (Criteria) this;
        }

        public Criteria andAvailableToPromiseVarIsNull() {
            addCriterion("AVAILABLE_TO_PROMISE_VAR is null");
            return (Criteria) this;
        }

        public Criteria andAvailableToPromiseVarIsNotNull() {
            addCriterion("AVAILABLE_TO_PROMISE_VAR is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableToPromiseVarEqualTo(BigDecimal value) {
            addCriterion("AVAILABLE_TO_PROMISE_VAR =", value, "availableToPromiseVar");
            return (Criteria) this;
        }

        public Criteria andAvailableToPromiseVarNotEqualTo(BigDecimal value) {
            addCriterion("AVAILABLE_TO_PROMISE_VAR <>", value, "availableToPromiseVar");
            return (Criteria) this;
        }

        public Criteria andAvailableToPromiseVarGreaterThan(BigDecimal value) {
            addCriterion("AVAILABLE_TO_PROMISE_VAR >", value, "availableToPromiseVar");
            return (Criteria) this;
        }

        public Criteria andAvailableToPromiseVarGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AVAILABLE_TO_PROMISE_VAR >=", value, "availableToPromiseVar");
            return (Criteria) this;
        }

        public Criteria andAvailableToPromiseVarLessThan(BigDecimal value) {
            addCriterion("AVAILABLE_TO_PROMISE_VAR <", value, "availableToPromiseVar");
            return (Criteria) this;
        }

        public Criteria andAvailableToPromiseVarLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AVAILABLE_TO_PROMISE_VAR <=", value, "availableToPromiseVar");
            return (Criteria) this;
        }

        public Criteria andAvailableToPromiseVarIn(List<BigDecimal> values) {
            addCriterion("AVAILABLE_TO_PROMISE_VAR in", values, "availableToPromiseVar");
            return (Criteria) this;
        }

        public Criteria andAvailableToPromiseVarNotIn(List<BigDecimal> values) {
            addCriterion("AVAILABLE_TO_PROMISE_VAR not in", values, "availableToPromiseVar");
            return (Criteria) this;
        }

        public Criteria andAvailableToPromiseVarBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AVAILABLE_TO_PROMISE_VAR between", value1, value2, "availableToPromiseVar");
            return (Criteria) this;
        }

        public Criteria andAvailableToPromiseVarNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AVAILABLE_TO_PROMISE_VAR not between", value1, value2, "availableToPromiseVar");
            return (Criteria) this;
        }

        public Criteria andQuantityOnHandVarIsNull() {
            addCriterion("QUANTITY_ON_HAND_VAR is null");
            return (Criteria) this;
        }

        public Criteria andQuantityOnHandVarIsNotNull() {
            addCriterion("QUANTITY_ON_HAND_VAR is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityOnHandVarEqualTo(BigDecimal value) {
            addCriterion("QUANTITY_ON_HAND_VAR =", value, "quantityOnHandVar");
            return (Criteria) this;
        }

        public Criteria andQuantityOnHandVarNotEqualTo(BigDecimal value) {
            addCriterion("QUANTITY_ON_HAND_VAR <>", value, "quantityOnHandVar");
            return (Criteria) this;
        }

        public Criteria andQuantityOnHandVarGreaterThan(BigDecimal value) {
            addCriterion("QUANTITY_ON_HAND_VAR >", value, "quantityOnHandVar");
            return (Criteria) this;
        }

        public Criteria andQuantityOnHandVarGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QUANTITY_ON_HAND_VAR >=", value, "quantityOnHandVar");
            return (Criteria) this;
        }

        public Criteria andQuantityOnHandVarLessThan(BigDecimal value) {
            addCriterion("QUANTITY_ON_HAND_VAR <", value, "quantityOnHandVar");
            return (Criteria) this;
        }

        public Criteria andQuantityOnHandVarLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QUANTITY_ON_HAND_VAR <=", value, "quantityOnHandVar");
            return (Criteria) this;
        }

        public Criteria andQuantityOnHandVarIn(List<BigDecimal> values) {
            addCriterion("QUANTITY_ON_HAND_VAR in", values, "quantityOnHandVar");
            return (Criteria) this;
        }

        public Criteria andQuantityOnHandVarNotIn(List<BigDecimal> values) {
            addCriterion("QUANTITY_ON_HAND_VAR not in", values, "quantityOnHandVar");
            return (Criteria) this;
        }

        public Criteria andQuantityOnHandVarBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QUANTITY_ON_HAND_VAR between", value1, value2, "quantityOnHandVar");
            return (Criteria) this;
        }

        public Criteria andQuantityOnHandVarNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QUANTITY_ON_HAND_VAR not between", value1, value2, "quantityOnHandVar");
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