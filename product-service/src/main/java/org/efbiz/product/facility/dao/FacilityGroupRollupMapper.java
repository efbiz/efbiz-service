package org.efbiz.product.facility.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.facility.model.FacilityGroupRollup;
import org.efbiz.product.facility.model.FacilityGroupRollupExample;
import org.efbiz.product.facility.model.FacilityGroupRollupKey;

@Mapper
public interface FacilityGroupRollupMapper {
    long countByExample(FacilityGroupRollupExample example);

    int deleteByExample(FacilityGroupRollupExample example);

    int deleteByPrimaryKey(FacilityGroupRollupKey key);

    int insert(FacilityGroupRollup record);

    int insertSelective(FacilityGroupRollup record);

    List<FacilityGroupRollup> selectByExample(FacilityGroupRollupExample example);

    FacilityGroupRollup selectByPrimaryKey(FacilityGroupRollupKey key);

    int updateByExampleSelective(@Param("record") FacilityGroupRollup record, @Param("example") FacilityGroupRollupExample example);

    int updateByExample(@Param("record") FacilityGroupRollup record, @Param("example") FacilityGroupRollupExample example);

    int updateByPrimaryKeySelective(FacilityGroupRollup record);

    int updateByPrimaryKey(FacilityGroupRollup record);
}