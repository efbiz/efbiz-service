package org.efbiz.product.price.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.price.model.ProductPriceActionType;
import org.efbiz.product.price.model.ProductPriceActionTypeExample;

@Mapper
public interface ProductPriceActionTypeMapper {
    long countByExample(ProductPriceActionTypeExample example);

    int deleteByExample(ProductPriceActionTypeExample example);

    int deleteByPrimaryKey(String productPriceActionTypeId);

    int insert(ProductPriceActionType record);

    int insertSelective(ProductPriceActionType record);

    List<ProductPriceActionType> selectByExample(ProductPriceActionTypeExample example);

    ProductPriceActionType selectByPrimaryKey(String productPriceActionTypeId);

    int updateByExampleSelective(@Param("record") ProductPriceActionType record, @Param("example") ProductPriceActionTypeExample example);

    int updateByExample(@Param("record") ProductPriceActionType record, @Param("example") ProductPriceActionTypeExample example);

    int updateByPrimaryKeySelective(ProductPriceActionType record);

    int updateByPrimaryKey(ProductPriceActionType record);
}