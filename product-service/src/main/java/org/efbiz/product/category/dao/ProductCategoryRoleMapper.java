package org.efbiz.product.category.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.category.model.ProductCategoryRole;
import org.efbiz.product.category.model.ProductCategoryRoleExample;
import org.efbiz.product.category.model.ProductCategoryRoleKey;

@Mapper
public interface ProductCategoryRoleMapper {
    long countByExample(ProductCategoryRoleExample example);

    int deleteByExample(ProductCategoryRoleExample example);

    int deleteByPrimaryKey(ProductCategoryRoleKey key);

    int insert(ProductCategoryRole record);

    int insertSelective(ProductCategoryRole record);

    List<ProductCategoryRole> selectByExample(ProductCategoryRoleExample example);

    ProductCategoryRole selectByPrimaryKey(ProductCategoryRoleKey key);

    int updateByExampleSelective(@Param("record") ProductCategoryRole record, @Param("example") ProductCategoryRoleExample example);

    int updateByExample(@Param("record") ProductCategoryRole record, @Param("example") ProductCategoryRoleExample example);

    int updateByPrimaryKeySelective(ProductCategoryRole record);

    int updateByPrimaryKey(ProductCategoryRole record);
}