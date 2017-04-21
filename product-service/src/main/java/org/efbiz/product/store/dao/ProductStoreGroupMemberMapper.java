package org.efbiz.product.store.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.store.model.ProductStoreGroupMember;
import org.efbiz.product.store.model.ProductStoreGroupMemberExample;
import org.efbiz.product.store.model.ProductStoreGroupMemberKey;

@Mapper
public interface ProductStoreGroupMemberMapper {
    long countByExample(ProductStoreGroupMemberExample example);

    int deleteByExample(ProductStoreGroupMemberExample example);

    int deleteByPrimaryKey(ProductStoreGroupMemberKey key);

    int insert(ProductStoreGroupMember record);

    int insertSelective(ProductStoreGroupMember record);

    List<ProductStoreGroupMember> selectByExample(ProductStoreGroupMemberExample example);

    ProductStoreGroupMember selectByPrimaryKey(ProductStoreGroupMemberKey key);

    int updateByExampleSelective(@Param("record") ProductStoreGroupMember record, @Param("example") ProductStoreGroupMemberExample example);

    int updateByExample(@Param("record") ProductStoreGroupMember record, @Param("example") ProductStoreGroupMemberExample example);

    int updateByPrimaryKeySelective(ProductStoreGroupMember record);

    int updateByPrimaryKey(ProductStoreGroupMember record);
}