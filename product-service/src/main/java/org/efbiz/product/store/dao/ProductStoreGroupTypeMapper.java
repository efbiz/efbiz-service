package org.efbiz.product.store.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.store.model.ProductStoreGroupType;
import org.efbiz.product.store.model.ProductStoreGroupTypeExample;

@Mapper
public interface ProductStoreGroupTypeMapper {
    long countByExample(ProductStoreGroupTypeExample example);

    int deleteByExample(ProductStoreGroupTypeExample example);

    int deleteByPrimaryKey(String productStoreGroupTypeId);

    int insert(ProductStoreGroupType record);

    int insertSelective(ProductStoreGroupType record);

    List<ProductStoreGroupType> selectByExample(ProductStoreGroupTypeExample example);

    ProductStoreGroupType selectByPrimaryKey(String productStoreGroupTypeId);

    int updateByExampleSelective(@Param("record") ProductStoreGroupType record, @Param("example") ProductStoreGroupTypeExample example);

    int updateByExample(@Param("record") ProductStoreGroupType record, @Param("example") ProductStoreGroupTypeExample example);

    int updateByPrimaryKeySelective(ProductStoreGroupType record);

    int updateByPrimaryKey(ProductStoreGroupType record);
}