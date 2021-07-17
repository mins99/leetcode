class Solution {
    public boolean containsDuplicate(int[] nums) {
        int[] array = IntStream.of(nums).distinct().toArray();
        if(nums.length != array.length)
            return true;
        else
            return false;
    }
}