package com.javadsa;

import java.util.Arrays;

public class searchIn2DArrays   {
    public static void main(String[] args) {
            int[][] arr = {
                    {1,3,4},
                    {6,8,0},
                    {12,14,16},
            };
            int target = 12;
        int[] ans = twoDsearch(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] twoDsearch (int[][] arr , int target){
        for (int i =0; i < arr.length;i++){
            for (int c=0; c < arr[i].length;c++){
                if(arr[i][c] == target){
                    return new int[]{i , c} ;
                }
            }
        }
    return new int[]{-1,-1};
    }
}
