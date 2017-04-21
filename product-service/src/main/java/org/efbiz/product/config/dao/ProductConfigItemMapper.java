package org.efbiz.product.config.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.config.model.ProductConfigItem;
import org.efbiz.product.config.model.ProductConfigItemExample;

@Mapper
public interface ProductConfigItemMapper {
    long countByExample(ProductConfigItemExample example);

    int deleteByExample(ProductConfigItemExample example);

    int deleteByPrimaryKey(String configItemId);

    int insert(ProductConfigItem record);

    int insertSelective(ProductConfigItem record);

    List<ProductConfigItem> selectByExampleWithBLOBs(ProductConfigItemExample example);

    List<ProductConfigItem> selectByExample(ProductConfigItemExample example);

    ProductConfigItem selectByPrimaryKey(String configItemId);

    int updateByExampleSelective(@Param("record") ProductConfigItem record, @Param("example") ProductConfigItemExample example);

    int updateByExampleWithBLOBs(@Param("record") ProductConfigItem record, @Param("example") ProductConfigItemExample example);

    int updateByExample(@Param("record") ProductConfigItem record, @Param("example") ProductConfigItemExample example);

    int updateByPrimaryKeySelective(ProductConfigItem record);

    int updateByPrimaryKeyWithBLOBs(ProductConfigItem record);

    int updateByPrimaryKey(ProductConfigItem record);
}