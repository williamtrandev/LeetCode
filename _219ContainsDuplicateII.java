import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class _219ContainsDuplicateII {
    class Solution219 {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            // Cách 1:
            
            // HashMap<Integer, Integer> hm = new HashMap<>();
            // for(int i = 0; i < nums.length; i++) {
            //     if(hm.containsKey(nums[i])){
            //         if(i - hm.get(nums[i]) <= k)
            //             return true;
            //         else {
            //             hm.remove(nums[i]);
            //             hm.put(nums[i], i);
            //         }
            //     } else {
            //         hm.put(nums[i], i);
            //     }   
            // }
            // return false;
            
            // Cách 2: Dùng hashset
            Set<Integer> hs = new HashSet<>();
            for(int i = 0; i < nums.length; i++) {
                if(i > k) {
                    hs.remove(nums[i - k - 1]); // VD: nums = [1,0,1,1], k = 1 => khi chạy đến index = 2 xóa số 1 trong set 
                } 
                if(!hs.add(nums[i])) 
                    return true;
            }
            return false;
        }
    }
      
      
}
