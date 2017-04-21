package org.efbiz.product.product.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.product.model.ProductCalculatedInfo;
import org.efbiz.product.product.model.ProductCalculatedInfoExample;

@Mapper
public interface ProductCalculatedInfoMapper {
    long countByExample(ProductCalculatedInfoExample example);

    int deleteByExample(ProductCalculatedInfoExample example);

    int deleteByPrimaryKey(String productId);

    int insert(ProductCalculatedInfo record);

    int insertSelective(ProductCalculatedInfo record);

    List<ProductCalculatedInfo> selectByExample(ProductCalculatedInfoExample example);

    ProductCalculatedInfo selectByPrimaryKey(String productId);

    int updateByExampleSelective(@Param("record") ProductCalculatedInfo record, @Param("example") ProductCalculatedInfoExample example);

    int updateByExample(@Param("record") ProductCalculatedInfo record, @Param("example") ProductCalculatedInfoExample example);

    int updateByPrimaryKeySelective(ProductCalculatedInfo record);

    int updateByPrimaryKey(ProductCalculatedInfo record);
}