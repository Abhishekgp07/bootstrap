package org.bootstrap.sort;

import java.util.Scanner;
class bubbleSortAlgo {
    void bubbleSort(int arr[], int size) {
        int temp = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; i < size; i++) {
                if (arr[i] > arr[j]) {
                    arr[i] = temp;
                    arr[i] = arr[j];
                    temp = arr[j];
                }
            }
        }
        //after the sorting
        System.out.print("The sorted array:");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]+" ");
        }

    }

    class BubbleSort {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            //collecting the array size
            System.out.println("enter the size of the array:");
            int size = sc.nextInt();
            //creating the array
            int arr[] = new int[size];
            //collecting the array data
            System.out.println("enter the array element:");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            //array before sorting
            System.out.print("the array before sorting:");
            for(int i=0;i<size;i++){
                System.out.print(arr[i]+" ");
            }
            bubbleSortAlgo bs=new bubbleSortAlgo();
            bs.bubbleSort(arr,size);
        }

    }
}
