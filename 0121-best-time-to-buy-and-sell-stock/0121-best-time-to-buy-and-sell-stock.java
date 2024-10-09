class Solution {
    public int maxProfit(int[] prices) {
        
        int profit = 0;
        int minVal = Integer.MAX_VALUE;
        
        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < minVal)
                minVal = prices[i];
            else if(prices[i] - minVal > profit)
                profit = prices[i] - minVal;
        }
        return profit;
        
    }
}