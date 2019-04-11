package lesson6;


import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {
        int [] mas = {11,3,14,6,7,44,65,4,8,9,10,12,44};

        boolean isBuble = false;
        int buble;
        while(!isBuble) {
            isBuble = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isBuble = false;

                    buble = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buble;
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}
