package org.bootstrap.sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int arr[]= {-11,-22,-44,-66,-88,-99,-55};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
 }

        static  void bubbleSort(int[] arr){
        for(int i = 0 ;i<arr.length;i++){
            for(int j =1 ;j< arr.length-i;j++){
                if(arr[j]>=arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }

    }
}



//space complexity = O(1) no extra space required or new extra array.
//Time complexity O(N) best case
// O(n^2) sorted in the opposite
