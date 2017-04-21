package org.efbiz.product.feature.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.feature.model.ProductFeatureDataResource;
import org.efbiz.product.feature.model.ProductFeatureDataResourceExample;
import org.efbiz.product.feature.model.ProductFeatureDataResourceKey;

@Mapper
public interface ProductFeatureDataResourceMapper {
    long countByExample(ProductFeatureDataResourceExample example);

    int deleteByExample(ProductFeatureDataResourceExample example);

    int deleteByPrimaryKey(ProductFeatureDataResourceKey key);

    int insert(ProductFeatureDataResource record);

    int insertSelective(ProductFeatureDataResource record);

    List<ProductFeatureDataResource> selectByExample(ProductFeatureDataResourceExample example);

    ProductFeatureDataResource selectByPrimaryKey(ProductFeatureDataResourceKey key);

    int updateByExampleSelective(@Param("record") ProductFeatureDataResource record, @Param("example") ProductFeatureDataResourceExample example);

    int updateByExample(@Param("record") ProductFeatureDataResource record, @Param("example") ProductFeatureDataResourceExample example);

    int updateByPrimaryKeySelective(ProductFeatureDataResource record);

    int updateByPrimaryKey(ProductFeatureDataResource record);
}