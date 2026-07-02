```java id="9pn9mt"
public class LC1929_ConcatenationOfArray {

    // ---------------- Optimal Approach ----------------
    static int[] getConcatenation(int[] nums) {

        int[] ans = new int[2 * nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 1};

        int[] ans = getConcatenation(nums);

        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}

/*
======================== APPROACH ========================

1. Create a new array of size 2 * n.
2. Copy each element to its original position.
3. Copy the same element again at index (i + n).
4. Return the new array.

================== COMPLEXITY ANALYSIS ==================

Time Complexity  : O(n)
Space Complexity : O(n)

==================== INTERVIEW NOTES ====================

1. Basic Array Construction problem.
2. Tests understanding of indexing.
3. Creates a larger array using values from the original array.

==================== EDGE CASES ====================

1. Single element array
2. Duplicate elements
3. Negative numbers

*/
```
