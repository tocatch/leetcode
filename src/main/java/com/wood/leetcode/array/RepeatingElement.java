package com.wood.leetcode.array;

import java.util.*;

/**
 * @ClassName RepeatingElement
 * @Description
 * @Author wood
 * @Date 2020/7/6 23:00
 **/
public class RepeatingElement {

    public static boolean containsDuplicate(int[] nums) {
        List<Integer> exit = new ArrayList<>();
        for (int num : nums) {
            if (exit.contains(num)) {
                return true;
            }
            exit.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, 5, 5};
        System.out.println(containsDuplicate(test));
    }
}
