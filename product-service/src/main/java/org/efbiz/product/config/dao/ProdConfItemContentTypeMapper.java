package org.efbiz.product.config.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.config.model.ProdConfItemContentType;
import org.efbiz.product.config.model.ProdConfItemContentTypeExample;

@Mapper
public interface ProdConfItemContentTypeMapper {
    long countByExample(ProdConfItemContentTypeExample example);

    int deleteByExample(ProdConfItemContentTypeExample example);

    int deleteByPrimaryKey(String confItemContentTypeId);

    int insert(ProdConfItemContentType record);

    int insertSelective(ProdConfItemContentType record);

    List<ProdConfItemContentType> selectByExample(ProdConfItemContentTypeExample example);

    ProdConfItemContentType selectByPrimaryKey(String confItemContentTypeId);

    int updateByExampleSelective(@Param("record") ProdConfItemContentType record, @Param("example") ProdConfItemContentTypeExample example);

    int updateByExample(@Param("record") ProdConfItemContentType record, @Param("example") ProdConfItemContentTypeExample example);

    int updateByPrimaryKeySelective(ProdConfItemContentType record);

    int updateByPrimaryKey(ProdConfItemContentType record);
}