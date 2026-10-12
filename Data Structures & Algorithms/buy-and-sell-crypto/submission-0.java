class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int[] arr= new int[len];
        
        int rightMax= prices[len-1];
        arr[len-1] = rightMax;

        int res=0;

        for(int i=(len-2);i>=0;i--){
            rightMax=Math.max(prices[i+1],rightMax);
            arr[i]=rightMax;
        }

        for(int i=0;i<len;i++){
            res=Math.max(res,(arr[i]-prices[i]));
        }

        return res;
    }
}
 