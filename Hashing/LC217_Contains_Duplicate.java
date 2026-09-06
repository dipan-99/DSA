package Hashing;

import java.util.HashSet;

public class LC217_Contains_Duplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int x : nums) {
            if(set.contains(x)) {
                return true;
            } else {
                set.add(x);
            }
        }

        return false;
    }
}
