package org.efbiz.product.category.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductCategoryGlAccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public ProductCategoryGlAccountExample() {
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

        public Criteria andProductCategoryIdIsNull() {
            addCriterion("PRODUCT_CATEGORY_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdIsNotNull() {
            addCriterion("PRODUCT_CATEGORY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdEqualTo(String value) {
            addCriterion("PRODUCT_CATEGORY_ID =", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdNotEqualTo(String value) {
            addCriterion("PRODUCT_CATEGORY_ID <>", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdGreaterThan(String value) {
            addCriterion("PRODUCT_CATEGORY_ID >", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_CATEGORY_ID >=", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdLessThan(String value) {
            addCriterion("PRODUCT_CATEGORY_ID <", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_CATEGORY_ID <=", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdLike(String value) {
            addCriterion("PRODUCT_CATEGORY_ID like", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdNotLike(String value) {
            addCriterion("PRODUCT_CATEGORY_ID not like", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdIn(List<String> values) {
            addCriterion("PRODUCT_CATEGORY_ID in", values, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdNotIn(List<String> values) {
            addCriterion("PRODUCT_CATEGORY_ID not in", values, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_CATEGORY_ID between", value1, value2, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_CATEGORY_ID not between", value1, value2, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andOrganizationPartyIdIsNull() {
            addCriterion("ORGANIZATION_PARTY_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationPartyIdIsNotNull() {
            addCriterion("ORGANIZATION_PARTY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationPartyIdEqualTo(String value) {
            addCriterion("ORGANIZATION_PARTY_ID =", value, "organizationPartyId");
            return (Criteria) this;
        }

        public Criteria andOrganizationPartyIdNotEqualTo(String value) {
            addCriterion("ORGANIZATION_PARTY_ID <>", value, "organizationPartyId");
            return (Criteria) this;
        }

        public Criteria andOrganizationPartyIdGreaterThan(String value) {
            addCriterion("ORGANIZATION_PARTY_ID >", value, "organizationPartyId");
            return (Criteria) this;
        }

        public Criteria andOrganizationPartyIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORGANIZATION_PARTY_ID >=", value, "organizationPartyId");
            return (Criteria) this;
        }

        public Criteria andOrganizationPartyIdLessThan(String value) {
            addCriterion("ORGANIZATION_PARTY_ID <", value, "organizationPartyId");
            return (Criteria) this;
        }

        public Criteria andOrganizationPartyIdLessThanOrEqualTo(String value) {
            addCriterion("ORGANIZATION_PARTY_ID <=", value, "organizationPartyId");
            return (Criteria) this;
        }

        public Criteria andOrganizationPartyIdLike(String value) {
            addCriterion("ORGANIZATION_PARTY_ID like", value, "organizationPartyId");
            return (Criteria) this;
        }

        public Criteria andOrganizationPartyIdNotLike(String value) {
            addCriterion("ORGANIZATION_PARTY_ID not like", value, "organizationPartyId");
            return (Criteria) this;
        }

        public Criteria andOrganizationPartyIdIn(List<String> values) {
            addCriterion("ORGANIZATION_PARTY_ID in", values, "organizationPartyId");
            return (Criteria) this;
        }

        public Criteria andOrganizationPartyIdNotIn(List<String> values) {
            addCriterion("ORGANIZATION_PARTY_ID not in", values, "organizationPartyId");
            return (Criteria) this;
        }

        public Criteria andOrganizationPartyIdBetween(String value1, String value2) {
            addCriterion("ORGANIZATION_PARTY_ID between", value1, value2, "organizationPartyId");
            return (Criteria) this;
        }

        public Criteria andOrganizationPartyIdNotBetween(String value1, String value2) {
            addCriterion("ORGANIZATION_PARTY_ID not between", value1, value2, "organizationPartyId");
            return (Criteria) this;
        }

        public Criteria andGlAccountTypeIdIsNull() {
            addCriterion("GL_ACCOUNT_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andGlAccountTypeIdIsNotNull() {
            addCriterion("GL_ACCOUNT_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGlAccountTypeIdEqualTo(String value) {
            addCriterion("GL_ACCOUNT_TYPE_ID =", value, "glAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andGlAccountTypeIdNotEqualTo(String value) {
            addCriterion("GL_ACCOUNT_TYPE_ID <>", value, "glAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andGlAccountTypeIdGreaterThan(String value) {
            addCriterion("GL_ACCOUNT_TYPE_ID >", value, "glAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andGlAccountTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("GL_ACCOUNT_TYPE_ID >=", value, "glAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andGlAccountTypeIdLessThan(String value) {
            addCriterion("GL_ACCOUNT_TYPE_ID <", value, "glAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andGlAccountTypeIdLessThanOrEqualTo(String value) {
            addCriterion("GL_ACCOUNT_TYPE_ID <=", value, "glAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andGlAccountTypeIdLike(String value) {
            addCriterion("GL_ACCOUNT_TYPE_ID like", value, "glAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andGlAccountTypeIdNotLike(String value) {
            addCriterion("GL_ACCOUNT_TYPE_ID not like", value, "glAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andGlAccountTypeIdIn(List<String> values) {
            addCriterion("GL_ACCOUNT_TYPE_ID in", values, "glAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andGlAccountTypeIdNotIn(List<String> values) {
            addCriterion("GL_ACCOUNT_TYPE_ID not in", values, "glAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andGlAccountTypeIdBetween(String value1, String value2) {
            addCriterion("GL_ACCOUNT_TYPE_ID between", value1, value2, "glAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andGlAccountTypeIdNotBetween(String value1, String value2) {
            addCriterion("GL_ACCOUNT_TYPE_ID not between", value1, value2, "glAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andGlAccountIdIsNull() {
            addCriterion("GL_ACCOUNT_ID is null");
            return (Criteria) this;
        }

        public Criteria andGlAccountIdIsNotNull() {
            addCriterion("GL_ACCOUNT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGlAccountIdEqualTo(String value) {
            addCriterion("GL_ACCOUNT_ID =", value, "glAccountId");
            return (Criteria) this;
        }

        public Criteria andGlAccountIdNotEqualTo(String value) {
            addCriterion("GL_ACCOUNT_ID <>", value, "glAccountId");
            return (Criteria) this;
        }

        public Criteria andGlAccountIdGreaterThan(String value) {
            addCriterion("GL_ACCOUNT_ID >", value, "glAccountId");
            return (Criteria) this;
        }

        public Criteria andGlAccountIdGreaterThanOrEqualTo(String value) {
            addCriterion("GL_ACCOUNT_ID >=", value, "glAccountId");
            return (Criteria) this;
        }

        public Criteria andGlAccountIdLessThan(String value) {
            addCriterion("GL_ACCOUNT_ID <", value, "glAccountId");
            return (Criteria) this;
        }

        public Criteria andGlAccountIdLessThanOrEqualTo(String value) {
            addCriterion("GL_ACCOUNT_ID <=", value, "glAccountId");
            return (Criteria) this;
        }

        public Criteria andGlAccountIdLike(String value) {
            addCriterion("GL_ACCOUNT_ID like", value, "glAccountId");
            return (Criteria) this;
        }

        public Criteria andGlAccountIdNotLike(String value) {
            addCriterion("GL_ACCOUNT_ID not like", value, "glAccountId");
            return (Criteria) this;
        }

        public Criteria andGlAccountIdIn(List<String> values) {
            addCriterion("GL_ACCOUNT_ID in", values, "glAccountId");
            return (Criteria) this;
        }

        public Criteria andGlAccountIdNotIn(List<String> values) {
            addCriterion("GL_ACCOUNT_ID not in", values, "glAccountId");
            return (Criteria) this;
        }

        public Criteria andGlAccountIdBetween(String value1, String value2) {
            addCriterion("GL_ACCOUNT_ID between", value1, value2, "glAccountId");
            return (Criteria) this;
        }

        public Criteria andGlAccountIdNotBetween(String value1, String value2) {
            addCriterion("GL_ACCOUNT_ID not between", value1, value2, "glAccountId");
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