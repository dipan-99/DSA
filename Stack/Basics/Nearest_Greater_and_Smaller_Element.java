package Stack.Basics;

import java.util.Stack;

public class Nearest_Greater_and_Smaller_Element {

    // Element on the right
    public static int[] right(int[] arr) {
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) { //  <=  --> Greater Element  &  <  --> Greater or Equal
                st.pop();                                       //  >=  --> Smaller Element  &  >  --> Smaller or Equal
            }

            if (st.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = arr[st.peek()];
            }

            st.push(i);
        }

        return ans;
    }

    // Element on the left
    public static int[] left(int[] arr) {
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) { // <=  --> Greater Element  &  <  --> Greater or Equal
                st.pop();                                       // >=  --> Smaller Element  &  >  --> Smaller or Equal
            }

            if (st.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = arr[st.peek()];
            }

            st.push(i);
        }

        return ans;
    }
}
