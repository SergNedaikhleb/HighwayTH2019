package lesson12.homeworkles12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

//Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке, числа - в убывающем.

public class WordsAndNumbers {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        LinkedList<String> stringsList = new LinkedList<String>();
        LinkedList<String> numbersList = new LinkedList<String>();
        for (String element : array) {
            if (isNumber(element))
                numbersList.add(element);
            else
                stringsList.add(element);
        }
        Collections.sort(stringsList, new Comparator<String>() {
            public int compare(String s1, String s2) {
                if (isGreaterThan(s1, s2))
                    return 1;
                else
                    return -1;
            }
        });
        Collections.sort(numbersList, new Comparator<String>() {
            public int compare(String s1, String s2) {
                if (Integer.parseInt(s1) < Integer.parseInt(s2))
                    return 1;
                else
                    return -1;
            }
        });
        for (int i = 0; i < array.length; i++)
            if (isNumber(array[i]))
                array[i] = numbersList.pop();
            else
                array[i] = stringsList.pop();
    }


    public static boolean isGreaterThan(String a, String b)
    {
        return a.compareTo(b) > 0;
    }



    public static boolean isNumber(String s)
    {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];
            if ((i != 0 && c == '-') //есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') ) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}

