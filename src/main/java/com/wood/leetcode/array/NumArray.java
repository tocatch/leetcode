package com.wood.leetcode.array;

/**
 * @ClassName:
 * @description: 给定一个整数数组  nums，求出数组从索引 i 到 j  (i ≤ j) 范围内元素的总和，包含 i,  j 两点。
 * <p>
 * 示例：
 * <p>
 * 给定 nums = [-2, 0, 3, -5, 2, -1]，求和函数为 sumRange()
 * <p>
 * sumRange(0, 2) -> 1
 * sumRange(2, 5) -> -1
 * sumRange(0, 5) -> -3
 * 说明:
 * <p>
 * 你可以假设数组不可变。
 * 会多次调用 sumRange 方法
 * @author: Wood
 * @create: 2020-07-19 22:37
 **/
public class NumArray {

    private static int[] target;

    public static int sumRange(int i, int j) {
        int sum = 0;
        for (int k = i; k < j + 1; k++) {
            sum += target[k];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] test = {-2, 0, 3, -5, 2, -1};
        target = test;
        System.out.println(sumRange(0, 5));
    }
}
