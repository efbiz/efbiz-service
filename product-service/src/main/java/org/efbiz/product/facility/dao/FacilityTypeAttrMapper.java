package org.efbiz.product.facility.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.facility.model.FacilityTypeAttr;
import org.efbiz.product.facility.model.FacilityTypeAttrExample;
import org.efbiz.product.facility.model.FacilityTypeAttrKey;

@Mapper
public interface FacilityTypeAttrMapper {
    long countByExample(FacilityTypeAttrExample example);

    int deleteByExample(FacilityTypeAttrExample example);

    int deleteByPrimaryKey(FacilityTypeAttrKey key);

    int insert(FacilityTypeAttr record);

    int insertSelective(FacilityTypeAttr record);

    List<FacilityTypeAttr> selectByExample(FacilityTypeAttrExample example);

    FacilityTypeAttr selectByPrimaryKey(FacilityTypeAttrKey key);

    int updateByExampleSelective(@Param("record") FacilityTypeAttr record, @Param("example") FacilityTypeAttrExample example);

    int updateByExample(@Param("record") FacilityTypeAttr record, @Param("example") FacilityTypeAttrExample example);

    int updateByPrimaryKeySelective(FacilityTypeAttr record);

    int updateByPrimaryKey(FacilityTypeAttr record);
}