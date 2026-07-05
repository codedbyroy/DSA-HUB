class LC1295_FindNumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int k = 0;
        int p = 0;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != 0) {
                nums[i] = nums[i] / 10;
                k++;
            }
            if (k % 2 == 0)
                p++;
            k = 0;
        }
        return p;
    }
}

/*
======================== APPROACH ========================

1. Traverse every number in the array.
2. Count its digits by repeatedly dividing by 10.
3. If digit count is even, increase count.
4. Return count.

================== COMPLEXITY ANALYSIS ==================

Time Complexity  : O(n * d)
Space Complexity : O(1)

where d = number of digits.

==================== INTERVIEW NOTES ====================

1. Uses digit extraction logic.
2. Division by 10 removes the last digit.
3. Useful foundation for number manipulation problems.
4. Avoid modifying the original array.

==================== EDGE CASES ====================

1. Single digit numbers
2. Two digit numbers
3. Large numbers
4. Array containing only odd digit counts

*/
