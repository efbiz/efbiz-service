package org.efbiz.product.price.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.price.model.QuantityBreak;
import org.efbiz.product.price.model.QuantityBreakExample;

@Mapper
public interface QuantityBreakMapper {
    long countByExample(QuantityBreakExample example);

    int deleteByExample(QuantityBreakExample example);

    int deleteByPrimaryKey(String quantityBreakId);

    int insert(QuantityBreak record);

    int insertSelective(QuantityBreak record);

    List<QuantityBreak> selectByExample(QuantityBreakExample example);

    QuantityBreak selectByPrimaryKey(String quantityBreakId);

    int updateByExampleSelective(@Param("record") QuantityBreak record, @Param("example") QuantityBreakExample example);

    int updateByExample(@Param("record") QuantityBreak record, @Param("example") QuantityBreakExample example);

    int updateByPrimaryKeySelective(QuantityBreak record);

    int updateByPrimaryKey(QuantityBreak record);
}