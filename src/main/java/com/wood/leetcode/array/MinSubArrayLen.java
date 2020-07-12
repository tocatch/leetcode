package com.wood.leetcode.array;


/**
 * @ClassName MinSubArrayLen
 * @Description
 * @Author wood
 * @Date 2020/7/9 22:44
 **/
public class MinSubArrayLen {

    /**
     * 参考双指针法
     *
     * @param s
     * @param nums
     * @return
     */
    public static int minSubArrayLen(int s, int[] nums) {
        int min = Integer.MAX_VALUE;
        Integer start = 0, end = 0, sum = 0;
        while (end < nums.length) {
            sum += nums[end];
            while (sum >= s) {
                min = min < (end - start + 1) ? min : (end - start + 1);
                sum = sum - nums[start];
                start++;
            }
            end++;
        }
        return min;
    }

    public static void main(String[] args) {
        int[] test = {2, 3, 1, 2, 4, 3};
        int k = 7;
        System.out.println(minSubArrayLen(k, test));
    }
}
