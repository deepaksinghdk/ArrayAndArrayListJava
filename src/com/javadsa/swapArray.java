package com.javadsa;

import java.util.Arrays;

public class swapArray {
    public static void main(String[] args) {
        int[] arr ={10,20,30,40,50,530,660,630,6540,488,70,7,0};
        swap(arr,0,11);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr ,int index1 ,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
