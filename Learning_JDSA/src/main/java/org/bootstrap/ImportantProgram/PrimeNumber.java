package org.bootstrap.ImportantProgram;

import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int  n=sc.nextInt();
        int count=0;
         for(int i=1;i<=n;i++) {
             if (n % i == 0) {
                 count++;
             }
         }
             if(count==2){
                 System.out.println("The given number is prime number");
             }else{
                 System.out.println("The given number is not a prime number");
             }
         }

    }

