package com.wood.leetcode.array;

/**
 * @ClassName SearchRotationArray
 * @Description 搜索旋转数组
 * @Author wood
 * @Date 2020/7/2 22:39
 **/
public class SearchRotationArray {
    /**
     * 核心要求 O(log(n))
     * 关键思想：二分查找，满足O(log(n))
     *
     * @param nums
     * @param target
     * @return int
     * @author wood
     */
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[start] <= nums[mid]) {
                // start <= mid 证明start->mid之间有序
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                // start > mid  证明mid -> end之间有序
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] test = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(search(test, 6));
    }
}
