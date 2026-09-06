package Hashing;

import java.util.HashMap;

public class LC560_Subarray_Sum_Equals_K {
    public int subarraySum(int[] nums, int k) {
        int prefix = 0;
        int count = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int x : nums) {
            prefix += x;
            int req = prefix - k;

            if (map.containsKey(req)) {
                count += map.get(req);
            }

            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }

        return count;
    }
}
