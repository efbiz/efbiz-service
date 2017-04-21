package org.efbiz.product.store.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.store.model.ProductStoreVendorPayment;
import org.efbiz.product.store.model.ProductStoreVendorPaymentExample;
import org.efbiz.product.store.model.ProductStoreVendorPaymentKey;

@Mapper
public interface ProductStoreVendorPaymentMapper {
    long countByExample(ProductStoreVendorPaymentExample example);

    int deleteByExample(ProductStoreVendorPaymentExample example);

    int deleteByPrimaryKey(ProductStoreVendorPaymentKey key);

    int insert(ProductStoreVendorPayment record);

    int insertSelective(ProductStoreVendorPayment record);

    List<ProductStoreVendorPayment> selectByExample(ProductStoreVendorPaymentExample example);

    ProductStoreVendorPayment selectByPrimaryKey(ProductStoreVendorPaymentKey key);

    int updateByExampleSelective(@Param("record") ProductStoreVendorPayment record, @Param("example") ProductStoreVendorPaymentExample example);

    int updateByExample(@Param("record") ProductStoreVendorPayment record, @Param("example") ProductStoreVendorPaymentExample example);

    int updateByPrimaryKeySelective(ProductStoreVendorPayment record);

    int updateByPrimaryKey(ProductStoreVendorPayment record);
}