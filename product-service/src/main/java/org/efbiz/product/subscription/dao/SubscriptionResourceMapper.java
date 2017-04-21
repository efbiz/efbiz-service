package org.efbiz.product.subscription.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.subscription.model.SubscriptionResource;
import org.efbiz.product.subscription.model.SubscriptionResourceExample;

@Mapper
public interface SubscriptionResourceMapper {
    long countByExample(SubscriptionResourceExample example);

    int deleteByExample(SubscriptionResourceExample example);

    int deleteByPrimaryKey(String subscriptionResourceId);

    int insert(SubscriptionResource record);

    int insertSelective(SubscriptionResource record);

    List<SubscriptionResource> selectByExample(SubscriptionResourceExample example);

    SubscriptionResource selectByPrimaryKey(String subscriptionResourceId);

    int updateByExampleSelective(@Param("record") SubscriptionResource record, @Param("example") SubscriptionResourceExample example);

    int updateByExample(@Param("record") SubscriptionResource record, @Param("example") SubscriptionResourceExample example);

    int updateByPrimaryKeySelective(SubscriptionResource record);

    int updateByPrimaryKey(SubscriptionResource record);
}