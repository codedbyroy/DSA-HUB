class LC53_MaximumSubarray {
    public int maxSubArray(int[] nums) {

        // Maximum subarray sum found so far
        int max = nums[0];

        // Best subarray sum ending at the current index
        int sum = nums[0];

        // Traverse the array starting from the second element
        for (int i = 1; i < nums.length; i++) {

            // Decide whether to start a new subarray
            // or continue the previous one
            sum = Math.max(nums[i], sum + nums[i]);

            // Update the overall maximum subarray sum
            if (max < sum) {
                max = sum;
            }
        }

        return max;
    }
}

/*
======================== APPROACH ========================

1. Start with the first element as both the current and maximum sum.
2. At each element, decide:
   - Start a new subarray from the current element.
   - Continue the previous subarray.
3. Choose the better option using Math.max().
4. Update the overall maximum sum.
5. Return the maximum subarray sum found.

================== COMPLEXITY ANALYSIS ==================

Time Complexity  : O(n)
Space Complexity : O(1)

==================== INTERVIEW NOTES =====================

1. Kadane's Algorithm.
2. Maintain the best subarray ending at the current index.
3. Track the best subarray seen so far.
4. Single traversal with constant extra space.

==================== EDGE CASES ==========================

1. All elements are negative.
2. Single element array.
3. All elements are positive.
4. Maximum subarray appears in the middle.

*/
