package Hashing;

import java.util.HashMap;

public class LC523_Continuous_Subarray_Sum {
    public boolean checkSubarraySum(int[] nums, int k) {
        int prefix = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            prefix += nums[i];

            int rem = prefix % k;

            if (map.containsKey(rem)) {
                if (i - map.get(rem) >= 2) {
                    return true;
                }
            } else {
                map.put(rem, i);
            }
        }

        return false;
    }
}
