package Stack.Basics;

public class Implementing_Stack_using_LinkedList {
    static class StackUsingLinkedList {
        class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        Node top = null;
        int size = 0;

        // Push
        void push(int data) {
            Node newNode = new Node(data);

            newNode.next = top;
            top = newNode;

            size++;
        }

        // Pop
        int pop() {
            if (top == null) {
                System.out.println("Stack Underflow");
                return -1;
            }

            int value = top.data;
            top = top.next;

            size--;

            return value;
        }

        // Peek
        int peek() {
            if (top == null) {
                System.out.println("Stack is empty");
                return -1;
            }

            return top.data;
        }

        // Is Empty
        boolean isEmpty() {
            return top == null;
        }

        // Size
        int size() {
            return size;
        }
    }

    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.peek()); // 30

        System.out.println(stack.pop()); // 30
        System.out.println(stack.pop()); // 20

        System.out.println(stack.peek()); // 10

        System.out.println(stack.isEmpty());
    }
}

