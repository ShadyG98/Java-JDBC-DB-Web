package com.example.movies.test;

import com.example.movies.service.*;
import com.example.movies.domain.Movie;

public class TestCatalog {
    public static void main(String[] args) {
        MovieCatalogService catalog = new MovieCatalogServiceImpl();
        catalog.initializeCatalog();
        catalog.addMovie("The Matrix");
        catalog.addMovie("Inception");
        catalog.listMovies();
        catalog.searchMovie("Inception");
    }
}