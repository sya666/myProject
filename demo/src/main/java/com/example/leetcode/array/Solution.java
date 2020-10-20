package com.example.leetcode.array;

/**
 * @author sya
 * @Description
 * @date 2020-10-09 11:15
 */
public class Solution {

    /**
     * 给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。
     * 请返回 nums 的动态和。
     * 输入：nums = [1,2,3,4]
     * 输出：[1,3,6,10]
     * 解释：动态和计算过程为 [1, 1+2, 1+2+3, 1+2+3+4] 。
     *
     * 输入：nums = [1,1,1,1,1]
     * 输出：[1,2,3,4,5]
     * 解释：动态和计算过程为 [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1] 。
     */

    public static  int[] sunningSum(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            if(i > 0){
                nums[i] += nums[i-1];
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5};
        int[] ints = sunningSum(array);

        System.out.println(ints);
    }

}
