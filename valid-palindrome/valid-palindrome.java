class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toUpperCase().replaceAll(" ", "");
        boolean flag = true;
        int end = str.length()-1;
        
        for(int start=0; start <= end; start++) {
            if(!Character.isLetterOrDigit(str.charAt(start))) {
                continue;
            }
            
            while(start <= end) {
                if(Character.isLetterOrDigit(str.charAt(end))) {
                    break;
                } else {
                    end--;
                }
            }
            
            if(str.charAt(start) != str.charAt(end)) {
                flag = false;
                break;
            } else {
            	end--;
            }
        }
        
        return flag;
    }
}