package Trees.Basics;

import java.util.ArrayList;

public class Right_View_of_Binary_tree {
    ArrayList<Integer> ans = new ArrayList<>();

    public ArrayList<Integer> solve(TreeNode A) {
        ans.clear();

        dfs(A, 0);

        return ans;
    }

    void dfs(TreeNode root, int lvl) {
        if (root == null) return;

        if(lvl == ans.size()) ans.add(root.val);

        dfs(root.right, lvl + 1);
        dfs(root.left, lvl + 1);
    }
}
