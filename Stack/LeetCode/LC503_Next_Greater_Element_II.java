package Stack.LeetCode;

import java.util.Stack;

public class LC503_Next_Greater_Element_II {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];

        for (int i = (2 * n) - 1; i >= 0; i--) {
            int idx = i % n;

            while(!st.isEmpty() && nums[st.peek()] <= nums[idx]) {
                st.pop();
            }

            if (st.isEmpty()) {
                ans[idx] = -1;
            } else {
                ans[idx] = nums[st.peek()];
            }

            st.push(idx);
        }

        return ans;
    }
}
