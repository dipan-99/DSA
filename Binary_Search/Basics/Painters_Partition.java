package Binary_Search.Basics;

public class  Painters_Partition {
    public int paint(int A, int B, int[] C) {
        long MOD = 10000003;
        long l = maxElem(C);
        long r = sum(C);

        while (l <= r) {
            long m = l + (r - l) / 2;

            if (possible(C, A, m)) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }

        return (int) ((l * (long) B) % MOD);
    }

    public static boolean possible(int[] C, int A, long Max) {
        int painters = 1;
        int curr = 0;

        for (int x : C) {
            if (curr + x <= Max) {
                curr += x;
            } else {
                painters++;
                curr = x;

                if (painters > A) {
                    return false;
                }
            }
        }

        return true;
    }

        public static int maxElem(int[] A) {
        int max = A[0];

        for (int x : A) {
            max = Math.max(max, x);
        }

        return max;
    }

    public static int sum(int[] A) {
        int sum = A[0];

        for (int x : A) {
            sum += x;
        }

        return sum;
    }
}
