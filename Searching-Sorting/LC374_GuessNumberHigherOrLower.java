// Mock class to support local compilation of the LeetCode template
class GuessGame {
    int guess(int num) {
        return 0; // LeetCode provides the actual implementation
    }
}

public class LC374_GuessNumberHigherOrLower extends GuessGame {

    public int guessNumber(int n) {

        // Search space from 1 to n
        int start = 1;
        int end = n;

        while (start <= end) {

            // Find middle guess
            int mid = start + (end - start) / 2;

            // Check current guess
            int result = guess(mid);

            // Correct number found
            if (result == 0)
                return mid;

            // Guess is too high
            if (result == -1)
                end = mid - 1;

            // Guess is too low
            else
                start = mid + 1;
        }

        // Fallback (should never happen)
        return -1;
    }
}

/*
======================== APPROACH ========================

1. Apply Binary Search on numbers from 1 to n.
2. Guess the middle number.
3. If guess() returns 0, return mid.
4. If guess() returns -1, search left half.
5. If guess() returns 1, search right half.
6. Repeat until number is found.

================== COMPLEXITY ANALYSIS ==================

Time Complexity  : O(log n)
Space Complexity : O(1)

==================== INTERVIEW NOTES ====================

1. Same pattern as LC704 Binary Search.
2. Uses API response instead of direct comparison.
3. Use overflow-safe mid calculation.
4. Classic Binary Search practice problem.

==================== EDGE CASES ====================

1. Number is 1
2. Number is n
3. Very large n
4. Answer found immediately

*/
