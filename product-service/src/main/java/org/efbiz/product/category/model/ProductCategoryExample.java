package org.efbiz.product.category.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public ProductCategoryExample() {
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

        public Criteria andProductCategoryTypeIdIsNull() {
            addCriterion("PRODUCT_CATEGORY_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductCategoryTypeIdIsNotNull() {
            addCriterion("PRODUCT_CATEGORY_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductCategoryTypeIdEqualTo(String value) {
            addCriterion("PRODUCT_CATEGORY_TYPE_ID =", value, "productCategoryTypeId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryTypeIdNotEqualTo(String value) {
            addCriterion("PRODUCT_CATEGORY_TYPE_ID <>", value, "productCategoryTypeId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryTypeIdGreaterThan(String value) {
            addCriterion("PRODUCT_CATEGORY_TYPE_ID >", value, "productCategoryTypeId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_CATEGORY_TYPE_ID >=", value, "productCategoryTypeId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryTypeIdLessThan(String value) {
            addCriterion("PRODUCT_CATEGORY_TYPE_ID <", value, "productCategoryTypeId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryTypeIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_CATEGORY_TYPE_ID <=", value, "productCategoryTypeId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryTypeIdLike(String value) {
            addCriterion("PRODUCT_CATEGORY_TYPE_ID like", value, "productCategoryTypeId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryTypeIdNotLike(String value) {
            addCriterion("PRODUCT_CATEGORY_TYPE_ID not like", value, "productCategoryTypeId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryTypeIdIn(List<String> values) {
            addCriterion("PRODUCT_CATEGORY_TYPE_ID in", values, "productCategoryTypeId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryTypeIdNotIn(List<String> values) {
            addCriterion("PRODUCT_CATEGORY_TYPE_ID not in", values, "productCategoryTypeId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryTypeIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_CATEGORY_TYPE_ID between", value1, value2, "productCategoryTypeId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryTypeIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_CATEGORY_TYPE_ID not between", value1, value2, "productCategoryTypeId");
            return (Criteria) this;
        }

        public Criteria andPrimaryParentCategoryIdIsNull() {
            addCriterion("PRIMARY_PARENT_CATEGORY_ID is null");
            return (Criteria) this;
        }

        public Criteria andPrimaryParentCategoryIdIsNotNull() {
            addCriterion("PRIMARY_PARENT_CATEGORY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPrimaryParentCategoryIdEqualTo(String value) {
            addCriterion("PRIMARY_PARENT_CATEGORY_ID =", value, "primaryParentCategoryId");
            return (Criteria) this;
        }

        public Criteria andPrimaryParentCategoryIdNotEqualTo(String value) {
            addCriterion("PRIMARY_PARENT_CATEGORY_ID <>", value, "primaryParentCategoryId");
            return (Criteria) this;
        }

        public Criteria andPrimaryParentCategoryIdGreaterThan(String value) {
            addCriterion("PRIMARY_PARENT_CATEGORY_ID >", value, "primaryParentCategoryId");
            return (Criteria) this;
        }

        public Criteria andPrimaryParentCategoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRIMARY_PARENT_CATEGORY_ID >=", value, "primaryParentCategoryId");
            return (Criteria) this;
        }

        public Criteria andPrimaryParentCategoryIdLessThan(String value) {
            addCriterion("PRIMARY_PARENT_CATEGORY_ID <", value, "primaryParentCategoryId");
            return (Criteria) this;
        }

        public Criteria andPrimaryParentCategoryIdLessThanOrEqualTo(String value) {
            addCriterion("PRIMARY_PARENT_CATEGORY_ID <=", value, "primaryParentCategoryId");
            return (Criteria) this;
        }

        public Criteria andPrimaryParentCategoryIdLike(String value) {
            addCriterion("PRIMARY_PARENT_CATEGORY_ID like", value, "primaryParentCategoryId");
            return (Criteria) this;
        }

        public Criteria andPrimaryParentCategoryIdNotLike(String value) {
            addCriterion("PRIMARY_PARENT_CATEGORY_ID not like", value, "primaryParentCategoryId");
            return (Criteria) this;
        }

        public Criteria andPrimaryParentCategoryIdIn(List<String> values) {
            addCriterion("PRIMARY_PARENT_CATEGORY_ID in", values, "primaryParentCategoryId");
            return (Criteria) this;
        }

        public Criteria andPrimaryParentCategoryIdNotIn(List<String> values) {
            addCriterion("PRIMARY_PARENT_CATEGORY_ID not in", values, "primaryParentCategoryId");
            return (Criteria) this;
        }

        public Criteria andPrimaryParentCategoryIdBetween(String value1, String value2) {
            addCriterion("PRIMARY_PARENT_CATEGORY_ID between", value1, value2, "primaryParentCategoryId");
            return (Criteria) this;
        }

        public Criteria andPrimaryParentCategoryIdNotBetween(String value1, String value2) {
            addCriterion("PRIMARY_PARENT_CATEGORY_ID not between", value1, value2, "primaryParentCategoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIsNull() {
            addCriterion("CATEGORY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIsNotNull() {
            addCriterion("CATEGORY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameEqualTo(String value) {
            addCriterion("CATEGORY_NAME =", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotEqualTo(String value) {
            addCriterion("CATEGORY_NAME <>", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThan(String value) {
            addCriterion("CATEGORY_NAME >", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("CATEGORY_NAME >=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThan(String value) {
            addCriterion("CATEGORY_NAME <", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("CATEGORY_NAME <=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLike(String value) {
            addCriterion("CATEGORY_NAME like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotLike(String value) {
            addCriterion("CATEGORY_NAME not like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIn(List<String> values) {
            addCriterion("CATEGORY_NAME in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotIn(List<String> values) {
            addCriterion("CATEGORY_NAME not in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameBetween(String value1, String value2) {
            addCriterion("CATEGORY_NAME between", value1, value2, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotBetween(String value1, String value2) {
            addCriterion("CATEGORY_NAME not between", value1, value2, "categoryName");
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

        public Criteria andCategoryImageUrlIsNull() {
            addCriterion("CATEGORY_IMAGE_URL is null");
            return (Criteria) this;
        }

        public Criteria andCategoryImageUrlIsNotNull() {
            addCriterion("CATEGORY_IMAGE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryImageUrlEqualTo(String value) {
            addCriterion("CATEGORY_IMAGE_URL =", value, "categoryImageUrl");
            return (Criteria) this;
        }

        public Criteria andCategoryImageUrlNotEqualTo(String value) {
            addCriterion("CATEGORY_IMAGE_URL <>", value, "categoryImageUrl");
            return (Criteria) this;
        }

        public Criteria andCategoryImageUrlGreaterThan(String value) {
            addCriterion("CATEGORY_IMAGE_URL >", value, "categoryImageUrl");
            return (Criteria) this;
        }

        public Criteria andCategoryImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("CATEGORY_IMAGE_URL >=", value, "categoryImageUrl");
            return (Criteria) this;
        }

        public Criteria andCategoryImageUrlLessThan(String value) {
            addCriterion("CATEGORY_IMAGE_URL <", value, "categoryImageUrl");
            return (Criteria) this;
        }

        public Criteria andCategoryImageUrlLessThanOrEqualTo(String value) {
            addCriterion("CATEGORY_IMAGE_URL <=", value, "categoryImageUrl");
            return (Criteria) this;
        }

        public Criteria andCategoryImageUrlLike(String value) {
            addCriterion("CATEGORY_IMAGE_URL like", value, "categoryImageUrl");
            return (Criteria) this;
        }

        public Criteria andCategoryImageUrlNotLike(String value) {
            addCriterion("CATEGORY_IMAGE_URL not like", value, "categoryImageUrl");
            return (Criteria) this;
        }

        public Criteria andCategoryImageUrlIn(List<String> values) {
            addCriterion("CATEGORY_IMAGE_URL in", values, "categoryImageUrl");
            return (Criteria) this;
        }

        public Criteria andCategoryImageUrlNotIn(List<String> values) {
            addCriterion("CATEGORY_IMAGE_URL not in", values, "categoryImageUrl");
            return (Criteria) this;
        }

        public Criteria andCategoryImageUrlBetween(String value1, String value2) {
            addCriterion("CATEGORY_IMAGE_URL between", value1, value2, "categoryImageUrl");
            return (Criteria) this;
        }

        public Criteria andCategoryImageUrlNotBetween(String value1, String value2) {
            addCriterion("CATEGORY_IMAGE_URL not between", value1, value2, "categoryImageUrl");
            return (Criteria) this;
        }

        public Criteria andLinkOneImageUrlIsNull() {
            addCriterion("LINK_ONE_IMAGE_URL is null");
            return (Criteria) this;
        }

        public Criteria andLinkOneImageUrlIsNotNull() {
            addCriterion("LINK_ONE_IMAGE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andLinkOneImageUrlEqualTo(String value) {
            addCriterion("LINK_ONE_IMAGE_URL =", value, "linkOneImageUrl");
            return (Criteria) this;
        }

        public Criteria andLinkOneImageUrlNotEqualTo(String value) {
            addCriterion("LINK_ONE_IMAGE_URL <>", value, "linkOneImageUrl");
            return (Criteria) this;
        }

        public Criteria andLinkOneImageUrlGreaterThan(String value) {
            addCriterion("LINK_ONE_IMAGE_URL >", value, "linkOneImageUrl");
            return (Criteria) this;
        }

        public Criteria andLinkOneImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("LINK_ONE_IMAGE_URL >=", value, "linkOneImageUrl");
            return (Criteria) this;
        }

        public Criteria andLinkOneImageUrlLessThan(String value) {
            addCriterion("LINK_ONE_IMAGE_URL <", value, "linkOneImageUrl");
            return (Criteria) this;
        }

        public Criteria andLinkOneImageUrlLessThanOrEqualTo(String value) {
            addCriterion("LINK_ONE_IMAGE_URL <=", value, "linkOneImageUrl");
            return (Criteria) this;
        }

        public Criteria andLinkOneImageUrlLike(String value) {
            addCriterion("LINK_ONE_IMAGE_URL like", value, "linkOneImageUrl");
            return (Criteria) this;
        }

        public Criteria andLinkOneImageUrlNotLike(String value) {
            addCriterion("LINK_ONE_IMAGE_URL not like", value, "linkOneImageUrl");
            return (Criteria) this;
        }

        public Criteria andLinkOneImageUrlIn(List<String> values) {
            addCriterion("LINK_ONE_IMAGE_URL in", values, "linkOneImageUrl");
            return (Criteria) this;
        }

        public Criteria andLinkOneImageUrlNotIn(List<String> values) {
            addCriterion("LINK_ONE_IMAGE_URL not in", values, "linkOneImageUrl");
            return (Criteria) this;
        }

        public Criteria andLinkOneImageUrlBetween(String value1, String value2) {
            addCriterion("LINK_ONE_IMAGE_URL between", value1, value2, "linkOneImageUrl");
            return (Criteria) this;
        }

        public Criteria andLinkOneImageUrlNotBetween(String value1, String value2) {
            addCriterion("LINK_ONE_IMAGE_URL not between", value1, value2, "linkOneImageUrl");
            return (Criteria) this;
        }

        public Criteria andLinkTwoImageUrlIsNull() {
            addCriterion("LINK_TWO_IMAGE_URL is null");
            return (Criteria) this;
        }

        public Criteria andLinkTwoImageUrlIsNotNull() {
            addCriterion("LINK_TWO_IMAGE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andLinkTwoImageUrlEqualTo(String value) {
            addCriterion("LINK_TWO_IMAGE_URL =", value, "linkTwoImageUrl");
            return (Criteria) this;
        }

        public Criteria andLinkTwoImageUrlNotEqualTo(String value) {
            addCriterion("LINK_TWO_IMAGE_URL <>", value, "linkTwoImageUrl");
            return (Criteria) this;
        }

        public Criteria andLinkTwoImageUrlGreaterThan(String value) {
            addCriterion("LINK_TWO_IMAGE_URL >", value, "linkTwoImageUrl");
            return (Criteria) this;
        }

        public Criteria andLinkTwoImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("LINK_TWO_IMAGE_URL >=", value, "linkTwoImageUrl");
            return (Criteria) this;
        }

        public Criteria andLinkTwoImageUrlLessThan(String value) {
            addCriterion("LINK_TWO_IMAGE_URL <", value, "linkTwoImageUrl");
            return (Criteria) this;
        }

        public Criteria andLinkTwoImageUrlLessThanOrEqualTo(String value) {
            addCriterion("LINK_TWO_IMAGE_URL <=", value, "linkTwoImageUrl");
            return (Criteria) this;
        }

        public Criteria andLinkTwoImageUrlLike(String value) {
            addCriterion("LINK_TWO_IMAGE_URL like", value, "linkTwoImageUrl");
            return (Criteria) this;
        }

        public Criteria andLinkTwoImageUrlNotLike(String value) {
            addCriterion("LINK_TWO_IMAGE_URL not like", value, "linkTwoImageUrl");
            return (Criteria) this;
        }

        public Criteria andLinkTwoImageUrlIn(List<String> values) {
            addCriterion("LINK_TWO_IMAGE_URL in", values, "linkTwoImageUrl");
            return (Criteria) this;
        }

        public Criteria andLinkTwoImageUrlNotIn(List<String> values) {
            addCriterion("LINK_TWO_IMAGE_URL not in", values, "linkTwoImageUrl");
            return (Criteria) this;
        }

        public Criteria andLinkTwoImageUrlBetween(String value1, String value2) {
            addCriterion("LINK_TWO_IMAGE_URL between", value1, value2, "linkTwoImageUrl");
            return (Criteria) this;
        }

        public Criteria andLinkTwoImageUrlNotBetween(String value1, String value2) {
            addCriterion("LINK_TWO_IMAGE_URL not between", value1, value2, "linkTwoImageUrl");
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

        public Criteria andShowInSelectIsNull() {
            addCriterion("SHOW_IN_SELECT is null");
            return (Criteria) this;
        }

        public Criteria andShowInSelectIsNotNull() {
            addCriterion("SHOW_IN_SELECT is not null");
            return (Criteria) this;
        }

        public Criteria andShowInSelectEqualTo(String value) {
            addCriterion("SHOW_IN_SELECT =", value, "showInSelect");
            return (Criteria) this;
        }

        public Criteria andShowInSelectNotEqualTo(String value) {
            addCriterion("SHOW_IN_SELECT <>", value, "showInSelect");
            return (Criteria) this;
        }

        public Criteria andShowInSelectGreaterThan(String value) {
            addCriterion("SHOW_IN_SELECT >", value, "showInSelect");
            return (Criteria) this;
        }

        public Criteria andShowInSelectGreaterThanOrEqualTo(String value) {
            addCriterion("SHOW_IN_SELECT >=", value, "showInSelect");
            return (Criteria) this;
        }

        public Criteria andShowInSelectLessThan(String value) {
            addCriterion("SHOW_IN_SELECT <", value, "showInSelect");
            return (Criteria) this;
        }

        public Criteria andShowInSelectLessThanOrEqualTo(String value) {
            addCriterion("SHOW_IN_SELECT <=", value, "showInSelect");
            return (Criteria) this;
        }

        public Criteria andShowInSelectLike(String value) {
            addCriterion("SHOW_IN_SELECT like", value, "showInSelect");
            return (Criteria) this;
        }

        public Criteria andShowInSelectNotLike(String value) {
            addCriterion("SHOW_IN_SELECT not like", value, "showInSelect");
            return (Criteria) this;
        }

        public Criteria andShowInSelectIn(List<String> values) {
            addCriterion("SHOW_IN_SELECT in", values, "showInSelect");
            return (Criteria) this;
        }

        public Criteria andShowInSelectNotIn(List<String> values) {
            addCriterion("SHOW_IN_SELECT not in", values, "showInSelect");
            return (Criteria) this;
        }

        public Criteria andShowInSelectBetween(String value1, String value2) {
            addCriterion("SHOW_IN_SELECT between", value1, value2, "showInSelect");
            return (Criteria) this;
        }

        public Criteria andShowInSelectNotBetween(String value1, String value2) {
            addCriterion("SHOW_IN_SELECT not between", value1, value2, "showInSelect");
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