package org.efbiz.product.facility.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.facility.model.ProductFacility;
import org.efbiz.product.facility.model.ProductFacilityExample;
import org.efbiz.product.facility.model.ProductFacilityKey;

@Mapper
public interface ProductFacilityMapper {
    long countByExample(ProductFacilityExample example);

    int deleteByExample(ProductFacilityExample example);

    int deleteByPrimaryKey(ProductFacilityKey key);

    int insert(ProductFacility record);

    int insertSelective(ProductFacility record);

    List<ProductFacility> selectByExample(ProductFacilityExample example);

    ProductFacility selectByPrimaryKey(ProductFacilityKey key);

    int updateByExampleSelective(@Param("record") ProductFacility record, @Param("example") ProductFacilityExample example);

    int updateByExample(@Param("record") ProductFacility record, @Param("example") ProductFacilityExample example);

    int updateByPrimaryKeySelective(ProductFacility record);

    int updateByPrimaryKey(ProductFacility record);
}