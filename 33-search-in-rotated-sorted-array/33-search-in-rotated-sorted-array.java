class Solution {
    public int search(int[] nums, int target) {
        
        int pivot = findPivot(nums, nums[nums.length-1]);
        int start = 0;
        int end = nums.length-1;
        
        if (target>nums[end])
            end = pivot;
        else if (target<nums[end])
            start = pivot;
        else
            return end;
        
        while (start<=end){
            int mid = start+(end-start)/2;
            if (nums[mid]<target)
                start = mid+1;
            else if (nums[mid]>target)
                end = mid-1;
            else
                return mid;
            
        }
        return -1;

    }
    
    public int findPivot(int[] nums, int last){
        if (nums.length==1)
            return 0;
        if (nums[nums.length-1]>nums[0])
            return 0;
        int start = 0;
        int end = nums.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (mid>0 && nums[mid]<nums[mid-1]){
                return mid;
            }
            if (nums[mid]>last){
                start = mid + 1;
            } else {
                end = mid-1;
            }
        }
        return 0;
    }
    
}