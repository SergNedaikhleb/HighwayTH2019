package lesson13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortExample {

    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("A",5.4));
        movies.add(new Movie("AB",2.6));
        movies.add(new Movie("AC",6.4));
        movies.add(new Movie("AD",7.4));
        movies.add(new Movie("AE",10.0));
        for (Movie movie : movies) {
            System.out.println(movie);
        }
        System.out.println("SORTING");
        Collections.sort(movies);
       // for (movie movie :)
    }
}
