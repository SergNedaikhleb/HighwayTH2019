package lesson2;

import java.util.Scanner;

public class IntAndCharFromConsole {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a character: ");
        char myCharacter = in.next().charAt(0);

        System.out.println("Your number in integer:" +(int)myCharacter);
        // in.close();

        System.out.print("Now input your integer: ");
        int myIntegerNumber = in.nextInt();

        System.out.println("Your number in integer:" +(char)myIntegerNumber);
    }
}
