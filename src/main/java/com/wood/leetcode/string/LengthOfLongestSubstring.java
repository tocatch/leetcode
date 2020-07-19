package com.wood.leetcode.string;

import java.util.*;

/**
 * 无重复字符的最长子串
 */
public class LengthOfLongestSubstring {


    /**
     * 自己实现 存在问题，TreeSet存储字符的顺序是按照ASCII顺序存储，不满足此题的顺序
     *
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring(String s) {
        if (s.matches("\\s+") || s.length() == 1) {
            return 1;
        }
        int max = 0;
        char[] chars = s.toCharArray();
        TreeSet<Character> set = new TreeSet();
        SortedSet<Character> sortedSet = null;
        for (int i = 0; i < chars.length; i++) {
            if (set.add(chars[i])) {
                if (set.size() > max) {
                    max = set.size();
                }
                if (set.first().equals(chars[i])) {
                    set.remove(chars[i]);
                } else {
                    Iterator iterator = sortedSet.iterator();
                    if (iterator.hasNext()) {
                        set.remove(iterator.next());
                    }
                }
            }
            set.add(chars[i]);
        }
        if (max < set.size()) {
            return set.size();
        }
        return max;
    }

    public static int lengthOfLongestSubstring2(String s) {
        Set<Character> set = new HashSet<>();
        int n = s.length();
        int rk = -1, result = 0;
        for (int i = 0; i < n; i++) {
            if (i != 0) {
                set.remove(s.charAt(i - 1));
            }
            while (rk + 1 < n && !set.contains(s.charAt(rk + 1))) {
                set.add(s.charAt(rk + 1));
                rk++;
            }
            result = Math.max(result, rk - i + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "pw";
        System.out.println(lengthOfLongestSubstring2(s));
    }
}
