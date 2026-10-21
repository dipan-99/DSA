package Binary_Search.Basics;

public class  Painters_Partition {
    public int paint(int A, int B, int[] C) {
        long MOD = 10000003;
        long l = maxElem(C), r = sum(C);

        while (l <= r) {
            long m = l + (r - l) / 2;

            if (count(C, m) <= A) r = m - 1;
            else l = m + 1;
        }

        return (int) ((l * B) % MOD);
    }

    public int count(int[] C, long max) {
        int painters = 1;
        long curr = 0;

        for (int x : C) {
            if (curr + x <= max) curr += x;
            else {
                painters++;
                curr = x;
            }
        }

        return painters;
    }

    int maxElem(int[] A) {
        int max = A[0];

        for (int x : A) {
            max = Math.max(max, x);
        }

        return max;
    }

    int sum(int[] A) {
        int sum = 0;

        for (int x : A) {
            sum += x;
        }

        return sum;
    }
}