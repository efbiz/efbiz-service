package org.efbiz.product.product.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductMaintExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public ProductMaintExample() {
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

        public Criteria andProductMaintSeqIdIsNull() {
            addCriterion("PRODUCT_MAINT_SEQ_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductMaintSeqIdIsNotNull() {
            addCriterion("PRODUCT_MAINT_SEQ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductMaintSeqIdEqualTo(String value) {
            addCriterion("PRODUCT_MAINT_SEQ_ID =", value, "productMaintSeqId");
            return (Criteria) this;
        }

        public Criteria andProductMaintSeqIdNotEqualTo(String value) {
            addCriterion("PRODUCT_MAINT_SEQ_ID <>", value, "productMaintSeqId");
            return (Criteria) this;
        }

        public Criteria andProductMaintSeqIdGreaterThan(String value) {
            addCriterion("PRODUCT_MAINT_SEQ_ID >", value, "productMaintSeqId");
            return (Criteria) this;
        }

        public Criteria andProductMaintSeqIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_MAINT_SEQ_ID >=", value, "productMaintSeqId");
            return (Criteria) this;
        }

        public Criteria andProductMaintSeqIdLessThan(String value) {
            addCriterion("PRODUCT_MAINT_SEQ_ID <", value, "productMaintSeqId");
            return (Criteria) this;
        }

        public Criteria andProductMaintSeqIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_MAINT_SEQ_ID <=", value, "productMaintSeqId");
            return (Criteria) this;
        }

        public Criteria andProductMaintSeqIdLike(String value) {
            addCriterion("PRODUCT_MAINT_SEQ_ID like", value, "productMaintSeqId");
            return (Criteria) this;
        }

        public Criteria andProductMaintSeqIdNotLike(String value) {
            addCriterion("PRODUCT_MAINT_SEQ_ID not like", value, "productMaintSeqId");
            return (Criteria) this;
        }

        public Criteria andProductMaintSeqIdIn(List<String> values) {
            addCriterion("PRODUCT_MAINT_SEQ_ID in", values, "productMaintSeqId");
            return (Criteria) this;
        }

        public Criteria andProductMaintSeqIdNotIn(List<String> values) {
            addCriterion("PRODUCT_MAINT_SEQ_ID not in", values, "productMaintSeqId");
            return (Criteria) this;
        }

        public Criteria andProductMaintSeqIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_MAINT_SEQ_ID between", value1, value2, "productMaintSeqId");
            return (Criteria) this;
        }

        public Criteria andProductMaintSeqIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_MAINT_SEQ_ID not between", value1, value2, "productMaintSeqId");
            return (Criteria) this;
        }

        public Criteria andProductMaintTypeIdIsNull() {
            addCriterion("PRODUCT_MAINT_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductMaintTypeIdIsNotNull() {
            addCriterion("PRODUCT_MAINT_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductMaintTypeIdEqualTo(String value) {
            addCriterion("PRODUCT_MAINT_TYPE_ID =", value, "productMaintTypeId");
            return (Criteria) this;
        }

        public Criteria andProductMaintTypeIdNotEqualTo(String value) {
            addCriterion("PRODUCT_MAINT_TYPE_ID <>", value, "productMaintTypeId");
            return (Criteria) this;
        }

        public Criteria andProductMaintTypeIdGreaterThan(String value) {
            addCriterion("PRODUCT_MAINT_TYPE_ID >", value, "productMaintTypeId");
            return (Criteria) this;
        }

        public Criteria andProductMaintTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_MAINT_TYPE_ID >=", value, "productMaintTypeId");
            return (Criteria) this;
        }

        public Criteria andProductMaintTypeIdLessThan(String value) {
            addCriterion("PRODUCT_MAINT_TYPE_ID <", value, "productMaintTypeId");
            return (Criteria) this;
        }

        public Criteria andProductMaintTypeIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_MAINT_TYPE_ID <=", value, "productMaintTypeId");
            return (Criteria) this;
        }

        public Criteria andProductMaintTypeIdLike(String value) {
            addCriterion("PRODUCT_MAINT_TYPE_ID like", value, "productMaintTypeId");
            return (Criteria) this;
        }

        public Criteria andProductMaintTypeIdNotLike(String value) {
            addCriterion("PRODUCT_MAINT_TYPE_ID not like", value, "productMaintTypeId");
            return (Criteria) this;
        }

        public Criteria andProductMaintTypeIdIn(List<String> values) {
            addCriterion("PRODUCT_MAINT_TYPE_ID in", values, "productMaintTypeId");
            return (Criteria) this;
        }

        public Criteria andProductMaintTypeIdNotIn(List<String> values) {
            addCriterion("PRODUCT_MAINT_TYPE_ID not in", values, "productMaintTypeId");
            return (Criteria) this;
        }

        public Criteria andProductMaintTypeIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_MAINT_TYPE_ID between", value1, value2, "productMaintTypeId");
            return (Criteria) this;
        }

        public Criteria andProductMaintTypeIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_MAINT_TYPE_ID not between", value1, value2, "productMaintTypeId");
            return (Criteria) this;
        }

        public Criteria andMaintNameIsNull() {
            addCriterion("MAINT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMaintNameIsNotNull() {
            addCriterion("MAINT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMaintNameEqualTo(String value) {
            addCriterion("MAINT_NAME =", value, "maintName");
            return (Criteria) this;
        }

        public Criteria andMaintNameNotEqualTo(String value) {
            addCriterion("MAINT_NAME <>", value, "maintName");
            return (Criteria) this;
        }

        public Criteria andMaintNameGreaterThan(String value) {
            addCriterion("MAINT_NAME >", value, "maintName");
            return (Criteria) this;
        }

        public Criteria andMaintNameGreaterThanOrEqualTo(String value) {
            addCriterion("MAINT_NAME >=", value, "maintName");
            return (Criteria) this;
        }

        public Criteria andMaintNameLessThan(String value) {
            addCriterion("MAINT_NAME <", value, "maintName");
            return (Criteria) this;
        }

        public Criteria andMaintNameLessThanOrEqualTo(String value) {
            addCriterion("MAINT_NAME <=", value, "maintName");
            return (Criteria) this;
        }

        public Criteria andMaintNameLike(String value) {
            addCriterion("MAINT_NAME like", value, "maintName");
            return (Criteria) this;
        }

        public Criteria andMaintNameNotLike(String value) {
            addCriterion("MAINT_NAME not like", value, "maintName");
            return (Criteria) this;
        }

        public Criteria andMaintNameIn(List<String> values) {
            addCriterion("MAINT_NAME in", values, "maintName");
            return (Criteria) this;
        }

        public Criteria andMaintNameNotIn(List<String> values) {
            addCriterion("MAINT_NAME not in", values, "maintName");
            return (Criteria) this;
        }

        public Criteria andMaintNameBetween(String value1, String value2) {
            addCriterion("MAINT_NAME between", value1, value2, "maintName");
            return (Criteria) this;
        }

        public Criteria andMaintNameNotBetween(String value1, String value2) {
            addCriterion("MAINT_NAME not between", value1, value2, "maintName");
            return (Criteria) this;
        }

        public Criteria andMaintTemplateWorkEffortIdIsNull() {
            addCriterion("MAINT_TEMPLATE_WORK_EFFORT_ID is null");
            return (Criteria) this;
        }

        public Criteria andMaintTemplateWorkEffortIdIsNotNull() {
            addCriterion("MAINT_TEMPLATE_WORK_EFFORT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMaintTemplateWorkEffortIdEqualTo(String value) {
            addCriterion("MAINT_TEMPLATE_WORK_EFFORT_ID =", value, "maintTemplateWorkEffortId");
            return (Criteria) this;
        }

        public Criteria andMaintTemplateWorkEffortIdNotEqualTo(String value) {
            addCriterion("MAINT_TEMPLATE_WORK_EFFORT_ID <>", value, "maintTemplateWorkEffortId");
            return (Criteria) this;
        }

        public Criteria andMaintTemplateWorkEffortIdGreaterThan(String value) {
            addCriterion("MAINT_TEMPLATE_WORK_EFFORT_ID >", value, "maintTemplateWorkEffortId");
            return (Criteria) this;
        }

        public Criteria andMaintTemplateWorkEffortIdGreaterThanOrEqualTo(String value) {
            addCriterion("MAINT_TEMPLATE_WORK_EFFORT_ID >=", value, "maintTemplateWorkEffortId");
            return (Criteria) this;
        }

        public Criteria andMaintTemplateWorkEffortIdLessThan(String value) {
            addCriterion("MAINT_TEMPLATE_WORK_EFFORT_ID <", value, "maintTemplateWorkEffortId");
            return (Criteria) this;
        }

        public Criteria andMaintTemplateWorkEffortIdLessThanOrEqualTo(String value) {
            addCriterion("MAINT_TEMPLATE_WORK_EFFORT_ID <=", value, "maintTemplateWorkEffortId");
            return (Criteria) this;
        }

        public Criteria andMaintTemplateWorkEffortIdLike(String value) {
            addCriterion("MAINT_TEMPLATE_WORK_EFFORT_ID like", value, "maintTemplateWorkEffortId");
            return (Criteria) this;
        }

        public Criteria andMaintTemplateWorkEffortIdNotLike(String value) {
            addCriterion("MAINT_TEMPLATE_WORK_EFFORT_ID not like", value, "maintTemplateWorkEffortId");
            return (Criteria) this;
        }

        public Criteria andMaintTemplateWorkEffortIdIn(List<String> values) {
            addCriterion("MAINT_TEMPLATE_WORK_EFFORT_ID in", values, "maintTemplateWorkEffortId");
            return (Criteria) this;
        }

        public Criteria andMaintTemplateWorkEffortIdNotIn(List<String> values) {
            addCriterion("MAINT_TEMPLATE_WORK_EFFORT_ID not in", values, "maintTemplateWorkEffortId");
            return (Criteria) this;
        }

        public Criteria andMaintTemplateWorkEffortIdBetween(String value1, String value2) {
            addCriterion("MAINT_TEMPLATE_WORK_EFFORT_ID between", value1, value2, "maintTemplateWorkEffortId");
            return (Criteria) this;
        }

        public Criteria andMaintTemplateWorkEffortIdNotBetween(String value1, String value2) {
            addCriterion("MAINT_TEMPLATE_WORK_EFFORT_ID not between", value1, value2, "maintTemplateWorkEffortId");
            return (Criteria) this;
        }

        public Criteria andIntervalQuantityIsNull() {
            addCriterion("INTERVAL_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andIntervalQuantityIsNotNull() {
            addCriterion("INTERVAL_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andIntervalQuantityEqualTo(BigDecimal value) {
            addCriterion("INTERVAL_QUANTITY =", value, "intervalQuantity");
            return (Criteria) this;
        }

        public Criteria andIntervalQuantityNotEqualTo(BigDecimal value) {
            addCriterion("INTERVAL_QUANTITY <>", value, "intervalQuantity");
            return (Criteria) this;
        }

        public Criteria andIntervalQuantityGreaterThan(BigDecimal value) {
            addCriterion("INTERVAL_QUANTITY >", value, "intervalQuantity");
            return (Criteria) this;
        }

        public Criteria andIntervalQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INTERVAL_QUANTITY >=", value, "intervalQuantity");
            return (Criteria) this;
        }

        public Criteria andIntervalQuantityLessThan(BigDecimal value) {
            addCriterion("INTERVAL_QUANTITY <", value, "intervalQuantity");
            return (Criteria) this;
        }

        public Criteria andIntervalQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INTERVAL_QUANTITY <=", value, "intervalQuantity");
            return (Criteria) this;
        }

        public Criteria andIntervalQuantityIn(List<BigDecimal> values) {
            addCriterion("INTERVAL_QUANTITY in", values, "intervalQuantity");
            return (Criteria) this;
        }

        public Criteria andIntervalQuantityNotIn(List<BigDecimal> values) {
            addCriterion("INTERVAL_QUANTITY not in", values, "intervalQuantity");
            return (Criteria) this;
        }

        public Criteria andIntervalQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INTERVAL_QUANTITY between", value1, value2, "intervalQuantity");
            return (Criteria) this;
        }

        public Criteria andIntervalQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INTERVAL_QUANTITY not between", value1, value2, "intervalQuantity");
            return (Criteria) this;
        }

        public Criteria andIntervalUomIdIsNull() {
            addCriterion("INTERVAL_UOM_ID is null");
            return (Criteria) this;
        }

        public Criteria andIntervalUomIdIsNotNull() {
            addCriterion("INTERVAL_UOM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIntervalUomIdEqualTo(String value) {
            addCriterion("INTERVAL_UOM_ID =", value, "intervalUomId");
            return (Criteria) this;
        }

        public Criteria andIntervalUomIdNotEqualTo(String value) {
            addCriterion("INTERVAL_UOM_ID <>", value, "intervalUomId");
            return (Criteria) this;
        }

        public Criteria andIntervalUomIdGreaterThan(String value) {
            addCriterion("INTERVAL_UOM_ID >", value, "intervalUomId");
            return (Criteria) this;
        }

        public Criteria andIntervalUomIdGreaterThanOrEqualTo(String value) {
            addCriterion("INTERVAL_UOM_ID >=", value, "intervalUomId");
            return (Criteria) this;
        }

        public Criteria andIntervalUomIdLessThan(String value) {
            addCriterion("INTERVAL_UOM_ID <", value, "intervalUomId");
            return (Criteria) this;
        }

        public Criteria andIntervalUomIdLessThanOrEqualTo(String value) {
            addCriterion("INTERVAL_UOM_ID <=", value, "intervalUomId");
            return (Criteria) this;
        }

        public Criteria andIntervalUomIdLike(String value) {
            addCriterion("INTERVAL_UOM_ID like", value, "intervalUomId");
            return (Criteria) this;
        }

        public Criteria andIntervalUomIdNotLike(String value) {
            addCriterion("INTERVAL_UOM_ID not like", value, "intervalUomId");
            return (Criteria) this;
        }

        public Criteria andIntervalUomIdIn(List<String> values) {
            addCriterion("INTERVAL_UOM_ID in", values, "intervalUomId");
            return (Criteria) this;
        }

        public Criteria andIntervalUomIdNotIn(List<String> values) {
            addCriterion("INTERVAL_UOM_ID not in", values, "intervalUomId");
            return (Criteria) this;
        }

        public Criteria andIntervalUomIdBetween(String value1, String value2) {
            addCriterion("INTERVAL_UOM_ID between", value1, value2, "intervalUomId");
            return (Criteria) this;
        }

        public Criteria andIntervalUomIdNotBetween(String value1, String value2) {
            addCriterion("INTERVAL_UOM_ID not between", value1, value2, "intervalUomId");
            return (Criteria) this;
        }

        public Criteria andIntervalMeterTypeIdIsNull() {
            addCriterion("INTERVAL_METER_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andIntervalMeterTypeIdIsNotNull() {
            addCriterion("INTERVAL_METER_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIntervalMeterTypeIdEqualTo(String value) {
            addCriterion("INTERVAL_METER_TYPE_ID =", value, "intervalMeterTypeId");
            return (Criteria) this;
        }

        public Criteria andIntervalMeterTypeIdNotEqualTo(String value) {
            addCriterion("INTERVAL_METER_TYPE_ID <>", value, "intervalMeterTypeId");
            return (Criteria) this;
        }

        public Criteria andIntervalMeterTypeIdGreaterThan(String value) {
            addCriterion("INTERVAL_METER_TYPE_ID >", value, "intervalMeterTypeId");
            return (Criteria) this;
        }

        public Criteria andIntervalMeterTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("INTERVAL_METER_TYPE_ID >=", value, "intervalMeterTypeId");
            return (Criteria) this;
        }

        public Criteria andIntervalMeterTypeIdLessThan(String value) {
            addCriterion("INTERVAL_METER_TYPE_ID <", value, "intervalMeterTypeId");
            return (Criteria) this;
        }

        public Criteria andIntervalMeterTypeIdLessThanOrEqualTo(String value) {
            addCriterion("INTERVAL_METER_TYPE_ID <=", value, "intervalMeterTypeId");
            return (Criteria) this;
        }

        public Criteria andIntervalMeterTypeIdLike(String value) {
            addCriterion("INTERVAL_METER_TYPE_ID like", value, "intervalMeterTypeId");
            return (Criteria) this;
        }

        public Criteria andIntervalMeterTypeIdNotLike(String value) {
            addCriterion("INTERVAL_METER_TYPE_ID not like", value, "intervalMeterTypeId");
            return (Criteria) this;
        }

        public Criteria andIntervalMeterTypeIdIn(List<String> values) {
            addCriterion("INTERVAL_METER_TYPE_ID in", values, "intervalMeterTypeId");
            return (Criteria) this;
        }

        public Criteria andIntervalMeterTypeIdNotIn(List<String> values) {
            addCriterion("INTERVAL_METER_TYPE_ID not in", values, "intervalMeterTypeId");
            return (Criteria) this;
        }

        public Criteria andIntervalMeterTypeIdBetween(String value1, String value2) {
            addCriterion("INTERVAL_METER_TYPE_ID between", value1, value2, "intervalMeterTypeId");
            return (Criteria) this;
        }

        public Criteria andIntervalMeterTypeIdNotBetween(String value1, String value2) {
            addCriterion("INTERVAL_METER_TYPE_ID not between", value1, value2, "intervalMeterTypeId");
            return (Criteria) this;
        }

        public Criteria andRepeatCountIsNull() {
            addCriterion("REPEAT_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andRepeatCountIsNotNull() {
            addCriterion("REPEAT_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andRepeatCountEqualTo(BigDecimal value) {
            addCriterion("REPEAT_COUNT =", value, "repeatCount");
            return (Criteria) this;
        }

        public Criteria andRepeatCountNotEqualTo(BigDecimal value) {
            addCriterion("REPEAT_COUNT <>", value, "repeatCount");
            return (Criteria) this;
        }

        public Criteria andRepeatCountGreaterThan(BigDecimal value) {
            addCriterion("REPEAT_COUNT >", value, "repeatCount");
            return (Criteria) this;
        }

        public Criteria andRepeatCountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REPEAT_COUNT >=", value, "repeatCount");
            return (Criteria) this;
        }

        public Criteria andRepeatCountLessThan(BigDecimal value) {
            addCriterion("REPEAT_COUNT <", value, "repeatCount");
            return (Criteria) this;
        }

        public Criteria andRepeatCountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REPEAT_COUNT <=", value, "repeatCount");
            return (Criteria) this;
        }

        public Criteria andRepeatCountIn(List<BigDecimal> values) {
            addCriterion("REPEAT_COUNT in", values, "repeatCount");
            return (Criteria) this;
        }

        public Criteria andRepeatCountNotIn(List<BigDecimal> values) {
            addCriterion("REPEAT_COUNT not in", values, "repeatCount");
            return (Criteria) this;
        }

        public Criteria andRepeatCountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REPEAT_COUNT between", value1, value2, "repeatCount");
            return (Criteria) this;
        }

        public Criteria andRepeatCountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REPEAT_COUNT not between", value1, value2, "repeatCount");
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