package org.efbiz.product.supplier.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.supplier.model.SupplierRatingType;
import org.efbiz.product.supplier.model.SupplierRatingTypeExample;

@Mapper
public interface SupplierRatingTypeMapper {
    long countByExample(SupplierRatingTypeExample example);

    int deleteByExample(SupplierRatingTypeExample example);

    int deleteByPrimaryKey(String supplierRatingTypeId);

    int insert(SupplierRatingType record);

    int insertSelective(SupplierRatingType record);

    List<SupplierRatingType> selectByExample(SupplierRatingTypeExample example);

    SupplierRatingType selectByPrimaryKey(String supplierRatingTypeId);

    int updateByExampleSelective(@Param("record") SupplierRatingType record, @Param("example") SupplierRatingTypeExample example);

    int updateByExample(@Param("record") SupplierRatingType record, @Param("example") SupplierRatingTypeExample example);

    int updateByPrimaryKeySelective(SupplierRatingType record);

    int updateByPrimaryKey(SupplierRatingType record);
}