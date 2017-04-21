package org.efbiz.product.supplier.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.supplier.model.ReorderGuideline;
import org.efbiz.product.supplier.model.ReorderGuidelineExample;

@Mapper
public interface ReorderGuidelineMapper {
    long countByExample(ReorderGuidelineExample example);

    int deleteByExample(ReorderGuidelineExample example);

    int deleteByPrimaryKey(String reorderGuidelineId);

    int insert(ReorderGuideline record);

    int insertSelective(ReorderGuideline record);

    List<ReorderGuideline> selectByExample(ReorderGuidelineExample example);

    ReorderGuideline selectByPrimaryKey(String reorderGuidelineId);

    int updateByExampleSelective(@Param("record") ReorderGuideline record, @Param("example") ReorderGuidelineExample example);

    int updateByExample(@Param("record") ReorderGuideline record, @Param("example") ReorderGuidelineExample example);

    int updateByPrimaryKeySelective(ReorderGuideline record);

    int updateByPrimaryKey(ReorderGuideline record);
}