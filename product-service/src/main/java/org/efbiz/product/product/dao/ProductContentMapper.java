package org.efbiz.product.product.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.product.model.ProductContent;
import org.efbiz.product.product.model.ProductContentExample;
import org.efbiz.product.product.model.ProductContentKey;

@Mapper
public interface ProductContentMapper {
    long countByExample(ProductContentExample example);

    int deleteByExample(ProductContentExample example);

    int deleteByPrimaryKey(ProductContentKey key);

    int insert(ProductContent record);

    int insertSelective(ProductContent record);

    List<ProductContent> selectByExample(ProductContentExample example);

    ProductContent selectByPrimaryKey(ProductContentKey key);

    int updateByExampleSelective(@Param("record") ProductContent record, @Param("example") ProductContentExample example);

    int updateByExample(@Param("record") ProductContent record, @Param("example") ProductContentExample example);

    int updateByPrimaryKeySelective(ProductContent record);

    int updateByPrimaryKey(ProductContent record);
}