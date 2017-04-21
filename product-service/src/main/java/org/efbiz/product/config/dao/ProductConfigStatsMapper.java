package org.efbiz.product.config.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.config.model.ProductConfigStats;
import org.efbiz.product.config.model.ProductConfigStatsExample;
import org.efbiz.product.config.model.ProductConfigStatsKey;

@Mapper
public interface ProductConfigStatsMapper {
    long countByExample(ProductConfigStatsExample example);

    int deleteByExample(ProductConfigStatsExample example);

    int deleteByPrimaryKey(ProductConfigStatsKey key);

    int insert(ProductConfigStats record);

    int insertSelective(ProductConfigStats record);

    List<ProductConfigStats> selectByExample(ProductConfigStatsExample example);

    ProductConfigStats selectByPrimaryKey(ProductConfigStatsKey key);

    int updateByExampleSelective(@Param("record") ProductConfigStats record, @Param("example") ProductConfigStatsExample example);

    int updateByExample(@Param("record") ProductConfigStats record, @Param("example") ProductConfigStatsExample example);

    int updateByPrimaryKeySelective(ProductConfigStats record);

    int updateByPrimaryKey(ProductConfigStats record);
}