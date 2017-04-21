package org.efbiz.product.feature.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.feature.model.ProductFeatureApplType;
import org.efbiz.product.feature.model.ProductFeatureApplTypeExample;

@Mapper
public interface ProductFeatureApplTypeMapper {
    long countByExample(ProductFeatureApplTypeExample example);

    int deleteByExample(ProductFeatureApplTypeExample example);

    int deleteByPrimaryKey(String productFeatureApplTypeId);

    int insert(ProductFeatureApplType record);

    int insertSelective(ProductFeatureApplType record);

    List<ProductFeatureApplType> selectByExample(ProductFeatureApplTypeExample example);

    ProductFeatureApplType selectByPrimaryKey(String productFeatureApplTypeId);

    int updateByExampleSelective(@Param("record") ProductFeatureApplType record, @Param("example") ProductFeatureApplTypeExample example);

    int updateByExample(@Param("record") ProductFeatureApplType record, @Param("example") ProductFeatureApplTypeExample example);

    int updateByPrimaryKeySelective(ProductFeatureApplType record);

    int updateByPrimaryKey(ProductFeatureApplType record);
}