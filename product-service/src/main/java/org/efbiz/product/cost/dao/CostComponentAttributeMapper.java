package org.efbiz.product.cost.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.cost.model.CostComponentAttribute;
import org.efbiz.product.cost.model.CostComponentAttributeExample;
import org.efbiz.product.cost.model.CostComponentAttributeKey;

@Mapper
public interface CostComponentAttributeMapper {
    long countByExample(CostComponentAttributeExample example);

    int deleteByExample(CostComponentAttributeExample example);

    int deleteByPrimaryKey(CostComponentAttributeKey key);

    int insert(CostComponentAttribute record);

    int insertSelective(CostComponentAttribute record);

    List<CostComponentAttribute> selectByExample(CostComponentAttributeExample example);

    CostComponentAttribute selectByPrimaryKey(CostComponentAttributeKey key);

    int updateByExampleSelective(@Param("record") CostComponentAttribute record, @Param("example") CostComponentAttributeExample example);

    int updateByExample(@Param("record") CostComponentAttribute record, @Param("example") CostComponentAttributeExample example);

    int updateByPrimaryKeySelective(CostComponentAttribute record);

    int updateByPrimaryKey(CostComponentAttribute record);
}