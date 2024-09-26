package org.bootstrap.StringPrograms;

import java.util.*;
public class StringWOrdWise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string s1:");
        String s1=sc.nextLine();
        String s2=" ";
        for( char x:s1.toCharArray()){
            if( x ==' '){
                System.out.println(s1+" ");
            }else{
                s2=x+s2;
            }
        }
        System.out.println(s2);
    }

}
