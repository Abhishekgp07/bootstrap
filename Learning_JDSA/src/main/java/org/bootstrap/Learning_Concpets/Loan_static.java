package org.bootstrap.Learning_Concpets;

import java.util.Scanner;
class loan{
    float p,s,t;
    static float r;
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the principle amount:");
        p = sc.nextFloat();
        System.out.println("enter the time period:");
        t = sc.nextFloat();
    }
    void calSI(){
        s=(p*t*r)/100;
    }
    void display(){
        System.out.println("the simple intrest:"+s);
    }
    static {
        r=10.0f;
    }
}
public class Loan_static {
    public static void main(String[] args) {
        loan l1=new loan();
            l1.input();
            l1.calSI();
            l1.display();
        loan l2=new loan();
            l2.input();
            l2.calSI();
            l2.display();
    }
}
