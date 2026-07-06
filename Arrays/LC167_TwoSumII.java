class LC167_TwoSumII {
    public int[] twoSum(int[] numbers, int target) {

        // Two pointers at both ends
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {

            // Current sum
            int sum = numbers[left] + numbers[right];

            // Pair found
            if (sum == target)
                return new int[]{left + 1, right + 1};

            // Need a smaller sum
            if (sum > target)
                right--;

            // Need a larger sum
            else
                left++;
        }

        return null;
    }
}

/*
======================== APPROACH ========================

1. Place one pointer at the beginning.
2. Place another pointer at the end.
3. Calculate the current sum.
4. If sum equals target, return indices.
5. If sum is too large, move right pointer left.
6. If sum is too small, move left pointer right.

================== COMPLEXITY ANALYSIS ==================

Time Complexity  : O(n)
Space Complexity : O(1)

==================== INTERVIEW NOTES ====================

1. Array is already sorted.
2. Classic Two Pointer problem.
3. Better than O(n²) brute force.

*/
