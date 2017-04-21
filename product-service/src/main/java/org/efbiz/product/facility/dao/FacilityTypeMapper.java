package org.efbiz.product.facility.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.facility.model.FacilityType;
import org.efbiz.product.facility.model.FacilityTypeExample;

@Mapper
public interface FacilityTypeMapper {
    long countByExample(FacilityTypeExample example);

    int deleteByExample(FacilityTypeExample example);

    int deleteByPrimaryKey(String facilityTypeId);

    int insert(FacilityType record);

    int insertSelective(FacilityType record);

    List<FacilityType> selectByExample(FacilityTypeExample example);

    FacilityType selectByPrimaryKey(String facilityTypeId);

    int updateByExampleSelective(@Param("record") FacilityType record, @Param("example") FacilityTypeExample example);

    int updateByExample(@Param("record") FacilityType record, @Param("example") FacilityTypeExample example);

    int updateByPrimaryKeySelective(FacilityType record);

    int updateByPrimaryKey(FacilityType record);
}