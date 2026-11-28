class Solution {
    public int leastInterval(char[] tasks, int n) {
      int[] arr= new int[26];
      PriorityQueue<Integer> pq= new PriorityQueue(Comparator.reverseOrder());
      
      for(char task: tasks){
        arr[task-'A']++;
      }

      for(int i: arr){
        if(i>0){
            pq.add(i);
        }
      }
     Queue<Pair> q= new LinkedList<>();
     int time=0;
        while(q.size()>0 || pq.size()>0){
            time++;
            if(pq.size()>0){
                int count= pq.poll()-1;
                if(count>0){
                    q.add(new Pair(count,time+n));
                }
            }else{
                time=q.peek().time;
            }
            if(q.size()>0 && q.peek().time==time){
                pq.add(q.poll().count);
            }
        }
        return time;
    }
    class Pair{
        int count;
        int time;
        Pair(int count, int time){
            this.count=count;
            this.time=time;
        }
    }
}
