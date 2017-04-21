package org.efbiz.product.store.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.store.model.ProductStorePaymentSetting;
import org.efbiz.product.store.model.ProductStorePaymentSettingExample;
import org.efbiz.product.store.model.ProductStorePaymentSettingKey;

@Mapper
public interface ProductStorePaymentSettingMapper {
    long countByExample(ProductStorePaymentSettingExample example);

    int deleteByExample(ProductStorePaymentSettingExample example);

    int deleteByPrimaryKey(ProductStorePaymentSettingKey key);

    int insert(ProductStorePaymentSetting record);

    int insertSelective(ProductStorePaymentSetting record);

    List<ProductStorePaymentSetting> selectByExample(ProductStorePaymentSettingExample example);

    ProductStorePaymentSetting selectByPrimaryKey(ProductStorePaymentSettingKey key);

    int updateByExampleSelective(@Param("record") ProductStorePaymentSetting record, @Param("example") ProductStorePaymentSettingExample example);

    int updateByExample(@Param("record") ProductStorePaymentSetting record, @Param("example") ProductStorePaymentSettingExample example);

    int updateByPrimaryKeySelective(ProductStorePaymentSetting record);

    int updateByPrimaryKey(ProductStorePaymentSetting record);
}