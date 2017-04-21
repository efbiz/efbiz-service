package org.efbiz.product.config.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.config.model.ProductConfigProduct;
import org.efbiz.product.config.model.ProductConfigProductExample;
import org.efbiz.product.config.model.ProductConfigProductKey;

@Mapper
public interface ProductConfigProductMapper {
    long countByExample(ProductConfigProductExample example);

    int deleteByExample(ProductConfigProductExample example);

    int deleteByPrimaryKey(ProductConfigProductKey key);

    int insert(ProductConfigProduct record);

    int insertSelective(ProductConfigProduct record);

    List<ProductConfigProduct> selectByExample(ProductConfigProductExample example);

    ProductConfigProduct selectByPrimaryKey(ProductConfigProductKey key);

    int updateByExampleSelective(@Param("record") ProductConfigProduct record, @Param("example") ProductConfigProductExample example);

    int updateByExample(@Param("record") ProductConfigProduct record, @Param("example") ProductConfigProductExample example);

    int updateByPrimaryKeySelective(ProductConfigProduct record);

    int updateByPrimaryKey(ProductConfigProduct record);
}