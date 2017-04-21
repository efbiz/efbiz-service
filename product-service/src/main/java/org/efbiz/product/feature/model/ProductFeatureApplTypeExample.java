package org.efbiz.product.feature.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductFeatureApplTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public ProductFeatureApplTypeExample() {
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

        public Criteria andProductFeatureApplTypeIdIsNull() {
            addCriterion("PRODUCT_FEATURE_APPL_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductFeatureApplTypeIdIsNotNull() {
            addCriterion("PRODUCT_FEATURE_APPL_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductFeatureApplTypeIdEqualTo(String value) {
            addCriterion("PRODUCT_FEATURE_APPL_TYPE_ID =", value, "productFeatureApplTypeId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureApplTypeIdNotEqualTo(String value) {
            addCriterion("PRODUCT_FEATURE_APPL_TYPE_ID <>", value, "productFeatureApplTypeId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureApplTypeIdGreaterThan(String value) {
            addCriterion("PRODUCT_FEATURE_APPL_TYPE_ID >", value, "productFeatureApplTypeId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureApplTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_FEATURE_APPL_TYPE_ID >=", value, "productFeatureApplTypeId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureApplTypeIdLessThan(String value) {
            addCriterion("PRODUCT_FEATURE_APPL_TYPE_ID <", value, "productFeatureApplTypeId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureApplTypeIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_FEATURE_APPL_TYPE_ID <=", value, "productFeatureApplTypeId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureApplTypeIdLike(String value) {
            addCriterion("PRODUCT_FEATURE_APPL_TYPE_ID like", value, "productFeatureApplTypeId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureApplTypeIdNotLike(String value) {
            addCriterion("PRODUCT_FEATURE_APPL_TYPE_ID not like", value, "productFeatureApplTypeId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureApplTypeIdIn(List<String> values) {
            addCriterion("PRODUCT_FEATURE_APPL_TYPE_ID in", values, "productFeatureApplTypeId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureApplTypeIdNotIn(List<String> values) {
            addCriterion("PRODUCT_FEATURE_APPL_TYPE_ID not in", values, "productFeatureApplTypeId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureApplTypeIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_FEATURE_APPL_TYPE_ID between", value1, value2, "productFeatureApplTypeId");
            return (Criteria) this;
        }

        public Criteria andProductFeatureApplTypeIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_FEATURE_APPL_TYPE_ID not between", value1, value2, "productFeatureApplTypeId");
            return (Criteria) this;
        }

        public Criteria andParentTypeIdIsNull() {
            addCriterion("PARENT_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentTypeIdIsNotNull() {
            addCriterion("PARENT_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentTypeIdEqualTo(String value) {
            addCriterion("PARENT_TYPE_ID =", value, "parentTypeId");
            return (Criteria) this;
        }

        public Criteria andParentTypeIdNotEqualTo(String value) {
            addCriterion("PARENT_TYPE_ID <>", value, "parentTypeId");
            return (Criteria) this;
        }

        public Criteria andParentTypeIdGreaterThan(String value) {
            addCriterion("PARENT_TYPE_ID >", value, "parentTypeId");
            return (Criteria) this;
        }

        public Criteria andParentTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_TYPE_ID >=", value, "parentTypeId");
            return (Criteria) this;
        }

        public Criteria andParentTypeIdLessThan(String value) {
            addCriterion("PARENT_TYPE_ID <", value, "parentTypeId");
            return (Criteria) this;
        }

        public Criteria andParentTypeIdLessThanOrEqualTo(String value) {
            addCriterion("PARENT_TYPE_ID <=", value, "parentTypeId");
            return (Criteria) this;
        }

        public Criteria andParentTypeIdLike(String value) {
            addCriterion("PARENT_TYPE_ID like", value, "parentTypeId");
            return (Criteria) this;
        }

        public Criteria andParentTypeIdNotLike(String value) {
            addCriterion("PARENT_TYPE_ID not like", value, "parentTypeId");
            return (Criteria) this;
        }

        public Criteria andParentTypeIdIn(List<String> values) {
            addCriterion("PARENT_TYPE_ID in", values, "parentTypeId");
            return (Criteria) this;
        }

        public Criteria andParentTypeIdNotIn(List<String> values) {
            addCriterion("PARENT_TYPE_ID not in", values, "parentTypeId");
            return (Criteria) this;
        }

        public Criteria andParentTypeIdBetween(String value1, String value2) {
            addCriterion("PARENT_TYPE_ID between", value1, value2, "parentTypeId");
            return (Criteria) this;
        }

        public Criteria andParentTypeIdNotBetween(String value1, String value2) {
            addCriterion("PARENT_TYPE_ID not between", value1, value2, "parentTypeId");
            return (Criteria) this;
        }

        public Criteria andHasTableIsNull() {
            addCriterion("HAS_TABLE is null");
            return (Criteria) this;
        }

        public Criteria andHasTableIsNotNull() {
            addCriterion("HAS_TABLE is not null");
            return (Criteria) this;
        }

        public Criteria andHasTableEqualTo(String value) {
            addCriterion("HAS_TABLE =", value, "hasTable");
            return (Criteria) this;
        }

        public Criteria andHasTableNotEqualTo(String value) {
            addCriterion("HAS_TABLE <>", value, "hasTable");
            return (Criteria) this;
        }

        public Criteria andHasTableGreaterThan(String value) {
            addCriterion("HAS_TABLE >", value, "hasTable");
            return (Criteria) this;
        }

        public Criteria andHasTableGreaterThanOrEqualTo(String value) {
            addCriterion("HAS_TABLE >=", value, "hasTable");
            return (Criteria) this;
        }

        public Criteria andHasTableLessThan(String value) {
            addCriterion("HAS_TABLE <", value, "hasTable");
            return (Criteria) this;
        }

        public Criteria andHasTableLessThanOrEqualTo(String value) {
            addCriterion("HAS_TABLE <=", value, "hasTable");
            return (Criteria) this;
        }

        public Criteria andHasTableLike(String value) {
            addCriterion("HAS_TABLE like", value, "hasTable");
            return (Criteria) this;
        }

        public Criteria andHasTableNotLike(String value) {
            addCriterion("HAS_TABLE not like", value, "hasTable");
            return (Criteria) this;
        }

        public Criteria andHasTableIn(List<String> values) {
            addCriterion("HAS_TABLE in", values, "hasTable");
            return (Criteria) this;
        }

        public Criteria andHasTableNotIn(List<String> values) {
            addCriterion("HAS_TABLE not in", values, "hasTable");
            return (Criteria) this;
        }

        public Criteria andHasTableBetween(String value1, String value2) {
            addCriterion("HAS_TABLE between", value1, value2, "hasTable");
            return (Criteria) this;
        }

        public Criteria andHasTableNotBetween(String value1, String value2) {
            addCriterion("HAS_TABLE not between", value1, value2, "hasTable");
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