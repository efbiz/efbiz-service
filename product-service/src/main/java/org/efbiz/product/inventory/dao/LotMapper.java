package org.efbiz.product.inventory.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.inventory.model.Lot;
import org.efbiz.product.inventory.model.LotExample;

@Mapper
public interface LotMapper {
    long countByExample(LotExample example);

    int deleteByExample(LotExample example);

    int deleteByPrimaryKey(String lotId);

    int insert(Lot record);

    int insertSelective(Lot record);

    List<Lot> selectByExample(LotExample example);

    Lot selectByPrimaryKey(String lotId);

    int updateByExampleSelective(@Param("record") Lot record, @Param("example") LotExample example);

    int updateByExample(@Param("record") Lot record, @Param("example") LotExample example);

    int updateByPrimaryKeySelective(Lot record);

    int updateByPrimaryKey(Lot record);
}