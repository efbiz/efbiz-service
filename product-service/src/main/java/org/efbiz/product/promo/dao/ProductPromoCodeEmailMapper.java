package org.efbiz.product.promo.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.promo.model.ProductPromoCodeEmail;
import org.efbiz.product.promo.model.ProductPromoCodeEmailExample;
import org.efbiz.product.promo.model.ProductPromoCodeEmailKey;

@Mapper
public interface ProductPromoCodeEmailMapper {
    long countByExample(ProductPromoCodeEmailExample example);

    int deleteByExample(ProductPromoCodeEmailExample example);

    int deleteByPrimaryKey(ProductPromoCodeEmailKey key);

    int insert(ProductPromoCodeEmail record);

    int insertSelective(ProductPromoCodeEmail record);

    List<ProductPromoCodeEmail> selectByExample(ProductPromoCodeEmailExample example);

    ProductPromoCodeEmail selectByPrimaryKey(ProductPromoCodeEmailKey key);

    int updateByExampleSelective(@Param("record") ProductPromoCodeEmail record, @Param("example") ProductPromoCodeEmailExample example);

    int updateByExample(@Param("record") ProductPromoCodeEmail record, @Param("example") ProductPromoCodeEmailExample example);

    int updateByPrimaryKeySelective(ProductPromoCodeEmail record);

    int updateByPrimaryKey(ProductPromoCodeEmail record);
}