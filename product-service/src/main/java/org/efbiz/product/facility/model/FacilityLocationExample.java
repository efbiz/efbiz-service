package org.efbiz.product.facility.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FacilityLocationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public FacilityLocationExample() {
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

        public Criteria andLocationSeqIdIsNull() {
            addCriterion("LOCATION_SEQ_ID is null");
            return (Criteria) this;
        }

        public Criteria andLocationSeqIdIsNotNull() {
            addCriterion("LOCATION_SEQ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLocationSeqIdEqualTo(String value) {
            addCriterion("LOCATION_SEQ_ID =", value, "locationSeqId");
            return (Criteria) this;
        }

        public Criteria andLocationSeqIdNotEqualTo(String value) {
            addCriterion("LOCATION_SEQ_ID <>", value, "locationSeqId");
            return (Criteria) this;
        }

        public Criteria andLocationSeqIdGreaterThan(String value) {
            addCriterion("LOCATION_SEQ_ID >", value, "locationSeqId");
            return (Criteria) this;
        }

        public Criteria andLocationSeqIdGreaterThanOrEqualTo(String value) {
            addCriterion("LOCATION_SEQ_ID >=", value, "locationSeqId");
            return (Criteria) this;
        }

        public Criteria andLocationSeqIdLessThan(String value) {
            addCriterion("LOCATION_SEQ_ID <", value, "locationSeqId");
            return (Criteria) this;
        }

        public Criteria andLocationSeqIdLessThanOrEqualTo(String value) {
            addCriterion("LOCATION_SEQ_ID <=", value, "locationSeqId");
            return (Criteria) this;
        }

        public Criteria andLocationSeqIdLike(String value) {
            addCriterion("LOCATION_SEQ_ID like", value, "locationSeqId");
            return (Criteria) this;
        }

        public Criteria andLocationSeqIdNotLike(String value) {
            addCriterion("LOCATION_SEQ_ID not like", value, "locationSeqId");
            return (Criteria) this;
        }

        public Criteria andLocationSeqIdIn(List<String> values) {
            addCriterion("LOCATION_SEQ_ID in", values, "locationSeqId");
            return (Criteria) this;
        }

        public Criteria andLocationSeqIdNotIn(List<String> values) {
            addCriterion("LOCATION_SEQ_ID not in", values, "locationSeqId");
            return (Criteria) this;
        }

        public Criteria andLocationSeqIdBetween(String value1, String value2) {
            addCriterion("LOCATION_SEQ_ID between", value1, value2, "locationSeqId");
            return (Criteria) this;
        }

        public Criteria andLocationSeqIdNotBetween(String value1, String value2) {
            addCriterion("LOCATION_SEQ_ID not between", value1, value2, "locationSeqId");
            return (Criteria) this;
        }

        public Criteria andLocationTypeEnumIdIsNull() {
            addCriterion("LOCATION_TYPE_ENUM_ID is null");
            return (Criteria) this;
        }

        public Criteria andLocationTypeEnumIdIsNotNull() {
            addCriterion("LOCATION_TYPE_ENUM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLocationTypeEnumIdEqualTo(String value) {
            addCriterion("LOCATION_TYPE_ENUM_ID =", value, "locationTypeEnumId");
            return (Criteria) this;
        }

        public Criteria andLocationTypeEnumIdNotEqualTo(String value) {
            addCriterion("LOCATION_TYPE_ENUM_ID <>", value, "locationTypeEnumId");
            return (Criteria) this;
        }

        public Criteria andLocationTypeEnumIdGreaterThan(String value) {
            addCriterion("LOCATION_TYPE_ENUM_ID >", value, "locationTypeEnumId");
            return (Criteria) this;
        }

        public Criteria andLocationTypeEnumIdGreaterThanOrEqualTo(String value) {
            addCriterion("LOCATION_TYPE_ENUM_ID >=", value, "locationTypeEnumId");
            return (Criteria) this;
        }

        public Criteria andLocationTypeEnumIdLessThan(String value) {
            addCriterion("LOCATION_TYPE_ENUM_ID <", value, "locationTypeEnumId");
            return (Criteria) this;
        }

        public Criteria andLocationTypeEnumIdLessThanOrEqualTo(String value) {
            addCriterion("LOCATION_TYPE_ENUM_ID <=", value, "locationTypeEnumId");
            return (Criteria) this;
        }

        public Criteria andLocationTypeEnumIdLike(String value) {
            addCriterion("LOCATION_TYPE_ENUM_ID like", value, "locationTypeEnumId");
            return (Criteria) this;
        }

        public Criteria andLocationTypeEnumIdNotLike(String value) {
            addCriterion("LOCATION_TYPE_ENUM_ID not like", value, "locationTypeEnumId");
            return (Criteria) this;
        }

        public Criteria andLocationTypeEnumIdIn(List<String> values) {
            addCriterion("LOCATION_TYPE_ENUM_ID in", values, "locationTypeEnumId");
            return (Criteria) this;
        }

        public Criteria andLocationTypeEnumIdNotIn(List<String> values) {
            addCriterion("LOCATION_TYPE_ENUM_ID not in", values, "locationTypeEnumId");
            return (Criteria) this;
        }

        public Criteria andLocationTypeEnumIdBetween(String value1, String value2) {
            addCriterion("LOCATION_TYPE_ENUM_ID between", value1, value2, "locationTypeEnumId");
            return (Criteria) this;
        }

        public Criteria andLocationTypeEnumIdNotBetween(String value1, String value2) {
            addCriterion("LOCATION_TYPE_ENUM_ID not between", value1, value2, "locationTypeEnumId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNull() {
            addCriterion("AREA_ID is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("AREA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(String value) {
            addCriterion("AREA_ID =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(String value) {
            addCriterion("AREA_ID <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(String value) {
            addCriterion("AREA_ID >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(String value) {
            addCriterion("AREA_ID >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(String value) {
            addCriterion("AREA_ID <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(String value) {
            addCriterion("AREA_ID <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLike(String value) {
            addCriterion("AREA_ID like", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotLike(String value) {
            addCriterion("AREA_ID not like", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<String> values) {
            addCriterion("AREA_ID in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<String> values) {
            addCriterion("AREA_ID not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(String value1, String value2) {
            addCriterion("AREA_ID between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(String value1, String value2) {
            addCriterion("AREA_ID not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAisleIdIsNull() {
            addCriterion("AISLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andAisleIdIsNotNull() {
            addCriterion("AISLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAisleIdEqualTo(String value) {
            addCriterion("AISLE_ID =", value, "aisleId");
            return (Criteria) this;
        }

        public Criteria andAisleIdNotEqualTo(String value) {
            addCriterion("AISLE_ID <>", value, "aisleId");
            return (Criteria) this;
        }

        public Criteria andAisleIdGreaterThan(String value) {
            addCriterion("AISLE_ID >", value, "aisleId");
            return (Criteria) this;
        }

        public Criteria andAisleIdGreaterThanOrEqualTo(String value) {
            addCriterion("AISLE_ID >=", value, "aisleId");
            return (Criteria) this;
        }

        public Criteria andAisleIdLessThan(String value) {
            addCriterion("AISLE_ID <", value, "aisleId");
            return (Criteria) this;
        }

        public Criteria andAisleIdLessThanOrEqualTo(String value) {
            addCriterion("AISLE_ID <=", value, "aisleId");
            return (Criteria) this;
        }

        public Criteria andAisleIdLike(String value) {
            addCriterion("AISLE_ID like", value, "aisleId");
            return (Criteria) this;
        }

        public Criteria andAisleIdNotLike(String value) {
            addCriterion("AISLE_ID not like", value, "aisleId");
            return (Criteria) this;
        }

        public Criteria andAisleIdIn(List<String> values) {
            addCriterion("AISLE_ID in", values, "aisleId");
            return (Criteria) this;
        }

        public Criteria andAisleIdNotIn(List<String> values) {
            addCriterion("AISLE_ID not in", values, "aisleId");
            return (Criteria) this;
        }

        public Criteria andAisleIdBetween(String value1, String value2) {
            addCriterion("AISLE_ID between", value1, value2, "aisleId");
            return (Criteria) this;
        }

        public Criteria andAisleIdNotBetween(String value1, String value2) {
            addCriterion("AISLE_ID not between", value1, value2, "aisleId");
            return (Criteria) this;
        }

        public Criteria andSectionIdIsNull() {
            addCriterion("SECTION_ID is null");
            return (Criteria) this;
        }

        public Criteria andSectionIdIsNotNull() {
            addCriterion("SECTION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSectionIdEqualTo(String value) {
            addCriterion("SECTION_ID =", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdNotEqualTo(String value) {
            addCriterion("SECTION_ID <>", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdGreaterThan(String value) {
            addCriterion("SECTION_ID >", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdGreaterThanOrEqualTo(String value) {
            addCriterion("SECTION_ID >=", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdLessThan(String value) {
            addCriterion("SECTION_ID <", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdLessThanOrEqualTo(String value) {
            addCriterion("SECTION_ID <=", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdLike(String value) {
            addCriterion("SECTION_ID like", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdNotLike(String value) {
            addCriterion("SECTION_ID not like", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdIn(List<String> values) {
            addCriterion("SECTION_ID in", values, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdNotIn(List<String> values) {
            addCriterion("SECTION_ID not in", values, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdBetween(String value1, String value2) {
            addCriterion("SECTION_ID between", value1, value2, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdNotBetween(String value1, String value2) {
            addCriterion("SECTION_ID not between", value1, value2, "sectionId");
            return (Criteria) this;
        }

        public Criteria andLevelIdIsNull() {
            addCriterion("LEVEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andLevelIdIsNotNull() {
            addCriterion("LEVEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLevelIdEqualTo(String value) {
            addCriterion("LEVEL_ID =", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdNotEqualTo(String value) {
            addCriterion("LEVEL_ID <>", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdGreaterThan(String value) {
            addCriterion("LEVEL_ID >", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdGreaterThanOrEqualTo(String value) {
            addCriterion("LEVEL_ID >=", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdLessThan(String value) {
            addCriterion("LEVEL_ID <", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdLessThanOrEqualTo(String value) {
            addCriterion("LEVEL_ID <=", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdLike(String value) {
            addCriterion("LEVEL_ID like", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdNotLike(String value) {
            addCriterion("LEVEL_ID not like", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdIn(List<String> values) {
            addCriterion("LEVEL_ID in", values, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdNotIn(List<String> values) {
            addCriterion("LEVEL_ID not in", values, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdBetween(String value1, String value2) {
            addCriterion("LEVEL_ID between", value1, value2, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdNotBetween(String value1, String value2) {
            addCriterion("LEVEL_ID not between", value1, value2, "levelId");
            return (Criteria) this;
        }

        public Criteria andPositionIdIsNull() {
            addCriterion("POSITION_ID is null");
            return (Criteria) this;
        }

        public Criteria andPositionIdIsNotNull() {
            addCriterion("POSITION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPositionIdEqualTo(String value) {
            addCriterion("POSITION_ID =", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotEqualTo(String value) {
            addCriterion("POSITION_ID <>", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdGreaterThan(String value) {
            addCriterion("POSITION_ID >", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdGreaterThanOrEqualTo(String value) {
            addCriterion("POSITION_ID >=", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdLessThan(String value) {
            addCriterion("POSITION_ID <", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdLessThanOrEqualTo(String value) {
            addCriterion("POSITION_ID <=", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdLike(String value) {
            addCriterion("POSITION_ID like", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotLike(String value) {
            addCriterion("POSITION_ID not like", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdIn(List<String> values) {
            addCriterion("POSITION_ID in", values, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotIn(List<String> values) {
            addCriterion("POSITION_ID not in", values, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdBetween(String value1, String value2) {
            addCriterion("POSITION_ID between", value1, value2, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotBetween(String value1, String value2) {
            addCriterion("POSITION_ID not between", value1, value2, "positionId");
            return (Criteria) this;
        }

        public Criteria andGeoPointIdIsNull() {
            addCriterion("GEO_POINT_ID is null");
            return (Criteria) this;
        }

        public Criteria andGeoPointIdIsNotNull() {
            addCriterion("GEO_POINT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGeoPointIdEqualTo(String value) {
            addCriterion("GEO_POINT_ID =", value, "geoPointId");
            return (Criteria) this;
        }

        public Criteria andGeoPointIdNotEqualTo(String value) {
            addCriterion("GEO_POINT_ID <>", value, "geoPointId");
            return (Criteria) this;
        }

        public Criteria andGeoPointIdGreaterThan(String value) {
            addCriterion("GEO_POINT_ID >", value, "geoPointId");
            return (Criteria) this;
        }

        public Criteria andGeoPointIdGreaterThanOrEqualTo(String value) {
            addCriterion("GEO_POINT_ID >=", value, "geoPointId");
            return (Criteria) this;
        }

        public Criteria andGeoPointIdLessThan(String value) {
            addCriterion("GEO_POINT_ID <", value, "geoPointId");
            return (Criteria) this;
        }

        public Criteria andGeoPointIdLessThanOrEqualTo(String value) {
            addCriterion("GEO_POINT_ID <=", value, "geoPointId");
            return (Criteria) this;
        }

        public Criteria andGeoPointIdLike(String value) {
            addCriterion("GEO_POINT_ID like", value, "geoPointId");
            return (Criteria) this;
        }

        public Criteria andGeoPointIdNotLike(String value) {
            addCriterion("GEO_POINT_ID not like", value, "geoPointId");
            return (Criteria) this;
        }

        public Criteria andGeoPointIdIn(List<String> values) {
            addCriterion("GEO_POINT_ID in", values, "geoPointId");
            return (Criteria) this;
        }

        public Criteria andGeoPointIdNotIn(List<String> values) {
            addCriterion("GEO_POINT_ID not in", values, "geoPointId");
            return (Criteria) this;
        }

        public Criteria andGeoPointIdBetween(String value1, String value2) {
            addCriterion("GEO_POINT_ID between", value1, value2, "geoPointId");
            return (Criteria) this;
        }

        public Criteria andGeoPointIdNotBetween(String value1, String value2) {
            addCriterion("GEO_POINT_ID not between", value1, value2, "geoPointId");
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