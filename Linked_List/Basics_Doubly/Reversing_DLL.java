package Linked_List.Basics_Doubly;

import Linked_List.Basics_Doubly.Creating_DLL.ListNode;

public class Reversing_DLL {
    public static ListNode reverse(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode curr = head;
        ListNode temp = null;

        while (curr != null) {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;

            curr = curr.prev;
        }

        return temp.prev;
    }
}
