class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> pq= new PriorityQueue<>((x,y) ->                Double.compare(x.distance,y.distance));
        int[][] res= new int[k][2];
        for(int[] i: points){
            Pair p= new Pair(i[0],i[1],distance(i[0],i[1]));
            pq.add(p);
        }
        for(int i=0;i<k;i++){
            Pair p= pq.poll();
            int[] arr= {p.x,p.y};
            res[i]=arr;
        }
        return res;
    }
    private double distance(int x,int y){
        return Math.sqrt((x*x)+(y*y));
    }

    class Pair{
        int x;
        int y;
        double distance;
        Pair(int x, int y, double distance){
            this.x=x;
            this.y=y;
            this.distance=distance;
        }
    }
}
