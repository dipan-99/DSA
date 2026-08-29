package BinarySearch;

public class LC34_Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    public int[] searchRange(int[] nums, int target) {
        return new int[] { first(nums, target), last(nums, target) };
    }

    public static int first(int[] arr, int x) {
        int n = arr.length;

        int l = 0;
        int r = n - 1;

        int ans = -1;

        while (l <= r) {
            int m = l + (r - l) / 2;

            if (arr[m] == x) {
                ans = m;
                r = m - 1;
            } else if (arr[m] < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return ans;
    }

    public static int last(int[] arr, int x) {
        int n = arr.length;

        int l = 0;
        int r = n - 1;

        int ans = -1;

        while (l <= r) {
            int m = l + (r - l) / 2;

            if (arr[m] == x) {
                ans = m;
                l = m + 1;
            } else if (arr[m] < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return ans;
    }
}
