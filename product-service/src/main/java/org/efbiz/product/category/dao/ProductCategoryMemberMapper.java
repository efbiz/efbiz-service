package org.efbiz.product.category.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.category.model.ProductCategoryMember;
import org.efbiz.product.category.model.ProductCategoryMemberExample;
import org.efbiz.product.category.model.ProductCategoryMemberKey;

@Mapper
public interface ProductCategoryMemberMapper {
    long countByExample(ProductCategoryMemberExample example);

    int deleteByExample(ProductCategoryMemberExample example);

    int deleteByPrimaryKey(ProductCategoryMemberKey key);

    int insert(ProductCategoryMember record);

    int insertSelective(ProductCategoryMember record);

    List<ProductCategoryMember> selectByExample(ProductCategoryMemberExample example);

    ProductCategoryMember selectByPrimaryKey(ProductCategoryMemberKey key);

    int updateByExampleSelective(@Param("record") ProductCategoryMember record, @Param("example") ProductCategoryMemberExample example);

    int updateByExample(@Param("record") ProductCategoryMember record, @Param("example") ProductCategoryMemberExample example);

    int updateByPrimaryKeySelective(ProductCategoryMember record);

    int updateByPrimaryKey(ProductCategoryMember record);
}