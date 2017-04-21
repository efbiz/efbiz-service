package org.efbiz.product.feature.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.feature.model.ProductFeatureIactn;
import org.efbiz.product.feature.model.ProductFeatureIactnExample;
import org.efbiz.product.feature.model.ProductFeatureIactnKey;

@Mapper
public interface ProductFeatureIactnMapper {
    long countByExample(ProductFeatureIactnExample example);

    int deleteByExample(ProductFeatureIactnExample example);

    int deleteByPrimaryKey(ProductFeatureIactnKey key);

    int insert(ProductFeatureIactn record);

    int insertSelective(ProductFeatureIactn record);

    List<ProductFeatureIactn> selectByExample(ProductFeatureIactnExample example);

    ProductFeatureIactn selectByPrimaryKey(ProductFeatureIactnKey key);

    int updateByExampleSelective(@Param("record") ProductFeatureIactn record, @Param("example") ProductFeatureIactnExample example);

    int updateByExample(@Param("record") ProductFeatureIactn record, @Param("example") ProductFeatureIactnExample example);

    int updateByPrimaryKeySelective(ProductFeatureIactn record);

    int updateByPrimaryKey(ProductFeatureIactn record);
}