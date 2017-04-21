package org.efbiz.product.category.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.category.model.ProductCategoryType;
import org.efbiz.product.category.model.ProductCategoryTypeExample;

@Mapper
public interface ProductCategoryTypeMapper {
    long countByExample(ProductCategoryTypeExample example);

    int deleteByExample(ProductCategoryTypeExample example);

    int deleteByPrimaryKey(String productCategoryTypeId);

    int insert(ProductCategoryType record);

    int insertSelective(ProductCategoryType record);

    List<ProductCategoryType> selectByExample(ProductCategoryTypeExample example);

    ProductCategoryType selectByPrimaryKey(String productCategoryTypeId);

    int updateByExampleSelective(@Param("record") ProductCategoryType record, @Param("example") ProductCategoryTypeExample example);

    int updateByExample(@Param("record") ProductCategoryType record, @Param("example") ProductCategoryTypeExample example);

    int updateByPrimaryKeySelective(ProductCategoryType record);

    int updateByPrimaryKey(ProductCategoryType record);
}