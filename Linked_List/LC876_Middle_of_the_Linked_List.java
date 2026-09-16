package Linked_List;

public class LC876_Middle_of_the_Linked_List {
    // Slow-Fast pointer Approach

    public ListNode middleNodeSOL1(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Basic Approach

    public ListNode middleNodeSOL2(ListNode head) {
        int n = Len(head);
        ListNode curr = head;

        for (int i = 0; i < (n / 2); i++) {
            curr = curr.next;
        }

        return curr;

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
