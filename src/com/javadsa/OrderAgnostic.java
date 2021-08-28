package com.javadsa;

public class OrderAgnostic {
    public static void main(String[] args) {
        int[] arr = {2,21, 23, 34, 56, 76, 352};
        int target = 76;
        int ans = order(arr, target);
        System.out.println(ans);
    }

    static int order(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAcen = arr[start] < arr[end];
        while(start <= end){
        int mid = start + (end - start) / 2;
        if (isAcen) {
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        } else {
            if (target < arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        }
    return -1;
    }
}
