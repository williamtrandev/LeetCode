class Solution405 {
    public String toHex(int num) {
        char[] str = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        if(num == 0) {
            return "0";
        }
        String ans = "";
        while(num != 0) {
            ans = str[num & 15] + ans;
            num = num >>> 4;
        }
        return ans;
    }
}