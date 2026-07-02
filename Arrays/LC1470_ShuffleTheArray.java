```java
public class LC1470_ShuffleTheArray {

    // ---------------- Optimal Approach ----------------
    static int[] shuffle(int[] nums, int n) {

        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[2 * i] = nums[i];
            ans[2 * i + 1] = nums[i + n];
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;

        int[] ans = shuffle(nums, n);

        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}

/*
======================== APPROACH ========================

Optimal:
1. Create a new array ans[] of size 2 * n.
2. Traverse only the first half of the array.
3. For every index i:
      x = nums[i]
      y = nums[i + n]
4. Place:
      x at index (2 * i)
      y at index (2 * i + 1)
5. Return ans[].

================== COMPLEXITY ANALYSIS ==================

Time Complexity  : O(n)
Reason           : Each pair is processed exactly once.

Space Complexity : O(n)
Reason           : A new result array is created.

==================== INTERVIEW NOTES ====================

1. Important Index Mapping problem.

2. Input Format:

      [x1, x2, x3, ..., xn, y1, y2, y3, ..., yn]

   Output Format:

      [x1, y1, x2, y2, x3, y3, ..., xn, yn]

3. Key Mapping:

      x -> 2 * i
      y -> 2 * i + 1

4. No need for even/odd checks.

5. Focus on mapping input indices
   to output indices.

==================== EDGE CASES ====================

1. n = 1
2. Duplicate values
3. Negative values
4. Maximum allowed input size

==================== FOLLOW-UP QUESTIONS ====================

1. Can this be solved in-place?
2. How would the mapping change for
   three groups instead of two?
3. What if x and y lengths are different?
*/
```
