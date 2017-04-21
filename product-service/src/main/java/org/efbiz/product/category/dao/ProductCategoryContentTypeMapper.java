package org.efbiz.product.category.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.category.model.ProductCategoryContentType;
import org.efbiz.product.category.model.ProductCategoryContentTypeExample;

@Mapper
public interface ProductCategoryContentTypeMapper {
    long countByExample(ProductCategoryContentTypeExample example);

    int deleteByExample(ProductCategoryContentTypeExample example);

    int deleteByPrimaryKey(String prodCatContentTypeId);

    int insert(ProductCategoryContentType record);

    int insertSelective(ProductCategoryContentType record);

    List<ProductCategoryContentType> selectByExample(ProductCategoryContentTypeExample example);

    ProductCategoryContentType selectByPrimaryKey(String prodCatContentTypeId);

    int updateByExampleSelective(@Param("record") ProductCategoryContentType record, @Param("example") ProductCategoryContentTypeExample example);

    int updateByExample(@Param("record") ProductCategoryContentType record, @Param("example") ProductCategoryContentTypeExample example);

    int updateByPrimaryKeySelective(ProductCategoryContentType record);

    int updateByPrimaryKey(ProductCategoryContentType record);
}