package Linked_List;

public class LC1290_Convert_Binary_Number_in_a_Linked_List_to_Integer {
    public int getDecimalValue(ListNode head) {
        int ans = 0;

        while (head != null) {
            ans = (ans << 1) | head.val;
            head = head.next;
        }

        return ans;
    }

    class ListNode {
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

    // public int getDecimalValue(ListNode head) {
    //     ListNode curr = head;
    //     int n = Len(head);
    //     String str = "";

    //     for (int i = 0; i < n && curr != null; i++) {
    //         str += curr.val;
    //         curr = curr.next;
    //     }

    //     return Integer.parseInt(str, 2);
    // }

    // public static int Len(ListNode head) {
    //     ListNode curr = head;
    //     int count = 0;

    //     while (curr != null) {
    //         curr = curr.next;
    //         count++;
    //     }

    //     return count;
    // }