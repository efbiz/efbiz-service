package org.efbiz.product.subscription.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.subscription.model.SubscriptionActivity;
import org.efbiz.product.subscription.model.SubscriptionActivityExample;

@Mapper
public interface SubscriptionActivityMapper {
    long countByExample(SubscriptionActivityExample example);

    int deleteByExample(SubscriptionActivityExample example);

    int deleteByPrimaryKey(String subscriptionActivityId);

    int insert(SubscriptionActivity record);

    int insertSelective(SubscriptionActivity record);

    List<SubscriptionActivity> selectByExample(SubscriptionActivityExample example);

    SubscriptionActivity selectByPrimaryKey(String subscriptionActivityId);

    int updateByExampleSelective(@Param("record") SubscriptionActivity record, @Param("example") SubscriptionActivityExample example);

    int updateByExample(@Param("record") SubscriptionActivity record, @Param("example") SubscriptionActivityExample example);

    int updateByPrimaryKeySelective(SubscriptionActivity record);

    int updateByPrimaryKey(SubscriptionActivity record);
}