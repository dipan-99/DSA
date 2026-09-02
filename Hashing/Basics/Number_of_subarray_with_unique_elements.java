package Hashing.Basics;

import java.util.HashSet;

public class Number_of_subarray_with_unique_elements {
    public int solve(int[] A) {
        int n = A.length;
        long ans = 0;
        int l = 0;

        HashSet<Integer> set = new HashSet<>();

        for (int r = 0; r < n; r++) {

            while (set.contains(A[r])) {
                set.remove(A[l]);
                l++;
            }

            set.add(A[r]);

            ans += r - l + 1;
            ans %= 1000000007;
        }

        return (int) ans;
    }
}
