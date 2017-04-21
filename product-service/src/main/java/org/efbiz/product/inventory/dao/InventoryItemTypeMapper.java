package org.efbiz.product.inventory.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.inventory.model.InventoryItemType;
import org.efbiz.product.inventory.model.InventoryItemTypeExample;

@Mapper
public interface InventoryItemTypeMapper {
    long countByExample(InventoryItemTypeExample example);

    int deleteByExample(InventoryItemTypeExample example);

    int deleteByPrimaryKey(String inventoryItemTypeId);

    int insert(InventoryItemType record);

    int insertSelective(InventoryItemType record);

    List<InventoryItemType> selectByExample(InventoryItemTypeExample example);

    InventoryItemType selectByPrimaryKey(String inventoryItemTypeId);

    int updateByExampleSelective(@Param("record") InventoryItemType record, @Param("example") InventoryItemTypeExample example);

    int updateByExample(@Param("record") InventoryItemType record, @Param("example") InventoryItemTypeExample example);

    int updateByPrimaryKeySelective(InventoryItemType record);

    int updateByPrimaryKey(InventoryItemType record);
}