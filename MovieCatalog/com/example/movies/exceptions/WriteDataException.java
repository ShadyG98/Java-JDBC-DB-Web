package com.example.movies.exceptions;

public class WriteDataException extends DataAccessException {
    public WriteDataException(String message) {
        super(message);
    }
}