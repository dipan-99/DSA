package Stack.Basics;

public class Implementing_Stack_using_Array {
    static class MyStack {
        int[] arr;
        int top;

        MyStack(int capacity) {
            arr = new int[capacity];
            top = -1;
        }

        // Push
        void push(int x) {
            if (top == arr.length - 1) {
                return;
            }

            top++;
            arr[top] = x;
        }

        // Pop
        int pop() {
            if (top == -1) {
                throw new RuntimeException("Stack Underflow");
            }

            int value = arr[top];
            top--;
            return value;
        }

        // Peek
        int peek() {
            if (top == -1) {
                throw new RuntimeException("Stack Overflow");
            }

            return arr[top];
        }

        // Is Empty
        boolean isEmpty() {
            return (top == -1);
        }
    }

    public static void main(String[] args) {
        MyStack st = new MyStack(3);

        st.push(10);
        st.push(20);
        st.push(30);
        st.peek();
        st.pop();
        st.peek();
        st.pop();
        st.pop();
        st.isEmpty();
        st.pop();
    }
}
