package lesson2.homeWorkTasks;

import java.util.Scanner;

public class HomeWorkTastOne {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("q equals: ");
        int q = in.nextInt();

        System.out.print("w equals: ");
        int w = in.nextInt();

       int x = q/w;
       int y = q%w;

        System.out.println("Division result is: " +x+"."+y);
    }
}
