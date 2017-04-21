package org.efbiz.product.product.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.product.model.ProductMaint;
import org.efbiz.product.product.model.ProductMaintExample;
import org.efbiz.product.product.model.ProductMaintKey;

@Mapper
public interface ProductMaintMapper {
    long countByExample(ProductMaintExample example);

    int deleteByExample(ProductMaintExample example);

    int deleteByPrimaryKey(ProductMaintKey key);

    int insert(ProductMaint record);

    int insertSelective(ProductMaint record);

    List<ProductMaint> selectByExample(ProductMaintExample example);

    ProductMaint selectByPrimaryKey(ProductMaintKey key);

    int updateByExampleSelective(@Param("record") ProductMaint record, @Param("example") ProductMaintExample example);

    int updateByExample(@Param("record") ProductMaint record, @Param("example") ProductMaintExample example);

    int updateByPrimaryKeySelective(ProductMaint record);

    int updateByPrimaryKey(ProductMaint record);
}