package Stack.Basics;

import java.util.Stack;

public class Reversing_a_String_using_Stack {
    static String reverse(String str) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();

        // return result.reverse().toString(); if you want the original string
    }
}
