class Solution434 {
    public int countSegments(String s) {
        // Method 1: Using split in java
        // return s.split("\s+").length;   // Split the string by the regex "\s+": is one or more space 
        // Method 2: Using iterator
        if(s == "") {
            return 0;
        }
        int c = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ' ' && (i == 0 || s.charAt(i-1) == ' ')) {
                c++;
            }
        }
        return c;
    }
}