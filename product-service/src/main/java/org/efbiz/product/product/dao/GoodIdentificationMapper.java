package org.efbiz.product.product.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.product.model.GoodIdentification;
import org.efbiz.product.product.model.GoodIdentificationExample;
import org.efbiz.product.product.model.GoodIdentificationKey;

@Mapper
public interface GoodIdentificationMapper {
    long countByExample(GoodIdentificationExample example);

    int deleteByExample(GoodIdentificationExample example);

    int deleteByPrimaryKey(GoodIdentificationKey key);

    int insert(GoodIdentification record);

    int insertSelective(GoodIdentification record);

    List<GoodIdentification> selectByExample(GoodIdentificationExample example);

    GoodIdentification selectByPrimaryKey(GoodIdentificationKey key);

    int updateByExampleSelective(@Param("record") GoodIdentification record, @Param("example") GoodIdentificationExample example);

    int updateByExample(@Param("record") GoodIdentification record, @Param("example") GoodIdentificationExample example);

    int updateByPrimaryKeySelective(GoodIdentification record);

    int updateByPrimaryKey(GoodIdentification record);
}