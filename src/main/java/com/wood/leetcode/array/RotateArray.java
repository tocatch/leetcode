package com.wood.leetcode.array;

import java.util.Arrays;

/**
 * @ClassName RotateArray
 * @Description 旋转数组
 * @Author wood
 * @Date 2020/7/3 21:23
 **/
public class RotateArray {


     /**
     * Reference understanding reading
     *
     * @param nums
     * @param k
     * @return int[]
     * @author wood
     */
    public static int[] rotateO1(int[] nums, int k) {
        int t, pre;
        int len = nums.length;
        for (int i = 0; i < k; i++) {
            pre = nums[len - k];
            for (int j = 0; j < len; j++) {
                t = nums[j];
                nums[j] = pre;
                pre = t;
            }
        }
        return nums;
    }


    /**
     * by myself
     *
     * @param nums
     * @param k
     * @return int[]
     * @author wood
     */
    public static int[] rotateOn(int[] nums, int k) {
        int[] result = new int[nums.length];
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (i < len - k) {
                result[i + k] = nums[i];
            } else {
                result[i - (len - k)] = nums[i];
            }
        }
        for (int i = 0; i < len; i++) {
            nums[i] = result[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] test = {0, 1, 2, 3, 4, 5, 6, 7};
        Arrays.stream(rotateOn(test, 2)).forEach(value -> System.out.println(value
        ));
    }
}
