// User function Template for Java

class Solution {
    public int maximumProfit(int prices[]) {
        int buy=prices[0];
        int profit=0;
        int maxProfit=0;
        for(int i=1;i<prices.length;i++){
            buy=Math.min(buy,prices[i]);
            profit=Math.max(profit,prices[i]-buy);
            maxProfit=Math.max(profit,maxProfit);
        }
        return maxProfit;
    }
}