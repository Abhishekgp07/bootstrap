package org.bootstrap.search;

public class SearchInRange {
    public static void main(String[] args) {
        int nums[]={22,33,55,66,77,88};
        int target = 55;
        System.out.println(RangeSearch(nums,target,3,1));

    }
    static int RangeSearch(int arr[],int target,int start, int end){
        if(arr.length ==0){
            return -1;
        }
        for(int i=start;i<=end;i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
}
