package movie;

/**
 * Represents a movie with title, genre, and rating.
 */
public class Movie {

    private String title;
    private String genre;
    private int rating;

    public Movie() {}

    public Movie(String title, String genre, int rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    public void play() {
        System.out.println("Playing the movie");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}