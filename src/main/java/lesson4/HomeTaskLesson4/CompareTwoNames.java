package lesson4.HomeTaskLesson4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CompareTwoNames {

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
        String name1 = reader.readLine();
        String name2 = reader.readLine();

        if(name1.equals(name2)) {
        System.out.println("The names are equals");
    }else{
     System.out.println("The names are not equals");
    }
}
}
