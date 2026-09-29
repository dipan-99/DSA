package Stack.LeetCode;

import java.util.Stack;

public class LC2104_Sum_of_Subarray_Ranges {
    // Better --- TC = O(N)
    public long subArrayRangesSOL1(int[] nums) {
        long sumMax = sumOfMax(nums);
        long sumMin = sumOfMin(nums);

        return sumMax - sumMin;
    }

    public static long sumOfMin(int[] arr) {
        int n = arr.length;

        int[] left = new int[n];
        int[] right = new int[n];

        Stack<Integer> st = new Stack<>();

        // Previous Smaller or Equal
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                left[i] = -1;
            } else {
                left[i] = st.peek();
            }

            st.push(i);
        }

        st.clear();

        // Next Smaller
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                right[i] = n;
            } else {
                right[i] = st.peek();
            }

            st.push(i);
        }

        long sum = 0;

        for (int i = 0; i < n; i++) {
            long leftChoices = i - left[i];
            long rightChoices = right[i] - i;

            sum += (long) arr[i] * leftChoices * rightChoices;
        }

        return sum;
    }

    public static long sumOfMax(int[] arr) {
        int n = arr.length;

        int[] left = new int[n];
        int[] right = new int[n];

        Stack<Integer> st = new Stack<>();

        // Previous Greater or Equal
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                left[i] = -1;
            } else {
                left[i] = st.peek();
            }

            st.push(i);
        }

        st.clear();

        // Next Greater
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                right[i] = n;
            } else {
                right[i] = st.peek();
            }

            st.push(i);
        }

        long sum = 0;

        for (int i = 0; i < n; i++) {
            long leftChoices = i - left[i];
            long rightChoices = right[i] - i;

            sum += (long) arr[i] * leftChoices * rightChoices;
        }

        return sum;
    }

    // Brute Force --- TC = O(N^2)
    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        long sum = 0;

        for (int i = 0; i < n; i++) {

            int min = nums[i];
            int max = nums[i];

            for (int j = i; j < n; j++) {

                min = Math.min(min, nums[j]);
                max = Math.max(max, nums[j]);

                sum += max - min;
            }
        }

        return sum;
    }
}
