package org.efbiz.product.category.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.category.model.ProductCategoryAttribute;
import org.efbiz.product.category.model.ProductCategoryAttributeExample;
import org.efbiz.product.category.model.ProductCategoryAttributeKey;

@Mapper
public interface ProductCategoryAttributeMapper {
    long countByExample(ProductCategoryAttributeExample example);

    int deleteByExample(ProductCategoryAttributeExample example);

    int deleteByPrimaryKey(ProductCategoryAttributeKey key);

    int insert(ProductCategoryAttribute record);

    int insertSelective(ProductCategoryAttribute record);

    List<ProductCategoryAttribute> selectByExample(ProductCategoryAttributeExample example);

    ProductCategoryAttribute selectByPrimaryKey(ProductCategoryAttributeKey key);

    int updateByExampleSelective(@Param("record") ProductCategoryAttribute record, @Param("example") ProductCategoryAttributeExample example);

    int updateByExample(@Param("record") ProductCategoryAttribute record, @Param("example") ProductCategoryAttributeExample example);

    int updateByPrimaryKeySelective(ProductCategoryAttribute record);

    int updateByPrimaryKey(ProductCategoryAttribute record);
}