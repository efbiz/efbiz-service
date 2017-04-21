package org.efbiz.product.inventory.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.inventory.model.InventoryItemLabel;
import org.efbiz.product.inventory.model.InventoryItemLabelExample;

@Mapper
public interface InventoryItemLabelMapper {
    long countByExample(InventoryItemLabelExample example);

    int deleteByExample(InventoryItemLabelExample example);

    int deleteByPrimaryKey(String inventoryItemLabelId);

    int insert(InventoryItemLabel record);

    int insertSelective(InventoryItemLabel record);

    List<InventoryItemLabel> selectByExample(InventoryItemLabelExample example);

    InventoryItemLabel selectByPrimaryKey(String inventoryItemLabelId);

    int updateByExampleSelective(@Param("record") InventoryItemLabel record, @Param("example") InventoryItemLabelExample example);

    int updateByExample(@Param("record") InventoryItemLabel record, @Param("example") InventoryItemLabelExample example);

    int updateByPrimaryKeySelective(InventoryItemLabel record);

    int updateByPrimaryKey(InventoryItemLabel record);
}