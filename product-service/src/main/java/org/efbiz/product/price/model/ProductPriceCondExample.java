package org.efbiz.product.price.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductPriceCondExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public ProductPriceCondExample() {
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

        public Criteria andProductPriceRuleIdIsNull() {
            addCriterion("PRODUCT_PRICE_RULE_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductPriceRuleIdIsNotNull() {
            addCriterion("PRODUCT_PRICE_RULE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductPriceRuleIdEqualTo(String value) {
            addCriterion("PRODUCT_PRICE_RULE_ID =", value, "productPriceRuleId");
            return (Criteria) this;
        }

        public Criteria andProductPriceRuleIdNotEqualTo(String value) {
            addCriterion("PRODUCT_PRICE_RULE_ID <>", value, "productPriceRuleId");
            return (Criteria) this;
        }

        public Criteria andProductPriceRuleIdGreaterThan(String value) {
            addCriterion("PRODUCT_PRICE_RULE_ID >", value, "productPriceRuleId");
            return (Criteria) this;
        }

        public Criteria andProductPriceRuleIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_PRICE_RULE_ID >=", value, "productPriceRuleId");
            return (Criteria) this;
        }

        public Criteria andProductPriceRuleIdLessThan(String value) {
            addCriterion("PRODUCT_PRICE_RULE_ID <", value, "productPriceRuleId");
            return (Criteria) this;
        }

        public Criteria andProductPriceRuleIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_PRICE_RULE_ID <=", value, "productPriceRuleId");
            return (Criteria) this;
        }

        public Criteria andProductPriceRuleIdLike(String value) {
            addCriterion("PRODUCT_PRICE_RULE_ID like", value, "productPriceRuleId");
            return (Criteria) this;
        }

        public Criteria andProductPriceRuleIdNotLike(String value) {
            addCriterion("PRODUCT_PRICE_RULE_ID not like", value, "productPriceRuleId");
            return (Criteria) this;
        }

        public Criteria andProductPriceRuleIdIn(List<String> values) {
            addCriterion("PRODUCT_PRICE_RULE_ID in", values, "productPriceRuleId");
            return (Criteria) this;
        }

        public Criteria andProductPriceRuleIdNotIn(List<String> values) {
            addCriterion("PRODUCT_PRICE_RULE_ID not in", values, "productPriceRuleId");
            return (Criteria) this;
        }

        public Criteria andProductPriceRuleIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_PRICE_RULE_ID between", value1, value2, "productPriceRuleId");
            return (Criteria) this;
        }

        public Criteria andProductPriceRuleIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_PRICE_RULE_ID not between", value1, value2, "productPriceRuleId");
            return (Criteria) this;
        }

        public Criteria andProductPriceCondSeqIdIsNull() {
            addCriterion("PRODUCT_PRICE_COND_SEQ_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductPriceCondSeqIdIsNotNull() {
            addCriterion("PRODUCT_PRICE_COND_SEQ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductPriceCondSeqIdEqualTo(String value) {
            addCriterion("PRODUCT_PRICE_COND_SEQ_ID =", value, "productPriceCondSeqId");
            return (Criteria) this;
        }

        public Criteria andProductPriceCondSeqIdNotEqualTo(String value) {
            addCriterion("PRODUCT_PRICE_COND_SEQ_ID <>", value, "productPriceCondSeqId");
            return (Criteria) this;
        }

        public Criteria andProductPriceCondSeqIdGreaterThan(String value) {
            addCriterion("PRODUCT_PRICE_COND_SEQ_ID >", value, "productPriceCondSeqId");
            return (Criteria) this;
        }

        public Criteria andProductPriceCondSeqIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_PRICE_COND_SEQ_ID >=", value, "productPriceCondSeqId");
            return (Criteria) this;
        }

        public Criteria andProductPriceCondSeqIdLessThan(String value) {
            addCriterion("PRODUCT_PRICE_COND_SEQ_ID <", value, "productPriceCondSeqId");
            return (Criteria) this;
        }

        public Criteria andProductPriceCondSeqIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_PRICE_COND_SEQ_ID <=", value, "productPriceCondSeqId");
            return (Criteria) this;
        }

        public Criteria andProductPriceCondSeqIdLike(String value) {
            addCriterion("PRODUCT_PRICE_COND_SEQ_ID like", value, "productPriceCondSeqId");
            return (Criteria) this;
        }

        public Criteria andProductPriceCondSeqIdNotLike(String value) {
            addCriterion("PRODUCT_PRICE_COND_SEQ_ID not like", value, "productPriceCondSeqId");
            return (Criteria) this;
        }

        public Criteria andProductPriceCondSeqIdIn(List<String> values) {
            addCriterion("PRODUCT_PRICE_COND_SEQ_ID in", values, "productPriceCondSeqId");
            return (Criteria) this;
        }

        public Criteria andProductPriceCondSeqIdNotIn(List<String> values) {
            addCriterion("PRODUCT_PRICE_COND_SEQ_ID not in", values, "productPriceCondSeqId");
            return (Criteria) this;
        }

        public Criteria andProductPriceCondSeqIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_PRICE_COND_SEQ_ID between", value1, value2, "productPriceCondSeqId");
            return (Criteria) this;
        }

        public Criteria andProductPriceCondSeqIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_PRICE_COND_SEQ_ID not between", value1, value2, "productPriceCondSeqId");
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