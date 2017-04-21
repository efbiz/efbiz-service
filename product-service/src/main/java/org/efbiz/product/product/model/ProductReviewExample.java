package org.efbiz.product.product.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductReviewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public ProductReviewExample() {
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

        public Criteria andProductReviewIdIsNull() {
            addCriterion("PRODUCT_REVIEW_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductReviewIdIsNotNull() {
            addCriterion("PRODUCT_REVIEW_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductReviewIdEqualTo(String value) {
            addCriterion("PRODUCT_REVIEW_ID =", value, "productReviewId");
            return (Criteria) this;
        }

        public Criteria andProductReviewIdNotEqualTo(String value) {
            addCriterion("PRODUCT_REVIEW_ID <>", value, "productReviewId");
            return (Criteria) this;
        }

        public Criteria andProductReviewIdGreaterThan(String value) {
            addCriterion("PRODUCT_REVIEW_ID >", value, "productReviewId");
            return (Criteria) this;
        }

        public Criteria andProductReviewIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_REVIEW_ID >=", value, "productReviewId");
            return (Criteria) this;
        }

        public Criteria andProductReviewIdLessThan(String value) {
            addCriterion("PRODUCT_REVIEW_ID <", value, "productReviewId");
            return (Criteria) this;
        }

        public Criteria andProductReviewIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_REVIEW_ID <=", value, "productReviewId");
            return (Criteria) this;
        }

        public Criteria andProductReviewIdLike(String value) {
            addCriterion("PRODUCT_REVIEW_ID like", value, "productReviewId");
            return (Criteria) this;
        }

        public Criteria andProductReviewIdNotLike(String value) {
            addCriterion("PRODUCT_REVIEW_ID not like", value, "productReviewId");
            return (Criteria) this;
        }

        public Criteria andProductReviewIdIn(List<String> values) {
            addCriterion("PRODUCT_REVIEW_ID in", values, "productReviewId");
            return (Criteria) this;
        }

        public Criteria andProductReviewIdNotIn(List<String> values) {
            addCriterion("PRODUCT_REVIEW_ID not in", values, "productReviewId");
            return (Criteria) this;
        }

        public Criteria andProductReviewIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_REVIEW_ID between", value1, value2, "productReviewId");
            return (Criteria) this;
        }

        public Criteria andProductReviewIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_REVIEW_ID not between", value1, value2, "productReviewId");
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

        public Criteria andUserLoginIdIsNull() {
            addCriterion("USER_LOGIN_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserLoginIdIsNotNull() {
            addCriterion("USER_LOGIN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserLoginIdEqualTo(String value) {
            addCriterion("USER_LOGIN_ID =", value, "userLoginId");
            return (Criteria) this;
        }

        public Criteria andUserLoginIdNotEqualTo(String value) {
            addCriterion("USER_LOGIN_ID <>", value, "userLoginId");
            return (Criteria) this;
        }

        public Criteria andUserLoginIdGreaterThan(String value) {
            addCriterion("USER_LOGIN_ID >", value, "userLoginId");
            return (Criteria) this;
        }

        public Criteria andUserLoginIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_LOGIN_ID >=", value, "userLoginId");
            return (Criteria) this;
        }

        public Criteria andUserLoginIdLessThan(String value) {
            addCriterion("USER_LOGIN_ID <", value, "userLoginId");
            return (Criteria) this;
        }

        public Criteria andUserLoginIdLessThanOrEqualTo(String value) {
            addCriterion("USER_LOGIN_ID <=", value, "userLoginId");
            return (Criteria) this;
        }

        public Criteria andUserLoginIdLike(String value) {
            addCriterion("USER_LOGIN_ID like", value, "userLoginId");
            return (Criteria) this;
        }

        public Criteria andUserLoginIdNotLike(String value) {
            addCriterion("USER_LOGIN_ID not like", value, "userLoginId");
            return (Criteria) this;
        }

        public Criteria andUserLoginIdIn(List<String> values) {
            addCriterion("USER_LOGIN_ID in", values, "userLoginId");
            return (Criteria) this;
        }

        public Criteria andUserLoginIdNotIn(List<String> values) {
            addCriterion("USER_LOGIN_ID not in", values, "userLoginId");
            return (Criteria) this;
        }

        public Criteria andUserLoginIdBetween(String value1, String value2) {
            addCriterion("USER_LOGIN_ID between", value1, value2, "userLoginId");
            return (Criteria) this;
        }

        public Criteria andUserLoginIdNotBetween(String value1, String value2) {
            addCriterion("USER_LOGIN_ID not between", value1, value2, "userLoginId");
            return (Criteria) this;
        }

        public Criteria andStatusIdIsNull() {
            addCriterion("STATUS_ID is null");
            return (Criteria) this;
        }

        public Criteria andStatusIdIsNotNull() {
            addCriterion("STATUS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStatusIdEqualTo(String value) {
            addCriterion("STATUS_ID =", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotEqualTo(String value) {
            addCriterion("STATUS_ID <>", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdGreaterThan(String value) {
            addCriterion("STATUS_ID >", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS_ID >=", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdLessThan(String value) {
            addCriterion("STATUS_ID <", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdLessThanOrEqualTo(String value) {
            addCriterion("STATUS_ID <=", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdLike(String value) {
            addCriterion("STATUS_ID like", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotLike(String value) {
            addCriterion("STATUS_ID not like", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdIn(List<String> values) {
            addCriterion("STATUS_ID in", values, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotIn(List<String> values) {
            addCriterion("STATUS_ID not in", values, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdBetween(String value1, String value2) {
            addCriterion("STATUS_ID between", value1, value2, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotBetween(String value1, String value2) {
            addCriterion("STATUS_ID not between", value1, value2, "statusId");
            return (Criteria) this;
        }

        public Criteria andPostedAnonymousIsNull() {
            addCriterion("POSTED_ANONYMOUS is null");
            return (Criteria) this;
        }

        public Criteria andPostedAnonymousIsNotNull() {
            addCriterion("POSTED_ANONYMOUS is not null");
            return (Criteria) this;
        }

        public Criteria andPostedAnonymousEqualTo(String value) {
            addCriterion("POSTED_ANONYMOUS =", value, "postedAnonymous");
            return (Criteria) this;
        }

        public Criteria andPostedAnonymousNotEqualTo(String value) {
            addCriterion("POSTED_ANONYMOUS <>", value, "postedAnonymous");
            return (Criteria) this;
        }

        public Criteria andPostedAnonymousGreaterThan(String value) {
            addCriterion("POSTED_ANONYMOUS >", value, "postedAnonymous");
            return (Criteria) this;
        }

        public Criteria andPostedAnonymousGreaterThanOrEqualTo(String value) {
            addCriterion("POSTED_ANONYMOUS >=", value, "postedAnonymous");
            return (Criteria) this;
        }

        public Criteria andPostedAnonymousLessThan(String value) {
            addCriterion("POSTED_ANONYMOUS <", value, "postedAnonymous");
            return (Criteria) this;
        }

        public Criteria andPostedAnonymousLessThanOrEqualTo(String value) {
            addCriterion("POSTED_ANONYMOUS <=", value, "postedAnonymous");
            return (Criteria) this;
        }

        public Criteria andPostedAnonymousLike(String value) {
            addCriterion("POSTED_ANONYMOUS like", value, "postedAnonymous");
            return (Criteria) this;
        }

        public Criteria andPostedAnonymousNotLike(String value) {
            addCriterion("POSTED_ANONYMOUS not like", value, "postedAnonymous");
            return (Criteria) this;
        }

        public Criteria andPostedAnonymousIn(List<String> values) {
            addCriterion("POSTED_ANONYMOUS in", values, "postedAnonymous");
            return (Criteria) this;
        }

        public Criteria andPostedAnonymousNotIn(List<String> values) {
            addCriterion("POSTED_ANONYMOUS not in", values, "postedAnonymous");
            return (Criteria) this;
        }

        public Criteria andPostedAnonymousBetween(String value1, String value2) {
            addCriterion("POSTED_ANONYMOUS between", value1, value2, "postedAnonymous");
            return (Criteria) this;
        }

        public Criteria andPostedAnonymousNotBetween(String value1, String value2) {
            addCriterion("POSTED_ANONYMOUS not between", value1, value2, "postedAnonymous");
            return (Criteria) this;
        }

        public Criteria andPostedDateTimeIsNull() {
            addCriterion("POSTED_DATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPostedDateTimeIsNotNull() {
            addCriterion("POSTED_DATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPostedDateTimeEqualTo(Date value) {
            addCriterion("POSTED_DATE_TIME =", value, "postedDateTime");
            return (Criteria) this;
        }

        public Criteria andPostedDateTimeNotEqualTo(Date value) {
            addCriterion("POSTED_DATE_TIME <>", value, "postedDateTime");
            return (Criteria) this;
        }

        public Criteria andPostedDateTimeGreaterThan(Date value) {
            addCriterion("POSTED_DATE_TIME >", value, "postedDateTime");
            return (Criteria) this;
        }

        public Criteria andPostedDateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("POSTED_DATE_TIME >=", value, "postedDateTime");
            return (Criteria) this;
        }

        public Criteria andPostedDateTimeLessThan(Date value) {
            addCriterion("POSTED_DATE_TIME <", value, "postedDateTime");
            return (Criteria) this;
        }

        public Criteria andPostedDateTimeLessThanOrEqualTo(Date value) {
            addCriterion("POSTED_DATE_TIME <=", value, "postedDateTime");
            return (Criteria) this;
        }

        public Criteria andPostedDateTimeIn(List<Date> values) {
            addCriterion("POSTED_DATE_TIME in", values, "postedDateTime");
            return (Criteria) this;
        }

        public Criteria andPostedDateTimeNotIn(List<Date> values) {
            addCriterion("POSTED_DATE_TIME not in", values, "postedDateTime");
            return (Criteria) this;
        }

        public Criteria andPostedDateTimeBetween(Date value1, Date value2) {
            addCriterion("POSTED_DATE_TIME between", value1, value2, "postedDateTime");
            return (Criteria) this;
        }

        public Criteria andPostedDateTimeNotBetween(Date value1, Date value2) {
            addCriterion("POSTED_DATE_TIME not between", value1, value2, "postedDateTime");
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