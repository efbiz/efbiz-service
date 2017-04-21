package org.efbiz.product.catalog.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.catalog.model.ProdCatalogRole;
import org.efbiz.product.catalog.model.ProdCatalogRoleExample;
import org.efbiz.product.catalog.model.ProdCatalogRoleKey;

@Mapper
public interface ProdCatalogRoleMapper {
    long countByExample(ProdCatalogRoleExample example);

    int deleteByExample(ProdCatalogRoleExample example);

    int deleteByPrimaryKey(ProdCatalogRoleKey key);

    int insert(ProdCatalogRole record);

    int insertSelective(ProdCatalogRole record);

    List<ProdCatalogRole> selectByExample(ProdCatalogRoleExample example);

    ProdCatalogRole selectByPrimaryKey(ProdCatalogRoleKey key);

    int updateByExampleSelective(@Param("record") ProdCatalogRole record, @Param("example") ProdCatalogRoleExample example);

    int updateByExample(@Param("record") ProdCatalogRole record, @Param("example") ProdCatalogRoleExample example);

    int updateByPrimaryKeySelective(ProdCatalogRole record);

    int updateByPrimaryKey(ProdCatalogRole record);
}