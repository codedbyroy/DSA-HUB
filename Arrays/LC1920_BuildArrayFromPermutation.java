```java
public class LC1920_BuildArrayFromPermutation {

    // ---------------- Optimal Approach ----------------
    static int[] buildArray(int[] nums) {

        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {0, 2, 1, 5, 3, 4};

        int[] ans = buildArray(nums);

        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}

/*
======================== APPROACH ========================

Optimal:
1. Create a new array ans[] of the same size.
2. Traverse the array from index 0 to n-1.
3. For each index i:
      ans[i] = nums[nums[i]]
4. Return the resulting array.

================== COMPLEXITY ANALYSIS ==================

Time Complexity  : O(n)
Reason           : Each element is processed exactly once.

Space Complexity : O(n)
Reason           : A new array of size n is created.

==================== INTERVIEW NOTES ====================

1. This problem introduces Index Chasing.

      i -> nums[i] -> nums[nums[i]]

2. nums[i] is used as an index to access another element.

3. The given array is a permutation:
   Values range from 0 to n-1.

4. Understanding nested indexing is the key concept.

==================== EDGE CASES ====================

1. Single element array
2. Identity permutation
3. Reverse permutation
4. Maximum allowed input size

==================== FOLLOW-UP QUESTIONS ====================

1. Can it be solved in-place?
2. Why is the permutation property important?
3. What happens if duplicate values exist?
*/
```
