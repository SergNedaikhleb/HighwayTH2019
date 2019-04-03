package lesson2;

public class ExplicitConvertion {

    public static void main(String[] args) {

        double b = 2.6;
        int c = (int) (0.5 + b); // можно применять к целым выражениям
        System.out.println(c); // выведет 3
        System.out.println((int)9.69); // выведет 9
        System.out.println((int)'A'); // выведет 65 — код символа «A»
        System.out.println((double)3); // выведет 3.0
    }
}
