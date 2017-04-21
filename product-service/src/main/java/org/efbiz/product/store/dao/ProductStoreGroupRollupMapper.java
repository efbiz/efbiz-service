package org.efbiz.product.store.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.store.model.ProductStoreGroupRollup;
import org.efbiz.product.store.model.ProductStoreGroupRollupExample;
import org.efbiz.product.store.model.ProductStoreGroupRollupKey;

@Mapper
public interface ProductStoreGroupRollupMapper {
    long countByExample(ProductStoreGroupRollupExample example);

    int deleteByExample(ProductStoreGroupRollupExample example);

    int deleteByPrimaryKey(ProductStoreGroupRollupKey key);

    int insert(ProductStoreGroupRollup record);

    int insertSelective(ProductStoreGroupRollup record);

    List<ProductStoreGroupRollup> selectByExample(ProductStoreGroupRollupExample example);

    ProductStoreGroupRollup selectByPrimaryKey(ProductStoreGroupRollupKey key);

    int updateByExampleSelective(@Param("record") ProductStoreGroupRollup record, @Param("example") ProductStoreGroupRollupExample example);

    int updateByExample(@Param("record") ProductStoreGroupRollup record, @Param("example") ProductStoreGroupRollupExample example);

    int updateByPrimaryKeySelective(ProductStoreGroupRollup record);

    int updateByPrimaryKey(ProductStoreGroupRollup record);
}