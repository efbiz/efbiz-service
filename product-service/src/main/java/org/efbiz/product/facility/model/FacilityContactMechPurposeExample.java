package org.efbiz.product.facility.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FacilityContactMechPurposeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public FacilityContactMechPurposeExample() {
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

        public Criteria andContactMechIdIsNull() {
            addCriterion("CONTACT_MECH_ID is null");
            return (Criteria) this;
        }

        public Criteria andContactMechIdIsNotNull() {
            addCriterion("CONTACT_MECH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andContactMechIdEqualTo(String value) {
            addCriterion("CONTACT_MECH_ID =", value, "contactMechId");
            return (Criteria) this;
        }

        public Criteria andContactMechIdNotEqualTo(String value) {
            addCriterion("CONTACT_MECH_ID <>", value, "contactMechId");
            return (Criteria) this;
        }

        public Criteria andContactMechIdGreaterThan(String value) {
            addCriterion("CONTACT_MECH_ID >", value, "contactMechId");
            return (Criteria) this;
        }

        public Criteria andContactMechIdGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_MECH_ID >=", value, "contactMechId");
            return (Criteria) this;
        }

        public Criteria andContactMechIdLessThan(String value) {
            addCriterion("CONTACT_MECH_ID <", value, "contactMechId");
            return (Criteria) this;
        }

        public Criteria andContactMechIdLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_MECH_ID <=", value, "contactMechId");
            return (Criteria) this;
        }

        public Criteria andContactMechIdLike(String value) {
            addCriterion("CONTACT_MECH_ID like", value, "contactMechId");
            return (Criteria) this;
        }

        public Criteria andContactMechIdNotLike(String value) {
            addCriterion("CONTACT_MECH_ID not like", value, "contactMechId");
            return (Criteria) this;
        }

        public Criteria andContactMechIdIn(List<String> values) {
            addCriterion("CONTACT_MECH_ID in", values, "contactMechId");
            return (Criteria) this;
        }

        public Criteria andContactMechIdNotIn(List<String> values) {
            addCriterion("CONTACT_MECH_ID not in", values, "contactMechId");
            return (Criteria) this;
        }

        public Criteria andContactMechIdBetween(String value1, String value2) {
            addCriterion("CONTACT_MECH_ID between", value1, value2, "contactMechId");
            return (Criteria) this;
        }

        public Criteria andContactMechIdNotBetween(String value1, String value2) {
            addCriterion("CONTACT_MECH_ID not between", value1, value2, "contactMechId");
            return (Criteria) this;
        }

        public Criteria andContactMechPurposeTypeIdIsNull() {
            addCriterion("CONTACT_MECH_PURPOSE_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andContactMechPurposeTypeIdIsNotNull() {
            addCriterion("CONTACT_MECH_PURPOSE_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andContactMechPurposeTypeIdEqualTo(String value) {
            addCriterion("CONTACT_MECH_PURPOSE_TYPE_ID =", value, "contactMechPurposeTypeId");
            return (Criteria) this;
        }

        public Criteria andContactMechPurposeTypeIdNotEqualTo(String value) {
            addCriterion("CONTACT_MECH_PURPOSE_TYPE_ID <>", value, "contactMechPurposeTypeId");
            return (Criteria) this;
        }

        public Criteria andContactMechPurposeTypeIdGreaterThan(String value) {
            addCriterion("CONTACT_MECH_PURPOSE_TYPE_ID >", value, "contactMechPurposeTypeId");
            return (Criteria) this;
        }

        public Criteria andContactMechPurposeTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_MECH_PURPOSE_TYPE_ID >=", value, "contactMechPurposeTypeId");
            return (Criteria) this;
        }

        public Criteria andContactMechPurposeTypeIdLessThan(String value) {
            addCriterion("CONTACT_MECH_PURPOSE_TYPE_ID <", value, "contactMechPurposeTypeId");
            return (Criteria) this;
        }

        public Criteria andContactMechPurposeTypeIdLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_MECH_PURPOSE_TYPE_ID <=", value, "contactMechPurposeTypeId");
            return (Criteria) this;
        }

        public Criteria andContactMechPurposeTypeIdLike(String value) {
            addCriterion("CONTACT_MECH_PURPOSE_TYPE_ID like", value, "contactMechPurposeTypeId");
            return (Criteria) this;
        }

        public Criteria andContactMechPurposeTypeIdNotLike(String value) {
            addCriterion("CONTACT_MECH_PURPOSE_TYPE_ID not like", value, "contactMechPurposeTypeId");
            return (Criteria) this;
        }

        public Criteria andContactMechPurposeTypeIdIn(List<String> values) {
            addCriterion("CONTACT_MECH_PURPOSE_TYPE_ID in", values, "contactMechPurposeTypeId");
            return (Criteria) this;
        }

        public Criteria andContactMechPurposeTypeIdNotIn(List<String> values) {
            addCriterion("CONTACT_MECH_PURPOSE_TYPE_ID not in", values, "contactMechPurposeTypeId");
            return (Criteria) this;
        }

        public Criteria andContactMechPurposeTypeIdBetween(String value1, String value2) {
            addCriterion("CONTACT_MECH_PURPOSE_TYPE_ID between", value1, value2, "contactMechPurposeTypeId");
            return (Criteria) this;
        }

        public Criteria andContactMechPurposeTypeIdNotBetween(String value1, String value2) {
            addCriterion("CONTACT_MECH_PURPOSE_TYPE_ID not between", value1, value2, "contactMechPurposeTypeId");
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