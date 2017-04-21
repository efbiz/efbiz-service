package org.efbiz.product.feature.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.feature.model.ProductFeatureCategoryAppl;
import org.efbiz.product.feature.model.ProductFeatureCategoryApplExample;
import org.efbiz.product.feature.model.ProductFeatureCategoryApplKey;

@Mapper
public interface ProductFeatureCategoryApplMapper {
    long countByExample(ProductFeatureCategoryApplExample example);

    int deleteByExample(ProductFeatureCategoryApplExample example);

    int deleteByPrimaryKey(ProductFeatureCategoryApplKey key);

    int insert(ProductFeatureCategoryAppl record);

    int insertSelective(ProductFeatureCategoryAppl record);

    List<ProductFeatureCategoryAppl> selectByExample(ProductFeatureCategoryApplExample example);

    ProductFeatureCategoryAppl selectByPrimaryKey(ProductFeatureCategoryApplKey key);

    int updateByExampleSelective(@Param("record") ProductFeatureCategoryAppl record, @Param("example") ProductFeatureCategoryApplExample example);

    int updateByExample(@Param("record") ProductFeatureCategoryAppl record, @Param("example") ProductFeatureCategoryApplExample example);

    int updateByPrimaryKeySelective(ProductFeatureCategoryAppl record);

    int updateByPrimaryKey(ProductFeatureCategoryAppl record);
}