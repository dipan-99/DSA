package Binary_Search.Basics;

public class Square_Root_of_Integer {
    public int sqrt(int A) {
        int l = 1;
        int r = A;
        int ans = 0;

        while (l <= r) {
            int m = l + (r - l) / 2;

            if ((long) m * m <= A) {
                ans = m;
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return ans;
    }
}
