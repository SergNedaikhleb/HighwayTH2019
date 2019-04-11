package lesson6;

public class ArrayPractice {


    public static void main(String[] args) {

        int [] ar = {2,3,-1,6,6,6,7,8,9,0,1111};
        int max = ar[0]; //not best practice, cause int might be negative
        int min = ar[0];
        for(int i = 0; i != ar.length; i ++){
            if(ar[i] > max){
                max = ar[i];
            }
            if(ar[i] < min){
                min = ar[i];
            }
        }
        System.out.println("The min is: "+min + " and the max is: " + max);
    }
}
