package com.example.movies.service;

import com.example.movies.data.DataAccessService;
import com.example.movies.data.DataAccessServiceImpl;
import com.example.movies.domain.Movie;
import com.example.movies.exceptions.DataAccessException;
import com.example.movies.exceptions.ReadDataException;

public class MovieCatalogServiceImpl implements MovieCatalogService {

    private final DataAccessService data;

    public MovieCatalogServiceImpl() {
        this.data = new DataAccessServiceImpl();
    }

    @Override
    public void addMovie(String movieTitle) {
        Movie movie = new Movie(movieTitle);
        boolean append = false;
        try {
            append = data.exists(RESOURCE_NAME);
            data.write(movie, RESOURCE_NAME, append);
        } catch (Exception ex) {
            System.out.println("Data access error");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void listMovies() {
        try {
            var movies = this.data.list(RESOURCE_NAME);
            for (var movie : movies) {
                System.out.println("movie = " + movie);
            }
        } catch (Exception ex) {
            System.out.println("Data access error");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void searchMovie(String search) {
        String result = null;
        try {
            result = this.data.search(RESOURCE_NAME, search);
        } catch (Exception ex) {
            System.out.println("Data access error");
            ex.printStackTrace(System.out);
        }
        System.out.println("result = " + result);
    }

    @Override
    public void initializeCatalog() {
        try {
            if (this.data.exists(RESOURCE_NAME)) {
                data.delete(RESOURCE_NAME);
                data.create(RESOURCE_NAME);
            } else {
                data.create(RESOURCE_NAME);
            }
        } catch (Exception ex) {
            System.out.println("Error initializing movie catalog");
            ex.printStackTrace(System.out);
        }
    }

}