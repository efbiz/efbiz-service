package org.efbiz.product.store.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.store.model.ProductStoreGroup;
import org.efbiz.product.store.model.ProductStoreGroupExample;

@Mapper
public interface ProductStoreGroupMapper {
    long countByExample(ProductStoreGroupExample example);

    int deleteByExample(ProductStoreGroupExample example);

    int deleteByPrimaryKey(String productStoreGroupId);

    int insert(ProductStoreGroup record);

    int insertSelective(ProductStoreGroup record);

    List<ProductStoreGroup> selectByExample(ProductStoreGroupExample example);

    ProductStoreGroup selectByPrimaryKey(String productStoreGroupId);

    int updateByExampleSelective(@Param("record") ProductStoreGroup record, @Param("example") ProductStoreGroupExample example);

    int updateByExample(@Param("record") ProductStoreGroup record, @Param("example") ProductStoreGroupExample example);

    int updateByPrimaryKeySelective(ProductStoreGroup record);

    int updateByPrimaryKey(ProductStoreGroup record);
}