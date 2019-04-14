package lesson6.homeWorkLesson6;

import java.util.Random;
import java.util.Scanner;

public class ToDoArraysSorting {

    public static void main(String[] args) {
        Random gen = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[30];

        for (int i = 0; i < a.length; i++)
            a[i] = gen.nextInt(100);

        System.out.println("1. Quick Sort");
        System.out.println("2. Merge Sort");
        System.out.println("what number do you want?");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Quick sort:");
            printArray(a);
            quickSort(a, 0, a.length - 1);
            printArray(a);
        }
        else
        {
            System.out.println("Merge sort:");
            printArray(a);
            //MERGE SORT NEEDED
            printArray(a);
        }


    }

    private static void printArray(int[] a){
        for (int i : a)
            System.out.print(i + " ");
        System.out.println("");
    }
    private static void quickSort(int a[], int left, int right)
    {
        int i = left, j = right;
        int tmp;
        int pivot = a[(left + right) / 2];
        while (i <= j) {
            while (a[i] < pivot)
                i++;
            while (a[j] > pivot)
                j--;
            if (i <= j) {
                tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                i++;
                j--;
            }
        }
        if (left < j)
            quickSort(a, left, j);
        if (i < right)
            quickSort(a, i, right);
    }
//    private static void printArrays(int[] a, int tmp){
//        System.out.println();
//        for (int x = 0; x < a.length; x++){
//            System.out.print(tmp);
        }
//    }
//}
