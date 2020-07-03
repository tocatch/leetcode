package com.wood.leetcode.array;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName MuchElements
 * @Description 多数元素 出现次数大于 n/2
 * @Author wood
 * @Date 2020/7/3 22:31
 **/
public class MuchElements {

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> statistical = new HashMap<>(nums.length);
        int t;
        for (int i = 0; i < nums.length; i++) {
            t = nums[i];
            if (statistical.get(t) != null) {
                statistical.put(t, statistical.get(t) + 1);
            } else {
                statistical.put(t, 1);
            }
        }
        Map.Entry<Integer, Integer> result = null;
        for (Map.Entry<Integer, Integer> entry : statistical.entrySet()) {
            if (result == null || entry.getValue() > result.getValue()) {
                result = entry;
            }
        }
        return result.getKey();
    }

    public static void main(String[] args) {
        int[] test = {1, 4, 2, 2, 4, 4, 2, 4, 8};
        System.out.println(majorityElement(test));
    }
}
