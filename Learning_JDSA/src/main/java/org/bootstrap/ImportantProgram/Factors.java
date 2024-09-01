package org.bootstrap.ImportantProgram;
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int count = 0;

        System.out.println("Enter the value of n:");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        System.out.println("The number of factors of " + n + " is: " + count);
    }
}
