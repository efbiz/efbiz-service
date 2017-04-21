package org.efbiz.product.store.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductStoreShipmentMethExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public ProductStoreShipmentMethExample() {
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

        public Criteria andProductStoreShipMethIdIsNull() {
            addCriterion("PRODUCT_STORE_SHIP_METH_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductStoreShipMethIdIsNotNull() {
            addCriterion("PRODUCT_STORE_SHIP_METH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductStoreShipMethIdEqualTo(String value) {
            addCriterion("PRODUCT_STORE_SHIP_METH_ID =", value, "productStoreShipMethId");
            return (Criteria) this;
        }

        public Criteria andProductStoreShipMethIdNotEqualTo(String value) {
            addCriterion("PRODUCT_STORE_SHIP_METH_ID <>", value, "productStoreShipMethId");
            return (Criteria) this;
        }

        public Criteria andProductStoreShipMethIdGreaterThan(String value) {
            addCriterion("PRODUCT_STORE_SHIP_METH_ID >", value, "productStoreShipMethId");
            return (Criteria) this;
        }

        public Criteria andProductStoreShipMethIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_STORE_SHIP_METH_ID >=", value, "productStoreShipMethId");
            return (Criteria) this;
        }

        public Criteria andProductStoreShipMethIdLessThan(String value) {
            addCriterion("PRODUCT_STORE_SHIP_METH_ID <", value, "productStoreShipMethId");
            return (Criteria) this;
        }

        public Criteria andProductStoreShipMethIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_STORE_SHIP_METH_ID <=", value, "productStoreShipMethId");
            return (Criteria) this;
        }

        public Criteria andProductStoreShipMethIdLike(String value) {
            addCriterion("PRODUCT_STORE_SHIP_METH_ID like", value, "productStoreShipMethId");
            return (Criteria) this;
        }

        public Criteria andProductStoreShipMethIdNotLike(String value) {
            addCriterion("PRODUCT_STORE_SHIP_METH_ID not like", value, "productStoreShipMethId");
            return (Criteria) this;
        }

        public Criteria andProductStoreShipMethIdIn(List<String> values) {
            addCriterion("PRODUCT_STORE_SHIP_METH_ID in", values, "productStoreShipMethId");
            return (Criteria) this;
        }

        public Criteria andProductStoreShipMethIdNotIn(List<String> values) {
            addCriterion("PRODUCT_STORE_SHIP_METH_ID not in", values, "productStoreShipMethId");
            return (Criteria) this;
        }

        public Criteria andProductStoreShipMethIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_STORE_SHIP_METH_ID between", value1, value2, "productStoreShipMethId");
            return (Criteria) this;
        }

        public Criteria andProductStoreShipMethIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_STORE_SHIP_METH_ID not between", value1, value2, "productStoreShipMethId");
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

        public Criteria andShipmentMethodTypeIdIsNull() {
            addCriterion("SHIPMENT_METHOD_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andShipmentMethodTypeIdIsNotNull() {
            addCriterion("SHIPMENT_METHOD_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andShipmentMethodTypeIdEqualTo(String value) {
            addCriterion("SHIPMENT_METHOD_TYPE_ID =", value, "shipmentMethodTypeId");
            return (Criteria) this;
        }

        public Criteria andShipmentMethodTypeIdNotEqualTo(String value) {
            addCriterion("SHIPMENT_METHOD_TYPE_ID <>", value, "shipmentMethodTypeId");
            return (Criteria) this;
        }

        public Criteria andShipmentMethodTypeIdGreaterThan(String value) {
            addCriterion("SHIPMENT_METHOD_TYPE_ID >", value, "shipmentMethodTypeId");
            return (Criteria) this;
        }

        public Criteria andShipmentMethodTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("SHIPMENT_METHOD_TYPE_ID >=", value, "shipmentMethodTypeId");
            return (Criteria) this;
        }

        public Criteria andShipmentMethodTypeIdLessThan(String value) {
            addCriterion("SHIPMENT_METHOD_TYPE_ID <", value, "shipmentMethodTypeId");
            return (Criteria) this;
        }

        public Criteria andShipmentMethodTypeIdLessThanOrEqualTo(String value) {
            addCriterion("SHIPMENT_METHOD_TYPE_ID <=", value, "shipmentMethodTypeId");
            return (Criteria) this;
        }

        public Criteria andShipmentMethodTypeIdLike(String value) {
            addCriterion("SHIPMENT_METHOD_TYPE_ID like", value, "shipmentMethodTypeId");
            return (Criteria) this;
        }

        public Criteria andShipmentMethodTypeIdNotLike(String value) {
            addCriterion("SHIPMENT_METHOD_TYPE_ID not like", value, "shipmentMethodTypeId");
            return (Criteria) this;
        }

        public Criteria andShipmentMethodTypeIdIn(List<String> values) {
            addCriterion("SHIPMENT_METHOD_TYPE_ID in", values, "shipmentMethodTypeId");
            return (Criteria) this;
        }

        public Criteria andShipmentMethodTypeIdNotIn(List<String> values) {
            addCriterion("SHIPMENT_METHOD_TYPE_ID not in", values, "shipmentMethodTypeId");
            return (Criteria) this;
        }

        public Criteria andShipmentMethodTypeIdBetween(String value1, String value2) {
            addCriterion("SHIPMENT_METHOD_TYPE_ID between", value1, value2, "shipmentMethodTypeId");
            return (Criteria) this;
        }

        public Criteria andShipmentMethodTypeIdNotBetween(String value1, String value2) {
            addCriterion("SHIPMENT_METHOD_TYPE_ID not between", value1, value2, "shipmentMethodTypeId");
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

        public Criteria andRoleTypeIdIsNull() {
            addCriterion("ROLE_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andRoleTypeIdIsNotNull() {
            addCriterion("ROLE_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRoleTypeIdEqualTo(String value) {
            addCriterion("ROLE_TYPE_ID =", value, "roleTypeId");
            return (Criteria) this;
        }

        public Criteria andRoleTypeIdNotEqualTo(String value) {
            addCriterion("ROLE_TYPE_ID <>", value, "roleTypeId");
            return (Criteria) this;
        }

        public Criteria andRoleTypeIdGreaterThan(String value) {
            addCriterion("ROLE_TYPE_ID >", value, "roleTypeId");
            return (Criteria) this;
        }

        public Criteria andRoleTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE_TYPE_ID >=", value, "roleTypeId");
            return (Criteria) this;
        }

        public Criteria andRoleTypeIdLessThan(String value) {
            addCriterion("ROLE_TYPE_ID <", value, "roleTypeId");
            return (Criteria) this;
        }

        public Criteria andRoleTypeIdLessThanOrEqualTo(String value) {
            addCriterion("ROLE_TYPE_ID <=", value, "roleTypeId");
            return (Criteria) this;
        }

        public Criteria andRoleTypeIdLike(String value) {
            addCriterion("ROLE_TYPE_ID like", value, "roleTypeId");
            return (Criteria) this;
        }

        public Criteria andRoleTypeIdNotLike(String value) {
            addCriterion("ROLE_TYPE_ID not like", value, "roleTypeId");
            return (Criteria) this;
        }

        public Criteria andRoleTypeIdIn(List<String> values) {
            addCriterion("ROLE_TYPE_ID in", values, "roleTypeId");
            return (Criteria) this;
        }

        public Criteria andRoleTypeIdNotIn(List<String> values) {
            addCriterion("ROLE_TYPE_ID not in", values, "roleTypeId");
            return (Criteria) this;
        }

        public Criteria andRoleTypeIdBetween(String value1, String value2) {
            addCriterion("ROLE_TYPE_ID between", value1, value2, "roleTypeId");
            return (Criteria) this;
        }

        public Criteria andRoleTypeIdNotBetween(String value1, String value2) {
            addCriterion("ROLE_TYPE_ID not between", value1, value2, "roleTypeId");
            return (Criteria) this;
        }

        public Criteria andCompanyPartyIdIsNull() {
            addCriterion("COMPANY_PARTY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCompanyPartyIdIsNotNull() {
            addCriterion("COMPANY_PARTY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyPartyIdEqualTo(String value) {
            addCriterion("COMPANY_PARTY_ID =", value, "companyPartyId");
            return (Criteria) this;
        }

        public Criteria andCompanyPartyIdNotEqualTo(String value) {
            addCriterion("COMPANY_PARTY_ID <>", value, "companyPartyId");
            return (Criteria) this;
        }

        public Criteria andCompanyPartyIdGreaterThan(String value) {
            addCriterion("COMPANY_PARTY_ID >", value, "companyPartyId");
            return (Criteria) this;
        }

        public Criteria andCompanyPartyIdGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_PARTY_ID >=", value, "companyPartyId");
            return (Criteria) this;
        }

        public Criteria andCompanyPartyIdLessThan(String value) {
            addCriterion("COMPANY_PARTY_ID <", value, "companyPartyId");
            return (Criteria) this;
        }

        public Criteria andCompanyPartyIdLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_PARTY_ID <=", value, "companyPartyId");
            return (Criteria) this;
        }

        public Criteria andCompanyPartyIdLike(String value) {
            addCriterion("COMPANY_PARTY_ID like", value, "companyPartyId");
            return (Criteria) this;
        }

        public Criteria andCompanyPartyIdNotLike(String value) {
            addCriterion("COMPANY_PARTY_ID not like", value, "companyPartyId");
            return (Criteria) this;
        }

        public Criteria andCompanyPartyIdIn(List<String> values) {
            addCriterion("COMPANY_PARTY_ID in", values, "companyPartyId");
            return (Criteria) this;
        }

        public Criteria andCompanyPartyIdNotIn(List<String> values) {
            addCriterion("COMPANY_PARTY_ID not in", values, "companyPartyId");
            return (Criteria) this;
        }

        public Criteria andCompanyPartyIdBetween(String value1, String value2) {
            addCriterion("COMPANY_PARTY_ID between", value1, value2, "companyPartyId");
            return (Criteria) this;
        }

        public Criteria andCompanyPartyIdNotBetween(String value1, String value2) {
            addCriterion("COMPANY_PARTY_ID not between", value1, value2, "companyPartyId");
            return (Criteria) this;
        }

        public Criteria andMinWeightIsNull() {
            addCriterion("MIN_WEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andMinWeightIsNotNull() {
            addCriterion("MIN_WEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andMinWeightEqualTo(BigDecimal value) {
            addCriterion("MIN_WEIGHT =", value, "minWeight");
            return (Criteria) this;
        }

        public Criteria andMinWeightNotEqualTo(BigDecimal value) {
            addCriterion("MIN_WEIGHT <>", value, "minWeight");
            return (Criteria) this;
        }

        public Criteria andMinWeightGreaterThan(BigDecimal value) {
            addCriterion("MIN_WEIGHT >", value, "minWeight");
            return (Criteria) this;
        }

        public Criteria andMinWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MIN_WEIGHT >=", value, "minWeight");
            return (Criteria) this;
        }

        public Criteria andMinWeightLessThan(BigDecimal value) {
            addCriterion("MIN_WEIGHT <", value, "minWeight");
            return (Criteria) this;
        }

        public Criteria andMinWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MIN_WEIGHT <=", value, "minWeight");
            return (Criteria) this;
        }

        public Criteria andMinWeightIn(List<BigDecimal> values) {
            addCriterion("MIN_WEIGHT in", values, "minWeight");
            return (Criteria) this;
        }

        public Criteria andMinWeightNotIn(List<BigDecimal> values) {
            addCriterion("MIN_WEIGHT not in", values, "minWeight");
            return (Criteria) this;
        }

        public Criteria andMinWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MIN_WEIGHT between", value1, value2, "minWeight");
            return (Criteria) this;
        }

        public Criteria andMinWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MIN_WEIGHT not between", value1, value2, "minWeight");
            return (Criteria) this;
        }

        public Criteria andMaxWeightIsNull() {
            addCriterion("MAX_WEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andMaxWeightIsNotNull() {
            addCriterion("MAX_WEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andMaxWeightEqualTo(BigDecimal value) {
            addCriterion("MAX_WEIGHT =", value, "maxWeight");
            return (Criteria) this;
        }

        public Criteria andMaxWeightNotEqualTo(BigDecimal value) {
            addCriterion("MAX_WEIGHT <>", value, "maxWeight");
            return (Criteria) this;
        }

        public Criteria andMaxWeightGreaterThan(BigDecimal value) {
            addCriterion("MAX_WEIGHT >", value, "maxWeight");
            return (Criteria) this;
        }

        public Criteria andMaxWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MAX_WEIGHT >=", value, "maxWeight");
            return (Criteria) this;
        }

        public Criteria andMaxWeightLessThan(BigDecimal value) {
            addCriterion("MAX_WEIGHT <", value, "maxWeight");
            return (Criteria) this;
        }

        public Criteria andMaxWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MAX_WEIGHT <=", value, "maxWeight");
            return (Criteria) this;
        }

        public Criteria andMaxWeightIn(List<BigDecimal> values) {
            addCriterion("MAX_WEIGHT in", values, "maxWeight");
            return (Criteria) this;
        }

        public Criteria andMaxWeightNotIn(List<BigDecimal> values) {
            addCriterion("MAX_WEIGHT not in", values, "maxWeight");
            return (Criteria) this;
        }

        public Criteria andMaxWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAX_WEIGHT between", value1, value2, "maxWeight");
            return (Criteria) this;
        }

        public Criteria andMaxWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAX_WEIGHT not between", value1, value2, "maxWeight");
            return (Criteria) this;
        }

        public Criteria andMinSizeIsNull() {
            addCriterion("MIN_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andMinSizeIsNotNull() {
            addCriterion("MIN_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andMinSizeEqualTo(BigDecimal value) {
            addCriterion("MIN_SIZE =", value, "minSize");
            return (Criteria) this;
        }

        public Criteria andMinSizeNotEqualTo(BigDecimal value) {
            addCriterion("MIN_SIZE <>", value, "minSize");
            return (Criteria) this;
        }

        public Criteria andMinSizeGreaterThan(BigDecimal value) {
            addCriterion("MIN_SIZE >", value, "minSize");
            return (Criteria) this;
        }

        public Criteria andMinSizeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MIN_SIZE >=", value, "minSize");
            return (Criteria) this;
        }

        public Criteria andMinSizeLessThan(BigDecimal value) {
            addCriterion("MIN_SIZE <", value, "minSize");
            return (Criteria) this;
        }

        public Criteria andMinSizeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MIN_SIZE <=", value, "minSize");
            return (Criteria) this;
        }

        public Criteria andMinSizeIn(List<BigDecimal> values) {
            addCriterion("MIN_SIZE in", values, "minSize");
            return (Criteria) this;
        }

        public Criteria andMinSizeNotIn(List<BigDecimal> values) {
            addCriterion("MIN_SIZE not in", values, "minSize");
            return (Criteria) this;
        }

        public Criteria andMinSizeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MIN_SIZE between", value1, value2, "minSize");
            return (Criteria) this;
        }

        public Criteria andMinSizeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MIN_SIZE not between", value1, value2, "minSize");
            return (Criteria) this;
        }

        public Criteria andMaxSizeIsNull() {
            addCriterion("MAX_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andMaxSizeIsNotNull() {
            addCriterion("MAX_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andMaxSizeEqualTo(BigDecimal value) {
            addCriterion("MAX_SIZE =", value, "maxSize");
            return (Criteria) this;
        }

        public Criteria andMaxSizeNotEqualTo(BigDecimal value) {
            addCriterion("MAX_SIZE <>", value, "maxSize");
            return (Criteria) this;
        }

        public Criteria andMaxSizeGreaterThan(BigDecimal value) {
            addCriterion("MAX_SIZE >", value, "maxSize");
            return (Criteria) this;
        }

        public Criteria andMaxSizeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MAX_SIZE >=", value, "maxSize");
            return (Criteria) this;
        }

        public Criteria andMaxSizeLessThan(BigDecimal value) {
            addCriterion("MAX_SIZE <", value, "maxSize");
            return (Criteria) this;
        }

        public Criteria andMaxSizeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MAX_SIZE <=", value, "maxSize");
            return (Criteria) this;
        }

        public Criteria andMaxSizeIn(List<BigDecimal> values) {
            addCriterion("MAX_SIZE in", values, "maxSize");
            return (Criteria) this;
        }

        public Criteria andMaxSizeNotIn(List<BigDecimal> values) {
            addCriterion("MAX_SIZE not in", values, "maxSize");
            return (Criteria) this;
        }

        public Criteria andMaxSizeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAX_SIZE between", value1, value2, "maxSize");
            return (Criteria) this;
        }

        public Criteria andMaxSizeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAX_SIZE not between", value1, value2, "maxSize");
            return (Criteria) this;
        }

        public Criteria andMinTotalIsNull() {
            addCriterion("MIN_TOTAL is null");
            return (Criteria) this;
        }

        public Criteria andMinTotalIsNotNull() {
            addCriterion("MIN_TOTAL is not null");
            return (Criteria) this;
        }

        public Criteria andMinTotalEqualTo(BigDecimal value) {
            addCriterion("MIN_TOTAL =", value, "minTotal");
            return (Criteria) this;
        }

        public Criteria andMinTotalNotEqualTo(BigDecimal value) {
            addCriterion("MIN_TOTAL <>", value, "minTotal");
            return (Criteria) this;
        }

        public Criteria andMinTotalGreaterThan(BigDecimal value) {
            addCriterion("MIN_TOTAL >", value, "minTotal");
            return (Criteria) this;
        }

        public Criteria andMinTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MIN_TOTAL >=", value, "minTotal");
            return (Criteria) this;
        }

        public Criteria andMinTotalLessThan(BigDecimal value) {
            addCriterion("MIN_TOTAL <", value, "minTotal");
            return (Criteria) this;
        }

        public Criteria andMinTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MIN_TOTAL <=", value, "minTotal");
            return (Criteria) this;
        }

        public Criteria andMinTotalIn(List<BigDecimal> values) {
            addCriterion("MIN_TOTAL in", values, "minTotal");
            return (Criteria) this;
        }

        public Criteria andMinTotalNotIn(List<BigDecimal> values) {
            addCriterion("MIN_TOTAL not in", values, "minTotal");
            return (Criteria) this;
        }

        public Criteria andMinTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MIN_TOTAL between", value1, value2, "minTotal");
            return (Criteria) this;
        }

        public Criteria andMinTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MIN_TOTAL not between", value1, value2, "minTotal");
            return (Criteria) this;
        }

        public Criteria andMaxTotalIsNull() {
            addCriterion("MAX_TOTAL is null");
            return (Criteria) this;
        }

        public Criteria andMaxTotalIsNotNull() {
            addCriterion("MAX_TOTAL is not null");
            return (Criteria) this;
        }

        public Criteria andMaxTotalEqualTo(BigDecimal value) {
            addCriterion("MAX_TOTAL =", value, "maxTotal");
            return (Criteria) this;
        }

        public Criteria andMaxTotalNotEqualTo(BigDecimal value) {
            addCriterion("MAX_TOTAL <>", value, "maxTotal");
            return (Criteria) this;
        }

        public Criteria andMaxTotalGreaterThan(BigDecimal value) {
            addCriterion("MAX_TOTAL >", value, "maxTotal");
            return (Criteria) this;
        }

        public Criteria andMaxTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MAX_TOTAL >=", value, "maxTotal");
            return (Criteria) this;
        }

        public Criteria andMaxTotalLessThan(BigDecimal value) {
            addCriterion("MAX_TOTAL <", value, "maxTotal");
            return (Criteria) this;
        }

        public Criteria andMaxTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MAX_TOTAL <=", value, "maxTotal");
            return (Criteria) this;
        }

        public Criteria andMaxTotalIn(List<BigDecimal> values) {
            addCriterion("MAX_TOTAL in", values, "maxTotal");
            return (Criteria) this;
        }

        public Criteria andMaxTotalNotIn(List<BigDecimal> values) {
            addCriterion("MAX_TOTAL not in", values, "maxTotal");
            return (Criteria) this;
        }

        public Criteria andMaxTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAX_TOTAL between", value1, value2, "maxTotal");
            return (Criteria) this;
        }

        public Criteria andMaxTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAX_TOTAL not between", value1, value2, "maxTotal");
            return (Criteria) this;
        }

        public Criteria andAllowUspsAddrIsNull() {
            addCriterion("ALLOW_USPS_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andAllowUspsAddrIsNotNull() {
            addCriterion("ALLOW_USPS_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andAllowUspsAddrEqualTo(String value) {
            addCriterion("ALLOW_USPS_ADDR =", value, "allowUspsAddr");
            return (Criteria) this;
        }

        public Criteria andAllowUspsAddrNotEqualTo(String value) {
            addCriterion("ALLOW_USPS_ADDR <>", value, "allowUspsAddr");
            return (Criteria) this;
        }

        public Criteria andAllowUspsAddrGreaterThan(String value) {
            addCriterion("ALLOW_USPS_ADDR >", value, "allowUspsAddr");
            return (Criteria) this;
        }

        public Criteria andAllowUspsAddrGreaterThanOrEqualTo(String value) {
            addCriterion("ALLOW_USPS_ADDR >=", value, "allowUspsAddr");
            return (Criteria) this;
        }

        public Criteria andAllowUspsAddrLessThan(String value) {
            addCriterion("ALLOW_USPS_ADDR <", value, "allowUspsAddr");
            return (Criteria) this;
        }

        public Criteria andAllowUspsAddrLessThanOrEqualTo(String value) {
            addCriterion("ALLOW_USPS_ADDR <=", value, "allowUspsAddr");
            return (Criteria) this;
        }

        public Criteria andAllowUspsAddrLike(String value) {
            addCriterion("ALLOW_USPS_ADDR like", value, "allowUspsAddr");
            return (Criteria) this;
        }

        public Criteria andAllowUspsAddrNotLike(String value) {
            addCriterion("ALLOW_USPS_ADDR not like", value, "allowUspsAddr");
            return (Criteria) this;
        }

        public Criteria andAllowUspsAddrIn(List<String> values) {
            addCriterion("ALLOW_USPS_ADDR in", values, "allowUspsAddr");
            return (Criteria) this;
        }

        public Criteria andAllowUspsAddrNotIn(List<String> values) {
            addCriterion("ALLOW_USPS_ADDR not in", values, "allowUspsAddr");
            return (Criteria) this;
        }

        public Criteria andAllowUspsAddrBetween(String value1, String value2) {
            addCriterion("ALLOW_USPS_ADDR between", value1, value2, "allowUspsAddr");
            return (Criteria) this;
        }

        public Criteria andAllowUspsAddrNotBetween(String value1, String value2) {
            addCriterion("ALLOW_USPS_ADDR not between", value1, value2, "allowUspsAddr");
            return (Criteria) this;
        }

        public Criteria andRequireUspsAddrIsNull() {
            addCriterion("REQUIRE_USPS_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andRequireUspsAddrIsNotNull() {
            addCriterion("REQUIRE_USPS_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andRequireUspsAddrEqualTo(String value) {
            addCriterion("REQUIRE_USPS_ADDR =", value, "requireUspsAddr");
            return (Criteria) this;
        }

        public Criteria andRequireUspsAddrNotEqualTo(String value) {
            addCriterion("REQUIRE_USPS_ADDR <>", value, "requireUspsAddr");
            return (Criteria) this;
        }

        public Criteria andRequireUspsAddrGreaterThan(String value) {
            addCriterion("REQUIRE_USPS_ADDR >", value, "requireUspsAddr");
            return (Criteria) this;
        }

        public Criteria andRequireUspsAddrGreaterThanOrEqualTo(String value) {
            addCriterion("REQUIRE_USPS_ADDR >=", value, "requireUspsAddr");
            return (Criteria) this;
        }

        public Criteria andRequireUspsAddrLessThan(String value) {
            addCriterion("REQUIRE_USPS_ADDR <", value, "requireUspsAddr");
            return (Criteria) this;
        }

        public Criteria andRequireUspsAddrLessThanOrEqualTo(String value) {
            addCriterion("REQUIRE_USPS_ADDR <=", value, "requireUspsAddr");
            return (Criteria) this;
        }

        public Criteria andRequireUspsAddrLike(String value) {
            addCriterion("REQUIRE_USPS_ADDR like", value, "requireUspsAddr");
            return (Criteria) this;
        }

        public Criteria andRequireUspsAddrNotLike(String value) {
            addCriterion("REQUIRE_USPS_ADDR not like", value, "requireUspsAddr");
            return (Criteria) this;
        }

        public Criteria andRequireUspsAddrIn(List<String> values) {
            addCriterion("REQUIRE_USPS_ADDR in", values, "requireUspsAddr");
            return (Criteria) this;
        }

        public Criteria andRequireUspsAddrNotIn(List<String> values) {
            addCriterion("REQUIRE_USPS_ADDR not in", values, "requireUspsAddr");
            return (Criteria) this;
        }

        public Criteria andRequireUspsAddrBetween(String value1, String value2) {
            addCriterion("REQUIRE_USPS_ADDR between", value1, value2, "requireUspsAddr");
            return (Criteria) this;
        }

        public Criteria andRequireUspsAddrNotBetween(String value1, String value2) {
            addCriterion("REQUIRE_USPS_ADDR not between", value1, value2, "requireUspsAddr");
            return (Criteria) this;
        }

        public Criteria andAllowCompanyAddrIsNull() {
            addCriterion("ALLOW_COMPANY_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andAllowCompanyAddrIsNotNull() {
            addCriterion("ALLOW_COMPANY_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andAllowCompanyAddrEqualTo(String value) {
            addCriterion("ALLOW_COMPANY_ADDR =", value, "allowCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andAllowCompanyAddrNotEqualTo(String value) {
            addCriterion("ALLOW_COMPANY_ADDR <>", value, "allowCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andAllowCompanyAddrGreaterThan(String value) {
            addCriterion("ALLOW_COMPANY_ADDR >", value, "allowCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andAllowCompanyAddrGreaterThanOrEqualTo(String value) {
            addCriterion("ALLOW_COMPANY_ADDR >=", value, "allowCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andAllowCompanyAddrLessThan(String value) {
            addCriterion("ALLOW_COMPANY_ADDR <", value, "allowCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andAllowCompanyAddrLessThanOrEqualTo(String value) {
            addCriterion("ALLOW_COMPANY_ADDR <=", value, "allowCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andAllowCompanyAddrLike(String value) {
            addCriterion("ALLOW_COMPANY_ADDR like", value, "allowCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andAllowCompanyAddrNotLike(String value) {
            addCriterion("ALLOW_COMPANY_ADDR not like", value, "allowCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andAllowCompanyAddrIn(List<String> values) {
            addCriterion("ALLOW_COMPANY_ADDR in", values, "allowCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andAllowCompanyAddrNotIn(List<String> values) {
            addCriterion("ALLOW_COMPANY_ADDR not in", values, "allowCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andAllowCompanyAddrBetween(String value1, String value2) {
            addCriterion("ALLOW_COMPANY_ADDR between", value1, value2, "allowCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andAllowCompanyAddrNotBetween(String value1, String value2) {
            addCriterion("ALLOW_COMPANY_ADDR not between", value1, value2, "allowCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andRequireCompanyAddrIsNull() {
            addCriterion("REQUIRE_COMPANY_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andRequireCompanyAddrIsNotNull() {
            addCriterion("REQUIRE_COMPANY_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andRequireCompanyAddrEqualTo(String value) {
            addCriterion("REQUIRE_COMPANY_ADDR =", value, "requireCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andRequireCompanyAddrNotEqualTo(String value) {
            addCriterion("REQUIRE_COMPANY_ADDR <>", value, "requireCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andRequireCompanyAddrGreaterThan(String value) {
            addCriterion("REQUIRE_COMPANY_ADDR >", value, "requireCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andRequireCompanyAddrGreaterThanOrEqualTo(String value) {
            addCriterion("REQUIRE_COMPANY_ADDR >=", value, "requireCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andRequireCompanyAddrLessThan(String value) {
            addCriterion("REQUIRE_COMPANY_ADDR <", value, "requireCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andRequireCompanyAddrLessThanOrEqualTo(String value) {
            addCriterion("REQUIRE_COMPANY_ADDR <=", value, "requireCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andRequireCompanyAddrLike(String value) {
            addCriterion("REQUIRE_COMPANY_ADDR like", value, "requireCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andRequireCompanyAddrNotLike(String value) {
            addCriterion("REQUIRE_COMPANY_ADDR not like", value, "requireCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andRequireCompanyAddrIn(List<String> values) {
            addCriterion("REQUIRE_COMPANY_ADDR in", values, "requireCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andRequireCompanyAddrNotIn(List<String> values) {
            addCriterion("REQUIRE_COMPANY_ADDR not in", values, "requireCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andRequireCompanyAddrBetween(String value1, String value2) {
            addCriterion("REQUIRE_COMPANY_ADDR between", value1, value2, "requireCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andRequireCompanyAddrNotBetween(String value1, String value2) {
            addCriterion("REQUIRE_COMPANY_ADDR not between", value1, value2, "requireCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andIncludeNoChargeItemsIsNull() {
            addCriterion("INCLUDE_NO_CHARGE_ITEMS is null");
            return (Criteria) this;
        }

        public Criteria andIncludeNoChargeItemsIsNotNull() {
            addCriterion("INCLUDE_NO_CHARGE_ITEMS is not null");
            return (Criteria) this;
        }

        public Criteria andIncludeNoChargeItemsEqualTo(String value) {
            addCriterion("INCLUDE_NO_CHARGE_ITEMS =", value, "includeNoChargeItems");
            return (Criteria) this;
        }

        public Criteria andIncludeNoChargeItemsNotEqualTo(String value) {
            addCriterion("INCLUDE_NO_CHARGE_ITEMS <>", value, "includeNoChargeItems");
            return (Criteria) this;
        }

        public Criteria andIncludeNoChargeItemsGreaterThan(String value) {
            addCriterion("INCLUDE_NO_CHARGE_ITEMS >", value, "includeNoChargeItems");
            return (Criteria) this;
        }

        public Criteria andIncludeNoChargeItemsGreaterThanOrEqualTo(String value) {
            addCriterion("INCLUDE_NO_CHARGE_ITEMS >=", value, "includeNoChargeItems");
            return (Criteria) this;
        }

        public Criteria andIncludeNoChargeItemsLessThan(String value) {
            addCriterion("INCLUDE_NO_CHARGE_ITEMS <", value, "includeNoChargeItems");
            return (Criteria) this;
        }

        public Criteria andIncludeNoChargeItemsLessThanOrEqualTo(String value) {
            addCriterion("INCLUDE_NO_CHARGE_ITEMS <=", value, "includeNoChargeItems");
            return (Criteria) this;
        }

        public Criteria andIncludeNoChargeItemsLike(String value) {
            addCriterion("INCLUDE_NO_CHARGE_ITEMS like", value, "includeNoChargeItems");
            return (Criteria) this;
        }

        public Criteria andIncludeNoChargeItemsNotLike(String value) {
            addCriterion("INCLUDE_NO_CHARGE_ITEMS not like", value, "includeNoChargeItems");
            return (Criteria) this;
        }

        public Criteria andIncludeNoChargeItemsIn(List<String> values) {
            addCriterion("INCLUDE_NO_CHARGE_ITEMS in", values, "includeNoChargeItems");
            return (Criteria) this;
        }

        public Criteria andIncludeNoChargeItemsNotIn(List<String> values) {
            addCriterion("INCLUDE_NO_CHARGE_ITEMS not in", values, "includeNoChargeItems");
            return (Criteria) this;
        }

        public Criteria andIncludeNoChargeItemsBetween(String value1, String value2) {
            addCriterion("INCLUDE_NO_CHARGE_ITEMS between", value1, value2, "includeNoChargeItems");
            return (Criteria) this;
        }

        public Criteria andIncludeNoChargeItemsNotBetween(String value1, String value2) {
            addCriterion("INCLUDE_NO_CHARGE_ITEMS not between", value1, value2, "includeNoChargeItems");
            return (Criteria) this;
        }

        public Criteria andIncludeFeatureGroupIsNull() {
            addCriterion("INCLUDE_FEATURE_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andIncludeFeatureGroupIsNotNull() {
            addCriterion("INCLUDE_FEATURE_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andIncludeFeatureGroupEqualTo(String value) {
            addCriterion("INCLUDE_FEATURE_GROUP =", value, "includeFeatureGroup");
            return (Criteria) this;
        }

        public Criteria andIncludeFeatureGroupNotEqualTo(String value) {
            addCriterion("INCLUDE_FEATURE_GROUP <>", value, "includeFeatureGroup");
            return (Criteria) this;
        }

        public Criteria andIncludeFeatureGroupGreaterThan(String value) {
            addCriterion("INCLUDE_FEATURE_GROUP >", value, "includeFeatureGroup");
            return (Criteria) this;
        }

        public Criteria andIncludeFeatureGroupGreaterThanOrEqualTo(String value) {
            addCriterion("INCLUDE_FEATURE_GROUP >=", value, "includeFeatureGroup");
            return (Criteria) this;
        }

        public Criteria andIncludeFeatureGroupLessThan(String value) {
            addCriterion("INCLUDE_FEATURE_GROUP <", value, "includeFeatureGroup");
            return (Criteria) this;
        }

        public Criteria andIncludeFeatureGroupLessThanOrEqualTo(String value) {
            addCriterion("INCLUDE_FEATURE_GROUP <=", value, "includeFeatureGroup");
            return (Criteria) this;
        }

        public Criteria andIncludeFeatureGroupLike(String value) {
            addCriterion("INCLUDE_FEATURE_GROUP like", value, "includeFeatureGroup");
            return (Criteria) this;
        }

        public Criteria andIncludeFeatureGroupNotLike(String value) {
            addCriterion("INCLUDE_FEATURE_GROUP not like", value, "includeFeatureGroup");
            return (Criteria) this;
        }

        public Criteria andIncludeFeatureGroupIn(List<String> values) {
            addCriterion("INCLUDE_FEATURE_GROUP in", values, "includeFeatureGroup");
            return (Criteria) this;
        }

        public Criteria andIncludeFeatureGroupNotIn(List<String> values) {
            addCriterion("INCLUDE_FEATURE_GROUP not in", values, "includeFeatureGroup");
            return (Criteria) this;
        }

        public Criteria andIncludeFeatureGroupBetween(String value1, String value2) {
            addCriterion("INCLUDE_FEATURE_GROUP between", value1, value2, "includeFeatureGroup");
            return (Criteria) this;
        }

        public Criteria andIncludeFeatureGroupNotBetween(String value1, String value2) {
            addCriterion("INCLUDE_FEATURE_GROUP not between", value1, value2, "includeFeatureGroup");
            return (Criteria) this;
        }

        public Criteria andExcludeFeatureGroupIsNull() {
            addCriterion("EXCLUDE_FEATURE_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andExcludeFeatureGroupIsNotNull() {
            addCriterion("EXCLUDE_FEATURE_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andExcludeFeatureGroupEqualTo(String value) {
            addCriterion("EXCLUDE_FEATURE_GROUP =", value, "excludeFeatureGroup");
            return (Criteria) this;
        }

        public Criteria andExcludeFeatureGroupNotEqualTo(String value) {
            addCriterion("EXCLUDE_FEATURE_GROUP <>", value, "excludeFeatureGroup");
            return (Criteria) this;
        }

        public Criteria andExcludeFeatureGroupGreaterThan(String value) {
            addCriterion("EXCLUDE_FEATURE_GROUP >", value, "excludeFeatureGroup");
            return (Criteria) this;
        }

        public Criteria andExcludeFeatureGroupGreaterThanOrEqualTo(String value) {
            addCriterion("EXCLUDE_FEATURE_GROUP >=", value, "excludeFeatureGroup");
            return (Criteria) this;
        }

        public Criteria andExcludeFeatureGroupLessThan(String value) {
            addCriterion("EXCLUDE_FEATURE_GROUP <", value, "excludeFeatureGroup");
            return (Criteria) this;
        }

        public Criteria andExcludeFeatureGroupLessThanOrEqualTo(String value) {
            addCriterion("EXCLUDE_FEATURE_GROUP <=", value, "excludeFeatureGroup");
            return (Criteria) this;
        }

        public Criteria andExcludeFeatureGroupLike(String value) {
            addCriterion("EXCLUDE_FEATURE_GROUP like", value, "excludeFeatureGroup");
            return (Criteria) this;
        }

        public Criteria andExcludeFeatureGroupNotLike(String value) {
            addCriterion("EXCLUDE_FEATURE_GROUP not like", value, "excludeFeatureGroup");
            return (Criteria) this;
        }

        public Criteria andExcludeFeatureGroupIn(List<String> values) {
            addCriterion("EXCLUDE_FEATURE_GROUP in", values, "excludeFeatureGroup");
            return (Criteria) this;
        }

        public Criteria andExcludeFeatureGroupNotIn(List<String> values) {
            addCriterion("EXCLUDE_FEATURE_GROUP not in", values, "excludeFeatureGroup");
            return (Criteria) this;
        }

        public Criteria andExcludeFeatureGroupBetween(String value1, String value2) {
            addCriterion("EXCLUDE_FEATURE_GROUP between", value1, value2, "excludeFeatureGroup");
            return (Criteria) this;
        }

        public Criteria andExcludeFeatureGroupNotBetween(String value1, String value2) {
            addCriterion("EXCLUDE_FEATURE_GROUP not between", value1, value2, "excludeFeatureGroup");
            return (Criteria) this;
        }

        public Criteria andIncludeGeoIdIsNull() {
            addCriterion("INCLUDE_GEO_ID is null");
            return (Criteria) this;
        }

        public Criteria andIncludeGeoIdIsNotNull() {
            addCriterion("INCLUDE_GEO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIncludeGeoIdEqualTo(String value) {
            addCriterion("INCLUDE_GEO_ID =", value, "includeGeoId");
            return (Criteria) this;
        }

        public Criteria andIncludeGeoIdNotEqualTo(String value) {
            addCriterion("INCLUDE_GEO_ID <>", value, "includeGeoId");
            return (Criteria) this;
        }

        public Criteria andIncludeGeoIdGreaterThan(String value) {
            addCriterion("INCLUDE_GEO_ID >", value, "includeGeoId");
            return (Criteria) this;
        }

        public Criteria andIncludeGeoIdGreaterThanOrEqualTo(String value) {
            addCriterion("INCLUDE_GEO_ID >=", value, "includeGeoId");
            return (Criteria) this;
        }

        public Criteria andIncludeGeoIdLessThan(String value) {
            addCriterion("INCLUDE_GEO_ID <", value, "includeGeoId");
            return (Criteria) this;
        }

        public Criteria andIncludeGeoIdLessThanOrEqualTo(String value) {
            addCriterion("INCLUDE_GEO_ID <=", value, "includeGeoId");
            return (Criteria) this;
        }

        public Criteria andIncludeGeoIdLike(String value) {
            addCriterion("INCLUDE_GEO_ID like", value, "includeGeoId");
            return (Criteria) this;
        }

        public Criteria andIncludeGeoIdNotLike(String value) {
            addCriterion("INCLUDE_GEO_ID not like", value, "includeGeoId");
            return (Criteria) this;
        }

        public Criteria andIncludeGeoIdIn(List<String> values) {
            addCriterion("INCLUDE_GEO_ID in", values, "includeGeoId");
            return (Criteria) this;
        }

        public Criteria andIncludeGeoIdNotIn(List<String> values) {
            addCriterion("INCLUDE_GEO_ID not in", values, "includeGeoId");
            return (Criteria) this;
        }

        public Criteria andIncludeGeoIdBetween(String value1, String value2) {
            addCriterion("INCLUDE_GEO_ID between", value1, value2, "includeGeoId");
            return (Criteria) this;
        }

        public Criteria andIncludeGeoIdNotBetween(String value1, String value2) {
            addCriterion("INCLUDE_GEO_ID not between", value1, value2, "includeGeoId");
            return (Criteria) this;
        }

        public Criteria andExcludeGeoIdIsNull() {
            addCriterion("EXCLUDE_GEO_ID is null");
            return (Criteria) this;
        }

        public Criteria andExcludeGeoIdIsNotNull() {
            addCriterion("EXCLUDE_GEO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExcludeGeoIdEqualTo(String value) {
            addCriterion("EXCLUDE_GEO_ID =", value, "excludeGeoId");
            return (Criteria) this;
        }

        public Criteria andExcludeGeoIdNotEqualTo(String value) {
            addCriterion("EXCLUDE_GEO_ID <>", value, "excludeGeoId");
            return (Criteria) this;
        }

        public Criteria andExcludeGeoIdGreaterThan(String value) {
            addCriterion("EXCLUDE_GEO_ID >", value, "excludeGeoId");
            return (Criteria) this;
        }

        public Criteria andExcludeGeoIdGreaterThanOrEqualTo(String value) {
            addCriterion("EXCLUDE_GEO_ID >=", value, "excludeGeoId");
            return (Criteria) this;
        }

        public Criteria andExcludeGeoIdLessThan(String value) {
            addCriterion("EXCLUDE_GEO_ID <", value, "excludeGeoId");
            return (Criteria) this;
        }

        public Criteria andExcludeGeoIdLessThanOrEqualTo(String value) {
            addCriterion("EXCLUDE_GEO_ID <=", value, "excludeGeoId");
            return (Criteria) this;
        }

        public Criteria andExcludeGeoIdLike(String value) {
            addCriterion("EXCLUDE_GEO_ID like", value, "excludeGeoId");
            return (Criteria) this;
        }

        public Criteria andExcludeGeoIdNotLike(String value) {
            addCriterion("EXCLUDE_GEO_ID not like", value, "excludeGeoId");
            return (Criteria) this;
        }

        public Criteria andExcludeGeoIdIn(List<String> values) {
            addCriterion("EXCLUDE_GEO_ID in", values, "excludeGeoId");
            return (Criteria) this;
        }

        public Criteria andExcludeGeoIdNotIn(List<String> values) {
            addCriterion("EXCLUDE_GEO_ID not in", values, "excludeGeoId");
            return (Criteria) this;
        }

        public Criteria andExcludeGeoIdBetween(String value1, String value2) {
            addCriterion("EXCLUDE_GEO_ID between", value1, value2, "excludeGeoId");
            return (Criteria) this;
        }

        public Criteria andExcludeGeoIdNotBetween(String value1, String value2) {
            addCriterion("EXCLUDE_GEO_ID not between", value1, value2, "excludeGeoId");
            return (Criteria) this;
        }

        public Criteria andServiceNameIsNull() {
            addCriterion("SERVICE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andServiceNameIsNotNull() {
            addCriterion("SERVICE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andServiceNameEqualTo(String value) {
            addCriterion("SERVICE_NAME =", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotEqualTo(String value) {
            addCriterion("SERVICE_NAME <>", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameGreaterThan(String value) {
            addCriterion("SERVICE_NAME >", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_NAME >=", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLessThan(String value) {
            addCriterion("SERVICE_NAME <", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_NAME <=", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLike(String value) {
            addCriterion("SERVICE_NAME like", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotLike(String value) {
            addCriterion("SERVICE_NAME not like", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameIn(List<String> values) {
            addCriterion("SERVICE_NAME in", values, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotIn(List<String> values) {
            addCriterion("SERVICE_NAME not in", values, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameBetween(String value1, String value2) {
            addCriterion("SERVICE_NAME between", value1, value2, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotBetween(String value1, String value2) {
            addCriterion("SERVICE_NAME not between", value1, value2, "serviceName");
            return (Criteria) this;
        }

        public Criteria andConfigPropsIsNull() {
            addCriterion("CONFIG_PROPS is null");
            return (Criteria) this;
        }

        public Criteria andConfigPropsIsNotNull() {
            addCriterion("CONFIG_PROPS is not null");
            return (Criteria) this;
        }

        public Criteria andConfigPropsEqualTo(String value) {
            addCriterion("CONFIG_PROPS =", value, "configProps");
            return (Criteria) this;
        }

        public Criteria andConfigPropsNotEqualTo(String value) {
            addCriterion("CONFIG_PROPS <>", value, "configProps");
            return (Criteria) this;
        }

        public Criteria andConfigPropsGreaterThan(String value) {
            addCriterion("CONFIG_PROPS >", value, "configProps");
            return (Criteria) this;
        }

        public Criteria andConfigPropsGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIG_PROPS >=", value, "configProps");
            return (Criteria) this;
        }

        public Criteria andConfigPropsLessThan(String value) {
            addCriterion("CONFIG_PROPS <", value, "configProps");
            return (Criteria) this;
        }

        public Criteria andConfigPropsLessThanOrEqualTo(String value) {
            addCriterion("CONFIG_PROPS <=", value, "configProps");
            return (Criteria) this;
        }

        public Criteria andConfigPropsLike(String value) {
            addCriterion("CONFIG_PROPS like", value, "configProps");
            return (Criteria) this;
        }

        public Criteria andConfigPropsNotLike(String value) {
            addCriterion("CONFIG_PROPS not like", value, "configProps");
            return (Criteria) this;
        }

        public Criteria andConfigPropsIn(List<String> values) {
            addCriterion("CONFIG_PROPS in", values, "configProps");
            return (Criteria) this;
        }

        public Criteria andConfigPropsNotIn(List<String> values) {
            addCriterion("CONFIG_PROPS not in", values, "configProps");
            return (Criteria) this;
        }

        public Criteria andConfigPropsBetween(String value1, String value2) {
            addCriterion("CONFIG_PROPS between", value1, value2, "configProps");
            return (Criteria) this;
        }

        public Criteria andConfigPropsNotBetween(String value1, String value2) {
            addCriterion("CONFIG_PROPS not between", value1, value2, "configProps");
            return (Criteria) this;
        }

        public Criteria andShipmentCustomMethodIdIsNull() {
            addCriterion("SHIPMENT_CUSTOM_METHOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andShipmentCustomMethodIdIsNotNull() {
            addCriterion("SHIPMENT_CUSTOM_METHOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andShipmentCustomMethodIdEqualTo(String value) {
            addCriterion("SHIPMENT_CUSTOM_METHOD_ID =", value, "shipmentCustomMethodId");
            return (Criteria) this;
        }

        public Criteria andShipmentCustomMethodIdNotEqualTo(String value) {
            addCriterion("SHIPMENT_CUSTOM_METHOD_ID <>", value, "shipmentCustomMethodId");
            return (Criteria) this;
        }

        public Criteria andShipmentCustomMethodIdGreaterThan(String value) {
            addCriterion("SHIPMENT_CUSTOM_METHOD_ID >", value, "shipmentCustomMethodId");
            return (Criteria) this;
        }

        public Criteria andShipmentCustomMethodIdGreaterThanOrEqualTo(String value) {
            addCriterion("SHIPMENT_CUSTOM_METHOD_ID >=", value, "shipmentCustomMethodId");
            return (Criteria) this;
        }

        public Criteria andShipmentCustomMethodIdLessThan(String value) {
            addCriterion("SHIPMENT_CUSTOM_METHOD_ID <", value, "shipmentCustomMethodId");
            return (Criteria) this;
        }

        public Criteria andShipmentCustomMethodIdLessThanOrEqualTo(String value) {
            addCriterion("SHIPMENT_CUSTOM_METHOD_ID <=", value, "shipmentCustomMethodId");
            return (Criteria) this;
        }

        public Criteria andShipmentCustomMethodIdLike(String value) {
            addCriterion("SHIPMENT_CUSTOM_METHOD_ID like", value, "shipmentCustomMethodId");
            return (Criteria) this;
        }

        public Criteria andShipmentCustomMethodIdNotLike(String value) {
            addCriterion("SHIPMENT_CUSTOM_METHOD_ID not like", value, "shipmentCustomMethodId");
            return (Criteria) this;
        }

        public Criteria andShipmentCustomMethodIdIn(List<String> values) {
            addCriterion("SHIPMENT_CUSTOM_METHOD_ID in", values, "shipmentCustomMethodId");
            return (Criteria) this;
        }

        public Criteria andShipmentCustomMethodIdNotIn(List<String> values) {
            addCriterion("SHIPMENT_CUSTOM_METHOD_ID not in", values, "shipmentCustomMethodId");
            return (Criteria) this;
        }

        public Criteria andShipmentCustomMethodIdBetween(String value1, String value2) {
            addCriterion("SHIPMENT_CUSTOM_METHOD_ID between", value1, value2, "shipmentCustomMethodId");
            return (Criteria) this;
        }

        public Criteria andShipmentCustomMethodIdNotBetween(String value1, String value2) {
            addCriterion("SHIPMENT_CUSTOM_METHOD_ID not between", value1, value2, "shipmentCustomMethodId");
            return (Criteria) this;
        }

        public Criteria andShipmentGatewayConfigIdIsNull() {
            addCriterion("SHIPMENT_GATEWAY_CONFIG_ID is null");
            return (Criteria) this;
        }

        public Criteria andShipmentGatewayConfigIdIsNotNull() {
            addCriterion("SHIPMENT_GATEWAY_CONFIG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andShipmentGatewayConfigIdEqualTo(String value) {
            addCriterion("SHIPMENT_GATEWAY_CONFIG_ID =", value, "shipmentGatewayConfigId");
            return (Criteria) this;
        }

        public Criteria andShipmentGatewayConfigIdNotEqualTo(String value) {
            addCriterion("SHIPMENT_GATEWAY_CONFIG_ID <>", value, "shipmentGatewayConfigId");
            return (Criteria) this;
        }

        public Criteria andShipmentGatewayConfigIdGreaterThan(String value) {
            addCriterion("SHIPMENT_GATEWAY_CONFIG_ID >", value, "shipmentGatewayConfigId");
            return (Criteria) this;
        }

        public Criteria andShipmentGatewayConfigIdGreaterThanOrEqualTo(String value) {
            addCriterion("SHIPMENT_GATEWAY_CONFIG_ID >=", value, "shipmentGatewayConfigId");
            return (Criteria) this;
        }

        public Criteria andShipmentGatewayConfigIdLessThan(String value) {
            addCriterion("SHIPMENT_GATEWAY_CONFIG_ID <", value, "shipmentGatewayConfigId");
            return (Criteria) this;
        }

        public Criteria andShipmentGatewayConfigIdLessThanOrEqualTo(String value) {
            addCriterion("SHIPMENT_GATEWAY_CONFIG_ID <=", value, "shipmentGatewayConfigId");
            return (Criteria) this;
        }

        public Criteria andShipmentGatewayConfigIdLike(String value) {
            addCriterion("SHIPMENT_GATEWAY_CONFIG_ID like", value, "shipmentGatewayConfigId");
            return (Criteria) this;
        }

        public Criteria andShipmentGatewayConfigIdNotLike(String value) {
            addCriterion("SHIPMENT_GATEWAY_CONFIG_ID not like", value, "shipmentGatewayConfigId");
            return (Criteria) this;
        }

        public Criteria andShipmentGatewayConfigIdIn(List<String> values) {
            addCriterion("SHIPMENT_GATEWAY_CONFIG_ID in", values, "shipmentGatewayConfigId");
            return (Criteria) this;
        }

        public Criteria andShipmentGatewayConfigIdNotIn(List<String> values) {
            addCriterion("SHIPMENT_GATEWAY_CONFIG_ID not in", values, "shipmentGatewayConfigId");
            return (Criteria) this;
        }

        public Criteria andShipmentGatewayConfigIdBetween(String value1, String value2) {
            addCriterion("SHIPMENT_GATEWAY_CONFIG_ID between", value1, value2, "shipmentGatewayConfigId");
            return (Criteria) this;
        }

        public Criteria andShipmentGatewayConfigIdNotBetween(String value1, String value2) {
            addCriterion("SHIPMENT_GATEWAY_CONFIG_ID not between", value1, value2, "shipmentGatewayConfigId");
            return (Criteria) this;
        }

        public Criteria andSequenceNumberIsNull() {
            addCriterion("SEQUENCE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andSequenceNumberIsNotNull() {
            addCriterion("SEQUENCE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andSequenceNumberEqualTo(BigDecimal value) {
            addCriterion("SEQUENCE_NUMBER =", value, "sequenceNumber");
            return (Criteria) this;
        }

        public Criteria andSequenceNumberNotEqualTo(BigDecimal value) {
            addCriterion("SEQUENCE_NUMBER <>", value, "sequenceNumber");
            return (Criteria) this;
        }

        public Criteria andSequenceNumberGreaterThan(BigDecimal value) {
            addCriterion("SEQUENCE_NUMBER >", value, "sequenceNumber");
            return (Criteria) this;
        }

        public Criteria andSequenceNumberGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SEQUENCE_NUMBER >=", value, "sequenceNumber");
            return (Criteria) this;
        }

        public Criteria andSequenceNumberLessThan(BigDecimal value) {
            addCriterion("SEQUENCE_NUMBER <", value, "sequenceNumber");
            return (Criteria) this;
        }

        public Criteria andSequenceNumberLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SEQUENCE_NUMBER <=", value, "sequenceNumber");
            return (Criteria) this;
        }

        public Criteria andSequenceNumberIn(List<BigDecimal> values) {
            addCriterion("SEQUENCE_NUMBER in", values, "sequenceNumber");
            return (Criteria) this;
        }

        public Criteria andSequenceNumberNotIn(List<BigDecimal> values) {
            addCriterion("SEQUENCE_NUMBER not in", values, "sequenceNumber");
            return (Criteria) this;
        }

        public Criteria andSequenceNumberBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SEQUENCE_NUMBER between", value1, value2, "sequenceNumber");
            return (Criteria) this;
        }

        public Criteria andSequenceNumberNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SEQUENCE_NUMBER not between", value1, value2, "sequenceNumber");
            return (Criteria) this;
        }

        public Criteria andAllowancePercentIsNull() {
            addCriterion("ALLOWANCE_PERCENT is null");
            return (Criteria) this;
        }

        public Criteria andAllowancePercentIsNotNull() {
            addCriterion("ALLOWANCE_PERCENT is not null");
            return (Criteria) this;
        }

        public Criteria andAllowancePercentEqualTo(BigDecimal value) {
            addCriterion("ALLOWANCE_PERCENT =", value, "allowancePercent");
            return (Criteria) this;
        }

        public Criteria andAllowancePercentNotEqualTo(BigDecimal value) {
            addCriterion("ALLOWANCE_PERCENT <>", value, "allowancePercent");
            return (Criteria) this;
        }

        public Criteria andAllowancePercentGreaterThan(BigDecimal value) {
            addCriterion("ALLOWANCE_PERCENT >", value, "allowancePercent");
            return (Criteria) this;
        }

        public Criteria andAllowancePercentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ALLOWANCE_PERCENT >=", value, "allowancePercent");
            return (Criteria) this;
        }

        public Criteria andAllowancePercentLessThan(BigDecimal value) {
            addCriterion("ALLOWANCE_PERCENT <", value, "allowancePercent");
            return (Criteria) this;
        }

        public Criteria andAllowancePercentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ALLOWANCE_PERCENT <=", value, "allowancePercent");
            return (Criteria) this;
        }

        public Criteria andAllowancePercentIn(List<BigDecimal> values) {
            addCriterion("ALLOWANCE_PERCENT in", values, "allowancePercent");
            return (Criteria) this;
        }

        public Criteria andAllowancePercentNotIn(List<BigDecimal> values) {
            addCriterion("ALLOWANCE_PERCENT not in", values, "allowancePercent");
            return (Criteria) this;
        }

        public Criteria andAllowancePercentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ALLOWANCE_PERCENT between", value1, value2, "allowancePercent");
            return (Criteria) this;
        }

        public Criteria andAllowancePercentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ALLOWANCE_PERCENT not between", value1, value2, "allowancePercent");
            return (Criteria) this;
        }

        public Criteria andMinimumPriceIsNull() {
            addCriterion("MINIMUM_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andMinimumPriceIsNotNull() {
            addCriterion("MINIMUM_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andMinimumPriceEqualTo(BigDecimal value) {
            addCriterion("MINIMUM_PRICE =", value, "minimumPrice");
            return (Criteria) this;
        }

        public Criteria andMinimumPriceNotEqualTo(BigDecimal value) {
            addCriterion("MINIMUM_PRICE <>", value, "minimumPrice");
            return (Criteria) this;
        }

        public Criteria andMinimumPriceGreaterThan(BigDecimal value) {
            addCriterion("MINIMUM_PRICE >", value, "minimumPrice");
            return (Criteria) this;
        }

        public Criteria andMinimumPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MINIMUM_PRICE >=", value, "minimumPrice");
            return (Criteria) this;
        }

        public Criteria andMinimumPriceLessThan(BigDecimal value) {
            addCriterion("MINIMUM_PRICE <", value, "minimumPrice");
            return (Criteria) this;
        }

        public Criteria andMinimumPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MINIMUM_PRICE <=", value, "minimumPrice");
            return (Criteria) this;
        }

        public Criteria andMinimumPriceIn(List<BigDecimal> values) {
            addCriterion("MINIMUM_PRICE in", values, "minimumPrice");
            return (Criteria) this;
        }

        public Criteria andMinimumPriceNotIn(List<BigDecimal> values) {
            addCriterion("MINIMUM_PRICE not in", values, "minimumPrice");
            return (Criteria) this;
        }

        public Criteria andMinimumPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MINIMUM_PRICE between", value1, value2, "minimumPrice");
            return (Criteria) this;
        }

        public Criteria andMinimumPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MINIMUM_PRICE not between", value1, value2, "minimumPrice");
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