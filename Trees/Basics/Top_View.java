package Trees.Basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Top_View {

    class Pair {
        TreeNode node;
        int col;

        Pair(TreeNode n, int c) {
            node = n;
            col = c;
        }
    }

    public ArrayList<Integer> topView(TreeNode A) {

        ArrayList<Integer> ans = new ArrayList<>();

        if (A == null)
            return ans;

        HashMap<Integer, Integer> map = new HashMap<>();
        Queue<Pair> q = new LinkedList<>();

        q.offer(new Pair(A, 0));

        int min = 0, max = 0;

        while (!q.isEmpty()) {
            Pair p = q.poll();

            TreeNode node = p.node;
            int col = p.col;

            // Keep only the first node at each column
            if (!map.containsKey(col)) {
                map.put(col, node.val);
            }

            min = Math.min(min, col);
            max = Math.max(max, col);

            if (node.left != null)
                q.offer(new Pair(node.left, col - 1));

            if (node.right != null)
                q.offer(new Pair(node.right, col + 1));
        }

        for (int i = min; i <= max; i++) {
            ans.add(map.get(i));
        }

        return ans;
    }
}