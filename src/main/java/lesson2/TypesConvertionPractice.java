package lesson2;

public class TypesConvertionPractice {

    public static void main(String[] args) {

        int intToCharValue = 9;
        char x;
        x = (char) intToCharValue;

        System.out.println(intToCharValue);

        float floatToInt = 1.2345F;
        char charValue;
        charValue = (char) floatToInt;

        System.out.println(floatToInt);

        float floatToChar = 9.8765F;
        char thenToInt = (char) floatToChar;
        int result = (int) thenToInt;

        System.out.println(result);
    }
}
