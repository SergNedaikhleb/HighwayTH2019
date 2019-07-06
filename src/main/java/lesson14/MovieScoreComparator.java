package lesson14;

import java.util.Comparator;

public class MovieScoreComparator implements Comparator<Moviek> {
    @Override
    public int compare(Moviek o1, Moviek o2) {
        return (o1.score < o2.score) ? -1 : ((o1.score == o2.score) ? 0 : 1);
    }}