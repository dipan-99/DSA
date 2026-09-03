package Linked_List.Basics;

public class Insertion_of_X_at_Kth_node {
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node insert(Node head, int x, int k) {
        Node newNode = new Node(x);

        if (k == 1) {
            newNode.next = head;
            return newNode;
        }

        Node current = head;

        for (int i = 1; i < k - 1; i++) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;

        return head;
    }
}
