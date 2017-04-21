package org.efbiz.product.promo.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductPromoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public ProductPromoExample() {
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

        public Criteria andProductPromoIdIsNull() {
            addCriterion("PRODUCT_PROMO_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductPromoIdIsNotNull() {
            addCriterion("PRODUCT_PROMO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductPromoIdEqualTo(String value) {
            addCriterion("PRODUCT_PROMO_ID =", value, "productPromoId");
            return (Criteria) this;
        }

        public Criteria andProductPromoIdNotEqualTo(String value) {
            addCriterion("PRODUCT_PROMO_ID <>", value, "productPromoId");
            return (Criteria) this;
        }

        public Criteria andProductPromoIdGreaterThan(String value) {
            addCriterion("PRODUCT_PROMO_ID >", value, "productPromoId");
            return (Criteria) this;
        }

        public Criteria andProductPromoIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_PROMO_ID >=", value, "productPromoId");
            return (Criteria) this;
        }

        public Criteria andProductPromoIdLessThan(String value) {
            addCriterion("PRODUCT_PROMO_ID <", value, "productPromoId");
            return (Criteria) this;
        }

        public Criteria andProductPromoIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_PROMO_ID <=", value, "productPromoId");
            return (Criteria) this;
        }

        public Criteria andProductPromoIdLike(String value) {
            addCriterion("PRODUCT_PROMO_ID like", value, "productPromoId");
            return (Criteria) this;
        }

        public Criteria andProductPromoIdNotLike(String value) {
            addCriterion("PRODUCT_PROMO_ID not like", value, "productPromoId");
            return (Criteria) this;
        }

        public Criteria andProductPromoIdIn(List<String> values) {
            addCriterion("PRODUCT_PROMO_ID in", values, "productPromoId");
            return (Criteria) this;
        }

        public Criteria andProductPromoIdNotIn(List<String> values) {
            addCriterion("PRODUCT_PROMO_ID not in", values, "productPromoId");
            return (Criteria) this;
        }

        public Criteria andProductPromoIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_PROMO_ID between", value1, value2, "productPromoId");
            return (Criteria) this;
        }

        public Criteria andProductPromoIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_PROMO_ID not between", value1, value2, "productPromoId");
            return (Criteria) this;
        }

        public Criteria andPromoNameIsNull() {
            addCriterion("PROMO_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPromoNameIsNotNull() {
            addCriterion("PROMO_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPromoNameEqualTo(String value) {
            addCriterion("PROMO_NAME =", value, "promoName");
            return (Criteria) this;
        }

        public Criteria andPromoNameNotEqualTo(String value) {
            addCriterion("PROMO_NAME <>", value, "promoName");
            return (Criteria) this;
        }

        public Criteria andPromoNameGreaterThan(String value) {
            addCriterion("PROMO_NAME >", value, "promoName");
            return (Criteria) this;
        }

        public Criteria andPromoNameGreaterThanOrEqualTo(String value) {
            addCriterion("PROMO_NAME >=", value, "promoName");
            return (Criteria) this;
        }

        public Criteria andPromoNameLessThan(String value) {
            addCriterion("PROMO_NAME <", value, "promoName");
            return (Criteria) this;
        }

        public Criteria andPromoNameLessThanOrEqualTo(String value) {
            addCriterion("PROMO_NAME <=", value, "promoName");
            return (Criteria) this;
        }

        public Criteria andPromoNameLike(String value) {
            addCriterion("PROMO_NAME like", value, "promoName");
            return (Criteria) this;
        }

        public Criteria andPromoNameNotLike(String value) {
            addCriterion("PROMO_NAME not like", value, "promoName");
            return (Criteria) this;
        }

        public Criteria andPromoNameIn(List<String> values) {
            addCriterion("PROMO_NAME in", values, "promoName");
            return (Criteria) this;
        }

        public Criteria andPromoNameNotIn(List<String> values) {
            addCriterion("PROMO_NAME not in", values, "promoName");
            return (Criteria) this;
        }

        public Criteria andPromoNameBetween(String value1, String value2) {
            addCriterion("PROMO_NAME between", value1, value2, "promoName");
            return (Criteria) this;
        }

        public Criteria andPromoNameNotBetween(String value1, String value2) {
            addCriterion("PROMO_NAME not between", value1, value2, "promoName");
            return (Criteria) this;
        }

        public Criteria andPromoTextIsNull() {
            addCriterion("PROMO_TEXT is null");
            return (Criteria) this;
        }

        public Criteria andPromoTextIsNotNull() {
            addCriterion("PROMO_TEXT is not null");
            return (Criteria) this;
        }

        public Criteria andPromoTextEqualTo(String value) {
            addCriterion("PROMO_TEXT =", value, "promoText");
            return (Criteria) this;
        }

        public Criteria andPromoTextNotEqualTo(String value) {
            addCriterion("PROMO_TEXT <>", value, "promoText");
            return (Criteria) this;
        }

        public Criteria andPromoTextGreaterThan(String value) {
            addCriterion("PROMO_TEXT >", value, "promoText");
            return (Criteria) this;
        }

        public Criteria andPromoTextGreaterThanOrEqualTo(String value) {
            addCriterion("PROMO_TEXT >=", value, "promoText");
            return (Criteria) this;
        }

        public Criteria andPromoTextLessThan(String value) {
            addCriterion("PROMO_TEXT <", value, "promoText");
            return (Criteria) this;
        }

        public Criteria andPromoTextLessThanOrEqualTo(String value) {
            addCriterion("PROMO_TEXT <=", value, "promoText");
            return (Criteria) this;
        }

        public Criteria andPromoTextLike(String value) {
            addCriterion("PROMO_TEXT like", value, "promoText");
            return (Criteria) this;
        }

        public Criteria andPromoTextNotLike(String value) {
            addCriterion("PROMO_TEXT not like", value, "promoText");
            return (Criteria) this;
        }

        public Criteria andPromoTextIn(List<String> values) {
            addCriterion("PROMO_TEXT in", values, "promoText");
            return (Criteria) this;
        }

        public Criteria andPromoTextNotIn(List<String> values) {
            addCriterion("PROMO_TEXT not in", values, "promoText");
            return (Criteria) this;
        }

        public Criteria andPromoTextBetween(String value1, String value2) {
            addCriterion("PROMO_TEXT between", value1, value2, "promoText");
            return (Criteria) this;
        }

        public Criteria andPromoTextNotBetween(String value1, String value2) {
            addCriterion("PROMO_TEXT not between", value1, value2, "promoText");
            return (Criteria) this;
        }

        public Criteria andUserEnteredIsNull() {
            addCriterion("USER_ENTERED is null");
            return (Criteria) this;
        }

        public Criteria andUserEnteredIsNotNull() {
            addCriterion("USER_ENTERED is not null");
            return (Criteria) this;
        }

        public Criteria andUserEnteredEqualTo(String value) {
            addCriterion("USER_ENTERED =", value, "userEntered");
            return (Criteria) this;
        }

        public Criteria andUserEnteredNotEqualTo(String value) {
            addCriterion("USER_ENTERED <>", value, "userEntered");
            return (Criteria) this;
        }

        public Criteria andUserEnteredGreaterThan(String value) {
            addCriterion("USER_ENTERED >", value, "userEntered");
            return (Criteria) this;
        }

        public Criteria andUserEnteredGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ENTERED >=", value, "userEntered");
            return (Criteria) this;
        }

        public Criteria andUserEnteredLessThan(String value) {
            addCriterion("USER_ENTERED <", value, "userEntered");
            return (Criteria) this;
        }

        public Criteria andUserEnteredLessThanOrEqualTo(String value) {
            addCriterion("USER_ENTERED <=", value, "userEntered");
            return (Criteria) this;
        }

        public Criteria andUserEnteredLike(String value) {
            addCriterion("USER_ENTERED like", value, "userEntered");
            return (Criteria) this;
        }

        public Criteria andUserEnteredNotLike(String value) {
            addCriterion("USER_ENTERED not like", value, "userEntered");
            return (Criteria) this;
        }

        public Criteria andUserEnteredIn(List<String> values) {
            addCriterion("USER_ENTERED in", values, "userEntered");
            return (Criteria) this;
        }

        public Criteria andUserEnteredNotIn(List<String> values) {
            addCriterion("USER_ENTERED not in", values, "userEntered");
            return (Criteria) this;
        }

        public Criteria andUserEnteredBetween(String value1, String value2) {
            addCriterion("USER_ENTERED between", value1, value2, "userEntered");
            return (Criteria) this;
        }

        public Criteria andUserEnteredNotBetween(String value1, String value2) {
            addCriterion("USER_ENTERED not between", value1, value2, "userEntered");
            return (Criteria) this;
        }

        public Criteria andShowToCustomerIsNull() {
            addCriterion("SHOW_TO_CUSTOMER is null");
            return (Criteria) this;
        }

        public Criteria andShowToCustomerIsNotNull() {
            addCriterion("SHOW_TO_CUSTOMER is not null");
            return (Criteria) this;
        }

        public Criteria andShowToCustomerEqualTo(String value) {
            addCriterion("SHOW_TO_CUSTOMER =", value, "showToCustomer");
            return (Criteria) this;
        }

        public Criteria andShowToCustomerNotEqualTo(String value) {
            addCriterion("SHOW_TO_CUSTOMER <>", value, "showToCustomer");
            return (Criteria) this;
        }

        public Criteria andShowToCustomerGreaterThan(String value) {
            addCriterion("SHOW_TO_CUSTOMER >", value, "showToCustomer");
            return (Criteria) this;
        }

        public Criteria andShowToCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("SHOW_TO_CUSTOMER >=", value, "showToCustomer");
            return (Criteria) this;
        }

        public Criteria andShowToCustomerLessThan(String value) {
            addCriterion("SHOW_TO_CUSTOMER <", value, "showToCustomer");
            return (Criteria) this;
        }

        public Criteria andShowToCustomerLessThanOrEqualTo(String value) {
            addCriterion("SHOW_TO_CUSTOMER <=", value, "showToCustomer");
            return (Criteria) this;
        }

        public Criteria andShowToCustomerLike(String value) {
            addCriterion("SHOW_TO_CUSTOMER like", value, "showToCustomer");
            return (Criteria) this;
        }

        public Criteria andShowToCustomerNotLike(String value) {
            addCriterion("SHOW_TO_CUSTOMER not like", value, "showToCustomer");
            return (Criteria) this;
        }

        public Criteria andShowToCustomerIn(List<String> values) {
            addCriterion("SHOW_TO_CUSTOMER in", values, "showToCustomer");
            return (Criteria) this;
        }

        public Criteria andShowToCustomerNotIn(List<String> values) {
            addCriterion("SHOW_TO_CUSTOMER not in", values, "showToCustomer");
            return (Criteria) this;
        }

        public Criteria andShowToCustomerBetween(String value1, String value2) {
            addCriterion("SHOW_TO_CUSTOMER between", value1, value2, "showToCustomer");
            return (Criteria) this;
        }

        public Criteria andShowToCustomerNotBetween(String value1, String value2) {
            addCriterion("SHOW_TO_CUSTOMER not between", value1, value2, "showToCustomer");
            return (Criteria) this;
        }

        public Criteria andRequireCodeIsNull() {
            addCriterion("REQUIRE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andRequireCodeIsNotNull() {
            addCriterion("REQUIRE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andRequireCodeEqualTo(String value) {
            addCriterion("REQUIRE_CODE =", value, "requireCode");
            return (Criteria) this;
        }

        public Criteria andRequireCodeNotEqualTo(String value) {
            addCriterion("REQUIRE_CODE <>", value, "requireCode");
            return (Criteria) this;
        }

        public Criteria andRequireCodeGreaterThan(String value) {
            addCriterion("REQUIRE_CODE >", value, "requireCode");
            return (Criteria) this;
        }

        public Criteria andRequireCodeGreaterThanOrEqualTo(String value) {
            addCriterion("REQUIRE_CODE >=", value, "requireCode");
            return (Criteria) this;
        }

        public Criteria andRequireCodeLessThan(String value) {
            addCriterion("REQUIRE_CODE <", value, "requireCode");
            return (Criteria) this;
        }

        public Criteria andRequireCodeLessThanOrEqualTo(String value) {
            addCriterion("REQUIRE_CODE <=", value, "requireCode");
            return (Criteria) this;
        }

        public Criteria andRequireCodeLike(String value) {
            addCriterion("REQUIRE_CODE like", value, "requireCode");
            return (Criteria) this;
        }

        public Criteria andRequireCodeNotLike(String value) {
            addCriterion("REQUIRE_CODE not like", value, "requireCode");
            return (Criteria) this;
        }

        public Criteria andRequireCodeIn(List<String> values) {
            addCriterion("REQUIRE_CODE in", values, "requireCode");
            return (Criteria) this;
        }

        public Criteria andRequireCodeNotIn(List<String> values) {
            addCriterion("REQUIRE_CODE not in", values, "requireCode");
            return (Criteria) this;
        }

        public Criteria andRequireCodeBetween(String value1, String value2) {
            addCriterion("REQUIRE_CODE between", value1, value2, "requireCode");
            return (Criteria) this;
        }

        public Criteria andRequireCodeNotBetween(String value1, String value2) {
            addCriterion("REQUIRE_CODE not between", value1, value2, "requireCode");
            return (Criteria) this;
        }

        public Criteria andUseLimitPerOrderIsNull() {
            addCriterion("USE_LIMIT_PER_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andUseLimitPerOrderIsNotNull() {
            addCriterion("USE_LIMIT_PER_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andUseLimitPerOrderEqualTo(BigDecimal value) {
            addCriterion("USE_LIMIT_PER_ORDER =", value, "useLimitPerOrder");
            return (Criteria) this;
        }

        public Criteria andUseLimitPerOrderNotEqualTo(BigDecimal value) {
            addCriterion("USE_LIMIT_PER_ORDER <>", value, "useLimitPerOrder");
            return (Criteria) this;
        }

        public Criteria andUseLimitPerOrderGreaterThan(BigDecimal value) {
            addCriterion("USE_LIMIT_PER_ORDER >", value, "useLimitPerOrder");
            return (Criteria) this;
        }

        public Criteria andUseLimitPerOrderGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("USE_LIMIT_PER_ORDER >=", value, "useLimitPerOrder");
            return (Criteria) this;
        }

        public Criteria andUseLimitPerOrderLessThan(BigDecimal value) {
            addCriterion("USE_LIMIT_PER_ORDER <", value, "useLimitPerOrder");
            return (Criteria) this;
        }

        public Criteria andUseLimitPerOrderLessThanOrEqualTo(BigDecimal value) {
            addCriterion("USE_LIMIT_PER_ORDER <=", value, "useLimitPerOrder");
            return (Criteria) this;
        }

        public Criteria andUseLimitPerOrderIn(List<BigDecimal> values) {
            addCriterion("USE_LIMIT_PER_ORDER in", values, "useLimitPerOrder");
            return (Criteria) this;
        }

        public Criteria andUseLimitPerOrderNotIn(List<BigDecimal> values) {
            addCriterion("USE_LIMIT_PER_ORDER not in", values, "useLimitPerOrder");
            return (Criteria) this;
        }

        public Criteria andUseLimitPerOrderBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USE_LIMIT_PER_ORDER between", value1, value2, "useLimitPerOrder");
            return (Criteria) this;
        }

        public Criteria andUseLimitPerOrderNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USE_LIMIT_PER_ORDER not between", value1, value2, "useLimitPerOrder");
            return (Criteria) this;
        }

        public Criteria andUseLimitPerCustomerIsNull() {
            addCriterion("USE_LIMIT_PER_CUSTOMER is null");
            return (Criteria) this;
        }

        public Criteria andUseLimitPerCustomerIsNotNull() {
            addCriterion("USE_LIMIT_PER_CUSTOMER is not null");
            return (Criteria) this;
        }

        public Criteria andUseLimitPerCustomerEqualTo(BigDecimal value) {
            addCriterion("USE_LIMIT_PER_CUSTOMER =", value, "useLimitPerCustomer");
            return (Criteria) this;
        }

        public Criteria andUseLimitPerCustomerNotEqualTo(BigDecimal value) {
            addCriterion("USE_LIMIT_PER_CUSTOMER <>", value, "useLimitPerCustomer");
            return (Criteria) this;
        }

        public Criteria andUseLimitPerCustomerGreaterThan(BigDecimal value) {
            addCriterion("USE_LIMIT_PER_CUSTOMER >", value, "useLimitPerCustomer");
            return (Criteria) this;
        }

        public Criteria andUseLimitPerCustomerGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("USE_LIMIT_PER_CUSTOMER >=", value, "useLimitPerCustomer");
            return (Criteria) this;
        }

        public Criteria andUseLimitPerCustomerLessThan(BigDecimal value) {
            addCriterion("USE_LIMIT_PER_CUSTOMER <", value, "useLimitPerCustomer");
            return (Criteria) this;
        }

        public Criteria andUseLimitPerCustomerLessThanOrEqualTo(BigDecimal value) {
            addCriterion("USE_LIMIT_PER_CUSTOMER <=", value, "useLimitPerCustomer");
            return (Criteria) this;
        }

        public Criteria andUseLimitPerCustomerIn(List<BigDecimal> values) {
            addCriterion("USE_LIMIT_PER_CUSTOMER in", values, "useLimitPerCustomer");
            return (Criteria) this;
        }

        public Criteria andUseLimitPerCustomerNotIn(List<BigDecimal> values) {
            addCriterion("USE_LIMIT_PER_CUSTOMER not in", values, "useLimitPerCustomer");
            return (Criteria) this;
        }

        public Criteria andUseLimitPerCustomerBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USE_LIMIT_PER_CUSTOMER between", value1, value2, "useLimitPerCustomer");
            return (Criteria) this;
        }

        public Criteria andUseLimitPerCustomerNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USE_LIMIT_PER_CUSTOMER not between", value1, value2, "useLimitPerCustomer");
            return (Criteria) this;
        }

        public Criteria andUseLimitPerPromotionIsNull() {
            addCriterion("USE_LIMIT_PER_PROMOTION is null");
            return (Criteria) this;
        }

        public Criteria andUseLimitPerPromotionIsNotNull() {
            addCriterion("USE_LIMIT_PER_PROMOTION is not null");
            return (Criteria) this;
        }

        public Criteria andUseLimitPerPromotionEqualTo(BigDecimal value) {
            addCriterion("USE_LIMIT_PER_PROMOTION =", value, "useLimitPerPromotion");
            return (Criteria) this;
        }

        public Criteria andUseLimitPerPromotionNotEqualTo(BigDecimal value) {
            addCriterion("USE_LIMIT_PER_PROMOTION <>", value, "useLimitPerPromotion");
            return (Criteria) this;
        }

        public Criteria andUseLimitPerPromotionGreaterThan(BigDecimal value) {
            addCriterion("USE_LIMIT_PER_PROMOTION >", value, "useLimitPerPromotion");
            return (Criteria) this;
        }

        public Criteria andUseLimitPerPromotionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("USE_LIMIT_PER_PROMOTION >=", value, "useLimitPerPromotion");
            return (Criteria) this;
        }

        public Criteria andUseLimitPerPromotionLessThan(BigDecimal value) {
            addCriterion("USE_LIMIT_PER_PROMOTION <", value, "useLimitPerPromotion");
            return (Criteria) this;
        }

        public Criteria andUseLimitPerPromotionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("USE_LIMIT_PER_PROMOTION <=", value, "useLimitPerPromotion");
            return (Criteria) this;
        }

        public Criteria andUseLimitPerPromotionIn(List<BigDecimal> values) {
            addCriterion("USE_LIMIT_PER_PROMOTION in", values, "useLimitPerPromotion");
            return (Criteria) this;
        }

        public Criteria andUseLimitPerPromotionNotIn(List<BigDecimal> values) {
            addCriterion("USE_LIMIT_PER_PROMOTION not in", values, "useLimitPerPromotion");
            return (Criteria) this;
        }

        public Criteria andUseLimitPerPromotionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USE_LIMIT_PER_PROMOTION between", value1, value2, "useLimitPerPromotion");
            return (Criteria) this;
        }

        public Criteria andUseLimitPerPromotionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USE_LIMIT_PER_PROMOTION not between", value1, value2, "useLimitPerPromotion");
            return (Criteria) this;
        }

        public Criteria andBillbackFactorIsNull() {
            addCriterion("BILLBACK_FACTOR is null");
            return (Criteria) this;
        }

        public Criteria andBillbackFactorIsNotNull() {
            addCriterion("BILLBACK_FACTOR is not null");
            return (Criteria) this;
        }

        public Criteria andBillbackFactorEqualTo(BigDecimal value) {
            addCriterion("BILLBACK_FACTOR =", value, "billbackFactor");
            return (Criteria) this;
        }

        public Criteria andBillbackFactorNotEqualTo(BigDecimal value) {
            addCriterion("BILLBACK_FACTOR <>", value, "billbackFactor");
            return (Criteria) this;
        }

        public Criteria andBillbackFactorGreaterThan(BigDecimal value) {
            addCriterion("BILLBACK_FACTOR >", value, "billbackFactor");
            return (Criteria) this;
        }

        public Criteria andBillbackFactorGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BILLBACK_FACTOR >=", value, "billbackFactor");
            return (Criteria) this;
        }

        public Criteria andBillbackFactorLessThan(BigDecimal value) {
            addCriterion("BILLBACK_FACTOR <", value, "billbackFactor");
            return (Criteria) this;
        }

        public Criteria andBillbackFactorLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BILLBACK_FACTOR <=", value, "billbackFactor");
            return (Criteria) this;
        }

        public Criteria andBillbackFactorIn(List<BigDecimal> values) {
            addCriterion("BILLBACK_FACTOR in", values, "billbackFactor");
            return (Criteria) this;
        }

        public Criteria andBillbackFactorNotIn(List<BigDecimal> values) {
            addCriterion("BILLBACK_FACTOR not in", values, "billbackFactor");
            return (Criteria) this;
        }

        public Criteria andBillbackFactorBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BILLBACK_FACTOR between", value1, value2, "billbackFactor");
            return (Criteria) this;
        }

        public Criteria andBillbackFactorNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BILLBACK_FACTOR not between", value1, value2, "billbackFactor");
            return (Criteria) this;
        }

        public Criteria andOverrideOrgPartyIdIsNull() {
            addCriterion("OVERRIDE_ORG_PARTY_ID is null");
            return (Criteria) this;
        }

        public Criteria andOverrideOrgPartyIdIsNotNull() {
            addCriterion("OVERRIDE_ORG_PARTY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOverrideOrgPartyIdEqualTo(String value) {
            addCriterion("OVERRIDE_ORG_PARTY_ID =", value, "overrideOrgPartyId");
            return (Criteria) this;
        }

        public Criteria andOverrideOrgPartyIdNotEqualTo(String value) {
            addCriterion("OVERRIDE_ORG_PARTY_ID <>", value, "overrideOrgPartyId");
            return (Criteria) this;
        }

        public Criteria andOverrideOrgPartyIdGreaterThan(String value) {
            addCriterion("OVERRIDE_ORG_PARTY_ID >", value, "overrideOrgPartyId");
            return (Criteria) this;
        }

        public Criteria andOverrideOrgPartyIdGreaterThanOrEqualTo(String value) {
            addCriterion("OVERRIDE_ORG_PARTY_ID >=", value, "overrideOrgPartyId");
            return (Criteria) this;
        }

        public Criteria andOverrideOrgPartyIdLessThan(String value) {
            addCriterion("OVERRIDE_ORG_PARTY_ID <", value, "overrideOrgPartyId");
            return (Criteria) this;
        }

        public Criteria andOverrideOrgPartyIdLessThanOrEqualTo(String value) {
            addCriterion("OVERRIDE_ORG_PARTY_ID <=", value, "overrideOrgPartyId");
            return (Criteria) this;
        }

        public Criteria andOverrideOrgPartyIdLike(String value) {
            addCriterion("OVERRIDE_ORG_PARTY_ID like", value, "overrideOrgPartyId");
            return (Criteria) this;
        }

        public Criteria andOverrideOrgPartyIdNotLike(String value) {
            addCriterion("OVERRIDE_ORG_PARTY_ID not like", value, "overrideOrgPartyId");
            return (Criteria) this;
        }

        public Criteria andOverrideOrgPartyIdIn(List<String> values) {
            addCriterion("OVERRIDE_ORG_PARTY_ID in", values, "overrideOrgPartyId");
            return (Criteria) this;
        }

        public Criteria andOverrideOrgPartyIdNotIn(List<String> values) {
            addCriterion("OVERRIDE_ORG_PARTY_ID not in", values, "overrideOrgPartyId");
            return (Criteria) this;
        }

        public Criteria andOverrideOrgPartyIdBetween(String value1, String value2) {
            addCriterion("OVERRIDE_ORG_PARTY_ID between", value1, value2, "overrideOrgPartyId");
            return (Criteria) this;
        }

        public Criteria andOverrideOrgPartyIdNotBetween(String value1, String value2) {
            addCriterion("OVERRIDE_ORG_PARTY_ID not between", value1, value2, "overrideOrgPartyId");
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