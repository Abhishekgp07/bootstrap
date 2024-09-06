package org.bootstrap.ImportantProgram;

import java.util.Scanner;
public class Swapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a:");
        int a=sc.nextInt();
        System.out.println("enter the value of b:");
        int b=sc.nextInt();
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After the sorting:"+a);
        System.out.println("After the sorting :"+b);
    }
}
