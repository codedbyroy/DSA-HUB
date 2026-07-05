class LC27_RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}

/*
======================== APPROACH ========================

1. Use k as the next write position.
2. Traverse the array.
3. If the current element is not equal to val:
      - Place it at nums[k]
      - Increment k
4. Return k.

================== COMPLEXITY ANALYSIS ==================

Time Complexity  : O(n)
Space Complexity : O(1)

==================== INTERVIEW NOTES ====================

1. Classic Two Pointer problem.
2. No extra array is used.
3. k acts as:
      - Remaining element count
      - Next write position
4. Similar pattern to LC26 and LC283.

==================== EDGE CASES ====================

1. All elements equal to val
2. No element equal to val
3. Single element array
4. Empty valid result

*/
