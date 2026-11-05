package Binary_Search_Tree.LeetCode;

import Trees.Basics.TreeNode;

public class LC701_Insert_into_a_Binary_Search_Tree {
    
    // Recursive --- TC = O(), SC = O()
    public TreeNode insertIntoBSTSOL1(TreeNode root, int val) {
        TreeNode temp = root;

        if (temp == null) {
            return new TreeNode(val);
        }

        if (temp.val > val) {
            temp.left = insertIntoBSTSOL1(temp.left, val);
        } else if (temp.val < val) {
            temp.right = insertIntoBSTSOL1(temp.right, val);
        }

        return root;
    }

    // Iterative --- TC = O(), SC = O()
    public TreeNode insertIntoBSTSOL2(TreeNode root, int val) {
        TreeNode newNode = new TreeNode(val);

        if (root == null) {
            return newNode;
        }

        TreeNode temp = root;

        while (true) {
            if (val < temp.val) {
                if (temp.left == null) {
                    temp.left = newNode;
                    break;
                }

                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    break;
                }

                temp = temp.right;
            }
        }

        return root;
    }
}
