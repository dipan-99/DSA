package Linked_List.Basics_Singly;

public class Remove_loop {
    public static void removeLoop(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                slow = head;

                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }

                ListNode loopStart = slow;
                while (fast.next != loopStart) {
                    fast = fast.next;
                }
                fast.next = null;
                return;
            }
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = head.next;

        removeLoop(head);

        for (ListNode current = head; current != null; current = current.next) {
            System.out.print(current.val + " ");
        }
    }
}
