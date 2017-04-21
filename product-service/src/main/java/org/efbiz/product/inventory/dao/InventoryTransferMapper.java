package org.efbiz.product.inventory.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.inventory.model.InventoryTransfer;
import org.efbiz.product.inventory.model.InventoryTransferExample;

@Mapper
public interface InventoryTransferMapper {
    long countByExample(InventoryTransferExample example);

    int deleteByExample(InventoryTransferExample example);

    int deleteByPrimaryKey(String inventoryTransferId);

    int insert(InventoryTransfer record);

    int insertSelective(InventoryTransfer record);

    List<InventoryTransfer> selectByExample(InventoryTransferExample example);

    InventoryTransfer selectByPrimaryKey(String inventoryTransferId);

    int updateByExampleSelective(@Param("record") InventoryTransfer record, @Param("example") InventoryTransferExample example);

    int updateByExample(@Param("record") InventoryTransfer record, @Param("example") InventoryTransferExample example);

    int updateByPrimaryKeySelective(InventoryTransfer record);

    int updateByPrimaryKey(InventoryTransfer record);
}