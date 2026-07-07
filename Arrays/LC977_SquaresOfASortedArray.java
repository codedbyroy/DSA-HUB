class LC977_SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {

        // Pointer at beginning
        int left = 0;

        // Pointer at end
        int right = nums.length - 1;

        // Result array
        int[] ans = new int[nums.length];

        // Fill answer from the back
        int k = nums.length - 1;

        while (left <= right) {

            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            // Larger square goes at current position
            if (leftSquare > rightSquare) {
                ans[k] = leftSquare;
                left++;
            } else {
                ans[k] = rightSquare;
                right--;
            }

            k--;
        }

        return ans;
    }
}

/*
======================== APPROACH ========================

1. Set two pointers: left at index 0 and right at index n - 1.
2. Initialize a result array of the same length.
3. Compare the squared values of elements at left and right pointers.
4. Place the larger squared value at the end of the result array (index k).
5. Move the pointer that had the larger squared value inwards (increment left or decrement right).
6. Decrement the result pointer k and repeat until left > right.

================== COMPLEXITY ANALYSIS ==================

Time Complexity  : O(n)
Space Complexity : O(n)

==================== INTERVIEW NOTES ====================

1. Classic Two Pointer problem.
2. Direct squaring and sorting would take O(n log n) time.
3. Two-pointer approach takes advantage of the sorted property of the input array.
4. Filling the result array from back to front is the key insight.

==================== EDGE CASES ====================

1. All non-negative numbers.
2. All negative numbers.
3. Mix of negative and positive numbers.
4. Single element array.

*/
