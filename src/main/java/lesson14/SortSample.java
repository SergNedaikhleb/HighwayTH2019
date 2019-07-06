package lesson14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortSample {

    public static void main(String[] args) {
        List<Moviek> movies = new ArrayList<Moviek>();

        movies.add(new Moviek(4.5, "FF"));
        movies.add(new Moviek(2.5, "JJJ"));
        movies.add(new Moviek(1.5, "LLL"));
        movies.add(new Moviek(0.5, "AAAAA"));

        for (Moviek movie : movies) {
            System.out.println(movie.title);
        }

        Collections.sort(movies);
        for (Moviek movie14 : movies) {
            System.out.println(movie14.title);
        }

        Collections.sort(movies, new MovieScoreComparator());
        for (Moviek movie14 : movies) {
            System.out.println(movie14.title);
        }
        Collections.sort(movies, new MovieTitlesComparator());
        for (Moviek movie14 : movies) {
            System.out.println(movie14.title);
        }
    }
}
