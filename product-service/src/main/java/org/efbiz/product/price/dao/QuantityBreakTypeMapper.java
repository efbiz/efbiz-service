package org.efbiz.product.price.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.price.model.QuantityBreakType;
import org.efbiz.product.price.model.QuantityBreakTypeExample;

@Mapper
public interface QuantityBreakTypeMapper {
    long countByExample(QuantityBreakTypeExample example);

    int deleteByExample(QuantityBreakTypeExample example);

    int deleteByPrimaryKey(String quantityBreakTypeId);

    int insert(QuantityBreakType record);

    int insertSelective(QuantityBreakType record);

    List<QuantityBreakType> selectByExample(QuantityBreakTypeExample example);

    QuantityBreakType selectByPrimaryKey(String quantityBreakTypeId);

    int updateByExampleSelective(@Param("record") QuantityBreakType record, @Param("example") QuantityBreakTypeExample example);

    int updateByExample(@Param("record") QuantityBreakType record, @Param("example") QuantityBreakTypeExample example);

    int updateByPrimaryKeySelective(QuantityBreakType record);

    int updateByPrimaryKey(QuantityBreakType record);
}