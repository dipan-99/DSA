package Linked_List.LeetCode;
import Linked_List.Basics_Singly.ListNode;

public class LC328_Odd_Even_Linked_List {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode oddHead = new ListNode(-1);
        ListNode evenHead = new ListNode(-1);

        ListNode odd = oddHead;
        ListNode even = evenHead;

        ListNode curr = head;
        int position = 1;

        while (curr != null) {
            if (position % 2 == 1) {
                odd.next = curr;
                odd = odd.next;
            } else {
                even.next = curr;
                even = even.next;
            }

            curr = curr.next;
            position++;
        }

        odd.next = evenHead.next;
        even.next = null;

        return oddHead.next;
    }
}
