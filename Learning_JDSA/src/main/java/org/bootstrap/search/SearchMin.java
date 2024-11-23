package org.bootstrap.search;

public class SearchMin {
    public static void main(String[] args) {
int [] nums = {22,33,44,-77,-66};
        System.out.println(MinSearch(nums));

    }
    static int MinSearch(int[] arr){
        int ans = arr[0];
        for (int i =0;i<arr.length;i++){
            if(arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
