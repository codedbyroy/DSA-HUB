import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class LC15_3Sum {
    public List<List<Integer>> threeSum(int[] nums) {

        // Stores all unique triplets
        List<List<Integer>> ans = new ArrayList<>();

        // Sort the array to apply the Two Pointer approach
        Arrays.sort(nums);

        // Fix the first element of every possible triplet
        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate starting elements
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            // Two pointers for the remaining two numbers
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                // Current triplet sum
                int sum = nums[i] + nums[left] + nums[right];

                // Need a larger sum
                if (sum < 0) {
                    left++;
                }

                // Need a smaller sum
                else if (sum > 0) {
                    right--;
                }

                // Valid triplet found
                else {

                    // Store the triplet
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicate values on the left
                    while (left < right && nums[left] == nums[left + 1])
                        left++;

                    // Skip duplicate values on the right
                    while (left < right && nums[right] == nums[right - 1])
                        right--;

                    // Move both pointers
                    left++;
                    right--;
                }
            }
        }

        // Return all unique triplets
        return ans;
    }
}

/*
======================== APPROACH ========================

Version 1 (My Initial Idea)

1. Use three nested loops.
2. Check every possible triplet.
3. If the sum equals 0, store the triplet.
4. Continue until every combination is checked.

Problem:
- Same triplet can be generated multiple times.
- Time Complexity : O(n³)

----------------------------------------------------------

Version 2 (Final Optimized Solution)

1. Sort the array.
2. Fix one element using a for loop.
3. Use Two Pointers to find the remaining two elements.
4. Compare the sum:
      - sum < 0  → Move left pointer.
      - sum > 0  → Move right pointer.
      - sum == 0 → Store the triplet.
5. Skip duplicate values for:
      - Fixed element (i)
      - Left pointer
      - Right pointer
6. Continue until all unique triplets are explored.

================== COMPLEXITY ANALYSIS ==================

Time Complexity  : O(n²)

- Sorting          : O(n log n)
- Two Pointer Scan : O(n²)

Overall            : O(n²)

Space Complexity : O(1)
(Ignoring the output list.)

==================== INTERVIEW NOTES =====================

Pattern Used:
Sorting + Two Pointers

Key Observations:

1. Sorting allows the Two Pointer technique.
2. Fixing one element reduces the problem to finding
   two numbers with a target sum.
3. Duplicate values must be skipped to avoid repeated triplets.
4. Two Pointers replace two nested loops, reducing
   the complexity from O(n³) to O(n²).

==================== LEARNING JOURNEY ====================

Brute Force (Three Nested Loops)
        ↓
Observed Duplicate Triplets
        ↓
Sorted the Array
        ↓
Fixed One Element
        ↓
Applied Two Pointer Search
        ↓
Skipped Duplicate Values
        ↓
Final Optimal O(n²) Solution

==========================================================
*/
