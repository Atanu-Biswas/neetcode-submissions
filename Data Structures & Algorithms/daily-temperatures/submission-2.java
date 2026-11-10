class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Pair> stack= new Stack<>();
        int[] res = new int[temperatures.length];

        for(int i=0; i<temperatures.length;i++){
            while(!stack.isEmpty() && temperatures[i]>stack.peek().temp){
                Pair p=stack.pop();
                res[p.index]=i-p.index;
            }
            Pair p= new Pair();
            p.temp=temperatures[i];
            p.index=i;
            stack.push(p);
        }
        return res;
    }

    class Pair{
        int temp;
        int index;
    }
}
