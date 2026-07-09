class LC88_MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // Pointer for last position in nums1
        int k = m + n - 1;

        // Last valid element in nums1
        int e1 = m - 1;

        // Last element in nums2
        int e2 = n - 1;

        // Continue until all elements of nums2 are merged
        while (e2 >= 0) {

            // If nums1 is exhausted OR nums2 has a larger element
            if (e1 < 0 || nums1[e1] < nums2[e2]) {
                nums1[k] = nums2[e2];
                e2--;
            }

            // nums1 has the larger element
            else {
                nums1[k] = nums1[e1];
                e1--;
            }

            // Move to the next position from the back
            k--;
        }
    }
}

/*
======================== APPROACH ========================

1. Start from the end of both arrays.
2. Compare the last valid elements of nums1 and nums2.
3. Place the larger element at the end of nums1.
4. Move the corresponding pointer backward.
5. Repeat until all elements of nums2 are placed.

================== COMPLEXITY ANALYSIS ==================

Time Complexity  : O(m + n)
Space Complexity : O(1)

==================== INTERVIEW NOTES ====================

1. Classic Two Pointer problem.
2. Merge from the back to avoid overwriting values.
3. No extra array is required.
4. In-place merging.

==================== EDGE CASES ====================

1. nums1 has no valid elements.
2. nums2 has no elements.
3. All elements of nums1 are smaller.
4. All elements of nums2 are smaller.
5. Duplicate values.

*/
