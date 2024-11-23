package org.bootstrap.search;

public class LinearPractice {
    public static void main(String[] args) {
        int nums[] = {22,33,44,55,66,77,88,99};
        int target = 22;
        int ans = linearSearch(nums,target);
        System.out.println(ans);
    }
   static  int linearSearch(int arr[],int target){
        if(arr.length==0){
            return  -1;
        }
        for(int i = 0 ; i< arr.length;i++){
            int element = arr[i];
            if(element == target){
                return  arr[i];
            }
        }
        return  -1;
   }
}
