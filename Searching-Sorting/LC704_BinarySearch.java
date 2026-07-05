class LC704_BinarySearch {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            // Target found
            if (nums[mid] == target) {
                return mid;
            }

            // Search in right half
            if (nums[mid] < target) {
                left = mid + 1;
            }

            // Search in left half
            else {
                right = mid - 1;
            }
        }

        // Target not found
        return -1;
    }
}

/*
======================== APPROACH ========================

1. Set left = 0 and right = n - 1.
2. Find the middle element.
3. If middle element equals target, return index.
4. If target is greater, search right half.
5. If target is smaller, search left half.
6. Repeat until left > right.
7. Return -1 if target is not found.

================== COMPLEXITY ANALYSIS ==================

Time Complexity  : O(log n)
Space Complexity : O(1)

==================== INTERVIEW NOTES ====================

1. Array must be sorted.
2. Each iteration removes half of the search space.
3. Much faster than Linear Search for large arrays.
4. Classic interview pattern.

==================== EDGE CASES ====================

1. Target at first index
2. Target at last index
3. Target not present
4. Single element array
5. Empty array

*/
