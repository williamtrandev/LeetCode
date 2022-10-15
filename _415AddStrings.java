class Solution415 {
    public String addStrings(String num1, String num2) {
        String ans = "";
        int i = num1.length()-1, j = num2.length()-1;
        int c = 0;
        while(i >= 0 || j >= 0 || c != 0) { 
            // c != 0 trong trường hợp c = 1 sẽ chạy tiếp. VD 9 + 1 = 10 thì ans = 0 + ans
            // sau đó ans sẽ dc cộng thêm số 1 phía trước nữa.
            if(i >= 0) c += num1.charAt(i--) - '0';
            if(j >= 0) c += num2.charAt(j--) - '0';
            ans = (c % 10) + ans;
            c /= 10;
        }
        return ans;
    }
}