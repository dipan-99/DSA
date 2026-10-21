package Binary_Search.Basics;

public class Allocate_Books {
    public int books(int[] A, int B) {
        if (B > A.length) return -1;

        int l = maxElem(A), r = sum(A);

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (count(A, mid) <= B) r = mid - 1;
            else l = mid + 1;
        }

        return l;
    }

    int count(int[] A, int pages) {
        int student = 1, countPage = 0;

        for (int i = 0; i < A.length; i++) {
            if (countPage + A[i] <= pages) {
                countPage += A[i];
            } else {
                student++;
                countPage = A[i];
            }
        }

        return student;
    }

    int maxElem(int[] A) {
        int max = Integer.MIN_VALUE;

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
