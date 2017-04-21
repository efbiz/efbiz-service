package org.efbiz.product.inventory.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.inventory.model.InventoryItemStatus;
import org.efbiz.product.inventory.model.InventoryItemStatusExample;
import org.efbiz.product.inventory.model.InventoryItemStatusKey;

@Mapper
public interface InventoryItemStatusMapper {
    long countByExample(InventoryItemStatusExample example);

    int deleteByExample(InventoryItemStatusExample example);

    int deleteByPrimaryKey(InventoryItemStatusKey key);

    int insert(InventoryItemStatus record);

    int insertSelective(InventoryItemStatus record);

    List<InventoryItemStatus> selectByExample(InventoryItemStatusExample example);

    InventoryItemStatus selectByPrimaryKey(InventoryItemStatusKey key);

    int updateByExampleSelective(@Param("record") InventoryItemStatus record, @Param("example") InventoryItemStatusExample example);

    int updateByExample(@Param("record") InventoryItemStatus record, @Param("example") InventoryItemStatusExample example);

    int updateByPrimaryKeySelective(InventoryItemStatus record);

    int updateByPrimaryKey(InventoryItemStatus record);
}