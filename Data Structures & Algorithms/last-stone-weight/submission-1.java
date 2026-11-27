class Solution {
    public int lastStoneWeight(int[] stones) {

        if(stones.length==1){
            return stones[0];
        }

        PriorityQueue<Integer> pq= new PriorityQueue(Comparator.reverseOrder());

        for(int i: stones){
            pq.add(i);
        }

        while(pq.size()>1){
            int val1= pq.poll();
            int val2= pq.poll();
            pq.add(val1-val2);
        }
        return (pq.size()==0)?0:pq.peek();
    }
}
