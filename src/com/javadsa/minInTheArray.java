package com.javadsa;

public class minInTheArray {
    public static void main(String[] args) {
        int[] arr = {29,10,28,7,11,34,2,89,1,100};
        System.out.println(minSearch(arr));

    }
    static int minSearch(int[] arr){
        int min = arr[0];
        int minIndex =0;
        for (int i =0 ; i < arr.length;i++){
            if (arr[i] < min){
                min = arr[i];
                minIndex = i ;

            }
        }
        return minIndex;
    }
}
