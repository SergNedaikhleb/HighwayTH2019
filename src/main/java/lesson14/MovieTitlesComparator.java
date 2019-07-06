package lesson14;

import java.util.Comparator;

public class MovieTitlesComparator implements Comparator<Moviek> {
    @Override
    public int compare(Moviek o1, Moviek o2) {
        return o1.title.compareTo(o2.title);
    }
}
