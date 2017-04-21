package org.efbiz.product.product.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.product.model.ProductContentType;
import org.efbiz.product.product.model.ProductContentTypeExample;

@Mapper
public interface ProductContentTypeMapper {
    long countByExample(ProductContentTypeExample example);

    int deleteByExample(ProductContentTypeExample example);

    int deleteByPrimaryKey(String productContentTypeId);

    int insert(ProductContentType record);

    int insertSelective(ProductContentType record);

    List<ProductContentType> selectByExample(ProductContentTypeExample example);

    ProductContentType selectByPrimaryKey(String productContentTypeId);

    int updateByExampleSelective(@Param("record") ProductContentType record, @Param("example") ProductContentTypeExample example);

    int updateByExample(@Param("record") ProductContentType record, @Param("example") ProductContentTypeExample example);

    int updateByPrimaryKeySelective(ProductContentType record);

    int updateByPrimaryKey(ProductContentType record);
}