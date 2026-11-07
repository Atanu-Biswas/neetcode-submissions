class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left=0;
        int witdh=matrix[0].length;
        int right=(matrix.length*witdh)-1;
        while(left<=right){
            int mid=(left+right)/2;
            int midVal=matrix[mid/witdh][mid%witdh];
            if(midVal==target) return true;
            if(midVal<target) left=mid+1;
            if(midVal>target) right=mid-1;
        }
        return false;
    }
}
