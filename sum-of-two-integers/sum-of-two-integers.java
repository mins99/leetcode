class Solution {
    public int getSum(int a, int b) {
        int[] nums = {a, b};
        int sum = Arrays.stream(nums).sum();
        
        return sum;
    }
}