package lesson2;

import java.util.Scanner;

public class HomeWorkTastOne {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("q equals: ");
        int q = in.nextInt();

        System.out.print("w equals: ");
        int w = in.nextInt();

        System.out.println("Division result is: " +(float)q/w);
    }
}
