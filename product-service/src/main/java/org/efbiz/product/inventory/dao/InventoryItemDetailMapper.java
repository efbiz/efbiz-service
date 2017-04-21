package org.efbiz.product.inventory.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.inventory.model.InventoryItemDetail;
import org.efbiz.product.inventory.model.InventoryItemDetailExample;
import org.efbiz.product.inventory.model.InventoryItemDetailKey;

@Mapper
public interface InventoryItemDetailMapper {
    long countByExample(InventoryItemDetailExample example);

    int deleteByExample(InventoryItemDetailExample example);

    int deleteByPrimaryKey(InventoryItemDetailKey key);

    int insert(InventoryItemDetail record);

    int insertSelective(InventoryItemDetail record);

    List<InventoryItemDetail> selectByExample(InventoryItemDetailExample example);

    InventoryItemDetail selectByPrimaryKey(InventoryItemDetailKey key);

    int updateByExampleSelective(@Param("record") InventoryItemDetail record, @Param("example") InventoryItemDetailExample example);

    int updateByExample(@Param("record") InventoryItemDetail record, @Param("example") InventoryItemDetailExample example);

    int updateByPrimaryKeySelective(InventoryItemDetail record);

    int updateByPrimaryKey(InventoryItemDetail record);
}