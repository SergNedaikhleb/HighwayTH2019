package lesson13;

public class Movie implements Comparable {
    public double score;
    public String title;
    public int year;

    public Movie(String title, double score, int year){ }

    public Movie(String title, double score) {
        this.title = title;
        this.score = score;
    }





    @Override
    public int compareTo(Object o) {
        Movie m = (Movie)o;
        return (score < m.score) ? -1 : ((score == m.score) ? 0 : 1);
    }

   // @Override
    public String toString(){
        return "Movie("+
                "title" + title + "\"" ;

    }
}

