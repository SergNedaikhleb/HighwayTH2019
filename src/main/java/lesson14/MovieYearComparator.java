package lesson14;

import java.util.Comparator;

public class MovieYearComparator  implements Comparator<Moviek> {

    @Override
    public int compare(Moviek o1, Moviek o2) {
        return (o1.year < o2.year ? -1 : (o1.year == o2.year ? 0 : 1));
    }
}
