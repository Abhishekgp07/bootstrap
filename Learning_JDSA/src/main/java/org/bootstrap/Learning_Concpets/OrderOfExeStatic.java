package org.bootstrap.Learning_Concpets;

import java.util.Scanner;
class demo{
    int a,b;
    static int x,y;

    demo(){
        System.out.println("The constructor wil get Executed");
    }
    static {
        System.out.println("The static Block will get Executed");
    }
    {
        System.out.println("The non static Block get Executed ");
    }
    void fun1(){
        System.out.println("The non static method get Executed");
    }
    static void fun2(){
        System.out.println("The static method get Executed");
    }
}
public class OrderOfExeStatic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        demo d1 = new demo();
        d1.a=10;
        d1.b=20;
        d1.x=30;
        d1.y=40;
        d1.fun1();
        demo.fun2();
        System.out.println("The value of a=" + d1.a + ", b=" + d1.b + ", x=" + d1.x + ", y=" + d1.y);


    }
}
