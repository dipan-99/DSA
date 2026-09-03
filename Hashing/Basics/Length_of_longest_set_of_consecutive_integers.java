package Hashing.Basics;

import java.util.*;

public class Length_of_longest_set_of_consecutive_integers {
    public int solve(int[] A) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : A) {
            set.add(num);
        }

        int maxLength = 0;

        for (int num : set) {

            if (!set.contains(num - 1)) {

                int current = num;
                int length = 1;

                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                maxLength = Math.max(maxLength, length);
            }
        }

        return maxLength;
    }
}
