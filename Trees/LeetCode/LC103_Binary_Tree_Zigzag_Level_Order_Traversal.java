package Trees.LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import Trees.Basics.TreeNode;

public class LC103_Binary_Tree_Zigzag_Level_Order_Traversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        boolean reverse = false;

        while (!q.isEmpty()) {
            int size = q.size();

            List<Integer> node = new ArrayList<>();

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

            if (reverse) {
                Collections.reverse(node);
            }

            ans.add(node);

            reverse = !reverse;
        }

        return ans;
    }
}
