package org.efbiz.product.feature.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.feature.model.ProductFeatureType;
import org.efbiz.product.feature.model.ProductFeatureTypeExample;

@Mapper
public interface ProductFeatureTypeMapper {
    long countByExample(ProductFeatureTypeExample example);

    int deleteByExample(ProductFeatureTypeExample example);

    int deleteByPrimaryKey(String productFeatureTypeId);

    int insert(ProductFeatureType record);

    int insertSelective(ProductFeatureType record);

    List<ProductFeatureType> selectByExample(ProductFeatureTypeExample example);

    ProductFeatureType selectByPrimaryKey(String productFeatureTypeId);

    int updateByExampleSelective(@Param("record") ProductFeatureType record, @Param("example") ProductFeatureTypeExample example);

    int updateByExample(@Param("record") ProductFeatureType record, @Param("example") ProductFeatureTypeExample example);

    int updateByPrimaryKeySelective(ProductFeatureType record);

    int updateByPrimaryKey(ProductFeatureType record);
}