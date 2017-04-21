package org.efbiz.product.store.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.store.model.ProductStorePromoAppl;
import org.efbiz.product.store.model.ProductStorePromoApplExample;
import org.efbiz.product.store.model.ProductStorePromoApplKey;

@Mapper
public interface ProductStorePromoApplMapper {
    long countByExample(ProductStorePromoApplExample example);

    int deleteByExample(ProductStorePromoApplExample example);

    int deleteByPrimaryKey(ProductStorePromoApplKey key);

    int insert(ProductStorePromoAppl record);

    int insertSelective(ProductStorePromoAppl record);

    List<ProductStorePromoAppl> selectByExample(ProductStorePromoApplExample example);

    ProductStorePromoAppl selectByPrimaryKey(ProductStorePromoApplKey key);

    int updateByExampleSelective(@Param("record") ProductStorePromoAppl record, @Param("example") ProductStorePromoApplExample example);

    int updateByExample(@Param("record") ProductStorePromoAppl record, @Param("example") ProductStorePromoApplExample example);

    int updateByPrimaryKeySelective(ProductStorePromoAppl record);

    int updateByPrimaryKey(ProductStorePromoAppl record);
}