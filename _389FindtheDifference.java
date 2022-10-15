class Solution389 {
    public char findTheDifference(String s, String t) {
        // // cach1
        // int[] arr = new int[26];
        // for(int i = 0; i < t.length(); i++) {
        //     arr[t.charAt(i) - 'a']++;
        // }
        // for(int i = 0; i < s.length(); i++) {
        //     arr[s.charAt(i) - 'a']--;
        // }
        // for(int i = 0; i < arr.length; i++) {
        //     if(arr[i] != 0)
        //         return (char) (i + 'a');
        // }
        // return 'a'; // tra ve ngau nhien vi dieu kien trong for luon dung
        
        // cach 2: hay
        int sum = t.charAt(t.length()-1);
        for(int i = 0; i < s.length(); i++) {
            sum += t.charAt(i) - s.charAt(i);
        }
        return (char) sum;

         // cach3: xor
        //  s += t;
        //  char ans = '\0';
        //  for(int i = 0; i < s.length(); i++) {
        //      ans ^= s.charAt(i); 
        //  }
        //  return ans;
    }
}