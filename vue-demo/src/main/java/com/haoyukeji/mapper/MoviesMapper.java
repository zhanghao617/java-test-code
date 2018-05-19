package com.haoyukeji.mapper;

import com.haoyukeji.entity.Movies;
import com.haoyukeji.entity.MoviesExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MoviesMapper {
    long countByExample(MoviesExample example);

    int deleteByExample(MoviesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Movies record);

    int insertSelective(Movies record);

    List<Movies> selectByExample(MoviesExample example);

    Movies selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Movies record, @Param("example") MoviesExample example);

    int updateByExample(@Param("record") Movies record, @Param("example") MoviesExample example);

    int updateByPrimaryKeySelective(Movies record);

    int updateByPrimaryKey(Movies record);
}