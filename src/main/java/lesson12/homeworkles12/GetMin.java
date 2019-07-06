package lesson12.homeworkles12;

import java.util.*;
// Минимальное из n чисел

public class GetMin {

    public static void main(String[] args) {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    private static int getMinimum (List<Integer> list) {
        //Ваш код
        return Collections.min(list);
    }

    private static List<Integer> getIntegerList () {
        int input_size = -1;
        List<Integer> integerList = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        while (input_size <= 0) {
            System.out.println("Enter input list size");
            input_size = getIntegerInput(scanner);
        }

        System.out.println("Enter integer list of " + input_size + " integer values one-by-one");
        while (integerList.size() < input_size) {
            integerList.add(getIntegerInput(scanner));
        }
        return integerList;
    }

    private static int getIntegerInput(Scanner scanner) {
        int input  =  Integer.MAX_VALUE;

        while (input == Integer.MAX_VALUE) {
            try {
                String number = scanner.nextLine();
                input = Integer.parseInt(number);
            }
            catch (NumberFormatException exception) {
                System.out.println("Wrong input, expecting integer number");
                input = 0;
            }
        }
        return input;
    }
}
