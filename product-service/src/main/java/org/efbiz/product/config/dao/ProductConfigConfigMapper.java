package org.efbiz.product.config.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.config.model.ProductConfigConfig;
import org.efbiz.product.config.model.ProductConfigConfigExample;
import org.efbiz.product.config.model.ProductConfigConfigKey;

@Mapper
public interface ProductConfigConfigMapper {
    long countByExample(ProductConfigConfigExample example);

    int deleteByExample(ProductConfigConfigExample example);

    int deleteByPrimaryKey(ProductConfigConfigKey key);

    int insert(ProductConfigConfig record);

    int insertSelective(ProductConfigConfig record);

    List<ProductConfigConfig> selectByExample(ProductConfigConfigExample example);

    ProductConfigConfig selectByPrimaryKey(ProductConfigConfigKey key);

    int updateByExampleSelective(@Param("record") ProductConfigConfig record, @Param("example") ProductConfigConfigExample example);

    int updateByExample(@Param("record") ProductConfigConfig record, @Param("example") ProductConfigConfigExample example);

    int updateByPrimaryKeySelective(ProductConfigConfig record);

    int updateByPrimaryKey(ProductConfigConfig record);
}