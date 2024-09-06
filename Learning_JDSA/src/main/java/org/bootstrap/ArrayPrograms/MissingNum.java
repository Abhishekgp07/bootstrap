package org.bootstrap.ArrayPrograms;

import java.util.Scanner;

public class MissingNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int a[] = new int[n - 1];

        System.out.println("Enter the n-1 elements:");
        for (int i = 0; i < n - 1; i++) {  // Corrected condition: i < n - 1
            a[i] = sc.nextInt();
        }

        int num1 = 0;
        for (int i = 1; i <= n; i++) {  // Sum of numbers from 1 to n
            num1 = num1 + i;
        }

        int num2 = 0;
        for (int i = 0; i < n - 1; i++) {  // Sum of elements in the array
            num2 = num2 + a[i];
        }

        System.out.println("Missing number is: " + (num1 - num2));

        sc.close();
    }
}
