import java.util.Arrays;

class LC136_SingleNumber {
    public int singleNumber(int[] nums) {

        // Sort the array so duplicate elements become adjacent
        Arrays.sort(nums);

        // Pointer to traverse the array
        int i = 0;

        // Compare elements in pairs
        while (i < nums.length - 1) {

            // If the current element has its pair, skip both
            if (nums[i] == nums[i + 1]) {
                i += 2;
            }

            // Current element has no pair, so it is the single number
            else {
                return nums[i];
            }
        }

        // If all previous elements formed pairs,
        // the last element is the single number
        return nums[i];
    }
}

/*
======================== APPROACH ========================

1. Sort the array.
2. Traverse the array in pairs.
3. If two consecutive elements are equal, skip both.
4. If they are different, return the current element.
5. If every previous element formed a pair,
   the last element is the single number.

================== COMPLEXITY ANALYSIS ==================

Time Complexity  : O(n log n)
Space Complexity : O(1)   // Ignoring sorting implementation

==================== INTERVIEW NOTES =====================

1. Sorting places duplicate elements together.
2. Traverse two elements at a time.
3. First unmatched element is the answer.
4. Optimal solution uses Bit Manipulation (XOR) in O(n) time and O(1) space.

==================== EDGE CASES ==========================

1. Single element array.
2. Single number at the beginning.
3. Single number at the end.
4. Negative numbers.

*/
