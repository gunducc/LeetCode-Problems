class Solution {
    
    public int[] searchRange(int[] nums, int target) {
        int begin = 0;
        int end = nums.length-1;
        int[] result = new int[2];
        int first = -1;
        int second = -1;
        
        while (begin<=end){
            int mid = begin+(end-begin)/2;
            if (nums[mid]>target){
                 end = mid-1;
            } else if (nums[mid]<target){
                begin = mid+1;
            } else {
                first = mid;
                end = mid-1;
            }            
        }
        
        begin = 0;
        end = nums.length-1;
        
        while (begin<=end){
            int mid = begin+(end-begin)/2;
            if (nums[mid]>target){
                 end = mid-1;
            } else if (nums[mid]<target){
                begin = mid+1;
            } else {
                second = mid;
                begin = mid+1;
            }            
        }
        
        result[0] = first;
        result[1] = second;
        
        return result;
    }
    

    
}