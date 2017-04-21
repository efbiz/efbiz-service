package org.efbiz.product.promo.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.promo.model.ProductPromoProduct;
import org.efbiz.product.promo.model.ProductPromoProductExample;
import org.efbiz.product.promo.model.ProductPromoProductKey;

@Mapper
public interface ProductPromoProductMapper {
    long countByExample(ProductPromoProductExample example);

    int deleteByExample(ProductPromoProductExample example);

    int deleteByPrimaryKey(ProductPromoProductKey key);

    int insert(ProductPromoProduct record);

    int insertSelective(ProductPromoProduct record);

    List<ProductPromoProduct> selectByExample(ProductPromoProductExample example);

    ProductPromoProduct selectByPrimaryKey(ProductPromoProductKey key);

    int updateByExampleSelective(@Param("record") ProductPromoProduct record, @Param("example") ProductPromoProductExample example);

    int updateByExample(@Param("record") ProductPromoProduct record, @Param("example") ProductPromoProductExample example);

    int updateByPrimaryKeySelective(ProductPromoProduct record);

    int updateByPrimaryKey(ProductPromoProduct record);
}