package Hashing.Basics;

import java.util.HashMap;

public class Longest_subarray_with_sum_0 {
    public int longestZeroSumSubarray(int[] A) {
        HashMap<Long, Integer> map = new HashMap<>();

        long prefixSum = 0;
        int maxLen = 0;

        map.put(0L, -1);

        for (int i = 0; i < A.length; i++) {

            prefixSum += A[i];

            if (map.containsKey(prefixSum)) {
                int len = i - map.get(prefixSum);
                maxLen = Math.max(maxLen, len);
            } else {
                map.put(prefixSum, i);
            }
        }

        return maxLen;
    }
}
