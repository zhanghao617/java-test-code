package com.haoyukeji.controller;

import com.haoyukeji.controller.result.ResponseBean;
import com.haoyukeji.entity.Movies;
import com.haoyukeji.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public ResponseBean list() {
        List<Movies> moviesList = movieService.findAll();
        return ResponseBean.success(moviesList);
    }

    @PostMapping("/new")
    public ResponseBean saveNewMovie(@RequestBody Movies movies) {
        movieService.addNewMovie(movies);
        return ResponseBean.success();
    }

}
