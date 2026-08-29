package BinarySearch.Basics;

public class Lower_Bound {
    public int lowerBound(int[] nums, int x) {
        int n = nums.length;
        int l = 0;
        int r = n - 1;
        int ans = n;

        while (l <= r) {
            int m = l + (r - l) / 2;

            if (nums[m] >= x) {
                ans = m;
                r = m - 1;
            } else {
                l = m + 1;
            }
        }

        return ans;
    }
}
