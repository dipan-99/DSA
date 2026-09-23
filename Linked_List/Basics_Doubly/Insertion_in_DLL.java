package Linked_List.Basics_Doubly;

// Insertion -> TC = O(1)

public class Insertion_in_DLL {
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

    static int x = 0;

    //insert at the start
    public static void insertStart(ListNode head) {
        ListNode newNode = new ListNode(x);

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    //insert at the end
    public static void insertEnd(ListNode tail) {
        ListNode newNode = new ListNode(x);

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    //insert at a position
    public static void insertPos(ListNode head) {
        ListNode newNode = new ListNode(x);
        ListNode curr = head;

        // first travel to the previous node of the required position then,

        newNode.prev = curr;
        newNode.next = curr.next;

        curr.next.prev = newNode;
        curr.next = newNode;
    }
}