package org.efbiz.product.subscription.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.subscription.model.SubscriptionFulfillmentPiece;
import org.efbiz.product.subscription.model.SubscriptionFulfillmentPieceExample;
import org.efbiz.product.subscription.model.SubscriptionFulfillmentPieceKey;

@Mapper
public interface SubscriptionFulfillmentPieceMapper {
    long countByExample(SubscriptionFulfillmentPieceExample example);

    int deleteByExample(SubscriptionFulfillmentPieceExample example);

    int deleteByPrimaryKey(SubscriptionFulfillmentPieceKey key);

    int insert(SubscriptionFulfillmentPiece record);

    int insertSelective(SubscriptionFulfillmentPiece record);

    List<SubscriptionFulfillmentPiece> selectByExample(SubscriptionFulfillmentPieceExample example);

    SubscriptionFulfillmentPiece selectByPrimaryKey(SubscriptionFulfillmentPieceKey key);

    int updateByExampleSelective(@Param("record") SubscriptionFulfillmentPiece record, @Param("example") SubscriptionFulfillmentPieceExample example);

    int updateByExample(@Param("record") SubscriptionFulfillmentPiece record, @Param("example") SubscriptionFulfillmentPieceExample example);

    int updateByPrimaryKeySelective(SubscriptionFulfillmentPiece record);

    int updateByPrimaryKey(SubscriptionFulfillmentPiece record);
}