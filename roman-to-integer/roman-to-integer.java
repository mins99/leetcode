class Solution {
    public int romanToInt(String s) {
        Map<String, Integer> symbol = new HashMap<String, Integer>();
        symbol.put("I", 1);
        symbol.put("IV", 4);
        symbol.put("V", 5);
        symbol.put("IX", 9);
        symbol.put("X", 10);
        symbol.put("XL", 40);
        symbol.put("L", 50);
        symbol.put("XC", 90);
        symbol.put("C", 100);
        symbol.put("CD", 400);
        symbol.put("D", 500);
        symbol.put("CM", 900);
        symbol.put("M", 1000);
        
        int answer = 0;
        int index = 0;
        
        while(true) {
            if(index == s.length()) {
                break;
            } else if(index == s.length()-1) {
                String ss = s.substring(index, index+1);
                answer += symbol.get(ss);
                break;
            } else {
                String ss = s.substring(index, index+2);
                if(symbol.containsKey(ss)) {
                    answer += symbol.get(ss);
                    index += 2;
                } else {
                    ss = s.substring(index, index+1);
                    answer += symbol.get(ss);
                    index += 1;
                }
            }
        }
        
        return answer;
    }
}