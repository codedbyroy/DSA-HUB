class LC69_SqrtX {
    public int mySqrt(int x) {
        if (x < 2)
           return x;
        int left = 1;
        int right = x / 2;
        while (left <= right) {

            int mid = left + (right - left) / 2;

            if ((long) mid * mid == x)
                 return mid;

            if ((long) mid * mid < (long) x)
                left = mid + 1;
                
            else right = mid - 1;    
        }
        if (left != 0)
          return left - 1;
        else return left;   
    }
}

/*
======================== APPROACH ========================

1. Use Binary Search to find the square root.
2. Initialize search range: left = 1, right = x / 2.
3. Calculate mid and check if mid * mid is equal to, less than, or greater than x.
4. Use long cast to prevent integer overflow during mid * mid.
5. If target is not found exactly, return left - 1.

================== COMPLEXITY ANALYSIS ==================

Time Complexity  : O(log x)
Space Complexity : O(1)

==================== INTERVIEW NOTES ====================

1. Classic Binary Search application on value range rather than indices.
2. Integer overflow is a common trap (avoided using long casting).
3. Search range is optimized to x / 2 because for x >= 4, sqrt(x) <= x / 2.

==================== EDGE CASES ====================

1. x = 0 or x = 1 (handled at beginning).
2. Large values of x causing integer overflow.
3. Non-perfect squares.

*/
