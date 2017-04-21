package org.efbiz.product.subscription.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.subscription.model.SubscriptionTypeAttr;
import org.efbiz.product.subscription.model.SubscriptionTypeAttrExample;
import org.efbiz.product.subscription.model.SubscriptionTypeAttrKey;

@Mapper
public interface SubscriptionTypeAttrMapper {
    long countByExample(SubscriptionTypeAttrExample example);

    int deleteByExample(SubscriptionTypeAttrExample example);

    int deleteByPrimaryKey(SubscriptionTypeAttrKey key);

    int insert(SubscriptionTypeAttr record);

    int insertSelective(SubscriptionTypeAttr record);

    List<SubscriptionTypeAttr> selectByExample(SubscriptionTypeAttrExample example);

    SubscriptionTypeAttr selectByPrimaryKey(SubscriptionTypeAttrKey key);

    int updateByExampleSelective(@Param("record") SubscriptionTypeAttr record, @Param("example") SubscriptionTypeAttrExample example);

    int updateByExample(@Param("record") SubscriptionTypeAttr record, @Param("example") SubscriptionTypeAttrExample example);

    int updateByPrimaryKeySelective(SubscriptionTypeAttr record);

    int updateByPrimaryKey(SubscriptionTypeAttr record);
}