class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int right=0;
        
        for(int pile:piles){
            if(pile>right){
                right=pile;
            }
        }
        
        int left=0;

        int res=-1;

        while(left<=right){
            int mid=(left+right)/2;
        
            if(timeTaken(piles,mid)<=h){
                res=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }

        return res;
    }

    public int timeTaken(int[] piles,int k){
        double totalHours=0;
        if(k==0){
            return Integer.MAX_VALUE;
        }
        for(int pile:piles){
            totalHours=totalHours+((pile+k-1)/k);
        }
        return (int) totalHours;
    }
}
