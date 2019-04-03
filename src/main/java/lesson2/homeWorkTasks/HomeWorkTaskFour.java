package lesson2.homeWorkTasks;

import java.util.Scanner;

public class HomeWorkTaskFour {
    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );
        System.out.print("Your number: ");
        int n = 0;
        for ( char character : Integer.toString(scanner.nextInt()).toCharArray()) {
            n += Integer.valueOf(Character.toString(character));
        }
        System.out.print("The sum is: " +n);
    }
}
