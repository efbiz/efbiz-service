package org.efbiz.product.product.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.product.model.ProductRole;
import org.efbiz.product.product.model.ProductRoleExample;
import org.efbiz.product.product.model.ProductRoleKey;

@Mapper
public interface ProductRoleMapper {
    long countByExample(ProductRoleExample example);

    int deleteByExample(ProductRoleExample example);

    int deleteByPrimaryKey(ProductRoleKey key);

    int insert(ProductRole record);

    int insertSelective(ProductRole record);

    List<ProductRole> selectByExample(ProductRoleExample example);

    ProductRole selectByPrimaryKey(ProductRoleKey key);

    int updateByExampleSelective(@Param("record") ProductRole record, @Param("example") ProductRoleExample example);

    int updateByExample(@Param("record") ProductRole record, @Param("example") ProductRoleExample example);

    int updateByPrimaryKeySelective(ProductRole record);

    int updateByPrimaryKey(ProductRole record);
}