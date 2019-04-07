package lesson4.HomeTaskLesson4;

import java.util.Scanner;

public class NumberOfMonth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of month: ");
        int month = scanner.nextInt();
        String unknown = "Unknown month";
        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.print("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.print("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.print("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.print("Autumn");
                break;
            default:
                System.out.print(unknown);
        }
    }
}

