package Linked_List.Basics_Doubly;

// Deletion -> TC = O(1)

public class Deletion_from_DLL {
    static class ListNode {
        int data;
        ListNode prev;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public static ListNode delete(ListNode head) {
        ListNode curr = head;

        //first travel to the node you what to delete then,

        curr.prev.next = curr.next;
        curr.next.prev = curr.prev;

        return head;
    }
}