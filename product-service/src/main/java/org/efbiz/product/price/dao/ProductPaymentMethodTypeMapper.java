package org.efbiz.product.price.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.price.model.ProductPaymentMethodType;
import org.efbiz.product.price.model.ProductPaymentMethodTypeExample;
import org.efbiz.product.price.model.ProductPaymentMethodTypeKey;

@Mapper
public interface ProductPaymentMethodTypeMapper {
    long countByExample(ProductPaymentMethodTypeExample example);

    int deleteByExample(ProductPaymentMethodTypeExample example);

    int deleteByPrimaryKey(ProductPaymentMethodTypeKey key);

    int insert(ProductPaymentMethodType record);

    int insertSelective(ProductPaymentMethodType record);

    List<ProductPaymentMethodType> selectByExample(ProductPaymentMethodTypeExample example);

    ProductPaymentMethodType selectByPrimaryKey(ProductPaymentMethodTypeKey key);

    int updateByExampleSelective(@Param("record") ProductPaymentMethodType record, @Param("example") ProductPaymentMethodTypeExample example);

    int updateByExample(@Param("record") ProductPaymentMethodType record, @Param("example") ProductPaymentMethodTypeExample example);

    int updateByPrimaryKeySelective(ProductPaymentMethodType record);

    int updateByPrimaryKey(ProductPaymentMethodType record);
}