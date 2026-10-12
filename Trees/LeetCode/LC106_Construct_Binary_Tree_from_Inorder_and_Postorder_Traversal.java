package Trees.LeetCode;

import java.util.HashMap;
import Trees.Basics.TreeNode;

public class LC106_Construct_Binary_Tree_from_Inorder_and_Postorder_Traversal {
    int idx = 0;
    HashMap<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        idx = postorder.length - 1;

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return build(postorder, 0, inorder.length - 1);
    }

    TreeNode build(int[] post, int l, int r) {
        if (l > r) return null;

        int rootVal = post[idx--];
        TreeNode root = new TreeNode(rootVal);

        int mid = map.get(rootVal);

        root.right = build(post, mid + 1, r);
        root.left = build(post, l, mid - 1);

        return root;
    }
}
