package org.efbiz.product.cost.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CostComponentCalcExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public CostComponentCalcExample() {
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

        public Criteria andCostComponentCalcIdIsNull() {
            addCriterion("COST_COMPONENT_CALC_ID is null");
            return (Criteria) this;
        }

        public Criteria andCostComponentCalcIdIsNotNull() {
            addCriterion("COST_COMPONENT_CALC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCostComponentCalcIdEqualTo(String value) {
            addCriterion("COST_COMPONENT_CALC_ID =", value, "costComponentCalcId");
            return (Criteria) this;
        }

        public Criteria andCostComponentCalcIdNotEqualTo(String value) {
            addCriterion("COST_COMPONENT_CALC_ID <>", value, "costComponentCalcId");
            return (Criteria) this;
        }

        public Criteria andCostComponentCalcIdGreaterThan(String value) {
            addCriterion("COST_COMPONENT_CALC_ID >", value, "costComponentCalcId");
            return (Criteria) this;
        }

        public Criteria andCostComponentCalcIdGreaterThanOrEqualTo(String value) {
            addCriterion("COST_COMPONENT_CALC_ID >=", value, "costComponentCalcId");
            return (Criteria) this;
        }

        public Criteria andCostComponentCalcIdLessThan(String value) {
            addCriterion("COST_COMPONENT_CALC_ID <", value, "costComponentCalcId");
            return (Criteria) this;
        }

        public Criteria andCostComponentCalcIdLessThanOrEqualTo(String value) {
            addCriterion("COST_COMPONENT_CALC_ID <=", value, "costComponentCalcId");
            return (Criteria) this;
        }

        public Criteria andCostComponentCalcIdLike(String value) {
            addCriterion("COST_COMPONENT_CALC_ID like", value, "costComponentCalcId");
            return (Criteria) this;
        }

        public Criteria andCostComponentCalcIdNotLike(String value) {
            addCriterion("COST_COMPONENT_CALC_ID not like", value, "costComponentCalcId");
            return (Criteria) this;
        }

        public Criteria andCostComponentCalcIdIn(List<String> values) {
            addCriterion("COST_COMPONENT_CALC_ID in", values, "costComponentCalcId");
            return (Criteria) this;
        }

        public Criteria andCostComponentCalcIdNotIn(List<String> values) {
            addCriterion("COST_COMPONENT_CALC_ID not in", values, "costComponentCalcId");
            return (Criteria) this;
        }

        public Criteria andCostComponentCalcIdBetween(String value1, String value2) {
            addCriterion("COST_COMPONENT_CALC_ID between", value1, value2, "costComponentCalcId");
            return (Criteria) this;
        }

        public Criteria andCostComponentCalcIdNotBetween(String value1, String value2) {
            addCriterion("COST_COMPONENT_CALC_ID not between", value1, value2, "costComponentCalcId");
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

        public Criteria andCostGlAccountTypeIdIsNull() {
            addCriterion("COST_GL_ACCOUNT_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCostGlAccountTypeIdIsNotNull() {
            addCriterion("COST_GL_ACCOUNT_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCostGlAccountTypeIdEqualTo(String value) {
            addCriterion("COST_GL_ACCOUNT_TYPE_ID =", value, "costGlAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andCostGlAccountTypeIdNotEqualTo(String value) {
            addCriterion("COST_GL_ACCOUNT_TYPE_ID <>", value, "costGlAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andCostGlAccountTypeIdGreaterThan(String value) {
            addCriterion("COST_GL_ACCOUNT_TYPE_ID >", value, "costGlAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andCostGlAccountTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("COST_GL_ACCOUNT_TYPE_ID >=", value, "costGlAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andCostGlAccountTypeIdLessThan(String value) {
            addCriterion("COST_GL_ACCOUNT_TYPE_ID <", value, "costGlAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andCostGlAccountTypeIdLessThanOrEqualTo(String value) {
            addCriterion("COST_GL_ACCOUNT_TYPE_ID <=", value, "costGlAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andCostGlAccountTypeIdLike(String value) {
            addCriterion("COST_GL_ACCOUNT_TYPE_ID like", value, "costGlAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andCostGlAccountTypeIdNotLike(String value) {
            addCriterion("COST_GL_ACCOUNT_TYPE_ID not like", value, "costGlAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andCostGlAccountTypeIdIn(List<String> values) {
            addCriterion("COST_GL_ACCOUNT_TYPE_ID in", values, "costGlAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andCostGlAccountTypeIdNotIn(List<String> values) {
            addCriterion("COST_GL_ACCOUNT_TYPE_ID not in", values, "costGlAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andCostGlAccountTypeIdBetween(String value1, String value2) {
            addCriterion("COST_GL_ACCOUNT_TYPE_ID between", value1, value2, "costGlAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andCostGlAccountTypeIdNotBetween(String value1, String value2) {
            addCriterion("COST_GL_ACCOUNT_TYPE_ID not between", value1, value2, "costGlAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andOffsettingGlAccountTypeIdIsNull() {
            addCriterion("OFFSETTING_GL_ACCOUNT_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andOffsettingGlAccountTypeIdIsNotNull() {
            addCriterion("OFFSETTING_GL_ACCOUNT_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOffsettingGlAccountTypeIdEqualTo(String value) {
            addCriterion("OFFSETTING_GL_ACCOUNT_TYPE_ID =", value, "offsettingGlAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andOffsettingGlAccountTypeIdNotEqualTo(String value) {
            addCriterion("OFFSETTING_GL_ACCOUNT_TYPE_ID <>", value, "offsettingGlAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andOffsettingGlAccountTypeIdGreaterThan(String value) {
            addCriterion("OFFSETTING_GL_ACCOUNT_TYPE_ID >", value, "offsettingGlAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andOffsettingGlAccountTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("OFFSETTING_GL_ACCOUNT_TYPE_ID >=", value, "offsettingGlAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andOffsettingGlAccountTypeIdLessThan(String value) {
            addCriterion("OFFSETTING_GL_ACCOUNT_TYPE_ID <", value, "offsettingGlAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andOffsettingGlAccountTypeIdLessThanOrEqualTo(String value) {
            addCriterion("OFFSETTING_GL_ACCOUNT_TYPE_ID <=", value, "offsettingGlAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andOffsettingGlAccountTypeIdLike(String value) {
            addCriterion("OFFSETTING_GL_ACCOUNT_TYPE_ID like", value, "offsettingGlAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andOffsettingGlAccountTypeIdNotLike(String value) {
            addCriterion("OFFSETTING_GL_ACCOUNT_TYPE_ID not like", value, "offsettingGlAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andOffsettingGlAccountTypeIdIn(List<String> values) {
            addCriterion("OFFSETTING_GL_ACCOUNT_TYPE_ID in", values, "offsettingGlAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andOffsettingGlAccountTypeIdNotIn(List<String> values) {
            addCriterion("OFFSETTING_GL_ACCOUNT_TYPE_ID not in", values, "offsettingGlAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andOffsettingGlAccountTypeIdBetween(String value1, String value2) {
            addCriterion("OFFSETTING_GL_ACCOUNT_TYPE_ID between", value1, value2, "offsettingGlAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andOffsettingGlAccountTypeIdNotBetween(String value1, String value2) {
            addCriterion("OFFSETTING_GL_ACCOUNT_TYPE_ID not between", value1, value2, "offsettingGlAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andFixedCostIsNull() {
            addCriterion("FIXED_COST is null");
            return (Criteria) this;
        }

        public Criteria andFixedCostIsNotNull() {
            addCriterion("FIXED_COST is not null");
            return (Criteria) this;
        }

        public Criteria andFixedCostEqualTo(BigDecimal value) {
            addCriterion("FIXED_COST =", value, "fixedCost");
            return (Criteria) this;
        }

        public Criteria andFixedCostNotEqualTo(BigDecimal value) {
            addCriterion("FIXED_COST <>", value, "fixedCost");
            return (Criteria) this;
        }

        public Criteria andFixedCostGreaterThan(BigDecimal value) {
            addCriterion("FIXED_COST >", value, "fixedCost");
            return (Criteria) this;
        }

        public Criteria andFixedCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FIXED_COST >=", value, "fixedCost");
            return (Criteria) this;
        }

        public Criteria andFixedCostLessThan(BigDecimal value) {
            addCriterion("FIXED_COST <", value, "fixedCost");
            return (Criteria) this;
        }

        public Criteria andFixedCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FIXED_COST <=", value, "fixedCost");
            return (Criteria) this;
        }

        public Criteria andFixedCostIn(List<BigDecimal> values) {
            addCriterion("FIXED_COST in", values, "fixedCost");
            return (Criteria) this;
        }

        public Criteria andFixedCostNotIn(List<BigDecimal> values) {
            addCriterion("FIXED_COST not in", values, "fixedCost");
            return (Criteria) this;
        }

        public Criteria andFixedCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FIXED_COST between", value1, value2, "fixedCost");
            return (Criteria) this;
        }

        public Criteria andFixedCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FIXED_COST not between", value1, value2, "fixedCost");
            return (Criteria) this;
        }

        public Criteria andVariableCostIsNull() {
            addCriterion("VARIABLE_COST is null");
            return (Criteria) this;
        }

        public Criteria andVariableCostIsNotNull() {
            addCriterion("VARIABLE_COST is not null");
            return (Criteria) this;
        }

        public Criteria andVariableCostEqualTo(BigDecimal value) {
            addCriterion("VARIABLE_COST =", value, "variableCost");
            return (Criteria) this;
        }

        public Criteria andVariableCostNotEqualTo(BigDecimal value) {
            addCriterion("VARIABLE_COST <>", value, "variableCost");
            return (Criteria) this;
        }

        public Criteria andVariableCostGreaterThan(BigDecimal value) {
            addCriterion("VARIABLE_COST >", value, "variableCost");
            return (Criteria) this;
        }

        public Criteria andVariableCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VARIABLE_COST >=", value, "variableCost");
            return (Criteria) this;
        }

        public Criteria andVariableCostLessThan(BigDecimal value) {
            addCriterion("VARIABLE_COST <", value, "variableCost");
            return (Criteria) this;
        }

        public Criteria andVariableCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VARIABLE_COST <=", value, "variableCost");
            return (Criteria) this;
        }

        public Criteria andVariableCostIn(List<BigDecimal> values) {
            addCriterion("VARIABLE_COST in", values, "variableCost");
            return (Criteria) this;
        }

        public Criteria andVariableCostNotIn(List<BigDecimal> values) {
            addCriterion("VARIABLE_COST not in", values, "variableCost");
            return (Criteria) this;
        }

        public Criteria andVariableCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VARIABLE_COST between", value1, value2, "variableCost");
            return (Criteria) this;
        }

        public Criteria andVariableCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VARIABLE_COST not between", value1, value2, "variableCost");
            return (Criteria) this;
        }

        public Criteria andPerMilliSecondIsNull() {
            addCriterion("PER_MILLI_SECOND is null");
            return (Criteria) this;
        }

        public Criteria andPerMilliSecondIsNotNull() {
            addCriterion("PER_MILLI_SECOND is not null");
            return (Criteria) this;
        }

        public Criteria andPerMilliSecondEqualTo(BigDecimal value) {
            addCriterion("PER_MILLI_SECOND =", value, "perMilliSecond");
            return (Criteria) this;
        }

        public Criteria andPerMilliSecondNotEqualTo(BigDecimal value) {
            addCriterion("PER_MILLI_SECOND <>", value, "perMilliSecond");
            return (Criteria) this;
        }

        public Criteria andPerMilliSecondGreaterThan(BigDecimal value) {
            addCriterion("PER_MILLI_SECOND >", value, "perMilliSecond");
            return (Criteria) this;
        }

        public Criteria andPerMilliSecondGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PER_MILLI_SECOND >=", value, "perMilliSecond");
            return (Criteria) this;
        }

        public Criteria andPerMilliSecondLessThan(BigDecimal value) {
            addCriterion("PER_MILLI_SECOND <", value, "perMilliSecond");
            return (Criteria) this;
        }

        public Criteria andPerMilliSecondLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PER_MILLI_SECOND <=", value, "perMilliSecond");
            return (Criteria) this;
        }

        public Criteria andPerMilliSecondIn(List<BigDecimal> values) {
            addCriterion("PER_MILLI_SECOND in", values, "perMilliSecond");
            return (Criteria) this;
        }

        public Criteria andPerMilliSecondNotIn(List<BigDecimal> values) {
            addCriterion("PER_MILLI_SECOND not in", values, "perMilliSecond");
            return (Criteria) this;
        }

        public Criteria andPerMilliSecondBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PER_MILLI_SECOND between", value1, value2, "perMilliSecond");
            return (Criteria) this;
        }

        public Criteria andPerMilliSecondNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PER_MILLI_SECOND not between", value1, value2, "perMilliSecond");
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

        public Criteria andCostCustomMethodIdIsNull() {
            addCriterion("COST_CUSTOM_METHOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andCostCustomMethodIdIsNotNull() {
            addCriterion("COST_CUSTOM_METHOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCostCustomMethodIdEqualTo(String value) {
            addCriterion("COST_CUSTOM_METHOD_ID =", value, "costCustomMethodId");
            return (Criteria) this;
        }

        public Criteria andCostCustomMethodIdNotEqualTo(String value) {
            addCriterion("COST_CUSTOM_METHOD_ID <>", value, "costCustomMethodId");
            return (Criteria) this;
        }

        public Criteria andCostCustomMethodIdGreaterThan(String value) {
            addCriterion("COST_CUSTOM_METHOD_ID >", value, "costCustomMethodId");
            return (Criteria) this;
        }

        public Criteria andCostCustomMethodIdGreaterThanOrEqualTo(String value) {
            addCriterion("COST_CUSTOM_METHOD_ID >=", value, "costCustomMethodId");
            return (Criteria) this;
        }

        public Criteria andCostCustomMethodIdLessThan(String value) {
            addCriterion("COST_CUSTOM_METHOD_ID <", value, "costCustomMethodId");
            return (Criteria) this;
        }

        public Criteria andCostCustomMethodIdLessThanOrEqualTo(String value) {
            addCriterion("COST_CUSTOM_METHOD_ID <=", value, "costCustomMethodId");
            return (Criteria) this;
        }

        public Criteria andCostCustomMethodIdLike(String value) {
            addCriterion("COST_CUSTOM_METHOD_ID like", value, "costCustomMethodId");
            return (Criteria) this;
        }

        public Criteria andCostCustomMethodIdNotLike(String value) {
            addCriterion("COST_CUSTOM_METHOD_ID not like", value, "costCustomMethodId");
            return (Criteria) this;
        }

        public Criteria andCostCustomMethodIdIn(List<String> values) {
            addCriterion("COST_CUSTOM_METHOD_ID in", values, "costCustomMethodId");
            return (Criteria) this;
        }

        public Criteria andCostCustomMethodIdNotIn(List<String> values) {
            addCriterion("COST_CUSTOM_METHOD_ID not in", values, "costCustomMethodId");
            return (Criteria) this;
        }

        public Criteria andCostCustomMethodIdBetween(String value1, String value2) {
            addCriterion("COST_CUSTOM_METHOD_ID between", value1, value2, "costCustomMethodId");
            return (Criteria) this;
        }

        public Criteria andCostCustomMethodIdNotBetween(String value1, String value2) {
            addCriterion("COST_CUSTOM_METHOD_ID not between", value1, value2, "costCustomMethodId");
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