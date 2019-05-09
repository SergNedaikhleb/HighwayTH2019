package lesson7.homeTaskLesson7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountAInString {
    public static void main(String[] args) {
        Scanner inputString = new Scanner(System.in);
        char necessaryLetter ='a';
        System.out.println("Вводи строку!");
        char arrayNumber[] = inputString.nextLine().toCharArray();
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < arrayNumber.length; i++){
            if (arrayNumber[i] == necessaryLetter) {
                indexes.add(i);
            }
        }
        System.out.println("Кол-во символов “a” - " + indexes.size()+", индексы символа “a” в строке - "+ indexes);
    }
}
