package Bit_Manipulation;

import java.util.*;

public class LC137_Single_Number_II {
    // BEST --- TC-O(N), SC-O(1)

    public int singleNumber(int[] nums) {
        int ones = 0;
        int twos = 0;

        for (int x : nums) {
            ones = (x ^ ones) & ~twos;
            twos = (x ^ twos) & ~ones;
        }

        return ones;
    }

    // Better --- TC-O(N log N + N / 3), SC-O(1)

    public int singleNumberSOL2(int[] nums) {
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i = i + 3) {
            if (nums[i - 1] != nums[i]) {
                return nums[i - 1];
            }
        }

        return nums[nums.length - 1];
    }

    // BETTER --- TC-O(N * 32), SC-O(1)

    public int singleNumberSOL3(int[] nums) {
        int ans = 0;

        for (int bit = 0; bit < 32; bit++) {
            int count = 0;

            for (int i = 0; i < nums.length; i++) {
                if ((nums[i] & (1 << bit)) != 0) {
                    count++;
                }
            }

            if (count % 3 != 0) {
                ans = ans | (1 << bit);
            }
        }

        return ans;
    }

    // BRUTE FORCE --- TC-O(N), SC-O(N)

    public int singleNumberSOL4(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (int x : nums) {
            if (map.get(x) == 1) {
                return x;
            }
        }

        return -1;
    }
}
