package org.efbiz.product.promo.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.promo.model.ProductPromoCodeParty;
import org.efbiz.product.promo.model.ProductPromoCodePartyExample;
import org.efbiz.product.promo.model.ProductPromoCodePartyKey;

@Mapper
public interface ProductPromoCodePartyMapper {
    long countByExample(ProductPromoCodePartyExample example);

    int deleteByExample(ProductPromoCodePartyExample example);

    int deleteByPrimaryKey(ProductPromoCodePartyKey key);

    int insert(ProductPromoCodeParty record);

    int insertSelective(ProductPromoCodeParty record);

    List<ProductPromoCodeParty> selectByExample(ProductPromoCodePartyExample example);

    ProductPromoCodeParty selectByPrimaryKey(ProductPromoCodePartyKey key);

    int updateByExampleSelective(@Param("record") ProductPromoCodeParty record, @Param("example") ProductPromoCodePartyExample example);

    int updateByExample(@Param("record") ProductPromoCodeParty record, @Param("example") ProductPromoCodePartyExample example);

    int updateByPrimaryKeySelective(ProductPromoCodeParty record);

    int updateByPrimaryKey(ProductPromoCodeParty record);
}