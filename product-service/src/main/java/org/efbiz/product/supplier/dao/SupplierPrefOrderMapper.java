package org.efbiz.product.supplier.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.supplier.model.SupplierPrefOrder;
import org.efbiz.product.supplier.model.SupplierPrefOrderExample;

@Mapper
public interface SupplierPrefOrderMapper {
    long countByExample(SupplierPrefOrderExample example);

    int deleteByExample(SupplierPrefOrderExample example);

    int deleteByPrimaryKey(String supplierPrefOrderId);

    int insert(SupplierPrefOrder record);

    int insertSelective(SupplierPrefOrder record);

    List<SupplierPrefOrder> selectByExample(SupplierPrefOrderExample example);

    SupplierPrefOrder selectByPrimaryKey(String supplierPrefOrderId);

    int updateByExampleSelective(@Param("record") SupplierPrefOrder record, @Param("example") SupplierPrefOrderExample example);

    int updateByExample(@Param("record") SupplierPrefOrder record, @Param("example") SupplierPrefOrderExample example);

    int updateByPrimaryKeySelective(SupplierPrefOrder record);

    int updateByPrimaryKey(SupplierPrefOrder record);
}