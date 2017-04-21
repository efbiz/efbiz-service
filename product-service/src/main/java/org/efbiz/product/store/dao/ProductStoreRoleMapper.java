package org.efbiz.product.store.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.store.model.ProductStoreRole;
import org.efbiz.product.store.model.ProductStoreRoleExample;
import org.efbiz.product.store.model.ProductStoreRoleKey;

@Mapper
public interface ProductStoreRoleMapper {
    long countByExample(ProductStoreRoleExample example);

    int deleteByExample(ProductStoreRoleExample example);

    int deleteByPrimaryKey(ProductStoreRoleKey key);

    int insert(ProductStoreRole record);

    int insertSelective(ProductStoreRole record);

    List<ProductStoreRole> selectByExample(ProductStoreRoleExample example);

    ProductStoreRole selectByPrimaryKey(ProductStoreRoleKey key);

    int updateByExampleSelective(@Param("record") ProductStoreRole record, @Param("example") ProductStoreRoleExample example);

    int updateByExample(@Param("record") ProductStoreRole record, @Param("example") ProductStoreRoleExample example);

    int updateByPrimaryKeySelective(ProductStoreRole record);

    int updateByPrimaryKey(ProductStoreRole record);
}