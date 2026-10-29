package Trees.Basics;

import java.util.ArrayList;
import java.util.Collections;

public class Find_and_Remove_Leaves_of_Binary_Tree {
    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> findLeaves(TreeNode root) {
        ans.clear();

        height(root);

        for (ArrayList<Integer> list : ans) Collections.sort(list);

        return ans;
    }

    private int height(TreeNode node) {
        if (node == null) {
            return -1;
        }

        int left = height(node.left);
        int right = height(node.right);

        int h = 1 + Math.max(left, right);

        if (ans.size() == h) {
            ans.add(new ArrayList<>());
        }

        ans.get(h).add(node.val);

        return h;
    }
}
