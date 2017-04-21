package org.efbiz.product.price.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.price.model.ProductPricePurpose;
import org.efbiz.product.price.model.ProductPricePurposeExample;

@Mapper
public interface ProductPricePurposeMapper {
    long countByExample(ProductPricePurposeExample example);

    int deleteByExample(ProductPricePurposeExample example);

    int deleteByPrimaryKey(String productPricePurposeId);

    int insert(ProductPricePurpose record);

    int insertSelective(ProductPricePurpose record);

    List<ProductPricePurpose> selectByExample(ProductPricePurposeExample example);

    ProductPricePurpose selectByPrimaryKey(String productPricePurposeId);

    int updateByExampleSelective(@Param("record") ProductPricePurpose record, @Param("example") ProductPricePurposeExample example);

    int updateByExample(@Param("record") ProductPricePurpose record, @Param("example") ProductPricePurposeExample example);

    int updateByPrimaryKeySelective(ProductPricePurpose record);

    int updateByPrimaryKey(ProductPricePurpose record);
}