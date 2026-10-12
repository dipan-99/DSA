package Trees.LeetCode;

import Trees.Basics.TreeNode;

public class LC513_Find_Bottom_Left_Tree_Value {
    int maxLvl = -1;
    int ans;

    public int findBottomLeftValue(TreeNode root) {
        dfs(root, 0);

        return ans;
    }

    void dfs(TreeNode root, int lvl) {
        if (root == null)
            return;

        if (lvl > maxLvl) {
            maxLvl = lvl;
            ans = root.val;
        }

        dfs(root.left, lvl + 1);
        dfs(root.right, lvl + 1);
    }
}
