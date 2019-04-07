package lesson4.HomeTaskLesson4;

import java.util.Scanner;

public class MinValue {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        int answer = Math.min( Math.min(a,b), Math.min(c,d) );
        System.out.println(answer);
    }
}

