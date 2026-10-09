package Trees.LeetCode;

import java.util.ArrayList;
import java.util.List;
import Trees.Basics.TreeNode;

public class LC257_Binary_Tree_Paths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();

        if (root == null) return ans;

        path(root, "", ans);

        return ans;
    }

    public void path(TreeNode root, String path, List<String> result) {
        if (root == null) {
            return;
        }

        if (path.equals("")) {
            path = String.valueOf(root.val);
        } else {
            path += "->" + root.val;
        }

        if (root.left == null && root.right == null) {
            result.add(path);
            return;
        }

        path(root.left, path, result);

        path(root.right, path, result);
    }
}
