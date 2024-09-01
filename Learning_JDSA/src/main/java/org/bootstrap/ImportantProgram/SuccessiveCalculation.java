package org.bootstrap.ImportantProgram;

import java.util.Scanner;

public class SuccessiveCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int product = 1; // Initialize product to 1

        System.out.print("Enter the value of n:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
            product = product * i; // Multiply current product by i
        }

        System.out.println("The sum of the Given number is " + sum);
        System.out.println("The product of the Given number is " + product);
    }
}