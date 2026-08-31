package Hashing;

import java.util.HashSet;

public class LC2956_Find_Common_Elements_Between_Two_Arrays {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (Integer x : nums1) {
            set1.add(x);
        }

        for (Integer x : nums2) {
            set2.add(x);
        }

        int count1 = 0;
        int count2 = 0;

        for (Integer x : nums1) {
            if (set2.contains(x)) {
                count1++;
            }
        }

        for (Integer x : nums2) {
            if (set1.contains(x)) {
                count2++;
            }
        }

        return new int[] {count1, count2};
    }
}
