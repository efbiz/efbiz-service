package org.efbiz.product.catalog.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.catalog.model.ProdCatalogCategory;
import org.efbiz.product.catalog.model.ProdCatalogCategoryExample;
import org.efbiz.product.catalog.model.ProdCatalogCategoryKey;

@Mapper
public interface ProdCatalogCategoryMapper {
    long countByExample(ProdCatalogCategoryExample example);

    int deleteByExample(ProdCatalogCategoryExample example);

    int deleteByPrimaryKey(ProdCatalogCategoryKey key);

    int insert(ProdCatalogCategory record);

    int insertSelective(ProdCatalogCategory record);

    List<ProdCatalogCategory> selectByExample(ProdCatalogCategoryExample example);

    ProdCatalogCategory selectByPrimaryKey(ProdCatalogCategoryKey key);

    int updateByExampleSelective(@Param("record") ProdCatalogCategory record, @Param("example") ProdCatalogCategoryExample example);

    int updateByExample(@Param("record") ProdCatalogCategory record, @Param("example") ProdCatalogCategoryExample example);

    int updateByPrimaryKeySelective(ProdCatalogCategory record);

    int updateByPrimaryKey(ProdCatalogCategory record);
}