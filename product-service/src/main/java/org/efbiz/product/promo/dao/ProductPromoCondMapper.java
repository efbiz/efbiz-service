package org.efbiz.product.promo.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.promo.model.ProductPromoCond;
import org.efbiz.product.promo.model.ProductPromoCondExample;
import org.efbiz.product.promo.model.ProductPromoCondKey;

@Mapper
public interface ProductPromoCondMapper {
    long countByExample(ProductPromoCondExample example);

    int deleteByExample(ProductPromoCondExample example);

    int deleteByPrimaryKey(ProductPromoCondKey key);

    int insert(ProductPromoCond record);

    int insertSelective(ProductPromoCond record);

    List<ProductPromoCond> selectByExample(ProductPromoCondExample example);

    ProductPromoCond selectByPrimaryKey(ProductPromoCondKey key);

    int updateByExampleSelective(@Param("record") ProductPromoCond record, @Param("example") ProductPromoCondExample example);

    int updateByExample(@Param("record") ProductPromoCond record, @Param("example") ProductPromoCondExample example);

    int updateByPrimaryKeySelective(ProductPromoCond record);

    int updateByPrimaryKey(ProductPromoCond record);
}