package org.efbiz.product.product.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.product.model.GoodIdentificationType;
import org.efbiz.product.product.model.GoodIdentificationTypeExample;

@Mapper
public interface GoodIdentificationTypeMapper {
    long countByExample(GoodIdentificationTypeExample example);

    int deleteByExample(GoodIdentificationTypeExample example);

    int deleteByPrimaryKey(String goodIdentificationTypeId);

    int insert(GoodIdentificationType record);

    int insertSelective(GoodIdentificationType record);

    List<GoodIdentificationType> selectByExample(GoodIdentificationTypeExample example);

    GoodIdentificationType selectByPrimaryKey(String goodIdentificationTypeId);

    int updateByExampleSelective(@Param("record") GoodIdentificationType record, @Param("example") GoodIdentificationTypeExample example);

    int updateByExample(@Param("record") GoodIdentificationType record, @Param("example") GoodIdentificationTypeExample example);

    int updateByPrimaryKeySelective(GoodIdentificationType record);

    int updateByPrimaryKey(GoodIdentificationType record);
}