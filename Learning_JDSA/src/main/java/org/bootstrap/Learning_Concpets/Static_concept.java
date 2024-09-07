package org.bootstrap.Learning_Concpets;

import java.util.Scanner;

class StaticD {
    int a, b;  // Instance variables
    static int x, y;  // Static variables
}

class Static_concept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StaticD d1 = new StaticD();
        StaticD d2 = new StaticD();
        StaticD d3 = new StaticD();

        d1.a = 10;
        d1.b = 20;
        d1.x = 30;
        d1.y = 40;

        d2.a = 50;
        d2.b = 60;
        d2.x = 70;
        d2.y = 80;

        d3.a = 90;
        d3.b = 100;
        d3.x = 110;
        d3.y = 120;


        System.out.println("d1 values - a: " + d1.a + ", b: " + d1.b + ", x: " + d1.x + ", y: " + d1.y);
        System.out.println("d2 values - a: " + d2.a + ", b: " + d2.b + ", x: " + d2.x + ", y: " + d2.y);
        System.out.println("d3 values - a: " + d3.a + ", b: " + d3.b + ", x: " + d3.x + ", y: " + d3.y);
    }
}
