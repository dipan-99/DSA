package Binary_Search.Basics;

public class Gardener_Harvesting_Fruits {
    public int minHarvestingSpeed(int[] A, int B) {
        int l = 1, r = 0;

        for (int x : A) {
            r = Math.max(r, x);
        }

        int ans = r;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (canFinish(A, B, mid)) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return ans;
    }

    public boolean canFinish(int[] A, int B, int k) {
        long hours = 0;

        for (int x : A) {
            hours += (x + k - 1) / k;

            if (hours > B) {
                return false;
            }
        }

        return true;
    }
}
