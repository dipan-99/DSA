package Linked_List.LeetCode;

import java.util.HashSet;
import Linked_List.Basics_Singly.ListNode;

public class LC160_Intersection_of_Two_Linked_Lists {

    // TC = O(n + m), SC = O(1)
    public ListNode getIntersectionNodeSOL1(ListNode headA, ListNode headB) {
        ListNode p1 = headA;
        ListNode p2 = headB;

        while (p1 != p2) {
            if (p1 == null) {
                p1 = headB;
            } else {
                p1 = p1.next;
            }

            if (p2 == null) {
                p2 = headA;
            } else {
                p2 = p2.next;
            }
        }

        return p1;
    }

    // TC = O(n + m), SC = O(n)
    public ListNode getIntersectionNodeSOL2(ListNode headA, ListNode headB) {

        HashSet<ListNode> set = new HashSet<>();

        ListNode curr = headA;

        while (curr != null) {
            set.add(curr);
            curr = curr.next;
        }

        curr = headB;

        while (curr != null) {
            if (set.contains(curr)) {
                return curr;
            }

            curr = curr.next;
        }

        return null;
    }
}
