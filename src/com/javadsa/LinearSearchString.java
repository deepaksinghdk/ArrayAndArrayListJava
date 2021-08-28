package com.javadsa;

import java.sql.SQLOutput;

public class LinearSearchString {
    public static void main(String[] args) {
        int[] arr = {18,12,-7,3,14,28};
        int tar = 3;
        System.out.println(strSearch(arr ,tar ,1,4));

    }
    static int strSearch(int[] arr,int tar,int startRange,int endRange){
        for (int i = startRange;i<= endRange;i++){
            if(arr[i] == tar){
                return i;
            }

        }
        return -1;
    }
}
