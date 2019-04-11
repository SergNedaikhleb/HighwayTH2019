package lesson6;

import java.util.Arrays;

public class ArraysSortEx {
    public static void main(String[] args) {
        int someAr[] = {1, 5, 7, 2, 0};
        Arrays.sort(someAr);
        System.out.println("Sorted: "+Arrays.toString(someAr));
    }
}
