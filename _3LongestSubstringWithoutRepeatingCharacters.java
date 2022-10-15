import java.util.HashSet;

class Solution_3 {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        int start = 0, end = 0, length = s.length(), max = 0;
        while(end < length) {
            if(!hs.contains(s.charAt(end))) {
                hs.add(s.charAt(end));
                end++;
                max = Math.max(max,hs.size());
            } else {
                hs.remove(s.charAt(start));
                start++;
            }
        }
        return max;
    }
}