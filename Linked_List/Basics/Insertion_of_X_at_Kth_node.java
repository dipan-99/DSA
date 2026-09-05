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

        Node curr = head;

        if (k == 1) {
            newNode.next = head;
            return newNode;
        }

        for (int i = 1; i < k - 1; i++) {
            curr = curr.next;
        }

        newNode.next = curr.next;
        curr.next = newNode;

        return head;
    }
}
