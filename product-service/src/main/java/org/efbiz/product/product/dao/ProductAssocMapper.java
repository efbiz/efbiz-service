package org.efbiz.product.product.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.product.model.ProductAssoc;
import org.efbiz.product.product.model.ProductAssocExample;
import org.efbiz.product.product.model.ProductAssocKey;

@Mapper
public interface ProductAssocMapper {
    long countByExample(ProductAssocExample example);

    int deleteByExample(ProductAssocExample example);

    int deleteByPrimaryKey(ProductAssocKey key);

    int insert(ProductAssoc record);

    int insertSelective(ProductAssoc record);

    List<ProductAssoc> selectByExample(ProductAssocExample example);

    ProductAssoc selectByPrimaryKey(ProductAssocKey key);

    int updateByExampleSelective(@Param("record") ProductAssoc record, @Param("example") ProductAssocExample example);

    int updateByExample(@Param("record") ProductAssoc record, @Param("example") ProductAssocExample example);

    int updateByPrimaryKeySelective(ProductAssoc record);

    int updateByPrimaryKey(ProductAssoc record);
}