package lesson4.HomeTaskLesson4;

import java.util.Scanner;

public class MinAndMaxValue {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        int minAnswer = Math.min( Math.min(a,b), Math.min(c,d) );
        System.out.println("the lowest value is: "+minAnswer);

        int maxAnswer = Math.max( Math.min(a,b), Math.max(c,d) );
        System.out.println("the maximum value is: "+maxAnswer);
    }
}

