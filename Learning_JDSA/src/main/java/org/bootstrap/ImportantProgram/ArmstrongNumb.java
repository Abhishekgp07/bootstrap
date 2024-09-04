package org.bootstrap.ImportantProgram;

import java.util.Scanner;

public class ArmstrongNumb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int copy=n;
        int y=0;
        while(n!=0){
            y++;
            n=n/10;
        }
        n=copy;
        int result=0;
        while(n!=0){
            int x=n%10;
            result +=Math.pow(x,y);
            n=n/10;

        }
        if(copy==result){
            System.out.println("the given value is amstrong number");
        }else{
            System.out.println("the given value is not an amstrong number ");
        }
    }
}
