package org.bootstrap.ImportantProgram;

import java.util.Scanner;
public class ArmstrongNumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int copy = n;
        int y = 0;

        while (n != 0) {
            y++;
            n = n / 10;
        }

        n = copy;
        int result = 0;

        while (n != 0) {
            int x = n % 10;
            int power = 1;

            for (int i = 1; i <= y; i++) {
                power = power * x;
            }

            result = result + power;
            n = n / 10;
        }

        if (copy == result) {
            System.out.println("The given number is an Armstrong number.");
        } else {
            System.out.println("The given number is not an Armstrong number.");
        }

        sc.close();
    }
}
