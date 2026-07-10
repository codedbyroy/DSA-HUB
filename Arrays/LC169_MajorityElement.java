import java.util.Arrays;

class LC169_MajorityElement {
    public int majorityElement(int[] nums) {

        // Sort the array so equal elements become consecutive
        Arrays.sort(nums);

        // Count occurrences of the current element
        int count = 1;

        // Traverse the sorted array
        for (int i = 1; i < nums.length; i++) {

            // Same element continues the current streak
            if (nums[i] == nums[i - 1]) {
                count++;
            }

            // New element starts a new count
            else {
                count = 1;
            }

            // Majority element found
            if (count > nums.length / 2) {
                return nums[i];
            }
        }

        // Edge case: array contains only one element
        return nums[0];
    }
}

/*
======================== APPROACH ========================

1. Sort the array.
2. Traverse the sorted array.
3. Count consecutive occurrences of each element.
4. Reset the count when the element changes.
5. Return the element whose count becomes greater than n / 2.

================== COMPLEXITY ANALYSIS ==================

Time Complexity  : O(n log n)
Space Complexity : O(1)  // Ignoring sorting implementation

==================== INTERVIEW NOTES ====================

1. Sorting groups identical elements together.
2. Count the frequency of consecutive elements.
3. Simpler approach than HashMap.
4. Optimal solution uses Moore's Voting Algorithm (O(n), O(1)).

==================== EDGE CASES ====================

1. Single element array.
2. Majority element at the beginning.
3. Majority element at the end.
4. All elements are the same.

*/
