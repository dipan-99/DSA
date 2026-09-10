package Binary_Search.Basics;

public class Allocate_Books {
    public int books(int[] A, int B) {
        int n = A.length;

        if (B > n) {
            return -1;
        }

        int l = maxElem(A), r = sum(A);

        while (l < r) {
            int m = l + (r - l) / 2;

            if (possible(A, B, m)) {
                r = m;
            } else {
                l = m + 1;
            }
        }

        return l;
    }

    public static boolean possible(int[] A, int B, int maxPage) {
        int student = 1;
        int curr = 0;

        for (int x : A) {
            if (curr + x <= maxPage) {
                curr += x;
            } else {
                student++;
                curr = x;

                if (student > B) {
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
