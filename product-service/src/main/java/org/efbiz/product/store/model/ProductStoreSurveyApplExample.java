package org.efbiz.product.store.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductStoreSurveyApplExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public ProductStoreSurveyApplExample() {
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

        public Criteria andProductStoreSurveyIdIsNull() {
            addCriterion("PRODUCT_STORE_SURVEY_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductStoreSurveyIdIsNotNull() {
            addCriterion("PRODUCT_STORE_SURVEY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductStoreSurveyIdEqualTo(String value) {
            addCriterion("PRODUCT_STORE_SURVEY_ID =", value, "productStoreSurveyId");
            return (Criteria) this;
        }

        public Criteria andProductStoreSurveyIdNotEqualTo(String value) {
            addCriterion("PRODUCT_STORE_SURVEY_ID <>", value, "productStoreSurveyId");
            return (Criteria) this;
        }

        public Criteria andProductStoreSurveyIdGreaterThan(String value) {
            addCriterion("PRODUCT_STORE_SURVEY_ID >", value, "productStoreSurveyId");
            return (Criteria) this;
        }

        public Criteria andProductStoreSurveyIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_STORE_SURVEY_ID >=", value, "productStoreSurveyId");
            return (Criteria) this;
        }

        public Criteria andProductStoreSurveyIdLessThan(String value) {
            addCriterion("PRODUCT_STORE_SURVEY_ID <", value, "productStoreSurveyId");
            return (Criteria) this;
        }

        public Criteria andProductStoreSurveyIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_STORE_SURVEY_ID <=", value, "productStoreSurveyId");
            return (Criteria) this;
        }

        public Criteria andProductStoreSurveyIdLike(String value) {
            addCriterion("PRODUCT_STORE_SURVEY_ID like", value, "productStoreSurveyId");
            return (Criteria) this;
        }

        public Criteria andProductStoreSurveyIdNotLike(String value) {
            addCriterion("PRODUCT_STORE_SURVEY_ID not like", value, "productStoreSurveyId");
            return (Criteria) this;
        }

        public Criteria andProductStoreSurveyIdIn(List<String> values) {
            addCriterion("PRODUCT_STORE_SURVEY_ID in", values, "productStoreSurveyId");
            return (Criteria) this;
        }

        public Criteria andProductStoreSurveyIdNotIn(List<String> values) {
            addCriterion("PRODUCT_STORE_SURVEY_ID not in", values, "productStoreSurveyId");
            return (Criteria) this;
        }

        public Criteria andProductStoreSurveyIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_STORE_SURVEY_ID between", value1, value2, "productStoreSurveyId");
            return (Criteria) this;
        }

        public Criteria andProductStoreSurveyIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_STORE_SURVEY_ID not between", value1, value2, "productStoreSurveyId");
            return (Criteria) this;
        }

        public Criteria andProductStoreIdIsNull() {
            addCriterion("PRODUCT_STORE_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductStoreIdIsNotNull() {
            addCriterion("PRODUCT_STORE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductStoreIdEqualTo(String value) {
            addCriterion("PRODUCT_STORE_ID =", value, "productStoreId");
            return (Criteria) this;
        }

        public Criteria andProductStoreIdNotEqualTo(String value) {
            addCriterion("PRODUCT_STORE_ID <>", value, "productStoreId");
            return (Criteria) this;
        }

        public Criteria andProductStoreIdGreaterThan(String value) {
            addCriterion("PRODUCT_STORE_ID >", value, "productStoreId");
            return (Criteria) this;
        }

        public Criteria andProductStoreIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_STORE_ID >=", value, "productStoreId");
            return (Criteria) this;
        }

        public Criteria andProductStoreIdLessThan(String value) {
            addCriterion("PRODUCT_STORE_ID <", value, "productStoreId");
            return (Criteria) this;
        }

        public Criteria andProductStoreIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_STORE_ID <=", value, "productStoreId");
            return (Criteria) this;
        }

        public Criteria andProductStoreIdLike(String value) {
            addCriterion("PRODUCT_STORE_ID like", value, "productStoreId");
            return (Criteria) this;
        }

        public Criteria andProductStoreIdNotLike(String value) {
            addCriterion("PRODUCT_STORE_ID not like", value, "productStoreId");
            return (Criteria) this;
        }

        public Criteria andProductStoreIdIn(List<String> values) {
            addCriterion("PRODUCT_STORE_ID in", values, "productStoreId");
            return (Criteria) this;
        }

        public Criteria andProductStoreIdNotIn(List<String> values) {
            addCriterion("PRODUCT_STORE_ID not in", values, "productStoreId");
            return (Criteria) this;
        }

        public Criteria andProductStoreIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_STORE_ID between", value1, value2, "productStoreId");
            return (Criteria) this;
        }

        public Criteria andProductStoreIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_STORE_ID not between", value1, value2, "productStoreId");
            return (Criteria) this;
        }

        public Criteria andSurveyApplTypeIdIsNull() {
            addCriterion("SURVEY_APPL_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andSurveyApplTypeIdIsNotNull() {
            addCriterion("SURVEY_APPL_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSurveyApplTypeIdEqualTo(String value) {
            addCriterion("SURVEY_APPL_TYPE_ID =", value, "surveyApplTypeId");
            return (Criteria) this;
        }

        public Criteria andSurveyApplTypeIdNotEqualTo(String value) {
            addCriterion("SURVEY_APPL_TYPE_ID <>", value, "surveyApplTypeId");
            return (Criteria) this;
        }

        public Criteria andSurveyApplTypeIdGreaterThan(String value) {
            addCriterion("SURVEY_APPL_TYPE_ID >", value, "surveyApplTypeId");
            return (Criteria) this;
        }

        public Criteria andSurveyApplTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("SURVEY_APPL_TYPE_ID >=", value, "surveyApplTypeId");
            return (Criteria) this;
        }

        public Criteria andSurveyApplTypeIdLessThan(String value) {
            addCriterion("SURVEY_APPL_TYPE_ID <", value, "surveyApplTypeId");
            return (Criteria) this;
        }

        public Criteria andSurveyApplTypeIdLessThanOrEqualTo(String value) {
            addCriterion("SURVEY_APPL_TYPE_ID <=", value, "surveyApplTypeId");
            return (Criteria) this;
        }

        public Criteria andSurveyApplTypeIdLike(String value) {
            addCriterion("SURVEY_APPL_TYPE_ID like", value, "surveyApplTypeId");
            return (Criteria) this;
        }

        public Criteria andSurveyApplTypeIdNotLike(String value) {
            addCriterion("SURVEY_APPL_TYPE_ID not like", value, "surveyApplTypeId");
            return (Criteria) this;
        }

        public Criteria andSurveyApplTypeIdIn(List<String> values) {
            addCriterion("SURVEY_APPL_TYPE_ID in", values, "surveyApplTypeId");
            return (Criteria) this;
        }

        public Criteria andSurveyApplTypeIdNotIn(List<String> values) {
            addCriterion("SURVEY_APPL_TYPE_ID not in", values, "surveyApplTypeId");
            return (Criteria) this;
        }

        public Criteria andSurveyApplTypeIdBetween(String value1, String value2) {
            addCriterion("SURVEY_APPL_TYPE_ID between", value1, value2, "surveyApplTypeId");
            return (Criteria) this;
        }

        public Criteria andSurveyApplTypeIdNotBetween(String value1, String value2) {
            addCriterion("SURVEY_APPL_TYPE_ID not between", value1, value2, "surveyApplTypeId");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNull() {
            addCriterion("GROUP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNotNull() {
            addCriterion("GROUP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andGroupNameEqualTo(String value) {
            addCriterion("GROUP_NAME =", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotEqualTo(String value) {
            addCriterion("GROUP_NAME <>", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThan(String value) {
            addCriterion("GROUP_NAME >", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("GROUP_NAME >=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThan(String value) {
            addCriterion("GROUP_NAME <", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThanOrEqualTo(String value) {
            addCriterion("GROUP_NAME <=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLike(String value) {
            addCriterion("GROUP_NAME like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotLike(String value) {
            addCriterion("GROUP_NAME not like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameIn(List<String> values) {
            addCriterion("GROUP_NAME in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotIn(List<String> values) {
            addCriterion("GROUP_NAME not in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameBetween(String value1, String value2) {
            addCriterion("GROUP_NAME between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotBetween(String value1, String value2) {
            addCriterion("GROUP_NAME not between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andSurveyIdIsNull() {
            addCriterion("SURVEY_ID is null");
            return (Criteria) this;
        }

        public Criteria andSurveyIdIsNotNull() {
            addCriterion("SURVEY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSurveyIdEqualTo(String value) {
            addCriterion("SURVEY_ID =", value, "surveyId");
            return (Criteria) this;
        }

        public Criteria andSurveyIdNotEqualTo(String value) {
            addCriterion("SURVEY_ID <>", value, "surveyId");
            return (Criteria) this;
        }

        public Criteria andSurveyIdGreaterThan(String value) {
            addCriterion("SURVEY_ID >", value, "surveyId");
            return (Criteria) this;
        }

        public Criteria andSurveyIdGreaterThanOrEqualTo(String value) {
            addCriterion("SURVEY_ID >=", value, "surveyId");
            return (Criteria) this;
        }

        public Criteria andSurveyIdLessThan(String value) {
            addCriterion("SURVEY_ID <", value, "surveyId");
            return (Criteria) this;
        }

        public Criteria andSurveyIdLessThanOrEqualTo(String value) {
            addCriterion("SURVEY_ID <=", value, "surveyId");
            return (Criteria) this;
        }

        public Criteria andSurveyIdLike(String value) {
            addCriterion("SURVEY_ID like", value, "surveyId");
            return (Criteria) this;
        }

        public Criteria andSurveyIdNotLike(String value) {
            addCriterion("SURVEY_ID not like", value, "surveyId");
            return (Criteria) this;
        }

        public Criteria andSurveyIdIn(List<String> values) {
            addCriterion("SURVEY_ID in", values, "surveyId");
            return (Criteria) this;
        }

        public Criteria andSurveyIdNotIn(List<String> values) {
            addCriterion("SURVEY_ID not in", values, "surveyId");
            return (Criteria) this;
        }

        public Criteria andSurveyIdBetween(String value1, String value2) {
            addCriterion("SURVEY_ID between", value1, value2, "surveyId");
            return (Criteria) this;
        }

        public Criteria andSurveyIdNotBetween(String value1, String value2) {
            addCriterion("SURVEY_ID not between", value1, value2, "surveyId");
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

        public Criteria andSurveyTemplateIsNull() {
            addCriterion("SURVEY_TEMPLATE is null");
            return (Criteria) this;
        }

        public Criteria andSurveyTemplateIsNotNull() {
            addCriterion("SURVEY_TEMPLATE is not null");
            return (Criteria) this;
        }

        public Criteria andSurveyTemplateEqualTo(String value) {
            addCriterion("SURVEY_TEMPLATE =", value, "surveyTemplate");
            return (Criteria) this;
        }

        public Criteria andSurveyTemplateNotEqualTo(String value) {
            addCriterion("SURVEY_TEMPLATE <>", value, "surveyTemplate");
            return (Criteria) this;
        }

        public Criteria andSurveyTemplateGreaterThan(String value) {
            addCriterion("SURVEY_TEMPLATE >", value, "surveyTemplate");
            return (Criteria) this;
        }

        public Criteria andSurveyTemplateGreaterThanOrEqualTo(String value) {
            addCriterion("SURVEY_TEMPLATE >=", value, "surveyTemplate");
            return (Criteria) this;
        }

        public Criteria andSurveyTemplateLessThan(String value) {
            addCriterion("SURVEY_TEMPLATE <", value, "surveyTemplate");
            return (Criteria) this;
        }

        public Criteria andSurveyTemplateLessThanOrEqualTo(String value) {
            addCriterion("SURVEY_TEMPLATE <=", value, "surveyTemplate");
            return (Criteria) this;
        }

        public Criteria andSurveyTemplateLike(String value) {
            addCriterion("SURVEY_TEMPLATE like", value, "surveyTemplate");
            return (Criteria) this;
        }

        public Criteria andSurveyTemplateNotLike(String value) {
            addCriterion("SURVEY_TEMPLATE not like", value, "surveyTemplate");
            return (Criteria) this;
        }

        public Criteria andSurveyTemplateIn(List<String> values) {
            addCriterion("SURVEY_TEMPLATE in", values, "surveyTemplate");
            return (Criteria) this;
        }

        public Criteria andSurveyTemplateNotIn(List<String> values) {
            addCriterion("SURVEY_TEMPLATE not in", values, "surveyTemplate");
            return (Criteria) this;
        }

        public Criteria andSurveyTemplateBetween(String value1, String value2) {
            addCriterion("SURVEY_TEMPLATE between", value1, value2, "surveyTemplate");
            return (Criteria) this;
        }

        public Criteria andSurveyTemplateNotBetween(String value1, String value2) {
            addCriterion("SURVEY_TEMPLATE not between", value1, value2, "surveyTemplate");
            return (Criteria) this;
        }

        public Criteria andResultTemplateIsNull() {
            addCriterion("RESULT_TEMPLATE is null");
            return (Criteria) this;
        }

        public Criteria andResultTemplateIsNotNull() {
            addCriterion("RESULT_TEMPLATE is not null");
            return (Criteria) this;
        }

        public Criteria andResultTemplateEqualTo(String value) {
            addCriterion("RESULT_TEMPLATE =", value, "resultTemplate");
            return (Criteria) this;
        }

        public Criteria andResultTemplateNotEqualTo(String value) {
            addCriterion("RESULT_TEMPLATE <>", value, "resultTemplate");
            return (Criteria) this;
        }

        public Criteria andResultTemplateGreaterThan(String value) {
            addCriterion("RESULT_TEMPLATE >", value, "resultTemplate");
            return (Criteria) this;
        }

        public Criteria andResultTemplateGreaterThanOrEqualTo(String value) {
            addCriterion("RESULT_TEMPLATE >=", value, "resultTemplate");
            return (Criteria) this;
        }

        public Criteria andResultTemplateLessThan(String value) {
            addCriterion("RESULT_TEMPLATE <", value, "resultTemplate");
            return (Criteria) this;
        }

        public Criteria andResultTemplateLessThanOrEqualTo(String value) {
            addCriterion("RESULT_TEMPLATE <=", value, "resultTemplate");
            return (Criteria) this;
        }

        public Criteria andResultTemplateLike(String value) {
            addCriterion("RESULT_TEMPLATE like", value, "resultTemplate");
            return (Criteria) this;
        }

        public Criteria andResultTemplateNotLike(String value) {
            addCriterion("RESULT_TEMPLATE not like", value, "resultTemplate");
            return (Criteria) this;
        }

        public Criteria andResultTemplateIn(List<String> values) {
            addCriterion("RESULT_TEMPLATE in", values, "resultTemplate");
            return (Criteria) this;
        }

        public Criteria andResultTemplateNotIn(List<String> values) {
            addCriterion("RESULT_TEMPLATE not in", values, "resultTemplate");
            return (Criteria) this;
        }

        public Criteria andResultTemplateBetween(String value1, String value2) {
            addCriterion("RESULT_TEMPLATE between", value1, value2, "resultTemplate");
            return (Criteria) this;
        }

        public Criteria andResultTemplateNotBetween(String value1, String value2) {
            addCriterion("RESULT_TEMPLATE not between", value1, value2, "resultTemplate");
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