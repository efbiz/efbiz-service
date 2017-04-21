package org.efbiz.product.feature.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.feature.model.ProductFeature;
import org.efbiz.product.feature.model.ProductFeatureExample;

@Mapper
public interface ProductFeatureMapper {
    long countByExample(ProductFeatureExample example);

    int deleteByExample(ProductFeatureExample example);

    int deleteByPrimaryKey(String productFeatureId);

    int insert(ProductFeature record);

    int insertSelective(ProductFeature record);

    List<ProductFeature> selectByExample(ProductFeatureExample example);

    ProductFeature selectByPrimaryKey(String productFeatureId);

    int updateByExampleSelective(@Param("record") ProductFeature record, @Param("example") ProductFeatureExample example);

    int updateByExample(@Param("record") ProductFeature record, @Param("example") ProductFeatureExample example);

    int updateByPrimaryKeySelective(ProductFeature record);

    int updateByPrimaryKey(ProductFeature record);
}