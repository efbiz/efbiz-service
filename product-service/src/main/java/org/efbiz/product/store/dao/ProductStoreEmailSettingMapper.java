package org.efbiz.product.store.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.store.model.ProductStoreEmailSetting;
import org.efbiz.product.store.model.ProductStoreEmailSettingExample;
import org.efbiz.product.store.model.ProductStoreEmailSettingKey;

@Mapper
public interface ProductStoreEmailSettingMapper {
    long countByExample(ProductStoreEmailSettingExample example);

    int deleteByExample(ProductStoreEmailSettingExample example);

    int deleteByPrimaryKey(ProductStoreEmailSettingKey key);

    int insert(ProductStoreEmailSetting record);

    int insertSelective(ProductStoreEmailSetting record);

    List<ProductStoreEmailSetting> selectByExample(ProductStoreEmailSettingExample example);

    ProductStoreEmailSetting selectByPrimaryKey(ProductStoreEmailSettingKey key);

    int updateByExampleSelective(@Param("record") ProductStoreEmailSetting record, @Param("example") ProductStoreEmailSettingExample example);

    int updateByExample(@Param("record") ProductStoreEmailSetting record, @Param("example") ProductStoreEmailSettingExample example);

    int updateByPrimaryKeySelective(ProductStoreEmailSetting record);

    int updateByPrimaryKey(ProductStoreEmailSetting record);
}