package org.efbiz.product.price.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.price.model.ProductPriceRule;
import org.efbiz.product.price.model.ProductPriceRuleExample;

@Mapper
public interface ProductPriceRuleMapper {
    long countByExample(ProductPriceRuleExample example);

    int deleteByExample(ProductPriceRuleExample example);

    int deleteByPrimaryKey(String productPriceRuleId);

    int insert(ProductPriceRule record);

    int insertSelective(ProductPriceRule record);

    List<ProductPriceRule> selectByExample(ProductPriceRuleExample example);

    ProductPriceRule selectByPrimaryKey(String productPriceRuleId);

    int updateByExampleSelective(@Param("record") ProductPriceRule record, @Param("example") ProductPriceRuleExample example);

    int updateByExample(@Param("record") ProductPriceRule record, @Param("example") ProductPriceRuleExample example);

    int updateByPrimaryKeySelective(ProductPriceRule record);

    int updateByPrimaryKey(ProductPriceRule record);
}