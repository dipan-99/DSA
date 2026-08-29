package BinarySearch;

public class LC153_Find_Minimum_in_Rotated_Sorted_Array {
    public int findMin(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = n - 1;
        int ans = Integer.MAX_VALUE;

        while (l <= r) {
            int m = l + (r - l) / 2;

            if (nums[l] <= nums[m]) {
                ans = Math.min(ans, nums[l]);
                l = m + 1;
            } else {
                ans = Math.min(ans, nums[m]);
                r = m - 1;
            }
        }

        return ans;
    }
}
