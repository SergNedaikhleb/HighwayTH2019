package lesson4.HomeTaskLesson4;

import java.util.Scanner;

public class FiveValues {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int x = in.nextInt();

        Integer[] intArr = {a,b,c,d,x};
        int maxArr = intArr[0];
        int minArr = intArr[0];
        for(Integer value : intArr) {
            if (value > maxArr) {
                maxArr = value;
            }
            if (value < minArr) {
                minArr = value;
            }
        }
        System.out.println("The lowest value is: "+ minArr+" and the highest value is: "+maxArr);
    }
}
