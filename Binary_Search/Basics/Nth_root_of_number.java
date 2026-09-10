package Binary_Search.Basics;

public class Nth_root_of_number {
    public int NthRoot(int N, int M) {
        int l = 1;
        int r = M;

        while (l <= r) {
            int m = l + (r - l) / 2;

            if ((long) Math.pow(m, N) == M) {
                return m;
            } else if ((long) Math.pow(m, N) < M) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return -1;
    }
}
