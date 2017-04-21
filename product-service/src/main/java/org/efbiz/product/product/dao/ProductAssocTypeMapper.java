package org.efbiz.product.product.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.product.model.ProductAssocType;
import org.efbiz.product.product.model.ProductAssocTypeExample;

@Mapper
public interface ProductAssocTypeMapper {
    long countByExample(ProductAssocTypeExample example);

    int deleteByExample(ProductAssocTypeExample example);

    int deleteByPrimaryKey(String productAssocTypeId);

    int insert(ProductAssocType record);

    int insertSelective(ProductAssocType record);

    List<ProductAssocType> selectByExample(ProductAssocTypeExample example);

    ProductAssocType selectByPrimaryKey(String productAssocTypeId);

    int updateByExampleSelective(@Param("record") ProductAssocType record, @Param("example") ProductAssocTypeExample example);

    int updateByExample(@Param("record") ProductAssocType record, @Param("example") ProductAssocTypeExample example);

    int updateByPrimaryKeySelective(ProductAssocType record);

    int updateByPrimaryKey(ProductAssocType record);
}