package org.efbiz.product.price.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.price.model.ProductPriceChange;
import org.efbiz.product.price.model.ProductPriceChangeExample;

@Mapper
public interface ProductPriceChangeMapper {
    long countByExample(ProductPriceChangeExample example);

    int deleteByExample(ProductPriceChangeExample example);

    int deleteByPrimaryKey(String productPriceChangeId);

    int insert(ProductPriceChange record);

    int insertSelective(ProductPriceChange record);

    List<ProductPriceChange> selectByExample(ProductPriceChangeExample example);

    ProductPriceChange selectByPrimaryKey(String productPriceChangeId);

    int updateByExampleSelective(@Param("record") ProductPriceChange record, @Param("example") ProductPriceChangeExample example);

    int updateByExample(@Param("record") ProductPriceChange record, @Param("example") ProductPriceChangeExample example);

    int updateByPrimaryKeySelective(ProductPriceChange record);

    int updateByPrimaryKey(ProductPriceChange record);
}