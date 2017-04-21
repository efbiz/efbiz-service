package org.efbiz.product.supplier.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.supplier.model.SupplierProduct;
import org.efbiz.product.supplier.model.SupplierProductExample;
import org.efbiz.product.supplier.model.SupplierProductKey;

@Mapper
public interface SupplierProductMapper {
    long countByExample(SupplierProductExample example);

    int deleteByExample(SupplierProductExample example);

    int deleteByPrimaryKey(SupplierProductKey key);

    int insert(SupplierProduct record);

    int insertSelective(SupplierProduct record);

    List<SupplierProduct> selectByExample(SupplierProductExample example);

    SupplierProduct selectByPrimaryKey(SupplierProductKey key);

    int updateByExampleSelective(@Param("record") SupplierProduct record, @Param("example") SupplierProductExample example);

    int updateByExample(@Param("record") SupplierProduct record, @Param("example") SupplierProductExample example);

    int updateByPrimaryKeySelective(SupplierProduct record);

    int updateByPrimaryKey(SupplierProduct record);
}