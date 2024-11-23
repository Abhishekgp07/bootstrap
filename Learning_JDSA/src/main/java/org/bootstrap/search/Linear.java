package org.bootstrap.search;

public class Linear {
    public static void main(String[] args) {
        int nums[] = {11,21,34,55,66,78,98,0,0};
        int target = 0;
        int ans = linearSeach(nums,target);
        System.out.println(ans );

    }

    //search in the array return the index of the element
    //otherwise it will return the -1;
       static int linearSeach(int arr[], int target){
           if(arr.length == 0){
               return  -1;
           }
            for(int i = 0;i<arr.length;i++){
                int element = arr[i];
                if(element == target){
                    return element;
                }
            }

            //This line will exceute if none of the return statments above have exceuted
            //hence the target not found
            return -1;

        }
    }

