package Stack.LeetCode;

import java.util.Stack;

public class LC150_Evaluate_Reverse_Polish_Notation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (String s : tokens) {
            if (!s.equals("+") && !s.equals("-") && !s.equals("*") && !s.equals("/")) {

                st.push(Integer.parseInt(s));
            } else {
                int b = st.pop();
                int a = st.pop();

                int result = 0;

                if (s.equals("+")) {
                    result = a + b;
                }
                else if (s.equals("-")) {
                    result = a - b;
                }
                else if (s.equals("*")) {
                    result = a * b;
                }
                else {
                    result = a / b;
                }

                st.push(result);
            }
        }

        return st.pop();
    }
}
