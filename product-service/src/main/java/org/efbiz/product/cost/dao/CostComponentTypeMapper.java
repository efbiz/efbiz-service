package org.efbiz.product.cost.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.cost.model.CostComponentType;
import org.efbiz.product.cost.model.CostComponentTypeExample;

@Mapper
public interface CostComponentTypeMapper {
    long countByExample(CostComponentTypeExample example);

    int deleteByExample(CostComponentTypeExample example);

    int deleteByPrimaryKey(String costComponentTypeId);

    int insert(CostComponentType record);

    int insertSelective(CostComponentType record);

    List<CostComponentType> selectByExample(CostComponentTypeExample example);

    CostComponentType selectByPrimaryKey(String costComponentTypeId);

    int updateByExampleSelective(@Param("record") CostComponentType record, @Param("example") CostComponentTypeExample example);

    int updateByExample(@Param("record") CostComponentType record, @Param("example") CostComponentTypeExample example);

    int updateByPrimaryKeySelective(CostComponentType record);

    int updateByPrimaryKey(CostComponentType record);
}