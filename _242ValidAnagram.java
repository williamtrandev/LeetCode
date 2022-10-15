public class _242ValidAnagram {
    class Solution242 {
        public boolean isAnagram(String s, String t) {
            if(s.length() != t.length())
                return false;
            int[] alphaArr = new int[26];
            for(int i = 0; i < s.length(); i++) {
                alphaArr[s.charAt(i) - 'a']++;
            }
            for(int i = 0; i < t.length(); i++) {
                alphaArr[t.charAt(i) - 'a']--;
            }
            for(int i : alphaArr) {
                if(i != 0)
                    return false;
            }
            return true;
        }
    }
}
