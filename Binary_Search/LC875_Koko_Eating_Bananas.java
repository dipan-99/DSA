package Binary_Search;

public class LC875_Koko_Eating_Bananas {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = maxElem(piles);
        int ans = 0;

        while (l <= r) {
            int m = l + (r - l) / 2;

            long count = 0;

            for (int x : piles) {
                count += (long) Math.ceil((double) x / m);
            }

            if (count <= h) {
                ans = m;
                r = m - 1;
            } else {
                l = m + 1;
            }
        }

        return ans;
    }

    public static int maxElem(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        return max;
    }
}
