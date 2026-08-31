package Hashing.Basics;

import java.util.HashSet;

public class Common_Element_in_2_Arrays {
    public static int[] search(int[] A, int[] B) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> common = new HashSet<>();

        for (int x : A) {
            set.add(x);
        }

        for (int x : B) {
            if (set.contains(x)) {
                common.add(x);
            }
        }

        int[] ans = new int[common.size()];
        int i = 0;

        for (int x : common) {
            ans[i++] = x;
        }

        return ans;

    }
}
