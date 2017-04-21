package org.efbiz.product.inventory.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.inventory.model.InventoryItemTypeAttr;
import org.efbiz.product.inventory.model.InventoryItemTypeAttrExample;
import org.efbiz.product.inventory.model.InventoryItemTypeAttrKey;

@Mapper
public interface InventoryItemTypeAttrMapper {
    long countByExample(InventoryItemTypeAttrExample example);

    int deleteByExample(InventoryItemTypeAttrExample example);

    int deleteByPrimaryKey(InventoryItemTypeAttrKey key);

    int insert(InventoryItemTypeAttr record);

    int insertSelective(InventoryItemTypeAttr record);

    List<InventoryItemTypeAttr> selectByExample(InventoryItemTypeAttrExample example);

    InventoryItemTypeAttr selectByPrimaryKey(InventoryItemTypeAttrKey key);

    int updateByExampleSelective(@Param("record") InventoryItemTypeAttr record, @Param("example") InventoryItemTypeAttrExample example);

    int updateByExample(@Param("record") InventoryItemTypeAttr record, @Param("example") InventoryItemTypeAttrExample example);

    int updateByPrimaryKeySelective(InventoryItemTypeAttr record);

    int updateByPrimaryKey(InventoryItemTypeAttr record);
}