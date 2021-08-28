//Linear Search program in java
package com.javadsa;

public class LinearSearch {
    public static void main(String[] args) {
        //initialising the array
        int[] arrs ={32,34,4,55,743,98,72,01,37,54,71,376};
        //setting a target value to search for
        int target =32;
        //calling the funtion and storing it to a variable to print it
        int ans = searchAlgo(arrs , target);
        System.out.println(ans);

    }
    static int searchAlgo(int[] arr , int target){
        //checking if the array is not null
        if(arr.length == 0){
            return -1;
        }
        //for loop for irritating all the  value in the array one by one linearly
        for(int index = 0 ; index < arr.length ; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        //if the target is not present in the array
    return -1;
    }
}
