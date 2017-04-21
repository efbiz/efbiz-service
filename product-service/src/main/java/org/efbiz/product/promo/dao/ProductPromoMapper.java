package org.efbiz.product.promo.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.promo.model.ProductPromo;
import org.efbiz.product.promo.model.ProductPromoExample;

@Mapper
public interface ProductPromoMapper {
    long countByExample(ProductPromoExample example);

    int deleteByExample(ProductPromoExample example);

    int deleteByPrimaryKey(String productPromoId);

    int insert(ProductPromo record);

    int insertSelective(ProductPromo record);

    List<ProductPromo> selectByExample(ProductPromoExample example);

    ProductPromo selectByPrimaryKey(String productPromoId);

    int updateByExampleSelective(@Param("record") ProductPromo record, @Param("example") ProductPromoExample example);

    int updateByExample(@Param("record") ProductPromo record, @Param("example") ProductPromoExample example);

    int updateByPrimaryKeySelective(ProductPromo record);

    int updateByPrimaryKey(ProductPromo record);
}