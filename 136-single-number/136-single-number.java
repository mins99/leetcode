class Solution {
    public int singleNumber(int[] nums) {
        int[] checkNums = new int[nums.length];
        int index = 0;
        
        for(int i=0; i<nums.length; i++) {
            if(checkNums[i] == 1)
                continue;
            
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i] == nums[j]) {
                    checkNums[i] = 1;
                    checkNums[j] = 1;
                    break;
                }
            }
        }
        
        for(int i=0; i<nums.length; i++) {
            if(checkNums[i] == 0) {
                index = i;
                break;
            }
        }
        
        return nums[index];
    }
}