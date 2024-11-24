package org.bootstrap.Practice;

public class LinearPractice {
    public static void main(String[] args) {
        int arr[] = {11,22,33,44,55,66,77,88,99};
        int target = 66;
        int ans = linear(arr,target);
        System.out.println(ans);

    }
    static int linear(int arr[],int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i = 0;i<arr.length;i++){
            int element = arr[i];
            if(element == target){
                return i;
            }

        }
        return -1;
    }
}
