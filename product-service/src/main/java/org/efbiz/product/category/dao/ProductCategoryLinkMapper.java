package org.efbiz.product.category.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.category.model.ProductCategoryLink;
import org.efbiz.product.category.model.ProductCategoryLinkExample;
import org.efbiz.product.category.model.ProductCategoryLinkKey;

@Mapper
public interface ProductCategoryLinkMapper {
    long countByExample(ProductCategoryLinkExample example);

    int deleteByExample(ProductCategoryLinkExample example);

    int deleteByPrimaryKey(ProductCategoryLinkKey key);

    int insert(ProductCategoryLink record);

    int insertSelective(ProductCategoryLink record);

    List<ProductCategoryLink> selectByExampleWithBLOBs(ProductCategoryLinkExample example);

    List<ProductCategoryLink> selectByExample(ProductCategoryLinkExample example);

    ProductCategoryLink selectByPrimaryKey(ProductCategoryLinkKey key);

    int updateByExampleSelective(@Param("record") ProductCategoryLink record, @Param("example") ProductCategoryLinkExample example);

    int updateByExampleWithBLOBs(@Param("record") ProductCategoryLink record, @Param("example") ProductCategoryLinkExample example);

    int updateByExample(@Param("record") ProductCategoryLink record, @Param("example") ProductCategoryLinkExample example);

    int updateByPrimaryKeySelective(ProductCategoryLink record);

    int updateByPrimaryKeyWithBLOBs(ProductCategoryLink record);

    int updateByPrimaryKey(ProductCategoryLink record);
}