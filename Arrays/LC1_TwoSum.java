class LC1_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i +1; j < nums.length; j++){
                if (nums[i] + nums[j] == target)
                    return new int[]{i,j};
                
            }
        }
      
        return null;
    }
}


/*
======================== APPROACH ========================

1. Traverse all possible pairs.
2. Fix the first element using index i.
3. Compare it with every element after it using j.
4. If nums[i] + nums[j] equals target,
   return their indices.
5. Since exactly one solution exists,
   return the indices immediately.

================== COMPLEXITY ANALYSIS ==================

Time Complexity  : O(n²)
Space Complexity : O(1)

==================== INTERVIEW NOTES ====================

1. Classic Interview Problem.
2. Brute Force checks every possible pair.
3. j starts from i + 1, avoiding duplicate checks.
4. Can be optimized to O(n) using HashMap.

==================== EDGE CASES ====================

1. Array of size 2
2. Negative numbers
3. Target formed by first and last element
4. Duplicate values

*/
