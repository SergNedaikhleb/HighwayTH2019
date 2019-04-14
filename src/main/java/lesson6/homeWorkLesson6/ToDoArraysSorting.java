package lesson6.homeWorkLesson6;

import java.util.Random;
import java.util.Scanner;

public class ToDoArraysSorting {

    public static void main(String[] args) {
        Random gen = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[20];

        for (int i = 0; i < a.length; i++)
            a[i] = gen.nextInt(100);

        System.out.println("1. Quick Sort");
        System.out.println("2. Merge Sort");
        System.out.println("3. Bubble Sort");
        System.out.println("what number do you want?");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Quick sort:");
            printArray(a);
            quickSort(a, 0, a.length - 1);
            printArray(a);
        }
        else if (choice == 2)
        {
            System.out.println("Merge sort:");
            printArray(a);
            mergeSort( a, 0 , 0 , 0);
            printArray(a);
        }
        else
        {
            System.out.println("Bubble sort:");
            printArray(a);
            bubbleSort(a, a.length);
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

    private static void mergeSort(int[] a, int first, int mid, int last)
    {
        int[] temp = new int[last - first + 1];
        int i = first; int j = mid + 1;
        for(int k = first; k < last; k++)
        {
            // check if a sublist is done:
            if(i > mid || j > last)
            {
                if(i > mid && j < last)
                {
                    while(j < last)
                    {
                        temp[k] = a[j];
                        j++;
                    }
                }
                else if(i < mid && j > last)
                {
                    while(i < mid)
                    {
                        temp[k] = a[i];
                        i++;
                    }
                }
                else
                {
                    break;
                }
            }
            else
            {
                if(a[i] < a[j])
                {
                    temp[k] = a[i];
                    i++;
                }
                else
                {
                    temp[k] = a[j];
                    j++;
                }
            }
        }
        for(int count = 0; count < temp.length; count++)
        {
            a[first + count] = temp[count];
        }
    }

    private static void bubbleSort(int[] a, int n) {

        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (a[j - 1] > a[j]) {
                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }}}
