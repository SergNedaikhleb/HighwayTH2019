package lesson4.HomeTaskLesson4;

import java.util.Scanner;

public class MinAndMaxValue {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int x =0;
        int y = 0;

        if (a<b &a<c&a<d)x =a;
        else if (b<a&b<c&b<d)x =b;
        else if (c<a&c<b&c<d)x =c;
        else if (d<b&d<c&d<a)x =d;

        if (a>b &a>c&a>d)y =a;
        else if (b>a&b>c&b>d)y =b;
        else if (c>a&c>b&c>d)y =c;
        else if (d>b&d>c&d>a)y =d;

        System.out.println("the lowest value is: "+x);
        System.out.println("the maximum value is: "+y);
    }}