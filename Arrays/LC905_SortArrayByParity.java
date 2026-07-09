class LC905_SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {

        // Pointer from the beginning
        int s = 0;

        // Pointer from the end
        int e = nums.length - 1;

        while (s <= e) {

            // Even number is already in the correct position
            if (nums[s] % 2 == 0) {
                s++;
            }

            // Swap odd number with the element at the end
            else {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                e--;
            }
        }

        return nums;
    }
}

/*
======================== APPROACH ========================

1. Use two pointers from both ends.
2. If the left element is even, move the left pointer.
3. If the left element is odd, swap it with the right element.
4. Move the right pointer after every swap.
5. Continue until both pointers meet.

================== COMPLEXITY ANALYSIS ==================

Time Complexity  : O(n)
Space Complexity : O(1)

==================== INTERVIEW NOTES ====================

1. Classic Two Pointer partitioning problem.
2. Performs the rearrangement in-place.
3. Even numbers move to the front, odd numbers move to the back.
4. Order of elements is not preserved.

==================== EDGE CASES ====================

1. All elements are even.
2. All elements are odd.
3. Single element array.
4. Empty array.

*/
