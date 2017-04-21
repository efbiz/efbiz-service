package org.efbiz.product.product.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.product.model.ProductGeo;
import org.efbiz.product.product.model.ProductGeoExample;
import org.efbiz.product.product.model.ProductGeoKey;

@Mapper
public interface ProductGeoMapper {
    long countByExample(ProductGeoExample example);

    int deleteByExample(ProductGeoExample example);

    int deleteByPrimaryKey(ProductGeoKey key);

    int insert(ProductGeo record);

    int insertSelective(ProductGeo record);

    List<ProductGeo> selectByExample(ProductGeoExample example);

    ProductGeo selectByPrimaryKey(ProductGeoKey key);

    int updateByExampleSelective(@Param("record") ProductGeo record, @Param("example") ProductGeoExample example);

    int updateByExample(@Param("record") ProductGeo record, @Param("example") ProductGeoExample example);

    int updateByPrimaryKeySelective(ProductGeo record);

    int updateByPrimaryKey(ProductGeo record);
}