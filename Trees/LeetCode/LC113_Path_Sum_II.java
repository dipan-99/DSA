package Trees.LeetCode;

import java.util.ArrayList;
import java.util.List;
import Trees.Basics.TreeNode;

public class LC113_Path_Sum_II {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        dfs(root, ans, path, targetSum);

        return ans;
    }

    public void dfs(TreeNode root, List<List<Integer>> ans, List<Integer> path, int targetSum) {
        if (root == null) return;

        path.add(root.val);
        targetSum -= root.val;

        if (root.left == null && root.right == null && targetSum == 0) ans.add(new ArrayList<>(path));

        dfs(root.left, ans, path, targetSum);
        dfs(root.right, ans, path, targetSum);

        path.remove(path.size() - 1);
    }
}
