package org.efbiz.product.product.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductSearchResultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public ProductSearchResultExample() {
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

        public Criteria andProductSearchResultIdIsNull() {
            addCriterion("PRODUCT_SEARCH_RESULT_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductSearchResultIdIsNotNull() {
            addCriterion("PRODUCT_SEARCH_RESULT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductSearchResultIdEqualTo(String value) {
            addCriterion("PRODUCT_SEARCH_RESULT_ID =", value, "productSearchResultId");
            return (Criteria) this;
        }

        public Criteria andProductSearchResultIdNotEqualTo(String value) {
            addCriterion("PRODUCT_SEARCH_RESULT_ID <>", value, "productSearchResultId");
            return (Criteria) this;
        }

        public Criteria andProductSearchResultIdGreaterThan(String value) {
            addCriterion("PRODUCT_SEARCH_RESULT_ID >", value, "productSearchResultId");
            return (Criteria) this;
        }

        public Criteria andProductSearchResultIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_SEARCH_RESULT_ID >=", value, "productSearchResultId");
            return (Criteria) this;
        }

        public Criteria andProductSearchResultIdLessThan(String value) {
            addCriterion("PRODUCT_SEARCH_RESULT_ID <", value, "productSearchResultId");
            return (Criteria) this;
        }

        public Criteria andProductSearchResultIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_SEARCH_RESULT_ID <=", value, "productSearchResultId");
            return (Criteria) this;
        }

        public Criteria andProductSearchResultIdLike(String value) {
            addCriterion("PRODUCT_SEARCH_RESULT_ID like", value, "productSearchResultId");
            return (Criteria) this;
        }

        public Criteria andProductSearchResultIdNotLike(String value) {
            addCriterion("PRODUCT_SEARCH_RESULT_ID not like", value, "productSearchResultId");
            return (Criteria) this;
        }

        public Criteria andProductSearchResultIdIn(List<String> values) {
            addCriterion("PRODUCT_SEARCH_RESULT_ID in", values, "productSearchResultId");
            return (Criteria) this;
        }

        public Criteria andProductSearchResultIdNotIn(List<String> values) {
            addCriterion("PRODUCT_SEARCH_RESULT_ID not in", values, "productSearchResultId");
            return (Criteria) this;
        }

        public Criteria andProductSearchResultIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_SEARCH_RESULT_ID between", value1, value2, "productSearchResultId");
            return (Criteria) this;
        }

        public Criteria andProductSearchResultIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_SEARCH_RESULT_ID not between", value1, value2, "productSearchResultId");
            return (Criteria) this;
        }

        public Criteria andVisitIdIsNull() {
            addCriterion("VISIT_ID is null");
            return (Criteria) this;
        }

        public Criteria andVisitIdIsNotNull() {
            addCriterion("VISIT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVisitIdEqualTo(String value) {
            addCriterion("VISIT_ID =", value, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdNotEqualTo(String value) {
            addCriterion("VISIT_ID <>", value, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdGreaterThan(String value) {
            addCriterion("VISIT_ID >", value, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdGreaterThanOrEqualTo(String value) {
            addCriterion("VISIT_ID >=", value, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdLessThan(String value) {
            addCriterion("VISIT_ID <", value, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdLessThanOrEqualTo(String value) {
            addCriterion("VISIT_ID <=", value, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdLike(String value) {
            addCriterion("VISIT_ID like", value, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdNotLike(String value) {
            addCriterion("VISIT_ID not like", value, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdIn(List<String> values) {
            addCriterion("VISIT_ID in", values, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdNotIn(List<String> values) {
            addCriterion("VISIT_ID not in", values, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdBetween(String value1, String value2) {
            addCriterion("VISIT_ID between", value1, value2, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdNotBetween(String value1, String value2) {
            addCriterion("VISIT_ID not between", value1, value2, "visitId");
            return (Criteria) this;
        }

        public Criteria andOrderByNameIsNull() {
            addCriterion("ORDER_BY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOrderByNameIsNotNull() {
            addCriterion("ORDER_BY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOrderByNameEqualTo(String value) {
            addCriterion("ORDER_BY_NAME =", value, "orderByName");
            return (Criteria) this;
        }

        public Criteria andOrderByNameNotEqualTo(String value) {
            addCriterion("ORDER_BY_NAME <>", value, "orderByName");
            return (Criteria) this;
        }

        public Criteria andOrderByNameGreaterThan(String value) {
            addCriterion("ORDER_BY_NAME >", value, "orderByName");
            return (Criteria) this;
        }

        public Criteria andOrderByNameGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_BY_NAME >=", value, "orderByName");
            return (Criteria) this;
        }

        public Criteria andOrderByNameLessThan(String value) {
            addCriterion("ORDER_BY_NAME <", value, "orderByName");
            return (Criteria) this;
        }

        public Criteria andOrderByNameLessThanOrEqualTo(String value) {
            addCriterion("ORDER_BY_NAME <=", value, "orderByName");
            return (Criteria) this;
        }

        public Criteria andOrderByNameLike(String value) {
            addCriterion("ORDER_BY_NAME like", value, "orderByName");
            return (Criteria) this;
        }

        public Criteria andOrderByNameNotLike(String value) {
            addCriterion("ORDER_BY_NAME not like", value, "orderByName");
            return (Criteria) this;
        }

        public Criteria andOrderByNameIn(List<String> values) {
            addCriterion("ORDER_BY_NAME in", values, "orderByName");
            return (Criteria) this;
        }

        public Criteria andOrderByNameNotIn(List<String> values) {
            addCriterion("ORDER_BY_NAME not in", values, "orderByName");
            return (Criteria) this;
        }

        public Criteria andOrderByNameBetween(String value1, String value2) {
            addCriterion("ORDER_BY_NAME between", value1, value2, "orderByName");
            return (Criteria) this;
        }

        public Criteria andOrderByNameNotBetween(String value1, String value2) {
            addCriterion("ORDER_BY_NAME not between", value1, value2, "orderByName");
            return (Criteria) this;
        }

        public Criteria andIsAscendingIsNull() {
            addCriterion("IS_ASCENDING is null");
            return (Criteria) this;
        }

        public Criteria andIsAscendingIsNotNull() {
            addCriterion("IS_ASCENDING is not null");
            return (Criteria) this;
        }

        public Criteria andIsAscendingEqualTo(String value) {
            addCriterion("IS_ASCENDING =", value, "isAscending");
            return (Criteria) this;
        }

        public Criteria andIsAscendingNotEqualTo(String value) {
            addCriterion("IS_ASCENDING <>", value, "isAscending");
            return (Criteria) this;
        }

        public Criteria andIsAscendingGreaterThan(String value) {
            addCriterion("IS_ASCENDING >", value, "isAscending");
            return (Criteria) this;
        }

        public Criteria andIsAscendingGreaterThanOrEqualTo(String value) {
            addCriterion("IS_ASCENDING >=", value, "isAscending");
            return (Criteria) this;
        }

        public Criteria andIsAscendingLessThan(String value) {
            addCriterion("IS_ASCENDING <", value, "isAscending");
            return (Criteria) this;
        }

        public Criteria andIsAscendingLessThanOrEqualTo(String value) {
            addCriterion("IS_ASCENDING <=", value, "isAscending");
            return (Criteria) this;
        }

        public Criteria andIsAscendingLike(String value) {
            addCriterion("IS_ASCENDING like", value, "isAscending");
            return (Criteria) this;
        }

        public Criteria andIsAscendingNotLike(String value) {
            addCriterion("IS_ASCENDING not like", value, "isAscending");
            return (Criteria) this;
        }

        public Criteria andIsAscendingIn(List<String> values) {
            addCriterion("IS_ASCENDING in", values, "isAscending");
            return (Criteria) this;
        }

        public Criteria andIsAscendingNotIn(List<String> values) {
            addCriterion("IS_ASCENDING not in", values, "isAscending");
            return (Criteria) this;
        }

        public Criteria andIsAscendingBetween(String value1, String value2) {
            addCriterion("IS_ASCENDING between", value1, value2, "isAscending");
            return (Criteria) this;
        }

        public Criteria andIsAscendingNotBetween(String value1, String value2) {
            addCriterion("IS_ASCENDING not between", value1, value2, "isAscending");
            return (Criteria) this;
        }

        public Criteria andNumResultsIsNull() {
            addCriterion("NUM_RESULTS is null");
            return (Criteria) this;
        }

        public Criteria andNumResultsIsNotNull() {
            addCriterion("NUM_RESULTS is not null");
            return (Criteria) this;
        }

        public Criteria andNumResultsEqualTo(BigDecimal value) {
            addCriterion("NUM_RESULTS =", value, "numResults");
            return (Criteria) this;
        }

        public Criteria andNumResultsNotEqualTo(BigDecimal value) {
            addCriterion("NUM_RESULTS <>", value, "numResults");
            return (Criteria) this;
        }

        public Criteria andNumResultsGreaterThan(BigDecimal value) {
            addCriterion("NUM_RESULTS >", value, "numResults");
            return (Criteria) this;
        }

        public Criteria andNumResultsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NUM_RESULTS >=", value, "numResults");
            return (Criteria) this;
        }

        public Criteria andNumResultsLessThan(BigDecimal value) {
            addCriterion("NUM_RESULTS <", value, "numResults");
            return (Criteria) this;
        }

        public Criteria andNumResultsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NUM_RESULTS <=", value, "numResults");
            return (Criteria) this;
        }

        public Criteria andNumResultsIn(List<BigDecimal> values) {
            addCriterion("NUM_RESULTS in", values, "numResults");
            return (Criteria) this;
        }

        public Criteria andNumResultsNotIn(List<BigDecimal> values) {
            addCriterion("NUM_RESULTS not in", values, "numResults");
            return (Criteria) this;
        }

        public Criteria andNumResultsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUM_RESULTS between", value1, value2, "numResults");
            return (Criteria) this;
        }

        public Criteria andNumResultsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUM_RESULTS not between", value1, value2, "numResults");
            return (Criteria) this;
        }

        public Criteria andSecondsTotalIsNull() {
            addCriterion("SECONDS_TOTAL is null");
            return (Criteria) this;
        }

        public Criteria andSecondsTotalIsNotNull() {
            addCriterion("SECONDS_TOTAL is not null");
            return (Criteria) this;
        }

        public Criteria andSecondsTotalEqualTo(Double value) {
            addCriterion("SECONDS_TOTAL =", value, "secondsTotal");
            return (Criteria) this;
        }

        public Criteria andSecondsTotalNotEqualTo(Double value) {
            addCriterion("SECONDS_TOTAL <>", value, "secondsTotal");
            return (Criteria) this;
        }

        public Criteria andSecondsTotalGreaterThan(Double value) {
            addCriterion("SECONDS_TOTAL >", value, "secondsTotal");
            return (Criteria) this;
        }

        public Criteria andSecondsTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("SECONDS_TOTAL >=", value, "secondsTotal");
            return (Criteria) this;
        }

        public Criteria andSecondsTotalLessThan(Double value) {
            addCriterion("SECONDS_TOTAL <", value, "secondsTotal");
            return (Criteria) this;
        }

        public Criteria andSecondsTotalLessThanOrEqualTo(Double value) {
            addCriterion("SECONDS_TOTAL <=", value, "secondsTotal");
            return (Criteria) this;
        }

        public Criteria andSecondsTotalIn(List<Double> values) {
            addCriterion("SECONDS_TOTAL in", values, "secondsTotal");
            return (Criteria) this;
        }

        public Criteria andSecondsTotalNotIn(List<Double> values) {
            addCriterion("SECONDS_TOTAL not in", values, "secondsTotal");
            return (Criteria) this;
        }

        public Criteria andSecondsTotalBetween(Double value1, Double value2) {
            addCriterion("SECONDS_TOTAL between", value1, value2, "secondsTotal");
            return (Criteria) this;
        }

        public Criteria andSecondsTotalNotBetween(Double value1, Double value2) {
            addCriterion("SECONDS_TOTAL not between", value1, value2, "secondsTotal");
            return (Criteria) this;
        }

        public Criteria andSearchDateIsNull() {
            addCriterion("SEARCH_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSearchDateIsNotNull() {
            addCriterion("SEARCH_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSearchDateEqualTo(Date value) {
            addCriterion("SEARCH_DATE =", value, "searchDate");
            return (Criteria) this;
        }

        public Criteria andSearchDateNotEqualTo(Date value) {
            addCriterion("SEARCH_DATE <>", value, "searchDate");
            return (Criteria) this;
        }

        public Criteria andSearchDateGreaterThan(Date value) {
            addCriterion("SEARCH_DATE >", value, "searchDate");
            return (Criteria) this;
        }

        public Criteria andSearchDateGreaterThanOrEqualTo(Date value) {
            addCriterion("SEARCH_DATE >=", value, "searchDate");
            return (Criteria) this;
        }

        public Criteria andSearchDateLessThan(Date value) {
            addCriterion("SEARCH_DATE <", value, "searchDate");
            return (Criteria) this;
        }

        public Criteria andSearchDateLessThanOrEqualTo(Date value) {
            addCriterion("SEARCH_DATE <=", value, "searchDate");
            return (Criteria) this;
        }

        public Criteria andSearchDateIn(List<Date> values) {
            addCriterion("SEARCH_DATE in", values, "searchDate");
            return (Criteria) this;
        }

        public Criteria andSearchDateNotIn(List<Date> values) {
            addCriterion("SEARCH_DATE not in", values, "searchDate");
            return (Criteria) this;
        }

        public Criteria andSearchDateBetween(Date value1, Date value2) {
            addCriterion("SEARCH_DATE between", value1, value2, "searchDate");
            return (Criteria) this;
        }

        public Criteria andSearchDateNotBetween(Date value1, Date value2) {
            addCriterion("SEARCH_DATE not between", value1, value2, "searchDate");
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