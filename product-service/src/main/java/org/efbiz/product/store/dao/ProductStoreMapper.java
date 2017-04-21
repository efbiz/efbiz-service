package org.efbiz.product.store.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.store.model.ProductStore;
import org.efbiz.product.store.model.ProductStoreExample;

@Mapper
public interface ProductStoreMapper {
    long countByExample(ProductStoreExample example);

    int deleteByExample(ProductStoreExample example);

    int deleteByPrimaryKey(String productStoreId);

    int insert(ProductStore record);

    int insertSelective(ProductStore record);

    List<ProductStore> selectByExample(ProductStoreExample example);

    ProductStore selectByPrimaryKey(String productStoreId);

    int updateByExampleSelective(@Param("record") ProductStore record, @Param("example") ProductStoreExample example);

    int updateByExample(@Param("record") ProductStore record, @Param("example") ProductStoreExample example);

    int updateByPrimaryKeySelective(ProductStore record);

    int updateByPrimaryKey(ProductStore record);
}