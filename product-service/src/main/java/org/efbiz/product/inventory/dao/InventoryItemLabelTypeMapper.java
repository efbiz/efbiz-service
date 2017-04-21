package org.efbiz.product.inventory.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.inventory.model.InventoryItemLabelType;
import org.efbiz.product.inventory.model.InventoryItemLabelTypeExample;

@Mapper
public interface InventoryItemLabelTypeMapper {
    long countByExample(InventoryItemLabelTypeExample example);

    int deleteByExample(InventoryItemLabelTypeExample example);

    int deleteByPrimaryKey(String inventoryItemLabelTypeId);

    int insert(InventoryItemLabelType record);

    int insertSelective(InventoryItemLabelType record);

    List<InventoryItemLabelType> selectByExample(InventoryItemLabelTypeExample example);

    InventoryItemLabelType selectByPrimaryKey(String inventoryItemLabelTypeId);

    int updateByExampleSelective(@Param("record") InventoryItemLabelType record, @Param("example") InventoryItemLabelTypeExample example);

    int updateByExample(@Param("record") InventoryItemLabelType record, @Param("example") InventoryItemLabelTypeExample example);

    int updateByPrimaryKeySelective(InventoryItemLabelType record);

    int updateByPrimaryKey(InventoryItemLabelType record);
}