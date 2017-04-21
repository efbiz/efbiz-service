package org.efbiz.product.supplier.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.supplier.model.MarketInterest;
import org.efbiz.product.supplier.model.MarketInterestExample;
import org.efbiz.product.supplier.model.MarketInterestKey;

@Mapper
public interface MarketInterestMapper {
    long countByExample(MarketInterestExample example);

    int deleteByExample(MarketInterestExample example);

    int deleteByPrimaryKey(MarketInterestKey key);

    int insert(MarketInterest record);

    int insertSelective(MarketInterest record);

    List<MarketInterest> selectByExample(MarketInterestExample example);

    MarketInterest selectByPrimaryKey(MarketInterestKey key);

    int updateByExampleSelective(@Param("record") MarketInterest record, @Param("example") MarketInterestExample example);

    int updateByExample(@Param("record") MarketInterest record, @Param("example") MarketInterestExample example);

    int updateByPrimaryKeySelective(MarketInterest record);

    int updateByPrimaryKey(MarketInterest record);
}