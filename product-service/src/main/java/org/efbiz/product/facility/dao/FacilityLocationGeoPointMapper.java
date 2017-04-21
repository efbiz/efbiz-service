package org.efbiz.product.facility.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.facility.model.FacilityLocationGeoPoint;
import org.efbiz.product.facility.model.FacilityLocationGeoPointExample;
import org.efbiz.product.facility.model.FacilityLocationGeoPointKey;

@Mapper
public interface FacilityLocationGeoPointMapper {
    long countByExample(FacilityLocationGeoPointExample example);

    int deleteByExample(FacilityLocationGeoPointExample example);

    int deleteByPrimaryKey(FacilityLocationGeoPointKey key);

    int insert(FacilityLocationGeoPoint record);

    int insertSelective(FacilityLocationGeoPoint record);

    List<FacilityLocationGeoPoint> selectByExample(FacilityLocationGeoPointExample example);

    FacilityLocationGeoPoint selectByPrimaryKey(FacilityLocationGeoPointKey key);

    int updateByExampleSelective(@Param("record") FacilityLocationGeoPoint record, @Param("example") FacilityLocationGeoPointExample example);

    int updateByExample(@Param("record") FacilityLocationGeoPoint record, @Param("example") FacilityLocationGeoPointExample example);

    int updateByPrimaryKeySelective(FacilityLocationGeoPoint record);

    int updateByPrimaryKey(FacilityLocationGeoPoint record);
}