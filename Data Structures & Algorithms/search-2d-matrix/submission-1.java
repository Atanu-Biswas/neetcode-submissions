class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int col=matrix[0].length; 
        int left=0;
        int right=(col*matrix.length)-1; 
        
        while(left<=right){
            int mid=(right+left)/2; 
            int midVal= matrix[mid/col][mid%col];
            if(midVal==target){
                return true;
            } else if(midVal>target){
                right=mid-1;
            } else {
                left=mid+1;
            }
        }

        return false;
    }
}
