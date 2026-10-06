package Trees.LeetCode;

import java.util.*;
import Trees.Basics.TreeNode;

public class LC102_Binary_Tree_Level_Order_Traversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            List<Integer> node = new ArrayList<>();

            int size = q.size();

            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();

                node.add(curr.val);

                if (curr.left != null) {
                    q.offer(curr.left);
                }

                if (curr.right != null) {
                    q.offer(curr.right);
                }
            }

            ans.add(node);
        }

        return ans;
    }
}
