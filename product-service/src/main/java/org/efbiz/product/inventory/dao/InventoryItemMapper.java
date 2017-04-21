package org.efbiz.product.inventory.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.inventory.model.InventoryItem;
import org.efbiz.product.inventory.model.InventoryItemExample;

@Mapper
public interface InventoryItemMapper {
    long countByExample(InventoryItemExample example);

    int deleteByExample(InventoryItemExample example);

    int deleteByPrimaryKey(String inventoryItemId);

    int insert(InventoryItem record);

    int insertSelective(InventoryItem record);

    List<InventoryItem> selectByExample(InventoryItemExample example);

    InventoryItem selectByPrimaryKey(String inventoryItemId);

    int updateByExampleSelective(@Param("record") InventoryItem record, @Param("example") InventoryItemExample example);

    int updateByExample(@Param("record") InventoryItem record, @Param("example") InventoryItemExample example);

    int updateByPrimaryKeySelective(InventoryItem record);

    int updateByPrimaryKey(InventoryItem record);
}