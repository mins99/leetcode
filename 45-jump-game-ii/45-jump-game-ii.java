class Solution {
    public int jump(int[] nums) {
        int count = 0;
        int currIndex = 0;
        int nextIndex = 0;

        for (int i=0; i<nums.length-1; i++) {
            nextIndex = Math.max(nextIndex, i+nums[i]);

            if (i == currIndex) {
                count++;
                currIndex = nextIndex;
            }
        }

        return count;
    }
}