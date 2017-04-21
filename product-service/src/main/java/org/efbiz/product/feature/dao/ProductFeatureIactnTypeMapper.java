package org.efbiz.product.feature.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.feature.model.ProductFeatureIactnType;
import org.efbiz.product.feature.model.ProductFeatureIactnTypeExample;

@Mapper
public interface ProductFeatureIactnTypeMapper {
    long countByExample(ProductFeatureIactnTypeExample example);

    int deleteByExample(ProductFeatureIactnTypeExample example);

    int deleteByPrimaryKey(String productFeatureIactnTypeId);

    int insert(ProductFeatureIactnType record);

    int insertSelective(ProductFeatureIactnType record);

    List<ProductFeatureIactnType> selectByExample(ProductFeatureIactnTypeExample example);

    ProductFeatureIactnType selectByPrimaryKey(String productFeatureIactnTypeId);

    int updateByExampleSelective(@Param("record") ProductFeatureIactnType record, @Param("example") ProductFeatureIactnTypeExample example);

    int updateByExample(@Param("record") ProductFeatureIactnType record, @Param("example") ProductFeatureIactnTypeExample example);

    int updateByPrimaryKeySelective(ProductFeatureIactnType record);

    int updateByPrimaryKey(ProductFeatureIactnType record);
}