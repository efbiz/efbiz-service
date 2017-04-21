package org.efbiz.product.feature.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.feature.model.ProductFeatureGroup;
import org.efbiz.product.feature.model.ProductFeatureGroupExample;

@Mapper
public interface ProductFeatureGroupMapper {
    long countByExample(ProductFeatureGroupExample example);

    int deleteByExample(ProductFeatureGroupExample example);

    int deleteByPrimaryKey(String productFeatureGroupId);

    int insert(ProductFeatureGroup record);

    int insertSelective(ProductFeatureGroup record);

    List<ProductFeatureGroup> selectByExample(ProductFeatureGroupExample example);

    ProductFeatureGroup selectByPrimaryKey(String productFeatureGroupId);

    int updateByExampleSelective(@Param("record") ProductFeatureGroup record, @Param("example") ProductFeatureGroupExample example);

    int updateByExample(@Param("record") ProductFeatureGroup record, @Param("example") ProductFeatureGroupExample example);

    int updateByPrimaryKeySelective(ProductFeatureGroup record);

    int updateByPrimaryKey(ProductFeatureGroup record);
}