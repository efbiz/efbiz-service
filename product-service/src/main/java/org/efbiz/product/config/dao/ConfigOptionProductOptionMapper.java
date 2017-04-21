package org.efbiz.product.config.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.efbiz.product.config.model.ConfigOptionProductOption;
import org.efbiz.product.config.model.ConfigOptionProductOptionExample;
import org.efbiz.product.config.model.ConfigOptionProductOptionKey;

@Mapper
public interface ConfigOptionProductOptionMapper {
    long countByExample(ConfigOptionProductOptionExample example);

    int deleteByExample(ConfigOptionProductOptionExample example);

    int deleteByPrimaryKey(ConfigOptionProductOptionKey key);

    int insert(ConfigOptionProductOption record);

    int insertSelective(ConfigOptionProductOption record);

    List<ConfigOptionProductOption> selectByExample(ConfigOptionProductOptionExample example);

    ConfigOptionProductOption selectByPrimaryKey(ConfigOptionProductOptionKey key);

    int updateByExampleSelective(@Param("record") ConfigOptionProductOption record, @Param("example") ConfigOptionProductOptionExample example);

    int updateByExample(@Param("record") ConfigOptionProductOption record, @Param("example") ConfigOptionProductOptionExample example);

    int updateByPrimaryKeySelective(ConfigOptionProductOption record);

    int updateByPrimaryKey(ConfigOptionProductOption record);
}