package org.efbiz.product.facility.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.facility.model.ContainerType;
import org.efbiz.product.facility.model.ContainerTypeExample;

@Mapper
public interface ContainerTypeMapper {
    long countByExample(ContainerTypeExample example);

    int deleteByExample(ContainerTypeExample example);

    int deleteByPrimaryKey(String containerTypeId);

    int insert(ContainerType record);

    int insertSelective(ContainerType record);

    List<ContainerType> selectByExample(ContainerTypeExample example);

    ContainerType selectByPrimaryKey(String containerTypeId);

    int updateByExampleSelective(@Param("record") ContainerType record, @Param("example") ContainerTypeExample example);

    int updateByExample(@Param("record") ContainerType record, @Param("example") ContainerTypeExample example);

    int updateByPrimaryKeySelective(ContainerType record);

    int updateByPrimaryKey(ContainerType record);
}