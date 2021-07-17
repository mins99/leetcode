class Solution {
    public int[] productExceptSelf(int[] nums) {
        int total = Arrays.stream(nums).reduce(1, (a,b) -> a*b);
        int zeroCnt = (int)Arrays.stream(nums).filter(a -> a == 0).count();
        int[] results = new int[nums.length];
        
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0) {
                if(zeroCnt == 1) {
                    results[i] = Arrays.stream(nums).filter(a -> a != 0).reduce(1, (a,b) -> a*b);
                } else {
                    results[i] = 0;
                }
            } else
                results[i] = total / nums[i];
        }
        
        return results;
    }
}