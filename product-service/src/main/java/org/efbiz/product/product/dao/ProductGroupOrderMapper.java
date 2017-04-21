package org.efbiz.product.product.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.product.model.ProductGroupOrder;
import org.efbiz.product.product.model.ProductGroupOrderExample;

@Mapper
public interface ProductGroupOrderMapper {
    long countByExample(ProductGroupOrderExample example);

    int deleteByExample(ProductGroupOrderExample example);

    int deleteByPrimaryKey(String groupOrderId);

    int insert(ProductGroupOrder record);

    int insertSelective(ProductGroupOrder record);

    List<ProductGroupOrder> selectByExample(ProductGroupOrderExample example);

    ProductGroupOrder selectByPrimaryKey(String groupOrderId);

    int updateByExampleSelective(@Param("record") ProductGroupOrder record, @Param("example") ProductGroupOrderExample example);

    int updateByExample(@Param("record") ProductGroupOrder record, @Param("example") ProductGroupOrderExample example);

    int updateByPrimaryKeySelective(ProductGroupOrder record);

    int updateByPrimaryKey(ProductGroupOrder record);
}