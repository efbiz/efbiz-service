package org.efbiz.product.store.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.store.model.ProductStoreGroupRole;
import org.efbiz.product.store.model.ProductStoreGroupRoleExample;
import org.efbiz.product.store.model.ProductStoreGroupRoleKey;

@Mapper
public interface ProductStoreGroupRoleMapper {
    long countByExample(ProductStoreGroupRoleExample example);

    int deleteByExample(ProductStoreGroupRoleExample example);

    int deleteByPrimaryKey(ProductStoreGroupRoleKey key);

    int insert(ProductStoreGroupRole record);

    int insertSelective(ProductStoreGroupRole record);

    List<ProductStoreGroupRole> selectByExample(ProductStoreGroupRoleExample example);

    ProductStoreGroupRole selectByPrimaryKey(ProductStoreGroupRoleKey key);

    int updateByExampleSelective(@Param("record") ProductStoreGroupRole record, @Param("example") ProductStoreGroupRoleExample example);

    int updateByExample(@Param("record") ProductStoreGroupRole record, @Param("example") ProductStoreGroupRoleExample example);

    int updateByPrimaryKeySelective(ProductStoreGroupRole record);

    int updateByPrimaryKey(ProductStoreGroupRole record);
}