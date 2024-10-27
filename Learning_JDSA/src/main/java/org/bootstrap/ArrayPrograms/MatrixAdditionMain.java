package org.bootstrap.ArrayPrograms;


import java.util.Scanner;

public class MatrixAdditionMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n = sc.nextInt();
        int mat1[][]=new int[n][n];
        int mat2[][]=new int[n][n];

        System.out.println("enter the array-1 data");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat1[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the array-2 data");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat2[i][j]=sc.nextInt();
            }
        }
        int res[][]=new int[n][n];


        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                res[i][j]= mat1[i][j]+mat2[i][j];
            }
        }
        System.out.println("The resultant is ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println(res[i][j]);
            }
        }

    }
}
