class Solution {
    public String intToRoman(int num) {
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        
        String roman = "";
        int index = 0;
        while(index < 13) {
            if(num >= values[index]) {
                roman += symbols[index];
                num -= values[index];
            } else {
                index++;
            }
        }
        
        return roman;
    }
}