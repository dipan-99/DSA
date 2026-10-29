package Math.LeetCode;

import java.util.*;

public class LC77_Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(1, n, k, new ArrayList<>(), ans);
        return ans;
    }

    private void backtrack(int start, int n, int k,
            List<Integer> curr,
            List<List<Integer>> ans) {

        if (curr.size() == k) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        for (int i = start; i <= n; i++) {
            curr.add(i);
            backtrack(i + 1, n, k, curr, ans);
            curr.remove(curr.size() - 1);
        }
    }
}
