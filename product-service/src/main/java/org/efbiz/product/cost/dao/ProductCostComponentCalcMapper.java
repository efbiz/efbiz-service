package org.efbiz.product.cost.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.cost.model.ProductCostComponentCalc;
import org.efbiz.product.cost.model.ProductCostComponentCalcExample;
import org.efbiz.product.cost.model.ProductCostComponentCalcKey;

@Mapper
public interface ProductCostComponentCalcMapper {
    long countByExample(ProductCostComponentCalcExample example);

    int deleteByExample(ProductCostComponentCalcExample example);

    int deleteByPrimaryKey(ProductCostComponentCalcKey key);

    int insert(ProductCostComponentCalc record);

    int insertSelective(ProductCostComponentCalc record);

    List<ProductCostComponentCalc> selectByExample(ProductCostComponentCalcExample example);

    ProductCostComponentCalc selectByPrimaryKey(ProductCostComponentCalcKey key);

    int updateByExampleSelective(@Param("record") ProductCostComponentCalc record, @Param("example") ProductCostComponentCalcExample example);

    int updateByExample(@Param("record") ProductCostComponentCalc record, @Param("example") ProductCostComponentCalcExample example);

    int updateByPrimaryKeySelective(ProductCostComponentCalc record);

    int updateByPrimaryKey(ProductCostComponentCalc record);
}