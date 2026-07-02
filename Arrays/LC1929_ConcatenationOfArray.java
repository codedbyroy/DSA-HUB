// LC 1929 - Concatenation of Array
// https://leetcode.com/problems/concatenation-of-array/
// Difficulty: Easy
// Time: O(n) | Space: O(n)

class LC1929_ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }
}
