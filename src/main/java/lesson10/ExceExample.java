package lesson10;

public class ExceExample {

    public static void main(String[] args){
        int a =4;
        try {


            System.out.println(a / 0);
        } catch (ArithmeticException e){
            System.out.println("Exception!!! / 0");
            System.out.println(a / 1);
        }
    }
}
