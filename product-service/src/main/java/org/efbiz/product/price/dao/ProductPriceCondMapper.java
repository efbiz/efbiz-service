package org.efbiz.product.price.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.price.model.ProductPriceCond;
import org.efbiz.product.price.model.ProductPriceCondExample;
import org.efbiz.product.price.model.ProductPriceCondKey;

@Mapper
public interface ProductPriceCondMapper {
    long countByExample(ProductPriceCondExample example);

    int deleteByExample(ProductPriceCondExample example);

    int deleteByPrimaryKey(ProductPriceCondKey key);

    int insert(ProductPriceCond record);

    int insertSelective(ProductPriceCond record);

    List<ProductPriceCond> selectByExample(ProductPriceCondExample example);

    ProductPriceCond selectByPrimaryKey(ProductPriceCondKey key);

    int updateByExampleSelective(@Param("record") ProductPriceCond record, @Param("example") ProductPriceCondExample example);

    int updateByExample(@Param("record") ProductPriceCond record, @Param("example") ProductPriceCondExample example);

    int updateByPrimaryKeySelective(ProductPriceCond record);

    int updateByPrimaryKey(ProductPriceCond record);
}