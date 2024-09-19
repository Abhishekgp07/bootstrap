package org.bootstrap.sort;

import java.util.Scanner;

class QuicksortAlgo {
    public void quicksort(int arr[], int first, int last) {
        if (first < last) {
            int mid = partition(arr, first, last);
            quicksort(arr, first, mid - 1);  // Recursively sort elements before partition
            quicksort(arr, mid + 1, last);   // Recursively sort elements after partition
        }
    }

    private int partition(int[] arr, int first, int last) {
        int pivot = arr[last];
        int i = first - 1;
        for (int j = first; j < last; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap arr[i + 1] and arr[last] (pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[last];
        arr[last] = temp;

        return i + 1;
    }
}

class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The unsorted array:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        QuicksortAlgo qa = new QuicksortAlgo();
        qa.quicksort(arr, 0, size - 1);

        System.out.println("The sorted array is:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
