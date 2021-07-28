class Solution {
    public int characterReplacement(String s, int k) {
        int maxCnt = 0;
        int maxLength = 0;
        int start = 0;
        int[] alphabet = new int[26];   // 알파벳의 수 만큼 생성
        
        for(int end=0; end<s.length(); end++) {
            alphabet[s.charAt(end)-'A']++;
            
            maxCnt = Math.max(alphabet[s.charAt(end)-'A'], maxCnt);     // 현재 문자열 중 제일 많이 있는 알파벳의 수
            
            while(end + 1 - start - maxCnt > k) {   // 문자열 길이 - 최대 알파벳 수 > k 이면 start를 오른쪽으로 이동
                alphabet[s.charAt(start)-'A']--;
                start++;
            }
            maxLength = Math.max(maxLength, end - start + 1);
        }
        
        return maxLength;
    }
}