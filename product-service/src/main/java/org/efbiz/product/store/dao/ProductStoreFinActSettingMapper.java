package org.efbiz.product.store.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.store.model.ProductStoreFinActSetting;
import org.efbiz.product.store.model.ProductStoreFinActSettingExample;
import org.efbiz.product.store.model.ProductStoreFinActSettingKey;

@Mapper
public interface ProductStoreFinActSettingMapper {
    long countByExample(ProductStoreFinActSettingExample example);

    int deleteByExample(ProductStoreFinActSettingExample example);

    int deleteByPrimaryKey(ProductStoreFinActSettingKey key);

    int insert(ProductStoreFinActSetting record);

    int insertSelective(ProductStoreFinActSetting record);

    List<ProductStoreFinActSetting> selectByExample(ProductStoreFinActSettingExample example);

    ProductStoreFinActSetting selectByPrimaryKey(ProductStoreFinActSettingKey key);

    int updateByExampleSelective(@Param("record") ProductStoreFinActSetting record, @Param("example") ProductStoreFinActSettingExample example);

    int updateByExample(@Param("record") ProductStoreFinActSetting record, @Param("example") ProductStoreFinActSettingExample example);

    int updateByPrimaryKeySelective(ProductStoreFinActSetting record);

    int updateByPrimaryKey(ProductStoreFinActSetting record);
}