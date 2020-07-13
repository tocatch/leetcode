package com.wood.leetcode.array;

/**
 * 中心索引
 */
public class PivotIndex {

    public static int pivotIndex(int[] nums) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            int sumL = 0;
            for (int j = 0; j < i; j++) {
                sumL += nums[j];
            }
            if (sumL * 2 + nums[i] == total) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] test = {1,7,3,6,5,6};
        System.out.println(pivotIndex(test));
    }
}
