package org.efbiz.product.feature.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.feature.model.ProductFeatureAppl;
import org.efbiz.product.feature.model.ProductFeatureApplExample;
import org.efbiz.product.feature.model.ProductFeatureApplKey;

@Mapper
public interface ProductFeatureApplMapper {
    long countByExample(ProductFeatureApplExample example);

    int deleteByExample(ProductFeatureApplExample example);

    int deleteByPrimaryKey(ProductFeatureApplKey key);

    int insert(ProductFeatureAppl record);

    int insertSelective(ProductFeatureAppl record);

    List<ProductFeatureAppl> selectByExample(ProductFeatureApplExample example);

    ProductFeatureAppl selectByPrimaryKey(ProductFeatureApplKey key);

    int updateByExampleSelective(@Param("record") ProductFeatureAppl record, @Param("example") ProductFeatureApplExample example);

    int updateByExample(@Param("record") ProductFeatureAppl record, @Param("example") ProductFeatureApplExample example);

    int updateByPrimaryKeySelective(ProductFeatureAppl record);

    int updateByPrimaryKey(ProductFeatureAppl record);
}