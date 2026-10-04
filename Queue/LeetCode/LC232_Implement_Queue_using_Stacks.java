package Queue.LeetCode;

import java.util.Stack;

public class LC232_Implement_Queue_using_Stacks {
    class MyQueue {
        Stack<Integer> st1;
        Stack<Integer> st2;

        public MyQueue() {
            st1 = new Stack<>();
            st2 = new Stack<>();
        }

        public void push(int x) {
            st1.push(x);
        }

        public void transfer() {
            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
        }

        public int pop() {
            if (empty()) {
                return -1;
            }

            if (st2.isEmpty()) {
                transfer();
            }

            return st2.pop();
        }

        public int peek() {
            if (empty()) {
                return -1;
            }

            if (st2.isEmpty()) {
                transfer();
            }

            return st2.peek();
        }

        public boolean empty() {
            return (st1.isEmpty() && st2.isEmpty());
        }
    }
}