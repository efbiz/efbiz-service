package org.efbiz.product.store.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductStoreVendorPaymentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public ProductStoreVendorPaymentExample() {
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

        public Criteria andVendorPartyIdIsNull() {
            addCriterion("VENDOR_PARTY_ID is null");
            return (Criteria) this;
        }

        public Criteria andVendorPartyIdIsNotNull() {
            addCriterion("VENDOR_PARTY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVendorPartyIdEqualTo(String value) {
            addCriterion("VENDOR_PARTY_ID =", value, "vendorPartyId");
            return (Criteria) this;
        }

        public Criteria andVendorPartyIdNotEqualTo(String value) {
            addCriterion("VENDOR_PARTY_ID <>", value, "vendorPartyId");
            return (Criteria) this;
        }

        public Criteria andVendorPartyIdGreaterThan(String value) {
            addCriterion("VENDOR_PARTY_ID >", value, "vendorPartyId");
            return (Criteria) this;
        }

        public Criteria andVendorPartyIdGreaterThanOrEqualTo(String value) {
            addCriterion("VENDOR_PARTY_ID >=", value, "vendorPartyId");
            return (Criteria) this;
        }

        public Criteria andVendorPartyIdLessThan(String value) {
            addCriterion("VENDOR_PARTY_ID <", value, "vendorPartyId");
            return (Criteria) this;
        }

        public Criteria andVendorPartyIdLessThanOrEqualTo(String value) {
            addCriterion("VENDOR_PARTY_ID <=", value, "vendorPartyId");
            return (Criteria) this;
        }

        public Criteria andVendorPartyIdLike(String value) {
            addCriterion("VENDOR_PARTY_ID like", value, "vendorPartyId");
            return (Criteria) this;
        }

        public Criteria andVendorPartyIdNotLike(String value) {
            addCriterion("VENDOR_PARTY_ID not like", value, "vendorPartyId");
            return (Criteria) this;
        }

        public Criteria andVendorPartyIdIn(List<String> values) {
            addCriterion("VENDOR_PARTY_ID in", values, "vendorPartyId");
            return (Criteria) this;
        }

        public Criteria andVendorPartyIdNotIn(List<String> values) {
            addCriterion("VENDOR_PARTY_ID not in", values, "vendorPartyId");
            return (Criteria) this;
        }

        public Criteria andVendorPartyIdBetween(String value1, String value2) {
            addCriterion("VENDOR_PARTY_ID between", value1, value2, "vendorPartyId");
            return (Criteria) this;
        }

        public Criteria andVendorPartyIdNotBetween(String value1, String value2) {
            addCriterion("VENDOR_PARTY_ID not between", value1, value2, "vendorPartyId");
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

        public Criteria andCreditCardEnumIdIsNull() {
            addCriterion("CREDIT_CARD_ENUM_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreditCardEnumIdIsNotNull() {
            addCriterion("CREDIT_CARD_ENUM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreditCardEnumIdEqualTo(String value) {
            addCriterion("CREDIT_CARD_ENUM_ID =", value, "creditCardEnumId");
            return (Criteria) this;
        }

        public Criteria andCreditCardEnumIdNotEqualTo(String value) {
            addCriterion("CREDIT_CARD_ENUM_ID <>", value, "creditCardEnumId");
            return (Criteria) this;
        }

        public Criteria andCreditCardEnumIdGreaterThan(String value) {
            addCriterion("CREDIT_CARD_ENUM_ID >", value, "creditCardEnumId");
            return (Criteria) this;
        }

        public Criteria andCreditCardEnumIdGreaterThanOrEqualTo(String value) {
            addCriterion("CREDIT_CARD_ENUM_ID >=", value, "creditCardEnumId");
            return (Criteria) this;
        }

        public Criteria andCreditCardEnumIdLessThan(String value) {
            addCriterion("CREDIT_CARD_ENUM_ID <", value, "creditCardEnumId");
            return (Criteria) this;
        }

        public Criteria andCreditCardEnumIdLessThanOrEqualTo(String value) {
            addCriterion("CREDIT_CARD_ENUM_ID <=", value, "creditCardEnumId");
            return (Criteria) this;
        }

        public Criteria andCreditCardEnumIdLike(String value) {
            addCriterion("CREDIT_CARD_ENUM_ID like", value, "creditCardEnumId");
            return (Criteria) this;
        }

        public Criteria andCreditCardEnumIdNotLike(String value) {
            addCriterion("CREDIT_CARD_ENUM_ID not like", value, "creditCardEnumId");
            return (Criteria) this;
        }

        public Criteria andCreditCardEnumIdIn(List<String> values) {
            addCriterion("CREDIT_CARD_ENUM_ID in", values, "creditCardEnumId");
            return (Criteria) this;
        }

        public Criteria andCreditCardEnumIdNotIn(List<String> values) {
            addCriterion("CREDIT_CARD_ENUM_ID not in", values, "creditCardEnumId");
            return (Criteria) this;
        }

        public Criteria andCreditCardEnumIdBetween(String value1, String value2) {
            addCriterion("CREDIT_CARD_ENUM_ID between", value1, value2, "creditCardEnumId");
            return (Criteria) this;
        }

        public Criteria andCreditCardEnumIdNotBetween(String value1, String value2) {
            addCriterion("CREDIT_CARD_ENUM_ID not between", value1, value2, "creditCardEnumId");
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