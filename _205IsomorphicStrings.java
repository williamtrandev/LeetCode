class Solution205 {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        // Method 1: Using 2 hashmap to mapping each character in 2 string to each other.
        
        // HashMap<Character, Character> hm1 = new HashMap<>(),
        // hm2 = new HashMap<>();
        // for(int i = 0; i < s.length(); i++) {
        //     hm1.put(s.charAt(i), t.charAt(i));       // mapping one to one character in each string     
        //     hm2.put(t.charAt(i), s.charAt(i));
        // }
        // for(int i = 0; i < s.length(); i++) {
            // if the key in s mapping to the key in t 
            // is different from the key in t mapping to the key in s then return false 
        //     if(hm1.get(s.charAt(i)) != t.charAt(i) || hm2.get(t.charAt(i)) != s.charAt(i))   
        //         return false;
        // }
        
        // Method 2: Using 2 array, this method is similar to using 2 hashmap
        // but faster because it uses one loop.
        int[] map1 = new int[128], map2 = new int[128]; // 128 is the size of the ASCII table
        for(int i = 0; i < s.length(); i++) {
            if(map1[s.charAt(i)] != map2[t.charAt(i)]) {   // compare previous value if different -> return false
                return false;
            }
            map1[s.charAt(i)] = i + 1;  
            map2[t.charAt(i)] = i + 1;
        }
        return true;
    }
}