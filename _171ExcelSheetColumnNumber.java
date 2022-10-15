class Solution171 {
    public int titleToNumber(String columnTitle) {
        int ans = 0;
        for(int i = 0; i < columnTitle.length(); i++) {
            ans = ans * 26 + Character.valueOf(columnTitle.charAt(i)) - 64; 
            // VD: A = 0*26 + 1, AB = (0*26 + 1)*26 + 2 = 28, ABC = ((0*26 + 1)*26 + 2)*26 + 3 = 731
        }
        return ans;
    }
}