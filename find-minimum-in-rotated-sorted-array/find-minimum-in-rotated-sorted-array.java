class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        } else if(nums.length == 2) {
            return Math.min(nums[0], nums[1]);
        } else if(nums[0] < nums[nums.length - 1]) {
            return nums[0];
        }
        
        for(int i=0; i<nums.length-2; i++) {
            if(nums[i] > nums[i+1]) {
                return nums[i+1];
            }
        }
        
        return nums[nums.length-1];
    }
}