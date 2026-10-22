package Linked_List.LeetCode;

import Linked_List.Basics_Singly.ListNode;

public class LC2_Add_Two_Numbers {
    public ListNode addTwoNumbers(ListNode A, ListNode B) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        int carry = 0;

        while (A != null || B != null || carry != 0) {
            int sum = carry;

            if (A != null) {
                sum += A.val;
                A = A.next;
            }

            if (B != null) {
                sum += B.val;
                B = B.next;
            }

            carry = sum / 10;

            curr.next = new ListNode(sum % 10);
            curr = curr.next;
        }

        return dummy.next;
    }
}
