package com.haoyukeji.water.mapper;

import com.haoyukeji.water.entity.TUinfo;
import com.haoyukeji.water.entity.TUinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUinfoMapper {
    long countByExample(TUinfoExample example);

    int deleteByExample(TUinfoExample example);

    int deleteByPrimaryKey(Integer username);

    int insert(TUinfo record);

    int insertSelective(TUinfo record);

    List<TUinfo> selectByExample(TUinfoExample example);

    TUinfo selectByPrimaryKey(Integer username);

    int updateByExampleSelective(@Param("record") TUinfo record, @Param("example") TUinfoExample example);

    int updateByExample(@Param("record") TUinfo record, @Param("example") TUinfoExample example);

    int updateByPrimaryKeySelective(TUinfo record);

    int updateByPrimaryKey(TUinfo record);
}