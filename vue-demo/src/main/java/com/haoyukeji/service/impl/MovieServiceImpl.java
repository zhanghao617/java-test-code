package com.haoyukeji.service.impl;

import com.haoyukeji.entity.Movies;
import com.haoyukeji.entity.MoviesExample;
import com.haoyukeji.mapper.MoviesMapper;
import com.haoyukeji.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MoviesMapper moviesMapper;


    @Override
    public List<Movies> findAll() {
        return moviesMapper.selectByExample(new MoviesExample());
    }

    @Override
    public void addNewMovie(Movies movies) {
        moviesMapper.insertSelective(movies);
    }
}
