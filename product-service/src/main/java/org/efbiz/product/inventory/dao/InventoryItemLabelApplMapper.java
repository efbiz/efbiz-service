package org.efbiz.product.inventory.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.inventory.model.InventoryItemLabelAppl;
import org.efbiz.product.inventory.model.InventoryItemLabelApplExample;
import org.efbiz.product.inventory.model.InventoryItemLabelApplKey;

@Mapper
public interface InventoryItemLabelApplMapper {
    long countByExample(InventoryItemLabelApplExample example);

    int deleteByExample(InventoryItemLabelApplExample example);

    int deleteByPrimaryKey(InventoryItemLabelApplKey key);

    int insert(InventoryItemLabelAppl record);

    int insertSelective(InventoryItemLabelAppl record);

    List<InventoryItemLabelAppl> selectByExample(InventoryItemLabelApplExample example);

    InventoryItemLabelAppl selectByPrimaryKey(InventoryItemLabelApplKey key);

    int updateByExampleSelective(@Param("record") InventoryItemLabelAppl record, @Param("example") InventoryItemLabelApplExample example);

    int updateByExample(@Param("record") InventoryItemLabelAppl record, @Param("example") InventoryItemLabelApplExample example);

    int updateByPrimaryKeySelective(InventoryItemLabelAppl record);

    int updateByPrimaryKey(InventoryItemLabelAppl record);
}