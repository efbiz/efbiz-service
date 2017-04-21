package org.efbiz.product.catalog.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.catalog.model.ProdCatalog;
import org.efbiz.product.catalog.model.ProdCatalogExample;

@Mapper
public interface ProdCatalogMapper {
    long countByExample(ProdCatalogExample example);

    int deleteByExample(ProdCatalogExample example);

    int deleteByPrimaryKey(String prodCatalogId);

    int insert(ProdCatalog record);

    int insertSelective(ProdCatalog record);

    List<ProdCatalog> selectByExample(ProdCatalogExample example);

    ProdCatalog selectByPrimaryKey(String prodCatalogId);

    int updateByExampleSelective(@Param("record") ProdCatalog record, @Param("example") ProdCatalogExample example);

    int updateByExample(@Param("record") ProdCatalog record, @Param("example") ProdCatalogExample example);

    int updateByPrimaryKeySelective(ProdCatalog record);

    int updateByPrimaryKey(ProdCatalog record);
}