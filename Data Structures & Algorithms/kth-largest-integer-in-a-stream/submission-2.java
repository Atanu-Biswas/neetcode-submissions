class KthLargest {

    PriorityQueue<Integer> pq;

    public KthLargest(int k, int[] nums) {
        pq= new PriorityQueue<>();
        for(int i=0;i<k;i++){
            if(i<nums.length){
                pq.add(nums[i]);
            }else{
                pq.add(Integer.MIN_VALUE);
            }
        }
        for(int j=k;j<nums.length;j++){
            if(pq.peek()<nums[j]){
                pq.poll();
                pq.add(nums[j]);
            }
        }
    }
    
    public int add(int val) {
        if(pq.peek()<val){
            pq.poll();
            pq.add(val);
        }
        return pq.peek();
    }
}
