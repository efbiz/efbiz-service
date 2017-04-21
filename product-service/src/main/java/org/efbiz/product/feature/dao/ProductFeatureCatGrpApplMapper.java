package org.efbiz.product.feature.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.feature.model.ProductFeatureCatGrpAppl;
import org.efbiz.product.feature.model.ProductFeatureCatGrpApplExample;
import org.efbiz.product.feature.model.ProductFeatureCatGrpApplKey;

@Mapper
public interface ProductFeatureCatGrpApplMapper {
    long countByExample(ProductFeatureCatGrpApplExample example);

    int deleteByExample(ProductFeatureCatGrpApplExample example);

    int deleteByPrimaryKey(ProductFeatureCatGrpApplKey key);

    int insert(ProductFeatureCatGrpAppl record);

    int insertSelective(ProductFeatureCatGrpAppl record);

    List<ProductFeatureCatGrpAppl> selectByExample(ProductFeatureCatGrpApplExample example);

    ProductFeatureCatGrpAppl selectByPrimaryKey(ProductFeatureCatGrpApplKey key);

    int updateByExampleSelective(@Param("record") ProductFeatureCatGrpAppl record, @Param("example") ProductFeatureCatGrpApplExample example);

    int updateByExample(@Param("record") ProductFeatureCatGrpAppl record, @Param("example") ProductFeatureCatGrpApplExample example);

    int updateByPrimaryKeySelective(ProductFeatureCatGrpAppl record);

    int updateByPrimaryKey(ProductFeatureCatGrpAppl record);
}