package org.efbiz.product.feature.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.feature.model.ProductFeatureGroupAppl;
import org.efbiz.product.feature.model.ProductFeatureGroupApplExample;
import org.efbiz.product.feature.model.ProductFeatureGroupApplKey;

@Mapper
public interface ProductFeatureGroupApplMapper {
    long countByExample(ProductFeatureGroupApplExample example);

    int deleteByExample(ProductFeatureGroupApplExample example);

    int deleteByPrimaryKey(ProductFeatureGroupApplKey key);

    int insert(ProductFeatureGroupAppl record);

    int insertSelective(ProductFeatureGroupAppl record);

    List<ProductFeatureGroupAppl> selectByExample(ProductFeatureGroupApplExample example);

    ProductFeatureGroupAppl selectByPrimaryKey(ProductFeatureGroupApplKey key);

    int updateByExampleSelective(@Param("record") ProductFeatureGroupAppl record, @Param("example") ProductFeatureGroupApplExample example);

    int updateByExample(@Param("record") ProductFeatureGroupAppl record, @Param("example") ProductFeatureGroupApplExample example);

    int updateByPrimaryKeySelective(ProductFeatureGroupAppl record);

    int updateByPrimaryKey(ProductFeatureGroupAppl record);
}