package com.javadsa;

public class MaxWealthArray {
    public static void main(String[] args) {

    }
    static int maxWealth(int[][] acc){
        int ans = 0;
        for (int[] ints : acc) {
            int sum = 0;
            for (int anInt : ints) {
                sum = sum + anInt;
            }
            if (sum > ans) ans = sum;
        }
        return ans;
    }
}
