package org.efbiz.product.catalog.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.catalog.model.ProdCatalogCategoryType;
import org.efbiz.product.catalog.model.ProdCatalogCategoryTypeExample;

@Mapper
public interface ProdCatalogCategoryTypeMapper {
    long countByExample(ProdCatalogCategoryTypeExample example);

    int deleteByExample(ProdCatalogCategoryTypeExample example);

    int deleteByPrimaryKey(String prodCatalogCategoryTypeId);

    int insert(ProdCatalogCategoryType record);

    int insertSelective(ProdCatalogCategoryType record);

    List<ProdCatalogCategoryType> selectByExample(ProdCatalogCategoryTypeExample example);

    ProdCatalogCategoryType selectByPrimaryKey(String prodCatalogCategoryTypeId);

    int updateByExampleSelective(@Param("record") ProdCatalogCategoryType record, @Param("example") ProdCatalogCategoryTypeExample example);

    int updateByExample(@Param("record") ProdCatalogCategoryType record, @Param("example") ProdCatalogCategoryTypeExample example);

    int updateByPrimaryKeySelective(ProdCatalogCategoryType record);

    int updateByPrimaryKey(ProdCatalogCategoryType record);
}