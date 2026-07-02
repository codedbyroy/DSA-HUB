// LC 1920 - Build Array from Permutation
// https://leetcode.com/problems/build-array-from-permutation/
// Difficulty: Easy
// Time: O(n) | Space: O(n)

class LC1920_BuildArrayFromPermutation {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
