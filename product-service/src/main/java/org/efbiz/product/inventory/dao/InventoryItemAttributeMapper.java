package org.efbiz.product.inventory.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.inventory.model.InventoryItemAttribute;
import org.efbiz.product.inventory.model.InventoryItemAttributeExample;
import org.efbiz.product.inventory.model.InventoryItemAttributeKey;

@Mapper
public interface InventoryItemAttributeMapper {
    long countByExample(InventoryItemAttributeExample example);

    int deleteByExample(InventoryItemAttributeExample example);

    int deleteByPrimaryKey(InventoryItemAttributeKey key);

    int insert(InventoryItemAttribute record);

    int insertSelective(InventoryItemAttribute record);

    List<InventoryItemAttribute> selectByExample(InventoryItemAttributeExample example);

    InventoryItemAttribute selectByPrimaryKey(InventoryItemAttributeKey key);

    int updateByExampleSelective(@Param("record") InventoryItemAttribute record, @Param("example") InventoryItemAttributeExample example);

    int updateByExample(@Param("record") InventoryItemAttribute record, @Param("example") InventoryItemAttributeExample example);

    int updateByPrimaryKeySelective(InventoryItemAttribute record);

    int updateByPrimaryKey(InventoryItemAttribute record);
}