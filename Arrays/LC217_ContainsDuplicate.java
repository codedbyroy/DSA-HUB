import java.util.HashSet;

class LC217_ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}

/*
======================== APPROACH ========================

1. Use a HashSet to track elements we've seen so far.
2. Traverse through the array.
3. For each element:
      - If it already exists in the set, we found a duplicate -> return true.
      - Otherwise, add the element to the set.
4. If the loop completes without finding any duplicate, return false.

================== COMPLEXITY ANALYSIS ==================

Time Complexity  : O(n)
Space Complexity : O(n)

==================== INTERVIEW NOTES ====================

1. Classic hashing problem.
2. Trade space for time: O(n) space allows O(n) time complexity.
3. Brute force approach checks all pairs in O(n²) time.
4. Sorting the array first takes O(n log n) time and O(1) space.

==================== EDGE CASES ====================

1. Empty or single element array.
2. All unique elements.
3. All identical elements.
4. Duplicates at the very end.

*/
