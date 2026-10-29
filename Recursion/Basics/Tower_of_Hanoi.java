package Recursion.Basics;

import java.util.ArrayList;

public class Tower_of_Hanoi {
    public ArrayList<ArrayList<Integer>> towerOfHanoi(int A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        func(A, 1, 3, 2, ans);

        return ans;
    }

    private void func(int n, int start, int end, int aux, ArrayList<ArrayList<Integer>> ans) {
        if (n == 0) {
            return;
        }

        func(n - 1, start, aux, end, ans);

        ArrayList<Integer> move = new ArrayList<>();
        move.add(n);
        move.add(start);
        move.add(end);
        ans.add(move);

        func(n - 1, aux, end, start, ans);
    }
}
