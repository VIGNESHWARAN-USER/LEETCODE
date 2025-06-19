class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE,  maxProfit = 0, n = prices.length;
        for(int i=0; i<n; i++)
        {
            min = Math.min(min, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i]-min);
        }
        return maxProfit;
    }
}