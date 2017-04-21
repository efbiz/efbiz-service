package org.efbiz.product.promo.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.promo.model.ProductPromoCategory;
import org.efbiz.product.promo.model.ProductPromoCategoryExample;
import org.efbiz.product.promo.model.ProductPromoCategoryKey;

@Mapper
public interface ProductPromoCategoryMapper {
    long countByExample(ProductPromoCategoryExample example);

    int deleteByExample(ProductPromoCategoryExample example);

    int deleteByPrimaryKey(ProductPromoCategoryKey key);

    int insert(ProductPromoCategory record);

    int insertSelective(ProductPromoCategory record);

    List<ProductPromoCategory> selectByExample(ProductPromoCategoryExample example);

    ProductPromoCategory selectByPrimaryKey(ProductPromoCategoryKey key);

    int updateByExampleSelective(@Param("record") ProductPromoCategory record, @Param("example") ProductPromoCategoryExample example);

    int updateByExample(@Param("record") ProductPromoCategory record, @Param("example") ProductPromoCategoryExample example);

    int updateByPrimaryKeySelective(ProductPromoCategory record);

    int updateByPrimaryKey(ProductPromoCategory record);
}