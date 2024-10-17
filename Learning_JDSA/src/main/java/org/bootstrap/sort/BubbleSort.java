package org.bootstrap.sort;

import java.util.Scanner;
class BubbleSortAlgo {
    public void bubblesort(int arr[], int size) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i; j < size; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("After the sorting :");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
     class BubbleSort{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the array:");
            int size=sc.nextInt();

            int arr[]=new int[size];

            System.out.println("Enter the array elements:");
            for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();
            }

            System.out.println("The array before the sorting:");
            for(int i=0;i<size;i++){
                System.out.println(arr[i]+" ");
            }
            System.out.println();
            BubbleSortAlgo bg= new BubbleSortAlgo();
            bg.bubblesort(arr,size);
        }

    }

