class Solution387 {
    public int firstUniqChar(String s) {
        
        //C1
        
        int[] alphabet = new int[26];
        for(int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < s.length(); i++) {
            if(alphabet[s.charAt(i) - 'a'] == 1)
                return i;
        }
        return -1;
        
        // C2
        
//         HashMap<Character, Integer> hm = new HashMap<>();
//         for(int i = 0; i < s.length(); i++) {
//             if(!hm.containsKey(s.charAt(i))) {
//                 hm.put(s.charAt(i), 1);
//             } else {
//                 hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
//             }
//         }
//         for(int i = 0; i < s.length(); i++) {
//             if(hm.get(s.charAt(i)) == 1) {
//                 return i;
//             }
//         }
//         return -1;
    }
}