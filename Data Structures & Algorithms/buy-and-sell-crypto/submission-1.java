class Solution {
    public int maxProfit(int[] prices) {

        if(prices.length==0) return -1;

        int minSoFar=prices[0];
        int maxProfit=0;
        
        for(int i:prices){

            maxProfit=Math.max(i-minSoFar,maxProfit);

            minSoFar=Math.min(minSoFar,i);
        }

        return maxProfit;
    }
}
 