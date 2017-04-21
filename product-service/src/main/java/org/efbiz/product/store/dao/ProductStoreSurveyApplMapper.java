package org.efbiz.product.store.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.store.model.ProductStoreSurveyAppl;
import org.efbiz.product.store.model.ProductStoreSurveyApplExample;

@Mapper
public interface ProductStoreSurveyApplMapper {
    long countByExample(ProductStoreSurveyApplExample example);

    int deleteByExample(ProductStoreSurveyApplExample example);

    int deleteByPrimaryKey(String productStoreSurveyId);

    int insert(ProductStoreSurveyAppl record);

    int insertSelective(ProductStoreSurveyAppl record);

    List<ProductStoreSurveyAppl> selectByExample(ProductStoreSurveyApplExample example);

    ProductStoreSurveyAppl selectByPrimaryKey(String productStoreSurveyId);

    int updateByExampleSelective(@Param("record") ProductStoreSurveyAppl record, @Param("example") ProductStoreSurveyApplExample example);

    int updateByExample(@Param("record") ProductStoreSurveyAppl record, @Param("example") ProductStoreSurveyApplExample example);

    int updateByPrimaryKeySelective(ProductStoreSurveyAppl record);

    int updateByPrimaryKey(ProductStoreSurveyAppl record);
}