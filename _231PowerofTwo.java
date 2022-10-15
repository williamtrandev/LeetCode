public class _231PowerofTwo {
    class Solution231 {
        public boolean isPowerOfTwo(int n) {
            // Cách 1: Hay. Thao tác trên bit.
            // n = 2 ^ 0 = 1 = 0b0000...00000001, and (n - 1) = 0 = 0b0000...0000.
            // n = 2 ^ 1 = 2 = 0b0000...00000010, and (n - 1) = 1 = 0b0000...0001.
            // n = 2 ^ 2 = 4 = 0b0000...00000100, and (n - 1) = 3 = 0b0000...0011.
            // n = 2 ^ 3 = 8 = 0b0000...00001000, and (n - 1) = 7 = 0b0000...0111.
            
            // => n&(n-1) = 0 do phép toán and thao tác trên bit
            return n > 0 && (n & (n-1)) == 0;
            
            
            // Cách 2: Dùng vong lặp.
            // if(n <= 0)
            //     return false;
            // while(n % 2 == 0) {
            //     n = n / 2;
            // }
            // return n == 1;
            
            // Cách 3: Đệ quy
            // if(n <= 0)
            //     return false;
            // if(n == 1)
            //     return true;
            // return n % 2 == 0 && isPowerOfTwo(n/2);
        }
    }
}
