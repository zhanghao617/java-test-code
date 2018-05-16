package com.haoyukeji.water.mapper;

import com.haoyukeji.water.entity.TWinfo;
import com.haoyukeji.water.entity.TWinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TWinfoMapper {
    long countByExample(TWinfoExample example);

    int deleteByExample(TWinfoExample example);

    int deleteByPrimaryKey(Integer wid);

    int insert(TWinfo record);

    int insertSelective(TWinfo record);

    List<TWinfo> selectByExample(TWinfoExample example);

    TWinfo selectByPrimaryKey(Integer wid);

    int updateByExampleSelective(@Param("record") TWinfo record, @Param("example") TWinfoExample example);

    int updateByExample(@Param("record") TWinfo record, @Param("example") TWinfoExample example);

    int updateByPrimaryKeySelective(TWinfo record);

    int updateByPrimaryKey(TWinfo record);
}