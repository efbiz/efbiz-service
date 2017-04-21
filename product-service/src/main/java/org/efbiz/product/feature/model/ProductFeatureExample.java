package org.efbiz.product.feature.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductFeatureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public ProductFeatureExample() {
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

        public Criteria andProductFeatureTypeIdIsNull() {
            addCriterion("PRODUCT_FEATURE_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductFeatureTypeIdIsNotNull() {
            addCriterion("PRODUCT_FEATURE_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductFeatureTypeIdEqualTo(String value) {
            addCriterion("PRODUCT_FEATURE_TYPE_ID =", value, "productFeatureTypeId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureTypeIdNotEqualTo(String value) {
            addCriterion("PRODUCT_FEATURE_TYPE_ID <>", value, "productFeatureTypeId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureTypeIdGreaterThan(String value) {
            addCriterion("PRODUCT_FEATURE_TYPE_ID >", value, "productFeatureTypeId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_FEATURE_TYPE_ID >=", value, "productFeatureTypeId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureTypeIdLessThan(String value) {
            addCriterion("PRODUCT_FEATURE_TYPE_ID <", value, "productFeatureTypeId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureTypeIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_FEATURE_TYPE_ID <=", value, "productFeatureTypeId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureTypeIdLike(String value) {
            addCriterion("PRODUCT_FEATURE_TYPE_ID like", value, "productFeatureTypeId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureTypeIdNotLike(String value) {
            addCriterion("PRODUCT_FEATURE_TYPE_ID not like", value, "productFeatureTypeId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureTypeIdIn(List<String> values) {
            addCriterion("PRODUCT_FEATURE_TYPE_ID in", values, "productFeatureTypeId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureTypeIdNotIn(List<String> values) {
            addCriterion("PRODUCT_FEATURE_TYPE_ID not in", values, "productFeatureTypeId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureTypeIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_FEATURE_TYPE_ID between", value1, value2, "productFeatureTypeId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureTypeIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_FEATURE_TYPE_ID not between", value1, value2, "productFeatureTypeId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureCategoryIdIsNull() {
            addCriterion("PRODUCT_FEATURE_CATEGORY_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductFeatureCategoryIdIsNotNull() {
            addCriterion("PRODUCT_FEATURE_CATEGORY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductFeatureCategoryIdEqualTo(String value) {
            addCriterion("PRODUCT_FEATURE_CATEGORY_ID =", value, "productFeatureCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureCategoryIdNotEqualTo(String value) {
            addCriterion("PRODUCT_FEATURE_CATEGORY_ID <>", value, "productFeatureCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureCategoryIdGreaterThan(String value) {
            addCriterion("PRODUCT_FEATURE_CATEGORY_ID >", value, "productFeatureCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureCategoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_FEATURE_CATEGORY_ID >=", value, "productFeatureCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureCategoryIdLessThan(String value) {
            addCriterion("PRODUCT_FEATURE_CATEGORY_ID <", value, "productFeatureCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureCategoryIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_FEATURE_CATEGORY_ID <=", value, "productFeatureCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureCategoryIdLike(String value) {
            addCriterion("PRODUCT_FEATURE_CATEGORY_ID like", value, "productFeatureCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureCategoryIdNotLike(String value) {
            addCriterion("PRODUCT_FEATURE_CATEGORY_ID not like", value, "productFeatureCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureCategoryIdIn(List<String> values) {
            addCriterion("PRODUCT_FEATURE_CATEGORY_ID in", values, "productFeatureCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureCategoryIdNotIn(List<String> values) {
            addCriterion("PRODUCT_FEATURE_CATEGORY_ID not in", values, "productFeatureCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureCategoryIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_FEATURE_CATEGORY_ID between", value1, value2, "productFeatureCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureCategoryIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_FEATURE_CATEGORY_ID not between", value1, value2, "productFeatureCategoryId");
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

        public Criteria andNumberSpecifiedIsNull() {
            addCriterion("NUMBER_SPECIFIED is null");
            return (Criteria) this;
        }

        public Criteria andNumberSpecifiedIsNotNull() {
            addCriterion("NUMBER_SPECIFIED is not null");
            return (Criteria) this;
        }

        public Criteria andNumberSpecifiedEqualTo(BigDecimal value) {
            addCriterion("NUMBER_SPECIFIED =", value, "numberSpecified");
            return (Criteria) this;
        }

        public Criteria andNumberSpecifiedNotEqualTo(BigDecimal value) {
            addCriterion("NUMBER_SPECIFIED <>", value, "numberSpecified");
            return (Criteria) this;
        }

        public Criteria andNumberSpecifiedGreaterThan(BigDecimal value) {
            addCriterion("NUMBER_SPECIFIED >", value, "numberSpecified");
            return (Criteria) this;
        }

        public Criteria andNumberSpecifiedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NUMBER_SPECIFIED >=", value, "numberSpecified");
            return (Criteria) this;
        }

        public Criteria andNumberSpecifiedLessThan(BigDecimal value) {
            addCriterion("NUMBER_SPECIFIED <", value, "numberSpecified");
            return (Criteria) this;
        }

        public Criteria andNumberSpecifiedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NUMBER_SPECIFIED <=", value, "numberSpecified");
            return (Criteria) this;
        }

        public Criteria andNumberSpecifiedIn(List<BigDecimal> values) {
            addCriterion("NUMBER_SPECIFIED in", values, "numberSpecified");
            return (Criteria) this;
        }

        public Criteria andNumberSpecifiedNotIn(List<BigDecimal> values) {
            addCriterion("NUMBER_SPECIFIED not in", values, "numberSpecified");
            return (Criteria) this;
        }

        public Criteria andNumberSpecifiedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUMBER_SPECIFIED between", value1, value2, "numberSpecified");
            return (Criteria) this;
        }

        public Criteria andNumberSpecifiedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUMBER_SPECIFIED not between", value1, value2, "numberSpecified");
            return (Criteria) this;
        }

        public Criteria andDefaultAmountIsNull() {
            addCriterion("DEFAULT_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andDefaultAmountIsNotNull() {
            addCriterion("DEFAULT_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultAmountEqualTo(BigDecimal value) {
            addCriterion("DEFAULT_AMOUNT =", value, "defaultAmount");
            return (Criteria) this;
        }

        public Criteria andDefaultAmountNotEqualTo(BigDecimal value) {
            addCriterion("DEFAULT_AMOUNT <>", value, "defaultAmount");
            return (Criteria) this;
        }

        public Criteria andDefaultAmountGreaterThan(BigDecimal value) {
            addCriterion("DEFAULT_AMOUNT >", value, "defaultAmount");
            return (Criteria) this;
        }

        public Criteria andDefaultAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DEFAULT_AMOUNT >=", value, "defaultAmount");
            return (Criteria) this;
        }

        public Criteria andDefaultAmountLessThan(BigDecimal value) {
            addCriterion("DEFAULT_AMOUNT <", value, "defaultAmount");
            return (Criteria) this;
        }

        public Criteria andDefaultAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DEFAULT_AMOUNT <=", value, "defaultAmount");
            return (Criteria) this;
        }

        public Criteria andDefaultAmountIn(List<BigDecimal> values) {
            addCriterion("DEFAULT_AMOUNT in", values, "defaultAmount");
            return (Criteria) this;
        }

        public Criteria andDefaultAmountNotIn(List<BigDecimal> values) {
            addCriterion("DEFAULT_AMOUNT not in", values, "defaultAmount");
            return (Criteria) this;
        }

        public Criteria andDefaultAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEFAULT_AMOUNT between", value1, value2, "defaultAmount");
            return (Criteria) this;
        }

        public Criteria andDefaultAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEFAULT_AMOUNT not between", value1, value2, "defaultAmount");
            return (Criteria) this;
        }

        public Criteria andDefaultSequenceNumIsNull() {
            addCriterion("DEFAULT_SEQUENCE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andDefaultSequenceNumIsNotNull() {
            addCriterion("DEFAULT_SEQUENCE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultSequenceNumEqualTo(BigDecimal value) {
            addCriterion("DEFAULT_SEQUENCE_NUM =", value, "defaultSequenceNum");
            return (Criteria) this;
        }

        public Criteria andDefaultSequenceNumNotEqualTo(BigDecimal value) {
            addCriterion("DEFAULT_SEQUENCE_NUM <>", value, "defaultSequenceNum");
            return (Criteria) this;
        }

        public Criteria andDefaultSequenceNumGreaterThan(BigDecimal value) {
            addCriterion("DEFAULT_SEQUENCE_NUM >", value, "defaultSequenceNum");
            return (Criteria) this;
        }

        public Criteria andDefaultSequenceNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DEFAULT_SEQUENCE_NUM >=", value, "defaultSequenceNum");
            return (Criteria) this;
        }

        public Criteria andDefaultSequenceNumLessThan(BigDecimal value) {
            addCriterion("DEFAULT_SEQUENCE_NUM <", value, "defaultSequenceNum");
            return (Criteria) this;
        }

        public Criteria andDefaultSequenceNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DEFAULT_SEQUENCE_NUM <=", value, "defaultSequenceNum");
            return (Criteria) this;
        }

        public Criteria andDefaultSequenceNumIn(List<BigDecimal> values) {
            addCriterion("DEFAULT_SEQUENCE_NUM in", values, "defaultSequenceNum");
            return (Criteria) this;
        }

        public Criteria andDefaultSequenceNumNotIn(List<BigDecimal> values) {
            addCriterion("DEFAULT_SEQUENCE_NUM not in", values, "defaultSequenceNum");
            return (Criteria) this;
        }

        public Criteria andDefaultSequenceNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEFAULT_SEQUENCE_NUM between", value1, value2, "defaultSequenceNum");
            return (Criteria) this;
        }

        public Criteria andDefaultSequenceNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEFAULT_SEQUENCE_NUM not between", value1, value2, "defaultSequenceNum");
            return (Criteria) this;
        }

        public Criteria andAbbrevIsNull() {
            addCriterion("ABBREV is null");
            return (Criteria) this;
        }

        public Criteria andAbbrevIsNotNull() {
            addCriterion("ABBREV is not null");
            return (Criteria) this;
        }

        public Criteria andAbbrevEqualTo(String value) {
            addCriterion("ABBREV =", value, "abbrev");
            return (Criteria) this;
        }

        public Criteria andAbbrevNotEqualTo(String value) {
            addCriterion("ABBREV <>", value, "abbrev");
            return (Criteria) this;
        }

        public Criteria andAbbrevGreaterThan(String value) {
            addCriterion("ABBREV >", value, "abbrev");
            return (Criteria) this;
        }

        public Criteria andAbbrevGreaterThanOrEqualTo(String value) {
            addCriterion("ABBREV >=", value, "abbrev");
            return (Criteria) this;
        }

        public Criteria andAbbrevLessThan(String value) {
            addCriterion("ABBREV <", value, "abbrev");
            return (Criteria) this;
        }

        public Criteria andAbbrevLessThanOrEqualTo(String value) {
            addCriterion("ABBREV <=", value, "abbrev");
            return (Criteria) this;
        }

        public Criteria andAbbrevLike(String value) {
            addCriterion("ABBREV like", value, "abbrev");
            return (Criteria) this;
        }

        public Criteria andAbbrevNotLike(String value) {
            addCriterion("ABBREV not like", value, "abbrev");
            return (Criteria) this;
        }

        public Criteria andAbbrevIn(List<String> values) {
            addCriterion("ABBREV in", values, "abbrev");
            return (Criteria) this;
        }

        public Criteria andAbbrevNotIn(List<String> values) {
            addCriterion("ABBREV not in", values, "abbrev");
            return (Criteria) this;
        }

        public Criteria andAbbrevBetween(String value1, String value2) {
            addCriterion("ABBREV between", value1, value2, "abbrev");
            return (Criteria) this;
        }

        public Criteria andAbbrevNotBetween(String value1, String value2) {
            addCriterion("ABBREV not between", value1, value2, "abbrev");
            return (Criteria) this;
        }

        public Criteria andIdCodeIsNull() {
            addCriterion("ID_CODE is null");
            return (Criteria) this;
        }

        public Criteria andIdCodeIsNotNull() {
            addCriterion("ID_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andIdCodeEqualTo(String value) {
            addCriterion("ID_CODE =", value, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeNotEqualTo(String value) {
            addCriterion("ID_CODE <>", value, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeGreaterThan(String value) {
            addCriterion("ID_CODE >", value, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ID_CODE >=", value, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeLessThan(String value) {
            addCriterion("ID_CODE <", value, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeLessThanOrEqualTo(String value) {
            addCriterion("ID_CODE <=", value, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeLike(String value) {
            addCriterion("ID_CODE like", value, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeNotLike(String value) {
            addCriterion("ID_CODE not like", value, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeIn(List<String> values) {
            addCriterion("ID_CODE in", values, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeNotIn(List<String> values) {
            addCriterion("ID_CODE not in", values, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeBetween(String value1, String value2) {
            addCriterion("ID_CODE between", value1, value2, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeNotBetween(String value1, String value2) {
            addCriterion("ID_CODE not between", value1, value2, "idCode");
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