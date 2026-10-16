class Solution {
    public int largestRectangleArea(int[] heights) {
        
        if(heights.length==0) return -1;
        if(heights.length==1) return heights[0]; 
        
        Stack<Pair> stack=new Stack<>();
        int max=heights[0];
        
        Pair initialPair = new Pair(0,heights[0]);
        stack.push(initialPair);

        for(int i=1;i<heights.length;i++){
            int temp=i;
            
            while(!stack.isEmpty() && stack.peek().height >= heights[i]){
                temp=stack.peek().index; //2
                max=Integer.max(max,(i-temp)*stack.peek().height); //10
                stack.pop();
            }

            Pair p= new Pair(temp,heights[i]);
            stack.push(p);

        }

        int size=stack.size();

        for(int i=0;i<size;i++){
            max=Integer.max(max,(heights.length-stack.peek().index)*stack.peek().height);
            stack.pop();
        }

        return max;
    }
}
class Pair{
    int index;
    int height;
    
    Pair(int index,int height){
        this.index=index;
        this.height=height;
    }
}
