package org.efbiz.product.inventory.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.inventory.model.InventoryItemVariance;
import org.efbiz.product.inventory.model.InventoryItemVarianceExample;
import org.efbiz.product.inventory.model.InventoryItemVarianceKey;

@Mapper
public interface InventoryItemVarianceMapper {
    long countByExample(InventoryItemVarianceExample example);

    int deleteByExample(InventoryItemVarianceExample example);

    int deleteByPrimaryKey(InventoryItemVarianceKey key);

    int insert(InventoryItemVariance record);

    int insertSelective(InventoryItemVariance record);

    List<InventoryItemVariance> selectByExample(InventoryItemVarianceExample example);

    InventoryItemVariance selectByPrimaryKey(InventoryItemVarianceKey key);

    int updateByExampleSelective(@Param("record") InventoryItemVariance record, @Param("example") InventoryItemVarianceExample example);

    int updateByExample(@Param("record") InventoryItemVariance record, @Param("example") InventoryItemVarianceExample example);

    int updateByPrimaryKeySelective(InventoryItemVariance record);

    int updateByPrimaryKey(InventoryItemVariance record);
}