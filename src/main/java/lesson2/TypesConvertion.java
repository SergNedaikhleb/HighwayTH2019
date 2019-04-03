package lesson2;

public class TypesConvertion {

    public static void main(String[] args) {

        int i = 605233;

        long lo = i;
        short s = (short) lo;

        System.out.println(s);

        //Пример как узнать какому числу соответствует символ
        char ch = 'J';
        int intCh = (int) ch;

        System.out.println("J corresponds with "+ intCh);
       }
}
