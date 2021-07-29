class Solution {
    public boolean isValid(String s) {
        char[] brackets = new char[s.length()];
        int index = 0;
        
        if(s.length() % 2 != 0)
            return false;
        
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                brackets[index++] = s.charAt(i);
            } else {
                if(index <= 0)
                    return false;
                
                if(s.charAt(i) == ')' && brackets[--index] == '(') {
                    continue;
                } else if(s.charAt(i) == '}' && brackets[--index] == '{') {
                    continue;
                } else if(s.charAt(i) == ']' && brackets[--index] == '[') {
                    continue;
                } else {
                    return false;
                }
            }
        }
        
        if(index != 0) {
            return false;
        }
        
        return true;
    }
}