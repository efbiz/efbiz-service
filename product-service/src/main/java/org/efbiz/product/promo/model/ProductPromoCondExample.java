package org.efbiz.product.promo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductPromoCondExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public ProductPromoCondExample() {
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

        public Criteria andProductPromoIdIsNull() {
            addCriterion("PRODUCT_PROMO_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductPromoIdIsNotNull() {
            addCriterion("PRODUCT_PROMO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductPromoIdEqualTo(String value) {
            addCriterion("PRODUCT_PROMO_ID =", value, "productPromoId");
            return (Criteria) this;
        }

        public Criteria andProductPromoIdNotEqualTo(String value) {
            addCriterion("PRODUCT_PROMO_ID <>", value, "productPromoId");
            return (Criteria) this;
        }

        public Criteria andProductPromoIdGreaterThan(String value) {
            addCriterion("PRODUCT_PROMO_ID >", value, "productPromoId");
            return (Criteria) this;
        }

        public Criteria andProductPromoIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_PROMO_ID >=", value, "productPromoId");
            return (Criteria) this;
        }

        public Criteria andProductPromoIdLessThan(String value) {
            addCriterion("PRODUCT_PROMO_ID <", value, "productPromoId");
            return (Criteria) this;
        }

        public Criteria andProductPromoIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_PROMO_ID <=", value, "productPromoId");
            return (Criteria) this;
        }

        public Criteria andProductPromoIdLike(String value) {
            addCriterion("PRODUCT_PROMO_ID like", value, "productPromoId");
            return (Criteria) this;
        }

        public Criteria andProductPromoIdNotLike(String value) {
            addCriterion("PRODUCT_PROMO_ID not like", value, "productPromoId");
            return (Criteria) this;
        }

        public Criteria andProductPromoIdIn(List<String> values) {
            addCriterion("PRODUCT_PROMO_ID in", values, "productPromoId");
            return (Criteria) this;
        }

        public Criteria andProductPromoIdNotIn(List<String> values) {
            addCriterion("PRODUCT_PROMO_ID not in", values, "productPromoId");
            return (Criteria) this;
        }

        public Criteria andProductPromoIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_PROMO_ID between", value1, value2, "productPromoId");
            return (Criteria) this;
        }

        public Criteria andProductPromoIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_PROMO_ID not between", value1, value2, "productPromoId");
            return (Criteria) this;
        }

        public Criteria andProductPromoRuleIdIsNull() {
            addCriterion("PRODUCT_PROMO_RULE_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductPromoRuleIdIsNotNull() {
            addCriterion("PRODUCT_PROMO_RULE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductPromoRuleIdEqualTo(String value) {
            addCriterion("PRODUCT_PROMO_RULE_ID =", value, "productPromoRuleId");
            return (Criteria) this;
        }

        public Criteria andProductPromoRuleIdNotEqualTo(String value) {
            addCriterion("PRODUCT_PROMO_RULE_ID <>", value, "productPromoRuleId");
            return (Criteria) this;
        }

        public Criteria andProductPromoRuleIdGreaterThan(String value) {
            addCriterion("PRODUCT_PROMO_RULE_ID >", value, "productPromoRuleId");
            return (Criteria) this;
        }

        public Criteria andProductPromoRuleIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_PROMO_RULE_ID >=", value, "productPromoRuleId");
            return (Criteria) this;
        }

        public Criteria andProductPromoRuleIdLessThan(String value) {
            addCriterion("PRODUCT_PROMO_RULE_ID <", value, "productPromoRuleId");
            return (Criteria) this;
        }

        public Criteria andProductPromoRuleIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_PROMO_RULE_ID <=", value, "productPromoRuleId");
            return (Criteria) this;
        }

        public Criteria andProductPromoRuleIdLike(String value) {
            addCriterion("PRODUCT_PROMO_RULE_ID like", value, "productPromoRuleId");
            return (Criteria) this;
        }

        public Criteria andProductPromoRuleIdNotLike(String value) {
            addCriterion("PRODUCT_PROMO_RULE_ID not like", value, "productPromoRuleId");
            return (Criteria) this;
        }

        public Criteria andProductPromoRuleIdIn(List<String> values) {
            addCriterion("PRODUCT_PROMO_RULE_ID in", values, "productPromoRuleId");
            return (Criteria) this;
        }

        public Criteria andProductPromoRuleIdNotIn(List<String> values) {
            addCriterion("PRODUCT_PROMO_RULE_ID not in", values, "productPromoRuleId");
            return (Criteria) this;
        }

        public Criteria andProductPromoRuleIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_PROMO_RULE_ID between", value1, value2, "productPromoRuleId");
            return (Criteria) this;
        }

        public Criteria andProductPromoRuleIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_PROMO_RULE_ID not between", value1, value2, "productPromoRuleId");
            return (Criteria) this;
        }

        public Criteria andProductPromoCondSeqIdIsNull() {
            addCriterion("PRODUCT_PROMO_COND_SEQ_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductPromoCondSeqIdIsNotNull() {
            addCriterion("PRODUCT_PROMO_COND_SEQ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductPromoCondSeqIdEqualTo(String value) {
            addCriterion("PRODUCT_PROMO_COND_SEQ_ID =", value, "productPromoCondSeqId");
            return (Criteria) this;
        }

        public Criteria andProductPromoCondSeqIdNotEqualTo(String value) {
            addCriterion("PRODUCT_PROMO_COND_SEQ_ID <>", value, "productPromoCondSeqId");
            return (Criteria) this;
        }

        public Criteria andProductPromoCondSeqIdGreaterThan(String value) {
            addCriterion("PRODUCT_PROMO_COND_SEQ_ID >", value, "productPromoCondSeqId");
            return (Criteria) this;
        }

        public Criteria andProductPromoCondSeqIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_PROMO_COND_SEQ_ID >=", value, "productPromoCondSeqId");
            return (Criteria) this;
        }

        public Criteria andProductPromoCondSeqIdLessThan(String value) {
            addCriterion("PRODUCT_PROMO_COND_SEQ_ID <", value, "productPromoCondSeqId");
            return (Criteria) this;
        }

        public Criteria andProductPromoCondSeqIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_PROMO_COND_SEQ_ID <=", value, "productPromoCondSeqId");
            return (Criteria) this;
        }

        public Criteria andProductPromoCondSeqIdLike(String value) {
            addCriterion("PRODUCT_PROMO_COND_SEQ_ID like", value, "productPromoCondSeqId");
            return (Criteria) this;
        }

        public Criteria andProductPromoCondSeqIdNotLike(String value) {
            addCriterion("PRODUCT_PROMO_COND_SEQ_ID not like", value, "productPromoCondSeqId");
            return (Criteria) this;
        }

        public Criteria andProductPromoCondSeqIdIn(List<String> values) {
            addCriterion("PRODUCT_PROMO_COND_SEQ_ID in", values, "productPromoCondSeqId");
            return (Criteria) this;
        }

        public Criteria andProductPromoCondSeqIdNotIn(List<String> values) {
            addCriterion("PRODUCT_PROMO_COND_SEQ_ID not in", values, "productPromoCondSeqId");
            return (Criteria) this;
        }

        public Criteria andProductPromoCondSeqIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_PROMO_COND_SEQ_ID between", value1, value2, "productPromoCondSeqId");
            return (Criteria) this;
        }

        public Criteria andProductPromoCondSeqIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_PROMO_COND_SEQ_ID not between", value1, value2, "productPromoCondSeqId");
            return (Criteria) this;
        }

        public Criteria andInputParamEnumIdIsNull() {
            addCriterion("INPUT_PARAM_ENUM_ID is null");
            return (Criteria) this;
        }

        public Criteria andInputParamEnumIdIsNotNull() {
            addCriterion("INPUT_PARAM_ENUM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInputParamEnumIdEqualTo(String value) {
            addCriterion("INPUT_PARAM_ENUM_ID =", value, "inputParamEnumId");
            return (Criteria) this;
        }

        public Criteria andInputParamEnumIdNotEqualTo(String value) {
            addCriterion("INPUT_PARAM_ENUM_ID <>", value, "inputParamEnumId");
            return (Criteria) this;
        }

        public Criteria andInputParamEnumIdGreaterThan(String value) {
            addCriterion("INPUT_PARAM_ENUM_ID >", value, "inputParamEnumId");
            return (Criteria) this;
        }

        public Criteria andInputParamEnumIdGreaterThanOrEqualTo(String value) {
            addCriterion("INPUT_PARAM_ENUM_ID >=", value, "inputParamEnumId");
            return (Criteria) this;
        }

        public Criteria andInputParamEnumIdLessThan(String value) {
            addCriterion("INPUT_PARAM_ENUM_ID <", value, "inputParamEnumId");
            return (Criteria) this;
        }

        public Criteria andInputParamEnumIdLessThanOrEqualTo(String value) {
            addCriterion("INPUT_PARAM_ENUM_ID <=", value, "inputParamEnumId");
            return (Criteria) this;
        }

        public Criteria andInputParamEnumIdLike(String value) {
            addCriterion("INPUT_PARAM_ENUM_ID like", value, "inputParamEnumId");
            return (Criteria) this;
        }

        public Criteria andInputParamEnumIdNotLike(String value) {
            addCriterion("INPUT_PARAM_ENUM_ID not like", value, "inputParamEnumId");
            return (Criteria) this;
        }

        public Criteria andInputParamEnumIdIn(List<String> values) {
            addCriterion("INPUT_PARAM_ENUM_ID in", values, "inputParamEnumId");
            return (Criteria) this;
        }

        public Criteria andInputParamEnumIdNotIn(List<String> values) {
            addCriterion("INPUT_PARAM_ENUM_ID not in", values, "inputParamEnumId");
            return (Criteria) this;
        }

        public Criteria andInputParamEnumIdBetween(String value1, String value2) {
            addCriterion("INPUT_PARAM_ENUM_ID between", value1, value2, "inputParamEnumId");
            return (Criteria) this;
        }

        public Criteria andInputParamEnumIdNotBetween(String value1, String value2) {
            addCriterion("INPUT_PARAM_ENUM_ID not between", value1, value2, "inputParamEnumId");
            return (Criteria) this;
        }

        public Criteria andOperatorEnumIdIsNull() {
            addCriterion("OPERATOR_ENUM_ID is null");
            return (Criteria) this;
        }

        public Criteria andOperatorEnumIdIsNotNull() {
            addCriterion("OPERATOR_ENUM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEnumIdEqualTo(String value) {
            addCriterion("OPERATOR_ENUM_ID =", value, "operatorEnumId");
            return (Criteria) this;
        }

        public Criteria andOperatorEnumIdNotEqualTo(String value) {
            addCriterion("OPERATOR_ENUM_ID <>", value, "operatorEnumId");
            return (Criteria) this;
        }

        public Criteria andOperatorEnumIdGreaterThan(String value) {
            addCriterion("OPERATOR_ENUM_ID >", value, "operatorEnumId");
            return (Criteria) this;
        }

        public Criteria andOperatorEnumIdGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATOR_ENUM_ID >=", value, "operatorEnumId");
            return (Criteria) this;
        }

        public Criteria andOperatorEnumIdLessThan(String value) {
            addCriterion("OPERATOR_ENUM_ID <", value, "operatorEnumId");
            return (Criteria) this;
        }

        public Criteria andOperatorEnumIdLessThanOrEqualTo(String value) {
            addCriterion("OPERATOR_ENUM_ID <=", value, "operatorEnumId");
            return (Criteria) this;
        }

        public Criteria andOperatorEnumIdLike(String value) {
            addCriterion("OPERATOR_ENUM_ID like", value, "operatorEnumId");
            return (Criteria) this;
        }

        public Criteria andOperatorEnumIdNotLike(String value) {
            addCriterion("OPERATOR_ENUM_ID not like", value, "operatorEnumId");
            return (Criteria) this;
        }

        public Criteria andOperatorEnumIdIn(List<String> values) {
            addCriterion("OPERATOR_ENUM_ID in", values, "operatorEnumId");
            return (Criteria) this;
        }

        public Criteria andOperatorEnumIdNotIn(List<String> values) {
            addCriterion("OPERATOR_ENUM_ID not in", values, "operatorEnumId");
            return (Criteria) this;
        }

        public Criteria andOperatorEnumIdBetween(String value1, String value2) {
            addCriterion("OPERATOR_ENUM_ID between", value1, value2, "operatorEnumId");
            return (Criteria) this;
        }

        public Criteria andOperatorEnumIdNotBetween(String value1, String value2) {
            addCriterion("OPERATOR_ENUM_ID not between", value1, value2, "operatorEnumId");
            return (Criteria) this;
        }

        public Criteria andCondValueIsNull() {
            addCriterion("COND_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andCondValueIsNotNull() {
            addCriterion("COND_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andCondValueEqualTo(String value) {
            addCriterion("COND_VALUE =", value, "condValue");
            return (Criteria) this;
        }

        public Criteria andCondValueNotEqualTo(String value) {
            addCriterion("COND_VALUE <>", value, "condValue");
            return (Criteria) this;
        }

        public Criteria andCondValueGreaterThan(String value) {
            addCriterion("COND_VALUE >", value, "condValue");
            return (Criteria) this;
        }

        public Criteria andCondValueGreaterThanOrEqualTo(String value) {
            addCriterion("COND_VALUE >=", value, "condValue");
            return (Criteria) this;
        }

        public Criteria andCondValueLessThan(String value) {
            addCriterion("COND_VALUE <", value, "condValue");
            return (Criteria) this;
        }

        public Criteria andCondValueLessThanOrEqualTo(String value) {
            addCriterion("COND_VALUE <=", value, "condValue");
            return (Criteria) this;
        }

        public Criteria andCondValueLike(String value) {
            addCriterion("COND_VALUE like", value, "condValue");
            return (Criteria) this;
        }

        public Criteria andCondValueNotLike(String value) {
            addCriterion("COND_VALUE not like", value, "condValue");
            return (Criteria) this;
        }

        public Criteria andCondValueIn(List<String> values) {
            addCriterion("COND_VALUE in", values, "condValue");
            return (Criteria) this;
        }

        public Criteria andCondValueNotIn(List<String> values) {
            addCriterion("COND_VALUE not in", values, "condValue");
            return (Criteria) this;
        }

        public Criteria andCondValueBetween(String value1, String value2) {
            addCriterion("COND_VALUE between", value1, value2, "condValue");
            return (Criteria) this;
        }

        public Criteria andCondValueNotBetween(String value1, String value2) {
            addCriterion("COND_VALUE not between", value1, value2, "condValue");
            return (Criteria) this;
        }

        public Criteria andOtherValueIsNull() {
            addCriterion("OTHER_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andOtherValueIsNotNull() {
            addCriterion("OTHER_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andOtherValueEqualTo(String value) {
            addCriterion("OTHER_VALUE =", value, "otherValue");
            return (Criteria) this;
        }

        public Criteria andOtherValueNotEqualTo(String value) {
            addCriterion("OTHER_VALUE <>", value, "otherValue");
            return (Criteria) this;
        }

        public Criteria andOtherValueGreaterThan(String value) {
            addCriterion("OTHER_VALUE >", value, "otherValue");
            return (Criteria) this;
        }

        public Criteria andOtherValueGreaterThanOrEqualTo(String value) {
            addCriterion("OTHER_VALUE >=", value, "otherValue");
            return (Criteria) this;
        }

        public Criteria andOtherValueLessThan(String value) {
            addCriterion("OTHER_VALUE <", value, "otherValue");
            return (Criteria) this;
        }

        public Criteria andOtherValueLessThanOrEqualTo(String value) {
            addCriterion("OTHER_VALUE <=", value, "otherValue");
            return (Criteria) this;
        }

        public Criteria andOtherValueLike(String value) {
            addCriterion("OTHER_VALUE like", value, "otherValue");
            return (Criteria) this;
        }

        public Criteria andOtherValueNotLike(String value) {
            addCriterion("OTHER_VALUE not like", value, "otherValue");
            return (Criteria) this;
        }

        public Criteria andOtherValueIn(List<String> values) {
            addCriterion("OTHER_VALUE in", values, "otherValue");
            return (Criteria) this;
        }

        public Criteria andOtherValueNotIn(List<String> values) {
            addCriterion("OTHER_VALUE not in", values, "otherValue");
            return (Criteria) this;
        }

        public Criteria andOtherValueBetween(String value1, String value2) {
            addCriterion("OTHER_VALUE between", value1, value2, "otherValue");
            return (Criteria) this;
        }

        public Criteria andOtherValueNotBetween(String value1, String value2) {
            addCriterion("OTHER_VALUE not between", value1, value2, "otherValue");
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