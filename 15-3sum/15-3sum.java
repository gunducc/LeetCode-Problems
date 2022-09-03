class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (nums.length==0)
            return result;
        for (int i=0; i<nums.length; i++){
            if(i == 0 || (i>0  && (nums[i] !=nums[i-1] )) ){
            int start = i+1;
            int end = nums.length-1;           
            while (start<end){
            int sum = nums[i]+nums[start]+nums[end];
            if (sum==0){
                result.add(Arrays.asList(nums[i],nums[start],nums[end]));
                start++;
                while(start < end && nums[start] ==nums[start-1] ) start ++;
                end--;
                while(start < end && nums[end] ==nums[end+1] ) end--;
            } else if (sum>0)
                end--;
            else
                start++;
            }
        }
        }
        return result;
    }
}
