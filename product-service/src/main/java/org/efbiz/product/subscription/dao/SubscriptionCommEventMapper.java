package org.efbiz.product.subscription.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.subscription.model.SubscriptionCommEvent;
import org.efbiz.product.subscription.model.SubscriptionCommEventExample;
import org.efbiz.product.subscription.model.SubscriptionCommEventKey;

@Mapper
public interface SubscriptionCommEventMapper {
    long countByExample(SubscriptionCommEventExample example);

    int deleteByExample(SubscriptionCommEventExample example);

    int deleteByPrimaryKey(SubscriptionCommEventKey key);

    int insert(SubscriptionCommEvent record);

    int insertSelective(SubscriptionCommEvent record);

    List<SubscriptionCommEvent> selectByExample(SubscriptionCommEventExample example);

    SubscriptionCommEvent selectByPrimaryKey(SubscriptionCommEventKey key);

    int updateByExampleSelective(@Param("record") SubscriptionCommEvent record, @Param("example") SubscriptionCommEventExample example);

    int updateByExample(@Param("record") SubscriptionCommEvent record, @Param("example") SubscriptionCommEventExample example);

    int updateByPrimaryKeySelective(SubscriptionCommEvent record);

    int updateByPrimaryKey(SubscriptionCommEvent record);
}