package org.bootstrap.ImportantProgram;

import java.util.Scanner;

public class LengthOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        System.out.println("enter the number:");
        int n = sc.nextInt();
        while(n!=0){
            int r=n%10;
            n=n/10;
            count++;
        }
        System.out.println("The length of the number is"+count);
    }
}
