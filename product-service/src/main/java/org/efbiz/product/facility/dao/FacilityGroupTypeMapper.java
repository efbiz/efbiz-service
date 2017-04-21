package org.efbiz.product.facility.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.facility.model.FacilityGroupType;
import org.efbiz.product.facility.model.FacilityGroupTypeExample;

@Mapper
public interface FacilityGroupTypeMapper {
    long countByExample(FacilityGroupTypeExample example);

    int deleteByExample(FacilityGroupTypeExample example);

    int deleteByPrimaryKey(String facilityGroupTypeId);

    int insert(FacilityGroupType record);

    int insertSelective(FacilityGroupType record);

    List<FacilityGroupType> selectByExample(FacilityGroupTypeExample example);

    FacilityGroupType selectByPrimaryKey(String facilityGroupTypeId);

    int updateByExampleSelective(@Param("record") FacilityGroupType record, @Param("example") FacilityGroupTypeExample example);

    int updateByExample(@Param("record") FacilityGroupType record, @Param("example") FacilityGroupTypeExample example);

    int updateByPrimaryKeySelective(FacilityGroupType record);

    int updateByPrimaryKey(FacilityGroupType record);
}