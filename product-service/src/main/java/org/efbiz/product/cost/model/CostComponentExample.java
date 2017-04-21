package org.efbiz.product.cost.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CostComponentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public CostComponentExample() {
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

        public Criteria andCostComponentIdIsNull() {
            addCriterion("COST_COMPONENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andCostComponentIdIsNotNull() {
            addCriterion("COST_COMPONENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCostComponentIdEqualTo(String value) {
            addCriterion("COST_COMPONENT_ID =", value, "costComponentId");
            return (Criteria) this;
        }

        public Criteria andCostComponentIdNotEqualTo(String value) {
            addCriterion("COST_COMPONENT_ID <>", value, "costComponentId");
            return (Criteria) this;
        }

        public Criteria andCostComponentIdGreaterThan(String value) {
            addCriterion("COST_COMPONENT_ID >", value, "costComponentId");
            return (Criteria) this;
        }

        public Criteria andCostComponentIdGreaterThanOrEqualTo(String value) {
            addCriterion("COST_COMPONENT_ID >=", value, "costComponentId");
            return (Criteria) this;
        }

        public Criteria andCostComponentIdLessThan(String value) {
            addCriterion("COST_COMPONENT_ID <", value, "costComponentId");
            return (Criteria) this;
        }

        public Criteria andCostComponentIdLessThanOrEqualTo(String value) {
            addCriterion("COST_COMPONENT_ID <=", value, "costComponentId");
            return (Criteria) this;
        }

        public Criteria andCostComponentIdLike(String value) {
            addCriterion("COST_COMPONENT_ID like", value, "costComponentId");
            return (Criteria) this;
        }

        public Criteria andCostComponentIdNotLike(String value) {
            addCriterion("COST_COMPONENT_ID not like", value, "costComponentId");
            return (Criteria) this;
        }

        public Criteria andCostComponentIdIn(List<String> values) {
            addCriterion("COST_COMPONENT_ID in", values, "costComponentId");
            return (Criteria) this;
        }

        public Criteria andCostComponentIdNotIn(List<String> values) {
            addCriterion("COST_COMPONENT_ID not in", values, "costComponentId");
            return (Criteria) this;
        }

        public Criteria andCostComponentIdBetween(String value1, String value2) {
            addCriterion("COST_COMPONENT_ID between", value1, value2, "costComponentId");
            return (Criteria) this;
        }

        public Criteria andCostComponentIdNotBetween(String value1, String value2) {
            addCriterion("COST_COMPONENT_ID not between", value1, value2, "costComponentId");
            return (Criteria) this;
        }

        public Criteria andCostComponentTypeIdIsNull() {
            addCriterion("COST_COMPONENT_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCostComponentTypeIdIsNotNull() {
            addCriterion("COST_COMPONENT_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCostComponentTypeIdEqualTo(String value) {
            addCriterion("COST_COMPONENT_TYPE_ID =", value, "costComponentTypeId");
            return (Criteria) this;
        }

        public Criteria andCostComponentTypeIdNotEqualTo(String value) {
            addCriterion("COST_COMPONENT_TYPE_ID <>", value, "costComponentTypeId");
            return (Criteria) this;
        }

        public Criteria andCostComponentTypeIdGreaterThan(String value) {
            addCriterion("COST_COMPONENT_TYPE_ID >", value, "costComponentTypeId");
            return (Criteria) this;
        }

        public Criteria andCostComponentTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("COST_COMPONENT_TYPE_ID >=", value, "costComponentTypeId");
            return (Criteria) this;
        }

        public Criteria andCostComponentTypeIdLessThan(String value) {
            addCriterion("COST_COMPONENT_TYPE_ID <", value, "costComponentTypeId");
            return (Criteria) this;
        }

        public Criteria andCostComponentTypeIdLessThanOrEqualTo(String value) {
            addCriterion("COST_COMPONENT_TYPE_ID <=", value, "costComponentTypeId");
            return (Criteria) this;
        }

        public Criteria andCostComponentTypeIdLike(String value) {
            addCriterion("COST_COMPONENT_TYPE_ID like", value, "costComponentTypeId");
            return (Criteria) this;
        }

        public Criteria andCostComponentTypeIdNotLike(String value) {
            addCriterion("COST_COMPONENT_TYPE_ID not like", value, "costComponentTypeId");
            return (Criteria) this;
        }

        public Criteria andCostComponentTypeIdIn(List<String> values) {
            addCriterion("COST_COMPONENT_TYPE_ID in", values, "costComponentTypeId");
            return (Criteria) this;
        }

        public Criteria andCostComponentTypeIdNotIn(List<String> values) {
            addCriterion("COST_COMPONENT_TYPE_ID not in", values, "costComponentTypeId");
            return (Criteria) this;
        }

        public Criteria andCostComponentTypeIdBetween(String value1, String value2) {
            addCriterion("COST_COMPONENT_TYPE_ID between", value1, value2, "costComponentTypeId");
            return (Criteria) this;
        }

        public Criteria andCostComponentTypeIdNotBetween(String value1, String value2) {
            addCriterion("COST_COMPONENT_TYPE_ID not between", value1, value2, "costComponentTypeId");
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

        public Criteria andProductFeatureIdIsNull() {
            addCriterion("PRODUCT_FEATURE_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductFeatureIdIsNotNull() {
            addCriterion("PRODUCT_FEATURE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductFeatureIdEqualTo(String value) {
            addCriterion("PRODUCT_FEATURE_ID =", value, "productFeatureId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureIdNotEqualTo(String value) {
            addCriterion("PRODUCT_FEATURE_ID <>", value, "productFeatureId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureIdGreaterThan(String value) {
            addCriterion("PRODUCT_FEATURE_ID >", value, "productFeatureId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_FEATURE_ID >=", value, "productFeatureId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureIdLessThan(String value) {
            addCriterion("PRODUCT_FEATURE_ID <", value, "productFeatureId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_FEATURE_ID <=", value, "productFeatureId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureIdLike(String value) {
            addCriterion("PRODUCT_FEATURE_ID like", value, "productFeatureId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureIdNotLike(String value) {
            addCriterion("PRODUCT_FEATURE_ID not like", value, "productFeatureId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureIdIn(List<String> values) {
            addCriterion("PRODUCT_FEATURE_ID in", values, "productFeatureId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureIdNotIn(List<String> values) {
            addCriterion("PRODUCT_FEATURE_ID not in", values, "productFeatureId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_FEATURE_ID between", value1, value2, "productFeatureId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_FEATURE_ID not between", value1, value2, "productFeatureId");
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

        public Criteria andGeoIdIsNull() {
            addCriterion("GEO_ID is null");
            return (Criteria) this;
        }

        public Criteria andGeoIdIsNotNull() {
            addCriterion("GEO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGeoIdEqualTo(String value) {
            addCriterion("GEO_ID =", value, "geoId");
            return (Criteria) this;
        }

        public Criteria andGeoIdNotEqualTo(String value) {
            addCriterion("GEO_ID <>", value, "geoId");
            return (Criteria) this;
        }

        public Criteria andGeoIdGreaterThan(String value) {
            addCriterion("GEO_ID >", value, "geoId");
            return (Criteria) this;
        }

        public Criteria andGeoIdGreaterThanOrEqualTo(String value) {
            addCriterion("GEO_ID >=", value, "geoId");
            return (Criteria) this;
        }

        public Criteria andGeoIdLessThan(String value) {
            addCriterion("GEO_ID <", value, "geoId");
            return (Criteria) this;
        }

        public Criteria andGeoIdLessThanOrEqualTo(String value) {
            addCriterion("GEO_ID <=", value, "geoId");
            return (Criteria) this;
        }

        public Criteria andGeoIdLike(String value) {
            addCriterion("GEO_ID like", value, "geoId");
            return (Criteria) this;
        }

        public Criteria andGeoIdNotLike(String value) {
            addCriterion("GEO_ID not like", value, "geoId");
            return (Criteria) this;
        }

        public Criteria andGeoIdIn(List<String> values) {
            addCriterion("GEO_ID in", values, "geoId");
            return (Criteria) this;
        }

        public Criteria andGeoIdNotIn(List<String> values) {
            addCriterion("GEO_ID not in", values, "geoId");
            return (Criteria) this;
        }

        public Criteria andGeoIdBetween(String value1, String value2) {
            addCriterion("GEO_ID between", value1, value2, "geoId");
            return (Criteria) this;
        }

        public Criteria andGeoIdNotBetween(String value1, String value2) {
            addCriterion("GEO_ID not between", value1, value2, "geoId");
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

        public Criteria andCostIsNull() {
            addCriterion("COST is null");
            return (Criteria) this;
        }

        public Criteria andCostIsNotNull() {
            addCriterion("COST is not null");
            return (Criteria) this;
        }

        public Criteria andCostEqualTo(BigDecimal value) {
            addCriterion("COST =", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotEqualTo(BigDecimal value) {
            addCriterion("COST <>", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThan(BigDecimal value) {
            addCriterion("COST >", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COST >=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThan(BigDecimal value) {
            addCriterion("COST <", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COST <=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostIn(List<BigDecimal> values) {
            addCriterion("COST in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotIn(List<BigDecimal> values) {
            addCriterion("COST not in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COST between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COST not between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andCostUomIdIsNull() {
            addCriterion("COST_UOM_ID is null");
            return (Criteria) this;
        }

        public Criteria andCostUomIdIsNotNull() {
            addCriterion("COST_UOM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCostUomIdEqualTo(String value) {
            addCriterion("COST_UOM_ID =", value, "costUomId");
            return (Criteria) this;
        }

        public Criteria andCostUomIdNotEqualTo(String value) {
            addCriterion("COST_UOM_ID <>", value, "costUomId");
            return (Criteria) this;
        }

        public Criteria andCostUomIdGreaterThan(String value) {
            addCriterion("COST_UOM_ID >", value, "costUomId");
            return (Criteria) this;
        }

        public Criteria andCostUomIdGreaterThanOrEqualTo(String value) {
            addCriterion("COST_UOM_ID >=", value, "costUomId");
            return (Criteria) this;
        }

        public Criteria andCostUomIdLessThan(String value) {
            addCriterion("COST_UOM_ID <", value, "costUomId");
            return (Criteria) this;
        }

        public Criteria andCostUomIdLessThanOrEqualTo(String value) {
            addCriterion("COST_UOM_ID <=", value, "costUomId");
            return (Criteria) this;
        }

        public Criteria andCostUomIdLike(String value) {
            addCriterion("COST_UOM_ID like", value, "costUomId");
            return (Criteria) this;
        }

        public Criteria andCostUomIdNotLike(String value) {
            addCriterion("COST_UOM_ID not like", value, "costUomId");
            return (Criteria) this;
        }

        public Criteria andCostUomIdIn(List<String> values) {
            addCriterion("COST_UOM_ID in", values, "costUomId");
            return (Criteria) this;
        }

        public Criteria andCostUomIdNotIn(List<String> values) {
            addCriterion("COST_UOM_ID not in", values, "costUomId");
            return (Criteria) this;
        }

        public Criteria andCostUomIdBetween(String value1, String value2) {
            addCriterion("COST_UOM_ID between", value1, value2, "costUomId");
            return (Criteria) this;
        }

        public Criteria andCostUomIdNotBetween(String value1, String value2) {
            addCriterion("COST_UOM_ID not between", value1, value2, "costUomId");
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