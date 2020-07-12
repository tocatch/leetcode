package com.wood.leetcode.array;

/**
 * 非递减数列
 */
public class NonDecreasingSequence {


    public static boolean checkPossibility(int[] nums) {
        int change = 0;
        for (int i = 1; i < nums.length && change <= 1; i++) {
            if (nums[i] >= nums[i - 1]) {
                continue;
            }
            //num[i] < num[n-1]
            change++;
            if (i - 2 >= 0 && (nums[i] < nums[i - 2])) {
                //把num[i]的值增大到nums[i - 1]
                nums[i] = nums[i - 1];
            } else {
                //把nums[i - 1]的值减小到num[i]
                nums[i - 1] = nums[i];
            }
        }
        return change <= 1;
    }

    public static void main(String[] args) {
        int[] test = {4, 2, 1};
        System.out.println(checkPossibility(test));
    }
}
