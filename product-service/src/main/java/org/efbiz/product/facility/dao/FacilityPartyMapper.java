package org.efbiz.product.facility.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.facility.model.FacilityParty;
import org.efbiz.product.facility.model.FacilityPartyExample;
import org.efbiz.product.facility.model.FacilityPartyKey;

@Mapper
public interface FacilityPartyMapper {
    long countByExample(FacilityPartyExample example);

    int deleteByExample(FacilityPartyExample example);

    int deleteByPrimaryKey(FacilityPartyKey key);

    int insert(FacilityParty record);

    int insertSelective(FacilityParty record);

    List<FacilityParty> selectByExample(FacilityPartyExample example);

    FacilityParty selectByPrimaryKey(FacilityPartyKey key);

    int updateByExampleSelective(@Param("record") FacilityParty record, @Param("example") FacilityPartyExample example);

    int updateByExample(@Param("record") FacilityParty record, @Param("example") FacilityPartyExample example);

    int updateByPrimaryKeySelective(FacilityParty record);

    int updateByPrimaryKey(FacilityParty record);
}