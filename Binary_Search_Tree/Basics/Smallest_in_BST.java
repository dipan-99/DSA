package Binary_Search_Tree.Basics;

import Trees.Basics.TreeNode;

public class Smallest_in_BST {
    public int findMin(TreeNode root) {
        if (root == null) {
            return -1;
        }

        TreeNode temp = root;
        
        while (temp.left != null) {
            temp = temp.left;
        }

        return temp.val;
    }
}
