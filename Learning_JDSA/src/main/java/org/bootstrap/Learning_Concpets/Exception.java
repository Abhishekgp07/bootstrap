package org.bootstrap.Learning_Concpets;

import java.util.Scanner;

public class Exception extends Throwable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("enter the array:");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("the array elements are:");
        try {
            for (int i = 0; i <= a.length; i++) {
                System.out.println(a[i]);
            }
        }
    catch(ArrayIndexOutOfBoundsException ae){
        System.out.println("buffer Overflow");
    }
        System.out.println("program terminated normally");
}
}


//        Scanner sc = new Scanner(System.in);
//        int a, b, c;
//        System.out.print("enter the value of a");
//        a = sc.nextInt();
//        System.out.print("enter the value of b");
//        b = sc.nextInt();
//        try {
//            c = a / b;
//            System.out.println(c);
//
//        }
//    catch(ArithmeticException e){
//        System.out.println("exception handled successfully divided by 0 is not possible");
//    }
//        System.out.println("program abrupt normally");

//    }
//}


//