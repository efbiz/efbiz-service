package org.efbiz.product.facility.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.facility.model.FacilityContactMechPurpose;
import org.efbiz.product.facility.model.FacilityContactMechPurposeExample;
import org.efbiz.product.facility.model.FacilityContactMechPurposeKey;

@Mapper
public interface FacilityContactMechPurposeMapper {
    long countByExample(FacilityContactMechPurposeExample example);

    int deleteByExample(FacilityContactMechPurposeExample example);

    int deleteByPrimaryKey(FacilityContactMechPurposeKey key);

    int insert(FacilityContactMechPurpose record);

    int insertSelective(FacilityContactMechPurpose record);

    List<FacilityContactMechPurpose> selectByExample(FacilityContactMechPurposeExample example);

    FacilityContactMechPurpose selectByPrimaryKey(FacilityContactMechPurposeKey key);

    int updateByExampleSelective(@Param("record") FacilityContactMechPurpose record, @Param("example") FacilityContactMechPurposeExample example);

    int updateByExample(@Param("record") FacilityContactMechPurpose record, @Param("example") FacilityContactMechPurposeExample example);

    int updateByPrimaryKeySelective(FacilityContactMechPurpose record);

    int updateByPrimaryKey(FacilityContactMechPurpose record);
}