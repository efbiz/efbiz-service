package org.efbiz.product.product.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.product.model.ProductMeter;
import org.efbiz.product.product.model.ProductMeterExample;
import org.efbiz.product.product.model.ProductMeterKey;

@Mapper
public interface ProductMeterMapper {
    long countByExample(ProductMeterExample example);

    int deleteByExample(ProductMeterExample example);

    int deleteByPrimaryKey(ProductMeterKey key);

    int insert(ProductMeter record);

    int insertSelective(ProductMeter record);

    List<ProductMeter> selectByExample(ProductMeterExample example);

    ProductMeter selectByPrimaryKey(ProductMeterKey key);

    int updateByExampleSelective(@Param("record") ProductMeter record, @Param("example") ProductMeterExample example);

    int updateByExample(@Param("record") ProductMeter record, @Param("example") ProductMeterExample example);

    int updateByPrimaryKeySelective(ProductMeter record);

    int updateByPrimaryKey(ProductMeter record);
}