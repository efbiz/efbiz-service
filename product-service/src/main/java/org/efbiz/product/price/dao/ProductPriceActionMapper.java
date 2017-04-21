package org.efbiz.product.price.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.price.model.ProductPriceAction;
import org.efbiz.product.price.model.ProductPriceActionExample;
import org.efbiz.product.price.model.ProductPriceActionKey;

@Mapper
public interface ProductPriceActionMapper {
    long countByExample(ProductPriceActionExample example);

    int deleteByExample(ProductPriceActionExample example);

    int deleteByPrimaryKey(ProductPriceActionKey key);

    int insert(ProductPriceAction record);

    int insertSelective(ProductPriceAction record);

    List<ProductPriceAction> selectByExample(ProductPriceActionExample example);

    ProductPriceAction selectByPrimaryKey(ProductPriceActionKey key);

    int updateByExampleSelective(@Param("record") ProductPriceAction record, @Param("example") ProductPriceActionExample example);

    int updateByExample(@Param("record") ProductPriceAction record, @Param("example") ProductPriceActionExample example);

    int updateByPrimaryKeySelective(ProductPriceAction record);

    int updateByPrimaryKey(ProductPriceAction record);
}