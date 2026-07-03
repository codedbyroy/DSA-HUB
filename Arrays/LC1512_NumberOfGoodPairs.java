public class LC1512_NumberOfGoodPairs {

    // ---------------- Optimal Approach ----------------
    static int numIdenticalPairs(int[] nums) {

        int count = 0;

        // Pick the first element of the pair
        for (int i = 0; i < nums.length - 1; i++) {

            // Compare it with all elements after it
            for (int j = i + 1; j < nums.length; j++) {

                // Good Pair Condition:
                // nums[i] == nums[j] and i < j
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1, 1, 3};

        System.out.println("Number of Good Pairs: "
                + numIdenticalPairs(nums));
    }
}

/*
======================== APPROACH ========================

1. Traverse all possible pairs.
2. Fix the first element using index i.
3. Compare it with every element after it using j.
4. If nums[i] == nums[j], increment count.
5. Return total count.

================== COMPLEXITY ANALYSIS ==================

Time Complexity  : O(n²)
Space Complexity : O(1)

==================== INTERVIEW NOTES ====================

1. Classic Pair Counting problem.
2. j starts from i + 1, so i < j is automatically satisfied.
3. Brute Force approach checks every possible pair.
4. Can be optimized using HashMap to O(n).

==================== EDGE CASES ====================

1. Single element array
2. No good pairs
3. All elements same
4. Duplicate values at multiple positions

*/
