package lesson2;

public class PrimitiveWrapperClass {

    public static void main(String[] args) {

        Integer i = new Integer(100);
        Character c = new Character('c');
        Boolean b = new Boolean(true);

        int xInt;
        Float x = new Float("3.8644");
        xInt = x.intValue();

        System.out.println(xInt);

        int xIntSecond;
        float xFloat = 3.8644f;
        xIntSecond = (int) xFloat;

        System.out.println(xIntSecond);


        Double y = new Double("3.8644951");
        xFloat = y.floatValue();

        System.out.println(xFloat);
    }
}
