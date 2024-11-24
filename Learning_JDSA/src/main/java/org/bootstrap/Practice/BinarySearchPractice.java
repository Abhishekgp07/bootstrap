package org.bootstrap.Practice;

public class BinarySearchPractice {
    public static void main(String[] args) {
      int nums[] ={22,44,55,66,77,88,99,00,77,66};
      int target = 77;
      int ans = binary(nums,target);
        System.out.println(ans);

    }
    static  int  binary(int arr[],int target){
        int start = 0;
        int end = arr.length-1;
        while(start<= end){
            int mid = start + (end - start) /2;
            if(target<arr[mid]) {
                end = mid -1;
            } else if (target>arr[mid]) {
                start = mid+1;

            }else{
                return mid;
            }
        }
        return -1;
    }
}
