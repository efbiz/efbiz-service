package org.efbiz.product.config.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.config.model.ProductConfigOption;
import org.efbiz.product.config.model.ProductConfigOptionExample;
import org.efbiz.product.config.model.ProductConfigOptionKey;

@Mapper
public interface ProductConfigOptionMapper {
    long countByExample(ProductConfigOptionExample example);

    int deleteByExample(ProductConfigOptionExample example);

    int deleteByPrimaryKey(ProductConfigOptionKey key);

    int insert(ProductConfigOption record);

    int insertSelective(ProductConfigOption record);

    List<ProductConfigOption> selectByExample(ProductConfigOptionExample example);

    ProductConfigOption selectByPrimaryKey(ProductConfigOptionKey key);

    int updateByExampleSelective(@Param("record") ProductConfigOption record, @Param("example") ProductConfigOptionExample example);

    int updateByExample(@Param("record") ProductConfigOption record, @Param("example") ProductConfigOptionExample example);

    int updateByPrimaryKeySelective(ProductConfigOption record);

    int updateByPrimaryKey(ProductConfigOption record);
}