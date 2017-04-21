package org.efbiz.product.catalog.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.catalog.model.ProdCatalogInvFacility;
import org.efbiz.product.catalog.model.ProdCatalogInvFacilityExample;
import org.efbiz.product.catalog.model.ProdCatalogInvFacilityKey;

@Mapper
public interface ProdCatalogInvFacilityMapper {
    long countByExample(ProdCatalogInvFacilityExample example);

    int deleteByExample(ProdCatalogInvFacilityExample example);

    int deleteByPrimaryKey(ProdCatalogInvFacilityKey key);

    int insert(ProdCatalogInvFacility record);

    int insertSelective(ProdCatalogInvFacility record);

    List<ProdCatalogInvFacility> selectByExample(ProdCatalogInvFacilityExample example);

    ProdCatalogInvFacility selectByPrimaryKey(ProdCatalogInvFacilityKey key);

    int updateByExampleSelective(@Param("record") ProdCatalogInvFacility record, @Param("example") ProdCatalogInvFacilityExample example);

    int updateByExample(@Param("record") ProdCatalogInvFacility record, @Param("example") ProdCatalogInvFacilityExample example);

    int updateByPrimaryKeySelective(ProdCatalogInvFacility record);

    int updateByPrimaryKey(ProdCatalogInvFacility record);
}