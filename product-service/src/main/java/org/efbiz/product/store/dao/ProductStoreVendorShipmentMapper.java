package org.efbiz.product.store.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.store.model.ProductStoreVendorShipment;
import org.efbiz.product.store.model.ProductStoreVendorShipmentExample;
import org.efbiz.product.store.model.ProductStoreVendorShipmentKey;

@Mapper
public interface ProductStoreVendorShipmentMapper {
    long countByExample(ProductStoreVendorShipmentExample example);

    int deleteByExample(ProductStoreVendorShipmentExample example);

    int deleteByPrimaryKey(ProductStoreVendorShipmentKey key);

    int insert(ProductStoreVendorShipment record);

    int insertSelective(ProductStoreVendorShipment record);

    List<ProductStoreVendorShipment> selectByExample(ProductStoreVendorShipmentExample example);

    ProductStoreVendorShipment selectByPrimaryKey(ProductStoreVendorShipmentKey key);

    int updateByExampleSelective(@Param("record") ProductStoreVendorShipment record, @Param("example") ProductStoreVendorShipmentExample example);

    int updateByExample(@Param("record") ProductStoreVendorShipment record, @Param("example") ProductStoreVendorShipmentExample example);

    int updateByPrimaryKeySelective(ProductStoreVendorShipment record);

    int updateByPrimaryKey(ProductStoreVendorShipment record);
}