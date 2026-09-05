package Linked_List.Basics;

public class Access_Kth_node {
    public int solve(Node A, int B) {
        Node curr = A;

        if (B == 0) {
            return A.data;
        }

        for (int i = 0; i < B; i++) {
            if (curr == null) {
                return -1;
            }

            curr = curr.next;
        }

        if (curr == null) {
            return -1;
        }

        return curr.data;
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
