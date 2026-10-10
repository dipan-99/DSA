package Trees.LeetCode;

import java.util.HashMap;
import Trees.Basics.TreeNode;

public class LC105_Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal {
    int idx;
    HashMap<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        idx = 0;

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return build(preorder, 0, inorder.length - 1);
    }

    public TreeNode build(int[] pre, int l, int r) {
        if (l > r) return null;

        int rootVal = pre[idx++];
        TreeNode root = new TreeNode(rootVal);

        int mid = map.get(rootVal);

        root.left = build(pre, l, mid - 1);
        root.right = build(pre, mid + 1, r);

        return root;
    }
}
