package Linked_List.Basics_Doubly;

public class Traversal_in_DLL {
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

    public static void main(String[] args) {

        ListNode first = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);

        first.next = second;
        second.prev = first;

        second.next = third;
        third.prev = second;

        // forward traversal
        ListNode head = first;
        ListNode curr = head;

        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }

        // backward traversal
        ListNode tail = third;
        ListNode cur = tail;

        while (cur != null) {
            System.out.println(cur.data);
            cur = cur.prev;
        }
    }
}
