class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 1;
        
        if(s.equals(""))
            return 0;
        
        String tmpStr = "";
        for(int i=0; i<s.length(); i++) {
            int index = tmpStr.indexOf(s.charAt(i));
            if(index == -1) {
                tmpStr += s.charAt(i);
            } else {
                if(max < tmpStr.length()) {
                    max = tmpStr.length();
                }
                tmpStr = tmpStr.substring(index+1) + s.charAt(i);
            }
        }
        
        if(max < tmpStr.length()) {
            max = tmpStr.length();
        }
        
        return max;
    }
}