package org.bootstrap.search;

public class BinaryPractice {
    public static void main(String[] args) {
        int num[] = {22,33,44,55,66,77,88,99};
        int target =  66;
        int ans = binarySearch(num,target,3, 5);
        System.out.println(ans);

    }
    static int binarySearch(int arr[],int target,int start,int end){
        if(start<=end){
            int mid = start +(end - start)/2;
            if(target<arr[mid]){
                end=mid - 1;
            } else if (target>arr[mid]) {
                start=mid + 1;

            }else{
                return mid;
        }
        }
        return -1;
    }
}
