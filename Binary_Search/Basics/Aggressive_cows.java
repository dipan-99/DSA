package Binary_Search.Basics;

import java.util.Arrays;

public class Aggressive_cows {
    public int solve(int[] A, int B) {
        Arrays.sort(A);

        int l = 0, r = A[A.length - 1] - A[0], ans = 0;

        while (l <= r) {
            int m = l + (r - l) / 2;

            if (canPlace(A, B, m)) {
                ans = m;
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return ans;
    }

    public static boolean canPlace(int[] A, int B, int dist) {
        int cows = 1, pos = A[0];

        for (int i = 1; i < A.length; i++) {
            if (A[i] - pos >= dist) {
                cows++;
                pos = A[i];
            }
        }

        if (cows >= B) return true;

        return false;
    }
}
