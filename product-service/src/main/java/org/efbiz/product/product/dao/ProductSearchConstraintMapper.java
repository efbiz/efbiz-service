package org.efbiz.product.product.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.product.model.ProductSearchConstraint;
import org.efbiz.product.product.model.ProductSearchConstraintExample;
import org.efbiz.product.product.model.ProductSearchConstraintKey;

@Mapper
public interface ProductSearchConstraintMapper {
    long countByExample(ProductSearchConstraintExample example);

    int deleteByExample(ProductSearchConstraintExample example);

    int deleteByPrimaryKey(ProductSearchConstraintKey key);

    int insert(ProductSearchConstraint record);

    int insertSelective(ProductSearchConstraint record);

    List<ProductSearchConstraint> selectByExample(ProductSearchConstraintExample example);

    ProductSearchConstraint selectByPrimaryKey(ProductSearchConstraintKey key);

    int updateByExampleSelective(@Param("record") ProductSearchConstraint record, @Param("example") ProductSearchConstraintExample example);

    int updateByExample(@Param("record") ProductSearchConstraint record, @Param("example") ProductSearchConstraintExample example);

    int updateByPrimaryKeySelective(ProductSearchConstraint record);

    int updateByPrimaryKey(ProductSearchConstraint record);
}