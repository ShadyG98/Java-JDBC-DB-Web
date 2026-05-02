
package movie;

public class MovieTest {

    public static void main(String[] args) {

        Movie one = new Movie("Pokémon: Lucario and the Mystery of Mew", "Fantasy", 80);

        Movie two = new Movie("Howl's Moving Castle", "Fantasy", 100);
        two.play();

        Movie three = new Movie("Shrek", "Comedy and Fantasy", 100);
    }
}
