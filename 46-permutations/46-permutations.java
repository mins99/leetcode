class Solution {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    public List<List<Integer>> permute(int[] nums) {
        permutations(nums, new int[nums.length], new boolean[nums.length], 0);
        return result;
    }
    
    public void permutations(int[] nums, int[] out, boolean[] visited, int depth) {
        if (depth == nums.length) {
            List<Integer> list = new ArrayList<>();
            for (int num : out) {
                list.add(num);
            }
            result.add(list);
            return;
        }
        for (int i=0; i<nums.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                out[depth] = nums[i];
                permutations(nums, out, visited, depth+1);
                visited[i] = false;
            }
        }
    }
}