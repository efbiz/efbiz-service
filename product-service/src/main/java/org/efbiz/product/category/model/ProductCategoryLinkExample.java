package org.efbiz.product.category.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductCategoryLinkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public ProductCategoryLinkExample() {
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

        public Criteria andLinkSeqIdIsNull() {
            addCriterion("LINK_SEQ_ID is null");
            return (Criteria) this;
        }

        public Criteria andLinkSeqIdIsNotNull() {
            addCriterion("LINK_SEQ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLinkSeqIdEqualTo(String value) {
            addCriterion("LINK_SEQ_ID =", value, "linkSeqId");
            return (Criteria) this;
        }

        public Criteria andLinkSeqIdNotEqualTo(String value) {
            addCriterion("LINK_SEQ_ID <>", value, "linkSeqId");
            return (Criteria) this;
        }

        public Criteria andLinkSeqIdGreaterThan(String value) {
            addCriterion("LINK_SEQ_ID >", value, "linkSeqId");
            return (Criteria) this;
        }

        public Criteria andLinkSeqIdGreaterThanOrEqualTo(String value) {
            addCriterion("LINK_SEQ_ID >=", value, "linkSeqId");
            return (Criteria) this;
        }

        public Criteria andLinkSeqIdLessThan(String value) {
            addCriterion("LINK_SEQ_ID <", value, "linkSeqId");
            return (Criteria) this;
        }

        public Criteria andLinkSeqIdLessThanOrEqualTo(String value) {
            addCriterion("LINK_SEQ_ID <=", value, "linkSeqId");
            return (Criteria) this;
        }

        public Criteria andLinkSeqIdLike(String value) {
            addCriterion("LINK_SEQ_ID like", value, "linkSeqId");
            return (Criteria) this;
        }

        public Criteria andLinkSeqIdNotLike(String value) {
            addCriterion("LINK_SEQ_ID not like", value, "linkSeqId");
            return (Criteria) this;
        }

        public Criteria andLinkSeqIdIn(List<String> values) {
            addCriterion("LINK_SEQ_ID in", values, "linkSeqId");
            return (Criteria) this;
        }

        public Criteria andLinkSeqIdNotIn(List<String> values) {
            addCriterion("LINK_SEQ_ID not in", values, "linkSeqId");
            return (Criteria) this;
        }

        public Criteria andLinkSeqIdBetween(String value1, String value2) {
            addCriterion("LINK_SEQ_ID between", value1, value2, "linkSeqId");
            return (Criteria) this;
        }

        public Criteria andLinkSeqIdNotBetween(String value1, String value2) {
            addCriterion("LINK_SEQ_ID not between", value1, value2, "linkSeqId");
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

        public Criteria andTitleTextIsNull() {
            addCriterion("TITLE_TEXT is null");
            return (Criteria) this;
        }

        public Criteria andTitleTextIsNotNull() {
            addCriterion("TITLE_TEXT is not null");
            return (Criteria) this;
        }

        public Criteria andTitleTextEqualTo(String value) {
            addCriterion("TITLE_TEXT =", value, "titleText");
            return (Criteria) this;
        }

        public Criteria andTitleTextNotEqualTo(String value) {
            addCriterion("TITLE_TEXT <>", value, "titleText");
            return (Criteria) this;
        }

        public Criteria andTitleTextGreaterThan(String value) {
            addCriterion("TITLE_TEXT >", value, "titleText");
            return (Criteria) this;
        }

        public Criteria andTitleTextGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE_TEXT >=", value, "titleText");
            return (Criteria) this;
        }

        public Criteria andTitleTextLessThan(String value) {
            addCriterion("TITLE_TEXT <", value, "titleText");
            return (Criteria) this;
        }

        public Criteria andTitleTextLessThanOrEqualTo(String value) {
            addCriterion("TITLE_TEXT <=", value, "titleText");
            return (Criteria) this;
        }

        public Criteria andTitleTextLike(String value) {
            addCriterion("TITLE_TEXT like", value, "titleText");
            return (Criteria) this;
        }

        public Criteria andTitleTextNotLike(String value) {
            addCriterion("TITLE_TEXT not like", value, "titleText");
            return (Criteria) this;
        }

        public Criteria andTitleTextIn(List<String> values) {
            addCriterion("TITLE_TEXT in", values, "titleText");
            return (Criteria) this;
        }

        public Criteria andTitleTextNotIn(List<String> values) {
            addCriterion("TITLE_TEXT not in", values, "titleText");
            return (Criteria) this;
        }

        public Criteria andTitleTextBetween(String value1, String value2) {
            addCriterion("TITLE_TEXT between", value1, value2, "titleText");
            return (Criteria) this;
        }

        public Criteria andTitleTextNotBetween(String value1, String value2) {
            addCriterion("TITLE_TEXT not between", value1, value2, "titleText");
            return (Criteria) this;
        }

        public Criteria andImageUrlIsNull() {
            addCriterion("IMAGE_URL is null");
            return (Criteria) this;
        }

        public Criteria andImageUrlIsNotNull() {
            addCriterion("IMAGE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andImageUrlEqualTo(String value) {
            addCriterion("IMAGE_URL =", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotEqualTo(String value) {
            addCriterion("IMAGE_URL <>", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlGreaterThan(String value) {
            addCriterion("IMAGE_URL >", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("IMAGE_URL >=", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLessThan(String value) {
            addCriterion("IMAGE_URL <", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLessThanOrEqualTo(String value) {
            addCriterion("IMAGE_URL <=", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLike(String value) {
            addCriterion("IMAGE_URL like", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotLike(String value) {
            addCriterion("IMAGE_URL not like", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlIn(List<String> values) {
            addCriterion("IMAGE_URL in", values, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotIn(List<String> values) {
            addCriterion("IMAGE_URL not in", values, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlBetween(String value1, String value2) {
            addCriterion("IMAGE_URL between", value1, value2, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotBetween(String value1, String value2) {
            addCriterion("IMAGE_URL not between", value1, value2, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageTwoUrlIsNull() {
            addCriterion("IMAGE_TWO_URL is null");
            return (Criteria) this;
        }

        public Criteria andImageTwoUrlIsNotNull() {
            addCriterion("IMAGE_TWO_URL is not null");
            return (Criteria) this;
        }

        public Criteria andImageTwoUrlEqualTo(String value) {
            addCriterion("IMAGE_TWO_URL =", value, "imageTwoUrl");
            return (Criteria) this;
        }

        public Criteria andImageTwoUrlNotEqualTo(String value) {
            addCriterion("IMAGE_TWO_URL <>", value, "imageTwoUrl");
            return (Criteria) this;
        }

        public Criteria andImageTwoUrlGreaterThan(String value) {
            addCriterion("IMAGE_TWO_URL >", value, "imageTwoUrl");
            return (Criteria) this;
        }

        public Criteria andImageTwoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("IMAGE_TWO_URL >=", value, "imageTwoUrl");
            return (Criteria) this;
        }

        public Criteria andImageTwoUrlLessThan(String value) {
            addCriterion("IMAGE_TWO_URL <", value, "imageTwoUrl");
            return (Criteria) this;
        }

        public Criteria andImageTwoUrlLessThanOrEqualTo(String value) {
            addCriterion("IMAGE_TWO_URL <=", value, "imageTwoUrl");
            return (Criteria) this;
        }

        public Criteria andImageTwoUrlLike(String value) {
            addCriterion("IMAGE_TWO_URL like", value, "imageTwoUrl");
            return (Criteria) this;
        }

        public Criteria andImageTwoUrlNotLike(String value) {
            addCriterion("IMAGE_TWO_URL not like", value, "imageTwoUrl");
            return (Criteria) this;
        }

        public Criteria andImageTwoUrlIn(List<String> values) {
            addCriterion("IMAGE_TWO_URL in", values, "imageTwoUrl");
            return (Criteria) this;
        }

        public Criteria andImageTwoUrlNotIn(List<String> values) {
            addCriterion("IMAGE_TWO_URL not in", values, "imageTwoUrl");
            return (Criteria) this;
        }

        public Criteria andImageTwoUrlBetween(String value1, String value2) {
            addCriterion("IMAGE_TWO_URL between", value1, value2, "imageTwoUrl");
            return (Criteria) this;
        }

        public Criteria andImageTwoUrlNotBetween(String value1, String value2) {
            addCriterion("IMAGE_TWO_URL not between", value1, value2, "imageTwoUrl");
            return (Criteria) this;
        }

        public Criteria andLinkTypeEnumIdIsNull() {
            addCriterion("LINK_TYPE_ENUM_ID is null");
            return (Criteria) this;
        }

        public Criteria andLinkTypeEnumIdIsNotNull() {
            addCriterion("LINK_TYPE_ENUM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLinkTypeEnumIdEqualTo(String value) {
            addCriterion("LINK_TYPE_ENUM_ID =", value, "linkTypeEnumId");
            return (Criteria) this;
        }

        public Criteria andLinkTypeEnumIdNotEqualTo(String value) {
            addCriterion("LINK_TYPE_ENUM_ID <>", value, "linkTypeEnumId");
            return (Criteria) this;
        }

        public Criteria andLinkTypeEnumIdGreaterThan(String value) {
            addCriterion("LINK_TYPE_ENUM_ID >", value, "linkTypeEnumId");
            return (Criteria) this;
        }

        public Criteria andLinkTypeEnumIdGreaterThanOrEqualTo(String value) {
            addCriterion("LINK_TYPE_ENUM_ID >=", value, "linkTypeEnumId");
            return (Criteria) this;
        }

        public Criteria andLinkTypeEnumIdLessThan(String value) {
            addCriterion("LINK_TYPE_ENUM_ID <", value, "linkTypeEnumId");
            return (Criteria) this;
        }

        public Criteria andLinkTypeEnumIdLessThanOrEqualTo(String value) {
            addCriterion("LINK_TYPE_ENUM_ID <=", value, "linkTypeEnumId");
            return (Criteria) this;
        }

        public Criteria andLinkTypeEnumIdLike(String value) {
            addCriterion("LINK_TYPE_ENUM_ID like", value, "linkTypeEnumId");
            return (Criteria) this;
        }

        public Criteria andLinkTypeEnumIdNotLike(String value) {
            addCriterion("LINK_TYPE_ENUM_ID not like", value, "linkTypeEnumId");
            return (Criteria) this;
        }

        public Criteria andLinkTypeEnumIdIn(List<String> values) {
            addCriterion("LINK_TYPE_ENUM_ID in", values, "linkTypeEnumId");
            return (Criteria) this;
        }

        public Criteria andLinkTypeEnumIdNotIn(List<String> values) {
            addCriterion("LINK_TYPE_ENUM_ID not in", values, "linkTypeEnumId");
            return (Criteria) this;
        }

        public Criteria andLinkTypeEnumIdBetween(String value1, String value2) {
            addCriterion("LINK_TYPE_ENUM_ID between", value1, value2, "linkTypeEnumId");
            return (Criteria) this;
        }

        public Criteria andLinkTypeEnumIdNotBetween(String value1, String value2) {
            addCriterion("LINK_TYPE_ENUM_ID not between", value1, value2, "linkTypeEnumId");
            return (Criteria) this;
        }

        public Criteria andLinkInfoIsNull() {
            addCriterion("LINK_INFO is null");
            return (Criteria) this;
        }

        public Criteria andLinkInfoIsNotNull() {
            addCriterion("LINK_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andLinkInfoEqualTo(String value) {
            addCriterion("LINK_INFO =", value, "linkInfo");
            return (Criteria) this;
        }

        public Criteria andLinkInfoNotEqualTo(String value) {
            addCriterion("LINK_INFO <>", value, "linkInfo");
            return (Criteria) this;
        }

        public Criteria andLinkInfoGreaterThan(String value) {
            addCriterion("LINK_INFO >", value, "linkInfo");
            return (Criteria) this;
        }

        public Criteria andLinkInfoGreaterThanOrEqualTo(String value) {
            addCriterion("LINK_INFO >=", value, "linkInfo");
            return (Criteria) this;
        }

        public Criteria andLinkInfoLessThan(String value) {
            addCriterion("LINK_INFO <", value, "linkInfo");
            return (Criteria) this;
        }

        public Criteria andLinkInfoLessThanOrEqualTo(String value) {
            addCriterion("LINK_INFO <=", value, "linkInfo");
            return (Criteria) this;
        }

        public Criteria andLinkInfoLike(String value) {
            addCriterion("LINK_INFO like", value, "linkInfo");
            return (Criteria) this;
        }

        public Criteria andLinkInfoNotLike(String value) {
            addCriterion("LINK_INFO not like", value, "linkInfo");
            return (Criteria) this;
        }

        public Criteria andLinkInfoIn(List<String> values) {
            addCriterion("LINK_INFO in", values, "linkInfo");
            return (Criteria) this;
        }

        public Criteria andLinkInfoNotIn(List<String> values) {
            addCriterion("LINK_INFO not in", values, "linkInfo");
            return (Criteria) this;
        }

        public Criteria andLinkInfoBetween(String value1, String value2) {
            addCriterion("LINK_INFO between", value1, value2, "linkInfo");
            return (Criteria) this;
        }

        public Criteria andLinkInfoNotBetween(String value1, String value2) {
            addCriterion("LINK_INFO not between", value1, value2, "linkInfo");
            return (Criteria) this;
        }

        public Criteria andDetailSubScreenIsNull() {
            addCriterion("DETAIL_SUB_SCREEN is null");
            return (Criteria) this;
        }

        public Criteria andDetailSubScreenIsNotNull() {
            addCriterion("DETAIL_SUB_SCREEN is not null");
            return (Criteria) this;
        }

        public Criteria andDetailSubScreenEqualTo(String value) {
            addCriterion("DETAIL_SUB_SCREEN =", value, "detailSubScreen");
            return (Criteria) this;
        }

        public Criteria andDetailSubScreenNotEqualTo(String value) {
            addCriterion("DETAIL_SUB_SCREEN <>", value, "detailSubScreen");
            return (Criteria) this;
        }

        public Criteria andDetailSubScreenGreaterThan(String value) {
            addCriterion("DETAIL_SUB_SCREEN >", value, "detailSubScreen");
            return (Criteria) this;
        }

        public Criteria andDetailSubScreenGreaterThanOrEqualTo(String value) {
            addCriterion("DETAIL_SUB_SCREEN >=", value, "detailSubScreen");
            return (Criteria) this;
        }

        public Criteria andDetailSubScreenLessThan(String value) {
            addCriterion("DETAIL_SUB_SCREEN <", value, "detailSubScreen");
            return (Criteria) this;
        }

        public Criteria andDetailSubScreenLessThanOrEqualTo(String value) {
            addCriterion("DETAIL_SUB_SCREEN <=", value, "detailSubScreen");
            return (Criteria) this;
        }

        public Criteria andDetailSubScreenLike(String value) {
            addCriterion("DETAIL_SUB_SCREEN like", value, "detailSubScreen");
            return (Criteria) this;
        }

        public Criteria andDetailSubScreenNotLike(String value) {
            addCriterion("DETAIL_SUB_SCREEN not like", value, "detailSubScreen");
            return (Criteria) this;
        }

        public Criteria andDetailSubScreenIn(List<String> values) {
            addCriterion("DETAIL_SUB_SCREEN in", values, "detailSubScreen");
            return (Criteria) this;
        }

        public Criteria andDetailSubScreenNotIn(List<String> values) {
            addCriterion("DETAIL_SUB_SCREEN not in", values, "detailSubScreen");
            return (Criteria) this;
        }

        public Criteria andDetailSubScreenBetween(String value1, String value2) {
            addCriterion("DETAIL_SUB_SCREEN between", value1, value2, "detailSubScreen");
            return (Criteria) this;
        }

        public Criteria andDetailSubScreenNotBetween(String value1, String value2) {
            addCriterion("DETAIL_SUB_SCREEN not between", value1, value2, "detailSubScreen");
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