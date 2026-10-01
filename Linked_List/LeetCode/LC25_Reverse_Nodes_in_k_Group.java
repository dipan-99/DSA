package Linked_List.LeetCode;

public class LC25_Reverse_Nodes_in_k_Group {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) {
            return head;
        }

        ListNode temp = new ListNode(-1);
        temp.next = head;

        ListNode prev = temp;

        while (true) {
            ListNode end = prev;

            for (int i = 0; i < k; i++) {
                end = end.next;

                if (end == null) {
                    return temp.next;
                }
            }

            ListNode start = prev.next;

            ListNode after = end.next;
            end.next = null;

            ListNode reversed = reverse(start);

            prev.next = reversed;
            start.next = after;

            prev = start;
        }
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
