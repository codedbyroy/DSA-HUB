class LC283_MoveZeroes {
    public void moveZeroes(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[k] = nums[i];
                k++;
            }
        }
        for (int i = k; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}

/*
======================== APPROACH ========================

1. Use k as the next write position.
2. Traverse the array.
3. If the current element is non-zero:
      - Place it at nums[k]
      - Increment k
4. After all non-zero elements are placed,
   fill the remaining positions with 0.

================== COMPLEXITY ANALYSIS ==================

Time Complexity  : O(n)
Space Complexity : O(1)

==================== INTERVIEW NOTES ====================

1. Classic Two Pointer problem.
2. No extra array is used.
3. Relative order of non-zero elements is preserved.
4. k acts as the next write position.

==================== EDGE CASES ====================

1. All zeros
2. No zeros
3. Single element array
4. Zeros at the beginning
5. Zeros at the end

*/
