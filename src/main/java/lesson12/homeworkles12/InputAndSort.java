package lesson12.homeworkles12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Вводить с клавиатуры строки до тех пор пока не будет введена пустая строка, после чего вывести строки в отсортированном порядке (алфавитном)
public class InputAndSort {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<String>();
        String input;

        while (!(input = reader.readLine()).equals("")) {
            list.add(input);
        }

        sort(list);


        System.out.println("List in alphabetically sorted order:");
        for (String s : list)
            System.out.println(s);
    }

    public static void sort(List<String> list) {

        Collections.sort(list, new Comparator<String>() {
            public int compare(String s1, String s2) {
                if (isGreaterThan(s1, s2))
                    return 1;
                else
                    return -1;
            }
        });
    }


    public static boolean isGreaterThan(String a, String b)
    {
        return a.compareTo(b) > 0;
    }
}
