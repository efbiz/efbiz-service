package org.efbiz.product.facility.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.facility.model.FacilityLocation;
import org.efbiz.product.facility.model.FacilityLocationExample;
import org.efbiz.product.facility.model.FacilityLocationKey;

@Mapper
public interface FacilityLocationMapper {
    long countByExample(FacilityLocationExample example);

    int deleteByExample(FacilityLocationExample example);

    int deleteByPrimaryKey(FacilityLocationKey key);

    int insert(FacilityLocation record);

    int insertSelective(FacilityLocation record);

    List<FacilityLocation> selectByExample(FacilityLocationExample example);

    FacilityLocation selectByPrimaryKey(FacilityLocationKey key);

    int updateByExampleSelective(@Param("record") FacilityLocation record, @Param("example") FacilityLocationExample example);

    int updateByExample(@Param("record") FacilityLocation record, @Param("example") FacilityLocationExample example);

    int updateByPrimaryKeySelective(FacilityLocation record);

    int updateByPrimaryKey(FacilityLocation record);
}