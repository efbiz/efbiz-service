package org.efbiz.product.price.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.price.model.ProductPriceAutoNotice;
import org.efbiz.product.price.model.ProductPriceAutoNoticeExample;

@Mapper
public interface ProductPriceAutoNoticeMapper {
    long countByExample(ProductPriceAutoNoticeExample example);

    int deleteByExample(ProductPriceAutoNoticeExample example);

    int deleteByPrimaryKey(String productPriceNoticeId);

    int insert(ProductPriceAutoNotice record);

    int insertSelective(ProductPriceAutoNotice record);

    List<ProductPriceAutoNotice> selectByExample(ProductPriceAutoNoticeExample example);

    ProductPriceAutoNotice selectByPrimaryKey(String productPriceNoticeId);

    int updateByExampleSelective(@Param("record") ProductPriceAutoNotice record, @Param("example") ProductPriceAutoNoticeExample example);

    int updateByExample(@Param("record") ProductPriceAutoNotice record, @Param("example") ProductPriceAutoNoticeExample example);

    int updateByPrimaryKeySelective(ProductPriceAutoNotice record);

    int updateByPrimaryKey(ProductPriceAutoNotice record);
}