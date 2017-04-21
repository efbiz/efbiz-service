package org.efbiz.product.inventory.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InventoryItemDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public InventoryItemDetailExample() {
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

        public Criteria andInventoryItemDetailSeqIdIsNull() {
            addCriterion("INVENTORY_ITEM_DETAIL_SEQ_ID is null");
            return (Criteria) this;
        }

        public Criteria andInventoryItemDetailSeqIdIsNotNull() {
            addCriterion("INVENTORY_ITEM_DETAIL_SEQ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryItemDetailSeqIdEqualTo(String value) {
            addCriterion("INVENTORY_ITEM_DETAIL_SEQ_ID =", value, "inventoryItemDetailSeqId");
            return (Criteria) this;
        }

        public Criteria andInventoryItemDetailSeqIdNotEqualTo(String value) {
            addCriterion("INVENTORY_ITEM_DETAIL_SEQ_ID <>", value, "inventoryItemDetailSeqId");
            return (Criteria) this;
        }

        public Criteria andInventoryItemDetailSeqIdGreaterThan(String value) {
            addCriterion("INVENTORY_ITEM_DETAIL_SEQ_ID >", value, "inventoryItemDetailSeqId");
            return (Criteria) this;
        }

        public Criteria andInventoryItemDetailSeqIdGreaterThanOrEqualTo(String value) {
            addCriterion("INVENTORY_ITEM_DETAIL_SEQ_ID >=", value, "inventoryItemDetailSeqId");
            return (Criteria) this;
        }

        public Criteria andInventoryItemDetailSeqIdLessThan(String value) {
            addCriterion("INVENTORY_ITEM_DETAIL_SEQ_ID <", value, "inventoryItemDetailSeqId");
            return (Criteria) this;
        }

        public Criteria andInventoryItemDetailSeqIdLessThanOrEqualTo(String value) {
            addCriterion("INVENTORY_ITEM_DETAIL_SEQ_ID <=", value, "inventoryItemDetailSeqId");
            return (Criteria) this;
        }

        public Criteria andInventoryItemDetailSeqIdLike(String value) {
            addCriterion("INVENTORY_ITEM_DETAIL_SEQ_ID like", value, "inventoryItemDetailSeqId");
            return (Criteria) this;
        }

        public Criteria andInventoryItemDetailSeqIdNotLike(String value) {
            addCriterion("INVENTORY_ITEM_DETAIL_SEQ_ID not like", value, "inventoryItemDetailSeqId");
            return (Criteria) this;
        }

        public Criteria andInventoryItemDetailSeqIdIn(List<String> values) {
            addCriterion("INVENTORY_ITEM_DETAIL_SEQ_ID in", values, "inventoryItemDetailSeqId");
            return (Criteria) this;
        }

        public Criteria andInventoryItemDetailSeqIdNotIn(List<String> values) {
            addCriterion("INVENTORY_ITEM_DETAIL_SEQ_ID not in", values, "inventoryItemDetailSeqId");
            return (Criteria) this;
        }

        public Criteria andInventoryItemDetailSeqIdBetween(String value1, String value2) {
            addCriterion("INVENTORY_ITEM_DETAIL_SEQ_ID between", value1, value2, "inventoryItemDetailSeqId");
            return (Criteria) this;
        }

        public Criteria andInventoryItemDetailSeqIdNotBetween(String value1, String value2) {
            addCriterion("INVENTORY_ITEM_DETAIL_SEQ_ID not between", value1, value2, "inventoryItemDetailSeqId");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateIsNull() {
            addCriterion("EFFECTIVE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateIsNotNull() {
            addCriterion("EFFECTIVE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateEqualTo(Date value) {
            addCriterion("EFFECTIVE_DATE =", value, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateNotEqualTo(Date value) {
            addCriterion("EFFECTIVE_DATE <>", value, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateGreaterThan(Date value) {
            addCriterion("EFFECTIVE_DATE >", value, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateGreaterThanOrEqualTo(Date value) {
            addCriterion("EFFECTIVE_DATE >=", value, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateLessThan(Date value) {
            addCriterion("EFFECTIVE_DATE <", value, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateLessThanOrEqualTo(Date value) {
            addCriterion("EFFECTIVE_DATE <=", value, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateIn(List<Date> values) {
            addCriterion("EFFECTIVE_DATE in", values, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateNotIn(List<Date> values) {
            addCriterion("EFFECTIVE_DATE not in", values, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateBetween(Date value1, Date value2) {
            addCriterion("EFFECTIVE_DATE between", value1, value2, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateNotBetween(Date value1, Date value2) {
            addCriterion("EFFECTIVE_DATE not between", value1, value2, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andQuantityOnHandDiffIsNull() {
            addCriterion("QUANTITY_ON_HAND_DIFF is null");
            return (Criteria) this;
        }

        public Criteria andQuantityOnHandDiffIsNotNull() {
            addCriterion("QUANTITY_ON_HAND_DIFF is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityOnHandDiffEqualTo(BigDecimal value) {
            addCriterion("QUANTITY_ON_HAND_DIFF =", value, "quantityOnHandDiff");
            return (Criteria) this;
        }

        public Criteria andQuantityOnHandDiffNotEqualTo(BigDecimal value) {
            addCriterion("QUANTITY_ON_HAND_DIFF <>", value, "quantityOnHandDiff");
            return (Criteria) this;
        }

        public Criteria andQuantityOnHandDiffGreaterThan(BigDecimal value) {
            addCriterion("QUANTITY_ON_HAND_DIFF >", value, "quantityOnHandDiff");
            return (Criteria) this;
        }

        public Criteria andQuantityOnHandDiffGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QUANTITY_ON_HAND_DIFF >=", value, "quantityOnHandDiff");
            return (Criteria) this;
        }

        public Criteria andQuantityOnHandDiffLessThan(BigDecimal value) {
            addCriterion("QUANTITY_ON_HAND_DIFF <", value, "quantityOnHandDiff");
            return (Criteria) this;
        }

        public Criteria andQuantityOnHandDiffLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QUANTITY_ON_HAND_DIFF <=", value, "quantityOnHandDiff");
            return (Criteria) this;
        }

        public Criteria andQuantityOnHandDiffIn(List<BigDecimal> values) {
            addCriterion("QUANTITY_ON_HAND_DIFF in", values, "quantityOnHandDiff");
            return (Criteria) this;
        }

        public Criteria andQuantityOnHandDiffNotIn(List<BigDecimal> values) {
            addCriterion("QUANTITY_ON_HAND_DIFF not in", values, "quantityOnHandDiff");
            return (Criteria) this;
        }

        public Criteria andQuantityOnHandDiffBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QUANTITY_ON_HAND_DIFF between", value1, value2, "quantityOnHandDiff");
            return (Criteria) this;
        }

        public Criteria andQuantityOnHandDiffNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QUANTITY_ON_HAND_DIFF not between", value1, value2, "quantityOnHandDiff");
            return (Criteria) this;
        }

        public Criteria andAvailableToPromiseDiffIsNull() {
            addCriterion("AVAILABLE_TO_PROMISE_DIFF is null");
            return (Criteria) this;
        }

        public Criteria andAvailableToPromiseDiffIsNotNull() {
            addCriterion("AVAILABLE_TO_PROMISE_DIFF is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableToPromiseDiffEqualTo(BigDecimal value) {
            addCriterion("AVAILABLE_TO_PROMISE_DIFF =", value, "availableToPromiseDiff");
            return (Criteria) this;
        }

        public Criteria andAvailableToPromiseDiffNotEqualTo(BigDecimal value) {
            addCriterion("AVAILABLE_TO_PROMISE_DIFF <>", value, "availableToPromiseDiff");
            return (Criteria) this;
        }

        public Criteria andAvailableToPromiseDiffGreaterThan(BigDecimal value) {
            addCriterion("AVAILABLE_TO_PROMISE_DIFF >", value, "availableToPromiseDiff");
            return (Criteria) this;
        }

        public Criteria andAvailableToPromiseDiffGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AVAILABLE_TO_PROMISE_DIFF >=", value, "availableToPromiseDiff");
            return (Criteria) this;
        }

        public Criteria andAvailableToPromiseDiffLessThan(BigDecimal value) {
            addCriterion("AVAILABLE_TO_PROMISE_DIFF <", value, "availableToPromiseDiff");
            return (Criteria) this;
        }

        public Criteria andAvailableToPromiseDiffLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AVAILABLE_TO_PROMISE_DIFF <=", value, "availableToPromiseDiff");
            return (Criteria) this;
        }

        public Criteria andAvailableToPromiseDiffIn(List<BigDecimal> values) {
            addCriterion("AVAILABLE_TO_PROMISE_DIFF in", values, "availableToPromiseDiff");
            return (Criteria) this;
        }

        public Criteria andAvailableToPromiseDiffNotIn(List<BigDecimal> values) {
            addCriterion("AVAILABLE_TO_PROMISE_DIFF not in", values, "availableToPromiseDiff");
            return (Criteria) this;
        }

        public Criteria andAvailableToPromiseDiffBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AVAILABLE_TO_PROMISE_DIFF between", value1, value2, "availableToPromiseDiff");
            return (Criteria) this;
        }

        public Criteria andAvailableToPromiseDiffNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AVAILABLE_TO_PROMISE_DIFF not between", value1, value2, "availableToPromiseDiff");
            return (Criteria) this;
        }

        public Criteria andAccountingQuantityDiffIsNull() {
            addCriterion("ACCOUNTING_QUANTITY_DIFF is null");
            return (Criteria) this;
        }

        public Criteria andAccountingQuantityDiffIsNotNull() {
            addCriterion("ACCOUNTING_QUANTITY_DIFF is not null");
            return (Criteria) this;
        }

        public Criteria andAccountingQuantityDiffEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTING_QUANTITY_DIFF =", value, "accountingQuantityDiff");
            return (Criteria) this;
        }

        public Criteria andAccountingQuantityDiffNotEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTING_QUANTITY_DIFF <>", value, "accountingQuantityDiff");
            return (Criteria) this;
        }

        public Criteria andAccountingQuantityDiffGreaterThan(BigDecimal value) {
            addCriterion("ACCOUNTING_QUANTITY_DIFF >", value, "accountingQuantityDiff");
            return (Criteria) this;
        }

        public Criteria andAccountingQuantityDiffGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTING_QUANTITY_DIFF >=", value, "accountingQuantityDiff");
            return (Criteria) this;
        }

        public Criteria andAccountingQuantityDiffLessThan(BigDecimal value) {
            addCriterion("ACCOUNTING_QUANTITY_DIFF <", value, "accountingQuantityDiff");
            return (Criteria) this;
        }

        public Criteria andAccountingQuantityDiffLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTING_QUANTITY_DIFF <=", value, "accountingQuantityDiff");
            return (Criteria) this;
        }

        public Criteria andAccountingQuantityDiffIn(List<BigDecimal> values) {
            addCriterion("ACCOUNTING_QUANTITY_DIFF in", values, "accountingQuantityDiff");
            return (Criteria) this;
        }

        public Criteria andAccountingQuantityDiffNotIn(List<BigDecimal> values) {
            addCriterion("ACCOUNTING_QUANTITY_DIFF not in", values, "accountingQuantityDiff");
            return (Criteria) this;
        }

        public Criteria andAccountingQuantityDiffBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCOUNTING_QUANTITY_DIFF between", value1, value2, "accountingQuantityDiff");
            return (Criteria) this;
        }

        public Criteria andAccountingQuantityDiffNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCOUNTING_QUANTITY_DIFF not between", value1, value2, "accountingQuantityDiff");
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

        public Criteria andShipGroupSeqIdIsNull() {
            addCriterion("SHIP_GROUP_SEQ_ID is null");
            return (Criteria) this;
        }

        public Criteria andShipGroupSeqIdIsNotNull() {
            addCriterion("SHIP_GROUP_SEQ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andShipGroupSeqIdEqualTo(String value) {
            addCriterion("SHIP_GROUP_SEQ_ID =", value, "shipGroupSeqId");
            return (Criteria) this;
        }

        public Criteria andShipGroupSeqIdNotEqualTo(String value) {
            addCriterion("SHIP_GROUP_SEQ_ID <>", value, "shipGroupSeqId");
            return (Criteria) this;
        }

        public Criteria andShipGroupSeqIdGreaterThan(String value) {
            addCriterion("SHIP_GROUP_SEQ_ID >", value, "shipGroupSeqId");
            return (Criteria) this;
        }

        public Criteria andShipGroupSeqIdGreaterThanOrEqualTo(String value) {
            addCriterion("SHIP_GROUP_SEQ_ID >=", value, "shipGroupSeqId");
            return (Criteria) this;
        }

        public Criteria andShipGroupSeqIdLessThan(String value) {
            addCriterion("SHIP_GROUP_SEQ_ID <", value, "shipGroupSeqId");
            return (Criteria) this;
        }

        public Criteria andShipGroupSeqIdLessThanOrEqualTo(String value) {
            addCriterion("SHIP_GROUP_SEQ_ID <=", value, "shipGroupSeqId");
            return (Criteria) this;
        }

        public Criteria andShipGroupSeqIdLike(String value) {
            addCriterion("SHIP_GROUP_SEQ_ID like", value, "shipGroupSeqId");
            return (Criteria) this;
        }

        public Criteria andShipGroupSeqIdNotLike(String value) {
            addCriterion("SHIP_GROUP_SEQ_ID not like", value, "shipGroupSeqId");
            return (Criteria) this;
        }

        public Criteria andShipGroupSeqIdIn(List<String> values) {
            addCriterion("SHIP_GROUP_SEQ_ID in", values, "shipGroupSeqId");
            return (Criteria) this;
        }

        public Criteria andShipGroupSeqIdNotIn(List<String> values) {
            addCriterion("SHIP_GROUP_SEQ_ID not in", values, "shipGroupSeqId");
            return (Criteria) this;
        }

        public Criteria andShipGroupSeqIdBetween(String value1, String value2) {
            addCriterion("SHIP_GROUP_SEQ_ID between", value1, value2, "shipGroupSeqId");
            return (Criteria) this;
        }

        public Criteria andShipGroupSeqIdNotBetween(String value1, String value2) {
            addCriterion("SHIP_GROUP_SEQ_ID not between", value1, value2, "shipGroupSeqId");
            return (Criteria) this;
        }

        public Criteria andShipmentIdIsNull() {
            addCriterion("SHIPMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andShipmentIdIsNotNull() {
            addCriterion("SHIPMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andShipmentIdEqualTo(String value) {
            addCriterion("SHIPMENT_ID =", value, "shipmentId");
            return (Criteria) this;
        }

        public Criteria andShipmentIdNotEqualTo(String value) {
            addCriterion("SHIPMENT_ID <>", value, "shipmentId");
            return (Criteria) this;
        }

        public Criteria andShipmentIdGreaterThan(String value) {
            addCriterion("SHIPMENT_ID >", value, "shipmentId");
            return (Criteria) this;
        }

        public Criteria andShipmentIdGreaterThanOrEqualTo(String value) {
            addCriterion("SHIPMENT_ID >=", value, "shipmentId");
            return (Criteria) this;
        }

        public Criteria andShipmentIdLessThan(String value) {
            addCriterion("SHIPMENT_ID <", value, "shipmentId");
            return (Criteria) this;
        }

        public Criteria andShipmentIdLessThanOrEqualTo(String value) {
            addCriterion("SHIPMENT_ID <=", value, "shipmentId");
            return (Criteria) this;
        }

        public Criteria andShipmentIdLike(String value) {
            addCriterion("SHIPMENT_ID like", value, "shipmentId");
            return (Criteria) this;
        }

        public Criteria andShipmentIdNotLike(String value) {
            addCriterion("SHIPMENT_ID not like", value, "shipmentId");
            return (Criteria) this;
        }

        public Criteria andShipmentIdIn(List<String> values) {
            addCriterion("SHIPMENT_ID in", values, "shipmentId");
            return (Criteria) this;
        }

        public Criteria andShipmentIdNotIn(List<String> values) {
            addCriterion("SHIPMENT_ID not in", values, "shipmentId");
            return (Criteria) this;
        }

        public Criteria andShipmentIdBetween(String value1, String value2) {
            addCriterion("SHIPMENT_ID between", value1, value2, "shipmentId");
            return (Criteria) this;
        }

        public Criteria andShipmentIdNotBetween(String value1, String value2) {
            addCriterion("SHIPMENT_ID not between", value1, value2, "shipmentId");
            return (Criteria) this;
        }

        public Criteria andShipmentItemSeqIdIsNull() {
            addCriterion("SHIPMENT_ITEM_SEQ_ID is null");
            return (Criteria) this;
        }

        public Criteria andShipmentItemSeqIdIsNotNull() {
            addCriterion("SHIPMENT_ITEM_SEQ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andShipmentItemSeqIdEqualTo(String value) {
            addCriterion("SHIPMENT_ITEM_SEQ_ID =", value, "shipmentItemSeqId");
            return (Criteria) this;
        }

        public Criteria andShipmentItemSeqIdNotEqualTo(String value) {
            addCriterion("SHIPMENT_ITEM_SEQ_ID <>", value, "shipmentItemSeqId");
            return (Criteria) this;
        }

        public Criteria andShipmentItemSeqIdGreaterThan(String value) {
            addCriterion("SHIPMENT_ITEM_SEQ_ID >", value, "shipmentItemSeqId");
            return (Criteria) this;
        }

        public Criteria andShipmentItemSeqIdGreaterThanOrEqualTo(String value) {
            addCriterion("SHIPMENT_ITEM_SEQ_ID >=", value, "shipmentItemSeqId");
            return (Criteria) this;
        }

        public Criteria andShipmentItemSeqIdLessThan(String value) {
            addCriterion("SHIPMENT_ITEM_SEQ_ID <", value, "shipmentItemSeqId");
            return (Criteria) this;
        }

        public Criteria andShipmentItemSeqIdLessThanOrEqualTo(String value) {
            addCriterion("SHIPMENT_ITEM_SEQ_ID <=", value, "shipmentItemSeqId");
            return (Criteria) this;
        }

        public Criteria andShipmentItemSeqIdLike(String value) {
            addCriterion("SHIPMENT_ITEM_SEQ_ID like", value, "shipmentItemSeqId");
            return (Criteria) this;
        }

        public Criteria andShipmentItemSeqIdNotLike(String value) {
            addCriterion("SHIPMENT_ITEM_SEQ_ID not like", value, "shipmentItemSeqId");
            return (Criteria) this;
        }

        public Criteria andShipmentItemSeqIdIn(List<String> values) {
            addCriterion("SHIPMENT_ITEM_SEQ_ID in", values, "shipmentItemSeqId");
            return (Criteria) this;
        }

        public Criteria andShipmentItemSeqIdNotIn(List<String> values) {
            addCriterion("SHIPMENT_ITEM_SEQ_ID not in", values, "shipmentItemSeqId");
            return (Criteria) this;
        }

        public Criteria andShipmentItemSeqIdBetween(String value1, String value2) {
            addCriterion("SHIPMENT_ITEM_SEQ_ID between", value1, value2, "shipmentItemSeqId");
            return (Criteria) this;
        }

        public Criteria andShipmentItemSeqIdNotBetween(String value1, String value2) {
            addCriterion("SHIPMENT_ITEM_SEQ_ID not between", value1, value2, "shipmentItemSeqId");
            return (Criteria) this;
        }

        public Criteria andReturnIdIsNull() {
            addCriterion("RETURN_ID is null");
            return (Criteria) this;
        }

        public Criteria andReturnIdIsNotNull() {
            addCriterion("RETURN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andReturnIdEqualTo(String value) {
            addCriterion("RETURN_ID =", value, "returnId");
            return (Criteria) this;
        }

        public Criteria andReturnIdNotEqualTo(String value) {
            addCriterion("RETURN_ID <>", value, "returnId");
            return (Criteria) this;
        }

        public Criteria andReturnIdGreaterThan(String value) {
            addCriterion("RETURN_ID >", value, "returnId");
            return (Criteria) this;
        }

        public Criteria andReturnIdGreaterThanOrEqualTo(String value) {
            addCriterion("RETURN_ID >=", value, "returnId");
            return (Criteria) this;
        }

        public Criteria andReturnIdLessThan(String value) {
            addCriterion("RETURN_ID <", value, "returnId");
            return (Criteria) this;
        }

        public Criteria andReturnIdLessThanOrEqualTo(String value) {
            addCriterion("RETURN_ID <=", value, "returnId");
            return (Criteria) this;
        }

        public Criteria andReturnIdLike(String value) {
            addCriterion("RETURN_ID like", value, "returnId");
            return (Criteria) this;
        }

        public Criteria andReturnIdNotLike(String value) {
            addCriterion("RETURN_ID not like", value, "returnId");
            return (Criteria) this;
        }

        public Criteria andReturnIdIn(List<String> values) {
            addCriterion("RETURN_ID in", values, "returnId");
            return (Criteria) this;
        }

        public Criteria andReturnIdNotIn(List<String> values) {
            addCriterion("RETURN_ID not in", values, "returnId");
            return (Criteria) this;
        }

        public Criteria andReturnIdBetween(String value1, String value2) {
            addCriterion("RETURN_ID between", value1, value2, "returnId");
            return (Criteria) this;
        }

        public Criteria andReturnIdNotBetween(String value1, String value2) {
            addCriterion("RETURN_ID not between", value1, value2, "returnId");
            return (Criteria) this;
        }

        public Criteria andReturnItemSeqIdIsNull() {
            addCriterion("RETURN_ITEM_SEQ_ID is null");
            return (Criteria) this;
        }

        public Criteria andReturnItemSeqIdIsNotNull() {
            addCriterion("RETURN_ITEM_SEQ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andReturnItemSeqIdEqualTo(String value) {
            addCriterion("RETURN_ITEM_SEQ_ID =", value, "returnItemSeqId");
            return (Criteria) this;
        }

        public Criteria andReturnItemSeqIdNotEqualTo(String value) {
            addCriterion("RETURN_ITEM_SEQ_ID <>", value, "returnItemSeqId");
            return (Criteria) this;
        }

        public Criteria andReturnItemSeqIdGreaterThan(String value) {
            addCriterion("RETURN_ITEM_SEQ_ID >", value, "returnItemSeqId");
            return (Criteria) this;
        }

        public Criteria andReturnItemSeqIdGreaterThanOrEqualTo(String value) {
            addCriterion("RETURN_ITEM_SEQ_ID >=", value, "returnItemSeqId");
            return (Criteria) this;
        }

        public Criteria andReturnItemSeqIdLessThan(String value) {
            addCriterion("RETURN_ITEM_SEQ_ID <", value, "returnItemSeqId");
            return (Criteria) this;
        }

        public Criteria andReturnItemSeqIdLessThanOrEqualTo(String value) {
            addCriterion("RETURN_ITEM_SEQ_ID <=", value, "returnItemSeqId");
            return (Criteria) this;
        }

        public Criteria andReturnItemSeqIdLike(String value) {
            addCriterion("RETURN_ITEM_SEQ_ID like", value, "returnItemSeqId");
            return (Criteria) this;
        }

        public Criteria andReturnItemSeqIdNotLike(String value) {
            addCriterion("RETURN_ITEM_SEQ_ID not like", value, "returnItemSeqId");
            return (Criteria) this;
        }

        public Criteria andReturnItemSeqIdIn(List<String> values) {
            addCriterion("RETURN_ITEM_SEQ_ID in", values, "returnItemSeqId");
            return (Criteria) this;
        }

        public Criteria andReturnItemSeqIdNotIn(List<String> values) {
            addCriterion("RETURN_ITEM_SEQ_ID not in", values, "returnItemSeqId");
            return (Criteria) this;
        }

        public Criteria andReturnItemSeqIdBetween(String value1, String value2) {
            addCriterion("RETURN_ITEM_SEQ_ID between", value1, value2, "returnItemSeqId");
            return (Criteria) this;
        }

        public Criteria andReturnItemSeqIdNotBetween(String value1, String value2) {
            addCriterion("RETURN_ITEM_SEQ_ID not between", value1, value2, "returnItemSeqId");
            return (Criteria) this;
        }

        public Criteria andWorkEffortIdIsNull() {
            addCriterion("WORK_EFFORT_ID is null");
            return (Criteria) this;
        }

        public Criteria andWorkEffortIdIsNotNull() {
            addCriterion("WORK_EFFORT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWorkEffortIdEqualTo(String value) {
            addCriterion("WORK_EFFORT_ID =", value, "workEffortId");
            return (Criteria) this;
        }

        public Criteria andWorkEffortIdNotEqualTo(String value) {
            addCriterion("WORK_EFFORT_ID <>", value, "workEffortId");
            return (Criteria) this;
        }

        public Criteria andWorkEffortIdGreaterThan(String value) {
            addCriterion("WORK_EFFORT_ID >", value, "workEffortId");
            return (Criteria) this;
        }

        public Criteria andWorkEffortIdGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_EFFORT_ID >=", value, "workEffortId");
            return (Criteria) this;
        }

        public Criteria andWorkEffortIdLessThan(String value) {
            addCriterion("WORK_EFFORT_ID <", value, "workEffortId");
            return (Criteria) this;
        }

        public Criteria andWorkEffortIdLessThanOrEqualTo(String value) {
            addCriterion("WORK_EFFORT_ID <=", value, "workEffortId");
            return (Criteria) this;
        }

        public Criteria andWorkEffortIdLike(String value) {
            addCriterion("WORK_EFFORT_ID like", value, "workEffortId");
            return (Criteria) this;
        }

        public Criteria andWorkEffortIdNotLike(String value) {
            addCriterion("WORK_EFFORT_ID not like", value, "workEffortId");
            return (Criteria) this;
        }

        public Criteria andWorkEffortIdIn(List<String> values) {
            addCriterion("WORK_EFFORT_ID in", values, "workEffortId");
            return (Criteria) this;
        }

        public Criteria andWorkEffortIdNotIn(List<String> values) {
            addCriterion("WORK_EFFORT_ID not in", values, "workEffortId");
            return (Criteria) this;
        }

        public Criteria andWorkEffortIdBetween(String value1, String value2) {
            addCriterion("WORK_EFFORT_ID between", value1, value2, "workEffortId");
            return (Criteria) this;
        }

        public Criteria andWorkEffortIdNotBetween(String value1, String value2) {
            addCriterion("WORK_EFFORT_ID not between", value1, value2, "workEffortId");
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

        public Criteria andMaintHistSeqIdIsNull() {
            addCriterion("MAINT_HIST_SEQ_ID is null");
            return (Criteria) this;
        }

        public Criteria andMaintHistSeqIdIsNotNull() {
            addCriterion("MAINT_HIST_SEQ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMaintHistSeqIdEqualTo(String value) {
            addCriterion("MAINT_HIST_SEQ_ID =", value, "maintHistSeqId");
            return (Criteria) this;
        }

        public Criteria andMaintHistSeqIdNotEqualTo(String value) {
            addCriterion("MAINT_HIST_SEQ_ID <>", value, "maintHistSeqId");
            return (Criteria) this;
        }

        public Criteria andMaintHistSeqIdGreaterThan(String value) {
            addCriterion("MAINT_HIST_SEQ_ID >", value, "maintHistSeqId");
            return (Criteria) this;
        }

        public Criteria andMaintHistSeqIdGreaterThanOrEqualTo(String value) {
            addCriterion("MAINT_HIST_SEQ_ID >=", value, "maintHistSeqId");
            return (Criteria) this;
        }

        public Criteria andMaintHistSeqIdLessThan(String value) {
            addCriterion("MAINT_HIST_SEQ_ID <", value, "maintHistSeqId");
            return (Criteria) this;
        }

        public Criteria andMaintHistSeqIdLessThanOrEqualTo(String value) {
            addCriterion("MAINT_HIST_SEQ_ID <=", value, "maintHistSeqId");
            return (Criteria) this;
        }

        public Criteria andMaintHistSeqIdLike(String value) {
            addCriterion("MAINT_HIST_SEQ_ID like", value, "maintHistSeqId");
            return (Criteria) this;
        }

        public Criteria andMaintHistSeqIdNotLike(String value) {
            addCriterion("MAINT_HIST_SEQ_ID not like", value, "maintHistSeqId");
            return (Criteria) this;
        }

        public Criteria andMaintHistSeqIdIn(List<String> values) {
            addCriterion("MAINT_HIST_SEQ_ID in", values, "maintHistSeqId");
            return (Criteria) this;
        }

        public Criteria andMaintHistSeqIdNotIn(List<String> values) {
            addCriterion("MAINT_HIST_SEQ_ID not in", values, "maintHistSeqId");
            return (Criteria) this;
        }

        public Criteria andMaintHistSeqIdBetween(String value1, String value2) {
            addCriterion("MAINT_HIST_SEQ_ID between", value1, value2, "maintHistSeqId");
            return (Criteria) this;
        }

        public Criteria andMaintHistSeqIdNotBetween(String value1, String value2) {
            addCriterion("MAINT_HIST_SEQ_ID not between", value1, value2, "maintHistSeqId");
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

        public Criteria andReceiptIdIsNull() {
            addCriterion("RECEIPT_ID is null");
            return (Criteria) this;
        }

        public Criteria andReceiptIdIsNotNull() {
            addCriterion("RECEIPT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptIdEqualTo(String value) {
            addCriterion("RECEIPT_ID =", value, "receiptId");
            return (Criteria) this;
        }

        public Criteria andReceiptIdNotEqualTo(String value) {
            addCriterion("RECEIPT_ID <>", value, "receiptId");
            return (Criteria) this;
        }

        public Criteria andReceiptIdGreaterThan(String value) {
            addCriterion("RECEIPT_ID >", value, "receiptId");
            return (Criteria) this;
        }

        public Criteria andReceiptIdGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIPT_ID >=", value, "receiptId");
            return (Criteria) this;
        }

        public Criteria andReceiptIdLessThan(String value) {
            addCriterion("RECEIPT_ID <", value, "receiptId");
            return (Criteria) this;
        }

        public Criteria andReceiptIdLessThanOrEqualTo(String value) {
            addCriterion("RECEIPT_ID <=", value, "receiptId");
            return (Criteria) this;
        }

        public Criteria andReceiptIdLike(String value) {
            addCriterion("RECEIPT_ID like", value, "receiptId");
            return (Criteria) this;
        }

        public Criteria andReceiptIdNotLike(String value) {
            addCriterion("RECEIPT_ID not like", value, "receiptId");
            return (Criteria) this;
        }

        public Criteria andReceiptIdIn(List<String> values) {
            addCriterion("RECEIPT_ID in", values, "receiptId");
            return (Criteria) this;
        }

        public Criteria andReceiptIdNotIn(List<String> values) {
            addCriterion("RECEIPT_ID not in", values, "receiptId");
            return (Criteria) this;
        }

        public Criteria andReceiptIdBetween(String value1, String value2) {
            addCriterion("RECEIPT_ID between", value1, value2, "receiptId");
            return (Criteria) this;
        }

        public Criteria andReceiptIdNotBetween(String value1, String value2) {
            addCriterion("RECEIPT_ID not between", value1, value2, "receiptId");
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

        public Criteria andReasonEnumIdIsNull() {
            addCriterion("REASON_ENUM_ID is null");
            return (Criteria) this;
        }

        public Criteria andReasonEnumIdIsNotNull() {
            addCriterion("REASON_ENUM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEnumIdEqualTo(String value) {
            addCriterion("REASON_ENUM_ID =", value, "reasonEnumId");
            return (Criteria) this;
        }

        public Criteria andReasonEnumIdNotEqualTo(String value) {
            addCriterion("REASON_ENUM_ID <>", value, "reasonEnumId");
            return (Criteria) this;
        }

        public Criteria andReasonEnumIdGreaterThan(String value) {
            addCriterion("REASON_ENUM_ID >", value, "reasonEnumId");
            return (Criteria) this;
        }

        public Criteria andReasonEnumIdGreaterThanOrEqualTo(String value) {
            addCriterion("REASON_ENUM_ID >=", value, "reasonEnumId");
            return (Criteria) this;
        }

        public Criteria andReasonEnumIdLessThan(String value) {
            addCriterion("REASON_ENUM_ID <", value, "reasonEnumId");
            return (Criteria) this;
        }

        public Criteria andReasonEnumIdLessThanOrEqualTo(String value) {
            addCriterion("REASON_ENUM_ID <=", value, "reasonEnumId");
            return (Criteria) this;
        }

        public Criteria andReasonEnumIdLike(String value) {
            addCriterion("REASON_ENUM_ID like", value, "reasonEnumId");
            return (Criteria) this;
        }

        public Criteria andReasonEnumIdNotLike(String value) {
            addCriterion("REASON_ENUM_ID not like", value, "reasonEnumId");
            return (Criteria) this;
        }

        public Criteria andReasonEnumIdIn(List<String> values) {
            addCriterion("REASON_ENUM_ID in", values, "reasonEnumId");
            return (Criteria) this;
        }

        public Criteria andReasonEnumIdNotIn(List<String> values) {
            addCriterion("REASON_ENUM_ID not in", values, "reasonEnumId");
            return (Criteria) this;
        }

        public Criteria andReasonEnumIdBetween(String value1, String value2) {
            addCriterion("REASON_ENUM_ID between", value1, value2, "reasonEnumId");
            return (Criteria) this;
        }

        public Criteria andReasonEnumIdNotBetween(String value1, String value2) {
            addCriterion("REASON_ENUM_ID not between", value1, value2, "reasonEnumId");
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