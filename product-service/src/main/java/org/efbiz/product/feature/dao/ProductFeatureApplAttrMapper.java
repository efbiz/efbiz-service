package org.efbiz.product.feature.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.feature.model.ProductFeatureApplAttr;
import org.efbiz.product.feature.model.ProductFeatureApplAttrExample;
import org.efbiz.product.feature.model.ProductFeatureApplAttrKey;

@Mapper
public interface ProductFeatureApplAttrMapper {
    long countByExample(ProductFeatureApplAttrExample example);

    int deleteByExample(ProductFeatureApplAttrExample example);

    int deleteByPrimaryKey(ProductFeatureApplAttrKey key);

    int insert(ProductFeatureApplAttr record);

    int insertSelective(ProductFeatureApplAttr record);

    List<ProductFeatureApplAttr> selectByExample(ProductFeatureApplAttrExample example);

    ProductFeatureApplAttr selectByPrimaryKey(ProductFeatureApplAttrKey key);

    int updateByExampleSelective(@Param("record") ProductFeatureApplAttr record, @Param("example") ProductFeatureApplAttrExample example);

    int updateByExample(@Param("record") ProductFeatureApplAttr record, @Param("example") ProductFeatureApplAttrExample example);

    int updateByPrimaryKeySelective(ProductFeatureApplAttr record);

    int updateByPrimaryKey(ProductFeatureApplAttr record);
}