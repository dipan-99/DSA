package Hashing.Basics;

import java.util.HashMap;

public class Longest_subarray_with_sum_0 {
    public int longestZeroSumSubarray(int[] A) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int prefixSum = 0;
        int maxLen = 0;

        for (int i = 0; i < A.length; i++) {
            prefixSum += A[i];

            if (prefixSum == 0) {
                maxLen = i + 1;
            }

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
