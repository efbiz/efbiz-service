package org.efbiz.product.store.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductStorePaymentSettingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public ProductStorePaymentSettingExample() {
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

        public Criteria andPaymentMethodTypeIdIsNull() {
            addCriterion("PAYMENT_METHOD_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodTypeIdIsNotNull() {
            addCriterion("PAYMENT_METHOD_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodTypeIdEqualTo(String value) {
            addCriterion("PAYMENT_METHOD_TYPE_ID =", value, "paymentMethodTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodTypeIdNotEqualTo(String value) {
            addCriterion("PAYMENT_METHOD_TYPE_ID <>", value, "paymentMethodTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodTypeIdGreaterThan(String value) {
            addCriterion("PAYMENT_METHOD_TYPE_ID >", value, "paymentMethodTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENT_METHOD_TYPE_ID >=", value, "paymentMethodTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodTypeIdLessThan(String value) {
            addCriterion("PAYMENT_METHOD_TYPE_ID <", value, "paymentMethodTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodTypeIdLessThanOrEqualTo(String value) {
            addCriterion("PAYMENT_METHOD_TYPE_ID <=", value, "paymentMethodTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodTypeIdLike(String value) {
            addCriterion("PAYMENT_METHOD_TYPE_ID like", value, "paymentMethodTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodTypeIdNotLike(String value) {
            addCriterion("PAYMENT_METHOD_TYPE_ID not like", value, "paymentMethodTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodTypeIdIn(List<String> values) {
            addCriterion("PAYMENT_METHOD_TYPE_ID in", values, "paymentMethodTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodTypeIdNotIn(List<String> values) {
            addCriterion("PAYMENT_METHOD_TYPE_ID not in", values, "paymentMethodTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodTypeIdBetween(String value1, String value2) {
            addCriterion("PAYMENT_METHOD_TYPE_ID between", value1, value2, "paymentMethodTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodTypeIdNotBetween(String value1, String value2) {
            addCriterion("PAYMENT_METHOD_TYPE_ID not between", value1, value2, "paymentMethodTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentServiceTypeEnumIdIsNull() {
            addCriterion("PAYMENT_SERVICE_TYPE_ENUM_ID is null");
            return (Criteria) this;
        }

        public Criteria andPaymentServiceTypeEnumIdIsNotNull() {
            addCriterion("PAYMENT_SERVICE_TYPE_ENUM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentServiceTypeEnumIdEqualTo(String value) {
            addCriterion("PAYMENT_SERVICE_TYPE_ENUM_ID =", value, "paymentServiceTypeEnumId");
            return (Criteria) this;
        }

        public Criteria andPaymentServiceTypeEnumIdNotEqualTo(String value) {
            addCriterion("PAYMENT_SERVICE_TYPE_ENUM_ID <>", value, "paymentServiceTypeEnumId");
            return (Criteria) this;
        }

        public Criteria andPaymentServiceTypeEnumIdGreaterThan(String value) {
            addCriterion("PAYMENT_SERVICE_TYPE_ENUM_ID >", value, "paymentServiceTypeEnumId");
            return (Criteria) this;
        }

        public Criteria andPaymentServiceTypeEnumIdGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENT_SERVICE_TYPE_ENUM_ID >=", value, "paymentServiceTypeEnumId");
            return (Criteria) this;
        }

        public Criteria andPaymentServiceTypeEnumIdLessThan(String value) {
            addCriterion("PAYMENT_SERVICE_TYPE_ENUM_ID <", value, "paymentServiceTypeEnumId");
            return (Criteria) this;
        }

        public Criteria andPaymentServiceTypeEnumIdLessThanOrEqualTo(String value) {
            addCriterion("PAYMENT_SERVICE_TYPE_ENUM_ID <=", value, "paymentServiceTypeEnumId");
            return (Criteria) this;
        }

        public Criteria andPaymentServiceTypeEnumIdLike(String value) {
            addCriterion("PAYMENT_SERVICE_TYPE_ENUM_ID like", value, "paymentServiceTypeEnumId");
            return (Criteria) this;
        }

        public Criteria andPaymentServiceTypeEnumIdNotLike(String value) {
            addCriterion("PAYMENT_SERVICE_TYPE_ENUM_ID not like", value, "paymentServiceTypeEnumId");
            return (Criteria) this;
        }

        public Criteria andPaymentServiceTypeEnumIdIn(List<String> values) {
            addCriterion("PAYMENT_SERVICE_TYPE_ENUM_ID in", values, "paymentServiceTypeEnumId");
            return (Criteria) this;
        }

        public Criteria andPaymentServiceTypeEnumIdNotIn(List<String> values) {
            addCriterion("PAYMENT_SERVICE_TYPE_ENUM_ID not in", values, "paymentServiceTypeEnumId");
            return (Criteria) this;
        }

        public Criteria andPaymentServiceTypeEnumIdBetween(String value1, String value2) {
            addCriterion("PAYMENT_SERVICE_TYPE_ENUM_ID between", value1, value2, "paymentServiceTypeEnumId");
            return (Criteria) this;
        }

        public Criteria andPaymentServiceTypeEnumIdNotBetween(String value1, String value2) {
            addCriterion("PAYMENT_SERVICE_TYPE_ENUM_ID not between", value1, value2, "paymentServiceTypeEnumId");
            return (Criteria) this;
        }

        public Criteria andPaymentServiceIsNull() {
            addCriterion("PAYMENT_SERVICE is null");
            return (Criteria) this;
        }

        public Criteria andPaymentServiceIsNotNull() {
            addCriterion("PAYMENT_SERVICE is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentServiceEqualTo(String value) {
            addCriterion("PAYMENT_SERVICE =", value, "paymentService");
            return (Criteria) this;
        }

        public Criteria andPaymentServiceNotEqualTo(String value) {
            addCriterion("PAYMENT_SERVICE <>", value, "paymentService");
            return (Criteria) this;
        }

        public Criteria andPaymentServiceGreaterThan(String value) {
            addCriterion("PAYMENT_SERVICE >", value, "paymentService");
            return (Criteria) this;
        }

        public Criteria andPaymentServiceGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENT_SERVICE >=", value, "paymentService");
            return (Criteria) this;
        }

        public Criteria andPaymentServiceLessThan(String value) {
            addCriterion("PAYMENT_SERVICE <", value, "paymentService");
            return (Criteria) this;
        }

        public Criteria andPaymentServiceLessThanOrEqualTo(String value) {
            addCriterion("PAYMENT_SERVICE <=", value, "paymentService");
            return (Criteria) this;
        }

        public Criteria andPaymentServiceLike(String value) {
            addCriterion("PAYMENT_SERVICE like", value, "paymentService");
            return (Criteria) this;
        }

        public Criteria andPaymentServiceNotLike(String value) {
            addCriterion("PAYMENT_SERVICE not like", value, "paymentService");
            return (Criteria) this;
        }

        public Criteria andPaymentServiceIn(List<String> values) {
            addCriterion("PAYMENT_SERVICE in", values, "paymentService");
            return (Criteria) this;
        }

        public Criteria andPaymentServiceNotIn(List<String> values) {
            addCriterion("PAYMENT_SERVICE not in", values, "paymentService");
            return (Criteria) this;
        }

        public Criteria andPaymentServiceBetween(String value1, String value2) {
            addCriterion("PAYMENT_SERVICE between", value1, value2, "paymentService");
            return (Criteria) this;
        }

        public Criteria andPaymentServiceNotBetween(String value1, String value2) {
            addCriterion("PAYMENT_SERVICE not between", value1, value2, "paymentService");
            return (Criteria) this;
        }

        public Criteria andPaymentCustomMethodIdIsNull() {
            addCriterion("PAYMENT_CUSTOM_METHOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andPaymentCustomMethodIdIsNotNull() {
            addCriterion("PAYMENT_CUSTOM_METHOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentCustomMethodIdEqualTo(String value) {
            addCriterion("PAYMENT_CUSTOM_METHOD_ID =", value, "paymentCustomMethodId");
            return (Criteria) this;
        }

        public Criteria andPaymentCustomMethodIdNotEqualTo(String value) {
            addCriterion("PAYMENT_CUSTOM_METHOD_ID <>", value, "paymentCustomMethodId");
            return (Criteria) this;
        }

        public Criteria andPaymentCustomMethodIdGreaterThan(String value) {
            addCriterion("PAYMENT_CUSTOM_METHOD_ID >", value, "paymentCustomMethodId");
            return (Criteria) this;
        }

        public Criteria andPaymentCustomMethodIdGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENT_CUSTOM_METHOD_ID >=", value, "paymentCustomMethodId");
            return (Criteria) this;
        }

        public Criteria andPaymentCustomMethodIdLessThan(String value) {
            addCriterion("PAYMENT_CUSTOM_METHOD_ID <", value, "paymentCustomMethodId");
            return (Criteria) this;
        }

        public Criteria andPaymentCustomMethodIdLessThanOrEqualTo(String value) {
            addCriterion("PAYMENT_CUSTOM_METHOD_ID <=", value, "paymentCustomMethodId");
            return (Criteria) this;
        }

        public Criteria andPaymentCustomMethodIdLike(String value) {
            addCriterion("PAYMENT_CUSTOM_METHOD_ID like", value, "paymentCustomMethodId");
            return (Criteria) this;
        }

        public Criteria andPaymentCustomMethodIdNotLike(String value) {
            addCriterion("PAYMENT_CUSTOM_METHOD_ID not like", value, "paymentCustomMethodId");
            return (Criteria) this;
        }

        public Criteria andPaymentCustomMethodIdIn(List<String> values) {
            addCriterion("PAYMENT_CUSTOM_METHOD_ID in", values, "paymentCustomMethodId");
            return (Criteria) this;
        }

        public Criteria andPaymentCustomMethodIdNotIn(List<String> values) {
            addCriterion("PAYMENT_CUSTOM_METHOD_ID not in", values, "paymentCustomMethodId");
            return (Criteria) this;
        }

        public Criteria andPaymentCustomMethodIdBetween(String value1, String value2) {
            addCriterion("PAYMENT_CUSTOM_METHOD_ID between", value1, value2, "paymentCustomMethodId");
            return (Criteria) this;
        }

        public Criteria andPaymentCustomMethodIdNotBetween(String value1, String value2) {
            addCriterion("PAYMENT_CUSTOM_METHOD_ID not between", value1, value2, "paymentCustomMethodId");
            return (Criteria) this;
        }

        public Criteria andPaymentGatewayConfigIdIsNull() {
            addCriterion("PAYMENT_GATEWAY_CONFIG_ID is null");
            return (Criteria) this;
        }

        public Criteria andPaymentGatewayConfigIdIsNotNull() {
            addCriterion("PAYMENT_GATEWAY_CONFIG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentGatewayConfigIdEqualTo(String value) {
            addCriterion("PAYMENT_GATEWAY_CONFIG_ID =", value, "paymentGatewayConfigId");
            return (Criteria) this;
        }

        public Criteria andPaymentGatewayConfigIdNotEqualTo(String value) {
            addCriterion("PAYMENT_GATEWAY_CONFIG_ID <>", value, "paymentGatewayConfigId");
            return (Criteria) this;
        }

        public Criteria andPaymentGatewayConfigIdGreaterThan(String value) {
            addCriterion("PAYMENT_GATEWAY_CONFIG_ID >", value, "paymentGatewayConfigId");
            return (Criteria) this;
        }

        public Criteria andPaymentGatewayConfigIdGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENT_GATEWAY_CONFIG_ID >=", value, "paymentGatewayConfigId");
            return (Criteria) this;
        }

        public Criteria andPaymentGatewayConfigIdLessThan(String value) {
            addCriterion("PAYMENT_GATEWAY_CONFIG_ID <", value, "paymentGatewayConfigId");
            return (Criteria) this;
        }

        public Criteria andPaymentGatewayConfigIdLessThanOrEqualTo(String value) {
            addCriterion("PAYMENT_GATEWAY_CONFIG_ID <=", value, "paymentGatewayConfigId");
            return (Criteria) this;
        }

        public Criteria andPaymentGatewayConfigIdLike(String value) {
            addCriterion("PAYMENT_GATEWAY_CONFIG_ID like", value, "paymentGatewayConfigId");
            return (Criteria) this;
        }

        public Criteria andPaymentGatewayConfigIdNotLike(String value) {
            addCriterion("PAYMENT_GATEWAY_CONFIG_ID not like", value, "paymentGatewayConfigId");
            return (Criteria) this;
        }

        public Criteria andPaymentGatewayConfigIdIn(List<String> values) {
            addCriterion("PAYMENT_GATEWAY_CONFIG_ID in", values, "paymentGatewayConfigId");
            return (Criteria) this;
        }

        public Criteria andPaymentGatewayConfigIdNotIn(List<String> values) {
            addCriterion("PAYMENT_GATEWAY_CONFIG_ID not in", values, "paymentGatewayConfigId");
            return (Criteria) this;
        }

        public Criteria andPaymentGatewayConfigIdBetween(String value1, String value2) {
            addCriterion("PAYMENT_GATEWAY_CONFIG_ID between", value1, value2, "paymentGatewayConfigId");
            return (Criteria) this;
        }

        public Criteria andPaymentGatewayConfigIdNotBetween(String value1, String value2) {
            addCriterion("PAYMENT_GATEWAY_CONFIG_ID not between", value1, value2, "paymentGatewayConfigId");
            return (Criteria) this;
        }

        public Criteria andPaymentPropertiesPathIsNull() {
            addCriterion("PAYMENT_PROPERTIES_PATH is null");
            return (Criteria) this;
        }

        public Criteria andPaymentPropertiesPathIsNotNull() {
            addCriterion("PAYMENT_PROPERTIES_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentPropertiesPathEqualTo(String value) {
            addCriterion("PAYMENT_PROPERTIES_PATH =", value, "paymentPropertiesPath");
            return (Criteria) this;
        }

        public Criteria andPaymentPropertiesPathNotEqualTo(String value) {
            addCriterion("PAYMENT_PROPERTIES_PATH <>", value, "paymentPropertiesPath");
            return (Criteria) this;
        }

        public Criteria andPaymentPropertiesPathGreaterThan(String value) {
            addCriterion("PAYMENT_PROPERTIES_PATH >", value, "paymentPropertiesPath");
            return (Criteria) this;
        }

        public Criteria andPaymentPropertiesPathGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENT_PROPERTIES_PATH >=", value, "paymentPropertiesPath");
            return (Criteria) this;
        }

        public Criteria andPaymentPropertiesPathLessThan(String value) {
            addCriterion("PAYMENT_PROPERTIES_PATH <", value, "paymentPropertiesPath");
            return (Criteria) this;
        }

        public Criteria andPaymentPropertiesPathLessThanOrEqualTo(String value) {
            addCriterion("PAYMENT_PROPERTIES_PATH <=", value, "paymentPropertiesPath");
            return (Criteria) this;
        }

        public Criteria andPaymentPropertiesPathLike(String value) {
            addCriterion("PAYMENT_PROPERTIES_PATH like", value, "paymentPropertiesPath");
            return (Criteria) this;
        }

        public Criteria andPaymentPropertiesPathNotLike(String value) {
            addCriterion("PAYMENT_PROPERTIES_PATH not like", value, "paymentPropertiesPath");
            return (Criteria) this;
        }

        public Criteria andPaymentPropertiesPathIn(List<String> values) {
            addCriterion("PAYMENT_PROPERTIES_PATH in", values, "paymentPropertiesPath");
            return (Criteria) this;
        }

        public Criteria andPaymentPropertiesPathNotIn(List<String> values) {
            addCriterion("PAYMENT_PROPERTIES_PATH not in", values, "paymentPropertiesPath");
            return (Criteria) this;
        }

        public Criteria andPaymentPropertiesPathBetween(String value1, String value2) {
            addCriterion("PAYMENT_PROPERTIES_PATH between", value1, value2, "paymentPropertiesPath");
            return (Criteria) this;
        }

        public Criteria andPaymentPropertiesPathNotBetween(String value1, String value2) {
            addCriterion("PAYMENT_PROPERTIES_PATH not between", value1, value2, "paymentPropertiesPath");
            return (Criteria) this;
        }

        public Criteria andApplyToAllProductsIsNull() {
            addCriterion("APPLY_TO_ALL_PRODUCTS is null");
            return (Criteria) this;
        }

        public Criteria andApplyToAllProductsIsNotNull() {
            addCriterion("APPLY_TO_ALL_PRODUCTS is not null");
            return (Criteria) this;
        }

        public Criteria andApplyToAllProductsEqualTo(String value) {
            addCriterion("APPLY_TO_ALL_PRODUCTS =", value, "applyToAllProducts");
            return (Criteria) this;
        }

        public Criteria andApplyToAllProductsNotEqualTo(String value) {
            addCriterion("APPLY_TO_ALL_PRODUCTS <>", value, "applyToAllProducts");
            return (Criteria) this;
        }

        public Criteria andApplyToAllProductsGreaterThan(String value) {
            addCriterion("APPLY_TO_ALL_PRODUCTS >", value, "applyToAllProducts");
            return (Criteria) this;
        }

        public Criteria andApplyToAllProductsGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_TO_ALL_PRODUCTS >=", value, "applyToAllProducts");
            return (Criteria) this;
        }

        public Criteria andApplyToAllProductsLessThan(String value) {
            addCriterion("APPLY_TO_ALL_PRODUCTS <", value, "applyToAllProducts");
            return (Criteria) this;
        }

        public Criteria andApplyToAllProductsLessThanOrEqualTo(String value) {
            addCriterion("APPLY_TO_ALL_PRODUCTS <=", value, "applyToAllProducts");
            return (Criteria) this;
        }

        public Criteria andApplyToAllProductsLike(String value) {
            addCriterion("APPLY_TO_ALL_PRODUCTS like", value, "applyToAllProducts");
            return (Criteria) this;
        }

        public Criteria andApplyToAllProductsNotLike(String value) {
            addCriterion("APPLY_TO_ALL_PRODUCTS not like", value, "applyToAllProducts");
            return (Criteria) this;
        }

        public Criteria andApplyToAllProductsIn(List<String> values) {
            addCriterion("APPLY_TO_ALL_PRODUCTS in", values, "applyToAllProducts");
            return (Criteria) this;
        }

        public Criteria andApplyToAllProductsNotIn(List<String> values) {
            addCriterion("APPLY_TO_ALL_PRODUCTS not in", values, "applyToAllProducts");
            return (Criteria) this;
        }

        public Criteria andApplyToAllProductsBetween(String value1, String value2) {
            addCriterion("APPLY_TO_ALL_PRODUCTS between", value1, value2, "applyToAllProducts");
            return (Criteria) this;
        }

        public Criteria andApplyToAllProductsNotBetween(String value1, String value2) {
            addCriterion("APPLY_TO_ALL_PRODUCTS not between", value1, value2, "applyToAllProducts");
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