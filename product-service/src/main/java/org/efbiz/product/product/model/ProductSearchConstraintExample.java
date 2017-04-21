package org.efbiz.product.product.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductSearchConstraintExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public ProductSearchConstraintExample() {
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

        public Criteria andConstraintSeqIdIsNull() {
            addCriterion("CONSTRAINT_SEQ_ID is null");
            return (Criteria) this;
        }

        public Criteria andConstraintSeqIdIsNotNull() {
            addCriterion("CONSTRAINT_SEQ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andConstraintSeqIdEqualTo(String value) {
            addCriterion("CONSTRAINT_SEQ_ID =", value, "constraintSeqId");
            return (Criteria) this;
        }

        public Criteria andConstraintSeqIdNotEqualTo(String value) {
            addCriterion("CONSTRAINT_SEQ_ID <>", value, "constraintSeqId");
            return (Criteria) this;
        }

        public Criteria andConstraintSeqIdGreaterThan(String value) {
            addCriterion("CONSTRAINT_SEQ_ID >", value, "constraintSeqId");
            return (Criteria) this;
        }

        public Criteria andConstraintSeqIdGreaterThanOrEqualTo(String value) {
            addCriterion("CONSTRAINT_SEQ_ID >=", value, "constraintSeqId");
            return (Criteria) this;
        }

        public Criteria andConstraintSeqIdLessThan(String value) {
            addCriterion("CONSTRAINT_SEQ_ID <", value, "constraintSeqId");
            return (Criteria) this;
        }

        public Criteria andConstraintSeqIdLessThanOrEqualTo(String value) {
            addCriterion("CONSTRAINT_SEQ_ID <=", value, "constraintSeqId");
            return (Criteria) this;
        }

        public Criteria andConstraintSeqIdLike(String value) {
            addCriterion("CONSTRAINT_SEQ_ID like", value, "constraintSeqId");
            return (Criteria) this;
        }

        public Criteria andConstraintSeqIdNotLike(String value) {
            addCriterion("CONSTRAINT_SEQ_ID not like", value, "constraintSeqId");
            return (Criteria) this;
        }

        public Criteria andConstraintSeqIdIn(List<String> values) {
            addCriterion("CONSTRAINT_SEQ_ID in", values, "constraintSeqId");
            return (Criteria) this;
        }

        public Criteria andConstraintSeqIdNotIn(List<String> values) {
            addCriterion("CONSTRAINT_SEQ_ID not in", values, "constraintSeqId");
            return (Criteria) this;
        }

        public Criteria andConstraintSeqIdBetween(String value1, String value2) {
            addCriterion("CONSTRAINT_SEQ_ID between", value1, value2, "constraintSeqId");
            return (Criteria) this;
        }

        public Criteria andConstraintSeqIdNotBetween(String value1, String value2) {
            addCriterion("CONSTRAINT_SEQ_ID not between", value1, value2, "constraintSeqId");
            return (Criteria) this;
        }

        public Criteria andConstraintNameIsNull() {
            addCriterion("CONSTRAINT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andConstraintNameIsNotNull() {
            addCriterion("CONSTRAINT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andConstraintNameEqualTo(String value) {
            addCriterion("CONSTRAINT_NAME =", value, "constraintName");
            return (Criteria) this;
        }

        public Criteria andConstraintNameNotEqualTo(String value) {
            addCriterion("CONSTRAINT_NAME <>", value, "constraintName");
            return (Criteria) this;
        }

        public Criteria andConstraintNameGreaterThan(String value) {
            addCriterion("CONSTRAINT_NAME >", value, "constraintName");
            return (Criteria) this;
        }

        public Criteria andConstraintNameGreaterThanOrEqualTo(String value) {
            addCriterion("CONSTRAINT_NAME >=", value, "constraintName");
            return (Criteria) this;
        }

        public Criteria andConstraintNameLessThan(String value) {
            addCriterion("CONSTRAINT_NAME <", value, "constraintName");
            return (Criteria) this;
        }

        public Criteria andConstraintNameLessThanOrEqualTo(String value) {
            addCriterion("CONSTRAINT_NAME <=", value, "constraintName");
            return (Criteria) this;
        }

        public Criteria andConstraintNameLike(String value) {
            addCriterion("CONSTRAINT_NAME like", value, "constraintName");
            return (Criteria) this;
        }

        public Criteria andConstraintNameNotLike(String value) {
            addCriterion("CONSTRAINT_NAME not like", value, "constraintName");
            return (Criteria) this;
        }

        public Criteria andConstraintNameIn(List<String> values) {
            addCriterion("CONSTRAINT_NAME in", values, "constraintName");
            return (Criteria) this;
        }

        public Criteria andConstraintNameNotIn(List<String> values) {
            addCriterion("CONSTRAINT_NAME not in", values, "constraintName");
            return (Criteria) this;
        }

        public Criteria andConstraintNameBetween(String value1, String value2) {
            addCriterion("CONSTRAINT_NAME between", value1, value2, "constraintName");
            return (Criteria) this;
        }

        public Criteria andConstraintNameNotBetween(String value1, String value2) {
            addCriterion("CONSTRAINT_NAME not between", value1, value2, "constraintName");
            return (Criteria) this;
        }

        public Criteria andInfoStringIsNull() {
            addCriterion("INFO_STRING is null");
            return (Criteria) this;
        }

        public Criteria andInfoStringIsNotNull() {
            addCriterion("INFO_STRING is not null");
            return (Criteria) this;
        }

        public Criteria andInfoStringEqualTo(String value) {
            addCriterion("INFO_STRING =", value, "infoString");
            return (Criteria) this;
        }

        public Criteria andInfoStringNotEqualTo(String value) {
            addCriterion("INFO_STRING <>", value, "infoString");
            return (Criteria) this;
        }

        public Criteria andInfoStringGreaterThan(String value) {
            addCriterion("INFO_STRING >", value, "infoString");
            return (Criteria) this;
        }

        public Criteria andInfoStringGreaterThanOrEqualTo(String value) {
            addCriterion("INFO_STRING >=", value, "infoString");
            return (Criteria) this;
        }

        public Criteria andInfoStringLessThan(String value) {
            addCriterion("INFO_STRING <", value, "infoString");
            return (Criteria) this;
        }

        public Criteria andInfoStringLessThanOrEqualTo(String value) {
            addCriterion("INFO_STRING <=", value, "infoString");
            return (Criteria) this;
        }

        public Criteria andInfoStringLike(String value) {
            addCriterion("INFO_STRING like", value, "infoString");
            return (Criteria) this;
        }

        public Criteria andInfoStringNotLike(String value) {
            addCriterion("INFO_STRING not like", value, "infoString");
            return (Criteria) this;
        }

        public Criteria andInfoStringIn(List<String> values) {
            addCriterion("INFO_STRING in", values, "infoString");
            return (Criteria) this;
        }

        public Criteria andInfoStringNotIn(List<String> values) {
            addCriterion("INFO_STRING not in", values, "infoString");
            return (Criteria) this;
        }

        public Criteria andInfoStringBetween(String value1, String value2) {
            addCriterion("INFO_STRING between", value1, value2, "infoString");
            return (Criteria) this;
        }

        public Criteria andInfoStringNotBetween(String value1, String value2) {
            addCriterion("INFO_STRING not between", value1, value2, "infoString");
            return (Criteria) this;
        }

        public Criteria andIncludeSubCategoriesIsNull() {
            addCriterion("INCLUDE_SUB_CATEGORIES is null");
            return (Criteria) this;
        }

        public Criteria andIncludeSubCategoriesIsNotNull() {
            addCriterion("INCLUDE_SUB_CATEGORIES is not null");
            return (Criteria) this;
        }

        public Criteria andIncludeSubCategoriesEqualTo(String value) {
            addCriterion("INCLUDE_SUB_CATEGORIES =", value, "includeSubCategories");
            return (Criteria) this;
        }

        public Criteria andIncludeSubCategoriesNotEqualTo(String value) {
            addCriterion("INCLUDE_SUB_CATEGORIES <>", value, "includeSubCategories");
            return (Criteria) this;
        }

        public Criteria andIncludeSubCategoriesGreaterThan(String value) {
            addCriterion("INCLUDE_SUB_CATEGORIES >", value, "includeSubCategories");
            return (Criteria) this;
        }

        public Criteria andIncludeSubCategoriesGreaterThanOrEqualTo(String value) {
            addCriterion("INCLUDE_SUB_CATEGORIES >=", value, "includeSubCategories");
            return (Criteria) this;
        }

        public Criteria andIncludeSubCategoriesLessThan(String value) {
            addCriterion("INCLUDE_SUB_CATEGORIES <", value, "includeSubCategories");
            return (Criteria) this;
        }

        public Criteria andIncludeSubCategoriesLessThanOrEqualTo(String value) {
            addCriterion("INCLUDE_SUB_CATEGORIES <=", value, "includeSubCategories");
            return (Criteria) this;
        }

        public Criteria andIncludeSubCategoriesLike(String value) {
            addCriterion("INCLUDE_SUB_CATEGORIES like", value, "includeSubCategories");
            return (Criteria) this;
        }

        public Criteria andIncludeSubCategoriesNotLike(String value) {
            addCriterion("INCLUDE_SUB_CATEGORIES not like", value, "includeSubCategories");
            return (Criteria) this;
        }

        public Criteria andIncludeSubCategoriesIn(List<String> values) {
            addCriterion("INCLUDE_SUB_CATEGORIES in", values, "includeSubCategories");
            return (Criteria) this;
        }

        public Criteria andIncludeSubCategoriesNotIn(List<String> values) {
            addCriterion("INCLUDE_SUB_CATEGORIES not in", values, "includeSubCategories");
            return (Criteria) this;
        }

        public Criteria andIncludeSubCategoriesBetween(String value1, String value2) {
            addCriterion("INCLUDE_SUB_CATEGORIES between", value1, value2, "includeSubCategories");
            return (Criteria) this;
        }

        public Criteria andIncludeSubCategoriesNotBetween(String value1, String value2) {
            addCriterion("INCLUDE_SUB_CATEGORIES not between", value1, value2, "includeSubCategories");
            return (Criteria) this;
        }

        public Criteria andIsAndIsNull() {
            addCriterion("IS_AND is null");
            return (Criteria) this;
        }

        public Criteria andIsAndIsNotNull() {
            addCriterion("IS_AND is not null");
            return (Criteria) this;
        }

        public Criteria andIsAndEqualTo(String value) {
            addCriterion("IS_AND =", value, "isAnd");
            return (Criteria) this;
        }

        public Criteria andIsAndNotEqualTo(String value) {
            addCriterion("IS_AND <>", value, "isAnd");
            return (Criteria) this;
        }

        public Criteria andIsAndGreaterThan(String value) {
            addCriterion("IS_AND >", value, "isAnd");
            return (Criteria) this;
        }

        public Criteria andIsAndGreaterThanOrEqualTo(String value) {
            addCriterion("IS_AND >=", value, "isAnd");
            return (Criteria) this;
        }

        public Criteria andIsAndLessThan(String value) {
            addCriterion("IS_AND <", value, "isAnd");
            return (Criteria) this;
        }

        public Criteria andIsAndLessThanOrEqualTo(String value) {
            addCriterion("IS_AND <=", value, "isAnd");
            return (Criteria) this;
        }

        public Criteria andIsAndLike(String value) {
            addCriterion("IS_AND like", value, "isAnd");
            return (Criteria) this;
        }

        public Criteria andIsAndNotLike(String value) {
            addCriterion("IS_AND not like", value, "isAnd");
            return (Criteria) this;
        }

        public Criteria andIsAndIn(List<String> values) {
            addCriterion("IS_AND in", values, "isAnd");
            return (Criteria) this;
        }

        public Criteria andIsAndNotIn(List<String> values) {
            addCriterion("IS_AND not in", values, "isAnd");
            return (Criteria) this;
        }

        public Criteria andIsAndBetween(String value1, String value2) {
            addCriterion("IS_AND between", value1, value2, "isAnd");
            return (Criteria) this;
        }

        public Criteria andIsAndNotBetween(String value1, String value2) {
            addCriterion("IS_AND not between", value1, value2, "isAnd");
            return (Criteria) this;
        }

        public Criteria andAnyPrefixIsNull() {
            addCriterion("ANY_PREFIX is null");
            return (Criteria) this;
        }

        public Criteria andAnyPrefixIsNotNull() {
            addCriterion("ANY_PREFIX is not null");
            return (Criteria) this;
        }

        public Criteria andAnyPrefixEqualTo(String value) {
            addCriterion("ANY_PREFIX =", value, "anyPrefix");
            return (Criteria) this;
        }

        public Criteria andAnyPrefixNotEqualTo(String value) {
            addCriterion("ANY_PREFIX <>", value, "anyPrefix");
            return (Criteria) this;
        }

        public Criteria andAnyPrefixGreaterThan(String value) {
            addCriterion("ANY_PREFIX >", value, "anyPrefix");
            return (Criteria) this;
        }

        public Criteria andAnyPrefixGreaterThanOrEqualTo(String value) {
            addCriterion("ANY_PREFIX >=", value, "anyPrefix");
            return (Criteria) this;
        }

        public Criteria andAnyPrefixLessThan(String value) {
            addCriterion("ANY_PREFIX <", value, "anyPrefix");
            return (Criteria) this;
        }

        public Criteria andAnyPrefixLessThanOrEqualTo(String value) {
            addCriterion("ANY_PREFIX <=", value, "anyPrefix");
            return (Criteria) this;
        }

        public Criteria andAnyPrefixLike(String value) {
            addCriterion("ANY_PREFIX like", value, "anyPrefix");
            return (Criteria) this;
        }

        public Criteria andAnyPrefixNotLike(String value) {
            addCriterion("ANY_PREFIX not like", value, "anyPrefix");
            return (Criteria) this;
        }

        public Criteria andAnyPrefixIn(List<String> values) {
            addCriterion("ANY_PREFIX in", values, "anyPrefix");
            return (Criteria) this;
        }

        public Criteria andAnyPrefixNotIn(List<String> values) {
            addCriterion("ANY_PREFIX not in", values, "anyPrefix");
            return (Criteria) this;
        }

        public Criteria andAnyPrefixBetween(String value1, String value2) {
            addCriterion("ANY_PREFIX between", value1, value2, "anyPrefix");
            return (Criteria) this;
        }

        public Criteria andAnyPrefixNotBetween(String value1, String value2) {
            addCriterion("ANY_PREFIX not between", value1, value2, "anyPrefix");
            return (Criteria) this;
        }

        public Criteria andAnySuffixIsNull() {
            addCriterion("ANY_SUFFIX is null");
            return (Criteria) this;
        }

        public Criteria andAnySuffixIsNotNull() {
            addCriterion("ANY_SUFFIX is not null");
            return (Criteria) this;
        }

        public Criteria andAnySuffixEqualTo(String value) {
            addCriterion("ANY_SUFFIX =", value, "anySuffix");
            return (Criteria) this;
        }

        public Criteria andAnySuffixNotEqualTo(String value) {
            addCriterion("ANY_SUFFIX <>", value, "anySuffix");
            return (Criteria) this;
        }

        public Criteria andAnySuffixGreaterThan(String value) {
            addCriterion("ANY_SUFFIX >", value, "anySuffix");
            return (Criteria) this;
        }

        public Criteria andAnySuffixGreaterThanOrEqualTo(String value) {
            addCriterion("ANY_SUFFIX >=", value, "anySuffix");
            return (Criteria) this;
        }

        public Criteria andAnySuffixLessThan(String value) {
            addCriterion("ANY_SUFFIX <", value, "anySuffix");
            return (Criteria) this;
        }

        public Criteria andAnySuffixLessThanOrEqualTo(String value) {
            addCriterion("ANY_SUFFIX <=", value, "anySuffix");
            return (Criteria) this;
        }

        public Criteria andAnySuffixLike(String value) {
            addCriterion("ANY_SUFFIX like", value, "anySuffix");
            return (Criteria) this;
        }

        public Criteria andAnySuffixNotLike(String value) {
            addCriterion("ANY_SUFFIX not like", value, "anySuffix");
            return (Criteria) this;
        }

        public Criteria andAnySuffixIn(List<String> values) {
            addCriterion("ANY_SUFFIX in", values, "anySuffix");
            return (Criteria) this;
        }

        public Criteria andAnySuffixNotIn(List<String> values) {
            addCriterion("ANY_SUFFIX not in", values, "anySuffix");
            return (Criteria) this;
        }

        public Criteria andAnySuffixBetween(String value1, String value2) {
            addCriterion("ANY_SUFFIX between", value1, value2, "anySuffix");
            return (Criteria) this;
        }

        public Criteria andAnySuffixNotBetween(String value1, String value2) {
            addCriterion("ANY_SUFFIX not between", value1, value2, "anySuffix");
            return (Criteria) this;
        }

        public Criteria andRemoveStemsIsNull() {
            addCriterion("REMOVE_STEMS is null");
            return (Criteria) this;
        }

        public Criteria andRemoveStemsIsNotNull() {
            addCriterion("REMOVE_STEMS is not null");
            return (Criteria) this;
        }

        public Criteria andRemoveStemsEqualTo(String value) {
            addCriterion("REMOVE_STEMS =", value, "removeStems");
            return (Criteria) this;
        }

        public Criteria andRemoveStemsNotEqualTo(String value) {
            addCriterion("REMOVE_STEMS <>", value, "removeStems");
            return (Criteria) this;
        }

        public Criteria andRemoveStemsGreaterThan(String value) {
            addCriterion("REMOVE_STEMS >", value, "removeStems");
            return (Criteria) this;
        }

        public Criteria andRemoveStemsGreaterThanOrEqualTo(String value) {
            addCriterion("REMOVE_STEMS >=", value, "removeStems");
            return (Criteria) this;
        }

        public Criteria andRemoveStemsLessThan(String value) {
            addCriterion("REMOVE_STEMS <", value, "removeStems");
            return (Criteria) this;
        }

        public Criteria andRemoveStemsLessThanOrEqualTo(String value) {
            addCriterion("REMOVE_STEMS <=", value, "removeStems");
            return (Criteria) this;
        }

        public Criteria andRemoveStemsLike(String value) {
            addCriterion("REMOVE_STEMS like", value, "removeStems");
            return (Criteria) this;
        }

        public Criteria andRemoveStemsNotLike(String value) {
            addCriterion("REMOVE_STEMS not like", value, "removeStems");
            return (Criteria) this;
        }

        public Criteria andRemoveStemsIn(List<String> values) {
            addCriterion("REMOVE_STEMS in", values, "removeStems");
            return (Criteria) this;
        }

        public Criteria andRemoveStemsNotIn(List<String> values) {
            addCriterion("REMOVE_STEMS not in", values, "removeStems");
            return (Criteria) this;
        }

        public Criteria andRemoveStemsBetween(String value1, String value2) {
            addCriterion("REMOVE_STEMS between", value1, value2, "removeStems");
            return (Criteria) this;
        }

        public Criteria andRemoveStemsNotBetween(String value1, String value2) {
            addCriterion("REMOVE_STEMS not between", value1, value2, "removeStems");
            return (Criteria) this;
        }

        public Criteria andLowValueIsNull() {
            addCriterion("LOW_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andLowValueIsNotNull() {
            addCriterion("LOW_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andLowValueEqualTo(String value) {
            addCriterion("LOW_VALUE =", value, "lowValue");
            return (Criteria) this;
        }

        public Criteria andLowValueNotEqualTo(String value) {
            addCriterion("LOW_VALUE <>", value, "lowValue");
            return (Criteria) this;
        }

        public Criteria andLowValueGreaterThan(String value) {
            addCriterion("LOW_VALUE >", value, "lowValue");
            return (Criteria) this;
        }

        public Criteria andLowValueGreaterThanOrEqualTo(String value) {
            addCriterion("LOW_VALUE >=", value, "lowValue");
            return (Criteria) this;
        }

        public Criteria andLowValueLessThan(String value) {
            addCriterion("LOW_VALUE <", value, "lowValue");
            return (Criteria) this;
        }

        public Criteria andLowValueLessThanOrEqualTo(String value) {
            addCriterion("LOW_VALUE <=", value, "lowValue");
            return (Criteria) this;
        }

        public Criteria andLowValueLike(String value) {
            addCriterion("LOW_VALUE like", value, "lowValue");
            return (Criteria) this;
        }

        public Criteria andLowValueNotLike(String value) {
            addCriterion("LOW_VALUE not like", value, "lowValue");
            return (Criteria) this;
        }

        public Criteria andLowValueIn(List<String> values) {
            addCriterion("LOW_VALUE in", values, "lowValue");
            return (Criteria) this;
        }

        public Criteria andLowValueNotIn(List<String> values) {
            addCriterion("LOW_VALUE not in", values, "lowValue");
            return (Criteria) this;
        }

        public Criteria andLowValueBetween(String value1, String value2) {
            addCriterion("LOW_VALUE between", value1, value2, "lowValue");
            return (Criteria) this;
        }

        public Criteria andLowValueNotBetween(String value1, String value2) {
            addCriterion("LOW_VALUE not between", value1, value2, "lowValue");
            return (Criteria) this;
        }

        public Criteria andHighValueIsNull() {
            addCriterion("HIGH_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andHighValueIsNotNull() {
            addCriterion("HIGH_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andHighValueEqualTo(String value) {
            addCriterion("HIGH_VALUE =", value, "highValue");
            return (Criteria) this;
        }

        public Criteria andHighValueNotEqualTo(String value) {
            addCriterion("HIGH_VALUE <>", value, "highValue");
            return (Criteria) this;
        }

        public Criteria andHighValueGreaterThan(String value) {
            addCriterion("HIGH_VALUE >", value, "highValue");
            return (Criteria) this;
        }

        public Criteria andHighValueGreaterThanOrEqualTo(String value) {
            addCriterion("HIGH_VALUE >=", value, "highValue");
            return (Criteria) this;
        }

        public Criteria andHighValueLessThan(String value) {
            addCriterion("HIGH_VALUE <", value, "highValue");
            return (Criteria) this;
        }

        public Criteria andHighValueLessThanOrEqualTo(String value) {
            addCriterion("HIGH_VALUE <=", value, "highValue");
            return (Criteria) this;
        }

        public Criteria andHighValueLike(String value) {
            addCriterion("HIGH_VALUE like", value, "highValue");
            return (Criteria) this;
        }

        public Criteria andHighValueNotLike(String value) {
            addCriterion("HIGH_VALUE not like", value, "highValue");
            return (Criteria) this;
        }

        public Criteria andHighValueIn(List<String> values) {
            addCriterion("HIGH_VALUE in", values, "highValue");
            return (Criteria) this;
        }

        public Criteria andHighValueNotIn(List<String> values) {
            addCriterion("HIGH_VALUE not in", values, "highValue");
            return (Criteria) this;
        }

        public Criteria andHighValueBetween(String value1, String value2) {
            addCriterion("HIGH_VALUE between", value1, value2, "highValue");
            return (Criteria) this;
        }

        public Criteria andHighValueNotBetween(String value1, String value2) {
            addCriterion("HIGH_VALUE not between", value1, value2, "highValue");
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