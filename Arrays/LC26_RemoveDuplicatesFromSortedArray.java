class LC26_RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] != nums[i+1]){
                 nums[k] = nums[i + 1];
                 k++;

            }
        }

        return k;
    }
}


/*
======================== APPROACH ========================

1. First element is always unique.
2. Use k as the next write position.
3. Traverse the array.
4. If current and next elements are different:
      - Copy the new unique element to nums[k]
      - Increment k
5. Return k.

================== COMPLEXITY ANALYSIS ==================

Time Complexity  : O(n)
Space Complexity : O(1)

==================== INTERVIEW NOTES ====================

1. Classic Two Pointer problem.
2. Array is already sorted.
3. Duplicates appear adjacent to each other.
4. k acts as:
      - Unique element count
      - Next write position
5. No extra array is required.

==================== EDGE CASES ====================

1. Single element array
2. All elements same
3. No duplicates
4. All elements unique

*/
