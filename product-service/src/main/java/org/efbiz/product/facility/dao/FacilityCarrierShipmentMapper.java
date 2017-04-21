package org.efbiz.product.facility.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.facility.model.FacilityCarrierShipment;
import org.efbiz.product.facility.model.FacilityCarrierShipmentExample;
import org.efbiz.product.facility.model.FacilityCarrierShipmentKey;

@Mapper
public interface FacilityCarrierShipmentMapper {
    long countByExample(FacilityCarrierShipmentExample example);

    int deleteByExample(FacilityCarrierShipmentExample example);

    int deleteByPrimaryKey(FacilityCarrierShipmentKey key);

    int insert(FacilityCarrierShipment record);

    int insertSelective(FacilityCarrierShipment record);

    List<FacilityCarrierShipment> selectByExample(FacilityCarrierShipmentExample example);

    FacilityCarrierShipment selectByPrimaryKey(FacilityCarrierShipmentKey key);

    int updateByExampleSelective(@Param("record") FacilityCarrierShipment record, @Param("example") FacilityCarrierShipmentExample example);

    int updateByExample(@Param("record") FacilityCarrierShipment record, @Param("example") FacilityCarrierShipmentExample example);

    int updateByPrimaryKeySelective(FacilityCarrierShipment record);

    int updateByPrimaryKey(FacilityCarrierShipment record);
}