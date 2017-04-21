package org.efbiz.product.feature.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.feature.model.ProductFeatureCategory;
import org.efbiz.product.feature.model.ProductFeatureCategoryExample;

@Mapper
public interface ProductFeatureCategoryMapper {
    long countByExample(ProductFeatureCategoryExample example);

    int deleteByExample(ProductFeatureCategoryExample example);

    int deleteByPrimaryKey(String productFeatureCategoryId);

    int insert(ProductFeatureCategory record);

    int insertSelective(ProductFeatureCategory record);

    List<ProductFeatureCategory> selectByExample(ProductFeatureCategoryExample example);

    ProductFeatureCategory selectByPrimaryKey(String productFeatureCategoryId);

    int updateByExampleSelective(@Param("record") ProductFeatureCategory record, @Param("example") ProductFeatureCategoryExample example);

    int updateByExample(@Param("record") ProductFeatureCategory record, @Param("example") ProductFeatureCategoryExample example);

    int updateByPrimaryKeySelective(ProductFeatureCategory record);

    int updateByPrimaryKey(ProductFeatureCategory record);
}