package BinarySearch.Basics;

public class Floor_and_Ceil_in_Sorted_Array {
    public int[] getFloorAndCeil(int[] nums, int x) {
        return new int[] { floor(nums, x), ceil(nums, x) };
    }

    public static int floor(int[] arr, int x) {
        int n = arr.length;
        int l = 0;
        int r = n - 1;

        int ans = -1;

        while (l <= r) {
            int m = l + (r - l) / 2;

            if (arr[m] <= x) {
                ans = arr[m];
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return ans;
    }

    public static int ceil(int[] arr, int x) {
        int n = arr.length;
        int l = 0;
        int r = n - 1;

        int ans = -1;

        while (l <= r) {
            int m = l + (r - l) / 2;

            if (arr[m] >= x) {
                ans = arr[m];
                r = m - 1;
            } else {
                l = m + 1;
            }
        }

        return ans;
    }
}
