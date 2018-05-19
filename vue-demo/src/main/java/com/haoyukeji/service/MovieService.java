package com.haoyukeji.service;

import com.haoyukeji.entity.Movies;

import java.util.List;

public interface MovieService {

    List<Movies> findAll();

    void addNewMovie(Movies movies);
}
