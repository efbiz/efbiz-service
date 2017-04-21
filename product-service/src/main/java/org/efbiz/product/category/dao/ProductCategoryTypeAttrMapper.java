package org.efbiz.product.category.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.category.model.ProductCategoryTypeAttr;
import org.efbiz.product.category.model.ProductCategoryTypeAttrExample;
import org.efbiz.product.category.model.ProductCategoryTypeAttrKey;

@Mapper
public interface ProductCategoryTypeAttrMapper {
    long countByExample(ProductCategoryTypeAttrExample example);

    int deleteByExample(ProductCategoryTypeAttrExample example);

    int deleteByPrimaryKey(ProductCategoryTypeAttrKey key);

    int insert(ProductCategoryTypeAttr record);

    int insertSelective(ProductCategoryTypeAttr record);

    List<ProductCategoryTypeAttr> selectByExample(ProductCategoryTypeAttrExample example);

    ProductCategoryTypeAttr selectByPrimaryKey(ProductCategoryTypeAttrKey key);

    int updateByExampleSelective(@Param("record") ProductCategoryTypeAttr record, @Param("example") ProductCategoryTypeAttrExample example);

    int updateByExample(@Param("record") ProductCategoryTypeAttr record, @Param("example") ProductCategoryTypeAttrExample example);

    int updateByPrimaryKeySelective(ProductCategoryTypeAttr record);

    int updateByPrimaryKey(ProductCategoryTypeAttr record);
}