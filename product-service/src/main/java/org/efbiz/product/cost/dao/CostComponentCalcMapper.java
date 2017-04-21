package org.efbiz.product.cost.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.cost.model.CostComponentCalc;
import org.efbiz.product.cost.model.CostComponentCalcExample;

@Mapper
public interface CostComponentCalcMapper {
    long countByExample(CostComponentCalcExample example);

    int deleteByExample(CostComponentCalcExample example);

    int deleteByPrimaryKey(String costComponentCalcId);

    int insert(CostComponentCalc record);

    int insertSelective(CostComponentCalc record);

    List<CostComponentCalc> selectByExample(CostComponentCalcExample example);

    CostComponentCalc selectByPrimaryKey(String costComponentCalcId);

    int updateByExampleSelective(@Param("record") CostComponentCalc record, @Param("example") CostComponentCalcExample example);

    int updateByExample(@Param("record") CostComponentCalc record, @Param("example") CostComponentCalcExample example);

    int updateByPrimaryKeySelective(CostComponentCalc record);

    int updateByPrimaryKey(CostComponentCalc record);
}