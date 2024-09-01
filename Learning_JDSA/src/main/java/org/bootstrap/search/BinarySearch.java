package org.bootstrap.search;

import java.util.Arrays;
import java.util.Scanner;

class BinarySearchMethod {
    void binarySearchMethod(int arr[], int first, int last, int key) {
        int pos = -1;

        while (first <= last) {
            int mid = (first + last) / 2;

            if (arr[mid] == key) {
                pos = mid;
                break;
            } else if (arr[mid] > key) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }

        if (pos >= 0) {
            System.out.println("Element found at position: " + pos);
        } else {
            System.out.println("Element not found, please check the input data.");
        }
    }
}

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Sorted array is:");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i] + " ");
        }

        System.out.println("Enter the search element in the array:");
        int key = sc.nextInt();

        BinarySearchMethod br = new BinarySearchMethod();
        br.binarySearchMethod(arr, 0, size - 1, key);
    }
}
