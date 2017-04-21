package org.efbiz.product.facility.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.facility.model.FacilityGroup;
import org.efbiz.product.facility.model.FacilityGroupExample;

@Mapper
public interface FacilityGroupMapper {
    long countByExample(FacilityGroupExample example);

    int deleteByExample(FacilityGroupExample example);

    int deleteByPrimaryKey(String facilityGroupId);

    int insert(FacilityGroup record);

    int insertSelective(FacilityGroup record);

    List<FacilityGroup> selectByExample(FacilityGroupExample example);

    FacilityGroup selectByPrimaryKey(String facilityGroupId);

    int updateByExampleSelective(@Param("record") FacilityGroup record, @Param("example") FacilityGroupExample example);

    int updateByExample(@Param("record") FacilityGroup record, @Param("example") FacilityGroupExample example);

    int updateByPrimaryKeySelective(FacilityGroup record);

    int updateByPrimaryKey(FacilityGroup record);
}