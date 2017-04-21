package org.efbiz.product.category.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.category.model.ProductCategoryGlAccount;
import org.efbiz.product.category.model.ProductCategoryGlAccountExample;
import org.efbiz.product.category.model.ProductCategoryGlAccountKey;

@Mapper
public interface ProductCategoryGlAccountMapper {
    long countByExample(ProductCategoryGlAccountExample example);

    int deleteByExample(ProductCategoryGlAccountExample example);

    int deleteByPrimaryKey(ProductCategoryGlAccountKey key);

    int insert(ProductCategoryGlAccount record);

    int insertSelective(ProductCategoryGlAccount record);

    List<ProductCategoryGlAccount> selectByExample(ProductCategoryGlAccountExample example);

    ProductCategoryGlAccount selectByPrimaryKey(ProductCategoryGlAccountKey key);

    int updateByExampleSelective(@Param("record") ProductCategoryGlAccount record, @Param("example") ProductCategoryGlAccountExample example);

    int updateByExample(@Param("record") ProductCategoryGlAccount record, @Param("example") ProductCategoryGlAccountExample example);

    int updateByPrimaryKeySelective(ProductCategoryGlAccount record);

    int updateByPrimaryKey(ProductCategoryGlAccount record);
}