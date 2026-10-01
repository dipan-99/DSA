package Linked_List.LeetCode;

public class LC24_Swap_Nodes_in_Pairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode temp = new ListNode(-1);
        temp.next = head;

        ListNode prev = temp;

        while (prev.next != null && prev.next.next != null) {
            ListNode first = prev.next;
            ListNode sec = first.next;

            first.next = sec.next;
            sec.next = first;
            prev.next = sec;

            prev = first;
        }

        return temp.next;
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
