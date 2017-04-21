package org.efbiz.product.subscription.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.subscription.model.SubscriptionAttribute;
import org.efbiz.product.subscription.model.SubscriptionAttributeExample;
import org.efbiz.product.subscription.model.SubscriptionAttributeKey;

@Mapper
public interface SubscriptionAttributeMapper {
    long countByExample(SubscriptionAttributeExample example);

    int deleteByExample(SubscriptionAttributeExample example);

    int deleteByPrimaryKey(SubscriptionAttributeKey key);

    int insert(SubscriptionAttribute record);

    int insertSelective(SubscriptionAttribute record);

    List<SubscriptionAttribute> selectByExample(SubscriptionAttributeExample example);

    SubscriptionAttribute selectByPrimaryKey(SubscriptionAttributeKey key);

    int updateByExampleSelective(@Param("record") SubscriptionAttribute record, @Param("example") SubscriptionAttributeExample example);

    int updateByExample(@Param("record") SubscriptionAttribute record, @Param("example") SubscriptionAttributeExample example);

    int updateByPrimaryKeySelective(SubscriptionAttribute record);

    int updateByPrimaryKey(SubscriptionAttribute record);
}