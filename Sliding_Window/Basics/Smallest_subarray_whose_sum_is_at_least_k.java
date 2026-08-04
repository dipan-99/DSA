package Sliding_Window.Basics;

public class Smallest_subarray_whose_sum_is_at_least_k {
    public static int smallestSubarrayWithSum(int[] arr, int k) {
        int n = arr.length;
        int minLen = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {
            sum += arr[right];

            while (sum >= k) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= arr[left];
                left++;
            }
        }

        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    }
}
