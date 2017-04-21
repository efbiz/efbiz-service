package org.efbiz.product.facility.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.facility.model.FacilityAttribute;
import org.efbiz.product.facility.model.FacilityAttributeExample;
import org.efbiz.product.facility.model.FacilityAttributeKey;

@Mapper
public interface FacilityAttributeMapper {
    long countByExample(FacilityAttributeExample example);

    int deleteByExample(FacilityAttributeExample example);

    int deleteByPrimaryKey(FacilityAttributeKey key);

    int insert(FacilityAttribute record);

    int insertSelective(FacilityAttribute record);

    List<FacilityAttribute> selectByExample(FacilityAttributeExample example);

    FacilityAttribute selectByPrimaryKey(FacilityAttributeKey key);

    int updateByExampleSelective(@Param("record") FacilityAttribute record, @Param("example") FacilityAttributeExample example);

    int updateByExample(@Param("record") FacilityAttribute record, @Param("example") FacilityAttributeExample example);

    int updateByPrimaryKeySelective(FacilityAttribute record);

    int updateByPrimaryKey(FacilityAttribute record);
}