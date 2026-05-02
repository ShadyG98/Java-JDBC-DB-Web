package com.example.movies.service;

public interface MovieCatalogService {

    String RESOURCE_NAME = "movies.txt";

    void addMovie(String movieTitle);

    void listMovies();

    void searchMovie(String search);

    void initializeCatalog();
}