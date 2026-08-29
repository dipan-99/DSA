package BinarySearch.Basics;

public class Search_K_in_sorted_array {
    public int search(int[] arr, int K) {
        int n = arr.length;
        int l = 0;
        int r = n - 1;

        while (l <= r) {
            int m = l + (r - l) / 2;

            if (arr[m] == K)
                return m;
            else if (arr[m] < K)
                l = m + 1;
            else
                r = m - 1;
        }

        return -1;
    }
}
