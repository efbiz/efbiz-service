package org.efbiz.product.inventory.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.inventory.model.VarianceReason;
import org.efbiz.product.inventory.model.VarianceReasonExample;

@Mapper
public interface VarianceReasonMapper {
    long countByExample(VarianceReasonExample example);

    int deleteByExample(VarianceReasonExample example);

    int deleteByPrimaryKey(String varianceReasonId);

    int insert(VarianceReason record);

    int insertSelective(VarianceReason record);

    List<VarianceReason> selectByExample(VarianceReasonExample example);

    VarianceReason selectByPrimaryKey(String varianceReasonId);

    int updateByExampleSelective(@Param("record") VarianceReason record, @Param("example") VarianceReasonExample example);

    int updateByExample(@Param("record") VarianceReason record, @Param("example") VarianceReasonExample example);

    int updateByPrimaryKeySelective(VarianceReason record);

    int updateByPrimaryKey(VarianceReason record);
}