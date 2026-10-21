package Binary_Search.LeetCode;

public class LC875_Koko_Eating_Bananas {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1, r = maxElem(piles);

        while (l <= r) {
            int mid = l + (r - l) / 2;

            long hours = calHour(piles, mid);

            if (hours <= h)
                r = mid - 1;
            else
                l = mid + 1;
        }

        return l;
    }

    int maxElem(int[] A) {
        int max = Integer.MIN_VALUE;

        for (int x : A) {
            max = Math.max(max, x);
        }

        return max;
    }

    long calHour(int[] arr, int H) {
        long hours = 0;

        for (int x : arr) {
            hours += (x + H - 1) / H;
        }

        return hours;
    }
}
