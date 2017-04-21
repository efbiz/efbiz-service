package org.efbiz.product.product.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.product.model.VendorProduct;
import org.efbiz.product.product.model.VendorProductExample;
import org.efbiz.product.product.model.VendorProductKey;

@Mapper
public interface VendorProductMapper {
    long countByExample(VendorProductExample example);

    int deleteByExample(VendorProductExample example);

    int deleteByPrimaryKey(VendorProductKey key);

    int insert(VendorProduct record);

    int insertSelective(VendorProduct record);

    List<VendorProduct> selectByExample(VendorProductExample example);

    VendorProduct selectByPrimaryKey(VendorProductKey key);

    int updateByExampleSelective(@Param("record") VendorProduct record, @Param("example") VendorProductExample example);

    int updateByExample(@Param("record") VendorProduct record, @Param("example") VendorProductExample example);

    int updateByPrimaryKeySelective(VendorProduct record);

    int updateByPrimaryKey(VendorProduct record);
}