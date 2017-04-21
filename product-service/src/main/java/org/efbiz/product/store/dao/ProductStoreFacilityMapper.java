package org.efbiz.product.store.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.store.model.ProductStoreFacility;
import org.efbiz.product.store.model.ProductStoreFacilityExample;
import org.efbiz.product.store.model.ProductStoreFacilityKey;

@Mapper
public interface ProductStoreFacilityMapper {
    long countByExample(ProductStoreFacilityExample example);

    int deleteByExample(ProductStoreFacilityExample example);

    int deleteByPrimaryKey(ProductStoreFacilityKey key);

    int insert(ProductStoreFacility record);

    int insertSelective(ProductStoreFacility record);

    List<ProductStoreFacility> selectByExample(ProductStoreFacilityExample example);

    ProductStoreFacility selectByPrimaryKey(ProductStoreFacilityKey key);

    int updateByExampleSelective(@Param("record") ProductStoreFacility record, @Param("example") ProductStoreFacilityExample example);

    int updateByExample(@Param("record") ProductStoreFacility record, @Param("example") ProductStoreFacilityExample example);

    int updateByPrimaryKeySelective(ProductStoreFacility record);

    int updateByPrimaryKey(ProductStoreFacility record);
}