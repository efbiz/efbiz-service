package org.efbiz.product.store.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.store.model.ProductStoreShipmentMeth;
import org.efbiz.product.store.model.ProductStoreShipmentMethExample;

@Mapper
public interface ProductStoreShipmentMethMapper {
    long countByExample(ProductStoreShipmentMethExample example);

    int deleteByExample(ProductStoreShipmentMethExample example);

    int deleteByPrimaryKey(String productStoreShipMethId);

    int insert(ProductStoreShipmentMeth record);

    int insertSelective(ProductStoreShipmentMeth record);

    List<ProductStoreShipmentMeth> selectByExample(ProductStoreShipmentMethExample example);

    ProductStoreShipmentMeth selectByPrimaryKey(String productStoreShipMethId);

    int updateByExampleSelective(@Param("record") ProductStoreShipmentMeth record, @Param("example") ProductStoreShipmentMethExample example);

    int updateByExample(@Param("record") ProductStoreShipmentMeth record, @Param("example") ProductStoreShipmentMethExample example);

    int updateByPrimaryKeySelective(ProductStoreShipmentMeth record);

    int updateByPrimaryKey(ProductStoreShipmentMeth record);
}