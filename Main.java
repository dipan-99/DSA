public class Main {
    public Node removeNthFromEnd(Node A, int B) {
        Node curr = A;

        int n = Len(A);

        if (B >= n) {
            return A.next;
        }

        int Bnew = n - B + 1;

        for (int i = 0; i < Bnew - 2 && curr != null; i++) {
            curr = curr.next;
        }

        if (curr != null && curr.next != null) {
            curr.next = curr.next.next;
        }

        return A;
    }

    public static int Len(Node head) {
        Node curr = head;
        int count = 0;

        while (curr != null) {
            curr = curr.next;
            count++;
        }

        return count;
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
