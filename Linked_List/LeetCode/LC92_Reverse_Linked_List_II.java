package Linked_List.LeetCode;

public class LC92_Reverse_Linked_List_II {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null || left == right) {
            return head;
        }

        ListNode temp = new ListNode(-1);
        temp.next = head;

        ListNode before = temp;

        for (int i = 1; i < left; i++) {
            before = before.next;
        }

        ListNode start = before.next;
        ListNode end = start;

        for (int i = left; i < right; i++) {
            end = end.next;
        }

        ListNode after = end.next;
        end.next = null;

        ListNode reverseHead = reverse(start);

        before.next = reverseHead;
        start.next = after;

        return temp.next;
    }

    public static ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            ListNode nxt = curr.next;

            curr.next = prev;
            prev = curr;
            curr = nxt;
        }

        return prev;
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
