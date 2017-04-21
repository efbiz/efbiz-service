package org.efbiz.product.facility.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.facility.model.ContainerGeoPoint;
import org.efbiz.product.facility.model.ContainerGeoPointExample;
import org.efbiz.product.facility.model.ContainerGeoPointKey;

@Mapper
public interface ContainerGeoPointMapper {
    long countByExample(ContainerGeoPointExample example);

    int deleteByExample(ContainerGeoPointExample example);

    int deleteByPrimaryKey(ContainerGeoPointKey key);

    int insert(ContainerGeoPoint record);

    int insertSelective(ContainerGeoPoint record);

    List<ContainerGeoPoint> selectByExample(ContainerGeoPointExample example);

    ContainerGeoPoint selectByPrimaryKey(ContainerGeoPointKey key);

    int updateByExampleSelective(@Param("record") ContainerGeoPoint record, @Param("example") ContainerGeoPointExample example);

    int updateByExample(@Param("record") ContainerGeoPoint record, @Param("example") ContainerGeoPointExample example);

    int updateByPrimaryKeySelective(ContainerGeoPoint record);

    int updateByPrimaryKey(ContainerGeoPoint record);
}