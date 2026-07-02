```java
public class LC1480_RunningSumOf1dArray {

    // ---------------- Optimal Approach ----------------
    static int[] runningSum(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }

        return nums;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};

        int[] ans = runningSum(nums);

        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}

/*
======================== APPROACH ========================

1. Start from index 1.
2. Add the previous running sum to the current element.
3. Continue until the end of the array.
4. Return the modified array.

================== COMPLEXITY ANALYSIS ==================

Time Complexity  : O(n)
Space Complexity : O(1)

==================== INTERVIEW NOTES ====================

1. Basic Prefix Sum problem.
2. Solved in-place without extra array.
3. Each element stores the sum up to that index.

==================== EDGE CASES ====================

1. Single element array
2. Negative numbers
3. All zeros

*/
```
