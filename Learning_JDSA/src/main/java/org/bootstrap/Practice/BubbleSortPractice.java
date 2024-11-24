package org.bootstrap.Practice;

import java.util.Arrays;

public class BubbleSortPractice {
    public static void main(String[] args) {
        int nums[] = {77,66,00,-11,-82,-94,-55,-66};
        bubble(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void bubble(int arr[]){
        for(int i = 0 ; i<arr.length ;i++){ //n-1
            for(int j = 1 ; j < arr.length -i ;j++){
                if(arr[j]<=arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                }
            }
        }

    }
}
