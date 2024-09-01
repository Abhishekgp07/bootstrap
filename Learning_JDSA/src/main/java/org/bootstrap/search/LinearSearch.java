package org.bootstrap.search;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int size=sc.nextInt();

        int a[]=new int[size];

        System.out.println("enter the array elements:");
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter the search elements");
        int k=sc.nextInt();

      linearSearch(a,k);
    }

    private static void linearSearch(int[] a, int k) {
        int pos=-1;
        for(int i=0;i<a.length;i++){
            if(a[i]==k){
                pos=i;
            }
        }
        if(pos>=0){
            System.out.println("the element found in the position:"+pos);
        }else{
            System.out.println("the element not found change the data");
        }
    }
}
