package org.efbiz.product.product.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.product.model.ProductSearchResult;
import org.efbiz.product.product.model.ProductSearchResultExample;

@Mapper
public interface ProductSearchResultMapper {
    long countByExample(ProductSearchResultExample example);

    int deleteByExample(ProductSearchResultExample example);

    int deleteByPrimaryKey(String productSearchResultId);

    int insert(ProductSearchResult record);

    int insertSelective(ProductSearchResult record);

    List<ProductSearchResult> selectByExample(ProductSearchResultExample example);

    ProductSearchResult selectByPrimaryKey(String productSearchResultId);

    int updateByExampleSelective(@Param("record") ProductSearchResult record, @Param("example") ProductSearchResultExample example);

    int updateByExample(@Param("record") ProductSearchResult record, @Param("example") ProductSearchResultExample example);

    int updateByPrimaryKeySelective(ProductSearchResult record);

    int updateByPrimaryKey(ProductSearchResult record);
}