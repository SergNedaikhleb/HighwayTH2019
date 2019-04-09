package lesson2;

public class TypesConvertionPractice {

    public static void main(String[] args) {

        int intToCharValue = 918;
        char x;
        x = (char) intToCharValue;

        System.out.println(x);

        float floatToInt = 1.23F;
        char charValue;
        charValue = (char) floatToInt;

        System.out.println(charValue);

        float floatToChar = 9.8765F;
        char thenToInt = (char) floatToChar;
        int result = (int) thenToInt;

        System.out.println(result);
    }
}
