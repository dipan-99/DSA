package Trees.LeetCode;

import java.util.HashMap;
import Trees.Basics.TreeNode;

public class LC889_Construct_Binary_Tree_from_Preorder_and_Postorder_Traversal {
    int idx;
    HashMap<Integer, Integer> map = new HashMap<>();

    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        idx = 0;

        for (int i = 0; i < postorder.length; i++) {
            map.put(postorder[i], i);
        }

        return build(preorder, 0, postorder.length - 1);
    }

    public TreeNode build(int[] pre, int l, int r) {
        if (l > r) return null;

        TreeNode root = new TreeNode(pre[idx++]);

        if (l == r) {
            return root;
        }

        int leftRoot = pre[idx];
        int mid = map.get(leftRoot);

        root.left = build(pre, l, mid);
        root.right = build(pre, mid + 1, r - 1);

        return root;
    }
}
