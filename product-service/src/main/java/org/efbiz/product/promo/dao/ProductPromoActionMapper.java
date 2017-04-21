package org.efbiz.product.promo.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.promo.model.ProductPromoAction;
import org.efbiz.product.promo.model.ProductPromoActionExample;
import org.efbiz.product.promo.model.ProductPromoActionKey;

@Mapper
public interface ProductPromoActionMapper {
    long countByExample(ProductPromoActionExample example);

    int deleteByExample(ProductPromoActionExample example);

    int deleteByPrimaryKey(ProductPromoActionKey key);

    int insert(ProductPromoAction record);

    int insertSelective(ProductPromoAction record);

    List<ProductPromoAction> selectByExample(ProductPromoActionExample example);

    ProductPromoAction selectByPrimaryKey(ProductPromoActionKey key);

    int updateByExampleSelective(@Param("record") ProductPromoAction record, @Param("example") ProductPromoActionExample example);

    int updateByExample(@Param("record") ProductPromoAction record, @Param("example") ProductPromoActionExample example);

    int updateByPrimaryKeySelective(ProductPromoAction record);

    int updateByPrimaryKey(ProductPromoAction record);
}