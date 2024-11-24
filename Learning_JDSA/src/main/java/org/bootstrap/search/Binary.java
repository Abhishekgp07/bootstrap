package org.bootstrap.search;

public class Binary {
    public static void main(String[] args) {
        int arr[] = {-11, 22, 33, 44, 55, 66, 77, 88, 99}; // Sorted array is mandatory for binary search
        int target = -11;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    static int binarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) { // Use a loop to iterate
            int mid = start + (end - start) / 2; // Prevent integer overflow

            if (target < arr[mid]) {
                end = mid - 1; // Move the end pointer to the left
            } else if (target > arr[mid]) {
                start = mid + 1; // Move the start pointer to the right
            }  else {
                return mid; // Return index when target is found
            }
        }

        return -1; // Return -1 if the target is not found
    }
}
