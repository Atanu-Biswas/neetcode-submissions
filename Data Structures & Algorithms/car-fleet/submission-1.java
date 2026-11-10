class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        
        int length= position.length;
        int[][] matrix=new int[length][2];
        
        for(int i=0;i<length;i++){
            matrix[i][0]=position[i];
            matrix[i][1]=speed[i];
        }
        Arrays.sort(matrix,(a,b)->Integer.compare(a[0],b[0]));
        Stack<Double> stack= new Stack<>();
        
        for(int i=length-1;i>=0;i--){
            int pos= matrix[i][0];
            int spd= matrix[i][1];

            double timeToReach= (double) (target-pos)/spd;

            stack.push(timeToReach);

            if(stack.size()>1 && stack.peek()<=stack.get(stack.size()-2)){
                stack.pop();
            }

        }
        return stack.size();
    }
}
