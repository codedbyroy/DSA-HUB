// LC 1480 - Running Sum of 1d Array
// https://leetcode.com/problems/running-sum-of-1d-array/
// Difficulty: Easy
// Time: O(n) | Space: O(1) — modifying input in-place

// Pattern: Prefix Sum
// Key idea: Each element becomes the sum of all elements before it (inclusive).
// runningSum[i] = nums[0] + nums[1] + ... + nums[i]
// Since we only need the previous value, we can do this in-place.

class LC1480_RunningSumOf1dArray {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
