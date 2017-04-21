package org.efbiz.product.product.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.product.model.ProductKeyword;
import org.efbiz.product.product.model.ProductKeywordExample;
import org.efbiz.product.product.model.ProductKeywordKey;

@Mapper
public interface ProductKeywordMapper {
    long countByExample(ProductKeywordExample example);

    int deleteByExample(ProductKeywordExample example);

    int deleteByPrimaryKey(ProductKeywordKey key);

    int insert(ProductKeyword record);

    int insertSelective(ProductKeyword record);

    List<ProductKeyword> selectByExample(ProductKeywordExample example);

    ProductKeyword selectByPrimaryKey(ProductKeywordKey key);

    int updateByExampleSelective(@Param("record") ProductKeyword record, @Param("example") ProductKeywordExample example);

    int updateByExample(@Param("record") ProductKeyword record, @Param("example") ProductKeywordExample example);

    int updateByPrimaryKeySelective(ProductKeyword record);

    int updateByPrimaryKey(ProductKeyword record);
}