package com.haoyukeji.water.mapper;

import com.haoyukeji.water.entity.TPhone;
import com.haoyukeji.water.entity.TPhoneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPhoneMapper {
    long countByExample(TPhoneExample example);

    int deleteByExample(TPhoneExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TPhone record);

    int insertSelective(TPhone record);

    List<TPhone> selectByExample(TPhoneExample example);

    TPhone selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TPhone record, @Param("example") TPhoneExample example);

    int updateByExample(@Param("record") TPhone record, @Param("example") TPhoneExample example);

    int updateByPrimaryKeySelective(TPhone record);

    int updateByPrimaryKey(TPhone record);
}