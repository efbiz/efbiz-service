package org.efbiz.product.store.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductStoreFinActSettingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public ProductStoreFinActSettingExample() {
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

        public Criteria andFinAccountTypeIdIsNull() {
            addCriterion("FIN_ACCOUNT_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andFinAccountTypeIdIsNotNull() {
            addCriterion("FIN_ACCOUNT_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFinAccountTypeIdEqualTo(String value) {
            addCriterion("FIN_ACCOUNT_TYPE_ID =", value, "finAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andFinAccountTypeIdNotEqualTo(String value) {
            addCriterion("FIN_ACCOUNT_TYPE_ID <>", value, "finAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andFinAccountTypeIdGreaterThan(String value) {
            addCriterion("FIN_ACCOUNT_TYPE_ID >", value, "finAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andFinAccountTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("FIN_ACCOUNT_TYPE_ID >=", value, "finAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andFinAccountTypeIdLessThan(String value) {
            addCriterion("FIN_ACCOUNT_TYPE_ID <", value, "finAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andFinAccountTypeIdLessThanOrEqualTo(String value) {
            addCriterion("FIN_ACCOUNT_TYPE_ID <=", value, "finAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andFinAccountTypeIdLike(String value) {
            addCriterion("FIN_ACCOUNT_TYPE_ID like", value, "finAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andFinAccountTypeIdNotLike(String value) {
            addCriterion("FIN_ACCOUNT_TYPE_ID not like", value, "finAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andFinAccountTypeIdIn(List<String> values) {
            addCriterion("FIN_ACCOUNT_TYPE_ID in", values, "finAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andFinAccountTypeIdNotIn(List<String> values) {
            addCriterion("FIN_ACCOUNT_TYPE_ID not in", values, "finAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andFinAccountTypeIdBetween(String value1, String value2) {
            addCriterion("FIN_ACCOUNT_TYPE_ID between", value1, value2, "finAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andFinAccountTypeIdNotBetween(String value1, String value2) {
            addCriterion("FIN_ACCOUNT_TYPE_ID not between", value1, value2, "finAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andRequirePinCodeIsNull() {
            addCriterion("REQUIRE_PIN_CODE is null");
            return (Criteria) this;
        }

        public Criteria andRequirePinCodeIsNotNull() {
            addCriterion("REQUIRE_PIN_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andRequirePinCodeEqualTo(String value) {
            addCriterion("REQUIRE_PIN_CODE =", value, "requirePinCode");
            return (Criteria) this;
        }

        public Criteria andRequirePinCodeNotEqualTo(String value) {
            addCriterion("REQUIRE_PIN_CODE <>", value, "requirePinCode");
            return (Criteria) this;
        }

        public Criteria andRequirePinCodeGreaterThan(String value) {
            addCriterion("REQUIRE_PIN_CODE >", value, "requirePinCode");
            return (Criteria) this;
        }

        public Criteria andRequirePinCodeGreaterThanOrEqualTo(String value) {
            addCriterion("REQUIRE_PIN_CODE >=", value, "requirePinCode");
            return (Criteria) this;
        }

        public Criteria andRequirePinCodeLessThan(String value) {
            addCriterion("REQUIRE_PIN_CODE <", value, "requirePinCode");
            return (Criteria) this;
        }

        public Criteria andRequirePinCodeLessThanOrEqualTo(String value) {
            addCriterion("REQUIRE_PIN_CODE <=", value, "requirePinCode");
            return (Criteria) this;
        }

        public Criteria andRequirePinCodeLike(String value) {
            addCriterion("REQUIRE_PIN_CODE like", value, "requirePinCode");
            return (Criteria) this;
        }

        public Criteria andRequirePinCodeNotLike(String value) {
            addCriterion("REQUIRE_PIN_CODE not like", value, "requirePinCode");
            return (Criteria) this;
        }

        public Criteria andRequirePinCodeIn(List<String> values) {
            addCriterion("REQUIRE_PIN_CODE in", values, "requirePinCode");
            return (Criteria) this;
        }

        public Criteria andRequirePinCodeNotIn(List<String> values) {
            addCriterion("REQUIRE_PIN_CODE not in", values, "requirePinCode");
            return (Criteria) this;
        }

        public Criteria andRequirePinCodeBetween(String value1, String value2) {
            addCriterion("REQUIRE_PIN_CODE between", value1, value2, "requirePinCode");
            return (Criteria) this;
        }

        public Criteria andRequirePinCodeNotBetween(String value1, String value2) {
            addCriterion("REQUIRE_PIN_CODE not between", value1, value2, "requirePinCode");
            return (Criteria) this;
        }

        public Criteria andValidateGCFinAcctIsNull() {
            addCriterion("VALIDATE_G_C_FIN_ACCT is null");
            return (Criteria) this;
        }

        public Criteria andValidateGCFinAcctIsNotNull() {
            addCriterion("VALIDATE_G_C_FIN_ACCT is not null");
            return (Criteria) this;
        }

        public Criteria andValidateGCFinAcctEqualTo(String value) {
            addCriterion("VALIDATE_G_C_FIN_ACCT =", value, "validateGCFinAcct");
            return (Criteria) this;
        }

        public Criteria andValidateGCFinAcctNotEqualTo(String value) {
            addCriterion("VALIDATE_G_C_FIN_ACCT <>", value, "validateGCFinAcct");
            return (Criteria) this;
        }

        public Criteria andValidateGCFinAcctGreaterThan(String value) {
            addCriterion("VALIDATE_G_C_FIN_ACCT >", value, "validateGCFinAcct");
            return (Criteria) this;
        }

        public Criteria andValidateGCFinAcctGreaterThanOrEqualTo(String value) {
            addCriterion("VALIDATE_G_C_FIN_ACCT >=", value, "validateGCFinAcct");
            return (Criteria) this;
        }

        public Criteria andValidateGCFinAcctLessThan(String value) {
            addCriterion("VALIDATE_G_C_FIN_ACCT <", value, "validateGCFinAcct");
            return (Criteria) this;
        }

        public Criteria andValidateGCFinAcctLessThanOrEqualTo(String value) {
            addCriterion("VALIDATE_G_C_FIN_ACCT <=", value, "validateGCFinAcct");
            return (Criteria) this;
        }

        public Criteria andValidateGCFinAcctLike(String value) {
            addCriterion("VALIDATE_G_C_FIN_ACCT like", value, "validateGCFinAcct");
            return (Criteria) this;
        }

        public Criteria andValidateGCFinAcctNotLike(String value) {
            addCriterion("VALIDATE_G_C_FIN_ACCT not like", value, "validateGCFinAcct");
            return (Criteria) this;
        }

        public Criteria andValidateGCFinAcctIn(List<String> values) {
            addCriterion("VALIDATE_G_C_FIN_ACCT in", values, "validateGCFinAcct");
            return (Criteria) this;
        }

        public Criteria andValidateGCFinAcctNotIn(List<String> values) {
            addCriterion("VALIDATE_G_C_FIN_ACCT not in", values, "validateGCFinAcct");
            return (Criteria) this;
        }

        public Criteria andValidateGCFinAcctBetween(String value1, String value2) {
            addCriterion("VALIDATE_G_C_FIN_ACCT between", value1, value2, "validateGCFinAcct");
            return (Criteria) this;
        }

        public Criteria andValidateGCFinAcctNotBetween(String value1, String value2) {
            addCriterion("VALIDATE_G_C_FIN_ACCT not between", value1, value2, "validateGCFinAcct");
            return (Criteria) this;
        }

        public Criteria andAccountCodeLengthIsNull() {
            addCriterion("ACCOUNT_CODE_LENGTH is null");
            return (Criteria) this;
        }

        public Criteria andAccountCodeLengthIsNotNull() {
            addCriterion("ACCOUNT_CODE_LENGTH is not null");
            return (Criteria) this;
        }

        public Criteria andAccountCodeLengthEqualTo(BigDecimal value) {
            addCriterion("ACCOUNT_CODE_LENGTH =", value, "accountCodeLength");
            return (Criteria) this;
        }

        public Criteria andAccountCodeLengthNotEqualTo(BigDecimal value) {
            addCriterion("ACCOUNT_CODE_LENGTH <>", value, "accountCodeLength");
            return (Criteria) this;
        }

        public Criteria andAccountCodeLengthGreaterThan(BigDecimal value) {
            addCriterion("ACCOUNT_CODE_LENGTH >", value, "accountCodeLength");
            return (Criteria) this;
        }

        public Criteria andAccountCodeLengthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCOUNT_CODE_LENGTH >=", value, "accountCodeLength");
            return (Criteria) this;
        }

        public Criteria andAccountCodeLengthLessThan(BigDecimal value) {
            addCriterion("ACCOUNT_CODE_LENGTH <", value, "accountCodeLength");
            return (Criteria) this;
        }

        public Criteria andAccountCodeLengthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCOUNT_CODE_LENGTH <=", value, "accountCodeLength");
            return (Criteria) this;
        }

        public Criteria andAccountCodeLengthIn(List<BigDecimal> values) {
            addCriterion("ACCOUNT_CODE_LENGTH in", values, "accountCodeLength");
            return (Criteria) this;
        }

        public Criteria andAccountCodeLengthNotIn(List<BigDecimal> values) {
            addCriterion("ACCOUNT_CODE_LENGTH not in", values, "accountCodeLength");
            return (Criteria) this;
        }

        public Criteria andAccountCodeLengthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCOUNT_CODE_LENGTH between", value1, value2, "accountCodeLength");
            return (Criteria) this;
        }

        public Criteria andAccountCodeLengthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCOUNT_CODE_LENGTH not between", value1, value2, "accountCodeLength");
            return (Criteria) this;
        }

        public Criteria andPinCodeLengthIsNull() {
            addCriterion("PIN_CODE_LENGTH is null");
            return (Criteria) this;
        }

        public Criteria andPinCodeLengthIsNotNull() {
            addCriterion("PIN_CODE_LENGTH is not null");
            return (Criteria) this;
        }

        public Criteria andPinCodeLengthEqualTo(BigDecimal value) {
            addCriterion("PIN_CODE_LENGTH =", value, "pinCodeLength");
            return (Criteria) this;
        }

        public Criteria andPinCodeLengthNotEqualTo(BigDecimal value) {
            addCriterion("PIN_CODE_LENGTH <>", value, "pinCodeLength");
            return (Criteria) this;
        }

        public Criteria andPinCodeLengthGreaterThan(BigDecimal value) {
            addCriterion("PIN_CODE_LENGTH >", value, "pinCodeLength");
            return (Criteria) this;
        }

        public Criteria andPinCodeLengthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PIN_CODE_LENGTH >=", value, "pinCodeLength");
            return (Criteria) this;
        }

        public Criteria andPinCodeLengthLessThan(BigDecimal value) {
            addCriterion("PIN_CODE_LENGTH <", value, "pinCodeLength");
            return (Criteria) this;
        }

        public Criteria andPinCodeLengthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PIN_CODE_LENGTH <=", value, "pinCodeLength");
            return (Criteria) this;
        }

        public Criteria andPinCodeLengthIn(List<BigDecimal> values) {
            addCriterion("PIN_CODE_LENGTH in", values, "pinCodeLength");
            return (Criteria) this;
        }

        public Criteria andPinCodeLengthNotIn(List<BigDecimal> values) {
            addCriterion("PIN_CODE_LENGTH not in", values, "pinCodeLength");
            return (Criteria) this;
        }

        public Criteria andPinCodeLengthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PIN_CODE_LENGTH between", value1, value2, "pinCodeLength");
            return (Criteria) this;
        }

        public Criteria andPinCodeLengthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PIN_CODE_LENGTH not between", value1, value2, "pinCodeLength");
            return (Criteria) this;
        }

        public Criteria andAccountValidDaysIsNull() {
            addCriterion("ACCOUNT_VALID_DAYS is null");
            return (Criteria) this;
        }

        public Criteria andAccountValidDaysIsNotNull() {
            addCriterion("ACCOUNT_VALID_DAYS is not null");
            return (Criteria) this;
        }

        public Criteria andAccountValidDaysEqualTo(BigDecimal value) {
            addCriterion("ACCOUNT_VALID_DAYS =", value, "accountValidDays");
            return (Criteria) this;
        }

        public Criteria andAccountValidDaysNotEqualTo(BigDecimal value) {
            addCriterion("ACCOUNT_VALID_DAYS <>", value, "accountValidDays");
            return (Criteria) this;
        }

        public Criteria andAccountValidDaysGreaterThan(BigDecimal value) {
            addCriterion("ACCOUNT_VALID_DAYS >", value, "accountValidDays");
            return (Criteria) this;
        }

        public Criteria andAccountValidDaysGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCOUNT_VALID_DAYS >=", value, "accountValidDays");
            return (Criteria) this;
        }

        public Criteria andAccountValidDaysLessThan(BigDecimal value) {
            addCriterion("ACCOUNT_VALID_DAYS <", value, "accountValidDays");
            return (Criteria) this;
        }

        public Criteria andAccountValidDaysLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCOUNT_VALID_DAYS <=", value, "accountValidDays");
            return (Criteria) this;
        }

        public Criteria andAccountValidDaysIn(List<BigDecimal> values) {
            addCriterion("ACCOUNT_VALID_DAYS in", values, "accountValidDays");
            return (Criteria) this;
        }

        public Criteria andAccountValidDaysNotIn(List<BigDecimal> values) {
            addCriterion("ACCOUNT_VALID_DAYS not in", values, "accountValidDays");
            return (Criteria) this;
        }

        public Criteria andAccountValidDaysBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCOUNT_VALID_DAYS between", value1, value2, "accountValidDays");
            return (Criteria) this;
        }

        public Criteria andAccountValidDaysNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCOUNT_VALID_DAYS not between", value1, value2, "accountValidDays");
            return (Criteria) this;
        }

        public Criteria andAuthValidDaysIsNull() {
            addCriterion("AUTH_VALID_DAYS is null");
            return (Criteria) this;
        }

        public Criteria andAuthValidDaysIsNotNull() {
            addCriterion("AUTH_VALID_DAYS is not null");
            return (Criteria) this;
        }

        public Criteria andAuthValidDaysEqualTo(BigDecimal value) {
            addCriterion("AUTH_VALID_DAYS =", value, "authValidDays");
            return (Criteria) this;
        }

        public Criteria andAuthValidDaysNotEqualTo(BigDecimal value) {
            addCriterion("AUTH_VALID_DAYS <>", value, "authValidDays");
            return (Criteria) this;
        }

        public Criteria andAuthValidDaysGreaterThan(BigDecimal value) {
            addCriterion("AUTH_VALID_DAYS >", value, "authValidDays");
            return (Criteria) this;
        }

        public Criteria andAuthValidDaysGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AUTH_VALID_DAYS >=", value, "authValidDays");
            return (Criteria) this;
        }

        public Criteria andAuthValidDaysLessThan(BigDecimal value) {
            addCriterion("AUTH_VALID_DAYS <", value, "authValidDays");
            return (Criteria) this;
        }

        public Criteria andAuthValidDaysLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AUTH_VALID_DAYS <=", value, "authValidDays");
            return (Criteria) this;
        }

        public Criteria andAuthValidDaysIn(List<BigDecimal> values) {
            addCriterion("AUTH_VALID_DAYS in", values, "authValidDays");
            return (Criteria) this;
        }

        public Criteria andAuthValidDaysNotIn(List<BigDecimal> values) {
            addCriterion("AUTH_VALID_DAYS not in", values, "authValidDays");
            return (Criteria) this;
        }

        public Criteria andAuthValidDaysBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AUTH_VALID_DAYS between", value1, value2, "authValidDays");
            return (Criteria) this;
        }

        public Criteria andAuthValidDaysNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AUTH_VALID_DAYS not between", value1, value2, "authValidDays");
            return (Criteria) this;
        }

        public Criteria andPurchaseSurveyIdIsNull() {
            addCriterion("PURCHASE_SURVEY_ID is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseSurveyIdIsNotNull() {
            addCriterion("PURCHASE_SURVEY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseSurveyIdEqualTo(String value) {
            addCriterion("PURCHASE_SURVEY_ID =", value, "purchaseSurveyId");
            return (Criteria) this;
        }

        public Criteria andPurchaseSurveyIdNotEqualTo(String value) {
            addCriterion("PURCHASE_SURVEY_ID <>", value, "purchaseSurveyId");
            return (Criteria) this;
        }

        public Criteria andPurchaseSurveyIdGreaterThan(String value) {
            addCriterion("PURCHASE_SURVEY_ID >", value, "purchaseSurveyId");
            return (Criteria) this;
        }

        public Criteria andPurchaseSurveyIdGreaterThanOrEqualTo(String value) {
            addCriterion("PURCHASE_SURVEY_ID >=", value, "purchaseSurveyId");
            return (Criteria) this;
        }

        public Criteria andPurchaseSurveyIdLessThan(String value) {
            addCriterion("PURCHASE_SURVEY_ID <", value, "purchaseSurveyId");
            return (Criteria) this;
        }

        public Criteria andPurchaseSurveyIdLessThanOrEqualTo(String value) {
            addCriterion("PURCHASE_SURVEY_ID <=", value, "purchaseSurveyId");
            return (Criteria) this;
        }

        public Criteria andPurchaseSurveyIdLike(String value) {
            addCriterion("PURCHASE_SURVEY_ID like", value, "purchaseSurveyId");
            return (Criteria) this;
        }

        public Criteria andPurchaseSurveyIdNotLike(String value) {
            addCriterion("PURCHASE_SURVEY_ID not like", value, "purchaseSurveyId");
            return (Criteria) this;
        }

        public Criteria andPurchaseSurveyIdIn(List<String> values) {
            addCriterion("PURCHASE_SURVEY_ID in", values, "purchaseSurveyId");
            return (Criteria) this;
        }

        public Criteria andPurchaseSurveyIdNotIn(List<String> values) {
            addCriterion("PURCHASE_SURVEY_ID not in", values, "purchaseSurveyId");
            return (Criteria) this;
        }

        public Criteria andPurchaseSurveyIdBetween(String value1, String value2) {
            addCriterion("PURCHASE_SURVEY_ID between", value1, value2, "purchaseSurveyId");
            return (Criteria) this;
        }

        public Criteria andPurchaseSurveyIdNotBetween(String value1, String value2) {
            addCriterion("PURCHASE_SURVEY_ID not between", value1, value2, "purchaseSurveyId");
            return (Criteria) this;
        }

        public Criteria andPurchSurveySendToIsNull() {
            addCriterion("PURCH_SURVEY_SEND_TO is null");
            return (Criteria) this;
        }

        public Criteria andPurchSurveySendToIsNotNull() {
            addCriterion("PURCH_SURVEY_SEND_TO is not null");
            return (Criteria) this;
        }

        public Criteria andPurchSurveySendToEqualTo(String value) {
            addCriterion("PURCH_SURVEY_SEND_TO =", value, "purchSurveySendTo");
            return (Criteria) this;
        }

        public Criteria andPurchSurveySendToNotEqualTo(String value) {
            addCriterion("PURCH_SURVEY_SEND_TO <>", value, "purchSurveySendTo");
            return (Criteria) this;
        }

        public Criteria andPurchSurveySendToGreaterThan(String value) {
            addCriterion("PURCH_SURVEY_SEND_TO >", value, "purchSurveySendTo");
            return (Criteria) this;
        }

        public Criteria andPurchSurveySendToGreaterThanOrEqualTo(String value) {
            addCriterion("PURCH_SURVEY_SEND_TO >=", value, "purchSurveySendTo");
            return (Criteria) this;
        }

        public Criteria andPurchSurveySendToLessThan(String value) {
            addCriterion("PURCH_SURVEY_SEND_TO <", value, "purchSurveySendTo");
            return (Criteria) this;
        }

        public Criteria andPurchSurveySendToLessThanOrEqualTo(String value) {
            addCriterion("PURCH_SURVEY_SEND_TO <=", value, "purchSurveySendTo");
            return (Criteria) this;
        }

        public Criteria andPurchSurveySendToLike(String value) {
            addCriterion("PURCH_SURVEY_SEND_TO like", value, "purchSurveySendTo");
            return (Criteria) this;
        }

        public Criteria andPurchSurveySendToNotLike(String value) {
            addCriterion("PURCH_SURVEY_SEND_TO not like", value, "purchSurveySendTo");
            return (Criteria) this;
        }

        public Criteria andPurchSurveySendToIn(List<String> values) {
            addCriterion("PURCH_SURVEY_SEND_TO in", values, "purchSurveySendTo");
            return (Criteria) this;
        }

        public Criteria andPurchSurveySendToNotIn(List<String> values) {
            addCriterion("PURCH_SURVEY_SEND_TO not in", values, "purchSurveySendTo");
            return (Criteria) this;
        }

        public Criteria andPurchSurveySendToBetween(String value1, String value2) {
            addCriterion("PURCH_SURVEY_SEND_TO between", value1, value2, "purchSurveySendTo");
            return (Criteria) this;
        }

        public Criteria andPurchSurveySendToNotBetween(String value1, String value2) {
            addCriterion("PURCH_SURVEY_SEND_TO not between", value1, value2, "purchSurveySendTo");
            return (Criteria) this;
        }

        public Criteria andPurchSurveyCopyMeIsNull() {
            addCriterion("PURCH_SURVEY_COPY_ME is null");
            return (Criteria) this;
        }

        public Criteria andPurchSurveyCopyMeIsNotNull() {
            addCriterion("PURCH_SURVEY_COPY_ME is not null");
            return (Criteria) this;
        }

        public Criteria andPurchSurveyCopyMeEqualTo(String value) {
            addCriterion("PURCH_SURVEY_COPY_ME =", value, "purchSurveyCopyMe");
            return (Criteria) this;
        }

        public Criteria andPurchSurveyCopyMeNotEqualTo(String value) {
            addCriterion("PURCH_SURVEY_COPY_ME <>", value, "purchSurveyCopyMe");
            return (Criteria) this;
        }

        public Criteria andPurchSurveyCopyMeGreaterThan(String value) {
            addCriterion("PURCH_SURVEY_COPY_ME >", value, "purchSurveyCopyMe");
            return (Criteria) this;
        }

        public Criteria andPurchSurveyCopyMeGreaterThanOrEqualTo(String value) {
            addCriterion("PURCH_SURVEY_COPY_ME >=", value, "purchSurveyCopyMe");
            return (Criteria) this;
        }

        public Criteria andPurchSurveyCopyMeLessThan(String value) {
            addCriterion("PURCH_SURVEY_COPY_ME <", value, "purchSurveyCopyMe");
            return (Criteria) this;
        }

        public Criteria andPurchSurveyCopyMeLessThanOrEqualTo(String value) {
            addCriterion("PURCH_SURVEY_COPY_ME <=", value, "purchSurveyCopyMe");
            return (Criteria) this;
        }

        public Criteria andPurchSurveyCopyMeLike(String value) {
            addCriterion("PURCH_SURVEY_COPY_ME like", value, "purchSurveyCopyMe");
            return (Criteria) this;
        }

        public Criteria andPurchSurveyCopyMeNotLike(String value) {
            addCriterion("PURCH_SURVEY_COPY_ME not like", value, "purchSurveyCopyMe");
            return (Criteria) this;
        }

        public Criteria andPurchSurveyCopyMeIn(List<String> values) {
            addCriterion("PURCH_SURVEY_COPY_ME in", values, "purchSurveyCopyMe");
            return (Criteria) this;
        }

        public Criteria andPurchSurveyCopyMeNotIn(List<String> values) {
            addCriterion("PURCH_SURVEY_COPY_ME not in", values, "purchSurveyCopyMe");
            return (Criteria) this;
        }

        public Criteria andPurchSurveyCopyMeBetween(String value1, String value2) {
            addCriterion("PURCH_SURVEY_COPY_ME between", value1, value2, "purchSurveyCopyMe");
            return (Criteria) this;
        }

        public Criteria andPurchSurveyCopyMeNotBetween(String value1, String value2) {
            addCriterion("PURCH_SURVEY_COPY_ME not between", value1, value2, "purchSurveyCopyMe");
            return (Criteria) this;
        }

        public Criteria andAllowAuthToNegativeIsNull() {
            addCriterion("ALLOW_AUTH_TO_NEGATIVE is null");
            return (Criteria) this;
        }

        public Criteria andAllowAuthToNegativeIsNotNull() {
            addCriterion("ALLOW_AUTH_TO_NEGATIVE is not null");
            return (Criteria) this;
        }

        public Criteria andAllowAuthToNegativeEqualTo(String value) {
            addCriterion("ALLOW_AUTH_TO_NEGATIVE =", value, "allowAuthToNegative");
            return (Criteria) this;
        }

        public Criteria andAllowAuthToNegativeNotEqualTo(String value) {
            addCriterion("ALLOW_AUTH_TO_NEGATIVE <>", value, "allowAuthToNegative");
            return (Criteria) this;
        }

        public Criteria andAllowAuthToNegativeGreaterThan(String value) {
            addCriterion("ALLOW_AUTH_TO_NEGATIVE >", value, "allowAuthToNegative");
            return (Criteria) this;
        }

        public Criteria andAllowAuthToNegativeGreaterThanOrEqualTo(String value) {
            addCriterion("ALLOW_AUTH_TO_NEGATIVE >=", value, "allowAuthToNegative");
            return (Criteria) this;
        }

        public Criteria andAllowAuthToNegativeLessThan(String value) {
            addCriterion("ALLOW_AUTH_TO_NEGATIVE <", value, "allowAuthToNegative");
            return (Criteria) this;
        }

        public Criteria andAllowAuthToNegativeLessThanOrEqualTo(String value) {
            addCriterion("ALLOW_AUTH_TO_NEGATIVE <=", value, "allowAuthToNegative");
            return (Criteria) this;
        }

        public Criteria andAllowAuthToNegativeLike(String value) {
            addCriterion("ALLOW_AUTH_TO_NEGATIVE like", value, "allowAuthToNegative");
            return (Criteria) this;
        }

        public Criteria andAllowAuthToNegativeNotLike(String value) {
            addCriterion("ALLOW_AUTH_TO_NEGATIVE not like", value, "allowAuthToNegative");
            return (Criteria) this;
        }

        public Criteria andAllowAuthToNegativeIn(List<String> values) {
            addCriterion("ALLOW_AUTH_TO_NEGATIVE in", values, "allowAuthToNegative");
            return (Criteria) this;
        }

        public Criteria andAllowAuthToNegativeNotIn(List<String> values) {
            addCriterion("ALLOW_AUTH_TO_NEGATIVE not in", values, "allowAuthToNegative");
            return (Criteria) this;
        }

        public Criteria andAllowAuthToNegativeBetween(String value1, String value2) {
            addCriterion("ALLOW_AUTH_TO_NEGATIVE between", value1, value2, "allowAuthToNegative");
            return (Criteria) this;
        }

        public Criteria andAllowAuthToNegativeNotBetween(String value1, String value2) {
            addCriterion("ALLOW_AUTH_TO_NEGATIVE not between", value1, value2, "allowAuthToNegative");
            return (Criteria) this;
        }

        public Criteria andMinBalanceIsNull() {
            addCriterion("MIN_BALANCE is null");
            return (Criteria) this;
        }

        public Criteria andMinBalanceIsNotNull() {
            addCriterion("MIN_BALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andMinBalanceEqualTo(BigDecimal value) {
            addCriterion("MIN_BALANCE =", value, "minBalance");
            return (Criteria) this;
        }

        public Criteria andMinBalanceNotEqualTo(BigDecimal value) {
            addCriterion("MIN_BALANCE <>", value, "minBalance");
            return (Criteria) this;
        }

        public Criteria andMinBalanceGreaterThan(BigDecimal value) {
            addCriterion("MIN_BALANCE >", value, "minBalance");
            return (Criteria) this;
        }

        public Criteria andMinBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MIN_BALANCE >=", value, "minBalance");
            return (Criteria) this;
        }

        public Criteria andMinBalanceLessThan(BigDecimal value) {
            addCriterion("MIN_BALANCE <", value, "minBalance");
            return (Criteria) this;
        }

        public Criteria andMinBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MIN_BALANCE <=", value, "minBalance");
            return (Criteria) this;
        }

        public Criteria andMinBalanceIn(List<BigDecimal> values) {
            addCriterion("MIN_BALANCE in", values, "minBalance");
            return (Criteria) this;
        }

        public Criteria andMinBalanceNotIn(List<BigDecimal> values) {
            addCriterion("MIN_BALANCE not in", values, "minBalance");
            return (Criteria) this;
        }

        public Criteria andMinBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MIN_BALANCE between", value1, value2, "minBalance");
            return (Criteria) this;
        }

        public Criteria andMinBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MIN_BALANCE not between", value1, value2, "minBalance");
            return (Criteria) this;
        }

        public Criteria andReplenishThresholdIsNull() {
            addCriterion("REPLENISH_THRESHOLD is null");
            return (Criteria) this;
        }

        public Criteria andReplenishThresholdIsNotNull() {
            addCriterion("REPLENISH_THRESHOLD is not null");
            return (Criteria) this;
        }

        public Criteria andReplenishThresholdEqualTo(BigDecimal value) {
            addCriterion("REPLENISH_THRESHOLD =", value, "replenishThreshold");
            return (Criteria) this;
        }

        public Criteria andReplenishThresholdNotEqualTo(BigDecimal value) {
            addCriterion("REPLENISH_THRESHOLD <>", value, "replenishThreshold");
            return (Criteria) this;
        }

        public Criteria andReplenishThresholdGreaterThan(BigDecimal value) {
            addCriterion("REPLENISH_THRESHOLD >", value, "replenishThreshold");
            return (Criteria) this;
        }

        public Criteria andReplenishThresholdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REPLENISH_THRESHOLD >=", value, "replenishThreshold");
            return (Criteria) this;
        }

        public Criteria andReplenishThresholdLessThan(BigDecimal value) {
            addCriterion("REPLENISH_THRESHOLD <", value, "replenishThreshold");
            return (Criteria) this;
        }

        public Criteria andReplenishThresholdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REPLENISH_THRESHOLD <=", value, "replenishThreshold");
            return (Criteria) this;
        }

        public Criteria andReplenishThresholdIn(List<BigDecimal> values) {
            addCriterion("REPLENISH_THRESHOLD in", values, "replenishThreshold");
            return (Criteria) this;
        }

        public Criteria andReplenishThresholdNotIn(List<BigDecimal> values) {
            addCriterion("REPLENISH_THRESHOLD not in", values, "replenishThreshold");
            return (Criteria) this;
        }

        public Criteria andReplenishThresholdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REPLENISH_THRESHOLD between", value1, value2, "replenishThreshold");
            return (Criteria) this;
        }

        public Criteria andReplenishThresholdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REPLENISH_THRESHOLD not between", value1, value2, "replenishThreshold");
            return (Criteria) this;
        }

        public Criteria andReplenishMethodEnumIdIsNull() {
            addCriterion("REPLENISH_METHOD_ENUM_ID is null");
            return (Criteria) this;
        }

        public Criteria andReplenishMethodEnumIdIsNotNull() {
            addCriterion("REPLENISH_METHOD_ENUM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andReplenishMethodEnumIdEqualTo(String value) {
            addCriterion("REPLENISH_METHOD_ENUM_ID =", value, "replenishMethodEnumId");
            return (Criteria) this;
        }

        public Criteria andReplenishMethodEnumIdNotEqualTo(String value) {
            addCriterion("REPLENISH_METHOD_ENUM_ID <>", value, "replenishMethodEnumId");
            return (Criteria) this;
        }

        public Criteria andReplenishMethodEnumIdGreaterThan(String value) {
            addCriterion("REPLENISH_METHOD_ENUM_ID >", value, "replenishMethodEnumId");
            return (Criteria) this;
        }

        public Criteria andReplenishMethodEnumIdGreaterThanOrEqualTo(String value) {
            addCriterion("REPLENISH_METHOD_ENUM_ID >=", value, "replenishMethodEnumId");
            return (Criteria) this;
        }

        public Criteria andReplenishMethodEnumIdLessThan(String value) {
            addCriterion("REPLENISH_METHOD_ENUM_ID <", value, "replenishMethodEnumId");
            return (Criteria) this;
        }

        public Criteria andReplenishMethodEnumIdLessThanOrEqualTo(String value) {
            addCriterion("REPLENISH_METHOD_ENUM_ID <=", value, "replenishMethodEnumId");
            return (Criteria) this;
        }

        public Criteria andReplenishMethodEnumIdLike(String value) {
            addCriterion("REPLENISH_METHOD_ENUM_ID like", value, "replenishMethodEnumId");
            return (Criteria) this;
        }

        public Criteria andReplenishMethodEnumIdNotLike(String value) {
            addCriterion("REPLENISH_METHOD_ENUM_ID not like", value, "replenishMethodEnumId");
            return (Criteria) this;
        }

        public Criteria andReplenishMethodEnumIdIn(List<String> values) {
            addCriterion("REPLENISH_METHOD_ENUM_ID in", values, "replenishMethodEnumId");
            return (Criteria) this;
        }

        public Criteria andReplenishMethodEnumIdNotIn(List<String> values) {
            addCriterion("REPLENISH_METHOD_ENUM_ID not in", values, "replenishMethodEnumId");
            return (Criteria) this;
        }

        public Criteria andReplenishMethodEnumIdBetween(String value1, String value2) {
            addCriterion("REPLENISH_METHOD_ENUM_ID between", value1, value2, "replenishMethodEnumId");
            return (Criteria) this;
        }

        public Criteria andReplenishMethodEnumIdNotBetween(String value1, String value2) {
            addCriterion("REPLENISH_METHOD_ENUM_ID not between", value1, value2, "replenishMethodEnumId");
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