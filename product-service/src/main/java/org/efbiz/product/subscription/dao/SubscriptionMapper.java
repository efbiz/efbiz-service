package org.efbiz.product.subscription.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.subscription.model.Subscription;
import org.efbiz.product.subscription.model.SubscriptionExample;

@Mapper
public interface SubscriptionMapper {
    long countByExample(SubscriptionExample example);

    int deleteByExample(SubscriptionExample example);

    int deleteByPrimaryKey(String subscriptionId);

    int insert(Subscription record);

    int insertSelective(Subscription record);

    List<Subscription> selectByExample(SubscriptionExample example);

    Subscription selectByPrimaryKey(String subscriptionId);

    int updateByExampleSelective(@Param("record") Subscription record, @Param("example") SubscriptionExample example);

    int updateByExample(@Param("record") Subscription record, @Param("example") SubscriptionExample example);

    int updateByPrimaryKeySelective(Subscription record);

    int updateByPrimaryKey(Subscription record);
}