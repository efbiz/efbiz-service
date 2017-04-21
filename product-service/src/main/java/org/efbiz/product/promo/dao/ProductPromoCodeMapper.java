package org.efbiz.product.promo.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.promo.model.ProductPromoCode;
import org.efbiz.product.promo.model.ProductPromoCodeExample;

@Mapper
public interface ProductPromoCodeMapper {
    long countByExample(ProductPromoCodeExample example);

    int deleteByExample(ProductPromoCodeExample example);

    int deleteByPrimaryKey(String productPromoCodeId);

    int insert(ProductPromoCode record);

    int insertSelective(ProductPromoCode record);

    List<ProductPromoCode> selectByExample(ProductPromoCodeExample example);

    ProductPromoCode selectByPrimaryKey(String productPromoCodeId);

    int updateByExampleSelective(@Param("record") ProductPromoCode record, @Param("example") ProductPromoCodeExample example);

    int updateByExample(@Param("record") ProductPromoCode record, @Param("example") ProductPromoCodeExample example);

    int updateByPrimaryKeySelective(ProductPromoCode record);

    int updateByPrimaryKey(ProductPromoCode record);
}