class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int p = 0;
        
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i]; 
            } 
            else  p = Math.max(p, prices[i] - min); 
        }
        
        return p;
    }
}
