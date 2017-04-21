package org.efbiz.product.price.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.price.model.ProductFeaturePrice;
import org.efbiz.product.price.model.ProductFeaturePriceExample;
import org.efbiz.product.price.model.ProductFeaturePriceKey;

@Mapper
public interface ProductFeaturePriceMapper {
    long countByExample(ProductFeaturePriceExample example);

    int deleteByExample(ProductFeaturePriceExample example);

    int deleteByPrimaryKey(ProductFeaturePriceKey key);

    int insert(ProductFeaturePrice record);

    int insertSelective(ProductFeaturePrice record);

    List<ProductFeaturePrice> selectByExample(ProductFeaturePriceExample example);

    ProductFeaturePrice selectByPrimaryKey(ProductFeaturePriceKey key);

    int updateByExampleSelective(@Param("record") ProductFeaturePrice record, @Param("example") ProductFeaturePriceExample example);

    int updateByExample(@Param("record") ProductFeaturePrice record, @Param("example") ProductFeaturePriceExample example);

    int updateByPrimaryKeySelective(ProductFeaturePrice record);

    int updateByPrimaryKey(ProductFeaturePrice record);
}