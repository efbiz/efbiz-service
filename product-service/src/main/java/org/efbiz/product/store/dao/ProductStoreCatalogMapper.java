package org.efbiz.product.store.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.store.model.ProductStoreCatalog;
import org.efbiz.product.store.model.ProductStoreCatalogExample;
import org.efbiz.product.store.model.ProductStoreCatalogKey;

@Mapper
public interface ProductStoreCatalogMapper {
    long countByExample(ProductStoreCatalogExample example);

    int deleteByExample(ProductStoreCatalogExample example);

    int deleteByPrimaryKey(ProductStoreCatalogKey key);

    int insert(ProductStoreCatalog record);

    int insertSelective(ProductStoreCatalog record);

    List<ProductStoreCatalog> selectByExample(ProductStoreCatalogExample example);

    ProductStoreCatalog selectByPrimaryKey(ProductStoreCatalogKey key);

    int updateByExampleSelective(@Param("record") ProductStoreCatalog record, @Param("example") ProductStoreCatalogExample example);

    int updateByExample(@Param("record") ProductStoreCatalog record, @Param("example") ProductStoreCatalogExample example);

    int updateByPrimaryKeySelective(ProductStoreCatalog record);

    int updateByPrimaryKey(ProductStoreCatalog record);
}