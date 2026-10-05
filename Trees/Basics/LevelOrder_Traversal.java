package Trees.Basics;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder_Traversal {
    static void levelOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);

        while (!q.isEmpty()) {
            TreeNode curr = q.poll();

            System.out.print(curr.val + " ");

            if (curr.left != null) {
                q.offer(curr.left);
            }

            if (curr.right != null) {
                q.offer(curr.right);
            }
        }
    }
}
