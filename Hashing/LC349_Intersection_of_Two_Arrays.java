package Hashing;

import java.util.HashSet;

public class LC349_Intersection_of_Two_Arrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> res = new HashSet<>();

        for (int x : nums1) {
            set.add(x);
        }

        for (int x : nums2) {
            if(set.contains(x)) {
                res.add(x);
            }
        }

        int[] ans = new int[res.size()];
        int i = 0;

        for (int x : res) {
            ans[i++] = x;
        }

        return ans;
    }
}
