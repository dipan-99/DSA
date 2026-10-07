package Queue.Basics;

public class Implement_Queue_using_Linkedlist {
    class Queue {

        static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
            }
        }

        Node front;
        Node rear;

        void enqueue(int value) {

            Node newNode = new Node(value);

            if (rear == null) {
                front = rear = newNode;
                return;
            }

            rear.next = newNode;
            rear = newNode;
        }

        int dequeue() {

            if (front == null) {
                System.out.println("Queue is empty");
                return -1;
            }

            int value = front.data;

            front = front.next;

            if (front == null) {
                rear = null;
            }

            return value;
        }

        int peek() {

            if (front == null) {
                System.out.println("Queue is empty");
                return -1;
            }

            return front.data;
        }

        boolean isEmpty() {
            return front == null;
        }
    }
}
