package org.efbiz.product.cost.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.cost.model.CostComponent;
import org.efbiz.product.cost.model.CostComponentExample;

@Mapper
public interface CostComponentMapper {
    long countByExample(CostComponentExample example);

    int deleteByExample(CostComponentExample example);

    int deleteByPrimaryKey(String costComponentId);

    int insert(CostComponent record);

    int insertSelective(CostComponent record);

    List<CostComponent> selectByExample(CostComponentExample example);

    CostComponent selectByPrimaryKey(String costComponentId);

    int updateByExampleSelective(@Param("record") CostComponent record, @Param("example") CostComponentExample example);

    int updateByExample(@Param("record") CostComponent record, @Param("example") CostComponentExample example);

    int updateByPrimaryKeySelective(CostComponent record);

    int updateByPrimaryKey(CostComponent record);
}