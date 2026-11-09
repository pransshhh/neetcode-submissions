class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0, n = prices.length;

        int l = 0, r = 1;

        while(l < n && r < n) {
            int curr = prices[r] - prices[l];

            if(curr <= 0) {
                l = r;
            }
            r++;

            profit = Math.max(profit, curr);
        }
        return profit;
    }
}
