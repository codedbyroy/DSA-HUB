class LC11_ContainerWithMostWater {
    public int maxArea(int[] height) {

        // Left pointer starts from the beginning
        int l = 0;

        // Right pointer starts from the end
        int r = height.length - 1;

        // Stores the maximum water area found so far
        int maxA = 0;

        // Continue until both pointers meet
        while (l < r) {

            // Width of the current container
            int w = r - l;

            // Height is limited by the shorter wall
            int h = Math.min(height[l], height[r]);

            // Calculate the current container area
            int A = w * h;

            // Move the pointer pointing to the shorter wall
            // since only that can potentially increase the area
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }

            // Update the maximum area found so far
            maxA = Math.max(A, maxA);
        }

        // Return the maximum water that can be contained
        return maxA;
    }
}

/*
======================== APPROACH ========================

1. Place one pointer at the beginning and one at the end.
2. Calculate:
      Area = Width × Min(Left Height, Right Height)
3. Update the maximum area.
4. Move the pointer with the shorter height.
5. Continue until both pointers meet.

================== COMPLEXITY ANALYSIS ==================

Time Complexity  : O(n)
Space Complexity : O(1)

==================== INTERVIEW NOTES =====================

Pattern Used : Two Pointers

Key Observation:
- Water level is limited by the shorter wall.
- Moving the taller wall only decreases the width while the
  shorter wall still limits the height.
- Moving the shorter wall gives a chance to find a taller wall,
  which may increase the overall area.

==================== EDGE CASES ==========================

1. Two elements only.
2. All heights are equal.
3. Strictly increasing heights.
4. Strictly decreasing heights.
5. Maximum area formed by inner walls.

*/
