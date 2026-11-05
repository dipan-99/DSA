package Binary_Search_Tree.Basics;

import Trees.Basics.TreeNode;

public class Largest_in_BST {
    public int findMin(TreeNode root) {
        if (root == null) {
            return -1;
        }

        TreeNode temp = root;

        while (temp.right != null) {
            temp = temp.right;
        }

        return temp.val;
    }
}
