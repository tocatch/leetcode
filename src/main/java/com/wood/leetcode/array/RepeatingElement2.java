package com.wood.leetcode.array;

import java.util.*;

/**
 * @ClassName RepeatingElement2
 * @Description
 * @Author wood
 * @Date 2020/7/7 22:00
 **/
public class RepeatingElement2 {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        //是否存在重复元素
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    int s = i - j;
                    if (s != 0 && abs(s) <= k) {
                        return true;
                    }
                }
            }

        }
        return false;
    }

    public static int abs(int a) {
        return (a + (a >> 31)) ^ (a >> 31);
    }

    public static void main(String[] args) {

        int[] test = {1, 2, 3, 1, 2, 3, 2};
        System.out.println(containsNearbyDuplicate(test, 1));
    }
}
