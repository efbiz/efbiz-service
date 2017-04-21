package org.efbiz.product.cost.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.cost.model.CostComponentTypeAttr;
import org.efbiz.product.cost.model.CostComponentTypeAttrExample;
import org.efbiz.product.cost.model.CostComponentTypeAttrKey;

@Mapper
public interface CostComponentTypeAttrMapper {
    long countByExample(CostComponentTypeAttrExample example);

    int deleteByExample(CostComponentTypeAttrExample example);

    int deleteByPrimaryKey(CostComponentTypeAttrKey key);

    int insert(CostComponentTypeAttr record);

    int insertSelective(CostComponentTypeAttr record);

    List<CostComponentTypeAttr> selectByExample(CostComponentTypeAttrExample example);

    CostComponentTypeAttr selectByPrimaryKey(CostComponentTypeAttrKey key);

    int updateByExampleSelective(@Param("record") CostComponentTypeAttr record, @Param("example") CostComponentTypeAttrExample example);

    int updateByExample(@Param("record") CostComponentTypeAttr record, @Param("example") CostComponentTypeAttrExample example);

    int updateByPrimaryKeySelective(CostComponentTypeAttr record);

    int updateByPrimaryKey(CostComponentTypeAttr record);
}