class Solution121 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0, left = 0;
        for(int right = 1; right < prices.length; right++) {
            if(prices[left] < prices[right]) {
                int profit = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit, profit);
            } else {
                left = right;
            }
        }
        return maxProfit;
    }
}