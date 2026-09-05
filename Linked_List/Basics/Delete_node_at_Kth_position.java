package Linked_List.Basics;

public class Delete_node_at_Kth_position {
    public Node solve(Node A, int B) {
        Node curr = A;

        if (B == 0) {
            return A.next;
        }

        for (int i = 0; i < B - 1; i++) {
            curr = curr.next;
        }

        curr.next = curr.next.next;

        return A;
    }

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
