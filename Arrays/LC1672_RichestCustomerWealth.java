class LC1672_RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {

        int maxWealth = 0; // richest customer so far

        // Loop through each customer (row)
        for (int row = 0; row < accounts.length; row++) {

            int currentWealth = 0; // wealth of current customer

            // Loop through all accounts of that customer
            for (int col = 0; col < accounts[row].length; col++) {

                // Add money from each account
                currentWealth += accounts[row][col];
            }

            // Compare with richest customer seen so far
            if (currentWealth > maxWealth) {
                maxWealth = currentWealth;
            }
        }

        // Return richest customer's wealth
        return maxWealth;
    }
}
