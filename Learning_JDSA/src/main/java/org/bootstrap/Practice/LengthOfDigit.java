package org.bootstrap.Practice;

import java.util.Scanner;

public class LengthOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit:");
        int n = sc.nextInt();
        int count=0;
        while(n!=0){
            int r=n%10;
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}
