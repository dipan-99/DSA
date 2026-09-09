package Bit_Manipulation;

import java.util.*;

public class LC260_Single_Number_III {
    //BETTER --- TC-O(N), SC-O(1)

    public int[] singleNumberSOL1(int[] nums) {
        int xor = 0;

        for (int x : nums) {
            xor ^= x;
        }

        int right = (xor & (xor - 1)) ^ xor;

        int b1 = 0, b2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] & right) == 0) {
                b1 ^= nums[i];
            } else {
                b2 ^= nums[i];
            }
        }

        return new int[] { b1, b2 };
    }

    // BRUTE FORCE --- TC-O(N), SC-O(N)

    public int[] singleNumberSOL2(int[] nums) {
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
