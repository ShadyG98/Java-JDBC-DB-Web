package com.example.movies.exceptions;

public class ReadDataException extends DataAccessException {
    public ReadDataException(String message) {
        super(message);
    }
}