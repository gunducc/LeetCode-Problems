class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start = 0;
        int end = matrix.length-1;
        int row = 0;
        while(start<=end){
            int mid = start+(end-start)/2;
            if (matrix[mid][0]<target){
                row = mid;
                start = mid+1;                
            }
            else if (matrix[mid][0]>target)
                end = mid-1;
            else
                return true;
        }
        
        start = 0;
        end = matrix[row].length-1;
        
        if (matrix[row][end]<target)
            return false;
        
        while (start<=end){
            int mid = start+(end-start)/2; 
            if (matrix[row][mid]<target){
                start = mid+1;                
            }
            else if (matrix[row][mid]>target)
                end = mid-1;
            else
                return true;
        }
        
        return false;
        
    }
}