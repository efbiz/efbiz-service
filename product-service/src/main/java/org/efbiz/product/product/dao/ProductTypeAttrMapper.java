package org.efbiz.product.product.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.product.model.ProductTypeAttr;
import org.efbiz.product.product.model.ProductTypeAttrExample;
import org.efbiz.product.product.model.ProductTypeAttrKey;

@Mapper
public interface ProductTypeAttrMapper {
    long countByExample(ProductTypeAttrExample example);

    int deleteByExample(ProductTypeAttrExample example);

    int deleteByPrimaryKey(ProductTypeAttrKey key);

    int insert(ProductTypeAttr record);

    int insertSelective(ProductTypeAttr record);

    List<ProductTypeAttr> selectByExample(ProductTypeAttrExample example);

    ProductTypeAttr selectByPrimaryKey(ProductTypeAttrKey key);

    int updateByExampleSelective(@Param("record") ProductTypeAttr record, @Param("example") ProductTypeAttrExample example);

    int updateByExample(@Param("record") ProductTypeAttr record, @Param("example") ProductTypeAttrExample example);

    int updateByPrimaryKeySelective(ProductTypeAttr record);

    int updateByPrimaryKey(ProductTypeAttr record);
}