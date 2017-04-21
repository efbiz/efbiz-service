package org.efbiz.product.facility.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.facility.model.FacilityGroupMember;
import org.efbiz.product.facility.model.FacilityGroupMemberExample;
import org.efbiz.product.facility.model.FacilityGroupMemberKey;

@Mapper
public interface FacilityGroupMemberMapper {
    long countByExample(FacilityGroupMemberExample example);

    int deleteByExample(FacilityGroupMemberExample example);

    int deleteByPrimaryKey(FacilityGroupMemberKey key);

    int insert(FacilityGroupMember record);

    int insertSelective(FacilityGroupMember record);

    List<FacilityGroupMember> selectByExample(FacilityGroupMemberExample example);

    FacilityGroupMember selectByPrimaryKey(FacilityGroupMemberKey key);

    int updateByExampleSelective(@Param("record") FacilityGroupMember record, @Param("example") FacilityGroupMemberExample example);

    int updateByExample(@Param("record") FacilityGroupMember record, @Param("example") FacilityGroupMemberExample example);

    int updateByPrimaryKeySelective(FacilityGroupMember record);

    int updateByPrimaryKey(FacilityGroupMember record);
}