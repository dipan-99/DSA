package Bit_Manipulation;

import java.util.*;

public class LC260_Single_Number_III {

    // BRUTE FORCE --- TC-O(N), SC-O(N)

    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int[] arr = new int[2];
        int idx = 0;

        for (int x : map.keySet()) {
            if(map.get(x) == 1) {
                arr[idx++] = x;
            }
        }

        return arr;
    }
}
