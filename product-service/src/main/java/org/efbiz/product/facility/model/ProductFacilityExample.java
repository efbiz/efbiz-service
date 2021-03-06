package org.efbiz.product.facility.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductFacilityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public ProductFacilityExample() {
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

        public Criteria andMinimumStockIsNull() {
            addCriterion("MINIMUM_STOCK is null");
            return (Criteria) this;
        }

        public Criteria andMinimumStockIsNotNull() {
            addCriterion("MINIMUM_STOCK is not null");
            return (Criteria) this;
        }

        public Criteria andMinimumStockEqualTo(BigDecimal value) {
            addCriterion("MINIMUM_STOCK =", value, "minimumStock");
            return (Criteria) this;
        }

        public Criteria andMinimumStockNotEqualTo(BigDecimal value) {
            addCriterion("MINIMUM_STOCK <>", value, "minimumStock");
            return (Criteria) this;
        }

        public Criteria andMinimumStockGreaterThan(BigDecimal value) {
            addCriterion("MINIMUM_STOCK >", value, "minimumStock");
            return (Criteria) this;
        }

        public Criteria andMinimumStockGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MINIMUM_STOCK >=", value, "minimumStock");
            return (Criteria) this;
        }

        public Criteria andMinimumStockLessThan(BigDecimal value) {
            addCriterion("MINIMUM_STOCK <", value, "minimumStock");
            return (Criteria) this;
        }

        public Criteria andMinimumStockLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MINIMUM_STOCK <=", value, "minimumStock");
            return (Criteria) this;
        }

        public Criteria andMinimumStockIn(List<BigDecimal> values) {
            addCriterion("MINIMUM_STOCK in", values, "minimumStock");
            return (Criteria) this;
        }

        public Criteria andMinimumStockNotIn(List<BigDecimal> values) {
            addCriterion("MINIMUM_STOCK not in", values, "minimumStock");
            return (Criteria) this;
        }

        public Criteria andMinimumStockBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MINIMUM_STOCK between", value1, value2, "minimumStock");
            return (Criteria) this;
        }

        public Criteria andMinimumStockNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MINIMUM_STOCK not between", value1, value2, "minimumStock");
            return (Criteria) this;
        }

        public Criteria andReorderQuantityIsNull() {
            addCriterion("REORDER_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andReorderQuantityIsNotNull() {
            addCriterion("REORDER_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andReorderQuantityEqualTo(BigDecimal value) {
            addCriterion("REORDER_QUANTITY =", value, "reorderQuantity");
            return (Criteria) this;
        }

        public Criteria andReorderQuantityNotEqualTo(BigDecimal value) {
            addCriterion("REORDER_QUANTITY <>", value, "reorderQuantity");
            return (Criteria) this;
        }

        public Criteria andReorderQuantityGreaterThan(BigDecimal value) {
            addCriterion("REORDER_QUANTITY >", value, "reorderQuantity");
            return (Criteria) this;
        }

        public Criteria andReorderQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REORDER_QUANTITY >=", value, "reorderQuantity");
            return (Criteria) this;
        }

        public Criteria andReorderQuantityLessThan(BigDecimal value) {
            addCriterion("REORDER_QUANTITY <", value, "reorderQuantity");
            return (Criteria) this;
        }

        public Criteria andReorderQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REORDER_QUANTITY <=", value, "reorderQuantity");
            return (Criteria) this;
        }

        public Criteria andReorderQuantityIn(List<BigDecimal> values) {
            addCriterion("REORDER_QUANTITY in", values, "reorderQuantity");
            return (Criteria) this;
        }

        public Criteria andReorderQuantityNotIn(List<BigDecimal> values) {
            addCriterion("REORDER_QUANTITY not in", values, "reorderQuantity");
            return (Criteria) this;
        }

        public Criteria andReorderQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REORDER_QUANTITY between", value1, value2, "reorderQuantity");
            return (Criteria) this;
        }

        public Criteria andReorderQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REORDER_QUANTITY not between", value1, value2, "reorderQuantity");
            return (Criteria) this;
        }

        public Criteria andDaysToShipIsNull() {
            addCriterion("DAYS_TO_SHIP is null");
            return (Criteria) this;
        }

        public Criteria andDaysToShipIsNotNull() {
            addCriterion("DAYS_TO_SHIP is not null");
            return (Criteria) this;
        }

        public Criteria andDaysToShipEqualTo(BigDecimal value) {
            addCriterion("DAYS_TO_SHIP =", value, "daysToShip");
            return (Criteria) this;
        }

        public Criteria andDaysToShipNotEqualTo(BigDecimal value) {
            addCriterion("DAYS_TO_SHIP <>", value, "daysToShip");
            return (Criteria) this;
        }

        public Criteria andDaysToShipGreaterThan(BigDecimal value) {
            addCriterion("DAYS_TO_SHIP >", value, "daysToShip");
            return (Criteria) this;
        }

        public Criteria andDaysToShipGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DAYS_TO_SHIP >=", value, "daysToShip");
            return (Criteria) this;
        }

        public Criteria andDaysToShipLessThan(BigDecimal value) {
            addCriterion("DAYS_TO_SHIP <", value, "daysToShip");
            return (Criteria) this;
        }

        public Criteria andDaysToShipLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DAYS_TO_SHIP <=", value, "daysToShip");
            return (Criteria) this;
        }

        public Criteria andDaysToShipIn(List<BigDecimal> values) {
            addCriterion("DAYS_TO_SHIP in", values, "daysToShip");
            return (Criteria) this;
        }

        public Criteria andDaysToShipNotIn(List<BigDecimal> values) {
            addCriterion("DAYS_TO_SHIP not in", values, "daysToShip");
            return (Criteria) this;
        }

        public Criteria andDaysToShipBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DAYS_TO_SHIP between", value1, value2, "daysToShip");
            return (Criteria) this;
        }

        public Criteria andDaysToShipNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DAYS_TO_SHIP not between", value1, value2, "daysToShip");
            return (Criteria) this;
        }

        public Criteria andLastInventoryCountIsNull() {
            addCriterion("LAST_INVENTORY_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andLastInventoryCountIsNotNull() {
            addCriterion("LAST_INVENTORY_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andLastInventoryCountEqualTo(BigDecimal value) {
            addCriterion("LAST_INVENTORY_COUNT =", value, "lastInventoryCount");
            return (Criteria) this;
        }

        public Criteria andLastInventoryCountNotEqualTo(BigDecimal value) {
            addCriterion("LAST_INVENTORY_COUNT <>", value, "lastInventoryCount");
            return (Criteria) this;
        }

        public Criteria andLastInventoryCountGreaterThan(BigDecimal value) {
            addCriterion("LAST_INVENTORY_COUNT >", value, "lastInventoryCount");
            return (Criteria) this;
        }

        public Criteria andLastInventoryCountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LAST_INVENTORY_COUNT >=", value, "lastInventoryCount");
            return (Criteria) this;
        }

        public Criteria andLastInventoryCountLessThan(BigDecimal value) {
            addCriterion("LAST_INVENTORY_COUNT <", value, "lastInventoryCount");
            return (Criteria) this;
        }

        public Criteria andLastInventoryCountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LAST_INVENTORY_COUNT <=", value, "lastInventoryCount");
            return (Criteria) this;
        }

        public Criteria andLastInventoryCountIn(List<BigDecimal> values) {
            addCriterion("LAST_INVENTORY_COUNT in", values, "lastInventoryCount");
            return (Criteria) this;
        }

        public Criteria andLastInventoryCountNotIn(List<BigDecimal> values) {
            addCriterion("LAST_INVENTORY_COUNT not in", values, "lastInventoryCount");
            return (Criteria) this;
        }

        public Criteria andLastInventoryCountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LAST_INVENTORY_COUNT between", value1, value2, "lastInventoryCount");
            return (Criteria) this;
        }

        public Criteria andLastInventoryCountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LAST_INVENTORY_COUNT not between", value1, value2, "lastInventoryCount");
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