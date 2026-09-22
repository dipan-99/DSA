package Linked_List.Basics;

public class Print_a_linkedlist {
    public static void solve(Node head) {
        Node curr = head;

        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
