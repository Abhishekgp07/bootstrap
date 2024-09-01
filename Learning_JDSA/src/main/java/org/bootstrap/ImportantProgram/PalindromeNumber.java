package org.bootstrap.ImportantProgram;
import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n:");
        int n= sc.nextInt();
        String sn= sc.next();
        System.out.println(sn);
        int copy=n;
        int x=0;
            while (n != 0) {
                int r = n % 10;
                x = (x * 10) + r;
                n = n / 10;
            }
            if (copy == x) {
                System.out.println("The given value is Palindrome number");
            } else {
                System.out.println("The given value is not a Palindrome number:");
            }
        }

}

