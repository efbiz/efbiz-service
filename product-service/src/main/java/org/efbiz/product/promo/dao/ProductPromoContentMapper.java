package org.efbiz.product.promo.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.promo.model.ProductPromoContent;
import org.efbiz.product.promo.model.ProductPromoContentExample;
import org.efbiz.product.promo.model.ProductPromoContentKey;

@Mapper
public interface ProductPromoContentMapper {
    long countByExample(ProductPromoContentExample example);

    int deleteByExample(ProductPromoContentExample example);

    int deleteByPrimaryKey(ProductPromoContentKey key);

    int insert(ProductPromoContent record);

    int insertSelective(ProductPromoContent record);

    List<ProductPromoContent> selectByExample(ProductPromoContentExample example);

    ProductPromoContent selectByPrimaryKey(ProductPromoContentKey key);

    int updateByExampleSelective(@Param("record") ProductPromoContent record, @Param("example") ProductPromoContentExample example);

    int updateByExample(@Param("record") ProductPromoContent record, @Param("example") ProductPromoContentExample example);

    int updateByPrimaryKeySelective(ProductPromoContent record);

    int updateByPrimaryKey(ProductPromoContent record);
}