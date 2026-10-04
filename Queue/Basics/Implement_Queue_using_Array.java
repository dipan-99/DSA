package Queue.Basics;

public class Implement_Queue_using_Array {
    static class MyQueue {
        int[] arr;
        int front;
        int rear;
        int size;

        MyQueue(int capacity) {
            arr = new int[capacity];
            front = 0;
            rear = -1;
            size = 0;
        }

        void enqueue(int value) {
            if (size == arr.length) {
                System.out.println("Queue is full");
                return;
            }

            rear++;
            arr[rear] = value;
            size++;
        }

        int dequeue() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }

            int value = arr[front];
            front++;
            size--;

            return value;
        }

        int peek() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[front];
        }

        boolean isEmpty() {
            return size == 0;
        }
    }

    public static void main(String[] args) {

        MyQueue q = new MyQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.peek());

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());

        System.out.println(q.peek());
    }
}