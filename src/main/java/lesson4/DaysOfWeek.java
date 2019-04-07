package lesson4;

import java.util.Scanner;

public class DaysOfWeek {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int day = in.nextInt();
        String dayString;
        switch (day) {
            case 1:  dayString = "Monday";
                break;
            case 2:  dayString = "Tuesday";
                break;
            case 3:  dayString = "Wednesday";
                break;
            case 4:  dayString = "Thursday";
                break;
            case 5:  dayString = "Friday";
                break;
            case 6:  dayString = "Saturday";
                break;
            case 7:  dayString = "Sunday";
                break;
            default: dayString = "I don't know this day";
                break;
        }
        System.out.print(dayString);
    }

    }

