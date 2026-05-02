package com.example.movies.data;

import java.util.List;
import com.example.movies.domain.Movie;
import com.example.movies.exceptions.*;

public interface DataAccessService {

    boolean exists(String resourceName) throws DataAccessException;

    List<Movie> list(String resourceName) throws ReadDataException;

    void write(Movie movie, String resourceName, boolean append) throws WriteDataException;

    String search(String resourceName, String search) throws ReadDataException;

    void create(String resourceName) throws DataAccessException;

    void delete(String resourceName) throws DataAccessException;
}