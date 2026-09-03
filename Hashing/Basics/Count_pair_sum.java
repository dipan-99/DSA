package Hashing.Basics;

import java.util.HashMap;

public class Count_pair_sum {
    public int solve(int[] A, int B) {

        int MOD = 1000000007;
        long count = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < A.length; i++) {

            int complement = B - A[i];

            if (map.containsKey(complement)) {
                count += map.get(complement);
                count %= MOD;
            }

            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }

        return (int) count;
    }
}
