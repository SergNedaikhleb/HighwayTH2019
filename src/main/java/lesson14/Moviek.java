package lesson14;

public class Moviek implements Comparable {

    public double score;
    public String title;
    public int year;

    public Moviek(double score, String title) {
        this.score = score;
        this.title = title;
    }

    public Moviek(double score, String title, int year) {
        this.score = score;
        this.title = title;
        this.year = year;
    }

    @Override
    public int compareTo(Object o) {
        Moviek m = (Moviek)o;
        return (score < m.score) ? -1 : ((score == m.score) ? 0 : 1);    }
}

