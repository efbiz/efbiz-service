package org.efbiz.product.product.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.product.model.ProductGlAccount;
import org.efbiz.product.product.model.ProductGlAccountExample;
import org.efbiz.product.product.model.ProductGlAccountKey;

@Mapper
public interface ProductGlAccountMapper {
    long countByExample(ProductGlAccountExample example);

    int deleteByExample(ProductGlAccountExample example);

    int deleteByPrimaryKey(ProductGlAccountKey key);

    int insert(ProductGlAccount record);

    int insertSelective(ProductGlAccount record);

    List<ProductGlAccount> selectByExample(ProductGlAccountExample example);

    ProductGlAccount selectByPrimaryKey(ProductGlAccountKey key);

    int updateByExampleSelective(@Param("record") ProductGlAccount record, @Param("example") ProductGlAccountExample example);

    int updateByExample(@Param("record") ProductGlAccount record, @Param("example") ProductGlAccountExample example);

    int updateByPrimaryKeySelective(ProductGlAccount record);

    int updateByPrimaryKey(ProductGlAccount record);
}