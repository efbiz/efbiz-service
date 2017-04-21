package org.efbiz.product.product.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public ProductExample() {
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

        public Criteria andProductTypeIdIsNull() {
            addCriterion("PRODUCT_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdIsNotNull() {
            addCriterion("PRODUCT_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdEqualTo(String value) {
            addCriterion("PRODUCT_TYPE_ID =", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdNotEqualTo(String value) {
            addCriterion("PRODUCT_TYPE_ID <>", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdGreaterThan(String value) {
            addCriterion("PRODUCT_TYPE_ID >", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_TYPE_ID >=", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdLessThan(String value) {
            addCriterion("PRODUCT_TYPE_ID <", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_TYPE_ID <=", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdLike(String value) {
            addCriterion("PRODUCT_TYPE_ID like", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdNotLike(String value) {
            addCriterion("PRODUCT_TYPE_ID not like", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdIn(List<String> values) {
            addCriterion("PRODUCT_TYPE_ID in", values, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdNotIn(List<String> values) {
            addCriterion("PRODUCT_TYPE_ID not in", values, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_TYPE_ID between", value1, value2, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_TYPE_ID not between", value1, value2, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andPrimaryProductCategoryIdIsNull() {
            addCriterion("PRIMARY_PRODUCT_CATEGORY_ID is null");
            return (Criteria) this;
        }

        public Criteria andPrimaryProductCategoryIdIsNotNull() {
            addCriterion("PRIMARY_PRODUCT_CATEGORY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPrimaryProductCategoryIdEqualTo(String value) {
            addCriterion("PRIMARY_PRODUCT_CATEGORY_ID =", value, "primaryProductCategoryId");
            return (Criteria) this;
        }

        public Criteria andPrimaryProductCategoryIdNotEqualTo(String value) {
            addCriterion("PRIMARY_PRODUCT_CATEGORY_ID <>", value, "primaryProductCategoryId");
            return (Criteria) this;
        }

        public Criteria andPrimaryProductCategoryIdGreaterThan(String value) {
            addCriterion("PRIMARY_PRODUCT_CATEGORY_ID >", value, "primaryProductCategoryId");
            return (Criteria) this;
        }

        public Criteria andPrimaryProductCategoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRIMARY_PRODUCT_CATEGORY_ID >=", value, "primaryProductCategoryId");
            return (Criteria) this;
        }

        public Criteria andPrimaryProductCategoryIdLessThan(String value) {
            addCriterion("PRIMARY_PRODUCT_CATEGORY_ID <", value, "primaryProductCategoryId");
            return (Criteria) this;
        }

        public Criteria andPrimaryProductCategoryIdLessThanOrEqualTo(String value) {
            addCriterion("PRIMARY_PRODUCT_CATEGORY_ID <=", value, "primaryProductCategoryId");
            return (Criteria) this;
        }

        public Criteria andPrimaryProductCategoryIdLike(String value) {
            addCriterion("PRIMARY_PRODUCT_CATEGORY_ID like", value, "primaryProductCategoryId");
            return (Criteria) this;
        }

        public Criteria andPrimaryProductCategoryIdNotLike(String value) {
            addCriterion("PRIMARY_PRODUCT_CATEGORY_ID not like", value, "primaryProductCategoryId");
            return (Criteria) this;
        }

        public Criteria andPrimaryProductCategoryIdIn(List<String> values) {
            addCriterion("PRIMARY_PRODUCT_CATEGORY_ID in", values, "primaryProductCategoryId");
            return (Criteria) this;
        }

        public Criteria andPrimaryProductCategoryIdNotIn(List<String> values) {
            addCriterion("PRIMARY_PRODUCT_CATEGORY_ID not in", values, "primaryProductCategoryId");
            return (Criteria) this;
        }

        public Criteria andPrimaryProductCategoryIdBetween(String value1, String value2) {
            addCriterion("PRIMARY_PRODUCT_CATEGORY_ID between", value1, value2, "primaryProductCategoryId");
            return (Criteria) this;
        }

        public Criteria andPrimaryProductCategoryIdNotBetween(String value1, String value2) {
            addCriterion("PRIMARY_PRODUCT_CATEGORY_ID not between", value1, value2, "primaryProductCategoryId");
            return (Criteria) this;
        }

        public Criteria andManufacturerPartyIdIsNull() {
            addCriterion("MANUFACTURER_PARTY_ID is null");
            return (Criteria) this;
        }

        public Criteria andManufacturerPartyIdIsNotNull() {
            addCriterion("MANUFACTURER_PARTY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturerPartyIdEqualTo(String value) {
            addCriterion("MANUFACTURER_PARTY_ID =", value, "manufacturerPartyId");
            return (Criteria) this;
        }

        public Criteria andManufacturerPartyIdNotEqualTo(String value) {
            addCriterion("MANUFACTURER_PARTY_ID <>", value, "manufacturerPartyId");
            return (Criteria) this;
        }

        public Criteria andManufacturerPartyIdGreaterThan(String value) {
            addCriterion("MANUFACTURER_PARTY_ID >", value, "manufacturerPartyId");
            return (Criteria) this;
        }

        public Criteria andManufacturerPartyIdGreaterThanOrEqualTo(String value) {
            addCriterion("MANUFACTURER_PARTY_ID >=", value, "manufacturerPartyId");
            return (Criteria) this;
        }

        public Criteria andManufacturerPartyIdLessThan(String value) {
            addCriterion("MANUFACTURER_PARTY_ID <", value, "manufacturerPartyId");
            return (Criteria) this;
        }

        public Criteria andManufacturerPartyIdLessThanOrEqualTo(String value) {
            addCriterion("MANUFACTURER_PARTY_ID <=", value, "manufacturerPartyId");
            return (Criteria) this;
        }

        public Criteria andManufacturerPartyIdLike(String value) {
            addCriterion("MANUFACTURER_PARTY_ID like", value, "manufacturerPartyId");
            return (Criteria) this;
        }

        public Criteria andManufacturerPartyIdNotLike(String value) {
            addCriterion("MANUFACTURER_PARTY_ID not like", value, "manufacturerPartyId");
            return (Criteria) this;
        }

        public Criteria andManufacturerPartyIdIn(List<String> values) {
            addCriterion("MANUFACTURER_PARTY_ID in", values, "manufacturerPartyId");
            return (Criteria) this;
        }

        public Criteria andManufacturerPartyIdNotIn(List<String> values) {
            addCriterion("MANUFACTURER_PARTY_ID not in", values, "manufacturerPartyId");
            return (Criteria) this;
        }

        public Criteria andManufacturerPartyIdBetween(String value1, String value2) {
            addCriterion("MANUFACTURER_PARTY_ID between", value1, value2, "manufacturerPartyId");
            return (Criteria) this;
        }

        public Criteria andManufacturerPartyIdNotBetween(String value1, String value2) {
            addCriterion("MANUFACTURER_PARTY_ID not between", value1, value2, "manufacturerPartyId");
            return (Criteria) this;
        }

        public Criteria andFacilityIdIsNull() {
            addCriterion("FACILITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andFacilityIdIsNotNull() {
            addCriterion("FACILITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFacilityIdEqualTo(String value) {
            addCriterion("FACILITY_ID =", value, "facilityId");
            return (Criteria) this;
        }

        public Criteria andFacilityIdNotEqualTo(String value) {
            addCriterion("FACILITY_ID <>", value, "facilityId");
            return (Criteria) this;
        }

        public Criteria andFacilityIdGreaterThan(String value) {
            addCriterion("FACILITY_ID >", value, "facilityId");
            return (Criteria) this;
        }

        public Criteria andFacilityIdGreaterThanOrEqualTo(String value) {
            addCriterion("FACILITY_ID >=", value, "facilityId");
            return (Criteria) this;
        }

        public Criteria andFacilityIdLessThan(String value) {
            addCriterion("FACILITY_ID <", value, "facilityId");
            return (Criteria) this;
        }

        public Criteria andFacilityIdLessThanOrEqualTo(String value) {
            addCriterion("FACILITY_ID <=", value, "facilityId");
            return (Criteria) this;
        }

        public Criteria andFacilityIdLike(String value) {
            addCriterion("FACILITY_ID like", value, "facilityId");
            return (Criteria) this;
        }

        public Criteria andFacilityIdNotLike(String value) {
            addCriterion("FACILITY_ID not like", value, "facilityId");
            return (Criteria) this;
        }

        public Criteria andFacilityIdIn(List<String> values) {
            addCriterion("FACILITY_ID in", values, "facilityId");
            return (Criteria) this;
        }

        public Criteria andFacilityIdNotIn(List<String> values) {
            addCriterion("FACILITY_ID not in", values, "facilityId");
            return (Criteria) this;
        }

        public Criteria andFacilityIdBetween(String value1, String value2) {
            addCriterion("FACILITY_ID between", value1, value2, "facilityId");
            return (Criteria) this;
        }

        public Criteria andFacilityIdNotBetween(String value1, String value2) {
            addCriterion("FACILITY_ID not between", value1, value2, "facilityId");
            return (Criteria) this;
        }

        public Criteria andIntroductionDateIsNull() {
            addCriterion("INTRODUCTION_DATE is null");
            return (Criteria) this;
        }

        public Criteria andIntroductionDateIsNotNull() {
            addCriterion("INTRODUCTION_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andIntroductionDateEqualTo(Date value) {
            addCriterion("INTRODUCTION_DATE =", value, "introductionDate");
            return (Criteria) this;
        }

        public Criteria andIntroductionDateNotEqualTo(Date value) {
            addCriterion("INTRODUCTION_DATE <>", value, "introductionDate");
            return (Criteria) this;
        }

        public Criteria andIntroductionDateGreaterThan(Date value) {
            addCriterion("INTRODUCTION_DATE >", value, "introductionDate");
            return (Criteria) this;
        }

        public Criteria andIntroductionDateGreaterThanOrEqualTo(Date value) {
            addCriterion("INTRODUCTION_DATE >=", value, "introductionDate");
            return (Criteria) this;
        }

        public Criteria andIntroductionDateLessThan(Date value) {
            addCriterion("INTRODUCTION_DATE <", value, "introductionDate");
            return (Criteria) this;
        }

        public Criteria andIntroductionDateLessThanOrEqualTo(Date value) {
            addCriterion("INTRODUCTION_DATE <=", value, "introductionDate");
            return (Criteria) this;
        }

        public Criteria andIntroductionDateIn(List<Date> values) {
            addCriterion("INTRODUCTION_DATE in", values, "introductionDate");
            return (Criteria) this;
        }

        public Criteria andIntroductionDateNotIn(List<Date> values) {
            addCriterion("INTRODUCTION_DATE not in", values, "introductionDate");
            return (Criteria) this;
        }

        public Criteria andIntroductionDateBetween(Date value1, Date value2) {
            addCriterion("INTRODUCTION_DATE between", value1, value2, "introductionDate");
            return (Criteria) this;
        }

        public Criteria andIntroductionDateNotBetween(Date value1, Date value2) {
            addCriterion("INTRODUCTION_DATE not between", value1, value2, "introductionDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateIsNull() {
            addCriterion("RELEASE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andReleaseDateIsNotNull() {
            addCriterion("RELEASE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseDateEqualTo(Date value) {
            addCriterion("RELEASE_DATE =", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateNotEqualTo(Date value) {
            addCriterion("RELEASE_DATE <>", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateGreaterThan(Date value) {
            addCriterion("RELEASE_DATE >", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateGreaterThanOrEqualTo(Date value) {
            addCriterion("RELEASE_DATE >=", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateLessThan(Date value) {
            addCriterion("RELEASE_DATE <", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateLessThanOrEqualTo(Date value) {
            addCriterion("RELEASE_DATE <=", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateIn(List<Date> values) {
            addCriterion("RELEASE_DATE in", values, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateNotIn(List<Date> values) {
            addCriterion("RELEASE_DATE not in", values, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateBetween(Date value1, Date value2) {
            addCriterion("RELEASE_DATE between", value1, value2, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateNotBetween(Date value1, Date value2) {
            addCriterion("RELEASE_DATE not between", value1, value2, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andSupportDiscontinuationDateIsNull() {
            addCriterion("SUPPORT_DISCONTINUATION_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSupportDiscontinuationDateIsNotNull() {
            addCriterion("SUPPORT_DISCONTINUATION_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSupportDiscontinuationDateEqualTo(Date value) {
            addCriterion("SUPPORT_DISCONTINUATION_DATE =", value, "supportDiscontinuationDate");
            return (Criteria) this;
        }

        public Criteria andSupportDiscontinuationDateNotEqualTo(Date value) {
            addCriterion("SUPPORT_DISCONTINUATION_DATE <>", value, "supportDiscontinuationDate");
            return (Criteria) this;
        }

        public Criteria andSupportDiscontinuationDateGreaterThan(Date value) {
            addCriterion("SUPPORT_DISCONTINUATION_DATE >", value, "supportDiscontinuationDate");
            return (Criteria) this;
        }

        public Criteria andSupportDiscontinuationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("SUPPORT_DISCONTINUATION_DATE >=", value, "supportDiscontinuationDate");
            return (Criteria) this;
        }

        public Criteria andSupportDiscontinuationDateLessThan(Date value) {
            addCriterion("SUPPORT_DISCONTINUATION_DATE <", value, "supportDiscontinuationDate");
            return (Criteria) this;
        }

        public Criteria andSupportDiscontinuationDateLessThanOrEqualTo(Date value) {
            addCriterion("SUPPORT_DISCONTINUATION_DATE <=", value, "supportDiscontinuationDate");
            return (Criteria) this;
        }

        public Criteria andSupportDiscontinuationDateIn(List<Date> values) {
            addCriterion("SUPPORT_DISCONTINUATION_DATE in", values, "supportDiscontinuationDate");
            return (Criteria) this;
        }

        public Criteria andSupportDiscontinuationDateNotIn(List<Date> values) {
            addCriterion("SUPPORT_DISCONTINUATION_DATE not in", values, "supportDiscontinuationDate");
            return (Criteria) this;
        }

        public Criteria andSupportDiscontinuationDateBetween(Date value1, Date value2) {
            addCriterion("SUPPORT_DISCONTINUATION_DATE between", value1, value2, "supportDiscontinuationDate");
            return (Criteria) this;
        }

        public Criteria andSupportDiscontinuationDateNotBetween(Date value1, Date value2) {
            addCriterion("SUPPORT_DISCONTINUATION_DATE not between", value1, value2, "supportDiscontinuationDate");
            return (Criteria) this;
        }

        public Criteria andSalesDiscontinuationDateIsNull() {
            addCriterion("SALES_DISCONTINUATION_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSalesDiscontinuationDateIsNotNull() {
            addCriterion("SALES_DISCONTINUATION_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSalesDiscontinuationDateEqualTo(Date value) {
            addCriterion("SALES_DISCONTINUATION_DATE =", value, "salesDiscontinuationDate");
            return (Criteria) this;
        }

        public Criteria andSalesDiscontinuationDateNotEqualTo(Date value) {
            addCriterion("SALES_DISCONTINUATION_DATE <>", value, "salesDiscontinuationDate");
            return (Criteria) this;
        }

        public Criteria andSalesDiscontinuationDateGreaterThan(Date value) {
            addCriterion("SALES_DISCONTINUATION_DATE >", value, "salesDiscontinuationDate");
            return (Criteria) this;
        }

        public Criteria andSalesDiscontinuationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("SALES_DISCONTINUATION_DATE >=", value, "salesDiscontinuationDate");
            return (Criteria) this;
        }

        public Criteria andSalesDiscontinuationDateLessThan(Date value) {
            addCriterion("SALES_DISCONTINUATION_DATE <", value, "salesDiscontinuationDate");
            return (Criteria) this;
        }

        public Criteria andSalesDiscontinuationDateLessThanOrEqualTo(Date value) {
            addCriterion("SALES_DISCONTINUATION_DATE <=", value, "salesDiscontinuationDate");
            return (Criteria) this;
        }

        public Criteria andSalesDiscontinuationDateIn(List<Date> values) {
            addCriterion("SALES_DISCONTINUATION_DATE in", values, "salesDiscontinuationDate");
            return (Criteria) this;
        }

        public Criteria andSalesDiscontinuationDateNotIn(List<Date> values) {
            addCriterion("SALES_DISCONTINUATION_DATE not in", values, "salesDiscontinuationDate");
            return (Criteria) this;
        }

        public Criteria andSalesDiscontinuationDateBetween(Date value1, Date value2) {
            addCriterion("SALES_DISCONTINUATION_DATE between", value1, value2, "salesDiscontinuationDate");
            return (Criteria) this;
        }

        public Criteria andSalesDiscontinuationDateNotBetween(Date value1, Date value2) {
            addCriterion("SALES_DISCONTINUATION_DATE not between", value1, value2, "salesDiscontinuationDate");
            return (Criteria) this;
        }

        public Criteria andSalesDiscWhenNotAvailIsNull() {
            addCriterion("SALES_DISC_WHEN_NOT_AVAIL is null");
            return (Criteria) this;
        }

        public Criteria andSalesDiscWhenNotAvailIsNotNull() {
            addCriterion("SALES_DISC_WHEN_NOT_AVAIL is not null");
            return (Criteria) this;
        }

        public Criteria andSalesDiscWhenNotAvailEqualTo(String value) {
            addCriterion("SALES_DISC_WHEN_NOT_AVAIL =", value, "salesDiscWhenNotAvail");
            return (Criteria) this;
        }

        public Criteria andSalesDiscWhenNotAvailNotEqualTo(String value) {
            addCriterion("SALES_DISC_WHEN_NOT_AVAIL <>", value, "salesDiscWhenNotAvail");
            return (Criteria) this;
        }

        public Criteria andSalesDiscWhenNotAvailGreaterThan(String value) {
            addCriterion("SALES_DISC_WHEN_NOT_AVAIL >", value, "salesDiscWhenNotAvail");
            return (Criteria) this;
        }

        public Criteria andSalesDiscWhenNotAvailGreaterThanOrEqualTo(String value) {
            addCriterion("SALES_DISC_WHEN_NOT_AVAIL >=", value, "salesDiscWhenNotAvail");
            return (Criteria) this;
        }

        public Criteria andSalesDiscWhenNotAvailLessThan(String value) {
            addCriterion("SALES_DISC_WHEN_NOT_AVAIL <", value, "salesDiscWhenNotAvail");
            return (Criteria) this;
        }

        public Criteria andSalesDiscWhenNotAvailLessThanOrEqualTo(String value) {
            addCriterion("SALES_DISC_WHEN_NOT_AVAIL <=", value, "salesDiscWhenNotAvail");
            return (Criteria) this;
        }

        public Criteria andSalesDiscWhenNotAvailLike(String value) {
            addCriterion("SALES_DISC_WHEN_NOT_AVAIL like", value, "salesDiscWhenNotAvail");
            return (Criteria) this;
        }

        public Criteria andSalesDiscWhenNotAvailNotLike(String value) {
            addCriterion("SALES_DISC_WHEN_NOT_AVAIL not like", value, "salesDiscWhenNotAvail");
            return (Criteria) this;
        }

        public Criteria andSalesDiscWhenNotAvailIn(List<String> values) {
            addCriterion("SALES_DISC_WHEN_NOT_AVAIL in", values, "salesDiscWhenNotAvail");
            return (Criteria) this;
        }

        public Criteria andSalesDiscWhenNotAvailNotIn(List<String> values) {
            addCriterion("SALES_DISC_WHEN_NOT_AVAIL not in", values, "salesDiscWhenNotAvail");
            return (Criteria) this;
        }

        public Criteria andSalesDiscWhenNotAvailBetween(String value1, String value2) {
            addCriterion("SALES_DISC_WHEN_NOT_AVAIL between", value1, value2, "salesDiscWhenNotAvail");
            return (Criteria) this;
        }

        public Criteria andSalesDiscWhenNotAvailNotBetween(String value1, String value2) {
            addCriterion("SALES_DISC_WHEN_NOT_AVAIL not between", value1, value2, "salesDiscWhenNotAvail");
            return (Criteria) this;
        }

        public Criteria andInternalNameIsNull() {
            addCriterion("INTERNAL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andInternalNameIsNotNull() {
            addCriterion("INTERNAL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andInternalNameEqualTo(String value) {
            addCriterion("INTERNAL_NAME =", value, "internalName");
            return (Criteria) this;
        }

        public Criteria andInternalNameNotEqualTo(String value) {
            addCriterion("INTERNAL_NAME <>", value, "internalName");
            return (Criteria) this;
        }

        public Criteria andInternalNameGreaterThan(String value) {
            addCriterion("INTERNAL_NAME >", value, "internalName");
            return (Criteria) this;
        }

        public Criteria andInternalNameGreaterThanOrEqualTo(String value) {
            addCriterion("INTERNAL_NAME >=", value, "internalName");
            return (Criteria) this;
        }

        public Criteria andInternalNameLessThan(String value) {
            addCriterion("INTERNAL_NAME <", value, "internalName");
            return (Criteria) this;
        }

        public Criteria andInternalNameLessThanOrEqualTo(String value) {
            addCriterion("INTERNAL_NAME <=", value, "internalName");
            return (Criteria) this;
        }

        public Criteria andInternalNameLike(String value) {
            addCriterion("INTERNAL_NAME like", value, "internalName");
            return (Criteria) this;
        }

        public Criteria andInternalNameNotLike(String value) {
            addCriterion("INTERNAL_NAME not like", value, "internalName");
            return (Criteria) this;
        }

        public Criteria andInternalNameIn(List<String> values) {
            addCriterion("INTERNAL_NAME in", values, "internalName");
            return (Criteria) this;
        }

        public Criteria andInternalNameNotIn(List<String> values) {
            addCriterion("INTERNAL_NAME not in", values, "internalName");
            return (Criteria) this;
        }

        public Criteria andInternalNameBetween(String value1, String value2) {
            addCriterion("INTERNAL_NAME between", value1, value2, "internalName");
            return (Criteria) this;
        }

        public Criteria andInternalNameNotBetween(String value1, String value2) {
            addCriterion("INTERNAL_NAME not between", value1, value2, "internalName");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNull() {
            addCriterion("BRAND_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNotNull() {
            addCriterion("BRAND_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBrandNameEqualTo(String value) {
            addCriterion("BRAND_NAME =", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotEqualTo(String value) {
            addCriterion("BRAND_NAME <>", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThan(String value) {
            addCriterion("BRAND_NAME >", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThanOrEqualTo(String value) {
            addCriterion("BRAND_NAME >=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThan(String value) {
            addCriterion("BRAND_NAME <", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThanOrEqualTo(String value) {
            addCriterion("BRAND_NAME <=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLike(String value) {
            addCriterion("BRAND_NAME like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotLike(String value) {
            addCriterion("BRAND_NAME not like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameIn(List<String> values) {
            addCriterion("BRAND_NAME in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotIn(List<String> values) {
            addCriterion("BRAND_NAME not in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameBetween(String value1, String value2) {
            addCriterion("BRAND_NAME between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotBetween(String value1, String value2) {
            addCriterion("BRAND_NAME not between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNull() {
            addCriterion("COMMENTS is null");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNotNull() {
            addCriterion("COMMENTS is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsEqualTo(String value) {
            addCriterion("COMMENTS =", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotEqualTo(String value) {
            addCriterion("COMMENTS <>", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThan(String value) {
            addCriterion("COMMENTS >", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThanOrEqualTo(String value) {
            addCriterion("COMMENTS >=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThan(String value) {
            addCriterion("COMMENTS <", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThanOrEqualTo(String value) {
            addCriterion("COMMENTS <=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLike(String value) {
            addCriterion("COMMENTS like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotLike(String value) {
            addCriterion("COMMENTS not like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsIn(List<String> values) {
            addCriterion("COMMENTS in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotIn(List<String> values) {
            addCriterion("COMMENTS not in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsBetween(String value1, String value2) {
            addCriterion("COMMENTS between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotBetween(String value1, String value2) {
            addCriterion("COMMENTS not between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("PRODUCT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("PRODUCT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("PRODUCT_NAME =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("PRODUCT_NAME <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("PRODUCT_NAME >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NAME >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("PRODUCT_NAME <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NAME <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("PRODUCT_NAME like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("PRODUCT_NAME not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("PRODUCT_NAME in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("PRODUCT_NAME not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("PRODUCT_NAME between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_NAME not between", value1, value2, "productName");
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

        public Criteria andPriceDetailTextIsNull() {
            addCriterion("PRICE_DETAIL_TEXT is null");
            return (Criteria) this;
        }

        public Criteria andPriceDetailTextIsNotNull() {
            addCriterion("PRICE_DETAIL_TEXT is not null");
            return (Criteria) this;
        }

        public Criteria andPriceDetailTextEqualTo(String value) {
            addCriterion("PRICE_DETAIL_TEXT =", value, "priceDetailText");
            return (Criteria) this;
        }

        public Criteria andPriceDetailTextNotEqualTo(String value) {
            addCriterion("PRICE_DETAIL_TEXT <>", value, "priceDetailText");
            return (Criteria) this;
        }

        public Criteria andPriceDetailTextGreaterThan(String value) {
            addCriterion("PRICE_DETAIL_TEXT >", value, "priceDetailText");
            return (Criteria) this;
        }

        public Criteria andPriceDetailTextGreaterThanOrEqualTo(String value) {
            addCriterion("PRICE_DETAIL_TEXT >=", value, "priceDetailText");
            return (Criteria) this;
        }

        public Criteria andPriceDetailTextLessThan(String value) {
            addCriterion("PRICE_DETAIL_TEXT <", value, "priceDetailText");
            return (Criteria) this;
        }

        public Criteria andPriceDetailTextLessThanOrEqualTo(String value) {
            addCriterion("PRICE_DETAIL_TEXT <=", value, "priceDetailText");
            return (Criteria) this;
        }

        public Criteria andPriceDetailTextLike(String value) {
            addCriterion("PRICE_DETAIL_TEXT like", value, "priceDetailText");
            return (Criteria) this;
        }

        public Criteria andPriceDetailTextNotLike(String value) {
            addCriterion("PRICE_DETAIL_TEXT not like", value, "priceDetailText");
            return (Criteria) this;
        }

        public Criteria andPriceDetailTextIn(List<String> values) {
            addCriterion("PRICE_DETAIL_TEXT in", values, "priceDetailText");
            return (Criteria) this;
        }

        public Criteria andPriceDetailTextNotIn(List<String> values) {
            addCriterion("PRICE_DETAIL_TEXT not in", values, "priceDetailText");
            return (Criteria) this;
        }

        public Criteria andPriceDetailTextBetween(String value1, String value2) {
            addCriterion("PRICE_DETAIL_TEXT between", value1, value2, "priceDetailText");
            return (Criteria) this;
        }

        public Criteria andPriceDetailTextNotBetween(String value1, String value2) {
            addCriterion("PRICE_DETAIL_TEXT not between", value1, value2, "priceDetailText");
            return (Criteria) this;
        }

        public Criteria andSmallImageUrlIsNull() {
            addCriterion("SMALL_IMAGE_URL is null");
            return (Criteria) this;
        }

        public Criteria andSmallImageUrlIsNotNull() {
            addCriterion("SMALL_IMAGE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andSmallImageUrlEqualTo(String value) {
            addCriterion("SMALL_IMAGE_URL =", value, "smallImageUrl");
            return (Criteria) this;
        }

        public Criteria andSmallImageUrlNotEqualTo(String value) {
            addCriterion("SMALL_IMAGE_URL <>", value, "smallImageUrl");
            return (Criteria) this;
        }

        public Criteria andSmallImageUrlGreaterThan(String value) {
            addCriterion("SMALL_IMAGE_URL >", value, "smallImageUrl");
            return (Criteria) this;
        }

        public Criteria andSmallImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("SMALL_IMAGE_URL >=", value, "smallImageUrl");
            return (Criteria) this;
        }

        public Criteria andSmallImageUrlLessThan(String value) {
            addCriterion("SMALL_IMAGE_URL <", value, "smallImageUrl");
            return (Criteria) this;
        }

        public Criteria andSmallImageUrlLessThanOrEqualTo(String value) {
            addCriterion("SMALL_IMAGE_URL <=", value, "smallImageUrl");
            return (Criteria) this;
        }

        public Criteria andSmallImageUrlLike(String value) {
            addCriterion("SMALL_IMAGE_URL like", value, "smallImageUrl");
            return (Criteria) this;
        }

        public Criteria andSmallImageUrlNotLike(String value) {
            addCriterion("SMALL_IMAGE_URL not like", value, "smallImageUrl");
            return (Criteria) this;
        }

        public Criteria andSmallImageUrlIn(List<String> values) {
            addCriterion("SMALL_IMAGE_URL in", values, "smallImageUrl");
            return (Criteria) this;
        }

        public Criteria andSmallImageUrlNotIn(List<String> values) {
            addCriterion("SMALL_IMAGE_URL not in", values, "smallImageUrl");
            return (Criteria) this;
        }

        public Criteria andSmallImageUrlBetween(String value1, String value2) {
            addCriterion("SMALL_IMAGE_URL between", value1, value2, "smallImageUrl");
            return (Criteria) this;
        }

        public Criteria andSmallImageUrlNotBetween(String value1, String value2) {
            addCriterion("SMALL_IMAGE_URL not between", value1, value2, "smallImageUrl");
            return (Criteria) this;
        }

        public Criteria andMediumImageUrlIsNull() {
            addCriterion("MEDIUM_IMAGE_URL is null");
            return (Criteria) this;
        }

        public Criteria andMediumImageUrlIsNotNull() {
            addCriterion("MEDIUM_IMAGE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andMediumImageUrlEqualTo(String value) {
            addCriterion("MEDIUM_IMAGE_URL =", value, "mediumImageUrl");
            return (Criteria) this;
        }

        public Criteria andMediumImageUrlNotEqualTo(String value) {
            addCriterion("MEDIUM_IMAGE_URL <>", value, "mediumImageUrl");
            return (Criteria) this;
        }

        public Criteria andMediumImageUrlGreaterThan(String value) {
            addCriterion("MEDIUM_IMAGE_URL >", value, "mediumImageUrl");
            return (Criteria) this;
        }

        public Criteria andMediumImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("MEDIUM_IMAGE_URL >=", value, "mediumImageUrl");
            return (Criteria) this;
        }

        public Criteria andMediumImageUrlLessThan(String value) {
            addCriterion("MEDIUM_IMAGE_URL <", value, "mediumImageUrl");
            return (Criteria) this;
        }

        public Criteria andMediumImageUrlLessThanOrEqualTo(String value) {
            addCriterion("MEDIUM_IMAGE_URL <=", value, "mediumImageUrl");
            return (Criteria) this;
        }

        public Criteria andMediumImageUrlLike(String value) {
            addCriterion("MEDIUM_IMAGE_URL like", value, "mediumImageUrl");
            return (Criteria) this;
        }

        public Criteria andMediumImageUrlNotLike(String value) {
            addCriterion("MEDIUM_IMAGE_URL not like", value, "mediumImageUrl");
            return (Criteria) this;
        }

        public Criteria andMediumImageUrlIn(List<String> values) {
            addCriterion("MEDIUM_IMAGE_URL in", values, "mediumImageUrl");
            return (Criteria) this;
        }

        public Criteria andMediumImageUrlNotIn(List<String> values) {
            addCriterion("MEDIUM_IMAGE_URL not in", values, "mediumImageUrl");
            return (Criteria) this;
        }

        public Criteria andMediumImageUrlBetween(String value1, String value2) {
            addCriterion("MEDIUM_IMAGE_URL between", value1, value2, "mediumImageUrl");
            return (Criteria) this;
        }

        public Criteria andMediumImageUrlNotBetween(String value1, String value2) {
            addCriterion("MEDIUM_IMAGE_URL not between", value1, value2, "mediumImageUrl");
            return (Criteria) this;
        }

        public Criteria andLargeImageUrlIsNull() {
            addCriterion("LARGE_IMAGE_URL is null");
            return (Criteria) this;
        }

        public Criteria andLargeImageUrlIsNotNull() {
            addCriterion("LARGE_IMAGE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andLargeImageUrlEqualTo(String value) {
            addCriterion("LARGE_IMAGE_URL =", value, "largeImageUrl");
            return (Criteria) this;
        }

        public Criteria andLargeImageUrlNotEqualTo(String value) {
            addCriterion("LARGE_IMAGE_URL <>", value, "largeImageUrl");
            return (Criteria) this;
        }

        public Criteria andLargeImageUrlGreaterThan(String value) {
            addCriterion("LARGE_IMAGE_URL >", value, "largeImageUrl");
            return (Criteria) this;
        }

        public Criteria andLargeImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("LARGE_IMAGE_URL >=", value, "largeImageUrl");
            return (Criteria) this;
        }

        public Criteria andLargeImageUrlLessThan(String value) {
            addCriterion("LARGE_IMAGE_URL <", value, "largeImageUrl");
            return (Criteria) this;
        }

        public Criteria andLargeImageUrlLessThanOrEqualTo(String value) {
            addCriterion("LARGE_IMAGE_URL <=", value, "largeImageUrl");
            return (Criteria) this;
        }

        public Criteria andLargeImageUrlLike(String value) {
            addCriterion("LARGE_IMAGE_URL like", value, "largeImageUrl");
            return (Criteria) this;
        }

        public Criteria andLargeImageUrlNotLike(String value) {
            addCriterion("LARGE_IMAGE_URL not like", value, "largeImageUrl");
            return (Criteria) this;
        }

        public Criteria andLargeImageUrlIn(List<String> values) {
            addCriterion("LARGE_IMAGE_URL in", values, "largeImageUrl");
            return (Criteria) this;
        }

        public Criteria andLargeImageUrlNotIn(List<String> values) {
            addCriterion("LARGE_IMAGE_URL not in", values, "largeImageUrl");
            return (Criteria) this;
        }

        public Criteria andLargeImageUrlBetween(String value1, String value2) {
            addCriterion("LARGE_IMAGE_URL between", value1, value2, "largeImageUrl");
            return (Criteria) this;
        }

        public Criteria andLargeImageUrlNotBetween(String value1, String value2) {
            addCriterion("LARGE_IMAGE_URL not between", value1, value2, "largeImageUrl");
            return (Criteria) this;
        }

        public Criteria andDetailImageUrlIsNull() {
            addCriterion("DETAIL_IMAGE_URL is null");
            return (Criteria) this;
        }

        public Criteria andDetailImageUrlIsNotNull() {
            addCriterion("DETAIL_IMAGE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andDetailImageUrlEqualTo(String value) {
            addCriterion("DETAIL_IMAGE_URL =", value, "detailImageUrl");
            return (Criteria) this;
        }

        public Criteria andDetailImageUrlNotEqualTo(String value) {
            addCriterion("DETAIL_IMAGE_URL <>", value, "detailImageUrl");
            return (Criteria) this;
        }

        public Criteria andDetailImageUrlGreaterThan(String value) {
            addCriterion("DETAIL_IMAGE_URL >", value, "detailImageUrl");
            return (Criteria) this;
        }

        public Criteria andDetailImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("DETAIL_IMAGE_URL >=", value, "detailImageUrl");
            return (Criteria) this;
        }

        public Criteria andDetailImageUrlLessThan(String value) {
            addCriterion("DETAIL_IMAGE_URL <", value, "detailImageUrl");
            return (Criteria) this;
        }

        public Criteria andDetailImageUrlLessThanOrEqualTo(String value) {
            addCriterion("DETAIL_IMAGE_URL <=", value, "detailImageUrl");
            return (Criteria) this;
        }

        public Criteria andDetailImageUrlLike(String value) {
            addCriterion("DETAIL_IMAGE_URL like", value, "detailImageUrl");
            return (Criteria) this;
        }

        public Criteria andDetailImageUrlNotLike(String value) {
            addCriterion("DETAIL_IMAGE_URL not like", value, "detailImageUrl");
            return (Criteria) this;
        }

        public Criteria andDetailImageUrlIn(List<String> values) {
            addCriterion("DETAIL_IMAGE_URL in", values, "detailImageUrl");
            return (Criteria) this;
        }

        public Criteria andDetailImageUrlNotIn(List<String> values) {
            addCriterion("DETAIL_IMAGE_URL not in", values, "detailImageUrl");
            return (Criteria) this;
        }

        public Criteria andDetailImageUrlBetween(String value1, String value2) {
            addCriterion("DETAIL_IMAGE_URL between", value1, value2, "detailImageUrl");
            return (Criteria) this;
        }

        public Criteria andDetailImageUrlNotBetween(String value1, String value2) {
            addCriterion("DETAIL_IMAGE_URL not between", value1, value2, "detailImageUrl");
            return (Criteria) this;
        }

        public Criteria andOriginalImageUrlIsNull() {
            addCriterion("ORIGINAL_IMAGE_URL is null");
            return (Criteria) this;
        }

        public Criteria andOriginalImageUrlIsNotNull() {
            addCriterion("ORIGINAL_IMAGE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalImageUrlEqualTo(String value) {
            addCriterion("ORIGINAL_IMAGE_URL =", value, "originalImageUrl");
            return (Criteria) this;
        }

        public Criteria andOriginalImageUrlNotEqualTo(String value) {
            addCriterion("ORIGINAL_IMAGE_URL <>", value, "originalImageUrl");
            return (Criteria) this;
        }

        public Criteria andOriginalImageUrlGreaterThan(String value) {
            addCriterion("ORIGINAL_IMAGE_URL >", value, "originalImageUrl");
            return (Criteria) this;
        }

        public Criteria andOriginalImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("ORIGINAL_IMAGE_URL >=", value, "originalImageUrl");
            return (Criteria) this;
        }

        public Criteria andOriginalImageUrlLessThan(String value) {
            addCriterion("ORIGINAL_IMAGE_URL <", value, "originalImageUrl");
            return (Criteria) this;
        }

        public Criteria andOriginalImageUrlLessThanOrEqualTo(String value) {
            addCriterion("ORIGINAL_IMAGE_URL <=", value, "originalImageUrl");
            return (Criteria) this;
        }

        public Criteria andOriginalImageUrlLike(String value) {
            addCriterion("ORIGINAL_IMAGE_URL like", value, "originalImageUrl");
            return (Criteria) this;
        }

        public Criteria andOriginalImageUrlNotLike(String value) {
            addCriterion("ORIGINAL_IMAGE_URL not like", value, "originalImageUrl");
            return (Criteria) this;
        }

        public Criteria andOriginalImageUrlIn(List<String> values) {
            addCriterion("ORIGINAL_IMAGE_URL in", values, "originalImageUrl");
            return (Criteria) this;
        }

        public Criteria andOriginalImageUrlNotIn(List<String> values) {
            addCriterion("ORIGINAL_IMAGE_URL not in", values, "originalImageUrl");
            return (Criteria) this;
        }

        public Criteria andOriginalImageUrlBetween(String value1, String value2) {
            addCriterion("ORIGINAL_IMAGE_URL between", value1, value2, "originalImageUrl");
            return (Criteria) this;
        }

        public Criteria andOriginalImageUrlNotBetween(String value1, String value2) {
            addCriterion("ORIGINAL_IMAGE_URL not between", value1, value2, "originalImageUrl");
            return (Criteria) this;
        }

        public Criteria andDetailScreenIsNull() {
            addCriterion("DETAIL_SCREEN is null");
            return (Criteria) this;
        }

        public Criteria andDetailScreenIsNotNull() {
            addCriterion("DETAIL_SCREEN is not null");
            return (Criteria) this;
        }

        public Criteria andDetailScreenEqualTo(String value) {
            addCriterion("DETAIL_SCREEN =", value, "detailScreen");
            return (Criteria) this;
        }

        public Criteria andDetailScreenNotEqualTo(String value) {
            addCriterion("DETAIL_SCREEN <>", value, "detailScreen");
            return (Criteria) this;
        }

        public Criteria andDetailScreenGreaterThan(String value) {
            addCriterion("DETAIL_SCREEN >", value, "detailScreen");
            return (Criteria) this;
        }

        public Criteria andDetailScreenGreaterThanOrEqualTo(String value) {
            addCriterion("DETAIL_SCREEN >=", value, "detailScreen");
            return (Criteria) this;
        }

        public Criteria andDetailScreenLessThan(String value) {
            addCriterion("DETAIL_SCREEN <", value, "detailScreen");
            return (Criteria) this;
        }

        public Criteria andDetailScreenLessThanOrEqualTo(String value) {
            addCriterion("DETAIL_SCREEN <=", value, "detailScreen");
            return (Criteria) this;
        }

        public Criteria andDetailScreenLike(String value) {
            addCriterion("DETAIL_SCREEN like", value, "detailScreen");
            return (Criteria) this;
        }

        public Criteria andDetailScreenNotLike(String value) {
            addCriterion("DETAIL_SCREEN not like", value, "detailScreen");
            return (Criteria) this;
        }

        public Criteria andDetailScreenIn(List<String> values) {
            addCriterion("DETAIL_SCREEN in", values, "detailScreen");
            return (Criteria) this;
        }

        public Criteria andDetailScreenNotIn(List<String> values) {
            addCriterion("DETAIL_SCREEN not in", values, "detailScreen");
            return (Criteria) this;
        }

        public Criteria andDetailScreenBetween(String value1, String value2) {
            addCriterion("DETAIL_SCREEN between", value1, value2, "detailScreen");
            return (Criteria) this;
        }

        public Criteria andDetailScreenNotBetween(String value1, String value2) {
            addCriterion("DETAIL_SCREEN not between", value1, value2, "detailScreen");
            return (Criteria) this;
        }

        public Criteria andInventoryMessageIsNull() {
            addCriterion("INVENTORY_MESSAGE is null");
            return (Criteria) this;
        }

        public Criteria andInventoryMessageIsNotNull() {
            addCriterion("INVENTORY_MESSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryMessageEqualTo(String value) {
            addCriterion("INVENTORY_MESSAGE =", value, "inventoryMessage");
            return (Criteria) this;
        }

        public Criteria andInventoryMessageNotEqualTo(String value) {
            addCriterion("INVENTORY_MESSAGE <>", value, "inventoryMessage");
            return (Criteria) this;
        }

        public Criteria andInventoryMessageGreaterThan(String value) {
            addCriterion("INVENTORY_MESSAGE >", value, "inventoryMessage");
            return (Criteria) this;
        }

        public Criteria andInventoryMessageGreaterThanOrEqualTo(String value) {
            addCriterion("INVENTORY_MESSAGE >=", value, "inventoryMessage");
            return (Criteria) this;
        }

        public Criteria andInventoryMessageLessThan(String value) {
            addCriterion("INVENTORY_MESSAGE <", value, "inventoryMessage");
            return (Criteria) this;
        }

        public Criteria andInventoryMessageLessThanOrEqualTo(String value) {
            addCriterion("INVENTORY_MESSAGE <=", value, "inventoryMessage");
            return (Criteria) this;
        }

        public Criteria andInventoryMessageLike(String value) {
            addCriterion("INVENTORY_MESSAGE like", value, "inventoryMessage");
            return (Criteria) this;
        }

        public Criteria andInventoryMessageNotLike(String value) {
            addCriterion("INVENTORY_MESSAGE not like", value, "inventoryMessage");
            return (Criteria) this;
        }

        public Criteria andInventoryMessageIn(List<String> values) {
            addCriterion("INVENTORY_MESSAGE in", values, "inventoryMessage");
            return (Criteria) this;
        }

        public Criteria andInventoryMessageNotIn(List<String> values) {
            addCriterion("INVENTORY_MESSAGE not in", values, "inventoryMessage");
            return (Criteria) this;
        }

        public Criteria andInventoryMessageBetween(String value1, String value2) {
            addCriterion("INVENTORY_MESSAGE between", value1, value2, "inventoryMessage");
            return (Criteria) this;
        }

        public Criteria andInventoryMessageNotBetween(String value1, String value2) {
            addCriterion("INVENTORY_MESSAGE not between", value1, value2, "inventoryMessage");
            return (Criteria) this;
        }

        public Criteria andInventoryItemTypeIdIsNull() {
            addCriterion("INVENTORY_ITEM_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andInventoryItemTypeIdIsNotNull() {
            addCriterion("INVENTORY_ITEM_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryItemTypeIdEqualTo(String value) {
            addCriterion("INVENTORY_ITEM_TYPE_ID =", value, "inventoryItemTypeId");
            return (Criteria) this;
        }

        public Criteria andInventoryItemTypeIdNotEqualTo(String value) {
            addCriterion("INVENTORY_ITEM_TYPE_ID <>", value, "inventoryItemTypeId");
            return (Criteria) this;
        }

        public Criteria andInventoryItemTypeIdGreaterThan(String value) {
            addCriterion("INVENTORY_ITEM_TYPE_ID >", value, "inventoryItemTypeId");
            return (Criteria) this;
        }

        public Criteria andInventoryItemTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("INVENTORY_ITEM_TYPE_ID >=", value, "inventoryItemTypeId");
            return (Criteria) this;
        }

        public Criteria andInventoryItemTypeIdLessThan(String value) {
            addCriterion("INVENTORY_ITEM_TYPE_ID <", value, "inventoryItemTypeId");
            return (Criteria) this;
        }

        public Criteria andInventoryItemTypeIdLessThanOrEqualTo(String value) {
            addCriterion("INVENTORY_ITEM_TYPE_ID <=", value, "inventoryItemTypeId");
            return (Criteria) this;
        }

        public Criteria andInventoryItemTypeIdLike(String value) {
            addCriterion("INVENTORY_ITEM_TYPE_ID like", value, "inventoryItemTypeId");
            return (Criteria) this;
        }

        public Criteria andInventoryItemTypeIdNotLike(String value) {
            addCriterion("INVENTORY_ITEM_TYPE_ID not like", value, "inventoryItemTypeId");
            return (Criteria) this;
        }

        public Criteria andInventoryItemTypeIdIn(List<String> values) {
            addCriterion("INVENTORY_ITEM_TYPE_ID in", values, "inventoryItemTypeId");
            return (Criteria) this;
        }

        public Criteria andInventoryItemTypeIdNotIn(List<String> values) {
            addCriterion("INVENTORY_ITEM_TYPE_ID not in", values, "inventoryItemTypeId");
            return (Criteria) this;
        }

        public Criteria andInventoryItemTypeIdBetween(String value1, String value2) {
            addCriterion("INVENTORY_ITEM_TYPE_ID between", value1, value2, "inventoryItemTypeId");
            return (Criteria) this;
        }

        public Criteria andInventoryItemTypeIdNotBetween(String value1, String value2) {
            addCriterion("INVENTORY_ITEM_TYPE_ID not between", value1, value2, "inventoryItemTypeId");
            return (Criteria) this;
        }

        public Criteria andRequireInventoryIsNull() {
            addCriterion("REQUIRE_INVENTORY is null");
            return (Criteria) this;
        }

        public Criteria andRequireInventoryIsNotNull() {
            addCriterion("REQUIRE_INVENTORY is not null");
            return (Criteria) this;
        }

        public Criteria andRequireInventoryEqualTo(String value) {
            addCriterion("REQUIRE_INVENTORY =", value, "requireInventory");
            return (Criteria) this;
        }

        public Criteria andRequireInventoryNotEqualTo(String value) {
            addCriterion("REQUIRE_INVENTORY <>", value, "requireInventory");
            return (Criteria) this;
        }

        public Criteria andRequireInventoryGreaterThan(String value) {
            addCriterion("REQUIRE_INVENTORY >", value, "requireInventory");
            return (Criteria) this;
        }

        public Criteria andRequireInventoryGreaterThanOrEqualTo(String value) {
            addCriterion("REQUIRE_INVENTORY >=", value, "requireInventory");
            return (Criteria) this;
        }

        public Criteria andRequireInventoryLessThan(String value) {
            addCriterion("REQUIRE_INVENTORY <", value, "requireInventory");
            return (Criteria) this;
        }

        public Criteria andRequireInventoryLessThanOrEqualTo(String value) {
            addCriterion("REQUIRE_INVENTORY <=", value, "requireInventory");
            return (Criteria) this;
        }

        public Criteria andRequireInventoryLike(String value) {
            addCriterion("REQUIRE_INVENTORY like", value, "requireInventory");
            return (Criteria) this;
        }

        public Criteria andRequireInventoryNotLike(String value) {
            addCriterion("REQUIRE_INVENTORY not like", value, "requireInventory");
            return (Criteria) this;
        }

        public Criteria andRequireInventoryIn(List<String> values) {
            addCriterion("REQUIRE_INVENTORY in", values, "requireInventory");
            return (Criteria) this;
        }

        public Criteria andRequireInventoryNotIn(List<String> values) {
            addCriterion("REQUIRE_INVENTORY not in", values, "requireInventory");
            return (Criteria) this;
        }

        public Criteria andRequireInventoryBetween(String value1, String value2) {
            addCriterion("REQUIRE_INVENTORY between", value1, value2, "requireInventory");
            return (Criteria) this;
        }

        public Criteria andRequireInventoryNotBetween(String value1, String value2) {
            addCriterion("REQUIRE_INVENTORY not between", value1, value2, "requireInventory");
            return (Criteria) this;
        }

        public Criteria andQuantityUomIdIsNull() {
            addCriterion("QUANTITY_UOM_ID is null");
            return (Criteria) this;
        }

        public Criteria andQuantityUomIdIsNotNull() {
            addCriterion("QUANTITY_UOM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityUomIdEqualTo(String value) {
            addCriterion("QUANTITY_UOM_ID =", value, "quantityUomId");
            return (Criteria) this;
        }

        public Criteria andQuantityUomIdNotEqualTo(String value) {
            addCriterion("QUANTITY_UOM_ID <>", value, "quantityUomId");
            return (Criteria) this;
        }

        public Criteria andQuantityUomIdGreaterThan(String value) {
            addCriterion("QUANTITY_UOM_ID >", value, "quantityUomId");
            return (Criteria) this;
        }

        public Criteria andQuantityUomIdGreaterThanOrEqualTo(String value) {
            addCriterion("QUANTITY_UOM_ID >=", value, "quantityUomId");
            return (Criteria) this;
        }

        public Criteria andQuantityUomIdLessThan(String value) {
            addCriterion("QUANTITY_UOM_ID <", value, "quantityUomId");
            return (Criteria) this;
        }

        public Criteria andQuantityUomIdLessThanOrEqualTo(String value) {
            addCriterion("QUANTITY_UOM_ID <=", value, "quantityUomId");
            return (Criteria) this;
        }

        public Criteria andQuantityUomIdLike(String value) {
            addCriterion("QUANTITY_UOM_ID like", value, "quantityUomId");
            return (Criteria) this;
        }

        public Criteria andQuantityUomIdNotLike(String value) {
            addCriterion("QUANTITY_UOM_ID not like", value, "quantityUomId");
            return (Criteria) this;
        }

        public Criteria andQuantityUomIdIn(List<String> values) {
            addCriterion("QUANTITY_UOM_ID in", values, "quantityUomId");
            return (Criteria) this;
        }

        public Criteria andQuantityUomIdNotIn(List<String> values) {
            addCriterion("QUANTITY_UOM_ID not in", values, "quantityUomId");
            return (Criteria) this;
        }

        public Criteria andQuantityUomIdBetween(String value1, String value2) {
            addCriterion("QUANTITY_UOM_ID between", value1, value2, "quantityUomId");
            return (Criteria) this;
        }

        public Criteria andQuantityUomIdNotBetween(String value1, String value2) {
            addCriterion("QUANTITY_UOM_ID not between", value1, value2, "quantityUomId");
            return (Criteria) this;
        }

        public Criteria andQuantityIncludedIsNull() {
            addCriterion("QUANTITY_INCLUDED is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIncludedIsNotNull() {
            addCriterion("QUANTITY_INCLUDED is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityIncludedEqualTo(BigDecimal value) {
            addCriterion("QUANTITY_INCLUDED =", value, "quantityIncluded");
            return (Criteria) this;
        }

        public Criteria andQuantityIncludedNotEqualTo(BigDecimal value) {
            addCriterion("QUANTITY_INCLUDED <>", value, "quantityIncluded");
            return (Criteria) this;
        }

        public Criteria andQuantityIncludedGreaterThan(BigDecimal value) {
            addCriterion("QUANTITY_INCLUDED >", value, "quantityIncluded");
            return (Criteria) this;
        }

        public Criteria andQuantityIncludedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QUANTITY_INCLUDED >=", value, "quantityIncluded");
            return (Criteria) this;
        }

        public Criteria andQuantityIncludedLessThan(BigDecimal value) {
            addCriterion("QUANTITY_INCLUDED <", value, "quantityIncluded");
            return (Criteria) this;
        }

        public Criteria andQuantityIncludedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QUANTITY_INCLUDED <=", value, "quantityIncluded");
            return (Criteria) this;
        }

        public Criteria andQuantityIncludedIn(List<BigDecimal> values) {
            addCriterion("QUANTITY_INCLUDED in", values, "quantityIncluded");
            return (Criteria) this;
        }

        public Criteria andQuantityIncludedNotIn(List<BigDecimal> values) {
            addCriterion("QUANTITY_INCLUDED not in", values, "quantityIncluded");
            return (Criteria) this;
        }

        public Criteria andQuantityIncludedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QUANTITY_INCLUDED between", value1, value2, "quantityIncluded");
            return (Criteria) this;
        }

        public Criteria andQuantityIncludedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QUANTITY_INCLUDED not between", value1, value2, "quantityIncluded");
            return (Criteria) this;
        }

        public Criteria andPiecesIncludedIsNull() {
            addCriterion("PIECES_INCLUDED is null");
            return (Criteria) this;
        }

        public Criteria andPiecesIncludedIsNotNull() {
            addCriterion("PIECES_INCLUDED is not null");
            return (Criteria) this;
        }

        public Criteria andPiecesIncludedEqualTo(BigDecimal value) {
            addCriterion("PIECES_INCLUDED =", value, "piecesIncluded");
            return (Criteria) this;
        }

        public Criteria andPiecesIncludedNotEqualTo(BigDecimal value) {
            addCriterion("PIECES_INCLUDED <>", value, "piecesIncluded");
            return (Criteria) this;
        }

        public Criteria andPiecesIncludedGreaterThan(BigDecimal value) {
            addCriterion("PIECES_INCLUDED >", value, "piecesIncluded");
            return (Criteria) this;
        }

        public Criteria andPiecesIncludedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PIECES_INCLUDED >=", value, "piecesIncluded");
            return (Criteria) this;
        }

        public Criteria andPiecesIncludedLessThan(BigDecimal value) {
            addCriterion("PIECES_INCLUDED <", value, "piecesIncluded");
            return (Criteria) this;
        }

        public Criteria andPiecesIncludedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PIECES_INCLUDED <=", value, "piecesIncluded");
            return (Criteria) this;
        }

        public Criteria andPiecesIncludedIn(List<BigDecimal> values) {
            addCriterion("PIECES_INCLUDED in", values, "piecesIncluded");
            return (Criteria) this;
        }

        public Criteria andPiecesIncludedNotIn(List<BigDecimal> values) {
            addCriterion("PIECES_INCLUDED not in", values, "piecesIncluded");
            return (Criteria) this;
        }

        public Criteria andPiecesIncludedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PIECES_INCLUDED between", value1, value2, "piecesIncluded");
            return (Criteria) this;
        }

        public Criteria andPiecesIncludedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PIECES_INCLUDED not between", value1, value2, "piecesIncluded");
            return (Criteria) this;
        }

        public Criteria andRequireAmountIsNull() {
            addCriterion("REQUIRE_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andRequireAmountIsNotNull() {
            addCriterion("REQUIRE_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andRequireAmountEqualTo(String value) {
            addCriterion("REQUIRE_AMOUNT =", value, "requireAmount");
            return (Criteria) this;
        }

        public Criteria andRequireAmountNotEqualTo(String value) {
            addCriterion("REQUIRE_AMOUNT <>", value, "requireAmount");
            return (Criteria) this;
        }

        public Criteria andRequireAmountGreaterThan(String value) {
            addCriterion("REQUIRE_AMOUNT >", value, "requireAmount");
            return (Criteria) this;
        }

        public Criteria andRequireAmountGreaterThanOrEqualTo(String value) {
            addCriterion("REQUIRE_AMOUNT >=", value, "requireAmount");
            return (Criteria) this;
        }

        public Criteria andRequireAmountLessThan(String value) {
            addCriterion("REQUIRE_AMOUNT <", value, "requireAmount");
            return (Criteria) this;
        }

        public Criteria andRequireAmountLessThanOrEqualTo(String value) {
            addCriterion("REQUIRE_AMOUNT <=", value, "requireAmount");
            return (Criteria) this;
        }

        public Criteria andRequireAmountLike(String value) {
            addCriterion("REQUIRE_AMOUNT like", value, "requireAmount");
            return (Criteria) this;
        }

        public Criteria andRequireAmountNotLike(String value) {
            addCriterion("REQUIRE_AMOUNT not like", value, "requireAmount");
            return (Criteria) this;
        }

        public Criteria andRequireAmountIn(List<String> values) {
            addCriterion("REQUIRE_AMOUNT in", values, "requireAmount");
            return (Criteria) this;
        }

        public Criteria andRequireAmountNotIn(List<String> values) {
            addCriterion("REQUIRE_AMOUNT not in", values, "requireAmount");
            return (Criteria) this;
        }

        public Criteria andRequireAmountBetween(String value1, String value2) {
            addCriterion("REQUIRE_AMOUNT between", value1, value2, "requireAmount");
            return (Criteria) this;
        }

        public Criteria andRequireAmountNotBetween(String value1, String value2) {
            addCriterion("REQUIRE_AMOUNT not between", value1, value2, "requireAmount");
            return (Criteria) this;
        }

        public Criteria andFixedAmountIsNull() {
            addCriterion("FIXED_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andFixedAmountIsNotNull() {
            addCriterion("FIXED_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andFixedAmountEqualTo(BigDecimal value) {
            addCriterion("FIXED_AMOUNT =", value, "fixedAmount");
            return (Criteria) this;
        }

        public Criteria andFixedAmountNotEqualTo(BigDecimal value) {
            addCriterion("FIXED_AMOUNT <>", value, "fixedAmount");
            return (Criteria) this;
        }

        public Criteria andFixedAmountGreaterThan(BigDecimal value) {
            addCriterion("FIXED_AMOUNT >", value, "fixedAmount");
            return (Criteria) this;
        }

        public Criteria andFixedAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FIXED_AMOUNT >=", value, "fixedAmount");
            return (Criteria) this;
        }

        public Criteria andFixedAmountLessThan(BigDecimal value) {
            addCriterion("FIXED_AMOUNT <", value, "fixedAmount");
            return (Criteria) this;
        }

        public Criteria andFixedAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FIXED_AMOUNT <=", value, "fixedAmount");
            return (Criteria) this;
        }

        public Criteria andFixedAmountIn(List<BigDecimal> values) {
            addCriterion("FIXED_AMOUNT in", values, "fixedAmount");
            return (Criteria) this;
        }

        public Criteria andFixedAmountNotIn(List<BigDecimal> values) {
            addCriterion("FIXED_AMOUNT not in", values, "fixedAmount");
            return (Criteria) this;
        }

        public Criteria andFixedAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FIXED_AMOUNT between", value1, value2, "fixedAmount");
            return (Criteria) this;
        }

        public Criteria andFixedAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FIXED_AMOUNT not between", value1, value2, "fixedAmount");
            return (Criteria) this;
        }

        public Criteria andAmountUomTypeIdIsNull() {
            addCriterion("AMOUNT_UOM_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andAmountUomTypeIdIsNotNull() {
            addCriterion("AMOUNT_UOM_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAmountUomTypeIdEqualTo(String value) {
            addCriterion("AMOUNT_UOM_TYPE_ID =", value, "amountUomTypeId");
            return (Criteria) this;
        }

        public Criteria andAmountUomTypeIdNotEqualTo(String value) {
            addCriterion("AMOUNT_UOM_TYPE_ID <>", value, "amountUomTypeId");
            return (Criteria) this;
        }

        public Criteria andAmountUomTypeIdGreaterThan(String value) {
            addCriterion("AMOUNT_UOM_TYPE_ID >", value, "amountUomTypeId");
            return (Criteria) this;
        }

        public Criteria andAmountUomTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("AMOUNT_UOM_TYPE_ID >=", value, "amountUomTypeId");
            return (Criteria) this;
        }

        public Criteria andAmountUomTypeIdLessThan(String value) {
            addCriterion("AMOUNT_UOM_TYPE_ID <", value, "amountUomTypeId");
            return (Criteria) this;
        }

        public Criteria andAmountUomTypeIdLessThanOrEqualTo(String value) {
            addCriterion("AMOUNT_UOM_TYPE_ID <=", value, "amountUomTypeId");
            return (Criteria) this;
        }

        public Criteria andAmountUomTypeIdLike(String value) {
            addCriterion("AMOUNT_UOM_TYPE_ID like", value, "amountUomTypeId");
            return (Criteria) this;
        }

        public Criteria andAmountUomTypeIdNotLike(String value) {
            addCriterion("AMOUNT_UOM_TYPE_ID not like", value, "amountUomTypeId");
            return (Criteria) this;
        }

        public Criteria andAmountUomTypeIdIn(List<String> values) {
            addCriterion("AMOUNT_UOM_TYPE_ID in", values, "amountUomTypeId");
            return (Criteria) this;
        }

        public Criteria andAmountUomTypeIdNotIn(List<String> values) {
            addCriterion("AMOUNT_UOM_TYPE_ID not in", values, "amountUomTypeId");
            return (Criteria) this;
        }

        public Criteria andAmountUomTypeIdBetween(String value1, String value2) {
            addCriterion("AMOUNT_UOM_TYPE_ID between", value1, value2, "amountUomTypeId");
            return (Criteria) this;
        }

        public Criteria andAmountUomTypeIdNotBetween(String value1, String value2) {
            addCriterion("AMOUNT_UOM_TYPE_ID not between", value1, value2, "amountUomTypeId");
            return (Criteria) this;
        }

        public Criteria andWeightUomIdIsNull() {
            addCriterion("WEIGHT_UOM_ID is null");
            return (Criteria) this;
        }

        public Criteria andWeightUomIdIsNotNull() {
            addCriterion("WEIGHT_UOM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWeightUomIdEqualTo(String value) {
            addCriterion("WEIGHT_UOM_ID =", value, "weightUomId");
            return (Criteria) this;
        }

        public Criteria andWeightUomIdNotEqualTo(String value) {
            addCriterion("WEIGHT_UOM_ID <>", value, "weightUomId");
            return (Criteria) this;
        }

        public Criteria andWeightUomIdGreaterThan(String value) {
            addCriterion("WEIGHT_UOM_ID >", value, "weightUomId");
            return (Criteria) this;
        }

        public Criteria andWeightUomIdGreaterThanOrEqualTo(String value) {
            addCriterion("WEIGHT_UOM_ID >=", value, "weightUomId");
            return (Criteria) this;
        }

        public Criteria andWeightUomIdLessThan(String value) {
            addCriterion("WEIGHT_UOM_ID <", value, "weightUomId");
            return (Criteria) this;
        }

        public Criteria andWeightUomIdLessThanOrEqualTo(String value) {
            addCriterion("WEIGHT_UOM_ID <=", value, "weightUomId");
            return (Criteria) this;
        }

        public Criteria andWeightUomIdLike(String value) {
            addCriterion("WEIGHT_UOM_ID like", value, "weightUomId");
            return (Criteria) this;
        }

        public Criteria andWeightUomIdNotLike(String value) {
            addCriterion("WEIGHT_UOM_ID not like", value, "weightUomId");
            return (Criteria) this;
        }

        public Criteria andWeightUomIdIn(List<String> values) {
            addCriterion("WEIGHT_UOM_ID in", values, "weightUomId");
            return (Criteria) this;
        }

        public Criteria andWeightUomIdNotIn(List<String> values) {
            addCriterion("WEIGHT_UOM_ID not in", values, "weightUomId");
            return (Criteria) this;
        }

        public Criteria andWeightUomIdBetween(String value1, String value2) {
            addCriterion("WEIGHT_UOM_ID between", value1, value2, "weightUomId");
            return (Criteria) this;
        }

        public Criteria andWeightUomIdNotBetween(String value1, String value2) {
            addCriterion("WEIGHT_UOM_ID not between", value1, value2, "weightUomId");
            return (Criteria) this;
        }

        public Criteria andShippingWeightIsNull() {
            addCriterion("SHIPPING_WEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andShippingWeightIsNotNull() {
            addCriterion("SHIPPING_WEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andShippingWeightEqualTo(BigDecimal value) {
            addCriterion("SHIPPING_WEIGHT =", value, "shippingWeight");
            return (Criteria) this;
        }

        public Criteria andShippingWeightNotEqualTo(BigDecimal value) {
            addCriterion("SHIPPING_WEIGHT <>", value, "shippingWeight");
            return (Criteria) this;
        }

        public Criteria andShippingWeightGreaterThan(BigDecimal value) {
            addCriterion("SHIPPING_WEIGHT >", value, "shippingWeight");
            return (Criteria) this;
        }

        public Criteria andShippingWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SHIPPING_WEIGHT >=", value, "shippingWeight");
            return (Criteria) this;
        }

        public Criteria andShippingWeightLessThan(BigDecimal value) {
            addCriterion("SHIPPING_WEIGHT <", value, "shippingWeight");
            return (Criteria) this;
        }

        public Criteria andShippingWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SHIPPING_WEIGHT <=", value, "shippingWeight");
            return (Criteria) this;
        }

        public Criteria andShippingWeightIn(List<BigDecimal> values) {
            addCriterion("SHIPPING_WEIGHT in", values, "shippingWeight");
            return (Criteria) this;
        }

        public Criteria andShippingWeightNotIn(List<BigDecimal> values) {
            addCriterion("SHIPPING_WEIGHT not in", values, "shippingWeight");
            return (Criteria) this;
        }

        public Criteria andShippingWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHIPPING_WEIGHT between", value1, value2, "shippingWeight");
            return (Criteria) this;
        }

        public Criteria andShippingWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHIPPING_WEIGHT not between", value1, value2, "shippingWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightIsNull() {
            addCriterion("PRODUCT_WEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andProductWeightIsNotNull() {
            addCriterion("PRODUCT_WEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andProductWeightEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_WEIGHT =", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightNotEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_WEIGHT <>", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightGreaterThan(BigDecimal value) {
            addCriterion("PRODUCT_WEIGHT >", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_WEIGHT >=", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightLessThan(BigDecimal value) {
            addCriterion("PRODUCT_WEIGHT <", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_WEIGHT <=", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightIn(List<BigDecimal> values) {
            addCriterion("PRODUCT_WEIGHT in", values, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightNotIn(List<BigDecimal> values) {
            addCriterion("PRODUCT_WEIGHT not in", values, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_WEIGHT between", value1, value2, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_WEIGHT not between", value1, value2, "productWeight");
            return (Criteria) this;
        }

        public Criteria andHeightUomIdIsNull() {
            addCriterion("HEIGHT_UOM_ID is null");
            return (Criteria) this;
        }

        public Criteria andHeightUomIdIsNotNull() {
            addCriterion("HEIGHT_UOM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andHeightUomIdEqualTo(String value) {
            addCriterion("HEIGHT_UOM_ID =", value, "heightUomId");
            return (Criteria) this;
        }

        public Criteria andHeightUomIdNotEqualTo(String value) {
            addCriterion("HEIGHT_UOM_ID <>", value, "heightUomId");
            return (Criteria) this;
        }

        public Criteria andHeightUomIdGreaterThan(String value) {
            addCriterion("HEIGHT_UOM_ID >", value, "heightUomId");
            return (Criteria) this;
        }

        public Criteria andHeightUomIdGreaterThanOrEqualTo(String value) {
            addCriterion("HEIGHT_UOM_ID >=", value, "heightUomId");
            return (Criteria) this;
        }

        public Criteria andHeightUomIdLessThan(String value) {
            addCriterion("HEIGHT_UOM_ID <", value, "heightUomId");
            return (Criteria) this;
        }

        public Criteria andHeightUomIdLessThanOrEqualTo(String value) {
            addCriterion("HEIGHT_UOM_ID <=", value, "heightUomId");
            return (Criteria) this;
        }

        public Criteria andHeightUomIdLike(String value) {
            addCriterion("HEIGHT_UOM_ID like", value, "heightUomId");
            return (Criteria) this;
        }

        public Criteria andHeightUomIdNotLike(String value) {
            addCriterion("HEIGHT_UOM_ID not like", value, "heightUomId");
            return (Criteria) this;
        }

        public Criteria andHeightUomIdIn(List<String> values) {
            addCriterion("HEIGHT_UOM_ID in", values, "heightUomId");
            return (Criteria) this;
        }

        public Criteria andHeightUomIdNotIn(List<String> values) {
            addCriterion("HEIGHT_UOM_ID not in", values, "heightUomId");
            return (Criteria) this;
        }

        public Criteria andHeightUomIdBetween(String value1, String value2) {
            addCriterion("HEIGHT_UOM_ID between", value1, value2, "heightUomId");
            return (Criteria) this;
        }

        public Criteria andHeightUomIdNotBetween(String value1, String value2) {
            addCriterion("HEIGHT_UOM_ID not between", value1, value2, "heightUomId");
            return (Criteria) this;
        }

        public Criteria andProductHeightIsNull() {
            addCriterion("PRODUCT_HEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andProductHeightIsNotNull() {
            addCriterion("PRODUCT_HEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andProductHeightEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_HEIGHT =", value, "productHeight");
            return (Criteria) this;
        }

        public Criteria andProductHeightNotEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_HEIGHT <>", value, "productHeight");
            return (Criteria) this;
        }

        public Criteria andProductHeightGreaterThan(BigDecimal value) {
            addCriterion("PRODUCT_HEIGHT >", value, "productHeight");
            return (Criteria) this;
        }

        public Criteria andProductHeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_HEIGHT >=", value, "productHeight");
            return (Criteria) this;
        }

        public Criteria andProductHeightLessThan(BigDecimal value) {
            addCriterion("PRODUCT_HEIGHT <", value, "productHeight");
            return (Criteria) this;
        }

        public Criteria andProductHeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_HEIGHT <=", value, "productHeight");
            return (Criteria) this;
        }

        public Criteria andProductHeightIn(List<BigDecimal> values) {
            addCriterion("PRODUCT_HEIGHT in", values, "productHeight");
            return (Criteria) this;
        }

        public Criteria andProductHeightNotIn(List<BigDecimal> values) {
            addCriterion("PRODUCT_HEIGHT not in", values, "productHeight");
            return (Criteria) this;
        }

        public Criteria andProductHeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_HEIGHT between", value1, value2, "productHeight");
            return (Criteria) this;
        }

        public Criteria andProductHeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_HEIGHT not between", value1, value2, "productHeight");
            return (Criteria) this;
        }

        public Criteria andShippingHeightIsNull() {
            addCriterion("SHIPPING_HEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andShippingHeightIsNotNull() {
            addCriterion("SHIPPING_HEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andShippingHeightEqualTo(BigDecimal value) {
            addCriterion("SHIPPING_HEIGHT =", value, "shippingHeight");
            return (Criteria) this;
        }

        public Criteria andShippingHeightNotEqualTo(BigDecimal value) {
            addCriterion("SHIPPING_HEIGHT <>", value, "shippingHeight");
            return (Criteria) this;
        }

        public Criteria andShippingHeightGreaterThan(BigDecimal value) {
            addCriterion("SHIPPING_HEIGHT >", value, "shippingHeight");
            return (Criteria) this;
        }

        public Criteria andShippingHeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SHIPPING_HEIGHT >=", value, "shippingHeight");
            return (Criteria) this;
        }

        public Criteria andShippingHeightLessThan(BigDecimal value) {
            addCriterion("SHIPPING_HEIGHT <", value, "shippingHeight");
            return (Criteria) this;
        }

        public Criteria andShippingHeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SHIPPING_HEIGHT <=", value, "shippingHeight");
            return (Criteria) this;
        }

        public Criteria andShippingHeightIn(List<BigDecimal> values) {
            addCriterion("SHIPPING_HEIGHT in", values, "shippingHeight");
            return (Criteria) this;
        }

        public Criteria andShippingHeightNotIn(List<BigDecimal> values) {
            addCriterion("SHIPPING_HEIGHT not in", values, "shippingHeight");
            return (Criteria) this;
        }

        public Criteria andShippingHeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHIPPING_HEIGHT between", value1, value2, "shippingHeight");
            return (Criteria) this;
        }

        public Criteria andShippingHeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHIPPING_HEIGHT not between", value1, value2, "shippingHeight");
            return (Criteria) this;
        }

        public Criteria andWidthUomIdIsNull() {
            addCriterion("WIDTH_UOM_ID is null");
            return (Criteria) this;
        }

        public Criteria andWidthUomIdIsNotNull() {
            addCriterion("WIDTH_UOM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWidthUomIdEqualTo(String value) {
            addCriterion("WIDTH_UOM_ID =", value, "widthUomId");
            return (Criteria) this;
        }

        public Criteria andWidthUomIdNotEqualTo(String value) {
            addCriterion("WIDTH_UOM_ID <>", value, "widthUomId");
            return (Criteria) this;
        }

        public Criteria andWidthUomIdGreaterThan(String value) {
            addCriterion("WIDTH_UOM_ID >", value, "widthUomId");
            return (Criteria) this;
        }

        public Criteria andWidthUomIdGreaterThanOrEqualTo(String value) {
            addCriterion("WIDTH_UOM_ID >=", value, "widthUomId");
            return (Criteria) this;
        }

        public Criteria andWidthUomIdLessThan(String value) {
            addCriterion("WIDTH_UOM_ID <", value, "widthUomId");
            return (Criteria) this;
        }

        public Criteria andWidthUomIdLessThanOrEqualTo(String value) {
            addCriterion("WIDTH_UOM_ID <=", value, "widthUomId");
            return (Criteria) this;
        }

        public Criteria andWidthUomIdLike(String value) {
            addCriterion("WIDTH_UOM_ID like", value, "widthUomId");
            return (Criteria) this;
        }

        public Criteria andWidthUomIdNotLike(String value) {
            addCriterion("WIDTH_UOM_ID not like", value, "widthUomId");
            return (Criteria) this;
        }

        public Criteria andWidthUomIdIn(List<String> values) {
            addCriterion("WIDTH_UOM_ID in", values, "widthUomId");
            return (Criteria) this;
        }

        public Criteria andWidthUomIdNotIn(List<String> values) {
            addCriterion("WIDTH_UOM_ID not in", values, "widthUomId");
            return (Criteria) this;
        }

        public Criteria andWidthUomIdBetween(String value1, String value2) {
            addCriterion("WIDTH_UOM_ID between", value1, value2, "widthUomId");
            return (Criteria) this;
        }

        public Criteria andWidthUomIdNotBetween(String value1, String value2) {
            addCriterion("WIDTH_UOM_ID not between", value1, value2, "widthUomId");
            return (Criteria) this;
        }

        public Criteria andProductWidthIsNull() {
            addCriterion("PRODUCT_WIDTH is null");
            return (Criteria) this;
        }

        public Criteria andProductWidthIsNotNull() {
            addCriterion("PRODUCT_WIDTH is not null");
            return (Criteria) this;
        }

        public Criteria andProductWidthEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_WIDTH =", value, "productWidth");
            return (Criteria) this;
        }

        public Criteria andProductWidthNotEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_WIDTH <>", value, "productWidth");
            return (Criteria) this;
        }

        public Criteria andProductWidthGreaterThan(BigDecimal value) {
            addCriterion("PRODUCT_WIDTH >", value, "productWidth");
            return (Criteria) this;
        }

        public Criteria andProductWidthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_WIDTH >=", value, "productWidth");
            return (Criteria) this;
        }

        public Criteria andProductWidthLessThan(BigDecimal value) {
            addCriterion("PRODUCT_WIDTH <", value, "productWidth");
            return (Criteria) this;
        }

        public Criteria andProductWidthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_WIDTH <=", value, "productWidth");
            return (Criteria) this;
        }

        public Criteria andProductWidthIn(List<BigDecimal> values) {
            addCriterion("PRODUCT_WIDTH in", values, "productWidth");
            return (Criteria) this;
        }

        public Criteria andProductWidthNotIn(List<BigDecimal> values) {
            addCriterion("PRODUCT_WIDTH not in", values, "productWidth");
            return (Criteria) this;
        }

        public Criteria andProductWidthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_WIDTH between", value1, value2, "productWidth");
            return (Criteria) this;
        }

        public Criteria andProductWidthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_WIDTH not between", value1, value2, "productWidth");
            return (Criteria) this;
        }

        public Criteria andShippingWidthIsNull() {
            addCriterion("SHIPPING_WIDTH is null");
            return (Criteria) this;
        }

        public Criteria andShippingWidthIsNotNull() {
            addCriterion("SHIPPING_WIDTH is not null");
            return (Criteria) this;
        }

        public Criteria andShippingWidthEqualTo(BigDecimal value) {
            addCriterion("SHIPPING_WIDTH =", value, "shippingWidth");
            return (Criteria) this;
        }

        public Criteria andShippingWidthNotEqualTo(BigDecimal value) {
            addCriterion("SHIPPING_WIDTH <>", value, "shippingWidth");
            return (Criteria) this;
        }

        public Criteria andShippingWidthGreaterThan(BigDecimal value) {
            addCriterion("SHIPPING_WIDTH >", value, "shippingWidth");
            return (Criteria) this;
        }

        public Criteria andShippingWidthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SHIPPING_WIDTH >=", value, "shippingWidth");
            return (Criteria) this;
        }

        public Criteria andShippingWidthLessThan(BigDecimal value) {
            addCriterion("SHIPPING_WIDTH <", value, "shippingWidth");
            return (Criteria) this;
        }

        public Criteria andShippingWidthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SHIPPING_WIDTH <=", value, "shippingWidth");
            return (Criteria) this;
        }

        public Criteria andShippingWidthIn(List<BigDecimal> values) {
            addCriterion("SHIPPING_WIDTH in", values, "shippingWidth");
            return (Criteria) this;
        }

        public Criteria andShippingWidthNotIn(List<BigDecimal> values) {
            addCriterion("SHIPPING_WIDTH not in", values, "shippingWidth");
            return (Criteria) this;
        }

        public Criteria andShippingWidthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHIPPING_WIDTH between", value1, value2, "shippingWidth");
            return (Criteria) this;
        }

        public Criteria andShippingWidthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHIPPING_WIDTH not between", value1, value2, "shippingWidth");
            return (Criteria) this;
        }

        public Criteria andDepthUomIdIsNull() {
            addCriterion("DEPTH_UOM_ID is null");
            return (Criteria) this;
        }

        public Criteria andDepthUomIdIsNotNull() {
            addCriterion("DEPTH_UOM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDepthUomIdEqualTo(String value) {
            addCriterion("DEPTH_UOM_ID =", value, "depthUomId");
            return (Criteria) this;
        }

        public Criteria andDepthUomIdNotEqualTo(String value) {
            addCriterion("DEPTH_UOM_ID <>", value, "depthUomId");
            return (Criteria) this;
        }

        public Criteria andDepthUomIdGreaterThan(String value) {
            addCriterion("DEPTH_UOM_ID >", value, "depthUomId");
            return (Criteria) this;
        }

        public Criteria andDepthUomIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEPTH_UOM_ID >=", value, "depthUomId");
            return (Criteria) this;
        }

        public Criteria andDepthUomIdLessThan(String value) {
            addCriterion("DEPTH_UOM_ID <", value, "depthUomId");
            return (Criteria) this;
        }

        public Criteria andDepthUomIdLessThanOrEqualTo(String value) {
            addCriterion("DEPTH_UOM_ID <=", value, "depthUomId");
            return (Criteria) this;
        }

        public Criteria andDepthUomIdLike(String value) {
            addCriterion("DEPTH_UOM_ID like", value, "depthUomId");
            return (Criteria) this;
        }

        public Criteria andDepthUomIdNotLike(String value) {
            addCriterion("DEPTH_UOM_ID not like", value, "depthUomId");
            return (Criteria) this;
        }

        public Criteria andDepthUomIdIn(List<String> values) {
            addCriterion("DEPTH_UOM_ID in", values, "depthUomId");
            return (Criteria) this;
        }

        public Criteria andDepthUomIdNotIn(List<String> values) {
            addCriterion("DEPTH_UOM_ID not in", values, "depthUomId");
            return (Criteria) this;
        }

        public Criteria andDepthUomIdBetween(String value1, String value2) {
            addCriterion("DEPTH_UOM_ID between", value1, value2, "depthUomId");
            return (Criteria) this;
        }

        public Criteria andDepthUomIdNotBetween(String value1, String value2) {
            addCriterion("DEPTH_UOM_ID not between", value1, value2, "depthUomId");
            return (Criteria) this;
        }

        public Criteria andProductDepthIsNull() {
            addCriterion("PRODUCT_DEPTH is null");
            return (Criteria) this;
        }

        public Criteria andProductDepthIsNotNull() {
            addCriterion("PRODUCT_DEPTH is not null");
            return (Criteria) this;
        }

        public Criteria andProductDepthEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_DEPTH =", value, "productDepth");
            return (Criteria) this;
        }

        public Criteria andProductDepthNotEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_DEPTH <>", value, "productDepth");
            return (Criteria) this;
        }

        public Criteria andProductDepthGreaterThan(BigDecimal value) {
            addCriterion("PRODUCT_DEPTH >", value, "productDepth");
            return (Criteria) this;
        }

        public Criteria andProductDepthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_DEPTH >=", value, "productDepth");
            return (Criteria) this;
        }

        public Criteria andProductDepthLessThan(BigDecimal value) {
            addCriterion("PRODUCT_DEPTH <", value, "productDepth");
            return (Criteria) this;
        }

        public Criteria andProductDepthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_DEPTH <=", value, "productDepth");
            return (Criteria) this;
        }

        public Criteria andProductDepthIn(List<BigDecimal> values) {
            addCriterion("PRODUCT_DEPTH in", values, "productDepth");
            return (Criteria) this;
        }

        public Criteria andProductDepthNotIn(List<BigDecimal> values) {
            addCriterion("PRODUCT_DEPTH not in", values, "productDepth");
            return (Criteria) this;
        }

        public Criteria andProductDepthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_DEPTH between", value1, value2, "productDepth");
            return (Criteria) this;
        }

        public Criteria andProductDepthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_DEPTH not between", value1, value2, "productDepth");
            return (Criteria) this;
        }

        public Criteria andShippingDepthIsNull() {
            addCriterion("SHIPPING_DEPTH is null");
            return (Criteria) this;
        }

        public Criteria andShippingDepthIsNotNull() {
            addCriterion("SHIPPING_DEPTH is not null");
            return (Criteria) this;
        }

        public Criteria andShippingDepthEqualTo(BigDecimal value) {
            addCriterion("SHIPPING_DEPTH =", value, "shippingDepth");
            return (Criteria) this;
        }

        public Criteria andShippingDepthNotEqualTo(BigDecimal value) {
            addCriterion("SHIPPING_DEPTH <>", value, "shippingDepth");
            return (Criteria) this;
        }

        public Criteria andShippingDepthGreaterThan(BigDecimal value) {
            addCriterion("SHIPPING_DEPTH >", value, "shippingDepth");
            return (Criteria) this;
        }

        public Criteria andShippingDepthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SHIPPING_DEPTH >=", value, "shippingDepth");
            return (Criteria) this;
        }

        public Criteria andShippingDepthLessThan(BigDecimal value) {
            addCriterion("SHIPPING_DEPTH <", value, "shippingDepth");
            return (Criteria) this;
        }

        public Criteria andShippingDepthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SHIPPING_DEPTH <=", value, "shippingDepth");
            return (Criteria) this;
        }

        public Criteria andShippingDepthIn(List<BigDecimal> values) {
            addCriterion("SHIPPING_DEPTH in", values, "shippingDepth");
            return (Criteria) this;
        }

        public Criteria andShippingDepthNotIn(List<BigDecimal> values) {
            addCriterion("SHIPPING_DEPTH not in", values, "shippingDepth");
            return (Criteria) this;
        }

        public Criteria andShippingDepthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHIPPING_DEPTH between", value1, value2, "shippingDepth");
            return (Criteria) this;
        }

        public Criteria andShippingDepthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHIPPING_DEPTH not between", value1, value2, "shippingDepth");
            return (Criteria) this;
        }

        public Criteria andDiameterUomIdIsNull() {
            addCriterion("DIAMETER_UOM_ID is null");
            return (Criteria) this;
        }

        public Criteria andDiameterUomIdIsNotNull() {
            addCriterion("DIAMETER_UOM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDiameterUomIdEqualTo(String value) {
            addCriterion("DIAMETER_UOM_ID =", value, "diameterUomId");
            return (Criteria) this;
        }

        public Criteria andDiameterUomIdNotEqualTo(String value) {
            addCriterion("DIAMETER_UOM_ID <>", value, "diameterUomId");
            return (Criteria) this;
        }

        public Criteria andDiameterUomIdGreaterThan(String value) {
            addCriterion("DIAMETER_UOM_ID >", value, "diameterUomId");
            return (Criteria) this;
        }

        public Criteria andDiameterUomIdGreaterThanOrEqualTo(String value) {
            addCriterion("DIAMETER_UOM_ID >=", value, "diameterUomId");
            return (Criteria) this;
        }

        public Criteria andDiameterUomIdLessThan(String value) {
            addCriterion("DIAMETER_UOM_ID <", value, "diameterUomId");
            return (Criteria) this;
        }

        public Criteria andDiameterUomIdLessThanOrEqualTo(String value) {
            addCriterion("DIAMETER_UOM_ID <=", value, "diameterUomId");
            return (Criteria) this;
        }

        public Criteria andDiameterUomIdLike(String value) {
            addCriterion("DIAMETER_UOM_ID like", value, "diameterUomId");
            return (Criteria) this;
        }

        public Criteria andDiameterUomIdNotLike(String value) {
            addCriterion("DIAMETER_UOM_ID not like", value, "diameterUomId");
            return (Criteria) this;
        }

        public Criteria andDiameterUomIdIn(List<String> values) {
            addCriterion("DIAMETER_UOM_ID in", values, "diameterUomId");
            return (Criteria) this;
        }

        public Criteria andDiameterUomIdNotIn(List<String> values) {
            addCriterion("DIAMETER_UOM_ID not in", values, "diameterUomId");
            return (Criteria) this;
        }

        public Criteria andDiameterUomIdBetween(String value1, String value2) {
            addCriterion("DIAMETER_UOM_ID between", value1, value2, "diameterUomId");
            return (Criteria) this;
        }

        public Criteria andDiameterUomIdNotBetween(String value1, String value2) {
            addCriterion("DIAMETER_UOM_ID not between", value1, value2, "diameterUomId");
            return (Criteria) this;
        }

        public Criteria andProductDiameterIsNull() {
            addCriterion("PRODUCT_DIAMETER is null");
            return (Criteria) this;
        }

        public Criteria andProductDiameterIsNotNull() {
            addCriterion("PRODUCT_DIAMETER is not null");
            return (Criteria) this;
        }

        public Criteria andProductDiameterEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_DIAMETER =", value, "productDiameter");
            return (Criteria) this;
        }

        public Criteria andProductDiameterNotEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_DIAMETER <>", value, "productDiameter");
            return (Criteria) this;
        }

        public Criteria andProductDiameterGreaterThan(BigDecimal value) {
            addCriterion("PRODUCT_DIAMETER >", value, "productDiameter");
            return (Criteria) this;
        }

        public Criteria andProductDiameterGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_DIAMETER >=", value, "productDiameter");
            return (Criteria) this;
        }

        public Criteria andProductDiameterLessThan(BigDecimal value) {
            addCriterion("PRODUCT_DIAMETER <", value, "productDiameter");
            return (Criteria) this;
        }

        public Criteria andProductDiameterLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_DIAMETER <=", value, "productDiameter");
            return (Criteria) this;
        }

        public Criteria andProductDiameterIn(List<BigDecimal> values) {
            addCriterion("PRODUCT_DIAMETER in", values, "productDiameter");
            return (Criteria) this;
        }

        public Criteria andProductDiameterNotIn(List<BigDecimal> values) {
            addCriterion("PRODUCT_DIAMETER not in", values, "productDiameter");
            return (Criteria) this;
        }

        public Criteria andProductDiameterBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_DIAMETER between", value1, value2, "productDiameter");
            return (Criteria) this;
        }

        public Criteria andProductDiameterNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_DIAMETER not between", value1, value2, "productDiameter");
            return (Criteria) this;
        }

        public Criteria andProductRatingIsNull() {
            addCriterion("PRODUCT_RATING is null");
            return (Criteria) this;
        }

        public Criteria andProductRatingIsNotNull() {
            addCriterion("PRODUCT_RATING is not null");
            return (Criteria) this;
        }

        public Criteria andProductRatingEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_RATING =", value, "productRating");
            return (Criteria) this;
        }

        public Criteria andProductRatingNotEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_RATING <>", value, "productRating");
            return (Criteria) this;
        }

        public Criteria andProductRatingGreaterThan(BigDecimal value) {
            addCriterion("PRODUCT_RATING >", value, "productRating");
            return (Criteria) this;
        }

        public Criteria andProductRatingGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_RATING >=", value, "productRating");
            return (Criteria) this;
        }

        public Criteria andProductRatingLessThan(BigDecimal value) {
            addCriterion("PRODUCT_RATING <", value, "productRating");
            return (Criteria) this;
        }

        public Criteria andProductRatingLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_RATING <=", value, "productRating");
            return (Criteria) this;
        }

        public Criteria andProductRatingIn(List<BigDecimal> values) {
            addCriterion("PRODUCT_RATING in", values, "productRating");
            return (Criteria) this;
        }

        public Criteria andProductRatingNotIn(List<BigDecimal> values) {
            addCriterion("PRODUCT_RATING not in", values, "productRating");
            return (Criteria) this;
        }

        public Criteria andProductRatingBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_RATING between", value1, value2, "productRating");
            return (Criteria) this;
        }

        public Criteria andProductRatingNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_RATING not between", value1, value2, "productRating");
            return (Criteria) this;
        }

        public Criteria andRatingTypeEnumIsNull() {
            addCriterion("RATING_TYPE_ENUM is null");
            return (Criteria) this;
        }

        public Criteria andRatingTypeEnumIsNotNull() {
            addCriterion("RATING_TYPE_ENUM is not null");
            return (Criteria) this;
        }

        public Criteria andRatingTypeEnumEqualTo(String value) {
            addCriterion("RATING_TYPE_ENUM =", value, "ratingTypeEnum");
            return (Criteria) this;
        }

        public Criteria andRatingTypeEnumNotEqualTo(String value) {
            addCriterion("RATING_TYPE_ENUM <>", value, "ratingTypeEnum");
            return (Criteria) this;
        }

        public Criteria andRatingTypeEnumGreaterThan(String value) {
            addCriterion("RATING_TYPE_ENUM >", value, "ratingTypeEnum");
            return (Criteria) this;
        }

        public Criteria andRatingTypeEnumGreaterThanOrEqualTo(String value) {
            addCriterion("RATING_TYPE_ENUM >=", value, "ratingTypeEnum");
            return (Criteria) this;
        }

        public Criteria andRatingTypeEnumLessThan(String value) {
            addCriterion("RATING_TYPE_ENUM <", value, "ratingTypeEnum");
            return (Criteria) this;
        }

        public Criteria andRatingTypeEnumLessThanOrEqualTo(String value) {
            addCriterion("RATING_TYPE_ENUM <=", value, "ratingTypeEnum");
            return (Criteria) this;
        }

        public Criteria andRatingTypeEnumLike(String value) {
            addCriterion("RATING_TYPE_ENUM like", value, "ratingTypeEnum");
            return (Criteria) this;
        }

        public Criteria andRatingTypeEnumNotLike(String value) {
            addCriterion("RATING_TYPE_ENUM not like", value, "ratingTypeEnum");
            return (Criteria) this;
        }

        public Criteria andRatingTypeEnumIn(List<String> values) {
            addCriterion("RATING_TYPE_ENUM in", values, "ratingTypeEnum");
            return (Criteria) this;
        }

        public Criteria andRatingTypeEnumNotIn(List<String> values) {
            addCriterion("RATING_TYPE_ENUM not in", values, "ratingTypeEnum");
            return (Criteria) this;
        }

        public Criteria andRatingTypeEnumBetween(String value1, String value2) {
            addCriterion("RATING_TYPE_ENUM between", value1, value2, "ratingTypeEnum");
            return (Criteria) this;
        }

        public Criteria andRatingTypeEnumNotBetween(String value1, String value2) {
            addCriterion("RATING_TYPE_ENUM not between", value1, value2, "ratingTypeEnum");
            return (Criteria) this;
        }

        public Criteria andReturnableIsNull() {
            addCriterion("RETURNABLE is null");
            return (Criteria) this;
        }

        public Criteria andReturnableIsNotNull() {
            addCriterion("RETURNABLE is not null");
            return (Criteria) this;
        }

        public Criteria andReturnableEqualTo(String value) {
            addCriterion("RETURNABLE =", value, "returnable");
            return (Criteria) this;
        }

        public Criteria andReturnableNotEqualTo(String value) {
            addCriterion("RETURNABLE <>", value, "returnable");
            return (Criteria) this;
        }

        public Criteria andReturnableGreaterThan(String value) {
            addCriterion("RETURNABLE >", value, "returnable");
            return (Criteria) this;
        }

        public Criteria andReturnableGreaterThanOrEqualTo(String value) {
            addCriterion("RETURNABLE >=", value, "returnable");
            return (Criteria) this;
        }

        public Criteria andReturnableLessThan(String value) {
            addCriterion("RETURNABLE <", value, "returnable");
            return (Criteria) this;
        }

        public Criteria andReturnableLessThanOrEqualTo(String value) {
            addCriterion("RETURNABLE <=", value, "returnable");
            return (Criteria) this;
        }

        public Criteria andReturnableLike(String value) {
            addCriterion("RETURNABLE like", value, "returnable");
            return (Criteria) this;
        }

        public Criteria andReturnableNotLike(String value) {
            addCriterion("RETURNABLE not like", value, "returnable");
            return (Criteria) this;
        }

        public Criteria andReturnableIn(List<String> values) {
            addCriterion("RETURNABLE in", values, "returnable");
            return (Criteria) this;
        }

        public Criteria andReturnableNotIn(List<String> values) {
            addCriterion("RETURNABLE not in", values, "returnable");
            return (Criteria) this;
        }

        public Criteria andReturnableBetween(String value1, String value2) {
            addCriterion("RETURNABLE between", value1, value2, "returnable");
            return (Criteria) this;
        }

        public Criteria andReturnableNotBetween(String value1, String value2) {
            addCriterion("RETURNABLE not between", value1, value2, "returnable");
            return (Criteria) this;
        }

        public Criteria andTaxableIsNull() {
            addCriterion("TAXABLE is null");
            return (Criteria) this;
        }

        public Criteria andTaxableIsNotNull() {
            addCriterion("TAXABLE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxableEqualTo(String value) {
            addCriterion("TAXABLE =", value, "taxable");
            return (Criteria) this;
        }

        public Criteria andTaxableNotEqualTo(String value) {
            addCriterion("TAXABLE <>", value, "taxable");
            return (Criteria) this;
        }

        public Criteria andTaxableGreaterThan(String value) {
            addCriterion("TAXABLE >", value, "taxable");
            return (Criteria) this;
        }

        public Criteria andTaxableGreaterThanOrEqualTo(String value) {
            addCriterion("TAXABLE >=", value, "taxable");
            return (Criteria) this;
        }

        public Criteria andTaxableLessThan(String value) {
            addCriterion("TAXABLE <", value, "taxable");
            return (Criteria) this;
        }

        public Criteria andTaxableLessThanOrEqualTo(String value) {
            addCriterion("TAXABLE <=", value, "taxable");
            return (Criteria) this;
        }

        public Criteria andTaxableLike(String value) {
            addCriterion("TAXABLE like", value, "taxable");
            return (Criteria) this;
        }

        public Criteria andTaxableNotLike(String value) {
            addCriterion("TAXABLE not like", value, "taxable");
            return (Criteria) this;
        }

        public Criteria andTaxableIn(List<String> values) {
            addCriterion("TAXABLE in", values, "taxable");
            return (Criteria) this;
        }

        public Criteria andTaxableNotIn(List<String> values) {
            addCriterion("TAXABLE not in", values, "taxable");
            return (Criteria) this;
        }

        public Criteria andTaxableBetween(String value1, String value2) {
            addCriterion("TAXABLE between", value1, value2, "taxable");
            return (Criteria) this;
        }

        public Criteria andTaxableNotBetween(String value1, String value2) {
            addCriterion("TAXABLE not between", value1, value2, "taxable");
            return (Criteria) this;
        }

        public Criteria andChargeShippingIsNull() {
            addCriterion("CHARGE_SHIPPING is null");
            return (Criteria) this;
        }

        public Criteria andChargeShippingIsNotNull() {
            addCriterion("CHARGE_SHIPPING is not null");
            return (Criteria) this;
        }

        public Criteria andChargeShippingEqualTo(String value) {
            addCriterion("CHARGE_SHIPPING =", value, "chargeShipping");
            return (Criteria) this;
        }

        public Criteria andChargeShippingNotEqualTo(String value) {
            addCriterion("CHARGE_SHIPPING <>", value, "chargeShipping");
            return (Criteria) this;
        }

        public Criteria andChargeShippingGreaterThan(String value) {
            addCriterion("CHARGE_SHIPPING >", value, "chargeShipping");
            return (Criteria) this;
        }

        public Criteria andChargeShippingGreaterThanOrEqualTo(String value) {
            addCriterion("CHARGE_SHIPPING >=", value, "chargeShipping");
            return (Criteria) this;
        }

        public Criteria andChargeShippingLessThan(String value) {
            addCriterion("CHARGE_SHIPPING <", value, "chargeShipping");
            return (Criteria) this;
        }

        public Criteria andChargeShippingLessThanOrEqualTo(String value) {
            addCriterion("CHARGE_SHIPPING <=", value, "chargeShipping");
            return (Criteria) this;
        }

        public Criteria andChargeShippingLike(String value) {
            addCriterion("CHARGE_SHIPPING like", value, "chargeShipping");
            return (Criteria) this;
        }

        public Criteria andChargeShippingNotLike(String value) {
            addCriterion("CHARGE_SHIPPING not like", value, "chargeShipping");
            return (Criteria) this;
        }

        public Criteria andChargeShippingIn(List<String> values) {
            addCriterion("CHARGE_SHIPPING in", values, "chargeShipping");
            return (Criteria) this;
        }

        public Criteria andChargeShippingNotIn(List<String> values) {
            addCriterion("CHARGE_SHIPPING not in", values, "chargeShipping");
            return (Criteria) this;
        }

        public Criteria andChargeShippingBetween(String value1, String value2) {
            addCriterion("CHARGE_SHIPPING between", value1, value2, "chargeShipping");
            return (Criteria) this;
        }

        public Criteria andChargeShippingNotBetween(String value1, String value2) {
            addCriterion("CHARGE_SHIPPING not between", value1, value2, "chargeShipping");
            return (Criteria) this;
        }

        public Criteria andAutoCreateKeywordsIsNull() {
            addCriterion("AUTO_CREATE_KEYWORDS is null");
            return (Criteria) this;
        }

        public Criteria andAutoCreateKeywordsIsNotNull() {
            addCriterion("AUTO_CREATE_KEYWORDS is not null");
            return (Criteria) this;
        }

        public Criteria andAutoCreateKeywordsEqualTo(String value) {
            addCriterion("AUTO_CREATE_KEYWORDS =", value, "autoCreateKeywords");
            return (Criteria) this;
        }

        public Criteria andAutoCreateKeywordsNotEqualTo(String value) {
            addCriterion("AUTO_CREATE_KEYWORDS <>", value, "autoCreateKeywords");
            return (Criteria) this;
        }

        public Criteria andAutoCreateKeywordsGreaterThan(String value) {
            addCriterion("AUTO_CREATE_KEYWORDS >", value, "autoCreateKeywords");
            return (Criteria) this;
        }

        public Criteria andAutoCreateKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("AUTO_CREATE_KEYWORDS >=", value, "autoCreateKeywords");
            return (Criteria) this;
        }

        public Criteria andAutoCreateKeywordsLessThan(String value) {
            addCriterion("AUTO_CREATE_KEYWORDS <", value, "autoCreateKeywords");
            return (Criteria) this;
        }

        public Criteria andAutoCreateKeywordsLessThanOrEqualTo(String value) {
            addCriterion("AUTO_CREATE_KEYWORDS <=", value, "autoCreateKeywords");
            return (Criteria) this;
        }

        public Criteria andAutoCreateKeywordsLike(String value) {
            addCriterion("AUTO_CREATE_KEYWORDS like", value, "autoCreateKeywords");
            return (Criteria) this;
        }

        public Criteria andAutoCreateKeywordsNotLike(String value) {
            addCriterion("AUTO_CREATE_KEYWORDS not like", value, "autoCreateKeywords");
            return (Criteria) this;
        }

        public Criteria andAutoCreateKeywordsIn(List<String> values) {
            addCriterion("AUTO_CREATE_KEYWORDS in", values, "autoCreateKeywords");
            return (Criteria) this;
        }

        public Criteria andAutoCreateKeywordsNotIn(List<String> values) {
            addCriterion("AUTO_CREATE_KEYWORDS not in", values, "autoCreateKeywords");
            return (Criteria) this;
        }

        public Criteria andAutoCreateKeywordsBetween(String value1, String value2) {
            addCriterion("AUTO_CREATE_KEYWORDS between", value1, value2, "autoCreateKeywords");
            return (Criteria) this;
        }

        public Criteria andAutoCreateKeywordsNotBetween(String value1, String value2) {
            addCriterion("AUTO_CREATE_KEYWORDS not between", value1, value2, "autoCreateKeywords");
            return (Criteria) this;
        }

        public Criteria andIncludeInPromotionsIsNull() {
            addCriterion("INCLUDE_IN_PROMOTIONS is null");
            return (Criteria) this;
        }

        public Criteria andIncludeInPromotionsIsNotNull() {
            addCriterion("INCLUDE_IN_PROMOTIONS is not null");
            return (Criteria) this;
        }

        public Criteria andIncludeInPromotionsEqualTo(String value) {
            addCriterion("INCLUDE_IN_PROMOTIONS =", value, "includeInPromotions");
            return (Criteria) this;
        }

        public Criteria andIncludeInPromotionsNotEqualTo(String value) {
            addCriterion("INCLUDE_IN_PROMOTIONS <>", value, "includeInPromotions");
            return (Criteria) this;
        }

        public Criteria andIncludeInPromotionsGreaterThan(String value) {
            addCriterion("INCLUDE_IN_PROMOTIONS >", value, "includeInPromotions");
            return (Criteria) this;
        }

        public Criteria andIncludeInPromotionsGreaterThanOrEqualTo(String value) {
            addCriterion("INCLUDE_IN_PROMOTIONS >=", value, "includeInPromotions");
            return (Criteria) this;
        }

        public Criteria andIncludeInPromotionsLessThan(String value) {
            addCriterion("INCLUDE_IN_PROMOTIONS <", value, "includeInPromotions");
            return (Criteria) this;
        }

        public Criteria andIncludeInPromotionsLessThanOrEqualTo(String value) {
            addCriterion("INCLUDE_IN_PROMOTIONS <=", value, "includeInPromotions");
            return (Criteria) this;
        }

        public Criteria andIncludeInPromotionsLike(String value) {
            addCriterion("INCLUDE_IN_PROMOTIONS like", value, "includeInPromotions");
            return (Criteria) this;
        }

        public Criteria andIncludeInPromotionsNotLike(String value) {
            addCriterion("INCLUDE_IN_PROMOTIONS not like", value, "includeInPromotions");
            return (Criteria) this;
        }

        public Criteria andIncludeInPromotionsIn(List<String> values) {
            addCriterion("INCLUDE_IN_PROMOTIONS in", values, "includeInPromotions");
            return (Criteria) this;
        }

        public Criteria andIncludeInPromotionsNotIn(List<String> values) {
            addCriterion("INCLUDE_IN_PROMOTIONS not in", values, "includeInPromotions");
            return (Criteria) this;
        }

        public Criteria andIncludeInPromotionsBetween(String value1, String value2) {
            addCriterion("INCLUDE_IN_PROMOTIONS between", value1, value2, "includeInPromotions");
            return (Criteria) this;
        }

        public Criteria andIncludeInPromotionsNotBetween(String value1, String value2) {
            addCriterion("INCLUDE_IN_PROMOTIONS not between", value1, value2, "includeInPromotions");
            return (Criteria) this;
        }

        public Criteria andIsVirtualIsNull() {
            addCriterion("IS_VIRTUAL is null");
            return (Criteria) this;
        }

        public Criteria andIsVirtualIsNotNull() {
            addCriterion("IS_VIRTUAL is not null");
            return (Criteria) this;
        }

        public Criteria andIsVirtualEqualTo(String value) {
            addCriterion("IS_VIRTUAL =", value, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualNotEqualTo(String value) {
            addCriterion("IS_VIRTUAL <>", value, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualGreaterThan(String value) {
            addCriterion("IS_VIRTUAL >", value, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualGreaterThanOrEqualTo(String value) {
            addCriterion("IS_VIRTUAL >=", value, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualLessThan(String value) {
            addCriterion("IS_VIRTUAL <", value, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualLessThanOrEqualTo(String value) {
            addCriterion("IS_VIRTUAL <=", value, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualLike(String value) {
            addCriterion("IS_VIRTUAL like", value, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualNotLike(String value) {
            addCriterion("IS_VIRTUAL not like", value, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualIn(List<String> values) {
            addCriterion("IS_VIRTUAL in", values, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualNotIn(List<String> values) {
            addCriterion("IS_VIRTUAL not in", values, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualBetween(String value1, String value2) {
            addCriterion("IS_VIRTUAL between", value1, value2, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualNotBetween(String value1, String value2) {
            addCriterion("IS_VIRTUAL not between", value1, value2, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVariantIsNull() {
            addCriterion("IS_VARIANT is null");
            return (Criteria) this;
        }

        public Criteria andIsVariantIsNotNull() {
            addCriterion("IS_VARIANT is not null");
            return (Criteria) this;
        }

        public Criteria andIsVariantEqualTo(String value) {
            addCriterion("IS_VARIANT =", value, "isVariant");
            return (Criteria) this;
        }

        public Criteria andIsVariantNotEqualTo(String value) {
            addCriterion("IS_VARIANT <>", value, "isVariant");
            return (Criteria) this;
        }

        public Criteria andIsVariantGreaterThan(String value) {
            addCriterion("IS_VARIANT >", value, "isVariant");
            return (Criteria) this;
        }

        public Criteria andIsVariantGreaterThanOrEqualTo(String value) {
            addCriterion("IS_VARIANT >=", value, "isVariant");
            return (Criteria) this;
        }

        public Criteria andIsVariantLessThan(String value) {
            addCriterion("IS_VARIANT <", value, "isVariant");
            return (Criteria) this;
        }

        public Criteria andIsVariantLessThanOrEqualTo(String value) {
            addCriterion("IS_VARIANT <=", value, "isVariant");
            return (Criteria) this;
        }

        public Criteria andIsVariantLike(String value) {
            addCriterion("IS_VARIANT like", value, "isVariant");
            return (Criteria) this;
        }

        public Criteria andIsVariantNotLike(String value) {
            addCriterion("IS_VARIANT not like", value, "isVariant");
            return (Criteria) this;
        }

        public Criteria andIsVariantIn(List<String> values) {
            addCriterion("IS_VARIANT in", values, "isVariant");
            return (Criteria) this;
        }

        public Criteria andIsVariantNotIn(List<String> values) {
            addCriterion("IS_VARIANT not in", values, "isVariant");
            return (Criteria) this;
        }

        public Criteria andIsVariantBetween(String value1, String value2) {
            addCriterion("IS_VARIANT between", value1, value2, "isVariant");
            return (Criteria) this;
        }

        public Criteria andIsVariantNotBetween(String value1, String value2) {
            addCriterion("IS_VARIANT not between", value1, value2, "isVariant");
            return (Criteria) this;
        }

        public Criteria andVirtualVariantMethodEnumIsNull() {
            addCriterion("VIRTUAL_VARIANT_METHOD_ENUM is null");
            return (Criteria) this;
        }

        public Criteria andVirtualVariantMethodEnumIsNotNull() {
            addCriterion("VIRTUAL_VARIANT_METHOD_ENUM is not null");
            return (Criteria) this;
        }

        public Criteria andVirtualVariantMethodEnumEqualTo(String value) {
            addCriterion("VIRTUAL_VARIANT_METHOD_ENUM =", value, "virtualVariantMethodEnum");
            return (Criteria) this;
        }

        public Criteria andVirtualVariantMethodEnumNotEqualTo(String value) {
            addCriterion("VIRTUAL_VARIANT_METHOD_ENUM <>", value, "virtualVariantMethodEnum");
            return (Criteria) this;
        }

        public Criteria andVirtualVariantMethodEnumGreaterThan(String value) {
            addCriterion("VIRTUAL_VARIANT_METHOD_ENUM >", value, "virtualVariantMethodEnum");
            return (Criteria) this;
        }

        public Criteria andVirtualVariantMethodEnumGreaterThanOrEqualTo(String value) {
            addCriterion("VIRTUAL_VARIANT_METHOD_ENUM >=", value, "virtualVariantMethodEnum");
            return (Criteria) this;
        }

        public Criteria andVirtualVariantMethodEnumLessThan(String value) {
            addCriterion("VIRTUAL_VARIANT_METHOD_ENUM <", value, "virtualVariantMethodEnum");
            return (Criteria) this;
        }

        public Criteria andVirtualVariantMethodEnumLessThanOrEqualTo(String value) {
            addCriterion("VIRTUAL_VARIANT_METHOD_ENUM <=", value, "virtualVariantMethodEnum");
            return (Criteria) this;
        }

        public Criteria andVirtualVariantMethodEnumLike(String value) {
            addCriterion("VIRTUAL_VARIANT_METHOD_ENUM like", value, "virtualVariantMethodEnum");
            return (Criteria) this;
        }

        public Criteria andVirtualVariantMethodEnumNotLike(String value) {
            addCriterion("VIRTUAL_VARIANT_METHOD_ENUM not like", value, "virtualVariantMethodEnum");
            return (Criteria) this;
        }

        public Criteria andVirtualVariantMethodEnumIn(List<String> values) {
            addCriterion("VIRTUAL_VARIANT_METHOD_ENUM in", values, "virtualVariantMethodEnum");
            return (Criteria) this;
        }

        public Criteria andVirtualVariantMethodEnumNotIn(List<String> values) {
            addCriterion("VIRTUAL_VARIANT_METHOD_ENUM not in", values, "virtualVariantMethodEnum");
            return (Criteria) this;
        }

        public Criteria andVirtualVariantMethodEnumBetween(String value1, String value2) {
            addCriterion("VIRTUAL_VARIANT_METHOD_ENUM between", value1, value2, "virtualVariantMethodEnum");
            return (Criteria) this;
        }

        public Criteria andVirtualVariantMethodEnumNotBetween(String value1, String value2) {
            addCriterion("VIRTUAL_VARIANT_METHOD_ENUM not between", value1, value2, "virtualVariantMethodEnum");
            return (Criteria) this;
        }

        public Criteria andOriginGeoIdIsNull() {
            addCriterion("ORIGIN_GEO_ID is null");
            return (Criteria) this;
        }

        public Criteria andOriginGeoIdIsNotNull() {
            addCriterion("ORIGIN_GEO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOriginGeoIdEqualTo(String value) {
            addCriterion("ORIGIN_GEO_ID =", value, "originGeoId");
            return (Criteria) this;
        }

        public Criteria andOriginGeoIdNotEqualTo(String value) {
            addCriterion("ORIGIN_GEO_ID <>", value, "originGeoId");
            return (Criteria) this;
        }

        public Criteria andOriginGeoIdGreaterThan(String value) {
            addCriterion("ORIGIN_GEO_ID >", value, "originGeoId");
            return (Criteria) this;
        }

        public Criteria andOriginGeoIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORIGIN_GEO_ID >=", value, "originGeoId");
            return (Criteria) this;
        }

        public Criteria andOriginGeoIdLessThan(String value) {
            addCriterion("ORIGIN_GEO_ID <", value, "originGeoId");
            return (Criteria) this;
        }

        public Criteria andOriginGeoIdLessThanOrEqualTo(String value) {
            addCriterion("ORIGIN_GEO_ID <=", value, "originGeoId");
            return (Criteria) this;
        }

        public Criteria andOriginGeoIdLike(String value) {
            addCriterion("ORIGIN_GEO_ID like", value, "originGeoId");
            return (Criteria) this;
        }

        public Criteria andOriginGeoIdNotLike(String value) {
            addCriterion("ORIGIN_GEO_ID not like", value, "originGeoId");
            return (Criteria) this;
        }

        public Criteria andOriginGeoIdIn(List<String> values) {
            addCriterion("ORIGIN_GEO_ID in", values, "originGeoId");
            return (Criteria) this;
        }

        public Criteria andOriginGeoIdNotIn(List<String> values) {
            addCriterion("ORIGIN_GEO_ID not in", values, "originGeoId");
            return (Criteria) this;
        }

        public Criteria andOriginGeoIdBetween(String value1, String value2) {
            addCriterion("ORIGIN_GEO_ID between", value1, value2, "originGeoId");
            return (Criteria) this;
        }

        public Criteria andOriginGeoIdNotBetween(String value1, String value2) {
            addCriterion("ORIGIN_GEO_ID not between", value1, value2, "originGeoId");
            return (Criteria) this;
        }

        public Criteria andRequirementMethodEnumIdIsNull() {
            addCriterion("REQUIREMENT_METHOD_ENUM_ID is null");
            return (Criteria) this;
        }

        public Criteria andRequirementMethodEnumIdIsNotNull() {
            addCriterion("REQUIREMENT_METHOD_ENUM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRequirementMethodEnumIdEqualTo(String value) {
            addCriterion("REQUIREMENT_METHOD_ENUM_ID =", value, "requirementMethodEnumId");
            return (Criteria) this;
        }

        public Criteria andRequirementMethodEnumIdNotEqualTo(String value) {
            addCriterion("REQUIREMENT_METHOD_ENUM_ID <>", value, "requirementMethodEnumId");
            return (Criteria) this;
        }

        public Criteria andRequirementMethodEnumIdGreaterThan(String value) {
            addCriterion("REQUIREMENT_METHOD_ENUM_ID >", value, "requirementMethodEnumId");
            return (Criteria) this;
        }

        public Criteria andRequirementMethodEnumIdGreaterThanOrEqualTo(String value) {
            addCriterion("REQUIREMENT_METHOD_ENUM_ID >=", value, "requirementMethodEnumId");
            return (Criteria) this;
        }

        public Criteria andRequirementMethodEnumIdLessThan(String value) {
            addCriterion("REQUIREMENT_METHOD_ENUM_ID <", value, "requirementMethodEnumId");
            return (Criteria) this;
        }

        public Criteria andRequirementMethodEnumIdLessThanOrEqualTo(String value) {
            addCriterion("REQUIREMENT_METHOD_ENUM_ID <=", value, "requirementMethodEnumId");
            return (Criteria) this;
        }

        public Criteria andRequirementMethodEnumIdLike(String value) {
            addCriterion("REQUIREMENT_METHOD_ENUM_ID like", value, "requirementMethodEnumId");
            return (Criteria) this;
        }

        public Criteria andRequirementMethodEnumIdNotLike(String value) {
            addCriterion("REQUIREMENT_METHOD_ENUM_ID not like", value, "requirementMethodEnumId");
            return (Criteria) this;
        }

        public Criteria andRequirementMethodEnumIdIn(List<String> values) {
            addCriterion("REQUIREMENT_METHOD_ENUM_ID in", values, "requirementMethodEnumId");
            return (Criteria) this;
        }

        public Criteria andRequirementMethodEnumIdNotIn(List<String> values) {
            addCriterion("REQUIREMENT_METHOD_ENUM_ID not in", values, "requirementMethodEnumId");
            return (Criteria) this;
        }

        public Criteria andRequirementMethodEnumIdBetween(String value1, String value2) {
            addCriterion("REQUIREMENT_METHOD_ENUM_ID between", value1, value2, "requirementMethodEnumId");
            return (Criteria) this;
        }

        public Criteria andRequirementMethodEnumIdNotBetween(String value1, String value2) {
            addCriterion("REQUIREMENT_METHOD_ENUM_ID not between", value1, value2, "requirementMethodEnumId");
            return (Criteria) this;
        }

        public Criteria andBillOfMaterialLevelIsNull() {
            addCriterion("BILL_OF_MATERIAL_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andBillOfMaterialLevelIsNotNull() {
            addCriterion("BILL_OF_MATERIAL_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andBillOfMaterialLevelEqualTo(BigDecimal value) {
            addCriterion("BILL_OF_MATERIAL_LEVEL =", value, "billOfMaterialLevel");
            return (Criteria) this;
        }

        public Criteria andBillOfMaterialLevelNotEqualTo(BigDecimal value) {
            addCriterion("BILL_OF_MATERIAL_LEVEL <>", value, "billOfMaterialLevel");
            return (Criteria) this;
        }

        public Criteria andBillOfMaterialLevelGreaterThan(BigDecimal value) {
            addCriterion("BILL_OF_MATERIAL_LEVEL >", value, "billOfMaterialLevel");
            return (Criteria) this;
        }

        public Criteria andBillOfMaterialLevelGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BILL_OF_MATERIAL_LEVEL >=", value, "billOfMaterialLevel");
            return (Criteria) this;
        }

        public Criteria andBillOfMaterialLevelLessThan(BigDecimal value) {
            addCriterion("BILL_OF_MATERIAL_LEVEL <", value, "billOfMaterialLevel");
            return (Criteria) this;
        }

        public Criteria andBillOfMaterialLevelLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BILL_OF_MATERIAL_LEVEL <=", value, "billOfMaterialLevel");
            return (Criteria) this;
        }

        public Criteria andBillOfMaterialLevelIn(List<BigDecimal> values) {
            addCriterion("BILL_OF_MATERIAL_LEVEL in", values, "billOfMaterialLevel");
            return (Criteria) this;
        }

        public Criteria andBillOfMaterialLevelNotIn(List<BigDecimal> values) {
            addCriterion("BILL_OF_MATERIAL_LEVEL not in", values, "billOfMaterialLevel");
            return (Criteria) this;
        }

        public Criteria andBillOfMaterialLevelBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BILL_OF_MATERIAL_LEVEL between", value1, value2, "billOfMaterialLevel");
            return (Criteria) this;
        }

        public Criteria andBillOfMaterialLevelNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BILL_OF_MATERIAL_LEVEL not between", value1, value2, "billOfMaterialLevel");
            return (Criteria) this;
        }

        public Criteria andReservMaxPersonsIsNull() {
            addCriterion("RESERV_MAX_PERSONS is null");
            return (Criteria) this;
        }

        public Criteria andReservMaxPersonsIsNotNull() {
            addCriterion("RESERV_MAX_PERSONS is not null");
            return (Criteria) this;
        }

        public Criteria andReservMaxPersonsEqualTo(BigDecimal value) {
            addCriterion("RESERV_MAX_PERSONS =", value, "reservMaxPersons");
            return (Criteria) this;
        }

        public Criteria andReservMaxPersonsNotEqualTo(BigDecimal value) {
            addCriterion("RESERV_MAX_PERSONS <>", value, "reservMaxPersons");
            return (Criteria) this;
        }

        public Criteria andReservMaxPersonsGreaterThan(BigDecimal value) {
            addCriterion("RESERV_MAX_PERSONS >", value, "reservMaxPersons");
            return (Criteria) this;
        }

        public Criteria andReservMaxPersonsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RESERV_MAX_PERSONS >=", value, "reservMaxPersons");
            return (Criteria) this;
        }

        public Criteria andReservMaxPersonsLessThan(BigDecimal value) {
            addCriterion("RESERV_MAX_PERSONS <", value, "reservMaxPersons");
            return (Criteria) this;
        }

        public Criteria andReservMaxPersonsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RESERV_MAX_PERSONS <=", value, "reservMaxPersons");
            return (Criteria) this;
        }

        public Criteria andReservMaxPersonsIn(List<BigDecimal> values) {
            addCriterion("RESERV_MAX_PERSONS in", values, "reservMaxPersons");
            return (Criteria) this;
        }

        public Criteria andReservMaxPersonsNotIn(List<BigDecimal> values) {
            addCriterion("RESERV_MAX_PERSONS not in", values, "reservMaxPersons");
            return (Criteria) this;
        }

        public Criteria andReservMaxPersonsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RESERV_MAX_PERSONS between", value1, value2, "reservMaxPersons");
            return (Criteria) this;
        }

        public Criteria andReservMaxPersonsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RESERV_MAX_PERSONS not between", value1, value2, "reservMaxPersons");
            return (Criteria) this;
        }

        public Criteria andReserv2ndPPPercIsNull() {
            addCriterion("RESERV2ND_P_P_PERC is null");
            return (Criteria) this;
        }

        public Criteria andReserv2ndPPPercIsNotNull() {
            addCriterion("RESERV2ND_P_P_PERC is not null");
            return (Criteria) this;
        }

        public Criteria andReserv2ndPPPercEqualTo(BigDecimal value) {
            addCriterion("RESERV2ND_P_P_PERC =", value, "reserv2ndPPPerc");
            return (Criteria) this;
        }

        public Criteria andReserv2ndPPPercNotEqualTo(BigDecimal value) {
            addCriterion("RESERV2ND_P_P_PERC <>", value, "reserv2ndPPPerc");
            return (Criteria) this;
        }

        public Criteria andReserv2ndPPPercGreaterThan(BigDecimal value) {
            addCriterion("RESERV2ND_P_P_PERC >", value, "reserv2ndPPPerc");
            return (Criteria) this;
        }

        public Criteria andReserv2ndPPPercGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RESERV2ND_P_P_PERC >=", value, "reserv2ndPPPerc");
            return (Criteria) this;
        }

        public Criteria andReserv2ndPPPercLessThan(BigDecimal value) {
            addCriterion("RESERV2ND_P_P_PERC <", value, "reserv2ndPPPerc");
            return (Criteria) this;
        }

        public Criteria andReserv2ndPPPercLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RESERV2ND_P_P_PERC <=", value, "reserv2ndPPPerc");
            return (Criteria) this;
        }

        public Criteria andReserv2ndPPPercIn(List<BigDecimal> values) {
            addCriterion("RESERV2ND_P_P_PERC in", values, "reserv2ndPPPerc");
            return (Criteria) this;
        }

        public Criteria andReserv2ndPPPercNotIn(List<BigDecimal> values) {
            addCriterion("RESERV2ND_P_P_PERC not in", values, "reserv2ndPPPerc");
            return (Criteria) this;
        }

        public Criteria andReserv2ndPPPercBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RESERV2ND_P_P_PERC between", value1, value2, "reserv2ndPPPerc");
            return (Criteria) this;
        }

        public Criteria andReserv2ndPPPercNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RESERV2ND_P_P_PERC not between", value1, value2, "reserv2ndPPPerc");
            return (Criteria) this;
        }

        public Criteria andReservNthPPPercIsNull() {
            addCriterion("RESERV_NTH_P_P_PERC is null");
            return (Criteria) this;
        }

        public Criteria andReservNthPPPercIsNotNull() {
            addCriterion("RESERV_NTH_P_P_PERC is not null");
            return (Criteria) this;
        }

        public Criteria andReservNthPPPercEqualTo(BigDecimal value) {
            addCriterion("RESERV_NTH_P_P_PERC =", value, "reservNthPPPerc");
            return (Criteria) this;
        }

        public Criteria andReservNthPPPercNotEqualTo(BigDecimal value) {
            addCriterion("RESERV_NTH_P_P_PERC <>", value, "reservNthPPPerc");
            return (Criteria) this;
        }

        public Criteria andReservNthPPPercGreaterThan(BigDecimal value) {
            addCriterion("RESERV_NTH_P_P_PERC >", value, "reservNthPPPerc");
            return (Criteria) this;
        }

        public Criteria andReservNthPPPercGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RESERV_NTH_P_P_PERC >=", value, "reservNthPPPerc");
            return (Criteria) this;
        }

        public Criteria andReservNthPPPercLessThan(BigDecimal value) {
            addCriterion("RESERV_NTH_P_P_PERC <", value, "reservNthPPPerc");
            return (Criteria) this;
        }

        public Criteria andReservNthPPPercLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RESERV_NTH_P_P_PERC <=", value, "reservNthPPPerc");
            return (Criteria) this;
        }

        public Criteria andReservNthPPPercIn(List<BigDecimal> values) {
            addCriterion("RESERV_NTH_P_P_PERC in", values, "reservNthPPPerc");
            return (Criteria) this;
        }

        public Criteria andReservNthPPPercNotIn(List<BigDecimal> values) {
            addCriterion("RESERV_NTH_P_P_PERC not in", values, "reservNthPPPerc");
            return (Criteria) this;
        }

        public Criteria andReservNthPPPercBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RESERV_NTH_P_P_PERC between", value1, value2, "reservNthPPPerc");
            return (Criteria) this;
        }

        public Criteria andReservNthPPPercNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RESERV_NTH_P_P_PERC not between", value1, value2, "reservNthPPPerc");
            return (Criteria) this;
        }

        public Criteria andConfigIdIsNull() {
            addCriterion("CONFIG_ID is null");
            return (Criteria) this;
        }

        public Criteria andConfigIdIsNotNull() {
            addCriterion("CONFIG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andConfigIdEqualTo(String value) {
            addCriterion("CONFIG_ID =", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdNotEqualTo(String value) {
            addCriterion("CONFIG_ID <>", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdGreaterThan(String value) {
            addCriterion("CONFIG_ID >", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIG_ID >=", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdLessThan(String value) {
            addCriterion("CONFIG_ID <", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdLessThanOrEqualTo(String value) {
            addCriterion("CONFIG_ID <=", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdLike(String value) {
            addCriterion("CONFIG_ID like", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdNotLike(String value) {
            addCriterion("CONFIG_ID not like", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdIn(List<String> values) {
            addCriterion("CONFIG_ID in", values, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdNotIn(List<String> values) {
            addCriterion("CONFIG_ID not in", values, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdBetween(String value1, String value2) {
            addCriterion("CONFIG_ID between", value1, value2, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdNotBetween(String value1, String value2) {
            addCriterion("CONFIG_ID not between", value1, value2, "configId");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNull() {
            addCriterion("CREATED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNotNull() {
            addCriterion("CREATED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateEqualTo(Date value) {
            addCriterion("CREATED_DATE =", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotEqualTo(Date value) {
            addCriterion("CREATED_DATE <>", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThan(Date value) {
            addCriterion("CREATED_DATE >", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED_DATE >=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThan(Date value) {
            addCriterion("CREATED_DATE <", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATED_DATE <=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIn(List<Date> values) {
            addCriterion("CREATED_DATE in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotIn(List<Date> values) {
            addCriterion("CREATED_DATE not in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateBetween(Date value1, Date value2) {
            addCriterion("CREATED_DATE between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATED_DATE not between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedByUserLoginIsNull() {
            addCriterion("CREATED_BY_USER_LOGIN is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByUserLoginIsNotNull() {
            addCriterion("CREATED_BY_USER_LOGIN is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByUserLoginEqualTo(String value) {
            addCriterion("CREATED_BY_USER_LOGIN =", value, "createdByUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedByUserLoginNotEqualTo(String value) {
            addCriterion("CREATED_BY_USER_LOGIN <>", value, "createdByUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedByUserLoginGreaterThan(String value) {
            addCriterion("CREATED_BY_USER_LOGIN >", value, "createdByUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedByUserLoginGreaterThanOrEqualTo(String value) {
            addCriterion("CREATED_BY_USER_LOGIN >=", value, "createdByUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedByUserLoginLessThan(String value) {
            addCriterion("CREATED_BY_USER_LOGIN <", value, "createdByUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedByUserLoginLessThanOrEqualTo(String value) {
            addCriterion("CREATED_BY_USER_LOGIN <=", value, "createdByUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedByUserLoginLike(String value) {
            addCriterion("CREATED_BY_USER_LOGIN like", value, "createdByUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedByUserLoginNotLike(String value) {
            addCriterion("CREATED_BY_USER_LOGIN not like", value, "createdByUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedByUserLoginIn(List<String> values) {
            addCriterion("CREATED_BY_USER_LOGIN in", values, "createdByUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedByUserLoginNotIn(List<String> values) {
            addCriterion("CREATED_BY_USER_LOGIN not in", values, "createdByUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedByUserLoginBetween(String value1, String value2) {
            addCriterion("CREATED_BY_USER_LOGIN between", value1, value2, "createdByUserLogin");
            return (Criteria) this;
        }

        public Criteria andCreatedByUserLoginNotBetween(String value1, String value2) {
            addCriterion("CREATED_BY_USER_LOGIN not between", value1, value2, "createdByUserLogin");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateIsNull() {
            addCriterion("LAST_MODIFIED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateIsNotNull() {
            addCriterion("LAST_MODIFIED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateEqualTo(Date value) {
            addCriterion("LAST_MODIFIED_DATE =", value, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateNotEqualTo(Date value) {
            addCriterion("LAST_MODIFIED_DATE <>", value, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateGreaterThan(Date value) {
            addCriterion("LAST_MODIFIED_DATE >", value, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_MODIFIED_DATE >=", value, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateLessThan(Date value) {
            addCriterion("LAST_MODIFIED_DATE <", value, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateLessThanOrEqualTo(Date value) {
            addCriterion("LAST_MODIFIED_DATE <=", value, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateIn(List<Date> values) {
            addCriterion("LAST_MODIFIED_DATE in", values, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateNotIn(List<Date> values) {
            addCriterion("LAST_MODIFIED_DATE not in", values, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateBetween(Date value1, Date value2) {
            addCriterion("LAST_MODIFIED_DATE between", value1, value2, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateNotBetween(Date value1, Date value2) {
            addCriterion("LAST_MODIFIED_DATE not between", value1, value2, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByUserLoginIsNull() {
            addCriterion("LAST_MODIFIED_BY_USER_LOGIN is null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByUserLoginIsNotNull() {
            addCriterion("LAST_MODIFIED_BY_USER_LOGIN is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByUserLoginEqualTo(String value) {
            addCriterion("LAST_MODIFIED_BY_USER_LOGIN =", value, "lastModifiedByUserLogin");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByUserLoginNotEqualTo(String value) {
            addCriterion("LAST_MODIFIED_BY_USER_LOGIN <>", value, "lastModifiedByUserLogin");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByUserLoginGreaterThan(String value) {
            addCriterion("LAST_MODIFIED_BY_USER_LOGIN >", value, "lastModifiedByUserLogin");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByUserLoginGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_MODIFIED_BY_USER_LOGIN >=", value, "lastModifiedByUserLogin");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByUserLoginLessThan(String value) {
            addCriterion("LAST_MODIFIED_BY_USER_LOGIN <", value, "lastModifiedByUserLogin");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByUserLoginLessThanOrEqualTo(String value) {
            addCriterion("LAST_MODIFIED_BY_USER_LOGIN <=", value, "lastModifiedByUserLogin");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByUserLoginLike(String value) {
            addCriterion("LAST_MODIFIED_BY_USER_LOGIN like", value, "lastModifiedByUserLogin");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByUserLoginNotLike(String value) {
            addCriterion("LAST_MODIFIED_BY_USER_LOGIN not like", value, "lastModifiedByUserLogin");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByUserLoginIn(List<String> values) {
            addCriterion("LAST_MODIFIED_BY_USER_LOGIN in", values, "lastModifiedByUserLogin");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByUserLoginNotIn(List<String> values) {
            addCriterion("LAST_MODIFIED_BY_USER_LOGIN not in", values, "lastModifiedByUserLogin");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByUserLoginBetween(String value1, String value2) {
            addCriterion("LAST_MODIFIED_BY_USER_LOGIN between", value1, value2, "lastModifiedByUserLogin");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByUserLoginNotBetween(String value1, String value2) {
            addCriterion("LAST_MODIFIED_BY_USER_LOGIN not between", value1, value2, "lastModifiedByUserLogin");
            return (Criteria) this;
        }

        public Criteria andInShippingBoxIsNull() {
            addCriterion("IN_SHIPPING_BOX is null");
            return (Criteria) this;
        }

        public Criteria andInShippingBoxIsNotNull() {
            addCriterion("IN_SHIPPING_BOX is not null");
            return (Criteria) this;
        }

        public Criteria andInShippingBoxEqualTo(String value) {
            addCriterion("IN_SHIPPING_BOX =", value, "inShippingBox");
            return (Criteria) this;
        }

        public Criteria andInShippingBoxNotEqualTo(String value) {
            addCriterion("IN_SHIPPING_BOX <>", value, "inShippingBox");
            return (Criteria) this;
        }

        public Criteria andInShippingBoxGreaterThan(String value) {
            addCriterion("IN_SHIPPING_BOX >", value, "inShippingBox");
            return (Criteria) this;
        }

        public Criteria andInShippingBoxGreaterThanOrEqualTo(String value) {
            addCriterion("IN_SHIPPING_BOX >=", value, "inShippingBox");
            return (Criteria) this;
        }

        public Criteria andInShippingBoxLessThan(String value) {
            addCriterion("IN_SHIPPING_BOX <", value, "inShippingBox");
            return (Criteria) this;
        }

        public Criteria andInShippingBoxLessThanOrEqualTo(String value) {
            addCriterion("IN_SHIPPING_BOX <=", value, "inShippingBox");
            return (Criteria) this;
        }

        public Criteria andInShippingBoxLike(String value) {
            addCriterion("IN_SHIPPING_BOX like", value, "inShippingBox");
            return (Criteria) this;
        }

        public Criteria andInShippingBoxNotLike(String value) {
            addCriterion("IN_SHIPPING_BOX not like", value, "inShippingBox");
            return (Criteria) this;
        }

        public Criteria andInShippingBoxIn(List<String> values) {
            addCriterion("IN_SHIPPING_BOX in", values, "inShippingBox");
            return (Criteria) this;
        }

        public Criteria andInShippingBoxNotIn(List<String> values) {
            addCriterion("IN_SHIPPING_BOX not in", values, "inShippingBox");
            return (Criteria) this;
        }

        public Criteria andInShippingBoxBetween(String value1, String value2) {
            addCriterion("IN_SHIPPING_BOX between", value1, value2, "inShippingBox");
            return (Criteria) this;
        }

        public Criteria andInShippingBoxNotBetween(String value1, String value2) {
            addCriterion("IN_SHIPPING_BOX not between", value1, value2, "inShippingBox");
            return (Criteria) this;
        }

        public Criteria andDefaultShipmentBoxTypeIdIsNull() {
            addCriterion("DEFAULT_SHIPMENT_BOX_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andDefaultShipmentBoxTypeIdIsNotNull() {
            addCriterion("DEFAULT_SHIPMENT_BOX_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultShipmentBoxTypeIdEqualTo(String value) {
            addCriterion("DEFAULT_SHIPMENT_BOX_TYPE_ID =", value, "defaultShipmentBoxTypeId");
            return (Criteria) this;
        }

        public Criteria andDefaultShipmentBoxTypeIdNotEqualTo(String value) {
            addCriterion("DEFAULT_SHIPMENT_BOX_TYPE_ID <>", value, "defaultShipmentBoxTypeId");
            return (Criteria) this;
        }

        public Criteria andDefaultShipmentBoxTypeIdGreaterThan(String value) {
            addCriterion("DEFAULT_SHIPMENT_BOX_TYPE_ID >", value, "defaultShipmentBoxTypeId");
            return (Criteria) this;
        }

        public Criteria andDefaultShipmentBoxTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEFAULT_SHIPMENT_BOX_TYPE_ID >=", value, "defaultShipmentBoxTypeId");
            return (Criteria) this;
        }

        public Criteria andDefaultShipmentBoxTypeIdLessThan(String value) {
            addCriterion("DEFAULT_SHIPMENT_BOX_TYPE_ID <", value, "defaultShipmentBoxTypeId");
            return (Criteria) this;
        }

        public Criteria andDefaultShipmentBoxTypeIdLessThanOrEqualTo(String value) {
            addCriterion("DEFAULT_SHIPMENT_BOX_TYPE_ID <=", value, "defaultShipmentBoxTypeId");
            return (Criteria) this;
        }

        public Criteria andDefaultShipmentBoxTypeIdLike(String value) {
            addCriterion("DEFAULT_SHIPMENT_BOX_TYPE_ID like", value, "defaultShipmentBoxTypeId");
            return (Criteria) this;
        }

        public Criteria andDefaultShipmentBoxTypeIdNotLike(String value) {
            addCriterion("DEFAULT_SHIPMENT_BOX_TYPE_ID not like", value, "defaultShipmentBoxTypeId");
            return (Criteria) this;
        }

        public Criteria andDefaultShipmentBoxTypeIdIn(List<String> values) {
            addCriterion("DEFAULT_SHIPMENT_BOX_TYPE_ID in", values, "defaultShipmentBoxTypeId");
            return (Criteria) this;
        }

        public Criteria andDefaultShipmentBoxTypeIdNotIn(List<String> values) {
            addCriterion("DEFAULT_SHIPMENT_BOX_TYPE_ID not in", values, "defaultShipmentBoxTypeId");
            return (Criteria) this;
        }

        public Criteria andDefaultShipmentBoxTypeIdBetween(String value1, String value2) {
            addCriterion("DEFAULT_SHIPMENT_BOX_TYPE_ID between", value1, value2, "defaultShipmentBoxTypeId");
            return (Criteria) this;
        }

        public Criteria andDefaultShipmentBoxTypeIdNotBetween(String value1, String value2) {
            addCriterion("DEFAULT_SHIPMENT_BOX_TYPE_ID not between", value1, value2, "defaultShipmentBoxTypeId");
            return (Criteria) this;
        }

        public Criteria andLotIdFilledInIsNull() {
            addCriterion("LOT_ID_FILLED_IN is null");
            return (Criteria) this;
        }

        public Criteria andLotIdFilledInIsNotNull() {
            addCriterion("LOT_ID_FILLED_IN is not null");
            return (Criteria) this;
        }

        public Criteria andLotIdFilledInEqualTo(String value) {
            addCriterion("LOT_ID_FILLED_IN =", value, "lotIdFilledIn");
            return (Criteria) this;
        }

        public Criteria andLotIdFilledInNotEqualTo(String value) {
            addCriterion("LOT_ID_FILLED_IN <>", value, "lotIdFilledIn");
            return (Criteria) this;
        }

        public Criteria andLotIdFilledInGreaterThan(String value) {
            addCriterion("LOT_ID_FILLED_IN >", value, "lotIdFilledIn");
            return (Criteria) this;
        }

        public Criteria andLotIdFilledInGreaterThanOrEqualTo(String value) {
            addCriterion("LOT_ID_FILLED_IN >=", value, "lotIdFilledIn");
            return (Criteria) this;
        }

        public Criteria andLotIdFilledInLessThan(String value) {
            addCriterion("LOT_ID_FILLED_IN <", value, "lotIdFilledIn");
            return (Criteria) this;
        }

        public Criteria andLotIdFilledInLessThanOrEqualTo(String value) {
            addCriterion("LOT_ID_FILLED_IN <=", value, "lotIdFilledIn");
            return (Criteria) this;
        }

        public Criteria andLotIdFilledInLike(String value) {
            addCriterion("LOT_ID_FILLED_IN like", value, "lotIdFilledIn");
            return (Criteria) this;
        }

        public Criteria andLotIdFilledInNotLike(String value) {
            addCriterion("LOT_ID_FILLED_IN not like", value, "lotIdFilledIn");
            return (Criteria) this;
        }

        public Criteria andLotIdFilledInIn(List<String> values) {
            addCriterion("LOT_ID_FILLED_IN in", values, "lotIdFilledIn");
            return (Criteria) this;
        }

        public Criteria andLotIdFilledInNotIn(List<String> values) {
            addCriterion("LOT_ID_FILLED_IN not in", values, "lotIdFilledIn");
            return (Criteria) this;
        }

        public Criteria andLotIdFilledInBetween(String value1, String value2) {
            addCriterion("LOT_ID_FILLED_IN between", value1, value2, "lotIdFilledIn");
            return (Criteria) this;
        }

        public Criteria andLotIdFilledInNotBetween(String value1, String value2) {
            addCriterion("LOT_ID_FILLED_IN not between", value1, value2, "lotIdFilledIn");
            return (Criteria) this;
        }

        public Criteria andOrderDecimalQuantityIsNull() {
            addCriterion("ORDER_DECIMAL_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andOrderDecimalQuantityIsNotNull() {
            addCriterion("ORDER_DECIMAL_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDecimalQuantityEqualTo(String value) {
            addCriterion("ORDER_DECIMAL_QUANTITY =", value, "orderDecimalQuantity");
            return (Criteria) this;
        }

        public Criteria andOrderDecimalQuantityNotEqualTo(String value) {
            addCriterion("ORDER_DECIMAL_QUANTITY <>", value, "orderDecimalQuantity");
            return (Criteria) this;
        }

        public Criteria andOrderDecimalQuantityGreaterThan(String value) {
            addCriterion("ORDER_DECIMAL_QUANTITY >", value, "orderDecimalQuantity");
            return (Criteria) this;
        }

        public Criteria andOrderDecimalQuantityGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_DECIMAL_QUANTITY >=", value, "orderDecimalQuantity");
            return (Criteria) this;
        }

        public Criteria andOrderDecimalQuantityLessThan(String value) {
            addCriterion("ORDER_DECIMAL_QUANTITY <", value, "orderDecimalQuantity");
            return (Criteria) this;
        }

        public Criteria andOrderDecimalQuantityLessThanOrEqualTo(String value) {
            addCriterion("ORDER_DECIMAL_QUANTITY <=", value, "orderDecimalQuantity");
            return (Criteria) this;
        }

        public Criteria andOrderDecimalQuantityLike(String value) {
            addCriterion("ORDER_DECIMAL_QUANTITY like", value, "orderDecimalQuantity");
            return (Criteria) this;
        }

        public Criteria andOrderDecimalQuantityNotLike(String value) {
            addCriterion("ORDER_DECIMAL_QUANTITY not like", value, "orderDecimalQuantity");
            return (Criteria) this;
        }

        public Criteria andOrderDecimalQuantityIn(List<String> values) {
            addCriterion("ORDER_DECIMAL_QUANTITY in", values, "orderDecimalQuantity");
            return (Criteria) this;
        }

        public Criteria andOrderDecimalQuantityNotIn(List<String> values) {
            addCriterion("ORDER_DECIMAL_QUANTITY not in", values, "orderDecimalQuantity");
            return (Criteria) this;
        }

        public Criteria andOrderDecimalQuantityBetween(String value1, String value2) {
            addCriterion("ORDER_DECIMAL_QUANTITY between", value1, value2, "orderDecimalQuantity");
            return (Criteria) this;
        }

        public Criteria andOrderDecimalQuantityNotBetween(String value1, String value2) {
            addCriterion("ORDER_DECIMAL_QUANTITY not between", value1, value2, "orderDecimalQuantity");
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