class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        if(nums.length<2) return nums;
        
        int left=0;
        int right=0;
        int index=0;

        Deque<Integer> q = new ArrayDeque<>();

        int[] res=new int[nums.length-k+1];

        while(right<nums.length){

            while(!q.isEmpty() &&
                nums[q.peekLast()]<nums[right]){
                    q.pollLast();
            }

            q.offerLast(right);

            if(q.peekFirst()<left){
                q.pollFirst();
            }

            if(right-left+1==k){
                res[index++]=nums[q.peekFirst()];
                left++;
            }
            right++;
        }
        return res;
        
    }
}
