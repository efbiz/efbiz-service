package org.efbiz.product.facility.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.facility.model.FacilityContactMech;
import org.efbiz.product.facility.model.FacilityContactMechExample;
import org.efbiz.product.facility.model.FacilityContactMechKey;

@Mapper
public interface FacilityContactMechMapper {
    long countByExample(FacilityContactMechExample example);

    int deleteByExample(FacilityContactMechExample example);

    int deleteByPrimaryKey(FacilityContactMechKey key);

    int insert(FacilityContactMech record);

    int insertSelective(FacilityContactMech record);

    List<FacilityContactMech> selectByExample(FacilityContactMechExample example);

    FacilityContactMech selectByPrimaryKey(FacilityContactMechKey key);

    int updateByExampleSelective(@Param("record") FacilityContactMech record, @Param("example") FacilityContactMechExample example);

    int updateByExample(@Param("record") FacilityContactMech record, @Param("example") FacilityContactMechExample example);

    int updateByPrimaryKeySelective(FacilityContactMech record);

    int updateByPrimaryKey(FacilityContactMech record);
}