package Linked_List.LeetCode;

public class LC86_Partition_List {
    public ListNode partition(ListNode head, int x) {
        ListNode lessDummy = new ListNode(-1);
        ListNode greaterDummy = new ListNode(-1);

        ListNode less = lessDummy;
        ListNode greater = greaterDummy;

        ListNode curr = head;

        while (curr != null) {
            if (curr.val < x) {
                less.next = curr;
                less = less.next;
            } else {
                greater.next = curr;
                greater = greater.next;
            }

            curr = curr.next;
        }

        less.next = greaterDummy.next;

        greater.next = null;

        return lessDummy.next;
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
