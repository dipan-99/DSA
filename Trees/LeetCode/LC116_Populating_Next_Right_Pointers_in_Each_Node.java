package Trees.LeetCode;

public class LC116_Populating_Next_Right_Pointers_in_Each_Node {
    public Node connect(Node root) {

        if (root == null)
            return null;

        Node leftmost = root;

        while (leftmost.left != null) {
            Node curr = leftmost;

            while (curr != null) {
                // Connect siblings
                curr.left.next = curr.right;

                // Connect across parents
                if (curr.next != null) {
                    curr.right.next = curr.next.left;
                }

                curr = curr.next;
            }

            leftmost = leftmost.left;
        }

        return root;
    }

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }
}
