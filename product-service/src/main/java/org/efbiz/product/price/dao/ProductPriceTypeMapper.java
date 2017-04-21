package org.efbiz.product.price.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.price.model.ProductPriceType;
import org.efbiz.product.price.model.ProductPriceTypeExample;

@Mapper
public interface ProductPriceTypeMapper {
    long countByExample(ProductPriceTypeExample example);

    int deleteByExample(ProductPriceTypeExample example);

    int deleteByPrimaryKey(String productPriceTypeId);

    int insert(ProductPriceType record);

    int insertSelective(ProductPriceType record);

    List<ProductPriceType> selectByExample(ProductPriceTypeExample example);

    ProductPriceType selectByPrimaryKey(String productPriceTypeId);

    int updateByExampleSelective(@Param("record") ProductPriceType record, @Param("example") ProductPriceTypeExample example);

    int updateByExample(@Param("record") ProductPriceType record, @Param("example") ProductPriceTypeExample example);

    int updateByPrimaryKeySelective(ProductPriceType record);

    int updateByPrimaryKey(ProductPriceType record);
}