package org.efbiz.product.promo.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.promo.model.ProductPromoUse;
import org.efbiz.product.promo.model.ProductPromoUseExample;
import org.efbiz.product.promo.model.ProductPromoUseKey;

@Mapper
public interface ProductPromoUseMapper {
    long countByExample(ProductPromoUseExample example);

    int deleteByExample(ProductPromoUseExample example);

    int deleteByPrimaryKey(ProductPromoUseKey key);

    int insert(ProductPromoUse record);

    int insertSelective(ProductPromoUse record);

    List<ProductPromoUse> selectByExample(ProductPromoUseExample example);

    ProductPromoUse selectByPrimaryKey(ProductPromoUseKey key);

    int updateByExampleSelective(@Param("record") ProductPromoUse record, @Param("example") ProductPromoUseExample example);

    int updateByExample(@Param("record") ProductPromoUse record, @Param("example") ProductPromoUseExample example);

    int updateByPrimaryKeySelective(ProductPromoUse record);

    int updateByPrimaryKey(ProductPromoUse record);
}