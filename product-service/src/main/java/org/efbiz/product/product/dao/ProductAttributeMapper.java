package org.efbiz.product.product.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.product.model.ProductAttribute;
import org.efbiz.product.product.model.ProductAttributeExample;
import org.efbiz.product.product.model.ProductAttributeKey;

@Mapper
public interface ProductAttributeMapper {
    long countByExample(ProductAttributeExample example);

    int deleteByExample(ProductAttributeExample example);

    int deleteByPrimaryKey(ProductAttributeKey key);

    int insert(ProductAttribute record);

    int insertSelective(ProductAttribute record);

    List<ProductAttribute> selectByExample(ProductAttributeExample example);

    ProductAttribute selectByPrimaryKey(ProductAttributeKey key);

    int updateByExampleSelective(@Param("record") ProductAttribute record, @Param("example") ProductAttributeExample example);

    int updateByExample(@Param("record") ProductAttribute record, @Param("example") ProductAttributeExample example);

    int updateByPrimaryKeySelective(ProductAttribute record);

    int updateByPrimaryKey(ProductAttribute record);
}