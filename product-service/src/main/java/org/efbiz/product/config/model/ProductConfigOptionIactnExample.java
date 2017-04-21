package org.efbiz.product.config.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductConfigOptionIactnExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public ProductConfigOptionIactnExample() {
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

        public Criteria andConfigItemIdIsNull() {
            addCriterion("CONFIG_ITEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andConfigItemIdIsNotNull() {
            addCriterion("CONFIG_ITEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andConfigItemIdEqualTo(String value) {
            addCriterion("CONFIG_ITEM_ID =", value, "configItemId");
            return (Criteria) this;
        }

        public Criteria andConfigItemIdNotEqualTo(String value) {
            addCriterion("CONFIG_ITEM_ID <>", value, "configItemId");
            return (Criteria) this;
        }

        public Criteria andConfigItemIdGreaterThan(String value) {
            addCriterion("CONFIG_ITEM_ID >", value, "configItemId");
            return (Criteria) this;
        }

        public Criteria andConfigItemIdGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIG_ITEM_ID >=", value, "configItemId");
            return (Criteria) this;
        }

        public Criteria andConfigItemIdLessThan(String value) {
            addCriterion("CONFIG_ITEM_ID <", value, "configItemId");
            return (Criteria) this;
        }

        public Criteria andConfigItemIdLessThanOrEqualTo(String value) {
            addCriterion("CONFIG_ITEM_ID <=", value, "configItemId");
            return (Criteria) this;
        }

        public Criteria andConfigItemIdLike(String value) {
            addCriterion("CONFIG_ITEM_ID like", value, "configItemId");
            return (Criteria) this;
        }

        public Criteria andConfigItemIdNotLike(String value) {
            addCriterion("CONFIG_ITEM_ID not like", value, "configItemId");
            return (Criteria) this;
        }

        public Criteria andConfigItemIdIn(List<String> values) {
            addCriterion("CONFIG_ITEM_ID in", values, "configItemId");
            return (Criteria) this;
        }

        public Criteria andConfigItemIdNotIn(List<String> values) {
            addCriterion("CONFIG_ITEM_ID not in", values, "configItemId");
            return (Criteria) this;
        }

        public Criteria andConfigItemIdBetween(String value1, String value2) {
            addCriterion("CONFIG_ITEM_ID between", value1, value2, "configItemId");
            return (Criteria) this;
        }

        public Criteria andConfigItemIdNotBetween(String value1, String value2) {
            addCriterion("CONFIG_ITEM_ID not between", value1, value2, "configItemId");
            return (Criteria) this;
        }

        public Criteria andConfigOptionIdIsNull() {
            addCriterion("CONFIG_OPTION_ID is null");
            return (Criteria) this;
        }

        public Criteria andConfigOptionIdIsNotNull() {
            addCriterion("CONFIG_OPTION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andConfigOptionIdEqualTo(String value) {
            addCriterion("CONFIG_OPTION_ID =", value, "configOptionId");
            return (Criteria) this;
        }

        public Criteria andConfigOptionIdNotEqualTo(String value) {
            addCriterion("CONFIG_OPTION_ID <>", value, "configOptionId");
            return (Criteria) this;
        }

        public Criteria andConfigOptionIdGreaterThan(String value) {
            addCriterion("CONFIG_OPTION_ID >", value, "configOptionId");
            return (Criteria) this;
        }

        public Criteria andConfigOptionIdGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIG_OPTION_ID >=", value, "configOptionId");
            return (Criteria) this;
        }

        public Criteria andConfigOptionIdLessThan(String value) {
            addCriterion("CONFIG_OPTION_ID <", value, "configOptionId");
            return (Criteria) this;
        }

        public Criteria andConfigOptionIdLessThanOrEqualTo(String value) {
            addCriterion("CONFIG_OPTION_ID <=", value, "configOptionId");
            return (Criteria) this;
        }

        public Criteria andConfigOptionIdLike(String value) {
            addCriterion("CONFIG_OPTION_ID like", value, "configOptionId");
            return (Criteria) this;
        }

        public Criteria andConfigOptionIdNotLike(String value) {
            addCriterion("CONFIG_OPTION_ID not like", value, "configOptionId");
            return (Criteria) this;
        }

        public Criteria andConfigOptionIdIn(List<String> values) {
            addCriterion("CONFIG_OPTION_ID in", values, "configOptionId");
            return (Criteria) this;
        }

        public Criteria andConfigOptionIdNotIn(List<String> values) {
            addCriterion("CONFIG_OPTION_ID not in", values, "configOptionId");
            return (Criteria) this;
        }

        public Criteria andConfigOptionIdBetween(String value1, String value2) {
            addCriterion("CONFIG_OPTION_ID between", value1, value2, "configOptionId");
            return (Criteria) this;
        }

        public Criteria andConfigOptionIdNotBetween(String value1, String value2) {
            addCriterion("CONFIG_OPTION_ID not between", value1, value2, "configOptionId");
            return (Criteria) this;
        }

        public Criteria andConfigItemIdToIsNull() {
            addCriterion("CONFIG_ITEM_ID_TO is null");
            return (Criteria) this;
        }

        public Criteria andConfigItemIdToIsNotNull() {
            addCriterion("CONFIG_ITEM_ID_TO is not null");
            return (Criteria) this;
        }

        public Criteria andConfigItemIdToEqualTo(String value) {
            addCriterion("CONFIG_ITEM_ID_TO =", value, "configItemIdTo");
            return (Criteria) this;
        }

        public Criteria andConfigItemIdToNotEqualTo(String value) {
            addCriterion("CONFIG_ITEM_ID_TO <>", value, "configItemIdTo");
            return (Criteria) this;
        }

        public Criteria andConfigItemIdToGreaterThan(String value) {
            addCriterion("CONFIG_ITEM_ID_TO >", value, "configItemIdTo");
            return (Criteria) this;
        }

        public Criteria andConfigItemIdToGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIG_ITEM_ID_TO >=", value, "configItemIdTo");
            return (Criteria) this;
        }

        public Criteria andConfigItemIdToLessThan(String value) {
            addCriterion("CONFIG_ITEM_ID_TO <", value, "configItemIdTo");
            return (Criteria) this;
        }

        public Criteria andConfigItemIdToLessThanOrEqualTo(String value) {
            addCriterion("CONFIG_ITEM_ID_TO <=", value, "configItemIdTo");
            return (Criteria) this;
        }

        public Criteria andConfigItemIdToLike(String value) {
            addCriterion("CONFIG_ITEM_ID_TO like", value, "configItemIdTo");
            return (Criteria) this;
        }

        public Criteria andConfigItemIdToNotLike(String value) {
            addCriterion("CONFIG_ITEM_ID_TO not like", value, "configItemIdTo");
            return (Criteria) this;
        }

        public Criteria andConfigItemIdToIn(List<String> values) {
            addCriterion("CONFIG_ITEM_ID_TO in", values, "configItemIdTo");
            return (Criteria) this;
        }

        public Criteria andConfigItemIdToNotIn(List<String> values) {
            addCriterion("CONFIG_ITEM_ID_TO not in", values, "configItemIdTo");
            return (Criteria) this;
        }

        public Criteria andConfigItemIdToBetween(String value1, String value2) {
            addCriterion("CONFIG_ITEM_ID_TO between", value1, value2, "configItemIdTo");
            return (Criteria) this;
        }

        public Criteria andConfigItemIdToNotBetween(String value1, String value2) {
            addCriterion("CONFIG_ITEM_ID_TO not between", value1, value2, "configItemIdTo");
            return (Criteria) this;
        }

        public Criteria andConfigOptionIdToIsNull() {
            addCriterion("CONFIG_OPTION_ID_TO is null");
            return (Criteria) this;
        }

        public Criteria andConfigOptionIdToIsNotNull() {
            addCriterion("CONFIG_OPTION_ID_TO is not null");
            return (Criteria) this;
        }

        public Criteria andConfigOptionIdToEqualTo(String value) {
            addCriterion("CONFIG_OPTION_ID_TO =", value, "configOptionIdTo");
            return (Criteria) this;
        }

        public Criteria andConfigOptionIdToNotEqualTo(String value) {
            addCriterion("CONFIG_OPTION_ID_TO <>", value, "configOptionIdTo");
            return (Criteria) this;
        }

        public Criteria andConfigOptionIdToGreaterThan(String value) {
            addCriterion("CONFIG_OPTION_ID_TO >", value, "configOptionIdTo");
            return (Criteria) this;
        }

        public Criteria andConfigOptionIdToGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIG_OPTION_ID_TO >=", value, "configOptionIdTo");
            return (Criteria) this;
        }

        public Criteria andConfigOptionIdToLessThan(String value) {
            addCriterion("CONFIG_OPTION_ID_TO <", value, "configOptionIdTo");
            return (Criteria) this;
        }

        public Criteria andConfigOptionIdToLessThanOrEqualTo(String value) {
            addCriterion("CONFIG_OPTION_ID_TO <=", value, "configOptionIdTo");
            return (Criteria) this;
        }

        public Criteria andConfigOptionIdToLike(String value) {
            addCriterion("CONFIG_OPTION_ID_TO like", value, "configOptionIdTo");
            return (Criteria) this;
        }

        public Criteria andConfigOptionIdToNotLike(String value) {
            addCriterion("CONFIG_OPTION_ID_TO not like", value, "configOptionIdTo");
            return (Criteria) this;
        }

        public Criteria andConfigOptionIdToIn(List<String> values) {
            addCriterion("CONFIG_OPTION_ID_TO in", values, "configOptionIdTo");
            return (Criteria) this;
        }

        public Criteria andConfigOptionIdToNotIn(List<String> values) {
            addCriterion("CONFIG_OPTION_ID_TO not in", values, "configOptionIdTo");
            return (Criteria) this;
        }

        public Criteria andConfigOptionIdToBetween(String value1, String value2) {
            addCriterion("CONFIG_OPTION_ID_TO between", value1, value2, "configOptionIdTo");
            return (Criteria) this;
        }

        public Criteria andConfigOptionIdToNotBetween(String value1, String value2) {
            addCriterion("CONFIG_OPTION_ID_TO not between", value1, value2, "configOptionIdTo");
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

        public Criteria andConfigIactnTypeIdIsNull() {
            addCriterion("CONFIG_IACTN_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andConfigIactnTypeIdIsNotNull() {
            addCriterion("CONFIG_IACTN_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andConfigIactnTypeIdEqualTo(String value) {
            addCriterion("CONFIG_IACTN_TYPE_ID =", value, "configIactnTypeId");
            return (Criteria) this;
        }

        public Criteria andConfigIactnTypeIdNotEqualTo(String value) {
            addCriterion("CONFIG_IACTN_TYPE_ID <>", value, "configIactnTypeId");
            return (Criteria) this;
        }

        public Criteria andConfigIactnTypeIdGreaterThan(String value) {
            addCriterion("CONFIG_IACTN_TYPE_ID >", value, "configIactnTypeId");
            return (Criteria) this;
        }

        public Criteria andConfigIactnTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIG_IACTN_TYPE_ID >=", value, "configIactnTypeId");
            return (Criteria) this;
        }

        public Criteria andConfigIactnTypeIdLessThan(String value) {
            addCriterion("CONFIG_IACTN_TYPE_ID <", value, "configIactnTypeId");
            return (Criteria) this;
        }

        public Criteria andConfigIactnTypeIdLessThanOrEqualTo(String value) {
            addCriterion("CONFIG_IACTN_TYPE_ID <=", value, "configIactnTypeId");
            return (Criteria) this;
        }

        public Criteria andConfigIactnTypeIdLike(String value) {
            addCriterion("CONFIG_IACTN_TYPE_ID like", value, "configIactnTypeId");
            return (Criteria) this;
        }

        public Criteria andConfigIactnTypeIdNotLike(String value) {
            addCriterion("CONFIG_IACTN_TYPE_ID not like", value, "configIactnTypeId");
            return (Criteria) this;
        }

        public Criteria andConfigIactnTypeIdIn(List<String> values) {
            addCriterion("CONFIG_IACTN_TYPE_ID in", values, "configIactnTypeId");
            return (Criteria) this;
        }

        public Criteria andConfigIactnTypeIdNotIn(List<String> values) {
            addCriterion("CONFIG_IACTN_TYPE_ID not in", values, "configIactnTypeId");
            return (Criteria) this;
        }

        public Criteria andConfigIactnTypeIdBetween(String value1, String value2) {
            addCriterion("CONFIG_IACTN_TYPE_ID between", value1, value2, "configIactnTypeId");
            return (Criteria) this;
        }

        public Criteria andConfigIactnTypeIdNotBetween(String value1, String value2) {
            addCriterion("CONFIG_IACTN_TYPE_ID not between", value1, value2, "configIactnTypeId");
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