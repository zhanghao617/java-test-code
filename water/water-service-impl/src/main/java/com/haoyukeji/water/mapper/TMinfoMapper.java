package com.haoyukeji.water.mapper;

import com.haoyukeji.water.entity.TMinfo;
import com.haoyukeji.water.entity.TMinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMinfoMapper {
    long countByExample(TMinfoExample example);

    int deleteByExample(TMinfoExample example);

    int deleteByPrimaryKey(Integer mid);

    int insert(TMinfo record);

    int insertSelective(TMinfo record);

    List<TMinfo> selectByExample(TMinfoExample example);

    TMinfo selectByPrimaryKey(Integer mid);

    int updateByExampleSelective(@Param("record") TMinfo record, @Param("example") TMinfoExample example);

    int updateByExample(@Param("record") TMinfo record, @Param("example") TMinfoExample example);

    int updateByPrimaryKeySelective(TMinfo record);

    int updateByPrimaryKey(TMinfo record);
}