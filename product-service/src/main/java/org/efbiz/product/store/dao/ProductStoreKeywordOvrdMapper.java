package org.efbiz.product.store.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.store.model.ProductStoreKeywordOvrd;
import org.efbiz.product.store.model.ProductStoreKeywordOvrdExample;
import org.efbiz.product.store.model.ProductStoreKeywordOvrdKey;

@Mapper
public interface ProductStoreKeywordOvrdMapper {
    long countByExample(ProductStoreKeywordOvrdExample example);

    int deleteByExample(ProductStoreKeywordOvrdExample example);

    int deleteByPrimaryKey(ProductStoreKeywordOvrdKey key);

    int insert(ProductStoreKeywordOvrd record);

    int insertSelective(ProductStoreKeywordOvrd record);

    List<ProductStoreKeywordOvrd> selectByExample(ProductStoreKeywordOvrdExample example);

    ProductStoreKeywordOvrd selectByPrimaryKey(ProductStoreKeywordOvrdKey key);

    int updateByExampleSelective(@Param("record") ProductStoreKeywordOvrd record, @Param("example") ProductStoreKeywordOvrdExample example);

    int updateByExample(@Param("record") ProductStoreKeywordOvrd record, @Param("example") ProductStoreKeywordOvrdExample example);

    int updateByPrimaryKeySelective(ProductStoreKeywordOvrd record);

    int updateByPrimaryKey(ProductStoreKeywordOvrd record);
}