package Binary_Search_Tree.LeetCode;

import Trees.Basics.TreeNode;

public class LC700_Search_in_a_Binary_Search_Tree {
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode temp = root;

        while (temp != null) {

            if (temp.val == val) {
                return temp;
            }

            if (val < temp.val) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }

        return null;
    }
}
