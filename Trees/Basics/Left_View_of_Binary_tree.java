package Trees.Basics;

import java.util.ArrayList;

public class Left_View_of_Binary_tree {
    ArrayList<Integer> ans = new ArrayList<>();

    public ArrayList<Integer> solve(TreeNode root) {
        dfs(root, 0);
        return ans;
    }

    void dfs(TreeNode root, int level) {
        if (root == null) return;

        if (level == ans.size()) {
            ans.add(root.val);
        }

        dfs(root.left, level + 1);
        dfs(root.right, level + 1);
    }
}
