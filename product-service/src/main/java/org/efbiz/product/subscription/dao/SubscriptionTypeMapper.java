package org.efbiz.product.subscription.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.subscription.model.SubscriptionType;
import org.efbiz.product.subscription.model.SubscriptionTypeExample;

@Mapper
public interface SubscriptionTypeMapper {
    long countByExample(SubscriptionTypeExample example);

    int deleteByExample(SubscriptionTypeExample example);

    int deleteByPrimaryKey(String subscriptionTypeId);

    int insert(SubscriptionType record);

    int insertSelective(SubscriptionType record);

    List<SubscriptionType> selectByExample(SubscriptionTypeExample example);

    SubscriptionType selectByPrimaryKey(String subscriptionTypeId);

    int updateByExampleSelective(@Param("record") SubscriptionType record, @Param("example") SubscriptionTypeExample example);

    int updateByExample(@Param("record") SubscriptionType record, @Param("example") SubscriptionTypeExample example);

    int updateByPrimaryKeySelective(SubscriptionType record);

    int updateByPrimaryKey(SubscriptionType record);
}