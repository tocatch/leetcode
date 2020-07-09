package com.wood.leetcode.array;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * @ClassName RepeatingElement2
 * @Description
 * @Author wood
 * @Date 2020/7/7 22:00
 **/
public class RepeatingElement3 {

    public static boolean containsNearbyDuplicate(int[] nums, int k, int t) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            Integer c = set.ceiling(nums[i]);
            if (c != null && c <= t + nums[i]) {
                return true;
            }
            Integer f = set.floor(nums[i]);
            if (f != null && nums[i] <= f + t) {
                return true;
            }
            set.add(nums[i]);
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] test = {1, 2, 3, 1};
        System.out.println(containsNearbyDuplicate(test, 3, 0));
    }
}
