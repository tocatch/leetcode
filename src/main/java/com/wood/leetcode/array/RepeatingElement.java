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
            if (contains(exit, num) >= 0) {
                return true;
            }
            exit.add(num);
        }
        return false;
    }

    private static int contains(List<Integer> list, int num) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == num) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, 2, 6};
        System.out.println(containsDuplicate(test));
    }
}
