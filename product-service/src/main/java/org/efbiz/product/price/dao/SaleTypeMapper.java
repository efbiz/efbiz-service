package org.efbiz.product.price.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.price.model.SaleType;
import org.efbiz.product.price.model.SaleTypeExample;

@Mapper
public interface SaleTypeMapper {
    long countByExample(SaleTypeExample example);

    int deleteByExample(SaleTypeExample example);

    int deleteByPrimaryKey(String saleTypeId);

    int insert(SaleType record);

    int insertSelective(SaleType record);

    List<SaleType> selectByExample(SaleTypeExample example);

    SaleType selectByPrimaryKey(String saleTypeId);

    int updateByExampleSelective(@Param("record") SaleType record, @Param("example") SaleTypeExample example);

    int updateByExample(@Param("record") SaleType record, @Param("example") SaleTypeExample example);

    int updateByPrimaryKeySelective(SaleType record);

    int updateByPrimaryKey(SaleType record);
}