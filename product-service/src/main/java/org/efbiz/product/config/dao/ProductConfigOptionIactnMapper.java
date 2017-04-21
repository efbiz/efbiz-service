package org.efbiz.product.config.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.config.model.ProductConfigOptionIactn;
import org.efbiz.product.config.model.ProductConfigOptionIactnExample;
import org.efbiz.product.config.model.ProductConfigOptionIactnKey;

@Mapper
public interface ProductConfigOptionIactnMapper {
    long countByExample(ProductConfigOptionIactnExample example);

    int deleteByExample(ProductConfigOptionIactnExample example);

    int deleteByPrimaryKey(ProductConfigOptionIactnKey key);

    int insert(ProductConfigOptionIactn record);

    int insertSelective(ProductConfigOptionIactn record);

    List<ProductConfigOptionIactn> selectByExample(ProductConfigOptionIactnExample example);

    ProductConfigOptionIactn selectByPrimaryKey(ProductConfigOptionIactnKey key);

    int updateByExampleSelective(@Param("record") ProductConfigOptionIactn record, @Param("example") ProductConfigOptionIactnExample example);

    int updateByExample(@Param("record") ProductConfigOptionIactn record, @Param("example") ProductConfigOptionIactnExample example);

    int updateByPrimaryKeySelective(ProductConfigOptionIactn record);

    int updateByPrimaryKey(ProductConfigOptionIactn record);
}