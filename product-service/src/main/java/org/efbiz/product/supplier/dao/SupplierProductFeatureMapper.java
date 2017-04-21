package org.efbiz.product.supplier.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.supplier.model.SupplierProductFeature;
import org.efbiz.product.supplier.model.SupplierProductFeatureExample;
import org.efbiz.product.supplier.model.SupplierProductFeatureKey;

@Mapper
public interface SupplierProductFeatureMapper {
    long countByExample(SupplierProductFeatureExample example);

    int deleteByExample(SupplierProductFeatureExample example);

    int deleteByPrimaryKey(SupplierProductFeatureKey key);

    int insert(SupplierProductFeature record);

    int insertSelective(SupplierProductFeature record);

    List<SupplierProductFeature> selectByExample(SupplierProductFeatureExample example);

    SupplierProductFeature selectByPrimaryKey(SupplierProductFeatureKey key);

    int updateByExampleSelective(@Param("record") SupplierProductFeature record, @Param("example") SupplierProductFeatureExample example);

    int updateByExample(@Param("record") SupplierProductFeature record, @Param("example") SupplierProductFeatureExample example);

    int updateByPrimaryKeySelective(SupplierProductFeature record);

    int updateByPrimaryKey(SupplierProductFeature record);
}