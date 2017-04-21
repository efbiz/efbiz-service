package org.efbiz.product.facility.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.facility.model.FacilityGroupRole;
import org.efbiz.product.facility.model.FacilityGroupRoleExample;
import org.efbiz.product.facility.model.FacilityGroupRoleKey;

@Mapper
public interface FacilityGroupRoleMapper {
    long countByExample(FacilityGroupRoleExample example);

    int deleteByExample(FacilityGroupRoleExample example);

    int deleteByPrimaryKey(FacilityGroupRoleKey key);

    int insert(FacilityGroupRole record);

    int insertSelective(FacilityGroupRole record);

    List<FacilityGroupRole> selectByExample(FacilityGroupRoleExample example);

    FacilityGroupRole selectByPrimaryKey(FacilityGroupRoleKey key);

    int updateByExampleSelective(@Param("record") FacilityGroupRole record, @Param("example") FacilityGroupRoleExample example);

    int updateByExample(@Param("record") FacilityGroupRole record, @Param("example") FacilityGroupRoleExample example);

    int updateByPrimaryKeySelective(FacilityGroupRole record);

    int updateByPrimaryKey(FacilityGroupRole record);
}