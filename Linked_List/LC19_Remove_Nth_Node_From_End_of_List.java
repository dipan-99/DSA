package Linked_List;

public class LC19_Remove_Nth_Node_From_End_of_List {
    public ListNode removeNthFromEnd(ListNode A, int B) {
        ListNode curr = A;
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

    public static int Len(ListNode head) {
        ListNode curr = head;
        int count = 0;

        while (curr != null) {
            curr = curr.next;
            count++;
        }

        return count;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
