package com.example.movies.data;

import java.io.*;
import java.util.*;
import com.example.movies.domain.Movie;
import com.example.movies.exceptions.*;

public class DataAccessServiceImpl implements DataAccessService {

    @Override
    public boolean exists(String resourceName) {
        File file = new File(resourceName);
        return file.exists();
    }

    @Override
    public List<Movie> list(String resourceName) throws ReadDataException {
        File file = new File(resourceName);
        List<Movie> movies = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            line = reader.readLine();
            while (line != null) {
                Movie movie = new Movie(line);
                movies.add(movie);
                line = reader.readLine();
            }
            reader.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw new ReadDataException("Exception while listing movies: " + ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new ReadDataException("Exception while listing movies: " + ex.getMessage());
        }
        return movies;
    }

    @Override
    public void write(Movie movie, String resourceName, boolean append) throws WriteDataException {
        File file = new File(resourceName);
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(file, append));
            writer.println(movie.toString());
            writer.close();
            System.out.println("Information written to file: " + movie);
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new WriteDataException("Exception while writing movie: " + ex.getMessage());
        }
    }

    @Override
    public String search(String resourceName, String search) throws ReadDataException {
        File file = new File(resourceName);
        String result = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            line = reader.readLine();
            int index = 1;
            while (line != null) {
                if (search != null && search.equalsIgnoreCase(line)) {
                    result = "Movie " + line + " found at index " + index;
                    break;
                }
                line = reader.readLine();
                index++;
            }
            reader.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw new ReadDataException("Exception while searching movie: " + ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new ReadDataException("Exception while searching movie: " + ex.getMessage());
        }

        return result;
    }

    @Override
    public void create(String resourceName) throws DataAccessException {
        File file = new File(resourceName);
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(file));
            writer.close();
            System.out.println("File created");
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new DataAccessException("Exception while creating file: " + ex.getMessage());
        }
    }

    @Override
    public void delete(String resourceName) {
        File file = new File(resourceName);
        if (file.exists()) file.delete();
        System.out.println("File deleted");
    }

}