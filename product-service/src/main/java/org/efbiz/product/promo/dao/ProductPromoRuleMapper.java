package org.efbiz.product.promo.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.promo.model.ProductPromoRule;
import org.efbiz.product.promo.model.ProductPromoRuleExample;
import org.efbiz.product.promo.model.ProductPromoRuleKey;

@Mapper
public interface ProductPromoRuleMapper {
    long countByExample(ProductPromoRuleExample example);

    int deleteByExample(ProductPromoRuleExample example);

    int deleteByPrimaryKey(ProductPromoRuleKey key);

    int insert(ProductPromoRule record);

    int insertSelective(ProductPromoRule record);

    List<ProductPromoRule> selectByExample(ProductPromoRuleExample example);

    ProductPromoRule selectByPrimaryKey(ProductPromoRuleKey key);

    int updateByExampleSelective(@Param("record") ProductPromoRule record, @Param("example") ProductPromoRuleExample example);

    int updateByExample(@Param("record") ProductPromoRule record, @Param("example") ProductPromoRuleExample example);

    int updateByPrimaryKeySelective(ProductPromoRule record);

    int updateByPrimaryKey(ProductPromoRule record);
}