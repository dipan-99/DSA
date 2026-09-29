package Stack.LeetCode;

import java.util.Stack;

public class LC907_Sum_of_Subarray_Minimums {
    public int sumSubarrayMins(int[] arr) {
        long MOD = 1000000007;

        int[] left = left(arr);
        int[] right = right(arr);

        long ans = 0;

        for (int i = 0; i < arr.length; i++) {
            long leftChoices = i - left[i];
            long rightChoices = right[i] - i;

            long contribution = (long) arr[i] * leftChoices * rightChoices;

            ans = (ans + contribution) % MOD;
        }

        return (int) ans;
    }

    public static int[] right(int[] arr) {
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                ans[i] = arr.length;
            } else {
                ans[i] = st.peek();
            }

            st.push(i);
        }

        return ans;
    }

    public static int[] left(int[] arr) {
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }

            st.push(i);
        }

        return ans;
    }
}
