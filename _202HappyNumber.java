public class _202HappyNumber {
    class Solution202 {
        public int sum(int n) {
            int sumSquare = 0;
            while(n > 0) {
                sumSquare += Math.pow(n % 10,2);
                n /= 10;
            }
            return sumSquare;
        }
        public boolean isHappy(int n) {
            if(n == 1)
                return true;
            if(n == 4)          // Các số không phải happy sẽ đi vào chu kì 4 VD: 4->16->37->58->89->145->42->20->4
                return false;
            return isHappy(sum(n));
        }
    }
}
