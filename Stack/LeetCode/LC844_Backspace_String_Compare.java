package Stack.LeetCode;

import java.util.Stack;

public class LC844_Backspace_String_Compare {
    public boolean backspaceCompare(String s, String t) {

        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '#') {
                if (!st1.isEmpty()) {
                    st1.pop();
                }
            } else {
                st1.push(ch);
            }
        }

        for (char ch : t.toCharArray()) {
            if (ch == '#') {
                if (!st2.isEmpty()) {
                    st2.pop();
                }
            } else {
                st2.push(ch);
            }
        }

        StringBuilder res1 = new StringBuilder();
        StringBuilder res2 = new StringBuilder();

        while (!st1.isEmpty()) {
            res1.append(st1.pop());
        }

        while (!st2.isEmpty()) {
            res2.append(st2.pop());
        }

        // res1.reverse();
        // res2.reverse();

        return res1.toString().equals(res2.toString());
    }
}
