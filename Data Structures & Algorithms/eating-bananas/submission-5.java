class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=Arrays.stream(piles).max().orElse(Integer.MIN_VALUE);
        int res=right;
        while(left<=right){
            int mid=left+(right-left)/2;
            double hours=0;
            for(int i:piles){
                hours=Math.ceil((double) i/mid)+hours;
            }
            if(hours<=h){
                res=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return res;
    }
}
