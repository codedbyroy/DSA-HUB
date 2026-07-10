import java.util.Arrays;

class LC268_MissingNumber {
    public int missingNumber(int[] nums) {

        // Sort the array so numbers are in ascending order
        Arrays.sort(nums);

        // Pointer to traverse the array
        int i = 0;

        // Compare each element with its expected index
        while (i < nums.length) {

            // Correct number found at current index
            if (nums[i] == i) {
                i++;
            }

            // Mismatch found, current index is the missing number
            else {
                return i;
            }
        }

        // If all indices match, the missing number is n
        return nums.length;
    }
}

/*
======================== APPROACH ========================

1. Sort the array.
2. Traverse the array from index 0.
3. Compare each element with its index.
4. If a mismatch is found, return the current index.
5. If every index matches, the missing number is nums.length.

================== COMPLEXITY ANALYSIS ==================

Time Complexity  : O(n log n)
Space Complexity : O(1)   // Ignoring sorting implementation

==================== INTERVIEW NOTES =====================

1. Sorting places numbers in their expected order.
2. First index where value != index is the missing number.
3. If no mismatch exists, the missing number is the largest value (n).
4. Optimal solutions use either Gauss Sum or XOR in O(n) time.

==================== EDGE CASES ==========================

1. Missing number is 0.
2. Missing number is n.
3. Single element array.
4. Array already starts from 0.

*/
