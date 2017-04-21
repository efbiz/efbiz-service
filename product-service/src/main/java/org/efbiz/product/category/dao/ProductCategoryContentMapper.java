package org.efbiz.product.category.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.category.model.ProductCategoryContent;
import org.efbiz.product.category.model.ProductCategoryContentExample;
import org.efbiz.product.category.model.ProductCategoryContentKey;

@Mapper
public interface ProductCategoryContentMapper {
    long countByExample(ProductCategoryContentExample example);

    int deleteByExample(ProductCategoryContentExample example);

    int deleteByPrimaryKey(ProductCategoryContentKey key);

    int insert(ProductCategoryContent record);

    int insertSelective(ProductCategoryContent record);

    List<ProductCategoryContent> selectByExample(ProductCategoryContentExample example);

    ProductCategoryContent selectByPrimaryKey(ProductCategoryContentKey key);

    int updateByExampleSelective(@Param("record") ProductCategoryContent record, @Param("example") ProductCategoryContentExample example);

    int updateByExample(@Param("record") ProductCategoryContent record, @Param("example") ProductCategoryContentExample example);

    int updateByPrimaryKeySelective(ProductCategoryContent record);

    int updateByPrimaryKey(ProductCategoryContent record);
}