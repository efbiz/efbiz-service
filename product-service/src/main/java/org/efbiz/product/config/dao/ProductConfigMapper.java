package org.efbiz.product.config.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.config.model.ProductConfig;
import org.efbiz.product.config.model.ProductConfigExample;
import org.efbiz.product.config.model.ProductConfigKey;

@Mapper
public interface ProductConfigMapper {
    long countByExample(ProductConfigExample example);

    int deleteByExample(ProductConfigExample example);

    int deleteByPrimaryKey(ProductConfigKey key);

    int insert(ProductConfig record);

    int insertSelective(ProductConfig record);

    List<ProductConfig> selectByExampleWithBLOBs(ProductConfigExample example);

    List<ProductConfig> selectByExample(ProductConfigExample example);

    ProductConfig selectByPrimaryKey(ProductConfigKey key);

    int updateByExampleSelective(@Param("record") ProductConfig record, @Param("example") ProductConfigExample example);

    int updateByExampleWithBLOBs(@Param("record") ProductConfig record, @Param("example") ProductConfigExample example);

    int updateByExample(@Param("record") ProductConfig record, @Param("example") ProductConfigExample example);

    int updateByPrimaryKeySelective(ProductConfig record);

    int updateByPrimaryKeyWithBLOBs(ProductConfig record);

    int updateByPrimaryKey(ProductConfig record);
}