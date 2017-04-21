package org.efbiz.product.subscription.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.subscription.model.ProductSubscriptionResource;
import org.efbiz.product.subscription.model.ProductSubscriptionResourceExample;
import org.efbiz.product.subscription.model.ProductSubscriptionResourceKey;

@Mapper
public interface ProductSubscriptionResourceMapper {
    long countByExample(ProductSubscriptionResourceExample example);

    int deleteByExample(ProductSubscriptionResourceExample example);

    int deleteByPrimaryKey(ProductSubscriptionResourceKey key);

    int insert(ProductSubscriptionResource record);

    int insertSelective(ProductSubscriptionResource record);

    List<ProductSubscriptionResource> selectByExample(ProductSubscriptionResourceExample example);

    ProductSubscriptionResource selectByPrimaryKey(ProductSubscriptionResourceKey key);

    int updateByExampleSelective(@Param("record") ProductSubscriptionResource record, @Param("example") ProductSubscriptionResourceExample example);

    int updateByExample(@Param("record") ProductSubscriptionResource record, @Param("example") ProductSubscriptionResourceExample example);

    int updateByPrimaryKeySelective(ProductSubscriptionResource record);

    int updateByPrimaryKey(ProductSubscriptionResource record);
}