// LC 1470 - Shuffle the Array
// https://leetcode.com/problems/shuffle-the-array/
// Difficulty: Easy
// Time: O(n) | Space: O(n)

class LC1470_ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[2 * i]     = nums[i];
            ans[2 * i + 1] = nums[i + n];
        }
        return ans;
    }
}
