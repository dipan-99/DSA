package BinarySearch;

public class LC162_Find_Peak_Element {
    public int findPeakElement(int[] nums) {
        int n = nums.length, l = 0, r = n - 1;

        while (l < r) {
            int m = l + (r - l) / 2;

            if (nums[m] < nums[m + 1]) {
                l = m + 1;
            } else {
                r = m;
            }
        }

        return l;
    }
}
