package com.example.leetcode;

/**
 * https://leetcode-cn.com/problems/uncrossed-lines/
 *
 * Created on May 21, 2021.
 *
 * @author hatakawas
 */
public class UncrossedLines {

    public static void main(String[] args) {
//        int[] nums1 = {2, 5, 1, 2, 5};
//        int[] nums2 = {10, 5, 2, 1, 5, 2};
        int[] nums1 = {1, 3, 7, 1, 7, 5};
        int[] nums2 = {1, 9, 2, 5, 1};
        int result = new UncrossedLines().maxUncrossedLines(nums1, nums2);
        System.out.println("result=" + result);
    }

    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int k = 0, count = 0;
        for (int value : nums1) {
            for (int j = k; j < nums2.length; j++) {
                if (value == nums2[j]) {
                    k = j + 1;
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
