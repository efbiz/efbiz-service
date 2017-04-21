package org.efbiz.product.product.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductAssocExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public ProductAssocExample() {
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

        public Criteria andProductIdToIsNull() {
            addCriterion("PRODUCT_ID_TO is null");
            return (Criteria) this;
        }

        public Criteria andProductIdToIsNotNull() {
            addCriterion("PRODUCT_ID_TO is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdToEqualTo(String value) {
            addCriterion("PRODUCT_ID_TO =", value, "productIdTo");
            return (Criteria) this;
        }

        public Criteria andProductIdToNotEqualTo(String value) {
            addCriterion("PRODUCT_ID_TO <>", value, "productIdTo");
            return (Criteria) this;
        }

        public Criteria andProductIdToGreaterThan(String value) {
            addCriterion("PRODUCT_ID_TO >", value, "productIdTo");
            return (Criteria) this;
        }

        public Criteria andProductIdToGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_ID_TO >=", value, "productIdTo");
            return (Criteria) this;
        }

        public Criteria andProductIdToLessThan(String value) {
            addCriterion("PRODUCT_ID_TO <", value, "productIdTo");
            return (Criteria) this;
        }

        public Criteria andProductIdToLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_ID_TO <=", value, "productIdTo");
            return (Criteria) this;
        }

        public Criteria andProductIdToLike(String value) {
            addCriterion("PRODUCT_ID_TO like", value, "productIdTo");
            return (Criteria) this;
        }

        public Criteria andProductIdToNotLike(String value) {
            addCriterion("PRODUCT_ID_TO not like", value, "productIdTo");
            return (Criteria) this;
        }

        public Criteria andProductIdToIn(List<String> values) {
            addCriterion("PRODUCT_ID_TO in", values, "productIdTo");
            return (Criteria) this;
        }

        public Criteria andProductIdToNotIn(List<String> values) {
            addCriterion("PRODUCT_ID_TO not in", values, "productIdTo");
            return (Criteria) this;
        }

        public Criteria andProductIdToBetween(String value1, String value2) {
            addCriterion("PRODUCT_ID_TO between", value1, value2, "productIdTo");
            return (Criteria) this;
        }

        public Criteria andProductIdToNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_ID_TO not between", value1, value2, "productIdTo");
            return (Criteria) this;
        }

        public Criteria andProductAssocTypeIdIsNull() {
            addCriterion("PRODUCT_ASSOC_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductAssocTypeIdIsNotNull() {
            addCriterion("PRODUCT_ASSOC_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductAssocTypeIdEqualTo(String value) {
            addCriterion("PRODUCT_ASSOC_TYPE_ID =", value, "productAssocTypeId");
            return (Criteria) this;
        }

        public Criteria andProductAssocTypeIdNotEqualTo(String value) {
            addCriterion("PRODUCT_ASSOC_TYPE_ID <>", value, "productAssocTypeId");
            return (Criteria) this;
        }

        public Criteria andProductAssocTypeIdGreaterThan(String value) {
            addCriterion("PRODUCT_ASSOC_TYPE_ID >", value, "productAssocTypeId");
            return (Criteria) this;
        }

        public Criteria andProductAssocTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_ASSOC_TYPE_ID >=", value, "productAssocTypeId");
            return (Criteria) this;
        }

        public Criteria andProductAssocTypeIdLessThan(String value) {
            addCriterion("PRODUCT_ASSOC_TYPE_ID <", value, "productAssocTypeId");
            return (Criteria) this;
        }

        public Criteria andProductAssocTypeIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_ASSOC_TYPE_ID <=", value, "productAssocTypeId");
            return (Criteria) this;
        }

        public Criteria andProductAssocTypeIdLike(String value) {
            addCriterion("PRODUCT_ASSOC_TYPE_ID like", value, "productAssocTypeId");
            return (Criteria) this;
        }

        public Criteria andProductAssocTypeIdNotLike(String value) {
            addCriterion("PRODUCT_ASSOC_TYPE_ID not like", value, "productAssocTypeId");
            return (Criteria) this;
        }

        public Criteria andProductAssocTypeIdIn(List<String> values) {
            addCriterion("PRODUCT_ASSOC_TYPE_ID in", values, "productAssocTypeId");
            return (Criteria) this;
        }

        public Criteria andProductAssocTypeIdNotIn(List<String> values) {
            addCriterion("PRODUCT_ASSOC_TYPE_ID not in", values, "productAssocTypeId");
            return (Criteria) this;
        }

        public Criteria andProductAssocTypeIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_ASSOC_TYPE_ID between", value1, value2, "productAssocTypeId");
            return (Criteria) this;
        }

        public Criteria andProductAssocTypeIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_ASSOC_TYPE_ID not between", value1, value2, "productAssocTypeId");
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

        public Criteria andSequenceNumIsNull() {
            addCriterion("SEQUENCE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andSequenceNumIsNotNull() {
            addCriterion("SEQUENCE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andSequenceNumEqualTo(BigDecimal value) {
            addCriterion("SEQUENCE_NUM =", value, "sequenceNum");
            return (Criteria) this;
        }

        public Criteria andSequenceNumNotEqualTo(BigDecimal value) {
            addCriterion("SEQUENCE_NUM <>", value, "sequenceNum");
            return (Criteria) this;
        }

        public Criteria andSequenceNumGreaterThan(BigDecimal value) {
            addCriterion("SEQUENCE_NUM >", value, "sequenceNum");
            return (Criteria) this;
        }

        public Criteria andSequenceNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SEQUENCE_NUM >=", value, "sequenceNum");
            return (Criteria) this;
        }

        public Criteria andSequenceNumLessThan(BigDecimal value) {
            addCriterion("SEQUENCE_NUM <", value, "sequenceNum");
            return (Criteria) this;
        }

        public Criteria andSequenceNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SEQUENCE_NUM <=", value, "sequenceNum");
            return (Criteria) this;
        }

        public Criteria andSequenceNumIn(List<BigDecimal> values) {
            addCriterion("SEQUENCE_NUM in", values, "sequenceNum");
            return (Criteria) this;
        }

        public Criteria andSequenceNumNotIn(List<BigDecimal> values) {
            addCriterion("SEQUENCE_NUM not in", values, "sequenceNum");
            return (Criteria) this;
        }

        public Criteria andSequenceNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SEQUENCE_NUM between", value1, value2, "sequenceNum");
            return (Criteria) this;
        }

        public Criteria andSequenceNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SEQUENCE_NUM not between", value1, value2, "sequenceNum");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("REASON is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("REASON is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("REASON =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("REASON <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("REASON >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("REASON >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("REASON <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("REASON <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("REASON like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("REASON not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("REASON in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("REASON not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("REASON between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("REASON not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(BigDecimal value) {
            addCriterion("QUANTITY =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(BigDecimal value) {
            addCriterion("QUANTITY <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(BigDecimal value) {
            addCriterion("QUANTITY >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QUANTITY >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(BigDecimal value) {
            addCriterion("QUANTITY <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QUANTITY <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<BigDecimal> values) {
            addCriterion("QUANTITY in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<BigDecimal> values) {
            addCriterion("QUANTITY not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QUANTITY between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QUANTITY not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andScrapFactorIsNull() {
            addCriterion("SCRAP_FACTOR is null");
            return (Criteria) this;
        }

        public Criteria andScrapFactorIsNotNull() {
            addCriterion("SCRAP_FACTOR is not null");
            return (Criteria) this;
        }

        public Criteria andScrapFactorEqualTo(BigDecimal value) {
            addCriterion("SCRAP_FACTOR =", value, "scrapFactor");
            return (Criteria) this;
        }

        public Criteria andScrapFactorNotEqualTo(BigDecimal value) {
            addCriterion("SCRAP_FACTOR <>", value, "scrapFactor");
            return (Criteria) this;
        }

        public Criteria andScrapFactorGreaterThan(BigDecimal value) {
            addCriterion("SCRAP_FACTOR >", value, "scrapFactor");
            return (Criteria) this;
        }

        public Criteria andScrapFactorGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SCRAP_FACTOR >=", value, "scrapFactor");
            return (Criteria) this;
        }

        public Criteria andScrapFactorLessThan(BigDecimal value) {
            addCriterion("SCRAP_FACTOR <", value, "scrapFactor");
            return (Criteria) this;
        }

        public Criteria andScrapFactorLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SCRAP_FACTOR <=", value, "scrapFactor");
            return (Criteria) this;
        }

        public Criteria andScrapFactorIn(List<BigDecimal> values) {
            addCriterion("SCRAP_FACTOR in", values, "scrapFactor");
            return (Criteria) this;
        }

        public Criteria andScrapFactorNotIn(List<BigDecimal> values) {
            addCriterion("SCRAP_FACTOR not in", values, "scrapFactor");
            return (Criteria) this;
        }

        public Criteria andScrapFactorBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCRAP_FACTOR between", value1, value2, "scrapFactor");
            return (Criteria) this;
        }

        public Criteria andScrapFactorNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCRAP_FACTOR not between", value1, value2, "scrapFactor");
            return (Criteria) this;
        }

        public Criteria andInstructionIsNull() {
            addCriterion("INSTRUCTION is null");
            return (Criteria) this;
        }

        public Criteria andInstructionIsNotNull() {
            addCriterion("INSTRUCTION is not null");
            return (Criteria) this;
        }

        public Criteria andInstructionEqualTo(String value) {
            addCriterion("INSTRUCTION =", value, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionNotEqualTo(String value) {
            addCriterion("INSTRUCTION <>", value, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionGreaterThan(String value) {
            addCriterion("INSTRUCTION >", value, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionGreaterThanOrEqualTo(String value) {
            addCriterion("INSTRUCTION >=", value, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionLessThan(String value) {
            addCriterion("INSTRUCTION <", value, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionLessThanOrEqualTo(String value) {
            addCriterion("INSTRUCTION <=", value, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionLike(String value) {
            addCriterion("INSTRUCTION like", value, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionNotLike(String value) {
            addCriterion("INSTRUCTION not like", value, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionIn(List<String> values) {
            addCriterion("INSTRUCTION in", values, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionNotIn(List<String> values) {
            addCriterion("INSTRUCTION not in", values, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionBetween(String value1, String value2) {
            addCriterion("INSTRUCTION between", value1, value2, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionNotBetween(String value1, String value2) {
            addCriterion("INSTRUCTION not between", value1, value2, "instruction");
            return (Criteria) this;
        }

        public Criteria andRoutingWorkEffortIdIsNull() {
            addCriterion("ROUTING_WORK_EFFORT_ID is null");
            return (Criteria) this;
        }

        public Criteria andRoutingWorkEffortIdIsNotNull() {
            addCriterion("ROUTING_WORK_EFFORT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRoutingWorkEffortIdEqualTo(String value) {
            addCriterion("ROUTING_WORK_EFFORT_ID =", value, "routingWorkEffortId");
            return (Criteria) this;
        }

        public Criteria andRoutingWorkEffortIdNotEqualTo(String value) {
            addCriterion("ROUTING_WORK_EFFORT_ID <>", value, "routingWorkEffortId");
            return (Criteria) this;
        }

        public Criteria andRoutingWorkEffortIdGreaterThan(String value) {
            addCriterion("ROUTING_WORK_EFFORT_ID >", value, "routingWorkEffortId");
            return (Criteria) this;
        }

        public Criteria andRoutingWorkEffortIdGreaterThanOrEqualTo(String value) {
            addCriterion("ROUTING_WORK_EFFORT_ID >=", value, "routingWorkEffortId");
            return (Criteria) this;
        }

        public Criteria andRoutingWorkEffortIdLessThan(String value) {
            addCriterion("ROUTING_WORK_EFFORT_ID <", value, "routingWorkEffortId");
            return (Criteria) this;
        }

        public Criteria andRoutingWorkEffortIdLessThanOrEqualTo(String value) {
            addCriterion("ROUTING_WORK_EFFORT_ID <=", value, "routingWorkEffortId");
            return (Criteria) this;
        }

        public Criteria andRoutingWorkEffortIdLike(String value) {
            addCriterion("ROUTING_WORK_EFFORT_ID like", value, "routingWorkEffortId");
            return (Criteria) this;
        }

        public Criteria andRoutingWorkEffortIdNotLike(String value) {
            addCriterion("ROUTING_WORK_EFFORT_ID not like", value, "routingWorkEffortId");
            return (Criteria) this;
        }

        public Criteria andRoutingWorkEffortIdIn(List<String> values) {
            addCriterion("ROUTING_WORK_EFFORT_ID in", values, "routingWorkEffortId");
            return (Criteria) this;
        }

        public Criteria andRoutingWorkEffortIdNotIn(List<String> values) {
            addCriterion("ROUTING_WORK_EFFORT_ID not in", values, "routingWorkEffortId");
            return (Criteria) this;
        }

        public Criteria andRoutingWorkEffortIdBetween(String value1, String value2) {
            addCriterion("ROUTING_WORK_EFFORT_ID between", value1, value2, "routingWorkEffortId");
            return (Criteria) this;
        }

        public Criteria andRoutingWorkEffortIdNotBetween(String value1, String value2) {
            addCriterion("ROUTING_WORK_EFFORT_ID not between", value1, value2, "routingWorkEffortId");
            return (Criteria) this;
        }

        public Criteria andEstimateCalcMethodIsNull() {
            addCriterion("ESTIMATE_CALC_METHOD is null");
            return (Criteria) this;
        }

        public Criteria andEstimateCalcMethodIsNotNull() {
            addCriterion("ESTIMATE_CALC_METHOD is not null");
            return (Criteria) this;
        }

        public Criteria andEstimateCalcMethodEqualTo(String value) {
            addCriterion("ESTIMATE_CALC_METHOD =", value, "estimateCalcMethod");
            return (Criteria) this;
        }

        public Criteria andEstimateCalcMethodNotEqualTo(String value) {
            addCriterion("ESTIMATE_CALC_METHOD <>", value, "estimateCalcMethod");
            return (Criteria) this;
        }

        public Criteria andEstimateCalcMethodGreaterThan(String value) {
            addCriterion("ESTIMATE_CALC_METHOD >", value, "estimateCalcMethod");
            return (Criteria) this;
        }

        public Criteria andEstimateCalcMethodGreaterThanOrEqualTo(String value) {
            addCriterion("ESTIMATE_CALC_METHOD >=", value, "estimateCalcMethod");
            return (Criteria) this;
        }

        public Criteria andEstimateCalcMethodLessThan(String value) {
            addCriterion("ESTIMATE_CALC_METHOD <", value, "estimateCalcMethod");
            return (Criteria) this;
        }

        public Criteria andEstimateCalcMethodLessThanOrEqualTo(String value) {
            addCriterion("ESTIMATE_CALC_METHOD <=", value, "estimateCalcMethod");
            return (Criteria) this;
        }

        public Criteria andEstimateCalcMethodLike(String value) {
            addCriterion("ESTIMATE_CALC_METHOD like", value, "estimateCalcMethod");
            return (Criteria) this;
        }

        public Criteria andEstimateCalcMethodNotLike(String value) {
            addCriterion("ESTIMATE_CALC_METHOD not like", value, "estimateCalcMethod");
            return (Criteria) this;
        }

        public Criteria andEstimateCalcMethodIn(List<String> values) {
            addCriterion("ESTIMATE_CALC_METHOD in", values, "estimateCalcMethod");
            return (Criteria) this;
        }

        public Criteria andEstimateCalcMethodNotIn(List<String> values) {
            addCriterion("ESTIMATE_CALC_METHOD not in", values, "estimateCalcMethod");
            return (Criteria) this;
        }

        public Criteria andEstimateCalcMethodBetween(String value1, String value2) {
            addCriterion("ESTIMATE_CALC_METHOD between", value1, value2, "estimateCalcMethod");
            return (Criteria) this;
        }

        public Criteria andEstimateCalcMethodNotBetween(String value1, String value2) {
            addCriterion("ESTIMATE_CALC_METHOD not between", value1, value2, "estimateCalcMethod");
            return (Criteria) this;
        }

        public Criteria andRecurrenceInfoIdIsNull() {
            addCriterion("RECURRENCE_INFO_ID is null");
            return (Criteria) this;
        }

        public Criteria andRecurrenceInfoIdIsNotNull() {
            addCriterion("RECURRENCE_INFO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRecurrenceInfoIdEqualTo(String value) {
            addCriterion("RECURRENCE_INFO_ID =", value, "recurrenceInfoId");
            return (Criteria) this;
        }

        public Criteria andRecurrenceInfoIdNotEqualTo(String value) {
            addCriterion("RECURRENCE_INFO_ID <>", value, "recurrenceInfoId");
            return (Criteria) this;
        }

        public Criteria andRecurrenceInfoIdGreaterThan(String value) {
            addCriterion("RECURRENCE_INFO_ID >", value, "recurrenceInfoId");
            return (Criteria) this;
        }

        public Criteria andRecurrenceInfoIdGreaterThanOrEqualTo(String value) {
            addCriterion("RECURRENCE_INFO_ID >=", value, "recurrenceInfoId");
            return (Criteria) this;
        }

        public Criteria andRecurrenceInfoIdLessThan(String value) {
            addCriterion("RECURRENCE_INFO_ID <", value, "recurrenceInfoId");
            return (Criteria) this;
        }

        public Criteria andRecurrenceInfoIdLessThanOrEqualTo(String value) {
            addCriterion("RECURRENCE_INFO_ID <=", value, "recurrenceInfoId");
            return (Criteria) this;
        }

        public Criteria andRecurrenceInfoIdLike(String value) {
            addCriterion("RECURRENCE_INFO_ID like", value, "recurrenceInfoId");
            return (Criteria) this;
        }

        public Criteria andRecurrenceInfoIdNotLike(String value) {
            addCriterion("RECURRENCE_INFO_ID not like", value, "recurrenceInfoId");
            return (Criteria) this;
        }

        public Criteria andRecurrenceInfoIdIn(List<String> values) {
            addCriterion("RECURRENCE_INFO_ID in", values, "recurrenceInfoId");
            return (Criteria) this;
        }

        public Criteria andRecurrenceInfoIdNotIn(List<String> values) {
            addCriterion("RECURRENCE_INFO_ID not in", values, "recurrenceInfoId");
            return (Criteria) this;
        }

        public Criteria andRecurrenceInfoIdBetween(String value1, String value2) {
            addCriterion("RECURRENCE_INFO_ID between", value1, value2, "recurrenceInfoId");
            return (Criteria) this;
        }

        public Criteria andRecurrenceInfoIdNotBetween(String value1, String value2) {
            addCriterion("RECURRENCE_INFO_ID not between", value1, value2, "recurrenceInfoId");
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