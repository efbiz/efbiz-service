package org.efbiz.product.config.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.config.model.ProdConfItemContent;
import org.efbiz.product.config.model.ProdConfItemContentExample;
import org.efbiz.product.config.model.ProdConfItemContentKey;

@Mapper
public interface ProdConfItemContentMapper {
    long countByExample(ProdConfItemContentExample example);

    int deleteByExample(ProdConfItemContentExample example);

    int deleteByPrimaryKey(ProdConfItemContentKey key);

    int insert(ProdConfItemContent record);

    int insertSelective(ProdConfItemContent record);

    List<ProdConfItemContent> selectByExample(ProdConfItemContentExample example);

    ProdConfItemContent selectByPrimaryKey(ProdConfItemContentKey key);

    int updateByExampleSelective(@Param("record") ProdConfItemContent record, @Param("example") ProdConfItemContentExample example);

    int updateByExample(@Param("record") ProdConfItemContent record, @Param("example") ProdConfItemContentExample example);

    int updateByPrimaryKeySelective(ProdConfItemContent record);

    int updateByPrimaryKey(ProdConfItemContent record);
}