package com.example.movies.presentation;

import java.util.Scanner;
import com.example.movies.service.*;

public class MovieCatalogPresentation {

    public static void main(String[] args) {
        var option = -1;
        var scanner = new Scanner(System.in);
        MovieCatalogService catalog = new MovieCatalogServiceImpl();

        while (option != 0) {
            System.out.println("Choose an option: \n"
                    + "1. Initialize movie catalog\n"
                    + "2. Add movie\n"
                    + "3. List movies\n"
                    + "4. Search movie\n"
                    + "0. Exit");
            option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1:
                    catalog.initializeCatalog();
                    break;
                case 2:
                    System.out.println("Enter the movie name");
                    var movieName = scanner.nextLine();
                    catalog.addMovie(movieName);
                    break;
                case 3:
                    catalog.listMovies();
                    break;
                case 4:
                    System.out.println("Enter a movie to search");
                    var search = scanner.nextLine();
                    catalog.searchMovie(search);
                    break;
                case 0:
                    System.out.println("See you soon!");
                    break;
                default:
                    System.out.println("Option not recognized");
                    break;
            }
        }
    }
}