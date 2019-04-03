package lesson2;

import java.util.Scanner;

public class HomeWorkTaskTwo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Your number:");
        int n = 0;
        for (char character : Integer.toString(scanner.nextInt()).toCharArray()) {
            n += Integer.valueOf(Character.toString(character));
        }
        System.out.print("The sum is: "+ n);
    }
}
