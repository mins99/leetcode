class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int i = 0;
        int j = height.length-1;
        //for(int i=0; i<height.length-1; i++) {
          //  for(int j=i+1; j<height.length; j++) {
        while (i<j) {
            int x = j-i;
            int y = Math.min(height[i], height[j]);
            max = Math.max(max, x*y);
            
            if (height[i] <= height[j]) {
                i++;
            } else if (height[i] > height[j]) {
                j--;
            }
        }
        
        return max;
    }
}