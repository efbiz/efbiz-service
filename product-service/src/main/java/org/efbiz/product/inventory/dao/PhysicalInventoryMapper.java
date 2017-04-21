package org.efbiz.product.inventory.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.inventory.model.PhysicalInventory;
import org.efbiz.product.inventory.model.PhysicalInventoryExample;

@Mapper
public interface PhysicalInventoryMapper {
    long countByExample(PhysicalInventoryExample example);

    int deleteByExample(PhysicalInventoryExample example);

    int deleteByPrimaryKey(String physicalInventoryId);

    int insert(PhysicalInventory record);

    int insertSelective(PhysicalInventory record);

    List<PhysicalInventory> selectByExample(PhysicalInventoryExample example);

    PhysicalInventory selectByPrimaryKey(String physicalInventoryId);

    int updateByExampleSelective(@Param("record") PhysicalInventory record, @Param("example") PhysicalInventoryExample example);

    int updateByExample(@Param("record") PhysicalInventory record, @Param("example") PhysicalInventoryExample example);

    int updateByPrimaryKeySelective(PhysicalInventory record);

    int updateByPrimaryKey(PhysicalInventory record);
}