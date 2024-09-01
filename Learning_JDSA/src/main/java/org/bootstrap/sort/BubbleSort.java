package org.bootstrap.sort;

import java.util.Scanner;

class BubbleSortAlgo {
    public void bubbleSort(int arr[], int size) {
        int temp;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // After sorting
        System.out.println("The sorted array:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Collecting the array size
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        // Creating the array
        int arr[] = new int[size];

        // Collecting the array data
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Array before sorting
        System.out.println("The array before sorting:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Sorting the array using Bubble Sort
        BubbleSortAlgo bs = new BubbleSortAlgo();
        bs.bubbleSort(arr, size);
    }
}
