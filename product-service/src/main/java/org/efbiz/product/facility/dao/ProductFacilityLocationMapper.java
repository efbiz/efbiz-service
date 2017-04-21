package org.efbiz.product.facility.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.facility.model.ProductFacilityLocation;
import org.efbiz.product.facility.model.ProductFacilityLocationExample;
import org.efbiz.product.facility.model.ProductFacilityLocationKey;

@Mapper
public interface ProductFacilityLocationMapper {
    long countByExample(ProductFacilityLocationExample example);

    int deleteByExample(ProductFacilityLocationExample example);

    int deleteByPrimaryKey(ProductFacilityLocationKey key);

    int insert(ProductFacilityLocation record);

    int insertSelective(ProductFacilityLocation record);

    List<ProductFacilityLocation> selectByExample(ProductFacilityLocationExample example);

    ProductFacilityLocation selectByPrimaryKey(ProductFacilityLocationKey key);

    int updateByExampleSelective(@Param("record") ProductFacilityLocation record, @Param("example") ProductFacilityLocationExample example);

    int updateByExample(@Param("record") ProductFacilityLocation record, @Param("example") ProductFacilityLocationExample example);

    int updateByPrimaryKeySelective(ProductFacilityLocation record);

    int updateByPrimaryKey(ProductFacilityLocation record);
}