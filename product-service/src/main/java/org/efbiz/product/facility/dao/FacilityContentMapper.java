package org.efbiz.product.facility.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.facility.model.FacilityContent;
import org.efbiz.product.facility.model.FacilityContentExample;
import org.efbiz.product.facility.model.FacilityContentKey;

@Mapper
public interface FacilityContentMapper {
    long countByExample(FacilityContentExample example);

    int deleteByExample(FacilityContentExample example);

    int deleteByPrimaryKey(FacilityContentKey key);

    int insert(FacilityContent record);

    int insertSelective(FacilityContent record);

    List<FacilityContent> selectByExample(FacilityContentExample example);

    FacilityContent selectByPrimaryKey(FacilityContentKey key);

    int updateByExampleSelective(@Param("record") FacilityContent record, @Param("example") FacilityContentExample example);

    int updateByExample(@Param("record") FacilityContent record, @Param("example") FacilityContentExample example);

    int updateByPrimaryKeySelective(FacilityContent record);

    int updateByPrimaryKey(FacilityContent record);
}