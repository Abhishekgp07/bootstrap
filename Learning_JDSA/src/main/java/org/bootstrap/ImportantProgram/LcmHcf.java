package org.bootstrap.ImportantProgram;

import java.util.Scanner;
public class LcmHcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a:");
        int a = sc.nextInt();
        System.out.println("enter the value of b:");
        int b = sc.nextInt();
        int hcf=0;
        int lcm=0;
        for(int i=1;i<=b;i++){
            if(a%i==0 && b%i==0){
                hcf=i;
                lcm=a*b/hcf;
            }

        }
        System.out.println("the hcf of a & b is:"+hcf);
        System.out.println("the lcm of the a & b is:"+lcm);

    }

}
