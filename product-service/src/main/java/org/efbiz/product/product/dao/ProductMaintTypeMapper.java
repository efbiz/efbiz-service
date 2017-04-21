package org.efbiz.product.product.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.product.model.ProductMaintType;
import org.efbiz.product.product.model.ProductMaintTypeExample;

@Mapper
public interface ProductMaintTypeMapper {
    long countByExample(ProductMaintTypeExample example);

    int deleteByExample(ProductMaintTypeExample example);

    int deleteByPrimaryKey(String productMaintTypeId);

    int insert(ProductMaintType record);

    int insertSelective(ProductMaintType record);

    List<ProductMaintType> selectByExample(ProductMaintTypeExample example);

    ProductMaintType selectByPrimaryKey(String productMaintTypeId);

    int updateByExampleSelective(@Param("record") ProductMaintType record, @Param("example") ProductMaintTypeExample example);

    int updateByExample(@Param("record") ProductMaintType record, @Param("example") ProductMaintTypeExample example);

    int updateByPrimaryKeySelective(ProductMaintType record);

    int updateByPrimaryKey(ProductMaintType record);
}