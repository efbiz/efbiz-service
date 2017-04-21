package org.efbiz.product.category.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.category.model.ProductCategoryRollup;
import org.efbiz.product.category.model.ProductCategoryRollupExample;
import org.efbiz.product.category.model.ProductCategoryRollupKey;

@Mapper
public interface ProductCategoryRollupMapper {
    long countByExample(ProductCategoryRollupExample example);

    int deleteByExample(ProductCategoryRollupExample example);

    int deleteByPrimaryKey(ProductCategoryRollupKey key);

    int insert(ProductCategoryRollup record);

    int insertSelective(ProductCategoryRollup record);

    List<ProductCategoryRollup> selectByExample(ProductCategoryRollupExample example);

    ProductCategoryRollup selectByPrimaryKey(ProductCategoryRollupKey key);

    int updateByExampleSelective(@Param("record") ProductCategoryRollup record, @Param("example") ProductCategoryRollupExample example);

    int updateByExample(@Param("record") ProductCategoryRollup record, @Param("example") ProductCategoryRollupExample example);

    int updateByPrimaryKeySelective(ProductCategoryRollup record);

    int updateByPrimaryKey(ProductCategoryRollup record);
}