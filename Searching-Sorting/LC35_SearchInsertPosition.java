class LC35_SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}

/*
======================== APPROACH ========================

1. Apply Binary Search on the sorted array.
2. If target is found, return its index.
3. If target is greater than nums[mid],
   search the right half.
4. If target is smaller than nums[mid],
   search the left half.
5. When the loop ends, target is not present.
6. left will point to the correct insertion position.

================== COMPLEXITY ANALYSIS ==================

Time Complexity  : O(log n)
Space Complexity : O(1)

==================== INTERVIEW NOTES ====================

1. Classic Binary Search variation.
2. Array must be sorted.
3. If target is not found:
      left gives the insertion index.
4. Important Binary Search pattern.

==================== EDGE CASES ====================

1. Target present in array.
2. Target smaller than all elements.
3. Target greater than all elements.
4. Single element array.
5. Empty insertion at beginning/end.

*/
