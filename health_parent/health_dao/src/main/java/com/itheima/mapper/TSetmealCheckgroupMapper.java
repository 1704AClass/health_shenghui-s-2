package com.itheima.mapper;

import com.itheima.pojo.TSetmealCheckgroupExample;
import com.itheima.pojo.TSetmealCheckgroupKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSetmealCheckgroupMapper {
    int countByExample(TSetmealCheckgroupExample example);

    int deleteByExample(TSetmealCheckgroupExample example);

    int deleteByPrimaryKey(TSetmealCheckgroupKey key);

    int insert(TSetmealCheckgroupKey record);

    int insertSelective(TSetmealCheckgroupKey record);

    List<TSetmealCheckgroupKey> selectByExample(TSetmealCheckgroupExample example);

    int updateByExampleSelective(@Param("record") TSetmealCheckgroupKey record, @Param("example") TSetmealCheckgroupExample example);

    int updateByExample(@Param("record") TSetmealCheckgroupKey record, @Param("example") TSetmealCheckgroupExample example);
}