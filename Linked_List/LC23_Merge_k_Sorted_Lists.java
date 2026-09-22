package Linked_List;

public class LC23_Merge_k_Sorted_Lists {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }

        ListNode res = lists[0];

        for (int i = 1; i < lists.length; i++) {
            res = mergeTwoLists(res, lists[i]);
        }

        return res;
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp = new ListNode(-1);
        ListNode curr = temp;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }

            curr = curr.next;
        }

        if (list1 == null) {
            curr.next = list2;
        } else {
            curr.next = list1;
        }

        return temp.next;
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
