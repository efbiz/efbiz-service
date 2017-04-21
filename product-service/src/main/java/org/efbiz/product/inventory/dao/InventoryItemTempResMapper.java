package org.efbiz.product.inventory.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.inventory.model.InventoryItemTempRes;
import org.efbiz.product.inventory.model.InventoryItemTempResExample;
import org.efbiz.product.inventory.model.InventoryItemTempResKey;

@Mapper
public interface InventoryItemTempResMapper {
    long countByExample(InventoryItemTempResExample example);

    int deleteByExample(InventoryItemTempResExample example);

    int deleteByPrimaryKey(InventoryItemTempResKey key);

    int insert(InventoryItemTempRes record);

    int insertSelective(InventoryItemTempRes record);

    List<InventoryItemTempRes> selectByExample(InventoryItemTempResExample example);

    InventoryItemTempRes selectByPrimaryKey(InventoryItemTempResKey key);

    int updateByExampleSelective(@Param("record") InventoryItemTempRes record, @Param("example") InventoryItemTempResExample example);

    int updateByExample(@Param("record") InventoryItemTempRes record, @Param("example") InventoryItemTempResExample example);

    int updateByPrimaryKeySelective(InventoryItemTempRes record);

    int updateByPrimaryKey(InventoryItemTempRes record);
}