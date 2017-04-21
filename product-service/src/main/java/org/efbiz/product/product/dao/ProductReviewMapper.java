package org.efbiz.product.product.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.product.model.ProductReview;
import org.efbiz.product.product.model.ProductReviewExample;

@Mapper
public interface ProductReviewMapper {
    long countByExample(ProductReviewExample example);

    int deleteByExample(ProductReviewExample example);

    int deleteByPrimaryKey(String productReviewId);

    int insert(ProductReview record);

    int insertSelective(ProductReview record);

    List<ProductReview> selectByExampleWithBLOBs(ProductReviewExample example);

    List<ProductReview> selectByExample(ProductReviewExample example);

    ProductReview selectByPrimaryKey(String productReviewId);

    int updateByExampleSelective(@Param("record") ProductReview record, @Param("example") ProductReviewExample example);

    int updateByExampleWithBLOBs(@Param("record") ProductReview record, @Param("example") ProductReviewExample example);

    int updateByExample(@Param("record") ProductReview record, @Param("example") ProductReviewExample example);

    int updateByPrimaryKeySelective(ProductReview record);

    int updateByPrimaryKeyWithBLOBs(ProductReview record);

    int updateByPrimaryKey(ProductReview record);
}