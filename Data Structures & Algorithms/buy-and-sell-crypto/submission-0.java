class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0, n = prices.length;

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                profit = Math.max(profit, prices[j] - prices[i]);
            }
        }

        return profit;
    }
}
