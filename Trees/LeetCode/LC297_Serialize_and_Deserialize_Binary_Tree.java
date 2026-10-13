package Trees.LeetCode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import Trees.Basics.TreeNode;

public class LC297_Serialize_and_Deserialize_Binary_Tree {
    // Serialize
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();

        pre(root, sb);

        return sb.toString();
    }

    private void pre(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("null,");
            return;
        }

        sb.append(root.val).append(",");
        pre(root.left, sb);
        pre(root.right, sb);
    }

    // Deserialize
    public TreeNode deserialize(String data) {
        Queue<String> q = new LinkedList<>(Arrays.asList(data.split(",")));

        return build(q);
    }

    private TreeNode build(Queue<String> q) {
        String value = q.poll();

        if (value.equals("null")) {
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(value));

        root.left = build(q);
        root.right = build(q);

        return root;
    }
}
