class LC42_TrappingRainWater {
    public int trap(int[] height) {

        // Stores the maximum height from the left for every index
        int[] leftMax = new int[height.length];

        // Stores the maximum height from the right for every index
        int[] rightMax = new int[height.length];

        // Left maximum for the first index is the first element itself
        leftMax[0] = height[0];

        // Right maximum for the last index is the last element itself
        rightMax[height.length - 1] = height[height.length - 1];

        // Build the rightMax array from right to left
        for (int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        int totalWater = 0;

        // Build leftMax while simultaneously calculating trapped water
        for (int i = 1; i < height.length - 1; i++) {

            // Maximum height seen so far from the left
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);

            // Water trapped at the current index
            int water = Math.min(leftMax[i], rightMax[i]) - height[i];

            // Negative water is not possible
            if (water < 0)
                water = 0;

            // Add current trapped water to the final answer
            totalWater += water;
        }

        return totalWater;
    }
}

/*
======================== APPROACH ========================

Problem:
Find the total amount of rain water trapped between bars.

-------------------- MY LEARNING JOURNEY --------------------

Version 1 (Brute Force)

Idea:
For every index:
1. Scan towards the left to find the tallest wall.
2. Scan towards the right to find the tallest wall.
3. Water at current index =
       min(leftMax, rightMax) - currentHeight
4. Ignore negative values.
5. Add water trapped at every index.

Observation:
- Correct solution.
- Left and right maximums were recalculated for every index.
- Lots of repeated work.

Time Complexity  : O(n²)
Space Complexity : O(1)

------------------------------------------------------------

Version 2 (Optimized - Submitted Solution)

Optimization Idea:
Instead of repeatedly searching for the tallest wall,

1. Precompute the tallest wall on the left for every index.
2. Precompute the tallest wall on the right for every index.
3. Use these precomputed values to calculate trapped water in O(1)
   for each position.

Water Formula:
    Water = min(leftMax[i], rightMax[i]) - height[i]

If water becomes negative, treat it as 0.

Finally, sum the trapped water for every index.

Time Complexity  : O(n)
Space Complexity : O(n)

-------------------- KEY OBSERVATIONS --------------------

1. Water can only be trapped if there is a boundary on both sides.
2. Water level is always limited by the shorter boundary.
3. Every index contributes independently to the final answer.
4. The answer is the SUM of water trapped at every index,
   not the maximum water trapped at a single position.
5. Precomputing left and right maximums removes repeated scans.

-------------------- PATTERN --------------------

Prefix Maximum Array
+
Suffix Maximum Array

-------------------- FUTURE OPTIMIZATION --------------------

This solution can be further optimized using the Two Pointer
approach.

Time Complexity  : O(n)
Space Complexity : O(1)

===========================================================
*/
