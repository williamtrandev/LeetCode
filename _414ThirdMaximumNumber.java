class Solution414 {
    public int thirdMax(int[] nums) {
        long max1 = Long.MIN_VALUE, max2 = Long.MIN_VALUE, max3 = Long.MIN_VALUE; // In case nums[i] is equal to Integer.MIN_VALUE
        for(int n : nums) {
            if(n == max1 || n == max2 || n == max3) {
                continue;
            }
            if(n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if(n > max2) {
                max3 = max2;
                max2 = n;
            } else if(n > max3) {
                max3 = n;
            }
        }
        return max3 == Long.MIN_VALUE ? (int) max1 : (int) max3;
    }
}