class LC121_BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {

        // Minimum buying price seen so far
        int buy = prices[0];

        // Maximum profit
        int max = 0;

        // Traverse all stock prices
        for (int i = 0; i < prices.length; i++) {

            // Update buying price if a lower price is found
            if (prices[i] < buy) {
                buy = prices[i];
            }

            // Calculate profit if sold today
            if (prices[i] - buy > max) {
                max = prices[i] - buy;
            }
        }

        return max;
    }
}

/*
======================== APPROACH ========================

1. Assume the first price is the buying price.
2. Traverse the array once.
3. Update the buying price whenever a lower price is found.
4. Calculate profit by selling on the current day.
5. Keep track of the maximum profit.

================== COMPLEXITY ANALYSIS ==================

Time Complexity  : O(n)
Space Complexity : O(1)

==================== INTERVIEW NOTES ====================

1. Greedy approach.
2. Single traversal.
3. Keep track of minimum buying price.
4. Update maximum profit on each iteration.

==================== EDGE CASES ====================

1. Prices always decrease.
2. Prices always increase.
3. Single element array.
4. Multiple equal prices.

*/
