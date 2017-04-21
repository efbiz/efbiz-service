package org.efbiz.product.product.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.product.model.ProductMeterType;
import org.efbiz.product.product.model.ProductMeterTypeExample;

@Mapper
public interface ProductMeterTypeMapper {
    long countByExample(ProductMeterTypeExample example);

    int deleteByExample(ProductMeterTypeExample example);

    int deleteByPrimaryKey(String productMeterTypeId);

    int insert(ProductMeterType record);

    int insertSelective(ProductMeterType record);

    List<ProductMeterType> selectByExample(ProductMeterTypeExample example);

    ProductMeterType selectByPrimaryKey(String productMeterTypeId);

    int updateByExampleSelective(@Param("record") ProductMeterType record, @Param("example") ProductMeterTypeExample example);

    int updateByExample(@Param("record") ProductMeterType record, @Param("example") ProductMeterTypeExample example);

    int updateByPrimaryKeySelective(ProductMeterType record);

    int updateByPrimaryKey(ProductMeterType record);
}